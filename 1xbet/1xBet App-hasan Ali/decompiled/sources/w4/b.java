package w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f20542k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f20543l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f20544m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f20545n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f20546o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b[] f20547p;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f20542k = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f20543l = bVar2;
        b bVar3 = new b("PARKING", 2);
        f20544m = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f20545n = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f20546o = bVar5;
        f20547p = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20547p.clone();
    }
}
