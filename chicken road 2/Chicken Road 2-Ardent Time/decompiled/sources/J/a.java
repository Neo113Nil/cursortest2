package J;

/* loaded from: classes.dex */
public final class a extends android.media.MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J.f f874b;

    public a(J.f fVar) {
        this.f874b = fVar;
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
            long j3 = this.f873a;
            J.f fVar = this.f874b;
            if (j3 != j2) {
                if (j3 >= 0 && j2 >= j3 + fVar.f875a.available()) {
                    return -1;
                }
                fVar.b(j2);
                this.f873a = j2;
            }
            if (i3 > fVar.f875a.available()) {
                i3 = fVar.f875a.available();
            }
            int read = fVar.read(bArr, i2, i3);
            if (read >= 0) {
                this.f873a += read;
                return read;
            }
        } catch (java.io.IOException unused) {
        }
        this.f873a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
