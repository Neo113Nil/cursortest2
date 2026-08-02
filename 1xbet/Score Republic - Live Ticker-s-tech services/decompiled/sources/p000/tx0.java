package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tx0 extends AbstractC0171ee implements tg0 {

    /* JADX INFO: renamed from: p */
    public final boolean f7622p;

    public tx0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f7622p = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tx0) {
            tx0 tx0Var = (tx0) obj;
            return m1405d().equals(tx0Var.m1405d()) && this.f2072m.equals(tx0Var.f2072m) && this.f2073n.equals(tx0Var.f2073n) && this.f2070k.equals(tx0Var.f2070k);
        }
        if (obj instanceof tg0) {
            return obj.equals(m4865f());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final rg0 m4865f() {
        if (this.f7622p) {
            return this;
        }
        rg0 rg0Var = this.f2069j;
        if (rg0Var != null) {
            return rg0Var;
        }
        rg0 rg0VarMo1404c = mo1404c();
        this.f2069j = rg0VarMo1404c;
        return rg0VarMo1404c;
    }

    public final int hashCode() {
        return this.f2073n.hashCode() + ((this.f2072m.hashCode() + (m1405d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        rg0 rg0VarM4865f = m4865f();
        return rg0VarM4865f != this ? rg0VarM4865f.toString() : AbstractC0024an.m285h(new StringBuilder("property "), this.f2072m, " (Kotlin reflection is not available)");
    }
}
