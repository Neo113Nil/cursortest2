package x2;

import A1.AbstractC0023i;
import A1.L;
import A1.X;
import C1.C0095a;
import D1.h;
import java.nio.ByteBuffer;
import v2.t;
import w1.V0;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1787a extends AbstractC0023i {

    /* renamed from: D, reason: collision with root package name */
    public final h f18084D;

    /* renamed from: E, reason: collision with root package name */
    public final C0095a f18085E;

    /* renamed from: F, reason: collision with root package name */
    public long f18086F;

    /* renamed from: G, reason: collision with root package name */
    public L f18087G;

    /* renamed from: H, reason: collision with root package name */
    public long f18088H;

    public C1787a() {
        super(6);
        this.f18084D = new h(1);
        this.f18085E = new C0095a(4, false);
    }

    @Override // A1.AbstractC0023i, A1.C0
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.f18087G = (L) obj;
        }
    }

    @Override // A1.AbstractC0023i
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // A1.AbstractC0023i
    public final boolean l() {
        return k();
    }

    @Override // A1.AbstractC0023i
    public final boolean m() {
        return true;
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        L l7 = this.f18087G;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        this.f18088H = Long.MIN_VALUE;
        L l7 = this.f18087G;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // A1.AbstractC0023i
    public final void t(X[] xArr, long j, long j3) {
        this.f18086F = j3;
    }

    @Override // A1.AbstractC0023i
    public final void v(long j, long j3) {
        float[] fArr;
        while (!k() && this.f18088H < 100000 + j) {
            h hVar = this.f18084D;
            hVar.t();
            V0 v02 = this.f376b;
            v02.k();
            if (u(v02, hVar, 0) != -4 || hVar.f(4)) {
                return;
            }
            this.f18088H = hVar.f1699f;
            if (this.f18087G != null && !hVar.f(Integer.MIN_VALUE)) {
                hVar.A();
                ByteBuffer byteBuffer = hVar.f1697d;
                int i7 = t.f17153a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    C0095a c0095a = this.f18085E;
                    c0095a.B(limit, array);
                    c0095a.D(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i8 = 0; i8 < 3; i8++) {
                        fArr2[i8] = Float.intBitsToFloat(c0095a.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f18087G.a(this.f18088H - this.f18086F, fArr);
                }
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final int z(X x4) {
        return "application/x-camera-motion".equals(x4.f283C) ? AbstractC0023i.e(4, 0, 0) : AbstractC0023i.e(0, 0, 0);
    }
}
