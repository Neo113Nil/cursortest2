package p000;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047b2 {

    /* JADX INFO: renamed from: a */
    public final String f684a;

    /* JADX INFO: renamed from: b */
    public final C0909yc f685b;

    public C0047b2(String str, C0909yc c0909yc) {
        this.f684a = str;
        this.f685b = c0909yc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0047b2)) {
            return false;
        }
        C0047b2 c0047b2 = (C0047b2) obj;
        C0909yc c0909yc = c0047b2.f685b;
        String str = c0047b2.f684a;
        if (hashCode() != c0047b2.hashCode()) {
            return false;
        }
        String str2 = this.f684a;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        C0909yc c0909yc2 = this.f685b;
        return (c0909yc2 == null && c0909yc == null) || (c0909yc2 != null && c0909yc2.equals(c0909yc));
    }

    public final int hashCode() {
        String str = this.f684a;
        int iHashCode = str != null ? str.hashCode() : 0;
        C0909yc c0909yc = this.f685b;
        return iHashCode + (c0909yc != null ? c0909yc.hashCode() : 0);
    }
}
