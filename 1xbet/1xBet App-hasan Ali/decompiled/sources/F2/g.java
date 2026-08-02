package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final g f1532k;

    /* renamed from: l, reason: collision with root package name */
    public static final g f1533l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g[] f1534m;

    static {
        g gVar = new g("FILL", 0);
        f1532k = gVar;
        g gVar2 = new g("FIT", 1);
        f1533l = gVar2;
        f1534m = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1534m.clone();
    }
}
