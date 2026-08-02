package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Eh {

    /* renamed from: a, reason: collision with root package name */
    public static final Eh f28933a;

    /* renamed from: b, reason: collision with root package name */
    public static final Eh f28934b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Eh[] f28935c;

    static {
        Eh eh2 = new Eh("ONE_CARD", 0);
        f28933a = eh2;
        Eh eh3 = new Eh("SEVERAL_CARDS", 1);
        f28934b = eh3;
        f28935c = new Eh[]{eh2, eh3};
    }

    public static Eh valueOf(String str) {
        return (Eh) Enum.valueOf(Eh.class, str);
    }

    public static Eh[] values() {
        return (Eh[]) f28935c.clone();
    }
}
