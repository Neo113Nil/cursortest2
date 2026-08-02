package D2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1709a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f1710b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f1711c;

    static {
        a aVar = new a("NOT_READY", 0);
        f1709a = aVar;
        a aVar2 = new a("READY", 1);
        f1710b = aVar2;
        f1711c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1711c.clone();
    }
}
