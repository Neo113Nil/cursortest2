package p000;

/* JADX INFO: renamed from: vw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0818vw {

    /* JADX INFO: renamed from: a */
    public final String f8276a;

    public C0818vw(String str) {
        if (str != null) {
            this.f8276a = str;
        } else {
            C0270h1.m2192h("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0818vw)) {
            return false;
        }
        return this.f8276a.equals(((C0818vw) obj).f8276a);
    }

    public final int hashCode() {
        return this.f8276a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0024an.m285h(new StringBuilder("Encoding{name=\""), this.f8276a, "\"}");
    }
}
