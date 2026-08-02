package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g APPEND;
    public static final g APPEND_OR_REPLACE;
    public static final g KEEP;
    public static final g REPLACE;

    static {
        g gVar = new g("REPLACE", 0);
        REPLACE = gVar;
        g gVar2 = new g("KEEP", 1);
        KEEP = gVar2;
        g gVar3 = new g("APPEND", 2);
        APPEND = gVar3;
        g gVar4 = new g("APPEND_OR_REPLACE", 3);
        APPEND_OR_REPLACE = gVar4;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4};
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
