package Yd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ERROR;
    public static final b HIDDEN;
    public static final b WARNING;

    static {
        b bVar = new b("WARNING", 0);
        WARNING = bVar;
        b bVar2 = new b("ERROR", 1);
        ERROR = bVar2;
        b bVar3 = new b("HIDDEN", 2);
        HIDDEN = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = Xc.b.a(bVarArr);
    }

    private b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
