package androidx.compose.ui.platform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class U1 {
    private static final /* synthetic */ U1[] $VALUES;
    public static final U1 Hidden;
    public static final U1 Shown;

    static {
        U1 u12 = new U1("Shown", 0);
        Shown = u12;
        U1 u13 = new U1("Hidden", 1);
        Hidden = u13;
        $VALUES = new U1[]{u12, u13};
    }

    private U1() {
        throw null;
    }

    public static U1 valueOf(String str) {
        return (U1) Enum.valueOf(U1.class, str);
    }

    public static U1[] values() {
        return (U1[]) $VALUES.clone();
    }
}
