package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class EnvelopeReader implements IEnvelopeReader {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final ISerializer serializer;

    public EnvelopeReader(ISerializer iSerializer) {
        this.serializer = iSerializer;
    }

    private SentryEnvelopeHeader deserializeEnvelopeHeader(byte[] bArr, int i7, int i8) {
        StringReader stringReader = new StringReader(new String(bArr, i7, i8, UTF_8));
        try {
            SentryEnvelopeHeader sentryEnvelopeHeader = (SentryEnvelopeHeader) this.serializer.deserialize(stringReader, SentryEnvelopeHeader.class);
            stringReader.close();
            return sentryEnvelopeHeader;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SentryEnvelopeItemHeader deserializeEnvelopeItemHeader(byte[] bArr, int i7, int i8) {
        StringReader stringReader = new StringReader(new String(bArr, i7, i8, UTF_8));
        try {
            SentryEnvelopeItemHeader sentryEnvelopeItemHeader = (SentryEnvelopeItemHeader) this.serializer.deserialize(stringReader, SentryEnvelopeItemHeader.class);
            stringReader.close();
            return sentryEnvelopeItemHeader;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.IEnvelopeReader
    public SentryEnvelope read(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        int i8 = -1;
        while (true) {
            try {
                int i9 = inputStream.read(bArr);
                if (i9 <= 0) {
                    break;
                }
                for (int i10 = 0; i8 == -1 && i10 < i9; i10++) {
                    if (bArr[i10] == 10) {
                        i8 = i7 + i10;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i9);
                i7 += i9;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i8 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        SentryEnvelopeHeader sentryEnvelopeHeaderDeserializeEnvelopeHeader = deserializeEnvelopeHeader(byteArray, 0, i8);
        if (sentryEnvelopeHeaderDeserializeEnvelopeHeader == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i11 = i8 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i12 = i11;
            while (true) {
                if (i12 >= byteArray.length) {
                    i12 = -1;
                    break;
                }
                if (byteArray[i12] == 10) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            SentryEnvelopeItemHeader sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader = deserializeEnvelopeItemHeader(byteArray, i11, i12 - i11);
            if (sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader == null || sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader.getLength() <= 0) {
                throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int length = sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader.getLength() + i12;
            int i13 = length + 1;
            if (i13 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i13 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new SentryEnvelopeItem(sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader, Arrays.copyOfRange(byteArray, i12 + 1, i13)));
            if (i13 == byteArray.length) {
                break;
            }
            i11 = length + 2;
            if (i11 == byteArray.length) {
                if (byteArray[i13] == 10) {
                    break;
                }
                throw new IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        SentryEnvelope sentryEnvelope = new SentryEnvelope(sentryEnvelopeHeaderDeserializeEnvelopeHeader, arrayList);
        byteArrayOutputStream.close();
        return sentryEnvelope;
    }
}
