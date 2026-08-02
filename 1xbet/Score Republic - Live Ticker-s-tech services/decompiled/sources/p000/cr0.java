package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cr0 {

    /* JADX INFO: renamed from: a */
    public final int f1434a;

    /* JADX INFO: renamed from: b */
    public final sy0 f1435b;

    /* JADX INFO: renamed from: c */
    public final gc1 f1436c;

    /* JADX INFO: renamed from: d */
    public final z41 f1437d;

    /* JADX INFO: renamed from: e */
    public final hl0 f1438e;

    /* JADX INFO: renamed from: f */
    public final C0912yf f1439f;

    /* JADX INFO: renamed from: g */
    public final bl0 f1440g;

    public cr0(Integer num, sy0 sy0Var, gc1 gc1Var, z41 z41Var, hl0 hl0Var, C0912yf c0912yf, bl0 bl0Var) {
        this.f1434a = num.intValue();
        a90.m127k(sy0Var, "proxyDetector not set");
        this.f1435b = sy0Var;
        this.f1436c = gc1Var;
        this.f1437d = z41Var;
        this.f1438e = hl0Var;
        this.f1439f = c0912yf;
        this.f1440g = bl0Var;
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5175f("defaultPort", String.valueOf(this.f1434a));
        c0809vnM5362k.m5172c(this.f1435b, "proxyDetector");
        c0809vnM5362k.m5172c(this.f1436c, "syncContext");
        c0809vnM5362k.m5172c(this.f1437d, "serviceConfigParser");
        c0809vnM5362k.m5172c(this.f1438e, "scheduledExecutorService");
        c0809vnM5362k.m5172c(this.f1439f, "channelLogger");
        c0809vnM5362k.m5172c(this.f1440g, "executor");
        c0809vnM5362k.m5172c(null, "overrideAuthority");
        return c0809vnM5362k.toString();
    }
}
