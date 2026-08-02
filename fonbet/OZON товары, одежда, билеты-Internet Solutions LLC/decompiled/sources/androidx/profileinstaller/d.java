package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes8.dex */
final class d {
    static byte[] a(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    @NonNull
    static byte[] b(@NonNull InputStream inputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i12, i11 - i12);
            if (read < 0) {
                throw new IllegalStateException(Ej.b.a(i11, "Not enough bytes to read: "));
            }
            i12 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] c(@NonNull FileInputStream fileInputStream, int i11, int i12) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[2048];
            int i13 = 0;
            int i14 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i13 < i11) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i11 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i14 += inflater.inflate(bArr, i14, i12 - i14);
                    i13 += read;
                } catch (DataFormatException e11) {
                    throw new IllegalStateException(e11.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i11 + " actual=" + i13);
        } finally {
            inflater.end();
        }
    }

    static long d(@NonNull InputStream inputStream, int i11) throws IOException {
        byte[] b11 = b(inputStream, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 += (b11[i12] & 255) << (i12 * 8);
        }
        return j11;
    }

    static void e(@NonNull ByteArrayOutputStream byteArrayOutputStream, long j11, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((j11 >> (i12 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    static void f(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i11) throws IOException {
        e(byteArrayOutputStream, i11, 2);
    }
}
