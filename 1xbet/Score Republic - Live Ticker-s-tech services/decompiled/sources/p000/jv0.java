package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jv0 implements InterfaceC0543og {

    /* JADX INFO: renamed from: a */
    public final Class f4098a;

    public jv0(Class cls) {
        this.f4098a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jv0) {
            return this.f4098a.equals(((jv0) obj).f4098a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4098a.hashCode();
    }

    public final String toString() {
        return this.f4098a.toString() + " (Kotlin reflection is not available)";
    }
}
