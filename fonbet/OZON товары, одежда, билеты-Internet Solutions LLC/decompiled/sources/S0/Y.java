package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Y {
    private static final /* synthetic */ Y[] $VALUES;
    public static final Y DEFERRED;
    public static final Y IGNORED;
    public static final Y IMMINENT;
    public static final Y SCHEDULED;

    static {
        Y y11 = new Y("IGNORED", 0);
        IGNORED = y11;
        Y y12 = new Y("SCHEDULED", 1);
        SCHEDULED = y12;
        Y y13 = new Y("DEFERRED", 2);
        DEFERRED = y13;
        Y y14 = new Y("IMMINENT", 3);
        IMMINENT = y14;
        $VALUES = new Y[]{y11, y12, y13, y14};
    }

    private Y() {
        throw null;
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) $VALUES.clone();
    }
}
