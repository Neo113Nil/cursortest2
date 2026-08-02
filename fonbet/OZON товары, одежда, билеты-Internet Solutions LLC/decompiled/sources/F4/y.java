package F4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y APPEND;
    public static final y PREPEND;
    public static final y REFRESH;

    static {
        y yVar = new y("REFRESH", 0);
        REFRESH = yVar;
        y yVar2 = new y("PREPEND", 1);
        PREPEND = yVar2;
        y yVar3 = new y("APPEND", 2);
        APPEND = yVar3;
        $VALUES = new y[]{yVar, yVar2, yVar3};
    }

    private y() {
        throw null;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
