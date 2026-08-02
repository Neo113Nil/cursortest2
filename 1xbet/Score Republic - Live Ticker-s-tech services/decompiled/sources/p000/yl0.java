package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 {

    /* JADX INFO: renamed from: a */
    public final qd0 f9388a;

    public yl0(kk1 kk1Var, kk1 kk1Var2, ax0 ax0Var) {
        this.f9388a = new qd0(kk1Var, kk1Var2, ax0Var, 27);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x013d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x015e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0162  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x018e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX INFO: renamed from: a */
    public static int m5812a(qd0 qd0Var, Object obj, Object obj2) {
        int iM2874j;
        int size;
        int iM2873i;
        int i;
        kk1 kk1Var;
        int iM2872h;
        int size2;
        int iM2873i2;
        kk1 kk1Var2 = (kk1) qd0Var.f6471k;
        int i2 = C0969zz.f9986c;
        int iM2874j2 = 1;
        int iM2872h2 = C0360ji.m2872h(1);
        ek1 ek1Var = kk1.f4405m;
        if (kk1Var2 == ek1Var) {
            iM2872h2 *= 2;
        }
        switch (kk1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM2874j = 8;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue >> 31) ^ (iIntValue << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue >> 63) ^ (jLongValue << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM2874j = 4;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iM2874j = C0360ji.m2874j(((Long) obj).longValue());
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iM2874j = C0360ji.m2874j(((Long) obj).longValue());
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iM2874j = C0360ji.m2874j(((Integer) obj).intValue());
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iM2874j = 8;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iM2874j = 4;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iM2874j = 1;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof C0799vd) {
                    size = ((C0799vd) obj).size();
                    iM2873i = C0360ji.m2873i(size);
                    iM2874j = size + iM2873i;
                } else {
                    iM2874j = C0360ji.m2871g((String) obj);
                }
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM2874j = ((t70) ((AbstractC0379k0) obj)).mo2975a(null);
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((t70) ((AbstractC0379k0) obj)).mo2975a(null);
                iM2873i = C0360ji.m2873i(size);
                iM2874j = size + iM2873i;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                if (obj instanceof C0799vd) {
                    size = ((C0799vd) obj).size();
                    iM2873i = C0360ji.m2873i(size);
                } else {
                    size = ((byte[]) obj).length;
                    iM2873i = C0360ji.m2873i(size);
                }
                iM2874j = size + iM2873i;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                iM2874j = C0360ji.m2873i(((Integer) obj).intValue());
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                iM2874j = C0360ji.m2874j(((Integer) obj).intValue());
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM2874j = 4;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM2874j = 8;
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM2874j = C0360ji.m2873i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iM2874j = C0360ji.m2874j((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i = iM2874j + iM2872h2;
                kk1Var = (kk1) qd0Var.f6472l;
                iM2872h = C0360ji.m2872h(2);
                if (kk1Var == ek1Var) {
                    iM2872h *= 2;
                }
                switch (kk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 2:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 3:
                        iM2874j2 = C0360ji.m2874j(((Long) obj2).longValue());
                        return iM2874j2 + iM2872h + i;
                    case 4:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM2874j2 + iM2872h + i;
                    case 8:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                            iM2874j2 = iM2873i2 + size2;
                        } else {
                            iM2874j2 = C0360ji.m2871g((String) obj2);
                        }
                        return iM2874j2 + iM2872h + i;
                    case 9:
                        iM2874j2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        return iM2874j2 + iM2872h + i;
                    case 10:
                        size2 = ((t70) ((AbstractC0379k0) obj2)).mo2975a(null);
                        iM2873i2 = C0360ji.m2873i(size2);
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0799vd) {
                            size2 = ((C0799vd) obj2).size();
                            iM2873i2 = C0360ji.m2873i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM2873i2 = C0360ji.m2873i(size2);
                        }
                        iM2874j2 = iM2873i2 + size2;
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM2874j2 = C0360ji.m2873i(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        iM2874j2 = C0360ji.m2874j(((Integer) obj2).intValue());
                        return iM2874j2 + iM2872h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM2874j2 = 4;
                        return iM2874j2 + iM2872h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM2874j2 = 8;
                        return iM2874j2 + iM2872h + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM2874j2 = C0360ji.m2873i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iM2874j2 + iM2872h + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM2874j2 = C0360ji.m2874j((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iM2874j2 + iM2872h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
