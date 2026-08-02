package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 {

    /* JADX INFO: renamed from: b */
    public static final yn1 f9407b = new yn1(0);

    /* JADX INFO: renamed from: c */
    public static final yn1 f9408c = new yn1(1);

    /* JADX INFO: renamed from: d */
    public static final yn1 f9409d = new yn1(2);

    /* JADX INFO: renamed from: e */
    public static final yn1 f9410e = new yn1(3);

    /* JADX INFO: renamed from: f */
    public static final yn1 f9411f = new yn1(4);

    /* JADX INFO: renamed from: g */
    public static final yn1 f9412g = new yn1(5);

    /* JADX INFO: renamed from: h */
    public static final yn1 f9413h = new yn1(6);

    /* JADX INFO: renamed from: i */
    public static final yn1 f9414i = new yn1(7);

    /* JADX INFO: renamed from: j */
    public static final yn1 f9415j = new yn1(8);

    /* JADX INFO: renamed from: k */
    public static final yn1 f9416k = new yn1(9);

    /* JADX INFO: renamed from: l */
    public static final yn1 f9417l = new yn1(10);

    /* JADX INFO: renamed from: m */
    public static final yn1 f9418m = new yn1(11);

    /* JADX INFO: renamed from: n */
    public static final yn1 f9419n = new yn1(12);

    /* JADX INFO: renamed from: o */
    public static final yn1 f9420o = new yn1(13);

    /* JADX INFO: renamed from: p */
    public static final yn1 f9421p = new yn1(14);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9422a;

    public /* synthetic */ yn1(int i) {
        this.f9422a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5816a(int i) {
        switch (this.f9422a) {
            case 0:
                return zn1.m5941b(i) != null;
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 2:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i == 0 || i == 1 || i == 2;
            case 4:
                return wm1.m5365n(i) != 0;
            case 5:
                return i == 0 || i == 1 || i == 2;
            case 6:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 7:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 8:
                return i == 0 || i == 1 || i == 2;
            case 9:
                return i == 0 || i == 1;
            case 10:
                return i == 1 || i == 2;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return j11.m2768c(i) != 0;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
        }
    }
}
