package l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0927a {

    /* renamed from: a, reason: collision with root package name */
    public static final l1.EnumC0927a f8017a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l1.EnumC0927a[] f8018b;

    static {
        l1.EnumC0927a enumC0927a = new l1.EnumC0927a("COROUTINE_SUSPENDED", 0);
        f8017a = enumC0927a;
        f8018b = new l1.EnumC0927a[]{enumC0927a, new l1.EnumC0927a("UNDECIDED", 1), new l1.EnumC0927a("RESUMED", 2)};
    }

    public static l1.EnumC0927a valueOf(java.lang.String str) {
        return (l1.EnumC0927a) java.lang.Enum.valueOf(l1.EnumC0927a.class, str);
    }

    public static l1.EnumC0927a[] values() {
        return (l1.EnumC0927a[]) f8018b.clone();
    }
}
