package G2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f449a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f450b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f451c;

    static {
        f fVar = new f("RELEASE", 0);
        f449a = fVar;
        f fVar2 = new f("LOOP", 1);
        f450b = fVar2;
        f451c = new f[]{fVar, fVar2, new f("STOP", 2)};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f451c.clone();
    }
}
