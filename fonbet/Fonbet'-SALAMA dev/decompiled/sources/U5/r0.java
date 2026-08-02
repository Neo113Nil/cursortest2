package U5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f6582a;

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f6583b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r0[] f6584c;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF0;

    static {
        r0 r0Var = new r0("FAKE", 0);
        r0 r0Var2 = new r0("MTLS", 1);
        f6582a = r0Var2;
        r0 r0Var3 = new r0("CUSTOM_MANAGERS", 2);
        f6583b = r0Var3;
        f6584c = new r0[]{r0Var, r0Var2, r0Var3};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f6584c.clone();
    }
}
