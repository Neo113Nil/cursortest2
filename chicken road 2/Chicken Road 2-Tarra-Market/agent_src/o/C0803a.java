package o;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f6198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0808f f6199b;

    public C0803a(C0808f c0808f) {
        this.f6199b = c0808f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (j2 < 0) {
            return -1;
        }
        try {
            long j3 = this.f6198a;
            C0808f c0808f = this.f6199b;
            if (j3 != j2) {
                if (j3 >= 0 && j2 >= j3 + c0808f.f6200a.available()) {
                    return -1;
                }
                c0808f.b(j2);
                this.f6198a = j2;
            }
            if (i3 > c0808f.f6200a.available()) {
                i3 = c0808f.f6200a.available();
            }
            int read = c0808f.read(bArr, i2, i3);
            if (read >= 0) {
                this.f6198a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f6198a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
