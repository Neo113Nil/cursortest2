package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f21826k;

    /* renamed from: l, reason: collision with root package name */
    public static final h0 f21827l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h0[] f21828m;

    static {
        h0 h0Var = new h0("Width", 0);
        f21826k = h0Var;
        h0 h0Var2 = new h0("Height", 1);
        f21827l = h0Var2;
        f21828m = new h0[]{h0Var, h0Var2};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f21828m.clone();
    }
}
