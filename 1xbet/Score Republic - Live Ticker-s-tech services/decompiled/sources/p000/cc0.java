package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 {

    /* JADX INFO: renamed from: a */
    public final String f1215a;

    public cc0(String str) {
        this.f1215a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc0)) {
            return false;
        }
        String str = ((cc0) obj).f1215a;
        String str2 = this.f1215a;
        return str2.hashCode() == str.hashCode() && str2.equals(str);
    }

    public final int hashCode() {
        return this.f1215a.hashCode();
    }
}
