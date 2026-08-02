package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h42 {

    /* JADX INFO: renamed from: b */
    public static final h42 f3051b;

    /* JADX INFO: renamed from: a */
    public final uc0 f3052a;

    static {
        int i = uc0.f7792o;
        f3051b = new h42(x01.f8733q);
    }

    public h42(uc0 uc0Var) {
        this.f3052a = uc0Var;
    }

    /* JADX INFO: renamed from: a */
    public static h42 m2208a(AbstractC0860x0 abstractC0860x0) throws mp1 {
        String strMo3258Z;
        long j;
        g42 g42Var;
        int iMo3268j0 = abstractC0860x0.mo3268j0();
        if (iMo3268j0 < 0) {
            re1.m4350e("Negative number of flags");
            return null;
        }
        int i = uc0.f7792o;
        tc0 tc0Var = new tc0();
        long j2 = 0;
        for (int i2 = 0; i2 < iMo3268j0; i2++) {
            long jMo3269k0 = abstractC0860x0.mo3269k0();
            int i3 = (int) jMo3269k0;
            long j3 = jMo3269k0 >>> 3;
            if (j3 == 0) {
                j = 0;
                strMo3258Z = abstractC0860x0.mo3258Z();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    re1.m4350e("Flag name larger than max size");
                    return null;
                }
                strMo3258Z = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                g42Var = new g42(j, strMo3258Z, i4, 0L, null);
            } else if (i4 == 2) {
                g42Var = new g42(j, strMo3258Z, i4, abstractC0860x0.mo3269k0(), null);
            } else if (i4 == 3) {
                g42Var = new g42(j, strMo3258Z, i4, Double.doubleToRawLongBits(abstractC0860x0.mo3250R()), null);
            } else if (i4 == 4) {
                g42Var = new g42(j, strMo3258Z, i4, 0L, abstractC0860x0.mo3258Z());
            } else {
                if (i4 != 5) {
                    re1.m4350e(j11.m2774i(new StringBuilder(String.valueOf(i4).length() + 23), "Unrecognized flag type ", i4));
                    return null;
                }
                g42Var = new g42(j, strMo3258Z, i4, 0L, abstractC0860x0.mo3261c0());
            }
            long j5 = g42Var.f2615j;
            if (j5 != 0) {
                j2 = j5;
            }
            tc0Var.m3004a(g42Var);
        }
        return new h42(tc0Var.m4784d());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h42)) {
            return false;
        }
        return this.f3052a.equals(((h42) obj).f3052a);
    }

    public final int hashCode() {
        uc0 uc0Var = this.f3052a;
        uc0Var.getClass();
        return AbstractC0959zp.m5981j(uc0Var);
    }
}
