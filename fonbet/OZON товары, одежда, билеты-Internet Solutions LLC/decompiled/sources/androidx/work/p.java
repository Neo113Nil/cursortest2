package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p CONNECTED;
    public static final p METERED;
    public static final p NOT_REQUIRED;
    public static final p NOT_ROAMING;
    public static final p TEMPORARILY_UNMETERED;
    public static final p UNMETERED;

    static {
        p pVar = new p("NOT_REQUIRED", 0);
        NOT_REQUIRED = pVar;
        p pVar2 = new p("CONNECTED", 1);
        CONNECTED = pVar2;
        p pVar3 = new p("UNMETERED", 2);
        UNMETERED = pVar3;
        p pVar4 = new p("NOT_ROAMING", 3);
        NOT_ROAMING = pVar4;
        p pVar5 = new p("METERED", 4);
        METERED = pVar5;
        p pVar6 = new p("TEMPORARILY_UNMETERED", 5);
        TEMPORARILY_UNMETERED = pVar6;
        $VALUES = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
    }

    private p() {
        throw null;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
