package p167y2;

/* JADX INFO: renamed from: y2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1058b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18155a;

    EnumC1058b(int i7) {
        this.f18155a = i7;
    }

    public static EnumC1058b a(int i7) {
        for (EnumC1058b enumC1058b : values()) {
            if (enumC1058b.f18155a == i7) {
                return enumC1058b;
            }
        }
        return null;
    }
}
