package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0342j0 f9550a;

    /* JADX INFO: renamed from: b */
    public final String f9551b;

    /* JADX INFO: renamed from: c */
    public final Object[] f9552c;

    /* JADX INFO: renamed from: d */
    public final int f9553d;

    public yz0(AbstractC0342j0 abstractC0342j0, String str, Object[] objArr) {
        this.f9550a = abstractC0342j0;
        this.f9551b = str;
        this.f9552c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f9553d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f9553d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m5856a() {
        int i = this.f9553d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
