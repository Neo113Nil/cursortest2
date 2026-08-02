package K0;

import k0.AbstractC2024d;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: d, reason: collision with root package name */
    public static final O f2804d = new O(0, 0, null, 0, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final G f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2806b;

    /* renamed from: c, reason: collision with root package name */
    public final z f2807c;

    public O(G g5, w wVar, z zVar) {
        this.f2805a = g5;
        this.f2806b = wVar;
        this.f2807c = zVar;
    }

    public static O a(O o5, long j5, long j6, O0.l lVar, O0.o oVar, long j7, long j8, V0.i iVar, int i) {
        O0.j jVar;
        O0.k kVar;
        long j9;
        z zVar = N.a.f3664a;
        long b3 = (i & 1) != 0 ? o5.f2805a.f2764a.b() : j5;
        long j10 = (i & 2) != 0 ? o5.f2805a.f2765b : j6;
        O0.l lVar2 = (i & 4) != 0 ? o5.f2805a.f2766c : lVar;
        G g5 = o5.f2805a;
        long j11 = j10;
        O0.j jVar2 = g5.f2767d;
        O0.k kVar2 = g5.f2768e;
        O0.o oVar2 = (i & 32) != 0 ? g5.f : oVar;
        String str = g5.f2769g;
        long j12 = (i & 128) != 0 ? g5.f2770h : j7;
        O0.l lVar3 = lVar2;
        O0.o oVar3 = oVar2;
        V0.a aVar = g5.i;
        V0.p pVar = g5.f2771j;
        long j13 = j12;
        R0.b bVar = g5.f2772k;
        long j14 = g5.f2773l;
        V0.l lVar4 = g5.f2774m;
        i0.I i5 = g5.f2775n;
        AbstractC2024d abstractC2024d = g5.f2776o;
        w wVar = o5.f2806b;
        z zVar2 = zVar;
        int i6 = wVar.f2871a;
        int i7 = wVar.f2872b;
        if ((i & 131072) != 0) {
            jVar = jVar2;
            kVar = kVar2;
            j9 = wVar.f2873c;
        } else {
            jVar = jVar2;
            kVar = kVar2;
            j9 = j8;
        }
        V0.q qVar = wVar.f2874d;
        if ((i & 524288) != 0) {
            zVar2 = o5.f2807c;
        }
        z zVar3 = zVar2;
        return new O(new G(i0.p.c(b3, g5.f2764a.b()) ? g5.f2764a : b3 != 16 ? new V0.c(b3) : V0.n.f5949a, j11, lVar3, jVar, kVar, oVar3, str, j13, aVar, pVar, bVar, j14, lVar4, i5, null, abstractC2024d), new w(i6, i7, j9, qVar, zVar3 != null ? zVar3.f2881a : null, (i & 1048576) != 0 ? wVar.f : iVar, wVar.f2876g, wVar.f2877h, wVar.i), zVar3);
    }

    public static O e(O o5, long j5, long j6, O0.l lVar, long j7, int i, long j8, int i5) {
        long j9 = (i5 & 2) != 0 ? W0.o.f6021c : j6;
        O0.l lVar2 = (i5 & 4) != 0 ? null : lVar;
        long j10 = (i5 & 128) != 0 ? W0.o.f6021c : j7;
        long j11 = i0.p.f17293g;
        int i6 = (32768 & i5) != 0 ? Integer.MIN_VALUE : i;
        long j12 = (i5 & 131072) != 0 ? W0.o.f6021c : j8;
        G a5 = H.a(o5.f2805a, j5, null, Float.NaN, j9, lVar2, null, null, null, null, j10, null, null, null, j11, null, null, null, null);
        w a6 = x.a(o5.f2806b, i6, Integer.MIN_VALUE, j12, null, null, null, 0, Integer.MIN_VALUE, null);
        return (o5.f2805a == a5 && o5.f2806b == a6) ? o5 : new O(a5, a6);
    }

    public final long b() {
        return this.f2805a.f2764a.b();
    }

    public final boolean c(O o5) {
        if (this != o5) {
            return kotlin.jvm.internal.l.a(this.f2806b, o5.f2806b) && this.f2805a.a(o5.f2805a);
        }
        return true;
    }

    public final O d(O o5) {
        return (o5 == null || o5.equals(f2804d)) ? this : new O(this.f2805a.c(o5.f2805a), this.f2806b.a(o5.f2806b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o5 = (O) obj;
        return kotlin.jvm.internal.l.a(this.f2805a, o5.f2805a) && kotlin.jvm.internal.l.a(this.f2806b, o5.f2806b) && kotlin.jvm.internal.l.a(this.f2807c, o5.f2807c);
    }

    public final int hashCode() {
        int hashCode = (this.f2806b.hashCode() + (this.f2805a.hashCode() * 31)) * 31;
        z zVar = this.f2807c;
        return hashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) i0.p.j(b()));
        sb.append(", brush=");
        G g5 = this.f2805a;
        sb.append(g5.f2764a.d());
        sb.append(", alpha=");
        sb.append(g5.f2764a.a());
        sb.append(", fontSize=");
        sb.append((Object) W0.o.e(g5.f2765b));
        sb.append(", fontWeight=");
        sb.append(g5.f2766c);
        sb.append(", fontStyle=");
        sb.append(g5.f2767d);
        sb.append(", fontSynthesis=");
        sb.append(g5.f2768e);
        sb.append(", fontFamily=");
        sb.append(g5.f);
        sb.append(", fontFeatureSettings=");
        sb.append(g5.f2769g);
        sb.append(", letterSpacing=");
        sb.append((Object) W0.o.e(g5.f2770h));
        sb.append(", baselineShift=");
        sb.append(g5.i);
        sb.append(", textGeometricTransform=");
        sb.append(g5.f2771j);
        sb.append(", localeList=");
        sb.append(g5.f2772k);
        sb.append(", background=");
        AbstractC2107A.z(g5.f2773l, sb, ", textDecoration=");
        sb.append(g5.f2774m);
        sb.append(", shadow=");
        sb.append(g5.f2775n);
        sb.append(", drawStyle=");
        sb.append(g5.f2776o);
        sb.append(", textAlign=");
        w wVar = this.f2806b;
        sb.append((Object) V0.k.a(wVar.f2871a));
        sb.append(", textDirection=");
        sb.append((Object) V0.m.a(wVar.f2872b));
        sb.append(", lineHeight=");
        sb.append((Object) W0.o.e(wVar.f2873c));
        sb.append(", textIndent=");
        sb.append(wVar.f2874d);
        sb.append(", platformStyle=");
        sb.append(this.f2807c);
        sb.append(", lineHeightStyle=");
        sb.append(wVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) V0.e.a(wVar.f2876g));
        sb.append(", hyphens=");
        sb.append((Object) V0.d.a(wVar.f2877h));
        sb.append(", textMotion=");
        sb.append(wVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O(G g5, w wVar) {
        this(g5, wVar, r1 == null ? null : new z(null, r1));
        g5.getClass();
        y yVar = wVar.f2875e;
    }

    public O(long j5, long j6, O0.l lVar, long j7, int i, long j8, int i5) {
        this(new G((i5 & 1) != 0 ? i0.p.f17293g : j5, (i5 & 2) != 0 ? W0.o.f6021c : j6, (i5 & 4) != 0 ? null : lVar, (O0.j) null, (O0.k) null, (i5 & 32) != 0 ? null : O0.o.f4035a, (String) null, (i5 & 128) != 0 ? W0.o.f6021c : j7, (V0.a) null, (V0.p) null, (R0.b) null, i0.p.f17293g, (V0.l) null, (i0.I) null, (F) null), new w((32768 & i5) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, (i5 & 131072) != 0 ? W0.o.f6021c : j8, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
