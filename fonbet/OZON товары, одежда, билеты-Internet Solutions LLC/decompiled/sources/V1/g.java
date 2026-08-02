package V1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g Ltr;
    public static final g Rtl;

    static {
        g gVar = new g("Ltr", 0);
        Ltr = gVar;
        g gVar2 = new g("Rtl", 1);
        Rtl = gVar2;
        $VALUES = new g[]{gVar, gVar2};
    }

    private g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
