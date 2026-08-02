package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Ea implements Bk {

    /* renamed from: a, reason: collision with root package name */
    public static final Ea f28917a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Ea[] f28918b;

    static {
        Ea ea = new Ea("IS_NOT_DEPRECATED", 0);
        f28917a = ea;
        f28918b = new Ea[]{ea, new Ea("GET_ACTUAL_SDK_VERSION", 1)};
    }

    public static Ea valueOf(String str) {
        return (Ea) Enum.valueOf(Ea.class, str);
    }

    public static Ea[] values() {
        return (Ea[]) f28918b.clone();
    }
}
