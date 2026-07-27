package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f2165a;

    public H(n0 n0Var, p0 p0Var, M.k kVar) {
        this.f2165a = new G(n0Var, p0Var, kVar);
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
    public static int a(G g3, Object obj, Object obj2) {
        int s02;
        int size;
        int r02;
        p0 p0Var;
        int size2;
        int r03;
        int i3 = 1;
        int i4 = r.f2274c;
        int q02 = C0138m.q0(1);
        o0 o0Var = r0.f2278d;
        n0 n0Var = g3.f2162a;
        if (n0Var == o0Var) {
            q02 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                s02 = 8;
                int i5 = s02 + q02;
                int q03 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                    q03 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i3 = 8;
                        return i3 + q03 + i5;
                    case 1:
                        ((Float) obj2).getClass();
                        i3 = 4;
                        return i3 + q03 + i5;
                    case 2:
                        i3 = C0138m.s0(((Long) obj2).longValue());
                        return i3 + q03 + i5;
                    case 3:
                        i3 = C0138m.s0(((Long) obj2).longValue());
                        return i3 + q03 + i5;
                    case 4:
                        i3 = C0138m.s0(((Integer) obj2).intValue());
                        return i3 + q03 + i5;
                    case 5:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        return i3 + q03 + i5;
                    case 6:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + q03 + i5;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i3 + q03 + i5;
                    case 8:
                        if (!(obj2 instanceof C0132g)) {
                            i3 = C0138m.p0((String) obj2);
                            return i3 + q03 + i5;
                        }
                        size2 = ((C0132g) obj2).size();
                        r03 = C0138m.r0(size2);
                        i3 = r03 + size2;
                        return i3 + q03 + i5;
                    case 9:
                        i3 = ((AbstractC0147w) ((AbstractC0126a) obj2)).a(null);
                        return i3 + q03 + i5;
                    case 10:
                        size2 = ((AbstractC0147w) ((AbstractC0126a) obj2)).a(null);
                        r03 = C0138m.r0(size2);
                        i3 = r03 + size2;
                        return i3 + q03 + i5;
                    case 11:
                        if (obj2 instanceof C0132g) {
                            size2 = ((C0132g) obj2).size();
                            r03 = C0138m.r0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            r03 = C0138m.r0(size2);
                        }
                        i3 = r03 + size2;
                        return i3 + q03 + i5;
                    case 12:
                        i3 = C0138m.r0(((Integer) obj2).intValue());
                        return i3 + q03 + i5;
                    case 13:
                        i3 = C0138m.s0(((Integer) obj2).intValue());
                        return i3 + q03 + i5;
                    case 14:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + q03 + i5;
                    case 15:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        return i3 + q03 + i5;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i3 = C0138m.r0((intValue >> 31) ^ (intValue << 1));
                        return i3 + q03 + i5;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i3 = C0138m.s0((longValue >> 63) ^ (longValue << 1));
                        return i3 + q03 + i5;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                s02 = 4;
                int i52 = s02 + q02;
                int q032 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 2:
                s02 = C0138m.s0(((Long) obj).longValue());
                int i522 = s02 + q02;
                int q0322 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 3:
                s02 = C0138m.s0(((Long) obj).longValue());
                int i5222 = s02 + q02;
                int q03222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 4:
                s02 = C0138m.s0(((Integer) obj).intValue());
                int i52222 = s02 + q02;
                int q032222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                s02 = 8;
                int i522222 = s02 + q02;
                int q0322222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                s02 = 4;
                int i5222222 = s02 + q02;
                int q03222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                s02 = 1;
                int i52222222 = s02 + q02;
                int q032222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 8:
                if (obj instanceof C0132g) {
                    size = ((C0132g) obj).size();
                    r02 = C0138m.r0(size);
                    s02 = size + r02;
                    int i522222222 = s02 + q02;
                    int q0322222222 = C0138m.q0(2);
                    p0Var = g3.f2163b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                } else {
                    s02 = C0138m.p0((String) obj);
                    int i5222222222 = s02 + q02;
                    int q03222222222 = C0138m.q0(2);
                    p0Var = g3.f2163b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                }
            case 9:
                s02 = ((AbstractC0147w) ((AbstractC0126a) obj)).a(null);
                int i52222222222 = s02 + q02;
                int q032222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0147w) ((AbstractC0126a) obj)).a(null);
                r02 = C0138m.r0(size);
                s02 = size + r02;
                int i522222222222 = s02 + q02;
                int q0322222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0132g) {
                    size = ((C0132g) obj).size();
                    r02 = C0138m.r0(size);
                } else {
                    size = ((byte[]) obj).length;
                    r02 = C0138m.r0(size);
                }
                s02 = size + r02;
                int i5222222222222 = s02 + q02;
                int q03222222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 12:
                s02 = C0138m.r0(((Integer) obj).intValue());
                int i52222222222222 = s02 + q02;
                int q032222222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 13:
                s02 = C0138m.s0(((Integer) obj).intValue());
                int i522222222222222 = s02 + q02;
                int q0322222222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                s02 = 4;
                int i5222222222222222 = s02 + q02;
                int q03222222222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                s02 = 8;
                int i52222222222222222 = s02 + q02;
                int q032222222222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                s02 = C0138m.r0((intValue2 >> 31) ^ (intValue2 << 1));
                int i522222222222222222 = s02 + q02;
                int q0322222222222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                s02 = C0138m.s0((longValue2 >> 63) ^ (longValue2 << 1));
                int i5222222222222222222 = s02 + q02;
                int q03222222222222222222 = C0138m.q0(2);
                p0Var = g3.f2163b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
