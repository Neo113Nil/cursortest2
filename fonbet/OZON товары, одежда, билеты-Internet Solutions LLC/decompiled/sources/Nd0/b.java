package Nd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DEBUG;
    public static final b RELEASE;

    static {
        b bVar = new b("DEBUG", 0);
        DEBUG = bVar;
        b bVar2 = new b("RELEASE", 1);
        RELEASE = bVar2;
        b[] bVarArr = {bVar, bVar2};
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
