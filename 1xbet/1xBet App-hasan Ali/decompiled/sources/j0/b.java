package j0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f17407a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f17408b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f17409c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f17410d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17411e = 0;

    static {
        long j5 = 3;
        long j6 = j5 << 32;
        f17407a = (0 & 4294967295L) | j6;
        f17408b = (1 & 4294967295L) | j6;
        f17409c = j6 | (2 & 4294967295L);
        f17410d = (j5 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static String b(long j5) {
        return a(j5, f17407a) ? "Rgb" : a(j5, f17408b) ? "Xyz" : a(j5, f17409c) ? "Lab" : a(j5, f17410d) ? "Cmyk" : "Unknown";
    }
}
