package com.google.protobuf;

/* loaded from: classes2.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final Y f12172a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12173b;

    public Z(O0 o02, S0 s02, Object obj) {
        this.f12172a = new Y(o02, s02, obj);
        this.f12173b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(Y y4, Object obj, Object obj2) {
        int t02;
        int c3;
        int r02;
        S0 s02;
        int c4;
        int r03;
        int i7 = 1;
        int i8 = C0932w.f12283c;
        int p02 = AbstractC0923q.p0(1);
        P0 p03 = S0.f12149d;
        O0 o02 = y4.f12169a;
        if (o02 == p03) {
            p02 *= 2;
        }
        switch (o02.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                t02 = 8;
                int i9 = t02 + p02;
                int p04 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                    p04 *= 2;
                }
                switch (s02.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i7 = 8;
                        return i7 + p04 + i9;
                    case 1:
                        ((Float) obj2).getClass();
                        i7 = 4;
                        return i7 + p04 + i9;
                    case 2:
                        i7 = AbstractC0923q.t0(((Long) obj2).longValue());
                        return i7 + p04 + i9;
                    case 3:
                        i7 = AbstractC0923q.t0(((Long) obj2).longValue());
                        return i7 + p04 + i9;
                    case 4:
                        i7 = AbstractC0923q.h0(((Integer) obj2).intValue());
                        return i7 + p04 + i9;
                    case 5:
                        ((Long) obj2).getClass();
                        i7 = 8;
                        return i7 + p04 + i9;
                    case 6:
                        ((Integer) obj2).getClass();
                        i7 = 4;
                        return i7 + p04 + i9;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i7 + p04 + i9;
                    case 8:
                        i7 = obj2 instanceof AbstractC0911k ? AbstractC0923q.Z((AbstractC0911k) obj2) : AbstractC0923q.o0((String) obj2);
                        return i7 + p04 + i9;
                    case 9:
                        i7 = ((C) ((AbstractC0891a) obj2)).c(null);
                        return i7 + p04 + i9;
                    case 10:
                        c4 = ((C) ((AbstractC0891a) obj2)).c(null);
                        r03 = AbstractC0923q.r0(c4);
                        i7 = r03 + c4;
                        return i7 + p04 + i9;
                    case 11:
                        if (obj2 instanceof AbstractC0911k) {
                            i7 = AbstractC0923q.Z((AbstractC0911k) obj2);
                            return i7 + p04 + i9;
                        }
                        c4 = ((byte[]) obj2).length;
                        r03 = AbstractC0923q.r0(c4);
                        i7 = r03 + c4;
                        return i7 + p04 + i9;
                    case 12:
                        i7 = AbstractC0923q.r0(((Integer) obj2).intValue());
                        return i7 + p04 + i9;
                    case 13:
                        i7 = obj2 instanceof H ? AbstractC0923q.h0(((H) obj2).a()) : AbstractC0923q.h0(((Integer) obj2).intValue());
                        return i7 + p04 + i9;
                    case 14:
                        ((Integer) obj2).getClass();
                        i7 = 4;
                        return i7 + p04 + i9;
                    case 15:
                        ((Long) obj2).getClass();
                        i7 = 8;
                        return i7 + p04 + i9;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i7 = AbstractC0923q.r0((intValue >> 31) ^ (intValue << 1));
                        return i7 + p04 + i9;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i7 = AbstractC0923q.t0((longValue >> 63) ^ (longValue << 1));
                        return i7 + p04 + i9;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                t02 = 4;
                int i92 = t02 + p02;
                int p042 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 2:
                t02 = AbstractC0923q.t0(((Long) obj).longValue());
                int i922 = t02 + p02;
                int p0422 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 3:
                t02 = AbstractC0923q.t0(((Long) obj).longValue());
                int i9222 = t02 + p02;
                int p04222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 4:
                t02 = AbstractC0923q.h0(((Integer) obj).intValue());
                int i92222 = t02 + p02;
                int p042222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                t02 = 8;
                int i922222 = t02 + p02;
                int p0422222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                t02 = 4;
                int i9222222 = t02 + p02;
                int p04222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                t02 = 1;
                int i92222222 = t02 + p02;
                int p042222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 8:
                t02 = obj instanceof AbstractC0911k ? AbstractC0923q.Z((AbstractC0911k) obj) : AbstractC0923q.o0((String) obj);
                int i922222222 = t02 + p02;
                int p0422222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 9:
                t02 = ((C) ((AbstractC0891a) obj)).c(null);
                int i9222222222 = t02 + p02;
                int p04222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 10:
                c3 = ((C) ((AbstractC0891a) obj)).c(null);
                r02 = AbstractC0923q.r0(c3);
                t02 = c3 + r02;
                int i92222222222 = t02 + p02;
                int p042222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 11:
                if (obj instanceof AbstractC0911k) {
                    t02 = AbstractC0923q.Z((AbstractC0911k) obj);
                    int i922222222222 = t02 + p02;
                    int p0422222222222 = AbstractC0923q.p0(2);
                    s02 = y4.f12170b;
                    if (s02 == p03) {
                    }
                    switch (s02.ordinal()) {
                    }
                } else {
                    c3 = ((byte[]) obj).length;
                    r02 = AbstractC0923q.r0(c3);
                    t02 = c3 + r02;
                    int i9222222222222 = t02 + p02;
                    int p04222222222222 = AbstractC0923q.p0(2);
                    s02 = y4.f12170b;
                    if (s02 == p03) {
                    }
                    switch (s02.ordinal()) {
                    }
                }
            case 12:
                t02 = AbstractC0923q.r0(((Integer) obj).intValue());
                int i92222222222222 = t02 + p02;
                int p042222222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 13:
                t02 = obj instanceof H ? AbstractC0923q.h0(((H) obj).a()) : AbstractC0923q.h0(((Integer) obj).intValue());
                int i922222222222222 = t02 + p02;
                int p0422222222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                t02 = 4;
                int i9222222222222222 = t02 + p02;
                int p04222222222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                t02 = 8;
                int i92222222222222222 = t02 + p02;
                int p042222222222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                t02 = AbstractC0923q.r0((intValue2 >> 31) ^ (intValue2 << 1));
                int i922222222222222222 = t02 + p02;
                int p0422222222222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                t02 = AbstractC0923q.t0((longValue2 >> 63) ^ (longValue2 << 1));
                int i9222222222222222222 = t02 + p02;
                int p04222222222222222222 = AbstractC0923q.p0(2);
                s02 = y4.f12170b;
                if (s02 == p03) {
                }
                switch (s02.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
