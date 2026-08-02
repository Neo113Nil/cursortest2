package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e02 extends zo1 {
    private static final e02 zzi;
    private static volatile cq1 zzj;
    private int zzb;
    private kp1 zze = fq1.f2476n;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        e02 e02Var = new e02();
        zzi = e02Var;
        zo1.m5960o(e02.class, e02Var);
    }

    /* JADX INFO: renamed from: A */
    public static b02 m1329A() {
        return (b02) zzi.m5968j();
    }

    /* JADX INFO: renamed from: B */
    public static b02 m1330B(e02 e02Var) {
        xo1 xo1VarM5968j = zzi.m5968j();
        xo1VarM5968j.m5684e(e02Var);
        return (b02) xo1VarM5968j;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1331C(int i, i02 i02Var) {
        m1337I();
        this.zze.set(i, i02Var);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1332D(i02 i02Var) {
        m1337I();
        this.zze.add(i02Var);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m1333E(ArrayList arrayList) {
        m1337I();
        do1.m1273d(arrayList, this.zze);
    }

    /* JADX INFO: renamed from: F */
    public final void m1334F() {
        this.zze = fq1.f2476n;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m1335G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m1336H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: I */
    public final void m1337I() {
        kp1 kp1Var = this.zze;
        if (((eo1) kp1Var).f2152j) {
            return;
        }
        this.zze = j11.m2775j(kp1Var);
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
            return new gq1(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", i02.class, "zzf", "zzg", "zzh", yn1.f9416k});
        }
        if (i2 == 3) {
            return new e02();
        }
        if (i2 == 4) {
            return new b02(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        cq1 cq1Var = zzj;
        if (cq1Var != null) {
            return cq1Var;
        }
        synchronized (e02.class) {
            try {
                yo1Var = zzj;
                if (yo1Var == null) {
                    yo1Var = new yo1(zzi);
                    zzj = yo1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yo1Var;
    }

    /* JADX INFO: renamed from: t */
    public final List m1338t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final int m1339u() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: v */
    public final i02 m1340v(int i) {
        return (i02) this.zze.get(i);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1341w() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final String m1342x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1343y() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m1344z() {
        return this.zzg;
    }
}
