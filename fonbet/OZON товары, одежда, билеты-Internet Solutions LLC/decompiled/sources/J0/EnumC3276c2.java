package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: J0.c2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class EnumC3276c2 {
    private static final /* synthetic */ EnumC3276c2[] $VALUES;
    public static final EnumC3276c2 BottomBar;
    public static final EnumC3276c2 Fab;
    public static final EnumC3276c2 MainContent;
    public static final EnumC3276c2 Snackbar;
    public static final EnumC3276c2 TopBar;

    static {
        EnumC3276c2 enumC3276c2 = new EnumC3276c2("TopBar", 0);
        TopBar = enumC3276c2;
        EnumC3276c2 enumC3276c22 = new EnumC3276c2("MainContent", 1);
        MainContent = enumC3276c22;
        EnumC3276c2 enumC3276c23 = new EnumC3276c2("Snackbar", 2);
        Snackbar = enumC3276c23;
        EnumC3276c2 enumC3276c24 = new EnumC3276c2("Fab", 3);
        Fab = enumC3276c24;
        EnumC3276c2 enumC3276c25 = new EnumC3276c2("BottomBar", 4);
        BottomBar = enumC3276c25;
        $VALUES = new EnumC3276c2[]{enumC3276c2, enumC3276c22, enumC3276c23, enumC3276c24, enumC3276c25};
    }

    private EnumC3276c2() {
        throw null;
    }

    public static EnumC3276c2 valueOf(String str) {
        return (EnumC3276c2) Enum.valueOf(EnumC3276c2.class, str);
    }

    public static EnumC3276c2[] values() {
        return (EnumC3276c2[]) $VALUES.clone();
    }
}
