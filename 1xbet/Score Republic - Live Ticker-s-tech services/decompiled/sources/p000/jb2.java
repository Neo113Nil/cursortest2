package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jb2 implements ab2 {

    /* JADX INFO: renamed from: a */
    public final ab2 f3895a;

    /* JADX INFO: renamed from: b */
    public final Object f3896b;

    public jb2(ab2 ab2Var, Object obj) {
        this.f3895a = ab2Var;
        p80.m3874s(obj, "log site qualifier");
        this.f3896b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jb2)) {
            return false;
        }
        jb2 jb2Var = (jb2) obj;
        return this.f3895a.equals(jb2Var.f3895a) && this.f3896b.equals(jb2Var.f3896b);
    }

    public final int hashCode() {
        return this.f3896b.hashCode() ^ this.f3895a.hashCode();
    }

    public final String toString() {
        String string = this.f3895a.toString();
        int length = string.length();
        String string2 = this.f3896b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(string);
        sb.append("', qualifier='");
        sb.append(string2);
        sb.append("' }");
        return sb.toString();
    }
}
