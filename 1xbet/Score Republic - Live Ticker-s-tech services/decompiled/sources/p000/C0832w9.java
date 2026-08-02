package p000;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0832w9 {

    /* JADX INFO: renamed from: a */
    public final Object f8461a;

    /* JADX INFO: renamed from: b */
    public final C0426la f8462b;

    public C0832w9(Object obj, C0426la c0426la) {
        if (obj == null) {
            C0270h1.m2192h("Null payload");
            throw null;
        }
        this.f8461a = obj;
        this.f8462b = c0426la;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0832w9) {
            C0832w9 c0832w9 = (C0832w9) obj;
            if (this.f8461a.equals(c0832w9.f8461a)) {
                Object obj2 = dx0.f1868j;
                if (obj2.equals(obj2)) {
                    C0426la c0426la = c0832w9.f8462b;
                    C0426la c0426la2 = this.f8462b;
                    if (c0426la2 != null ? c0426la2.equals(c0426la) : c0426la == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f8461a.hashCode()) * 1000003) ^ dx0.f1868j.hashCode()) * 1000003;
        C0426la c0426la = this.f8462b;
        return (c0426la == null ? 0 : c0426la.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f8461a + ", priority=" + dx0.f1868j + ", productData=" + this.f8462b + "}";
    }
}
