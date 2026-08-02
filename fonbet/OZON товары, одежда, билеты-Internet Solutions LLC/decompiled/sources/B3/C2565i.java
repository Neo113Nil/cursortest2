package B3;

import java.nio.ByteBuffer;

/* renamed from: B3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2565i extends s3.f {

    /* renamed from: i, reason: collision with root package name */
    private long f2352i;

    /* renamed from: j, reason: collision with root package name */
    private int f2353j;

    /* renamed from: k, reason: collision with root package name */
    private int f2354k;

    public C2565i() {
        super(2);
        this.f2354k = 32;
    }

    @Override // s3.f, s3.AbstractC9587a
    public final void f() {
        super.f();
        this.f2353j = 0;
    }

    public final boolean r(s3.f fVar) {
        ByteBuffer byteBuffer;
        G10.a.c(!fVar.q());
        G10.a.c(!fVar.h());
        G10.a.c(!fVar.i());
        if (u()) {
            if (this.f2353j >= this.f2354k) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f98184d;
            if (byteBuffer2 != null && (byteBuffer = this.f98184d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.f2353j;
        this.f2353j = i11 + 1;
        if (i11 == 0) {
            this.f98186f = fVar.f98186f;
            if (fVar.j()) {
                m(1);
            }
        }
        ByteBuffer byteBuffer3 = fVar.f98184d;
        if (byteBuffer3 != null) {
            o(byteBuffer3.remaining());
            this.f98184d.put(byteBuffer3);
        }
        this.f2352i = fVar.f98186f;
        return true;
    }

    public final long s() {
        return this.f2352i;
    }

    public final int t() {
        return this.f2353j;
    }

    public final boolean u() {
        return this.f2353j > 0;
    }

    public final void v(int i11) {
        G10.a.c(i11 > 0);
        this.f2354k = i11;
    }
}
