package W3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final f f6034k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ f[] f6035l;

    /* JADX INFO: Fake field, exist only in values array */
    f EF3;

    static {
        f fVar = new f("SYNCHRONIZED", 0);
        f fVar2 = new f("PUBLICATION", 1);
        f fVar3 = new f("NONE", 2);
        f6034k = fVar3;
        f6035l = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f6035l.clone();
    }
}
