package Sd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class k {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k AFTER_DOT;
    public static final k BEGINNING;
    public static final k MIDDLE;

    static {
        k kVar = new k("BEGINNING", 0);
        BEGINNING = kVar;
        k kVar2 = new k("MIDDLE", 1);
        MIDDLE = kVar2;
        k kVar3 = new k("AFTER_DOT", 2);
        AFTER_DOT = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = Xc.b.a(kVarArr);
    }

    private k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
