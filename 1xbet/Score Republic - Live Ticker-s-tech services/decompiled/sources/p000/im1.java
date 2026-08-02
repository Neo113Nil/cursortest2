package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3615j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f3616k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f3617l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ qv1 f3618m;

    public /* synthetic */ im1(qv1 qv1Var, String str, long j, int i) {
        this.f3615j = i;
        this.f3616k = str;
        this.f3617l = j;
        this.f3618m = qv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3615j;
        long j = this.f3617l;
        String str = this.f3616k;
        qv1 qv1Var = this.f3618m;
        switch (i) {
            case 0:
                qv1Var.mo11z();
                p80.m3860e(str);
                C0089c8 c0089c8 = qv1Var.f6623l;
                if (c0089c8.isEmpty()) {
                    qv1Var.f6624m = j;
                }
                Integer num = (Integer) c0089c8.get(str);
                if (num != null) {
                    c0089c8.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c0089c8.f8453l < 100) {
                    c0089c8.put(str, 1);
                    qv1Var.f6622k.put(str, Long.valueOf(j));
                } else {
                    ky1 ky1Var = ((f02) qv1Var.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4603r.m5312a("Too many ads visible");
                }
                break;
            default:
                qv1Var.mo11z();
                p80.m3860e(str);
                C0089c8 c0089c9 = qv1Var.f6623l;
                Integer num2 = (Integer) c0089c9.get(str);
                f02 f02Var = (f02) qv1Var.f7192j;
                if (num2 == null) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5313b(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    l32 l32Var = f02Var.f2253u;
                    ky1 ky1Var3 = f02Var.f2247o;
                    f02.m1559l(l32Var);
                    f32 f32VarM3160E = l32Var.m3160E(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c0089c9.put(str, Integer.valueOf(iIntValue));
                    } else {
                        c0089c9.remove(str);
                        C0089c8 c0089c10 = qv1Var.f6622k;
                        Long l = (Long) c0089c10.get(str);
                        if (l == null) {
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4600o.m5312a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            c0089c10.remove(str);
                            qv1Var.m4204F(str, jLongValue, f32VarM3160E);
                        }
                        if (c0089c9.isEmpty()) {
                            long j2 = qv1Var.f6624m;
                            if (j2 != 0) {
                                qv1Var.m4203E(j - j2, f32VarM3160E);
                                qv1Var.f6624m = 0L;
                            } else {
                                f02.m1560m(ky1Var3);
                                ky1Var3.f4600o.m5312a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
