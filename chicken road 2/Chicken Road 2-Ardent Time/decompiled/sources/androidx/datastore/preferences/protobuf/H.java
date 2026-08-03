package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.G f2233a;

    public H(androidx.datastore.preferences.protobuf.n0 n0Var, androidx.datastore.preferences.protobuf.p0 p0Var, H.k kVar) {
        this.f2233a = new androidx.datastore.preferences.protobuf.G(n0Var, p0Var, kVar);
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
    public static int a(androidx.datastore.preferences.protobuf.G g2, java.lang.Object obj, java.lang.Object obj2) {
        int d02;
        int size;
        int b02;
        androidx.datastore.preferences.protobuf.p0 p0Var;
        int size2;
        int b03;
        int i2 = 1;
        int i3 = androidx.datastore.preferences.protobuf.r.f2348c;
        int Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(1);
        androidx.datastore.preferences.protobuf.o0 o0Var = androidx.datastore.preferences.protobuf.r0.f2352d;
        androidx.datastore.preferences.protobuf.n0 n0Var = g2.f2230a;
        if (n0Var == o0Var) {
            Z2 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((java.lang.Double) obj).getClass();
                d02 = 8;
                int i4 = d02 + Z2;
                int Z3 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                    Z3 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((java.lang.Double) obj2).getClass();
                        i2 = 8;
                        return i2 + Z3 + i4;
                    case 1:
                        ((java.lang.Float) obj2).getClass();
                        i2 = 4;
                        return i2 + Z3 + i4;
                    case 2:
                        i2 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) obj2).longValue());
                        return i2 + Z3 + i4;
                    case 3:
                        i2 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) obj2).longValue());
                        return i2 + Z3 + i4;
                    case 4:
                        i2 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) obj2).intValue());
                        return i2 + Z3 + i4;
                    case 5:
                        ((java.lang.Long) obj2).getClass();
                        i2 = 8;
                        return i2 + Z3 + i4;
                    case 6:
                        ((java.lang.Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + Z3 + i4;
                    case 7:
                        ((java.lang.Boolean) obj2).getClass();
                        return i2 + Z3 + i4;
                    case 8:
                        if (!(obj2 instanceof androidx.datastore.preferences.protobuf.C0071g)) {
                            i2 = androidx.datastore.preferences.protobuf.C0077m.Y((java.lang.String) obj2);
                            return i2 + Z3 + i4;
                        }
                        size2 = ((androidx.datastore.preferences.protobuf.C0071g) obj2).size();
                        b03 = androidx.datastore.preferences.protobuf.C0077m.b0(size2);
                        i2 = b03 + size2;
                        return i2 + Z3 + i4;
                    case 9:
                        i2 = ((androidx.datastore.preferences.protobuf.AbstractC0086w) ((androidx.datastore.preferences.protobuf.AbstractC0065a) obj2)).a(null);
                        return i2 + Z3 + i4;
                    case 10:
                        size2 = ((androidx.datastore.preferences.protobuf.AbstractC0086w) ((androidx.datastore.preferences.protobuf.AbstractC0065a) obj2)).a(null);
                        b03 = androidx.datastore.preferences.protobuf.C0077m.b0(size2);
                        i2 = b03 + size2;
                        return i2 + Z3 + i4;
                    case 11:
                        if (obj2 instanceof androidx.datastore.preferences.protobuf.C0071g) {
                            size2 = ((androidx.datastore.preferences.protobuf.C0071g) obj2).size();
                            b03 = androidx.datastore.preferences.protobuf.C0077m.b0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            b03 = androidx.datastore.preferences.protobuf.C0077m.b0(size2);
                        }
                        i2 = b03 + size2;
                        return i2 + Z3 + i4;
                    case 12:
                        i2 = androidx.datastore.preferences.protobuf.C0077m.b0(((java.lang.Integer) obj2).intValue());
                        return i2 + Z3 + i4;
                    case 13:
                        i2 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) obj2).intValue());
                        return i2 + Z3 + i4;
                    case 14:
                        ((java.lang.Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + Z3 + i4;
                    case 15:
                        ((java.lang.Long) obj2).getClass();
                        i2 = 8;
                        return i2 + Z3 + i4;
                    case 16:
                        int intValue = ((java.lang.Integer) obj2).intValue();
                        i2 = androidx.datastore.preferences.protobuf.C0077m.b0((intValue >> 31) ^ (intValue << 1));
                        return i2 + Z3 + i4;
                    case 17:
                        long longValue = ((java.lang.Long) obj2).longValue();
                        i2 = androidx.datastore.preferences.protobuf.C0077m.d0((longValue >> 63) ^ (longValue << 1));
                        return i2 + Z3 + i4;
                    default:
                        throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((java.lang.Float) obj).getClass();
                d02 = 4;
                int i42 = d02 + Z2;
                int Z32 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 2:
                d02 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) obj).longValue());
                int i422 = d02 + Z2;
                int Z322 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 3:
                d02 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) obj).longValue());
                int i4222 = d02 + Z2;
                int Z3222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 4:
                d02 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) obj).intValue());
                int i42222 = d02 + Z2;
                int Z32222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 5:
                ((java.lang.Long) obj).getClass();
                d02 = 8;
                int i422222 = d02 + Z2;
                int Z322222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 6:
                ((java.lang.Integer) obj).getClass();
                d02 = 4;
                int i4222222 = d02 + Z2;
                int Z3222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 7:
                ((java.lang.Boolean) obj).getClass();
                d02 = 1;
                int i42222222 = d02 + Z2;
                int Z32222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 8:
                if (obj instanceof androidx.datastore.preferences.protobuf.C0071g) {
                    size = ((androidx.datastore.preferences.protobuf.C0071g) obj).size();
                    b02 = androidx.datastore.preferences.protobuf.C0077m.b0(size);
                    d02 = size + b02;
                    int i422222222 = d02 + Z2;
                    int Z322222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                    p0Var = g2.f2231b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                } else {
                    d02 = androidx.datastore.preferences.protobuf.C0077m.Y((java.lang.String) obj);
                    int i4222222222 = d02 + Z2;
                    int Z3222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                    p0Var = g2.f2231b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                }
            case 9:
                d02 = ((androidx.datastore.preferences.protobuf.AbstractC0086w) ((androidx.datastore.preferences.protobuf.AbstractC0065a) obj)).a(null);
                int i42222222222 = d02 + Z2;
                int Z32222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 10:
                size = ((androidx.datastore.preferences.protobuf.AbstractC0086w) ((androidx.datastore.preferences.protobuf.AbstractC0065a) obj)).a(null);
                b02 = androidx.datastore.preferences.protobuf.C0077m.b0(size);
                d02 = size + b02;
                int i422222222222 = d02 + Z2;
                int Z322222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof androidx.datastore.preferences.protobuf.C0071g) {
                    size = ((androidx.datastore.preferences.protobuf.C0071g) obj).size();
                    b02 = androidx.datastore.preferences.protobuf.C0077m.b0(size);
                } else {
                    size = ((byte[]) obj).length;
                    b02 = androidx.datastore.preferences.protobuf.C0077m.b0(size);
                }
                d02 = size + b02;
                int i4222222222222 = d02 + Z2;
                int Z3222222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 12:
                d02 = androidx.datastore.preferences.protobuf.C0077m.b0(((java.lang.Integer) obj).intValue());
                int i42222222222222 = d02 + Z2;
                int Z32222222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 13:
                d02 = androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) obj).intValue());
                int i422222222222222 = d02 + Z2;
                int Z322222222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 14:
                ((java.lang.Integer) obj).getClass();
                d02 = 4;
                int i4222222222222222 = d02 + Z2;
                int Z3222222222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 15:
                ((java.lang.Long) obj).getClass();
                d02 = 8;
                int i42222222222222222 = d02 + Z2;
                int Z32222222222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((java.lang.Integer) obj).intValue();
                d02 = androidx.datastore.preferences.protobuf.C0077m.b0((intValue2 >> 31) ^ (intValue2 << 1));
                int i422222222222222222 = d02 + Z2;
                int Z322222222222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((java.lang.Long) obj).longValue();
                d02 = androidx.datastore.preferences.protobuf.C0077m.d0((longValue2 >> 63) ^ (longValue2 << 1));
                int i4222222222222222222 = d02 + Z2;
                int Z3222222222222222222 = androidx.datastore.preferences.protobuf.C0077m.Z(2);
                p0Var = g2.f2231b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
