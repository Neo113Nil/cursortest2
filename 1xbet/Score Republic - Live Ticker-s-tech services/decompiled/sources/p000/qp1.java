package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qp1 {

    /* JADX INFO: renamed from: a */
    public final oq0 f6560a;

    public qp1(wq1 wq1Var, wq1 wq1Var2, Object obj) {
        this.f6560a = new oq0(wq1Var, wq1Var2, obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m4122a(ro1 ro1Var, oq0 oq0Var, Object obj, Object obj2) {
        uo1.m4937b(ro1Var, (wq1) oq0Var.f5840k, 1, obj);
        uo1.m4937b(ro1Var, (wq1) oq0Var.f5842m, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    /* JADX INFO: renamed from: b */
    public static int m4123b(oq0 oq0Var, Object obj, Object obj2) {
        int iM4392b;
        int iM5184b;
        int iM4391a;
        int i;
        int iM4391a2;
        int iM5184b2;
        int iM4391a3;
        wq1 wq1Var = (wq1) oq0Var.f5840k;
        wq1 wq1Var2 = (wq1) oq0Var.f5842m;
        int i2 = uo1.f7876c;
        int iM4392b2 = 8;
        int iM4391a4 = ro1.m4391a(8);
        wq1 wq1Var3 = wq1.f8640m;
        if (wq1Var == wq1Var3) {
            iM4391a4 += iM4391a4;
        }
        xq1 xq1Var = xq1.f9031j;
        switch (wq1Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM4392b = 8;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM4392b = 4;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iM4392b = ro1.m4392b(((Long) obj).longValue());
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iM4392b = ro1.m4392b(((Long) obj).longValue());
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iM4392b = ro1.m4392b(((Integer) obj).intValue());
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iM4392b = 8;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iM4392b = 4;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iM4392b = 1;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof ko1) {
                    iM5184b = ((ko1) obj).mo2330c();
                    iM4391a = ro1.m4391a(iM5184b);
                } else {
                    iM5184b = vq1.m5184b((String) obj);
                    iM4391a = ro1.m4391a(iM5184b);
                }
                iM4392b = iM5184b + iM4391a;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM4392b = ((zo1) ((do1) obj)).m5971m();
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iM5184b = ((zo1) ((do1) obj)).m5971m();
                iM4391a = ro1.m4391a(iM5184b);
                iM4392b = iM5184b + iM4391a;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                if (obj instanceof ko1) {
                    iM5184b = ((ko1) obj).mo2330c();
                    iM4391a = ro1.m4391a(iM5184b);
                } else {
                    iM5184b = ((byte[]) obj).length;
                    iM4391a = ro1.m4391a(iM5184b);
                }
                iM4392b = iM5184b + iM4391a;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                iM4392b = ro1.m4391a(((Integer) obj).intValue());
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                iM4392b = obj instanceof bp1 ? ro1.m4392b(((bp1) obj).mo739a()) : ro1.m4392b(((Integer) obj).intValue());
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM4392b = 4;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM4392b = 8;
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM4392b = ro1.m4391a((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iM4392b = ro1.m4392b((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i = iM4392b + iM4391a4;
                iM4391a2 = ro1.m4391a(16);
                if (wq1Var2 == wq1Var3) {
                    iM4391a2 += iM4391a2;
                }
                switch (wq1Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 2:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 3:
                        iM4392b2 = ro1.m4392b(((Long) obj2).longValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 4:
                        iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM4392b2 = 1;
                        return iM4392b2 + iM4391a2 + i;
                    case 8:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = vq1.m5184b((String) obj2);
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case 9:
                        iM4392b2 = ((zo1) ((do1) obj2)).m5971m();
                        return iM4392b2 + iM4391a2 + i;
                    case 10:
                        iM5184b2 = ((zo1) ((do1) obj2)).m5971m();
                        iM4391a3 = ro1.m4391a(iM5184b2);
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof ko1) {
                            iM5184b2 = ((ko1) obj2).mo2330c();
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        } else {
                            iM5184b2 = ((byte[]) obj2).length;
                            iM4391a3 = ro1.m4391a(iM5184b2);
                        }
                        iM4392b2 = iM4391a3 + iM5184b2;
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM4392b2 = ro1.m4391a(((Integer) obj2).intValue());
                        return iM4392b2 + iM4391a2 + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof bp1) {
                            iM4392b2 = ro1.m4392b(((bp1) obj2).mo739a());
                        } else {
                            iM4392b2 = ro1.m4392b(((Integer) obj2).intValue());
                        }
                        return iM4392b2 + iM4391a2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM4392b2 = 4;
                        return iM4392b2 + iM4391a2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM4392b2 + iM4391a2 + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM4392b2 = ro1.m4391a((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iM4392b2 + iM4391a2 + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM4392b2 = ro1.m4392b((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iM4392b2 + iM4391a2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final oq0 m4124c() {
        return this.f6560a;
    }
}
