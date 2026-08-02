package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w62 {

    /* JADX INFO: renamed from: a */
    public final x62 f8445a;

    /* JADX INFO: renamed from: b */
    public int f8446b = 1;

    /* JADX INFO: renamed from: c */
    public long f8447c = m5290a();

    public w62(x62 x62Var) {
        this.f8445a = x62Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m5290a() {
        x62 x62Var = this.f8445a;
        p80.m3863h(x62Var);
        long jLongValue = ((Long) jx1.f4216v.m2715a(null)).longValue();
        long jLongValue2 = ((Long) jx1.f4218w.m2715a(null)).longValue();
        for (int i = 1; i < this.f8446b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        x62Var.mo1567f().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
