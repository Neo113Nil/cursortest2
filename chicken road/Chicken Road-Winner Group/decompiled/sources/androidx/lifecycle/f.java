package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2303a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f2304b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f2305c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f2306d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f2307e;
    public static final /* synthetic */ f[] f;

    static {
        f fVar = new f("DESTROYED", 0);
        f2303a = fVar;
        f fVar2 = new f("INITIALIZED", 1);
        f2304b = fVar2;
        f fVar3 = new f("CREATED", 2);
        f2305c = fVar3;
        f fVar4 = new f("STARTED", 3);
        f2306d = fVar4;
        f fVar5 = new f("RESUMED", 4);
        f2307e = fVar5;
        f = new f[]{fVar, fVar2, fVar3, fVar4, fVar5};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f.clone();
    }
}
