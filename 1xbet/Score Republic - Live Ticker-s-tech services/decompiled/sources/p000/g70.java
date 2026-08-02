package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class g70 extends AbstractC0171ee implements f70, rg0, w60 {

    /* JADX INFO: renamed from: p */
    public final int f2638p;

    public g70(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f2638p = i;
    }

    @Override // p000.f70
    /* JADX INFO: renamed from: b */
    public final int mo667b() {
        return this.f2638p;
    }

    @Override // p000.AbstractC0171ee
    /* JADX INFO: renamed from: c */
    public final rg0 mo1404c() {
        l01.f4622a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g70) {
            g70 g70Var = (g70) obj;
            return this.f2072m.equals(g70Var.f2072m) && this.f2073n.equals(g70Var.f2073n) && this.f2070k.equals(g70Var.f2070k) && m1405d().equals(g70Var.m1405d());
        }
        if (!(obj instanceof g70)) {
            return false;
        }
        rg0 rg0Var = this.f2069j;
        if (rg0Var == null) {
            mo1404c();
            this.f2069j = this;
            this = this;
        } else {
            r2 = rg0Var;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        m1405d();
        return this.f2073n.hashCode() + ((this.f2072m.hashCode() + (m1405d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        rg0 rg0Var = this.f2069j;
        if (rg0Var == null) {
            mo1404c();
            this.f2069j = this;
            rg0Var = this;
        }
        if (rg0Var != this) {
            return rg0Var.toString();
        }
        String str = this.f2072m;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0024an.m284g("function ", str, " (Kotlin reflection is not available)");
    }

    public g70(int i, Class cls, String str, String str2, int i2) {
        this(i, C0135de.f1631j, cls, str, str2, i2, 0);
    }
}
