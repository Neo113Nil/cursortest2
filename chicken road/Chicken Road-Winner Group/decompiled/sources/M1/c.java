package M1;

import android.media.MediaDataSource;

/* loaded from: classes.dex */
public final class c extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f971a;

    public c(byte[] bArr) {
        this.f971a = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f971a.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i3, int i4) {
        byte[] bArr2 = this.f971a;
        if (j3 >= bArr2.length) {
            return -1;
        }
        if (i4 + j3 > bArr2.length) {
            i4 = (int) (bArr2.length - j3);
        }
        System.arraycopy(bArr2, (int) j3, bArr, i3, i4);
        return i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
