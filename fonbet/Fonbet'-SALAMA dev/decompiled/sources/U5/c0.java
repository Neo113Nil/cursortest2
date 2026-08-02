package U5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f6469a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f6470b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f6471c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c0[] f6472d;

    static {
        c0 c0Var = new c0("UNARY", 0);
        f6469a = c0Var;
        c0 c0Var2 = new c0("CLIENT_STREAMING", 1);
        c0 c0Var3 = new c0("SERVER_STREAMING", 2);
        f6470b = c0Var3;
        c0 c0Var4 = new c0("BIDI_STREAMING", 3);
        f6471c = c0Var4;
        f6472d = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, new c0("UNKNOWN", 4)};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f6472d.clone();
    }
}
