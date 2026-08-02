package E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: k, reason: collision with root package name */
    public static final N f1060k;

    /* renamed from: l, reason: collision with root package name */
    public static final N f1061l;

    /* renamed from: m, reason: collision with root package name */
    public static final N f1062m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ N[] f1063n;

    static {
        N n5 = new N("Cursor", 0);
        f1060k = n5;
        N n6 = new N("SelectionStart", 1);
        f1061l = n6;
        N n7 = new N("SelectionEnd", 2);
        f1062m = n7;
        f1063n = new N[]{n5, n6, n7};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f1063n.clone();
    }
}
