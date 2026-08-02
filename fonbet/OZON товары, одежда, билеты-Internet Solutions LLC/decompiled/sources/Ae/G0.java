package Ae;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class G0 {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ G0[] $VALUES;
    public static final G0 START;
    public static final G0 STOP;
    public static final G0 STOP_AND_RESET_REPLAY_CACHE;

    static {
        G0 g02 = new G0("START", 0);
        START = g02;
        G0 g03 = new G0("STOP", 1);
        STOP = g03;
        G0 g04 = new G0("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = g04;
        G0[] g0Arr = {g02, g03, g04};
        $VALUES = g0Arr;
        $ENTRIES = Xc.b.a(g0Arr);
    }

    private G0() {
        throw null;
    }

    public static G0 valueOf(String str) {
        return (G0) Enum.valueOf(G0.class, str);
    }

    public static G0[] values() {
        return (G0[]) $VALUES.clone();
    }
}
