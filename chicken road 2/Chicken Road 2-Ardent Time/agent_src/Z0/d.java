package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final Z0.d f1872b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Z0.d[] f1873c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f1874a;

    /* JADX INFO: Fake field, exist only in values array */
    Z0.d EF0;

    static {
        Z0.d dVar = new Z0.d("PLAIN_TEXT", 0);
        dVar.f1874a = "text/plain";
        f1872b = dVar;
        f1873c = new Z0.d[]{dVar};
    }

    public static Z0.d a(java.lang.String str) {
        for (Z0.d dVar : values()) {
            if (dVar.f1874a.equals(str)) {
                return dVar;
            }
        }
        throw new java.lang.NoSuchFieldException(B1.a.i("No such ClipboardContentFormat: ", str));
    }

    public static Z0.d valueOf(java.lang.String str) {
        return (Z0.d) java.lang.Enum.valueOf(Z0.d.class, str);
    }

    public static Z0.d[] values() {
        return (Z0.d[]) f1873c.clone();
    }
}
