package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum zn1 implements bp1 {
    f9866k("UNKNOWN"),
    f9867l("SHARED_PREFS"),
    f9868m("CONTENT_PROVIDER"),
    f9869n("FILE"),
    f9870o("TIKTOK"),
    f9871p("DEVICE_CONFIG"),
    f9872q("PROCESS_STABLE_CONTENT_PROVIDER");


    /* JADX INFO: renamed from: j */
    public final int f9874j;

    zn1(String str) {
        this.f9874j = i;
    }

    /* JADX INFO: renamed from: b */
    public static zn1 m5941b(int i) {
        switch (i) {
            case 0:
                return f9866k;
            case 1:
                return f9867l;
            case 2:
                return f9868m;
            case 3:
                return f9872q;
            case 4:
                return f9870o;
            case 5:
                return f9871p;
            case 6:
                return f9869n;
            default:
                return null;
        }
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: a */
    public final int mo739a() {
        return this.f9874j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f9874j);
    }
}
