package K0;

import k0.AbstractC2024d;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class G implements InterfaceC0198c {

    /* renamed from: a, reason: collision with root package name */
    public final V0.o f2764a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2765b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.l f2766c;

    /* renamed from: d, reason: collision with root package name */
    public final O0.j f2767d;

    /* renamed from: e, reason: collision with root package name */
    public final O0.k f2768e;
    public final O0.o f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2769g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2770h;
    public final V0.a i;

    /* renamed from: j, reason: collision with root package name */
    public final V0.p f2771j;

    /* renamed from: k, reason: collision with root package name */
    public final R0.b f2772k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2773l;

    /* renamed from: m, reason: collision with root package name */
    public final V0.l f2774m;

    /* renamed from: n, reason: collision with root package name */
    public final i0.I f2775n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC2024d f2776o;

    public G(long j5, long j6, O0.l lVar, O0.j jVar, O0.k kVar, O0.o oVar, String str, long j7, V0.a aVar, V0.p pVar, R0.b bVar, long j8, V0.l lVar2, i0.I i, F f) {
        this(j5 != 16 ? new V0.c(j5) : V0.n.f5949a, j6, lVar, jVar, kVar, oVar, str, j7, aVar, pVar, bVar, j8, lVar2, i, f, null);
    }

    public final boolean a(G g5) {
        if (this == g5) {
            return true;
        }
        return W0.o.a(this.f2765b, g5.f2765b) && kotlin.jvm.internal.l.a(this.f2766c, g5.f2766c) && kotlin.jvm.internal.l.a(this.f2767d, g5.f2767d) && kotlin.jvm.internal.l.a(this.f2768e, g5.f2768e) && kotlin.jvm.internal.l.a(this.f, g5.f) && kotlin.jvm.internal.l.a(this.f2769g, g5.f2769g) && W0.o.a(this.f2770h, g5.f2770h) && kotlin.jvm.internal.l.a(this.i, g5.i) && kotlin.jvm.internal.l.a(this.f2771j, g5.f2771j) && kotlin.jvm.internal.l.a(this.f2772k, g5.f2772k) && i0.p.c(this.f2773l, g5.f2773l) && kotlin.jvm.internal.l.a(null, null);
    }

    public final boolean b(G g5) {
        return kotlin.jvm.internal.l.a(this.f2764a, g5.f2764a) && kotlin.jvm.internal.l.a(this.f2774m, g5.f2774m) && kotlin.jvm.internal.l.a(this.f2775n, g5.f2775n) && kotlin.jvm.internal.l.a(this.f2776o, g5.f2776o);
    }

    public final G c(G g5) {
        if (g5 == null) {
            return this;
        }
        V0.o oVar = g5.f2764a;
        return H.a(this, oVar.b(), oVar.d(), oVar.a(), g5.f2765b, g5.f2766c, g5.f2767d, g5.f2768e, g5.f, g5.f2769g, g5.f2770h, g5.i, g5.f2771j, g5.f2772k, g5.f2773l, g5.f2774m, g5.f2775n, null, g5.f2776o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g5 = (G) obj;
        return a(g5) && b(g5);
    }

    public final int hashCode() {
        V0.o oVar = this.f2764a;
        int i = i0.p.i(oVar.b()) * 31;
        i0.F d5 = oVar.d();
        int d6 = (W0.o.d(this.f2765b) + ((Float.floatToIntBits(oVar.a()) + ((i + (d5 != null ? d5.hashCode() : 0)) * 31)) * 31)) * 31;
        O0.l lVar = this.f2766c;
        int i5 = (d6 + (lVar != null ? lVar.f4033k : 0)) * 31;
        O0.j jVar = this.f2767d;
        int i6 = (i5 + (jVar != null ? jVar.f4024a : 0)) * 31;
        O0.k kVar = this.f2768e;
        int i7 = (i6 + (kVar != null ? kVar.f4025a : 0)) * 31;
        O0.o oVar2 = this.f;
        int hashCode = (i7 + (oVar2 != null ? oVar2.hashCode() : 0)) * 31;
        String str = this.f2769g;
        int d7 = (W0.o.d(this.f2770h) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        V0.a aVar = this.i;
        int floatToIntBits = (d7 + (aVar != null ? Float.floatToIntBits(aVar.f5925a) : 0)) * 31;
        V0.p pVar = this.f2771j;
        int hashCode2 = (floatToIntBits + (pVar != null ? pVar.hashCode() : 0)) * 31;
        R0.b bVar = this.f2772k;
        int o5 = AbstractC2107A.o((hashCode2 + (bVar != null ? bVar.f5122k.hashCode() : 0)) * 31, 31, this.f2773l);
        V0.l lVar2 = this.f2774m;
        int i8 = (o5 + (lVar2 != null ? lVar2.f5947a : 0)) * 31;
        i0.I i9 = this.f2775n;
        int hashCode3 = (((i8 + (i9 != null ? i9.hashCode() : 0)) * 31) + 0) * 31;
        AbstractC2024d abstractC2024d = this.f2776o;
        return hashCode3 + (abstractC2024d != null ? abstractC2024d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        V0.o oVar = this.f2764a;
        sb.append((Object) i0.p.j(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.d());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) W0.o.e(this.f2765b));
        sb.append(", fontWeight=");
        sb.append(this.f2766c);
        sb.append(", fontStyle=");
        sb.append(this.f2767d);
        sb.append(", fontSynthesis=");
        sb.append(this.f2768e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f2769g);
        sb.append(", letterSpacing=");
        sb.append((Object) W0.o.e(this.f2770h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f2771j);
        sb.append(", localeList=");
        sb.append(this.f2772k);
        sb.append(", background=");
        AbstractC2107A.z(this.f2773l, sb, ", textDecoration=");
        sb.append(this.f2774m);
        sb.append(", shadow=");
        sb.append(this.f2775n);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(", drawStyle=");
        sb.append(this.f2776o);
        sb.append(')');
        return sb.toString();
    }

    public G(V0.o oVar, long j5, O0.l lVar, O0.j jVar, O0.k kVar, O0.o oVar2, String str, long j6, V0.a aVar, V0.p pVar, R0.b bVar, long j7, V0.l lVar2, i0.I i, F f, AbstractC2024d abstractC2024d) {
        this.f2764a = oVar;
        this.f2765b = j5;
        this.f2766c = lVar;
        this.f2767d = jVar;
        this.f2768e = kVar;
        this.f = oVar2;
        this.f2769g = str;
        this.f2770h = j6;
        this.i = aVar;
        this.f2771j = pVar;
        this.f2772k = bVar;
        this.f2773l = j7;
        this.f2774m = lVar2;
        this.f2775n = i;
        this.f2776o = abstractC2024d;
    }

    public G(long j5, long j6, O0.l lVar, O0.j jVar, O0.k kVar, O0.o oVar, String str, long j7, V0.a aVar, V0.p pVar, R0.b bVar, long j8, V0.l lVar2, i0.I i, int i5) {
        this((i5 & 1) != 0 ? i0.p.f17293g : j5, (i5 & 2) != 0 ? W0.o.f6021c : j6, (i5 & 4) != 0 ? null : lVar, (i5 & 8) != 0 ? null : jVar, (i5 & 16) != 0 ? null : kVar, (i5 & 32) != 0 ? null : oVar, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? W0.o.f6021c : j7, (i5 & 256) != 0 ? null : aVar, (i5 & 512) != 0 ? null : pVar, (i5 & 1024) != 0 ? null : bVar, (i5 & 2048) != 0 ? i0.p.f17293g : j8, (i5 & 4096) != 0 ? null : lVar2, (i5 & 8192) != 0 ? null : i, (F) null);
    }
}
