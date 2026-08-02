package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1906a {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1906a f16825k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1906a f16826l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1906a[] f16827m;

    static {
        EnumC1906a enumC1906a = new EnumC1906a("SHOW_ORIGINAL", 0);
        f16825k = enumC1906a;
        EnumC1906a enumC1906a2 = new EnumC1906a("SHOW_TRANSLATED", 1);
        f16826l = enumC1906a2;
        f16827m = new EnumC1906a[]{enumC1906a, enumC1906a2};
    }

    public static EnumC1906a valueOf(String str) {
        return (EnumC1906a) Enum.valueOf(EnumC1906a.class, str);
    }

    public static EnumC1906a[] values() {
        return (EnumC1906a[]) f16827m.clone();
    }
}
