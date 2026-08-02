package y2;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1798b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f18149a;

    EnumC1798b(int i7) {
        this.f18149a = i7;
    }

    public static EnumC1798b a(int i7) {
        for (EnumC1798b enumC1798b : values()) {
            if (enumC1798b.f18149a == i7) {
                return enumC1798b;
            }
        }
        return null;
    }
}
