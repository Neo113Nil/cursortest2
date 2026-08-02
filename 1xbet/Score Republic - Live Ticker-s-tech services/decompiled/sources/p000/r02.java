package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r02 extends zo1 {
    private static final r02 zzh;
    private static volatile cq1 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        r02 r02Var = new r02();
        zzh = r02Var;
        zo1.m5960o(r02.class, r02Var);
    }

    /* JADX INFO: renamed from: u */
    public static q02 m4223u() {
        return (q02) zzh.m5968j();
    }

    /* JADX INFO: renamed from: v */
    public static r02 m4224v() {
        return zzh;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m4225A(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    @Override // p000.zo1
    /* JADX INFO: renamed from: s */
    public final Object mo14s(int i) {
        cq1 yo1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gq1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", yn1.f9420o, "zzf", yn1.f9418m, "zzg", yn1.f9419n});
        }
        if (i2 == 3) {
            return new r02();
        }
        if (i2 == 4) {
            return new q02(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzi;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (r02.class) {
            try {
                yo1Var = zzi;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzh);
                    zzi = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final int m4226t() {
        int iM2768c = j11.m2768c(this.zzf);
        if (iM2768c == 0) {
            return 1;
        }
        return iM2768c;
    }

    /* JADX INFO: renamed from: w */
    public final void m4227w(int i) {
        this.zzf = j11.m2770e(i);
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: x */
    public final int m4228x() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
      0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y */
    public final int m4229y() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m4230z(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
