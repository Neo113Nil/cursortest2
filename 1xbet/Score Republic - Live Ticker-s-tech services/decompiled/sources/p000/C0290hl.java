package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: hl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0290hl {

    /* JADX INFO: renamed from: a */
    public boolean f3253a;

    /* JADX INFO: renamed from: b */
    public boolean f3254b;

    /* JADX INFO: renamed from: c */
    public Object f3255c;

    /* JADX INFO: renamed from: d */
    public Serializable f3256d;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.String[]] */
    public C0290hl(C0326il c0326il) {
        this.f3253a = c0326il.f3596a;
        this.f3255c = c0326il.f3597b;
        this.f3256d = c0326il.f3598c;
        this.f3254b = c0326il.f3599d;
    }

    /* JADX INFO: renamed from: a */
    public void m2290a(EnumC0506ng... enumC0506ngArr) {
        if (!this.f3253a) {
            C0270h1.m2191g("no cipher suites for cleartext connections");
            return;
        }
        String[] strArr = new String[enumC0506ngArr.length];
        for (int i = 0; i < enumC0506ngArr.length; i++) {
            strArr[i] = enumC0506ngArr[i].f5421j;
        }
        this.f3255c = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: b */
    public void m2291b(pd1... pd1VarArr) {
        if (!this.f3253a) {
            C0270h1.m2191g("no TLS versions for cleartext connections");
            return;
        }
        if (pd1VarArr.length == 0) {
            C0270h1.m2190f("At least one TlsVersion is required");
            return;
        }
        ?? r0 = new String[pd1VarArr.length];
        for (int i = 0; i < pd1VarArr.length; i++) {
            r0[i] = pd1VarArr[i].f6101j;
        }
        this.f3256d = r0;
    }
}
