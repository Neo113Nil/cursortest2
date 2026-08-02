package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0721t9 extends AbstractC0908yb {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7356a;

    public C0721t9(ArrayList arrayList) {
        this.f7356a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0908yb)) {
            return false;
        }
        return this.f7356a.equals(((C0721t9) ((AbstractC0908yb) obj)).f7356a);
    }

    public final int hashCode() {
        return this.f7356a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f7356a + "}";
    }
}
