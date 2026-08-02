package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 extends su0 {

    /* JADX INFO: renamed from: j */
    public final Object f1486j;

    public cx0(Object obj) {
        this.f1486j = obj;
    }

    @Override // p000.su0
    /* JADX INFO: renamed from: a */
    public final Object mo1039a() {
        return this.f1486j;
    }

    @Override // p000.su0
    /* JADX INFO: renamed from: b */
    public final boolean mo1040b() {
        return true;
    }

    @Override // p000.su0
    /* JADX INFO: renamed from: c */
    public final Object mo1041c() {
        return this.f1486j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cx0) {
            return this.f1486j.equals(((cx0) obj).f1486j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1486j.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f1486j + ")";
    }
}
