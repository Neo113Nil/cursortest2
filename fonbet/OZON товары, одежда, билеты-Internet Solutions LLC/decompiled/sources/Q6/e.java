package Q6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e DEFAULT;
    public static final e HIGHEST;
    public static final e VERY_LOW;

    static {
        e eVar = new e("DEFAULT", 0);
        DEFAULT = eVar;
        e eVar2 = new e("VERY_LOW", 1);
        VERY_LOW = eVar2;
        e eVar3 = new e("HIGHEST", 2);
        HIGHEST = eVar3;
        $VALUES = new e[]{eVar, eVar2, eVar3};
    }

    private e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
