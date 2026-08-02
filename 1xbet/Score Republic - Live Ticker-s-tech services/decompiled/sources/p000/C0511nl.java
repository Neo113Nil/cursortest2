package p000;

/* JADX INFO: renamed from: nl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0511nl {

    /* JADX INFO: renamed from: a */
    public final EnumC0474ml f5453a;

    /* JADX INFO: renamed from: b */
    public final ja1 f5454b;

    public C0511nl(EnumC0474ml enumC0474ml, ja1 ja1Var) {
        this.f5453a = enumC0474ml;
        a90.m127k(ja1Var, "status is null");
        this.f5454b = ja1Var;
    }

    /* JADX INFO: renamed from: a */
    public static C0511nl m3549a(EnumC0474ml enumC0474ml) {
        a90.m122f("state is TRANSIENT_ERROR. Use forError() instead", enumC0474ml != EnumC0474ml.f5073l);
        return new C0511nl(enumC0474ml, ja1.f3875e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0511nl)) {
            return false;
        }
        C0511nl c0511nl = (C0511nl) obj;
        if (this.f5453a.equals(c0511nl.f5453a)) {
            ja1 ja1Var = c0511nl.f5454b;
            ja1 ja1Var2 = this.f5454b;
            ja1Var2.getClass();
            if (ja1Var2 == ja1Var) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5454b.hashCode() ^ this.f5453a.hashCode();
    }

    public final String toString() {
        ja1 ja1Var = this.f5454b;
        boolean zM2838f = ja1Var.m2838f();
        EnumC0474ml enumC0474ml = this.f5453a;
        if (zM2838f) {
            return enumC0474ml.toString();
        }
        return enumC0474ml + "(" + ja1Var + ")";
    }
}
