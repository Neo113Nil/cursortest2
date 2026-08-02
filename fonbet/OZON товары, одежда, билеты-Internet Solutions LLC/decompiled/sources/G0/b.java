package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b Delete;
    public static final b Insert;
    public static final b Replace;

    static {
        b bVar = new b("Insert", 0);
        Insert = bVar;
        b bVar2 = new b("Delete", 1);
        Delete = bVar2;
        b bVar3 = new b("Replace", 2);
        Replace = bVar3;
        $VALUES = new b[]{bVar, bVar2, bVar3};
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
