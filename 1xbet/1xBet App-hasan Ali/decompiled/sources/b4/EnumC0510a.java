package b4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0510a {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0510a f7289k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0510a f7290l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0510a f7291m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0510a[] f7292n;

    static {
        EnumC0510a enumC0510a = new EnumC0510a("COROUTINE_SUSPENDED", 0);
        f7289k = enumC0510a;
        EnumC0510a enumC0510a2 = new EnumC0510a("UNDECIDED", 1);
        f7290l = enumC0510a2;
        EnumC0510a enumC0510a3 = new EnumC0510a("RESUMED", 2);
        f7291m = enumC0510a3;
        f7292n = new EnumC0510a[]{enumC0510a, enumC0510a2, enumC0510a3};
    }

    public static EnumC0510a valueOf(String str) {
        return (EnumC0510a) Enum.valueOf(EnumC0510a.class, str);
    }

    public static EnumC0510a[] values() {
        return (EnumC0510a[]) f7292n.clone();
    }
}
