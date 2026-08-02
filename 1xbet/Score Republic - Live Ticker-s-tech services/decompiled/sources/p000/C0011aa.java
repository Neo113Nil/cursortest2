package p000;

/* JADX INFO: renamed from: aa */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0011aa {

    /* JADX INFO: renamed from: a */
    public final String f105a;

    /* JADX INFO: renamed from: b */
    public final C0091ca f106b;

    public C0011aa(String str, C0091ca c0091ca) {
        if (str == null) {
            C0270h1.m2192h("Null installationId");
            throw null;
        }
        this.f105a = str;
        if (c0091ca != null) {
            this.f106b = c0091ca;
        } else {
            C0270h1.m2192h("Null installationTokenResult");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0011aa) {
            C0011aa c0011aa = (C0011aa) obj;
            if (this.f105a.equals(c0011aa.f105a) && this.f106b.equals(c0011aa.f106b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f106b.hashCode() ^ ((this.f105a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InstallationIdResult{installationId=" + this.f105a + ", installationTokenResult=" + this.f106b + "}";
    }
}
