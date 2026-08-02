package K4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f3977a;

    /* renamed from: b, reason: collision with root package name */
    public static final F f3978b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f3979c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f3980d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f3981e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F[] f3982f;

    static {
        F f7 = new F("NoChange", 0);
        f3977a = f7;
        F f8 = new F("Added", 1);
        f3978b = f8;
        F f9 = new F("Removed", 2);
        f3979c = f9;
        F f10 = new F("Current", 3);
        f3980d = f10;
        F f11 = new F("Reset", 4);
        f3981e = f11;
        f3982f = new F[]{f7, f8, f9, f10, f11};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f3982f.clone();
    }
}
