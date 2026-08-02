package p000;

/* JADX INFO: renamed from: da */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131da {

    /* JADX INFO: renamed from: a */
    public final String f1594a;

    /* JADX INFO: renamed from: b */
    public final String f1595b;

    public C0131da(String str, String str2) {
        this.f1594a = str;
        if (str2 != null) {
            this.f1595b = str2;
        } else {
            C0270h1.m2192h("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0131da)) {
            return false;
        }
        C0131da c0131da = (C0131da) obj;
        return this.f1594a.equals(c0131da.f1594a) && this.f1595b.equals(c0131da.f1595b);
    }

    public final int hashCode() {
        return this.f1595b.hashCode() ^ ((this.f1594a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f1594a);
        sb.append(", version=");
        return AbstractC0024an.m285h(sb, this.f1595b, "}");
    }
}
