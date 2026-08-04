package R1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g extends D1.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5913A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f5914B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5915z;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(D1.h hVar) {
        p151v2.a.f(!hVar.f(1073741824));
        p151v2.a.f(!hVar.f(268435456));
        p151v2.a.f(!hVar.f(4));
        int i7 = this.f5913A;
        if (i7 > 0) {
            if (i7 < this.f5914B && hVar.f(Integer.MIN_VALUE) == f(Integer.MIN_VALUE)) {
                ByteBuffer byteBuffer = hVar.f1697d;
                if (byteBuffer != null && (r3 = this.f1697d) != null) {
                }
            }
            return false;
        }
        int i8 = this.f5913A;
        this.f5913A = i8 + 1;
        if (i8 == 0) {
            this.f1699f = hVar.f1699f;
            if (hVar.f(1)) {
                this.f1675b = 1;
            }
        }
        if (hVar.f(Integer.MIN_VALUE)) {
            this.f1675b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer2 = hVar.f1697d;
        if (byteBuffer2 != null) {
            z(byteBuffer2.remaining());
            this.f1697d.put(byteBuffer2);
        }
        this.f5915z = hVar.f1699f;
        return true;
    }

    @Override // D1.h
    public final void t() {
        super.t();
        this.f5913A = 0;
    }
}
