package p000;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: cy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0118cy extends MediaDataSource {

    /* JADX INFO: renamed from: j */
    public long f1487j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0303hy f1488k;

    public C0118cy(C0303hy c0303hy) {
        this.f1488k = c0303hy;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        C0303hy c0303hy = this.f1488k;
        DataInputStream dataInputStream = c0303hy.f1880j;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f1487j;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        c0303hy.m2349e(j);
                        this.f1487j = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = c0303hy.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f1487j += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f1487j = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
