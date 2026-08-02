package U5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f6507a;

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f6508b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i0[] f6509c;

    static {
        i0 i0Var = new i0("NONE", 0);
        f6507a = i0Var;
        i0 i0Var2 = new i0("INTEGRITY", 1);
        i0 i0Var3 = new i0("PRIVACY_AND_INTEGRITY", 2);
        f6508b = i0Var3;
        f6509c = new i0[]{i0Var, i0Var2, i0Var3};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f6509c.clone();
    }
}
