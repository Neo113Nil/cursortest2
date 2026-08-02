package O3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f4046k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f4047l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f4048m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a[] f4049n;

    static {
        a aVar = new a("PARTNER", 0);
        f4046k = aVar;
        a aVar2 = new a("ADX", 1);
        f4047l = aVar2;
        a aVar3 = new a("STANDARD", 2);
        f4048m = aVar3;
        f4049n = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4049n.clone();
    }
}
