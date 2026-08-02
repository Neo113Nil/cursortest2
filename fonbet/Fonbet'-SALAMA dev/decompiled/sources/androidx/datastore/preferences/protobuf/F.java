package androidx.datastore.preferences.protobuf;

import d0.C0947i;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final E f9111a;

    public F(l0 l0Var, n0 n0Var, C0947i c0947i) {
        this.f9111a = new E(l0Var, n0Var, c0947i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(E e7, Object obj, Object obj2) {
        int O02;
        int size;
        int M02;
        n0 n0Var;
        int size2;
        int M03;
        int i7 = 1;
        int i8 = C0692p.f9227c;
        int K02 = C0687k.K0(1);
        m0 m0Var = p0.f9231d;
        l0 l0Var = e7.f9108a;
        if (l0Var == m0Var) {
            K02 *= 2;
        }
        switch (l0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                O02 = 8;
                int i9 = O02 + K02;
                int K03 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                    K03 *= 2;
                }
                switch (n0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i7 = 8;
                        return i7 + K03 + i9;
                    case 1:
                        ((Float) obj2).getClass();
                        i7 = 4;
                        return i7 + K03 + i9;
                    case 2:
                        i7 = C0687k.O0(((Long) obj2).longValue());
                        return i7 + K03 + i9;
                    case 3:
                        i7 = C0687k.O0(((Long) obj2).longValue());
                        return i7 + K03 + i9;
                    case 4:
                        i7 = C0687k.O0(((Integer) obj2).intValue());
                        return i7 + K03 + i9;
                    case 5:
                        ((Long) obj2).getClass();
                        i7 = 8;
                        return i7 + K03 + i9;
                    case 6:
                        ((Integer) obj2).getClass();
                        i7 = 4;
                        return i7 + K03 + i9;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i7 + K03 + i9;
                    case 8:
                        if (!(obj2 instanceof C0683g)) {
                            i7 = C0687k.J0((String) obj2);
                            return i7 + K03 + i9;
                        }
                        size2 = ((C0683g) obj2).size();
                        M03 = C0687k.M0(size2);
                        i7 = M03 + size2;
                        return i7 + K03 + i9;
                    case 9:
                        i7 = ((AbstractC0696u) ((AbstractC0677a) obj2)).a(null);
                        return i7 + K03 + i9;
                    case 10:
                        size2 = ((AbstractC0696u) ((AbstractC0677a) obj2)).a(null);
                        M03 = C0687k.M0(size2);
                        i7 = M03 + size2;
                        return i7 + K03 + i9;
                    case 11:
                        if (obj2 instanceof C0683g) {
                            size2 = ((C0683g) obj2).size();
                            M03 = C0687k.M0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            M03 = C0687k.M0(size2);
                        }
                        i7 = M03 + size2;
                        return i7 + K03 + i9;
                    case 12:
                        i7 = C0687k.M0(((Integer) obj2).intValue());
                        return i7 + K03 + i9;
                    case 13:
                        i7 = C0687k.O0(((Integer) obj2).intValue());
                        return i7 + K03 + i9;
                    case 14:
                        ((Integer) obj2).getClass();
                        i7 = 4;
                        return i7 + K03 + i9;
                    case 15:
                        ((Long) obj2).getClass();
                        i7 = 8;
                        return i7 + K03 + i9;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i7 = C0687k.M0((intValue >> 31) ^ (intValue << 1));
                        return i7 + K03 + i9;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i7 = C0687k.O0((longValue >> 63) ^ (longValue << 1));
                        return i7 + K03 + i9;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                O02 = 4;
                int i92 = O02 + K02;
                int K032 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 2:
                O02 = C0687k.O0(((Long) obj).longValue());
                int i922 = O02 + K02;
                int K0322 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 3:
                O02 = C0687k.O0(((Long) obj).longValue());
                int i9222 = O02 + K02;
                int K03222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 4:
                O02 = C0687k.O0(((Integer) obj).intValue());
                int i92222 = O02 + K02;
                int K032222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                O02 = 8;
                int i922222 = O02 + K02;
                int K0322222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                O02 = 4;
                int i9222222 = O02 + K02;
                int K03222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                O02 = 1;
                int i92222222 = O02 + K02;
                int K032222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 8:
                if (obj instanceof C0683g) {
                    size = ((C0683g) obj).size();
                    M02 = C0687k.M0(size);
                    O02 = size + M02;
                    int i922222222 = O02 + K02;
                    int K0322222222 = C0687k.K0(2);
                    n0Var = e7.f9109b;
                    if (n0Var == m0Var) {
                    }
                    switch (n0Var.ordinal()) {
                    }
                } else {
                    O02 = C0687k.J0((String) obj);
                    int i9222222222 = O02 + K02;
                    int K03222222222 = C0687k.K0(2);
                    n0Var = e7.f9109b;
                    if (n0Var == m0Var) {
                    }
                    switch (n0Var.ordinal()) {
                    }
                }
            case 9:
                O02 = ((AbstractC0696u) ((AbstractC0677a) obj)).a(null);
                int i92222222222 = O02 + K02;
                int K032222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0696u) ((AbstractC0677a) obj)).a(null);
                M02 = C0687k.M0(size);
                O02 = size + M02;
                int i922222222222 = O02 + K02;
                int K0322222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0683g) {
                    size = ((C0683g) obj).size();
                    M02 = C0687k.M0(size);
                } else {
                    size = ((byte[]) obj).length;
                    M02 = C0687k.M0(size);
                }
                O02 = size + M02;
                int i9222222222222 = O02 + K02;
                int K03222222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 12:
                O02 = C0687k.M0(((Integer) obj).intValue());
                int i92222222222222 = O02 + K02;
                int K032222222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 13:
                O02 = C0687k.O0(((Integer) obj).intValue());
                int i922222222222222 = O02 + K02;
                int K0322222222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                O02 = 4;
                int i9222222222222222 = O02 + K02;
                int K03222222222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                O02 = 8;
                int i92222222222222222 = O02 + K02;
                int K032222222222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                O02 = C0687k.M0((intValue2 >> 31) ^ (intValue2 << 1));
                int i922222222222222222 = O02 + K02;
                int K0322222222222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                O02 = C0687k.O0((longValue2 >> 63) ^ (longValue2 << 1));
                int i9222222222222222222 = O02 + K02;
                int K03222222222222222222 = C0687k.K0(2);
                n0Var = e7.f9109b;
                if (n0Var == m0Var) {
                }
                switch (n0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
