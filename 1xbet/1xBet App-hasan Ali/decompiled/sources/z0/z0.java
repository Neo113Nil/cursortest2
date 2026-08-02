package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: k, reason: collision with root package name */
    public static final z0 f21876k;

    /* renamed from: l, reason: collision with root package name */
    public static final z0 f21877l;

    /* renamed from: m, reason: collision with root package name */
    public static final z0 f21878m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ z0[] f21879n;

    static {
        z0 z0Var = new z0("ContinueTraversal", 0);
        f21876k = z0Var;
        z0 z0Var2 = new z0("SkipSubtreeAndContinueTraversal", 1);
        f21877l = z0Var2;
        z0 z0Var3 = new z0("CancelTraversal", 2);
        f21878m = z0Var3;
        f21879n = new z0[]{z0Var, z0Var2, z0Var3};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f21879n.clone();
    }
}
