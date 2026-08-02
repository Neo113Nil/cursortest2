package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t72 {

    /* JADX INFO: renamed from: a */
    public final boolean f7329a;

    /* JADX INFO: renamed from: b */
    public final List f7330b;

    /* JADX INFO: renamed from: c */
    public final ko1 f7331c;

    /* JADX INFO: renamed from: d */
    public final String f7332d;

    /* JADX INFO: renamed from: e */
    public final String f7333e;

    /* JADX INFO: renamed from: f */
    public final List f7334f;

    /* JADX INFO: renamed from: g */
    public final List f7335g;

    /* JADX INFO: renamed from: h */
    public final boolean f7336h;

    /* JADX INFO: renamed from: i */
    public final boolean f7337i;

    /* JADX INFO: renamed from: j */
    public final boolean f7338j;

    /* JADX INFO: renamed from: k */
    public final r42 f7339k;

    public t72(boolean z, qc0 qc0Var, ko1 ko1Var, String str, String str2, qc0 qc0Var2, qc0 qc0Var3, boolean z2, boolean z3, boolean z4, r42 r42Var) {
        qc0Var.getClass();
        ko1Var.getClass();
        str.getClass();
        str2.getClass();
        qc0Var2.getClass();
        qc0Var3.getClass();
        r42Var.getClass();
        this.f7329a = z;
        this.f7330b = qc0Var;
        this.f7331c = ko1Var;
        this.f7332d = str;
        this.f7333e = str2;
        this.f7334f = qc0Var2;
        this.f7335g = qc0Var3;
        this.f7336h = z2;
        this.f7337i = z3;
        this.f7338j = z4;
        this.f7339k = r42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t72)) {
            return false;
        }
        t72 t72Var = (t72) obj;
        return this.f7329a == t72Var.f7329a && af0.m187a(this.f7330b, t72Var.f7330b) && af0.m187a(this.f7331c, t72Var.f7331c) && af0.m187a(this.f7332d, t72Var.f7332d) && af0.m187a(this.f7333e, t72Var.f7333e) && af0.m187a(this.f7334f, t72Var.f7334f) && af0.m187a(this.f7335g, t72Var.f7335g) && this.f7336h == t72Var.f7336h && this.f7337i == t72Var.f7337i && this.f7338j == t72Var.f7338j && af0.m187a(this.f7339k, t72Var.f7339k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f7329a), this.f7330b, this.f7331c, this.f7332d, this.f7333e, this.f7334f, this.f7335g, Boolean.valueOf(this.f7336h), Boolean.valueOf(this.f7337i), Boolean.valueOf(this.f7338j));
    }

    public final String toString() {
        boolean z = this.f7329a;
        int length = String.valueOf(z).length();
        List list = this.f7330b;
        int length2 = String.valueOf(list).length();
        ko1 ko1Var = this.f7331c;
        int length3 = String.valueOf(ko1Var).length();
        String str = this.f7332d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f7333e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f7334f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f7335g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.f7336h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.f7337i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.f7338j;
        int length10 = String.valueOf(z4).length();
        r42 r42Var = this.f7339k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(r42Var).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(ko1Var);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(r42Var);
        sb.append(")");
        return sb.toString();
    }
}
