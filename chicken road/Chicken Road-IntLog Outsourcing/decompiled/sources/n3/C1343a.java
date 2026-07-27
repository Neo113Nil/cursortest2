package n3;

import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import o3.C1375a;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1375a f11468a;

    public C1343a(C1375a c1375a) {
        this.f11468a = c1375a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        int i2;
        RandomAccessFile randomAccessFile = this.f11468a.f11613a;
        int i3 = 0;
        try {
            i2 = randomAccessFile.read();
        } catch (IOException unused) {
        }
        if (i2 != -1) {
            if ((i2 & 128) != 0) {
                i2 &= 127;
                int i6 = 7;
                while (true) {
                    if (i6 >= 32) {
                        while (i6 < 64) {
                            int read = randomAccessFile.read();
                            if (read == -1) {
                                throw new IllegalStateException();
                            }
                            if ((read & 128) != 0) {
                                i6 += 7;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    int read2 = randomAccessFile.read();
                    if (read2 == -1) {
                        throw new IllegalStateException();
                    }
                    i2 |= (read2 & 127) << i6;
                    if ((read2 & 128) == 0) {
                        break;
                    }
                    i6 += 7;
                }
            }
            if (i2 >= 1) {
                return null;
            }
            byte[] bArr = new byte[i2];
            do {
                int read3 = randomAccessFile.read(bArr, i3, i2 - i3);
                i3 += read3;
                if (read3 == -1) {
                    break;
                }
            } while (i3 < i2);
            if (i3 != i2) {
                return null;
            }
            return bArr;
        }
        i2 = 0;
        if (i2 >= 1) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11468a.close();
    }
}
