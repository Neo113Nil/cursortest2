package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: il */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0326il {

    /* JADX INFO: renamed from: e */
    public static final C0326il f3595e;

    /* JADX INFO: renamed from: a */
    public final boolean f3596a;

    /* JADX INFO: renamed from: b */
    public final String[] f3597b;

    /* JADX INFO: renamed from: c */
    public final String[] f3598c;

    /* JADX INFO: renamed from: d */
    public final boolean f3599d;

    static {
        EnumC0506ng[] enumC0506ngArr = {EnumC0506ng.f5418x, EnumC0506ng.f5419y, EnumC0506ng.f5420z, EnumC0506ng.f5412r, EnumC0506ng.f5414t, EnumC0506ng.f5413s, EnumC0506ng.f5415u, EnumC0506ng.f5417w, EnumC0506ng.f5416v, EnumC0506ng.f5410p, EnumC0506ng.f5411q, EnumC0506ng.f5408n, EnumC0506ng.f5409o, EnumC0506ng.f5406l, EnumC0506ng.f5407m, EnumC0506ng.f5405k};
        C0290hl c0290hl = new C0290hl();
        c0290hl.f3253a = true;
        c0290hl.m2290a(enumC0506ngArr);
        pd1 pd1Var = pd1.f6095k;
        pd1 pd1Var2 = pd1.f6096l;
        c0290hl.m2291b(pd1Var, pd1Var2);
        c0290hl.f3254b = true;
        C0326il c0326il = new C0326il(c0290hl);
        f3595e = c0326il;
        pd1[] pd1VarArr = {pd1Var, pd1Var2, pd1.f6097m, pd1.f6098n};
        boolean z = c0326il.f3596a;
        if (!z) {
            C0270h1.m2191g("no TLS versions for cleartext connections");
            return;
        }
        if (pd1VarArr.length == 0) {
            C0270h1.m2190f("At least one TlsVersion is required");
            return;
        }
        String[] strArr = new String[pd1VarArr.length];
        for (int i = 0; i < pd1VarArr.length; i++) {
            strArr[i] = pd1VarArr[i].f6101j;
        }
        if (z) {
            return;
        }
        C0270h1.m2191g("no TLS extensions for cleartext connections");
    }

    public C0326il(C0290hl c0290hl) {
        this.f3596a = c0290hl.f3253a;
        this.f3597b = (String[]) c0290hl.f3255c;
        this.f3598c = (String[]) c0290hl.f3256d;
        this.f3599d = c0290hl.f3254b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0326il)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0326il c0326il = (C0326il) obj;
        boolean z = c0326il.f3596a;
        boolean z2 = this.f3596a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f3597b, c0326il.f3597b) && Arrays.equals(this.f3598c, c0326il.f3598c) && this.f3599d == c0326il.f3599d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f3596a) {
            return ((((527 + Arrays.hashCode(this.f3597b)) * 31) + Arrays.hashCode(this.f3598c)) * 31) + (!this.f3599d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        pd1 pd1Var;
        if (!this.f3596a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f3597b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            EnumC0506ng[] enumC0506ngArr = new EnumC0506ng[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                enumC0506ngArr[i] = str.startsWith("SSL_") ? EnumC0506ng.valueOf("TLS_".concat(str.substring(4))) : EnumC0506ng.valueOf(str);
            }
            String[] strArr2 = ah1.f183a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) enumC0506ngArr.clone()));
        }
        String string = listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString();
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(string);
        sb.append(", tlsVersions=");
        String[] strArr3 = this.f3598c;
        pd1[] pd1VarArr = new pd1[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                pd1Var = pd1.f6095k;
            } else if ("TLSv1.2".equals(str2)) {
                pd1Var = pd1.f6096l;
            } else if ("TLSv1.1".equals(str2)) {
                pd1Var = pd1.f6097m;
            } else if ("TLSv1".equals(str2)) {
                pd1Var = pd1.f6098n;
            } else {
                if (!"SSLv3".equals(str2)) {
                    C0270h1.m2190f(AbstractC0024an.m283f("Unexpected TLS version: ", str2));
                    return null;
                }
                pd1Var = pd1.f6099o;
            }
            pd1VarArr[i2] = pd1Var;
        }
        String[] strArr4 = ah1.f183a;
        sb.append(Collections.unmodifiableList(Arrays.asList((Object[]) pd1VarArr.clone())));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f3599d);
        sb.append(")");
        return sb.toString();
    }
}
