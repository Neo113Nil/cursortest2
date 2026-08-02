package o0;

import P.AbstractC0329z;
import P.C0305m0;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.graphics.Bitmap;
import h0.C1991e;
import i0.C1997b;
import i0.C2001f;
import i0.C2006k;
import i0.F;
import i0.InterfaceC2009n;
import k0.C2021a;
import k0.C2022b;
import k0.InterfaceC2025e;
import w0.AbstractC2540a;

/* loaded from: classes.dex */
public final class x extends v {

    /* renamed from: b, reason: collision with root package name */
    public final C2198b f18591b;

    /* renamed from: c, reason: collision with root package name */
    public String f18592c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18593d;

    /* renamed from: e, reason: collision with root package name */
    public final C2197a f18594e;
    public kotlin.jvm.internal.m f;

    /* renamed from: g, reason: collision with root package name */
    public final C0305m0 f18595g;

    /* renamed from: h, reason: collision with root package name */
    public C2006k f18596h;
    public final C0305m0 i;

    /* renamed from: j, reason: collision with root package name */
    public long f18597j;

    /* renamed from: k, reason: collision with root package name */
    public float f18598k;

    /* renamed from: l, reason: collision with root package name */
    public float f18599l;

    /* renamed from: m, reason: collision with root package name */
    public final w f18600m;

    public x(C2198b c2198b) {
        this.f18591b = c2198b;
        c2198b.i = new w(this, 0);
        this.f18592c = "";
        this.f18593d = true;
        this.f18594e = new C2197a();
        this.f = C2203g.f18550n;
        this.f18595g = AbstractC0329z.t(null);
        this.i = AbstractC0329z.t(new C1991e(0L));
        this.f18597j = 9205357640488583168L;
        this.f18598k = 1.0f;
        this.f18599l = 1.0f;
        this.f18600m = new w(this, 1);
    }

    @Override // o0.v
    public final void a(InterfaceC2025e interfaceC2025e) {
        e(interfaceC2025e, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r3 != (r8 == null ? r8.a() : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (r9.f18514d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(InterfaceC2025e interfaceC2025e, float f, C2006k c2006k) {
        int i;
        boolean z3;
        C2197a c2197a;
        C2006k c2006k2;
        C2001f c2001f;
        char c5;
        long j5;
        C2001f c2001f2;
        int i5;
        int i6;
        C2006k c2006k3 = c2006k;
        C2198b c2198b = this.f18591b;
        boolean z5 = c2198b.f18518d;
        C0305m0 c0305m0 = this.f18595g;
        if (z5 && c2198b.f18519e != 16) {
            C2006k c2006k4 = (C2006k) c0305m0.getValue();
            int i7 = z.f18603a;
            if (!(c2006k4 instanceof C2006k) ? c2006k4 == null : !((i6 = c2006k4.f17285c) != 5 && i6 != 3)) {
                if (!(c2006k3 instanceof C2006k) ? c2006k3 == null : !((i5 = c2006k3.f17285c) != 5 && i5 != 3)) {
                    i = 1;
                    z3 = this.f18593d;
                    c2197a = this.f18594e;
                    if (!z3 && C1991e.a(this.f18597j, interfaceC2025e.d())) {
                        C2001f c2001f3 = c2197a.f18511a;
                    }
                    if (i != 1) {
                        long j6 = c2198b.f18519e;
                        int i8 = z.f18603a;
                        if (i0.p.d(j6) != 1.0f) {
                            j6 = i0.p.b(1.0f, j6);
                        }
                        c2006k2 = new C2006k(5, j6);
                    } else {
                        c2006k2 = null;
                    }
                    this.f18596h = c2006k2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2025e.d() >> 32));
                    C0305m0 c0305m02 = this.i;
                    this.f18598k = intBitsToFloat / Float.intBitsToFloat((int) (((C1991e) c0305m02.getValue()).f17204a >> 32));
                    this.f18599l = Float.intBitsToFloat((int) (interfaceC2025e.d() & 4294967295L)) / Float.intBitsToFloat((int) (((C1991e) c0305m02.getValue()).f17204a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2025e.d() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2025e.d() & 4294967295L)))) & 4294967295L);
                    W0.m layoutDirection = interfaceC2025e.getLayoutDirection();
                    c2001f = c2197a.f18511a;
                    C1997b c1997b = c2197a.f18512b;
                    if (c2001f != null || c1997b == null) {
                        c5 = ' ';
                        j5 = 4294967295L;
                    } else {
                        int i9 = (int) (ceil >> 32);
                        Bitmap bitmap = c2001f.f17276a;
                        c5 = ' ';
                        j5 = 4294967295L;
                        if (i9 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    c2001f = F.f((int) (ceil >> c5), (int) (ceil & j5), i);
                    c1997b = F.a(c2001f);
                    c2197a.f18511a = c2001f;
                    c2197a.f18512b = c1997b;
                    c2197a.f18514d = i;
                    c2197a.f18513c = ceil;
                    long d02 = AbstractC0444a.d0(ceil);
                    C2022b c2022b = c2197a.f18515e;
                    C2021a c2021a = c2022b.f17539k;
                    W0.c cVar = c2021a.f17535a;
                    W0.m mVar = c2021a.f17536b;
                    InterfaceC2009n interfaceC2009n = c2021a.f17537c;
                    long j7 = c2021a.f17538d;
                    c2021a.f17535a = interfaceC2025e;
                    c2021a.f17536b = layoutDirection;
                    c2021a.f17537c = c1997b;
                    c2021a.f17538d = d02;
                    c1997b.k();
                    AbstractC0467k.m(c2022b, i0.p.f17289b, 0L, 62);
                    this.f18600m.c(c2022b);
                    c1997b.j();
                    C2021a c2021a2 = c2022b.f17539k;
                    c2021a2.f17535a = cVar;
                    c2021a2.f17536b = mVar;
                    c2021a2.f17537c = interfaceC2009n;
                    c2021a2.f17538d = j7;
                    c2001f.f17276a.prepareToDraw();
                    this.f18593d = false;
                    this.f18597j = interfaceC2025e.d();
                    if (c2006k3 == null) {
                        c2006k3 = ((C2006k) c0305m0.getValue()) != null ? (C2006k) c0305m0.getValue() : this.f18596h;
                    }
                    C2006k c2006k5 = c2006k3;
                    c2001f2 = c2197a.f18511a;
                    if (c2001f2 == null) {
                        AbstractC2540a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    AbstractC0467k.i(interfaceC2025e, c2001f2, c2197a.f18513c, 0L, f, c2006k5, 0, 858);
                }
            }
        }
        i = 0;
        z3 = this.f18593d;
        c2197a = this.f18594e;
        if (!z3) {
            C2001f c2001f32 = c2197a.f18511a;
        }
        if (i != 1) {
        }
        this.f18596h = c2006k2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2025e.d() >> 32));
        C0305m0 c0305m022 = this.i;
        this.f18598k = intBitsToFloat2 / Float.intBitsToFloat((int) (((C1991e) c0305m022.getValue()).f17204a >> 32));
        this.f18599l = Float.intBitsToFloat((int) (interfaceC2025e.d() & 4294967295L)) / Float.intBitsToFloat((int) (((C1991e) c0305m022.getValue()).f17204a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2025e.d() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2025e.d() & 4294967295L)))) & 4294967295L);
        W0.m layoutDirection2 = interfaceC2025e.getLayoutDirection();
        c2001f = c2197a.f18511a;
        C1997b c1997b2 = c2197a.f18512b;
        if (c2001f != null) {
        }
        c5 = ' ';
        j5 = 4294967295L;
        c2001f = F.f((int) (ceil2 >> c5), (int) (ceil2 & j5), i);
        c1997b2 = F.a(c2001f);
        c2197a.f18511a = c2001f;
        c2197a.f18512b = c1997b2;
        c2197a.f18514d = i;
        c2197a.f18513c = ceil2;
        long d022 = AbstractC0444a.d0(ceil2);
        C2022b c2022b2 = c2197a.f18515e;
        C2021a c2021a3 = c2022b2.f17539k;
        W0.c cVar2 = c2021a3.f17535a;
        W0.m mVar2 = c2021a3.f17536b;
        InterfaceC2009n interfaceC2009n2 = c2021a3.f17537c;
        long j72 = c2021a3.f17538d;
        c2021a3.f17535a = interfaceC2025e;
        c2021a3.f17536b = layoutDirection2;
        c2021a3.f17537c = c1997b2;
        c2021a3.f17538d = d022;
        c1997b2.k();
        AbstractC0467k.m(c2022b2, i0.p.f17289b, 0L, 62);
        this.f18600m.c(c2022b2);
        c1997b2.j();
        C2021a c2021a22 = c2022b2.f17539k;
        c2021a22.f17535a = cVar2;
        c2021a22.f17536b = mVar2;
        c2021a22.f17537c = interfaceC2009n2;
        c2021a22.f17538d = j72;
        c2001f.f17276a.prepareToDraw();
        this.f18593d = false;
        this.f18597j = interfaceC2025e.d();
        if (c2006k3 == null) {
        }
        C2006k c2006k52 = c2006k3;
        c2001f2 = c2197a.f18511a;
        if (c2001f2 == null) {
        }
        AbstractC0467k.i(interfaceC2025e, c2001f2, c2197a.f18513c, 0L, f, c2006k52, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f18592c);
        sb.append("\n\tviewportWidth: ");
        C0305m0 c0305m0 = this.i;
        sb.append(Float.intBitsToFloat((int) (((C1991e) c0305m0.getValue()).f17204a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C1991e) c0305m0.getValue()).f17204a & 4294967295L)));
        sb.append("\n");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
