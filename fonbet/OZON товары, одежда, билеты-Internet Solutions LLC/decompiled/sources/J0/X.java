package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class X {
    private static final /* synthetic */ X[] $VALUES;
    public static final X Closed;
    public static final X Open;

    static {
        X x11 = new X("Closed", 0);
        Closed = x11;
        X x12 = new X("Open", 1);
        Open = x12;
        $VALUES = new X[]{x11, x12};
    }

    private X() {
        throw null;
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) $VALUES.clone();
    }
}
