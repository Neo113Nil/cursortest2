package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i92 {

    /* JADX INFO: renamed from: a */
    public final i52 f3498a;

    /* JADX INFO: renamed from: b */
    public final so1 f3499b;

    public i92(i52 i52Var, so1 so1Var) {
        this.f3498a = i52Var;
        if (so1Var != null) {
            this.f3499b = so1Var;
        } else {
            C0270h1.m2192h("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i92)) {
            return false;
        }
        i92 i92Var = (i92) obj;
        return this.f3498a.equals(i92Var.f3498a) && this.f3499b.equals(i92Var.f3499b);
    }

    public final int hashCode() {
        return this.f3499b.hashCode() ^ ((this.f3498a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.f3498a.toString();
        int length = string.length();
        String string2 = this.f3499b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(string);
        sb.append(", extensionRegistryLite=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
