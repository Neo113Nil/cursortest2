package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class P {
    private static final /* synthetic */ P[] $VALUES;
    public static final P Cursor;
    public static final P None;
    public static final P Selection;

    static {
        P p11 = new P("None", 0);
        None = p11;
        P p12 = new P("Cursor", 1);
        Cursor = p12;
        P p13 = new P("Selection", 2);
        Selection = p13;
        $VALUES = new P[]{p11, p12, p13};
    }

    private P() {
        throw null;
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }
}
