package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 {

    /* JADX INFO: renamed from: a */
    public final C0679s4 f2446a;

    /* JADX INFO: renamed from: b */
    public final C0451lz f2447b;

    public /* synthetic */ fl1(C0679s4 c0679s4, C0451lz c0451lz) {
        this.f2446a = c0679s4;
        this.f2447b = c0451lz;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fl1)) {
            return false;
        }
        fl1 fl1Var = (fl1) obj;
        return AbstractC0477mo.m3406e(this.f2446a, fl1Var.f2446a) && AbstractC0477mo.m3406e(this.f2447b, fl1Var.f2447b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2446a, this.f2447b});
    }

    public final String toString() {
        f50 f50Var = new f50(this);
        f50Var.m1627j(this.f2446a, "key");
        f50Var.m1627j(this.f2447b, "feature");
        return f50Var.toString();
    }
}
