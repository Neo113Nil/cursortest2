package J4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f3861a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f3862b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f3863c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f3864d;

    static {
        f fVar = new f("QUERY", 0);
        f3861a = fVar;
        f fVar2 = new f("DOCUMENTS", 1);
        f3862b = fVar2;
        f fVar3 = new f("TARGETTYPE_NOT_SET", 2);
        f3863c = fVar3;
        f3864d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f3864d.clone();
    }
}
