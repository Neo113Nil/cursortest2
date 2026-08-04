package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f9111a;

    public F(l0 l0Var, n0 n0Var, p022d0.i iVar) {
        this.f9111a = new E(l0Var, n0Var, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x0176  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01af  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01de  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2  */
    public static int a(E e7, Object obj, Object obj2) {
        int iO0;
        int size;
        int iM0;
        int i7;
        int iK0;
        n0 n0Var;
        int size2;
        int iM1;
        int iO1 = 1;
        int i8 = C0671p.f9227c;
        int iK1 = C0666k.K0(1);
        m0 m0Var = p0.f9231d;
        l0 l0Var = e7.f9108a;
        if (l0Var == m0Var) {
            iK1 *= 2;
        }
        switch (l0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iO0 = 8;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue >> 31) ^ (iIntValue << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue >> 63) ^ (jLongValue << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iO0 = 4;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iO0 = C0666k.O0(((Long) obj).longValue());
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iO0 = C0666k.O0(((Long) obj).longValue());
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iO0 = C0666k.O0(((Integer) obj).intValue());
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iO0 = 8;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iO0 = 4;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iO0 = 1;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof C0662g) {
                    size = ((C0662g) obj).size();
                    iM0 = C0666k.M0(size);
                    iO0 = size + iM0;
                } else {
                    iO0 = C0666k.J0((String) obj);
                }
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iO0 = ((AbstractC0675u) ((AbstractC0656a) obj)).a(null);
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((AbstractC0675u) ((AbstractC0656a) obj)).a(null);
                iM0 = C0666k.M0(size);
                iO0 = size + iM0;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof C0662g) {
                    size = ((C0662g) obj).size();
                    iM0 = C0666k.M0(size);
                } else {
                    size = ((byte[]) obj).length;
                    iM0 = C0666k.M0(size);
                }
                iO0 = size + iM0;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iO0 = C0666k.M0(((Integer) obj).intValue());
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iO0 = C0666k.O0(((Integer) obj).intValue());
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iO0 = 4;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iO0 = 8;
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iO0 = C0666k.M0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iO0 = C0666k.O0((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i7 = iO0 + iK1;
                iK0 = C0666k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    iK0 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 2:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 3:
                        iO1 = C0666k.O0(((Long) obj2).longValue());
                        return iO1 + iK0 + i7;
                    case 4:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iO1 + iK0 + i7;
                    case 8:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                            iO1 = iM1 + size2;
                        } else {
                            iO1 = C0666k.J0((String) obj2);
                        }
                        return iO1 + iK0 + i7;
                    case 9:
                        iO1 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        return iO1 + iK0 + i7;
                    case 10:
                        size2 = ((AbstractC0675u) ((AbstractC0656a) obj2)).a(null);
                        iM1 = C0666k.M0(size2);
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 11:
                        if (obj2 instanceof C0662g) {
                            size2 = ((C0662g) obj2).size();
                            iM1 = C0666k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iM1 = C0666k.M0(size2);
                        }
                        iO1 = iM1 + size2;
                        return iO1 + iK0 + i7;
                    case 12:
                        iO1 = C0666k.M0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 13:
                        iO1 = C0666k.O0(((Integer) obj2).intValue());
                        return iO1 + iK0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iO1 = 4;
                        return iO1 + iK0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iO1 = 8;
                        return iO1 + iK0 + i7;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iO1 = C0666k.M0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iO1 + iK0 + i7;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iO1 = C0666k.O0((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iO1 + iK0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
