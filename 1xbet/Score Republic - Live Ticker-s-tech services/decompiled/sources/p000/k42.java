package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k42 {

    /* JADX INFO: renamed from: a */
    public final String f4282a;

    /* JADX INFO: renamed from: b */
    public final String f4283b;

    /* JADX INFO: renamed from: c */
    public final boolean f4284c;

    public k42(String str, boolean z) {
        p80.m3860e(str);
        this.f4282a = str;
        p80.m3860e("com.google.android.gms");
        this.f4283b = "com.google.android.gms";
        this.f4284c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k42)) {
            return false;
        }
        k42 k42Var = (k42) obj;
        return AbstractC0477mo.m3406e(this.f4282a, k42Var.f4282a) && AbstractC0477mo.m3406e(this.f4283b, k42Var.f4283b) && AbstractC0477mo.m3406e(null, null) && this.f4284c == k42Var.f4284c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4282a, this.f4283b, null, 4225, Boolean.valueOf(this.f4284c)});
    }

    public final String toString() {
        String str = this.f4282a;
        if (str != null) {
            return str;
        }
        p80.m3863h(null);
        throw null;
    }
}
