package p162x2;

import A1.AbstractC0023i;
import A1.L;
import A1.X;
import C1.C0095a;
import D1.h;
import java.nio.ByteBuffer;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0023i {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final h f18090D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0095a f18091E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f18092F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public L f18093G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f18094H;

    public a() {
        super(6);
        this.f18090D = new h(1);
        this.f18091E = new C0095a(4, false);
    }

    @Override // A1.AbstractC0023i, A1.C0
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.f18093G = (L) obj;
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
        L l7 = this.f18093G;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        this.f18094H = Long.MIN_VALUE;
        L l7 = this.f18093G;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // A1.AbstractC0023i
    public final void t(X[] xArr, long j, long j3) {
        this.f18092F = j3;
    }

    @Override // A1.AbstractC0023i
    public final void v(long j, long j3) {
        float[] fArr;
        while (!k() && this.f18094H < 100000 + j) {
            h hVar = this.f18090D;
            hVar.t();
            V0 v6 = this.f376b;
            v6.k();
            if (u(v6, hVar, 0) != -4 || hVar.f(4)) {
                return;
            }
            this.f18094H = hVar.f1699f;
            if (this.f18093G != null && !hVar.f(Integer.MIN_VALUE)) {
                hVar.A();
                ByteBuffer byteBuffer = hVar.f1697d;
                int i7 = t.f17159a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C0095a c0095a = this.f18091E;
                    c0095a.B(iLimit, bArrArray);
                    c0095a.D(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i8 = 0; i8 < 3; i8++) {
                        fArr2[i8] = Float.intBitsToFloat(c0095a.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f18093G.a(this.f18094H - this.f18092F, fArr);
                }
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final int z(X x4) {
        return "application/x-camera-motion".equals(x4.f283C) ? AbstractC0023i.e(4, 0, 0) : AbstractC0023i.e(0, 0, 0);
    }
}
