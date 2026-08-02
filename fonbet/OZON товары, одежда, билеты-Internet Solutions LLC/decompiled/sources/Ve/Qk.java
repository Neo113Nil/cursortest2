package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Qk implements Bk {

    /* renamed from: a, reason: collision with root package name */
    public static final Qk f29793a;

    /* renamed from: b, reason: collision with root package name */
    public static final Qk f29794b;

    /* renamed from: c, reason: collision with root package name */
    public static final Qk f29795c;

    /* renamed from: d, reason: collision with root package name */
    public static final Qk f29796d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Qk[] f29797e;

    static {
        Qk qk2 = new Qk("S_BONUSES_V1", 0);
        f29793a = qk2;
        Qk qk3 = new Qk("S_BONUSES_V2", 1);
        f29794b = qk3;
        Qk qk4 = new Qk("BOTH", 2);
        f29795c = qk4;
        Qk qk5 = new Qk("ONE_OF", 3);
        f29796d = qk5;
        f29797e = new Qk[]{qk2, qk3, qk4, qk5};
    }

    public static Qk valueOf(String str) {
        return (Qk) Enum.valueOf(Qk.class, str);
    }

    public static Qk[] values() {
        return (Qk[]) f29797e.clone();
    }
}
