package A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: k, reason: collision with root package name */
    public static final n1 f542k;

    /* renamed from: l, reason: collision with root package name */
    public static final n1 f543l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ n1[] f544m;

    static {
        n1 n1Var = new n1("Shown", 0);
        f542k = n1Var;
        n1 n1Var2 = new n1("Hidden", 1);
        f543l = n1Var2;
        f544m = new n1[]{n1Var, n1Var2};
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f544m.clone();
    }
}
