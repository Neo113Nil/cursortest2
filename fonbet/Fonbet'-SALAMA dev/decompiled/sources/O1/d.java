package O1;

import A1.X;
import C1.C0095a;
import F1.o;
import Y4.D;
import a.AbstractC0603a;
import java.util.Arrays;
import w1.P2;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: n, reason: collision with root package name */
    public o f4937n;

    /* renamed from: o, reason: collision with root package name */
    public c f4938o;

    @Override // O1.j
    public final long b(C0095a c0095a) {
        byte[] bArr = (byte[]) c0095a.f1465c;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i7 = (bArr[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            c0095a.E(4);
            c0095a.z();
        }
        int N7 = D.N(i7, c0095a);
        c0095a.D(0);
        return N7;
    }

    @Override // O1.j
    public final boolean c(C0095a c0095a, long j, P2 p22) {
        byte[] bArr = (byte[]) c0095a.f1465c;
        o oVar = this.f4937n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.f4937n = oVar2;
            p22.f17508b = oVar2.c(Arrays.copyOfRange(bArr, 9, c0095a.f1464b), null);
            return true;
        }
        byte b7 = bArr[0];
        if ((b7 & Byte.MAX_VALUE) != 3) {
            if (b7 != -1) {
                return true;
            }
            c cVar = this.f4938o;
            if (cVar != null) {
                cVar.f4933a = j;
                p22.f17509c = cVar;
            }
            ((X) p22.f17508b).getClass();
            return false;
        }
        P2 n02 = AbstractC0603a.n0(c0095a);
        o oVar3 = new o(oVar.f2549a, oVar.f2550b, oVar.f2551c, oVar.f2552d, oVar.f2553e, oVar.f2555g, oVar.f2556h, oVar.j, n02, oVar.f2559l);
        this.f4937n = oVar3;
        c cVar2 = new c();
        cVar2.f4935c = oVar3;
        cVar2.f4936d = n02;
        cVar2.f4933a = -1L;
        cVar2.f4934b = -1L;
        this.f4938o = cVar2;
        return true;
    }

    @Override // O1.j
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f4937n = null;
            this.f4938o = null;
        }
    }
}
