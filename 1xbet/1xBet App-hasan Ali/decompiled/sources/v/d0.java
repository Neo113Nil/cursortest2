package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: k, reason: collision with root package name */
    public static final d0 f20222k;

    /* renamed from: l, reason: collision with root package name */
    public static final d0 f20223l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d0[] f20224m;

    static {
        d0 d0Var = new d0("Default", 0);
        f20222k = d0Var;
        d0 d0Var2 = new d0("UserInput", 1);
        f20223l = d0Var2;
        f20224m = new d0[]{d0Var, d0Var2, new d0("PreventUserInput", 2)};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f20224m.clone();
    }
}
