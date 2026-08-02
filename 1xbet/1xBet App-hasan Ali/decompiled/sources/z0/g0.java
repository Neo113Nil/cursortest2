package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f21818k;

    /* renamed from: l, reason: collision with root package name */
    public static final g0 f21819l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g0[] f21820m;

    static {
        g0 g0Var = new g0("Min", 0);
        f21818k = g0Var;
        g0 g0Var2 = new g0("Max", 1);
        f21819l = g0Var2;
        f21820m = new g0[]{g0Var, g0Var2};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f21820m.clone();
    }
}
