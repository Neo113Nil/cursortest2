package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final e f20402k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f20403l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f20404m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f20405n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ e[] f20406o;

    static {
        e eVar = new e("MEMORY_CACHE", 0);
        f20402k = eVar;
        e eVar2 = new e("MEMORY", 1);
        f20403l = eVar2;
        e eVar3 = new e("DISK", 2);
        f20404m = eVar3;
        e eVar4 = new e("NETWORK", 3);
        f20405n = eVar4;
        f20406o = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f20406o.clone();
    }
}
