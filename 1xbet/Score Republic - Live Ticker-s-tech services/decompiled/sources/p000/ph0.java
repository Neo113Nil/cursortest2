package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 {
    private static final /* synthetic */ ph0[] $VALUES;
    public static final nh0 Companion;
    public static final ph0 ON_ANY;
    public static final ph0 ON_CREATE;
    public static final ph0 ON_DESTROY;
    public static final ph0 ON_PAUSE;
    public static final ph0 ON_RESUME;
    public static final ph0 ON_START;
    public static final ph0 ON_STOP;

    static {
        ph0 ph0Var = new ph0("ON_CREATE", 0);
        ON_CREATE = ph0Var;
        ph0 ph0Var2 = new ph0("ON_START", 1);
        ON_START = ph0Var2;
        ph0 ph0Var3 = new ph0("ON_RESUME", 2);
        ON_RESUME = ph0Var3;
        ph0 ph0Var4 = new ph0("ON_PAUSE", 3);
        ON_PAUSE = ph0Var4;
        ph0 ph0Var5 = new ph0("ON_STOP", 4);
        ON_STOP = ph0Var5;
        ph0 ph0Var6 = new ph0("ON_DESTROY", 5);
        ON_DESTROY = ph0Var6;
        ph0 ph0Var7 = new ph0("ON_ANY", 6);
        ON_ANY = ph0Var7;
        $VALUES = new ph0[]{ph0Var, ph0Var2, ph0Var3, ph0Var4, ph0Var5, ph0Var6, ph0Var7};
        Companion = new nh0();
    }

    public static ph0 valueOf(String str) {
        return (ph0) Enum.valueOf(ph0.class, str);
    }

    public static ph0[] values() {
        return (ph0[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final qh0 m3918a() {
        switch (oh0.f5736a[ordinal()]) {
            case 1:
            case 2:
                return qh0.f6499l;
            case 3:
            case 4:
                return qh0.f6500m;
            case 5:
                return qh0.f6501n;
            case 6:
                return qh0.f6497j;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
