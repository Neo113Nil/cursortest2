package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 {

    /* JADX INFO: renamed from: a */
    public final Context f5967a;

    /* JADX INFO: renamed from: b */
    public final nb1 f5968b;

    public p22(Context context, nb1 nb1Var) {
        this.f5967a = context;
        this.f5968b = nb1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p22)) {
            return false;
        }
        p22 p22Var = (p22) obj;
        if (!this.f5967a.equals(p22Var.f5967a)) {
            return false;
        }
        nb1 nb1Var = p22Var.f5968b;
        nb1 nb1Var2 = this.f5968b;
        if (nb1Var2 == null) {
            return nb1Var == null;
        }
        return nb1Var2.equals(nb1Var);
    }

    public final int hashCode() {
        int iHashCode = this.f5967a.hashCode() ^ 1000003;
        nb1 nb1Var = this.f5968b;
        return (nb1Var == null ? 0 : nb1Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f5967a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f5968b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
