package p000;

/* JADX INFO: renamed from: s9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684s9 {

    /* JADX INFO: renamed from: a */
    public final int f7058a;

    /* JADX INFO: renamed from: b */
    public final long f7059b;

    public C0684s9(int i, long j) {
        if (i == 0) {
            C0270h1.m2192h("Null status");
            throw null;
        }
        this.f7058a = i;
        this.f7059b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0684s9)) {
            return false;
        }
        C0684s9 c0684s9 = (C0684s9) obj;
        return AbstractC0024an.m278a(this.f7058a, c0684s9.f7058a) && this.f7059b == c0684s9.f7059b;
    }

    public final int hashCode() {
        int iM292o = (AbstractC0024an.m292o(this.f7058a) ^ 1000003) * 1000003;
        long j = this.f7059b;
        return ((int) ((j >>> 32) ^ j)) ^ iM292o;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f7058a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f7059b);
        sb.append("}");
        return sb.toString();
    }
}
