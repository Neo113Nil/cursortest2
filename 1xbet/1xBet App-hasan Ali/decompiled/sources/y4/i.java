package y4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import n.t0;
import v.q0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f21337e;
    public static final i f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21338a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21339b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f21340c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f21341d;

    static {
        h hVar = h.f21333r;
        h hVar2 = h.f21334s;
        h hVar3 = h.f21335t;
        h hVar4 = h.f21327l;
        h hVar5 = h.f21329n;
        h hVar6 = h.f21328m;
        h hVar7 = h.f21330o;
        h hVar8 = h.f21332q;
        h hVar9 = h.f21331p;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f21325j, h.f21326k, h.f21324h, h.i, h.f, h.f21323g, h.f21322e};
        t0 t0Var = new t0();
        t0Var.c((h[]) Arrays.copyOf(new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9}, 9));
        D d5 = D.f21285l;
        D d6 = D.f21286m;
        t0Var.e(d5, d6);
        if (!t0Var.f18324a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t0Var.f18325b = true;
        t0Var.a();
        t0 t0Var2 = new t0();
        t0Var2.c((h[]) Arrays.copyOf(hVarArr, 16));
        t0Var2.e(d5, d6);
        if (!t0Var2.f18324a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t0Var2.f18325b = true;
        f21337e = t0Var2.a();
        t0 t0Var3 = new t0();
        t0Var3.c((h[]) Arrays.copyOf(hVarArr, 16));
        t0Var3.e(d5, d6, D.f21287n, D.f21288o);
        if (!t0Var3.f18324a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t0Var3.f18325b = true;
        t0Var3.a();
        f = new i(false, false, null, null);
    }

    public i(boolean z3, boolean z5, String[] strArr, String[] strArr2) {
        this.f21338a = z3;
        this.f21339b = z5;
        this.f21340c = strArr;
        this.f21341d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f21340c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.f21319b.c(str));
        }
        return X3.m.m0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f21338a) {
            return false;
        }
        String[] strArr = this.f21341d;
        if (strArr != null && !z4.b.i(strArr, sSLSocket.getEnabledProtocols(), Z3.a.f6354l)) {
            return false;
        }
        String[] strArr2 = this.f21340c;
        return strArr2 == null || z4.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), h.f21320c);
    }

    public final List c() {
        String[] strArr = this.f21341d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(q0.b(str));
        }
        return X3.m.m0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z3 = iVar.f21338a;
        boolean z5 = this.f21338a;
        if (z5 != z3) {
            return false;
        }
        if (z5) {
            return Arrays.equals(this.f21340c, iVar.f21340c) && Arrays.equals(this.f21341d, iVar.f21341d) && this.f21339b == iVar.f21339b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f21338a) {
            return 17;
        }
        String[] strArr = this.f21340c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f21341d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f21339b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f21338a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f21339b + ')';
    }
}
