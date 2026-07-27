package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0326a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0326a f4994a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0326a[] f4995b;

    static {
        EnumC0326a enumC0326a = new EnumC0326a("COROUTINE_SUSPENDED", 0);
        f4994a = enumC0326a;
        f4995b = new EnumC0326a[]{enumC0326a, new EnumC0326a("UNDECIDED", 1), new EnumC0326a("RESUMED", 2)};
    }

    public static EnumC0326a valueOf(String str) {
        return (EnumC0326a) Enum.valueOf(EnumC0326a.class, str);
    }

    public static EnumC0326a[] values() {
        return (EnumC0326a[]) f4995b.clone();
    }
}
