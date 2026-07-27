package I2;

import android.media.MediaDataSource;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f688a;

    public a(byte[] bArr) {
        this.f688a = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public final synchronized long getSize() {
        return this.f688a.length;
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j3, byte[] buffer, int i3, int i4) {
        j.e(buffer, "buffer");
        byte[] bArr = this.f688a;
        if (j3 >= bArr.length) {
            return -1;
        }
        long j4 = i4;
        long j5 = j3 + j4;
        if (j5 > bArr.length) {
            j4 -= j5 - bArr.length;
        }
        int i5 = (int) j4;
        System.arraycopy(bArr, (int) j3, buffer, i3, i5);
        return i5;
    }
}
