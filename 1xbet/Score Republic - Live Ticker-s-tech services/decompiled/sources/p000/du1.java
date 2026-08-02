package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class du1 {

    /* JADX INFO: renamed from: a */
    public final String f1829a;

    /* JADX INFO: renamed from: b */
    public final String f1830b;

    /* JADX INFO: renamed from: c */
    public final long f1831c;

    /* JADX INFO: renamed from: d */
    public final long f1832d;

    /* JADX INFO: renamed from: e */
    public final long f1833e;

    /* JADX INFO: renamed from: f */
    public final long f1834f;

    /* JADX INFO: renamed from: g */
    public final long f1835g;

    /* JADX INFO: renamed from: h */
    public final Long f1836h;

    /* JADX INFO: renamed from: i */
    public final Long f1837i;

    /* JADX INFO: renamed from: j */
    public final Long f1838j;

    /* JADX INFO: renamed from: k */
    public final Boolean f1839k;

    public du1(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        p80.m3860e(str);
        p80.m3860e(str2);
        p80.m3858b(j >= 0);
        p80.m3858b(j2 >= 0);
        p80.m3858b(j3 >= 0);
        p80.m3858b(j5 >= 0);
        this.f1829a = str;
        this.f1830b = str2;
        this.f1831c = j;
        this.f1832d = j2;
        this.f1833e = j3;
        this.f1834f = j4;
        this.f1835g = j5;
        this.f1836h = l;
        this.f1837i = l2;
        this.f1838j = l3;
        this.f1839k = bool;
    }

    /* JADX INFO: renamed from: a */
    public final du1 m1304a(long j) {
        return new du1(this.f1829a, this.f1830b, this.f1831c, this.f1832d, this.f1833e, j, this.f1835g, this.f1836h, this.f1837i, this.f1838j, this.f1839k);
    }

    /* JADX INFO: renamed from: b */
    public final du1 m1305b(Long l, Long l2, Boolean bool) {
        return new du1(this.f1829a, this.f1830b, this.f1831c, this.f1832d, this.f1833e, this.f1834f, this.f1835g, this.f1836h, l, l2, bool);
    }
}
