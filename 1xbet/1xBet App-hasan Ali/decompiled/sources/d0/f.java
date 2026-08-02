package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final f f16851k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f16852l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f[] f16853m;

    static {
        f fVar = new f("VIEW_APPEAR", 0);
        f16851k = fVar;
        f fVar2 = new f("VIEW_DISAPPEAR", 1);
        f16852l = fVar2;
        f16853m = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f16853m.clone();
    }
}
