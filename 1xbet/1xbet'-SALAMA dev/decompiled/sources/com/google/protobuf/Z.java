package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f12172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12173b;

    public Z(O0 o7, S0 s7, Object obj) {
        this.f12172a = new Y(o7, s7, obj);
        this.f12173b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:54:0x0154  */
    /* JADX WARN: Code duplicated, block: B:55:0x0161  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x017b  */
    /* JADX WARN: Code duplicated, block: B:59:0x017f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x0194  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0203  */
    public static int a(Y y4, Object obj, Object obj2) {
        int iT0;
        int iC;
        int iR0;
        int i7;
        int iP0;
        S0 s7;
        int iC2;
        int iR1;
        int iT1 = 1;
        int i8 = C0888w.f12283c;
        int iP1 = AbstractC0879q.p0(1);
        P0 p5 = S0.f12149d;
        O0 o7 = y4.f12169a;
        if (o7 == p5) {
            iP1 *= 2;
        }
        switch (o7.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iT0 = 8;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue >> 31) ^ (iIntValue << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue >> 63) ^ (jLongValue << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iT0 = 4;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iT0 = AbstractC0879q.t0(((Long) obj).longValue());
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iT0 = AbstractC0879q.t0(((Long) obj).longValue());
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iT0 = AbstractC0879q.h0(((Integer) obj).intValue());
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iT0 = 8;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iT0 = 4;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iT0 = 1;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                iT0 = obj instanceof AbstractC0867k ? AbstractC0879q.Z((AbstractC0867k) obj) : AbstractC0879q.o0((String) obj);
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iT0 = ((C) ((AbstractC0847a) obj)).c(null);
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iC = ((C) ((AbstractC0847a) obj)).c(null);
                iR0 = AbstractC0879q.r0(iC);
                iT0 = iC + iR0;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof AbstractC0867k) {
                    iT0 = AbstractC0879q.Z((AbstractC0867k) obj);
                } else {
                    iC = ((byte[]) obj).length;
                    iR0 = AbstractC0879q.r0(iC);
                    iT0 = iC + iR0;
                }
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iT0 = AbstractC0879q.r0(((Integer) obj).intValue());
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iT0 = obj instanceof H ? AbstractC0879q.h0(((H) obj).a()) : AbstractC0879q.h0(((Integer) obj).intValue());
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iT0 = 4;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iT0 = 8;
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iT0 = AbstractC0879q.r0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iT0 = AbstractC0879q.t0((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i7 = iT0 + iP1;
                iP0 = AbstractC0879q.p0(2);
                s7 = y4.f12170b;
                if (s7 == p5) {
                    iP0 *= 2;
                }
                switch (s7.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 1:
                        ((Float) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 2:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 3:
                        iT1 = AbstractC0879q.t0(((Long) obj2).longValue());
                        return iT1 + iP0 + i7;
                    case 4:
                        iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 5:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 6:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iT1 + iP0 + i7;
                    case 8:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iT1 = AbstractC0879q.o0((String) obj2);
                        }
                        return iT1 + iP0 + i7;
                    case 9:
                        iT1 = ((C) ((AbstractC0847a) obj2)).c(null);
                        return iT1 + iP0 + i7;
                    case 10:
                        iC2 = ((C) ((AbstractC0847a) obj2)).c(null);
                        iR1 = AbstractC0879q.r0(iC2);
                        iT1 = iR1 + iC2;
                        return iT1 + iP0 + i7;
                    case 11:
                        if (obj2 instanceof AbstractC0867k) {
                            iT1 = AbstractC0879q.Z((AbstractC0867k) obj2);
                        } else {
                            iC2 = ((byte[]) obj2).length;
                            iR1 = AbstractC0879q.r0(iC2);
                            iT1 = iR1 + iC2;
                        }
                        return iT1 + iP0 + i7;
                    case 12:
                        iT1 = AbstractC0879q.r0(((Integer) obj2).intValue());
                        return iT1 + iP0 + i7;
                    case 13:
                        if (obj2 instanceof H) {
                            iT1 = AbstractC0879q.h0(((H) obj2).a());
                        } else {
                            iT1 = AbstractC0879q.h0(((Integer) obj2).intValue());
                        }
                        return iT1 + iP0 + i7;
                    case 14:
                        ((Integer) obj2).getClass();
                        iT1 = 4;
                        return iT1 + iP0 + i7;
                    case 15:
                        ((Long) obj2).getClass();
                        iT1 = 8;
                        return iT1 + iP0 + i7;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iT1 = AbstractC0879q.r0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iT1 + iP0 + i7;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iT1 = AbstractC0879q.t0((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iT1 + iP0 + i7;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
