package y1;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2657a extends MediaDataSource implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public long f21135k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2662f f21136l;

    public C2657a(C2662f c2662f) {
        this.f21136l = c2662f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (j5 < 0) {
            return -1;
        }
        try {
            long j6 = this.f21135k;
            C2662f c2662f = this.f21136l;
            if (j6 != j5) {
                if (j6 >= 0 && j5 >= j6 + c2662f.f21137k.available()) {
                    return -1;
                }
                c2662f.d(j5);
                this.f21135k = j5;
            }
            if (i5 > c2662f.f21137k.available()) {
                i5 = c2662f.f21137k.available();
            }
            int read = c2662f.read(bArr, i, i5);
            if (read >= 0) {
                this.f21135k += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f21135k = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
