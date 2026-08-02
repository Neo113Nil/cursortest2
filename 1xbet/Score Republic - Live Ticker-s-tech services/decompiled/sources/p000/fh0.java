package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fh0 {

    /* JADX INFO: renamed from: a */
    public final String f2407a;

    public fh0(String str) {
        this.f2407a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fh0) {
            return this.f2407a.equals(((fh0) obj).f2407a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2407a.hashCode();
    }

    public final String toString() {
        return AbstractC0024an.m285h(new StringBuilder("StringHeaderFactory{value='"), this.f2407a, "'}");
    }
}
