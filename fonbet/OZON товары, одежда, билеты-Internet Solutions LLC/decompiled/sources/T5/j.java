package T5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j DISPLAY_P3;
    public static final j SRGB;

    static {
        j jVar = new j("SRGB", 0);
        SRGB = jVar;
        j jVar2 = new j("DISPLAY_P3", 1);
        DISPLAY_P3 = jVar2;
        $VALUES = new j[]{jVar, jVar2};
    }

    private j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
