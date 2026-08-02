package Gc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h BOUNDARY;
    public static final h END;
    public static final h IMMEDIATE;

    static {
        h hVar = new h("IMMEDIATE", 0);
        IMMEDIATE = hVar;
        h hVar2 = new h("BOUNDARY", 1);
        BOUNDARY = hVar2;
        h hVar3 = new h("END", 2);
        END = hVar3;
        $VALUES = new h[]{hVar, hVar2, hVar3};
    }

    private h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
