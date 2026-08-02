package Ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class D {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ D[] $VALUES;
    public static final D RENDER_OPEN;
    public static final D RENDER_OPEN_OVERRIDE;
    public static final D RENDER_OVERRIDE;

    static {
        D d11 = new D("RENDER_OVERRIDE", 0);
        RENDER_OVERRIDE = d11;
        D d12 = new D("RENDER_OPEN", 1);
        RENDER_OPEN = d12;
        D d13 = new D("RENDER_OPEN_OVERRIDE", 2);
        RENDER_OPEN_OVERRIDE = d13;
        D[] dArr = {d11, d12, d13};
        $VALUES = dArr;
        $ENTRIES = Xc.b.a(dArr);
    }

    private D() {
        throw null;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }
}
