package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        r11 = new io.sentry.SentryEnvelope(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
    
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.IEnvelopeReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SentryEnvelope read(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        int i8 = -1;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                int i9 = 0;
                while (true) {
                    if (i8 == -1 && i9 < read) {
                        if (bArr[i9] == 10) {
                            i8 = i7 + i9;
                            break;
                        }
                        i9++;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i7 += read;
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
        SentryEnvelopeHeader deserializeEnvelopeHeader = deserializeEnvelopeHeader(byteArray, 0, i8);
        if (deserializeEnvelopeHeader == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i10 = i8 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i11 = i10;
            while (true) {
                if (i11 >= byteArray.length) {
                    i11 = -1;
                    break;
                }
                if (byteArray[i11] == 10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            SentryEnvelopeItemHeader deserializeEnvelopeItemHeader = deserializeEnvelopeItemHeader(byteArray, i10, i11 - i10);
            if (deserializeEnvelopeItemHeader == null || deserializeEnvelopeItemHeader.getLength() <= 0) {
                break;
            }
            int length = deserializeEnvelopeItemHeader.getLength() + i11;
            int i12 = length + 1;
            if (i12 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i12 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new SentryEnvelopeItem(deserializeEnvelopeItemHeader, Arrays.copyOfRange(byteArray, i11 + 1, i12)));
            if (i12 == byteArray.length) {
                break;
            }
            i10 = length + 2;
            if (i10 == byteArray.length) {
                if (byteArray[i12] != 10) {
                    throw new IllegalArgumentException("Envelope has invalid data following an item.");
                }
            }
        }
    }
}
