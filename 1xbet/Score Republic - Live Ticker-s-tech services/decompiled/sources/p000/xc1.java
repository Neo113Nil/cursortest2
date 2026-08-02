package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xc1 {

    /* JADX INFO: renamed from: a */
    public final String f8886a;

    /* JADX INFO: renamed from: b */
    public final String f8887b;

    public xc1(String str, String str2) {
        this.f8886a = str;
        this.f8887b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xc1)) {
            return false;
        }
        xc1 xc1Var = (xc1) obj;
        String str = xc1Var.f8886a;
        if (hashCode() != xc1Var.hashCode()) {
            return false;
        }
        String str2 = this.f8886a;
        return (str2 != null || str == null) && (str2 == null || str2.equals(str)) && this.f8887b.equals(xc1Var.f8887b);
    }

    public final int hashCode() {
        String str = this.f8887b;
        String str2 = this.f8886a;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() + str2.hashCode();
    }
}
