package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class db2 {

    /* JADX INFO: renamed from: a */
    public final String f1613a;

    /* JADX INFO: renamed from: b */
    public final Class f1614b;

    /* JADX INFO: renamed from: c */
    public final boolean f1615c;

    /* JADX INFO: renamed from: d */
    public final boolean f1616d;

    /* JADX INFO: renamed from: e */
    public final long f1617e;

    public db2(String str, Class cls, boolean z, boolean z2) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            C0270h1.m2190f("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                C0270h1.m2190f("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.f1613a = str;
        this.f1614b = cls;
        this.f1615c = z;
        this.f1616d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f1617e = j;
    }

    /* JADX INFO: renamed from: a */
    public void mo1153a(Iterator it, qb2 qb2Var) {
        while (it.hasNext()) {
            mo1154b(it.next(), qb2Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo1154b(Object obj, qb2 qb2Var) {
        qb2Var.m4053a(obj, this.f1613a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f1614b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f1613a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        sb.append(name);
        sb.append("/");
        sb.append(str);
        sb.append("[");
        return AbstractC0024an.m285h(sb, name2, "]");
    }
}
