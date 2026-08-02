package G4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f2875a;

    /* renamed from: b, reason: collision with root package name */
    public static final B f2876b;

    /* renamed from: c, reason: collision with root package name */
    public static final B f2877c;

    /* renamed from: d, reason: collision with root package name */
    public static final B f2878d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ B[] f2879e;

    static {
        B b7 = new B("LISTEN", 0);
        f2875a = b7;
        B b8 = new B("EXISTENCE_FILTER_MISMATCH", 1);
        f2876b = b8;
        B b9 = new B("EXISTENCE_FILTER_MISMATCH_BLOOM", 2);
        f2877c = b9;
        B b10 = new B("LIMBO_RESOLUTION", 3);
        f2878d = b10;
        f2879e = new B[]{b7, b8, b9, b10};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f2879e.clone();
    }
}
