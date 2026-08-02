package T3;

import G1.C0140k;
import M.G;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import S3.A;
import S3.B;
import W3.o;
import android.os.Bundle;
import androidx.compose.foundation.layout.FillElement;
import b0.p;
import i0.M;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o0.z;
import t.C2396h;
import u2.C2487b;
import u2.w;
import x0.O;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class i implements i4.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5790k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5792m;

    public /* synthetic */ i(int i, InterfaceC2015a interfaceC2015a, String str) {
        this.f5790k = i;
        this.f5791l = interfaceC2015a;
        this.f5792m = str;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        C2201e c2201e;
        o oVar = o.f6046a;
        Object obj5 = this.f5791l;
        switch (this.f5790k) {
            case 0:
                C0140k c0140k = (C0140k) obj2;
                C0315s c0315s = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("stackEntry", c0140k);
                Bundle c5 = c0140k.c();
                if (c5 != null) {
                    int i = c5.getInt("matchKey");
                    G4.d.a(false, (InterfaceC2015a) obj5, c0315s, 0);
                    B.a(i, (InterfaceC2015a) obj5, this.f5792m, null, c0315s, 0);
                    break;
                }
                break;
            case 1:
                C0140k c0140k2 = (C0140k) obj2;
                C0315s c0315s2 = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("stackEntry", c0140k2);
                Bundle c6 = c0140k2.c();
                if (c6 != null) {
                    int i5 = c6.getInt("matchKey");
                    G4.d.a(false, (InterfaceC2015a) obj5, c0315s2, 0);
                    A.a(i5, (InterfaceC2015a) obj5, this.f5792m, null, c0315s2, 0);
                    break;
                }
                break;
            default:
                C0315s c0315s3 = (C0315s) obj3;
                int intValue = ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$SubcomposeAsyncImage", (w) obj);
                kotlin.jvm.internal.l.f("it", (C2487b) obj2);
                if ((intValue & 129) != 128 || !c0315s3.B()) {
                    b0.m mVar = b0.m.f7161k;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6868c;
                    O e3 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p5 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l5 = c0315s3.l();
                    p c7 = b0.a.c(c0315s3, fillElement);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21833e, e3);
                    AbstractC0329z.y(c0315s3, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s3, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s3, C2752i.f21831c, c7);
                    if (this.f5792m == null) {
                        c2201e = (C2201e) obj5;
                    } else {
                        C2201e c2201e2 = N4.b.f3795c;
                        if (c2201e2 == null) {
                            C2200d c2200d = new C2200d("Filled.ImageNotSupported", false);
                            int i6 = z.f18603a;
                            M m5 = new M(i0.p.f17289b);
                            C2202f c2202f = new C2202f(0);
                            c2202f.m(21.9f, 21.9f);
                            c2202f.l(-8.49f, -8.49f);
                            c2202f.l(0.0f, 0.0f);
                            c2202f.k(3.59f, 3.59f);
                            c2202f.l(0.0f, 0.0f);
                            c2202f.k(2.1f, 2.1f);
                            c2202f.k(0.69f, 3.51f);
                            c2202f.k(3.0f, 5.83f);
                            c2202f.q(19.0f);
                            c2202f.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            c2202f.j(13.17f);
                            c2202f.l(2.31f, 2.31f);
                            c2202f.k(21.9f, 21.9f);
                            c2202f.e();
                            c2202f.m(5.0f, 18.0f);
                            c2202f.l(3.5f, -4.5f);
                            c2202f.l(2.5f, 3.01f);
                            c2202f.k(12.17f, 15.0f);
                            c2202f.l(3.0f, 3.0f);
                            c2202f.i(5.0f);
                            c2202f.e();
                            c2202f.m(21.0f, 18.17f);
                            c2202f.k(5.83f, 3.0f);
                            c2202f.i(19.0f);
                            c2202f.g(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
                            c2202f.q(18.17f);
                            c2202f.e();
                            C2200d.a(c2200d, c2202f.f18548a, m5);
                            c2201e2 = c2200d.b();
                            N4.b.f3795c = c2201e2;
                        }
                        c2201e = c2201e2;
                    }
                    G.a(c2201e, null, androidx.compose.foundation.layout.c.f(mVar, 24), V3.a.f5995z, c0315s3, 3504, 0);
                    c0315s3.q(true);
                    break;
                } else {
                    c0315s3.S();
                    break;
                }
                break;
        }
        return oVar;
    }

    public i(String str, C2201e c2201e) {
        this.f5790k = 2;
        this.f5792m = str;
        this.f5791l = c2201e;
    }
}
