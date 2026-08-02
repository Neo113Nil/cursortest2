package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f Focused;
    public static final f UnfocusedEmpty;
    public static final f UnfocusedNotEmpty;

    static {
        f fVar = new f("Focused", 0);
        Focused = fVar;
        f fVar2 = new f("UnfocusedEmpty", 1);
        UnfocusedEmpty = fVar2;
        f fVar3 = new f("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
    }

    private f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
