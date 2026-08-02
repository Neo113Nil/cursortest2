package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1402m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1402m f14953a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1402m f14954b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1402m f14955c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1402m f14956d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1402m f14957e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1402m[] f14958f;

    static {
        EnumC1402m enumC1402m = new EnumC1402m("Disconnected", 0);
        f14953a = enumC1402m;
        EnumC1402m enumC1402m2 = new EnumC1402m("GettingToken", 1);
        f14954b = enumC1402m2;
        EnumC1402m enumC1402m3 = new EnumC1402m("Connecting", 2);
        f14955c = enumC1402m3;
        EnumC1402m enumC1402m4 = new EnumC1402m("Authenticating", 3);
        f14956d = enumC1402m4;
        EnumC1402m enumC1402m5 = new EnumC1402m("Connected", 4);
        f14957e = enumC1402m5;
        f14958f = new EnumC1402m[]{enumC1402m, enumC1402m2, enumC1402m3, enumC1402m4, enumC1402m5};
    }

    public static EnumC1402m valueOf(String str) {
        return (EnumC1402m) Enum.valueOf(EnumC1402m.class, str);
    }

    public static EnumC1402m[] values() {
        return (EnumC1402m[]) f14958f.clone();
    }
}
