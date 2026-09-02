package s1;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static o f6648a;

    /* renamed from: b, reason: collision with root package name */
    public static long f6649b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6650c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static void a(o oVar) {
        if (oVar.f6646f != null || oVar.f6647g != null) {
            throw new IllegalArgumentException();
        }
        if (oVar.f6644d) {
            return;
        }
        synchronized (p.class) {
            try {
                long j2 = f6649b + 8192;
                if (j2 > 65536) {
                    return;
                }
                f6649b = j2;
                oVar.f6646f = f6648a;
                oVar.f6643c = 0;
                oVar.f6642b = 0;
                f6648a = oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static o b() {
        synchronized (p.class) {
            try {
                o oVar = f6648a;
                if (oVar == null) {
                    return new o();
                }
                f6648a = oVar.f6646f;
                oVar.f6646f = null;
                f6649b -= 8192;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
