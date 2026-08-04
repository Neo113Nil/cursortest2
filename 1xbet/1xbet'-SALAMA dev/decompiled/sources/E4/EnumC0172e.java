package E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: E4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0172e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0172e f2174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0172e f2175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0172e f2176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0172e f2177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0172e[] f2178e;

    static {
        EnumC0172e enumC0172e = new EnumC0172e("REMOVED", 0);
        f2174a = enumC0172e;
        EnumC0172e enumC0172e2 = new EnumC0172e("ADDED", 1);
        f2175b = enumC0172e2;
        EnumC0172e enumC0172e3 = new EnumC0172e("MODIFIED", 2);
        f2176c = enumC0172e3;
        EnumC0172e enumC0172e4 = new EnumC0172e("METADATA", 3);
        f2177d = enumC0172e4;
        f2178e = new EnumC0172e[]{enumC0172e, enumC0172e2, enumC0172e3, enumC0172e4};
    }

    public static EnumC0172e valueOf(String str) {
        return (EnumC0172e) Enum.valueOf(EnumC0172e.class, str);
    }

    public static EnumC0172e[] values() {
        return (EnumC0172e[]) f2178e.clone();
    }
}
