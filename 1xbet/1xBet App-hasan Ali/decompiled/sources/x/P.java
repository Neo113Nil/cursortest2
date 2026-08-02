package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: k, reason: collision with root package name */
    public static final P f20695k;

    /* renamed from: l, reason: collision with root package name */
    public static final P f20696l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ P[] f20697m;

    static {
        P p5 = new P("Vertical", 0);
        f20695k = p5;
        P p6 = new P("Horizontal", 1);
        f20696l = p6;
        f20697m = new P[]{p5, p6};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f20697m.clone();
    }
}
