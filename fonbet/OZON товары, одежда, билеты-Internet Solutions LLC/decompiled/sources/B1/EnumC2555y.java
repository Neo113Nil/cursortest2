package B1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2555y {
    private static final /* synthetic */ EnumC2555y[] $VALUES;
    public static final EnumC2555y Height;
    public static final EnumC2555y Width;

    static {
        EnumC2555y enumC2555y = new EnumC2555y("Width", 0);
        Width = enumC2555y;
        EnumC2555y enumC2555y2 = new EnumC2555y("Height", 1);
        Height = enumC2555y2;
        $VALUES = new EnumC2555y[]{enumC2555y, enumC2555y2};
    }

    private EnumC2555y() {
        throw null;
    }

    public static EnumC2555y valueOf(String str) {
        return (EnumC2555y) Enum.valueOf(EnumC2555y.class, str);
    }

    public static EnumC2555y[] values() {
        return (EnumC2555y[]) $VALUES.clone();
    }
}
