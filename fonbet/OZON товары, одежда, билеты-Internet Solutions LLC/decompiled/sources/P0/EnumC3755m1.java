package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: P0.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class EnumC3755m1 {
    private static final /* synthetic */ EnumC3755m1[] $VALUES;
    public static final EnumC3755m1 BottomBar;
    public static final EnumC3755m1 Fab;
    public static final EnumC3755m1 MainContent;
    public static final EnumC3755m1 Snackbar;
    public static final EnumC3755m1 TopBar;

    static {
        EnumC3755m1 enumC3755m1 = new EnumC3755m1("TopBar", 0);
        TopBar = enumC3755m1;
        EnumC3755m1 enumC3755m12 = new EnumC3755m1("MainContent", 1);
        MainContent = enumC3755m12;
        EnumC3755m1 enumC3755m13 = new EnumC3755m1("Snackbar", 2);
        Snackbar = enumC3755m13;
        EnumC3755m1 enumC3755m14 = new EnumC3755m1("Fab", 3);
        Fab = enumC3755m14;
        EnumC3755m1 enumC3755m15 = new EnumC3755m1("BottomBar", 4);
        BottomBar = enumC3755m15;
        $VALUES = new EnumC3755m1[]{enumC3755m1, enumC3755m12, enumC3755m13, enumC3755m14, enumC3755m15};
    }

    private EnumC3755m1() {
        throw null;
    }

    public static EnumC3755m1 valueOf(String str) {
        return (EnumC3755m1) Enum.valueOf(EnumC3755m1.class, str);
    }

    public static EnumC3755m1[] values() {
        return (EnumC3755m1[]) $VALUES.clone();
    }
}
