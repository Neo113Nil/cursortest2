package I1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final I1.i f727e;

    /* renamed from: f, reason: collision with root package name */
    public static final I1.i f728f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f729a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f730b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f731c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f732d;

    static {
        I1.g gVar = I1.g.f720r;
        I1.g gVar2 = I1.g.f721s;
        I1.g gVar3 = I1.g.t;
        I1.g gVar4 = I1.g.f714l;
        I1.g gVar5 = I1.g.f716n;
        I1.g gVar6 = I1.g.f715m;
        I1.g gVar7 = I1.g.f717o;
        I1.g gVar8 = I1.g.f719q;
        I1.g gVar9 = I1.g.f718p;
        I1.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, I1.g.f712j, I1.g.f713k, I1.g.f710h, I1.g.f711i, I1.g.f708f, I1.g.f709g, I1.g.f707e};
        I1.h hVar = new I1.h(0);
        hVar.b((I1.g[]) java.util.Arrays.copyOf(new I1.g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        I1.B b2 = I1.B.TLS_1_3;
        I1.B b3 = I1.B.TLS_1_2;
        hVar.e(b2, b3);
        if (!hVar.f723a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f724b = true;
        hVar.a();
        I1.h hVar2 = new I1.h(0);
        hVar2.b((I1.g[]) java.util.Arrays.copyOf(gVarArr, 16));
        hVar2.e(b2, b3);
        if (!hVar2.f723a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f724b = true;
        f727e = hVar2.a();
        I1.h hVar3 = new I1.h(0);
        hVar3.b((I1.g[]) java.util.Arrays.copyOf(gVarArr, 16));
        hVar3.e(b2, b3, I1.B.TLS_1_1, I1.B.TLS_1_0);
        if (!hVar3.f723a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f724b = true;
        hVar3.a();
        f728f = new I1.i(false, false, null, null);
    }

    public i(boolean z2, boolean z3, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.f729a = z2;
        this.f730b = z3;
        this.f731c = strArr;
        this.f732d = strArr2;
    }

    public final java.util.List a() {
        java.lang.String[] strArr = this.f731c;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(I1.g.f704b.c(str));
        }
        return i1.AbstractC0190i.X(arrayList);
    }

    public final boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        if (!this.f729a) {
            return false;
        }
        java.lang.String[] strArr = this.f732d;
        if (strArr != null && !J1.b.j(strArr, sSLSocket.getEnabledProtocols(), j1.C0917a.f7943b)) {
            return false;
        }
        java.lang.String[] strArr2 = this.f731c;
        return strArr2 == null || J1.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), I1.g.f705c);
    }

    public final java.util.List c() {
        java.lang.String[] strArr = this.f732d;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(Q1.l.l(str));
        }
        return i1.AbstractC0190i.X(arrayList);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof I1.i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        I1.i iVar = (I1.i) obj;
        boolean z2 = iVar.f729a;
        boolean z3 = this.f729a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (java.util.Arrays.equals(this.f731c, iVar.f731c) && java.util.Arrays.equals(this.f732d, iVar.f732d) && this.f730b == iVar.f730b);
    }

    public final int hashCode() {
        if (!this.f729a) {
            return 17;
        }
        java.lang.String[] strArr = this.f731c;
        int hashCode = (527 + (strArr == null ? 0 : java.util.Arrays.hashCode(strArr))) * 31;
        java.lang.String[] strArr2 = this.f732d;
        return ((hashCode + (strArr2 != null ? java.util.Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f730b ? 1 : 0);
    }

    public final java.lang.String toString() {
        if (!this.f729a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((java.lang.Object) java.util.Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((java.lang.Object) java.util.Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f730b + ')';
    }
}
