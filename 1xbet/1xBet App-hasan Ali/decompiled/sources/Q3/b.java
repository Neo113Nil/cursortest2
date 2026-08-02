package Q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f5074k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f5075l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f5076m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b[] f5077n;

    static {
        b bVar = new b("Checking", 0);
        f5074k = bVar;
        b bVar2 = new b("Live", 1);
        f5075l = bVar2;
        b bVar3 = new b("Broken", 2);
        f5076m = bVar3;
        f5077n = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5077n.clone();
    }
}
