package n5;

import android.media.MediaDataSource;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11470a;

    public a(byte[] bArr) {
        this.f11470a = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public final synchronized long getSize() {
        return this.f11470a.length;
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j2, byte[] buffer, int i2, int i3) {
        i.e(buffer, "buffer");
        byte[] bArr = this.f11470a;
        if (j2 >= bArr.length) {
            return -1;
        }
        long j6 = i3;
        long j7 = j2 + j6;
        if (j7 > bArr.length) {
            j6 -= j7 - bArr.length;
        }
        int i6 = (int) j6;
        System.arraycopy(bArr, (int) j2, buffer, i2, i6);
        return i6;
    }
}
