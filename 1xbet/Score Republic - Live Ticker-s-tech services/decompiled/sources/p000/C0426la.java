package p000;

/* JADX INFO: renamed from: la */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0426la {

    /* JADX INFO: renamed from: a */
    public final Integer f4741a;

    public C0426la(Integer num) {
        this.f4741a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0426la) {
            return this.f4741a.equals(((C0426la) obj).f4741a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4741a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f4741a + "}";
    }
}
