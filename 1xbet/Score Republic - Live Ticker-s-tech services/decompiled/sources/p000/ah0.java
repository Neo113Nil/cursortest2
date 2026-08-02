package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 implements Comparable {

    /* JADX INFO: renamed from: k */
    public static final ah0 f181k = new ah0();

    /* JADX INFO: renamed from: j */
    public final int f182j = 131861;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ah0 ah0Var = (ah0) obj;
        ah0Var.getClass();
        return this.f182j - ah0Var.f182j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ah0 ah0Var = obj instanceof ah0 ? (ah0) obj : null;
        return ah0Var != null && this.f182j == ah0Var.f182j;
    }

    public final int hashCode() {
        return this.f182j;
    }

    public final String toString() {
        return "2.3.21";
    }
}
