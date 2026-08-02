package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qa0 {

    /* JADX INFO: renamed from: d */
    public static final C0836wd f6435d;

    /* JADX INFO: renamed from: e */
    public static final C0836wd f6436e;

    /* JADX INFO: renamed from: f */
    public static final C0836wd f6437f;

    /* JADX INFO: renamed from: g */
    public static final C0836wd f6438g;

    /* JADX INFO: renamed from: h */
    public static final C0836wd f6439h;

    /* JADX INFO: renamed from: a */
    public final C0836wd f6440a;

    /* JADX INFO: renamed from: b */
    public final C0836wd f6441b;

    /* JADX INFO: renamed from: c */
    public final int f6442c;

    static {
        C0836wd c0836wd = C0836wd.f8510m;
        f6435d = n80.m3494c(":status");
        f6436e = n80.m3494c(":method");
        f6437f = n80.m3494c(":path");
        f6438g = n80.m3494c(":scheme");
        f6439h = n80.m3494c(":authority");
        n80.m3494c(":host");
        n80.m3494c(":version");
    }

    public qa0(C0836wd c0836wd, C0836wd c0836wd2) {
        this.f6440a = c0836wd;
        this.f6441b = c0836wd2;
        this.f6442c = c0836wd2.mo2556b() + c0836wd.mo2556b() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qa0) {
            qa0 qa0Var = (qa0) obj;
            if (this.f6440a.equals(qa0Var.f6440a) && this.f6441b.equals(qa0Var.f6441b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6441b.hashCode() + ((this.f6440a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return this.f6440a.m5317k() + ": " + this.f6441b.m5317k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qa0(String str, String str2) {
        this(n80.m3494c(str), n80.m3494c(str2));
        C0836wd c0836wd = C0836wd.f8510m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qa0(C0836wd c0836wd, String str) {
        this(c0836wd, n80.m3494c(str));
        C0836wd c0836wd2 = C0836wd.f8510m;
    }
}
