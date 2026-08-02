package Z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s Ltr;
    public static final s Rtl;

    static {
        s sVar = new s("Ltr", 0);
        Ltr = sVar;
        s sVar2 = new s("Rtl", 1);
        Rtl = sVar2;
        $VALUES = new s[]{sVar, sVar2};
    }

    private s() {
        throw null;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
