package J2;

/* loaded from: classes.dex */
public enum c {
    f2699l("BANNER"),
    f2700m("INTERSTITIAL"),
    f2701n("REWARDED"),
    f2702o("REWARDED_INTERSTITIAL"),
    f2703p("NATIVE"),
    f2704q("APP_OPEN_AD");


    /* renamed from: k, reason: collision with root package name */
    public final int f2706k;

    c(String str) {
        this.f2706k = r2;
    }

    public static c a(int i) {
        for (c cVar : values()) {
            if (cVar.f2706k == i) {
                return cVar;
            }
        }
        return null;
    }
}
