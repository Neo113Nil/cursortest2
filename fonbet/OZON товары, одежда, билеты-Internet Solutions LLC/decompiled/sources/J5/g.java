package J5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g LINEAR;
    public static final g RADIAL;

    static {
        g gVar = new g("LINEAR", 0);
        LINEAR = gVar;
        g gVar2 = new g("RADIAL", 1);
        RADIAL = gVar2;
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
