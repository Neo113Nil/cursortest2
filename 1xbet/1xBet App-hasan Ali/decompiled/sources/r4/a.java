package r4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f19106k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f19107l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f19108m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a[] f19109n;

    static {
        a aVar = new a("SUSPEND", 0);
        f19106k = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f19107l = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f19108m = aVar3;
        f19109n = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19109n.clone();
    }
}
