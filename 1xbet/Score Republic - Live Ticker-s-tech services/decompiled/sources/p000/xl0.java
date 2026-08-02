package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 {

    /* JADX INFO: renamed from: a */
    public final qd0 f8990a;

    /* JADX INFO: renamed from: b */
    public final Object f8991b;

    public xl0(jk1 jk1Var, jk1 jk1Var2, Object obj) {
        this.f8990a = new qd0(jk1Var, jk1Var2, obj, 26);
        this.f8991b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x0144  */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154  */
    /* JADX WARN: Code duplicated, block: B:54:0x0158  */
    /* JADX WARN: Code duplicated, block: B:55:0x0164  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x017c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fd  */
    /* JADX INFO: renamed from: a */
    public static int m5669a(qd0 qd0Var, Object obj, Object obj2) {
        int iM3035e;
        int size;
        int iM3034d;
        int i;
        jk1 jk1Var;
        int iM3033c;
        int size2;
        int iM3034d2;
        jk1 jk1Var2 = (jk1) qd0Var.f6471k;
        int i2 = C0932yz.f9547c;
        int iM3035e2 = 1;
        int iM3033c2 = AbstractC0397ki.m3033c(1);
        dk1 dk1Var = jk1.f3954m;
        if (jk1Var2 == dk1Var) {
            iM3033c2 *= 2;
        }
        switch (jk1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM3035e = 8;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue >> 31) ^ (iIntValue << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue >> 63) ^ (jLongValue << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM3035e = 4;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iM3035e = AbstractC0397ki.m3035e(((Long) obj).longValue());
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iM3035e = AbstractC0397ki.m3035e(((Long) obj).longValue());
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iM3035e = AbstractC0397ki.m3031a(((Integer) obj).intValue());
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iM3035e = 8;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iM3035e = 4;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iM3035e = 1;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof C0762ud) {
                    size = ((C0762ud) obj).size();
                    iM3034d = AbstractC0397ki.m3034d(size);
                    iM3035e = size + iM3034d;
                } else {
                    iM3035e = AbstractC0397ki.m3032b((String) obj);
                }
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM3035e = ((s70) ((AbstractC0342j0) obj)).mo2754a(null);
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((s70) ((AbstractC0342j0) obj)).mo2754a(null);
                iM3034d = AbstractC0397ki.m3034d(size);
                iM3035e = size + iM3034d;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                if (obj instanceof C0762ud) {
                    size = ((C0762ud) obj).size();
                    iM3034d = AbstractC0397ki.m3034d(size);
                } else {
                    size = ((byte[]) obj).length;
                    iM3034d = AbstractC0397ki.m3034d(size);
                }
                iM3035e = size + iM3034d;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                iM3035e = AbstractC0397ki.m3034d(((Integer) obj).intValue());
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                iM3035e = obj instanceof ce0 ? AbstractC0397ki.m3031a(((ce0) obj).mo555a()) : AbstractC0397ki.m3031a(((Integer) obj).intValue());
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM3035e = 4;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM3035e = 8;
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM3035e = AbstractC0397ki.m3034d((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iM3035e = AbstractC0397ki.m3035e((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i = iM3035e + iM3033c2;
                jk1Var = (jk1) qd0Var.f6472l;
                iM3033c = AbstractC0397ki.m3033c(2);
                if (jk1Var == dk1Var) {
                    iM3033c *= 2;
                }
                switch (jk1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 2:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 3:
                        iM3035e2 = AbstractC0397ki.m3035e(((Long) obj2).longValue());
                        return iM3035e2 + iM3033c + i;
                    case 4:
                        iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM3035e2 + iM3033c + i;
                    case 8:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                            iM3035e2 = iM3034d2 + size2;
                        } else {
                            iM3035e2 = AbstractC0397ki.m3032b((String) obj2);
                        }
                        return iM3035e2 + iM3033c + i;
                    case 9:
                        iM3035e2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        return iM3035e2 + iM3033c + i;
                    case 10:
                        size2 = ((s70) ((AbstractC0342j0) obj2)).mo2754a(null);
                        iM3034d2 = AbstractC0397ki.m3034d(size2);
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof C0762ud) {
                            size2 = ((C0762ud) obj2).size();
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM3034d2 = AbstractC0397ki.m3034d(size2);
                        }
                        iM3035e2 = iM3034d2 + size2;
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        iM3035e2 = AbstractC0397ki.m3034d(((Integer) obj2).intValue());
                        return iM3035e2 + iM3033c + i;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof ce0) {
                            iM3035e2 = AbstractC0397ki.m3031a(((ce0) obj2).mo555a());
                        } else {
                            iM3035e2 = AbstractC0397ki.m3031a(((Integer) obj2).intValue());
                        }
                        return iM3035e2 + iM3033c + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM3035e2 = 4;
                        return iM3035e2 + iM3033c + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM3035e2 = 8;
                        return iM3035e2 + iM3033c + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM3035e2 = AbstractC0397ki.m3034d((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iM3035e2 + iM3033c + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM3035e2 = AbstractC0397ki.m3035e((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iM3035e2 + iM3033c + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
