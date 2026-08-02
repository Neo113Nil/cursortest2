package bc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5642a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC5642a[] $VALUES;
    public static final EnumC5642a Dialog;
    public static final EnumC5642a FullScreen;
    public static final EnumC5642a Hidden;

    static {
        EnumC5642a enumC5642a = new EnumC5642a("Hidden", 0);
        Hidden = enumC5642a;
        EnumC5642a enumC5642a2 = new EnumC5642a("FullScreen", 1);
        FullScreen = enumC5642a2;
        EnumC5642a enumC5642a3 = new EnumC5642a("Dialog", 2);
        Dialog = enumC5642a3;
        EnumC5642a[] enumC5642aArr = {enumC5642a, enumC5642a2, enumC5642a3};
        $VALUES = enumC5642aArr;
        $ENTRIES = Xc.b.a(enumC5642aArr);
    }

    private EnumC5642a() {
        throw null;
    }

    public static EnumC5642a valueOf(String str) {
        return (EnumC5642a) Enum.valueOf(EnumC5642a.class, str);
    }

    public static EnumC5642a[] values() {
        return (EnumC5642a[]) $VALUES.clone();
    }
}
