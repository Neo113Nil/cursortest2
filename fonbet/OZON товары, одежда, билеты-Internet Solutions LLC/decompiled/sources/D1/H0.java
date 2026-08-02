package D1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H0 {
    private static final /* synthetic */ H0[] $VALUES;
    public static final H0 CancelTraversal;
    public static final H0 ContinueTraversal;
    public static final H0 SkipSubtreeAndContinueTraversal;

    static {
        H0 h02 = new H0("ContinueTraversal", 0);
        ContinueTraversal = h02;
        H0 h03 = new H0("SkipSubtreeAndContinueTraversal", 1);
        SkipSubtreeAndContinueTraversal = h03;
        H0 h04 = new H0("CancelTraversal", 2);
        CancelTraversal = h04;
        $VALUES = new H0[]{h02, h03, h04};
    }

    private H0() {
        throw null;
    }

    public static H0 valueOf(String str) {
        return (H0) Enum.valueOf(H0.class, str);
    }

    public static H0[] values() {
        return (H0[]) $VALUES.clone();
    }
}
