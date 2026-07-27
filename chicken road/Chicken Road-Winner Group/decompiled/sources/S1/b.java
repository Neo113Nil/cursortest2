package S1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1387a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f1388b;

    static {
        b bVar = new b("PLAIN_TEXT", 0);
        f1387a = bVar;
        f1388b = new b[]{bVar};
    }

    public static b a(String str) {
        for (b bVar : values()) {
            bVar.getClass();
            if ("text/plain".equals(str)) {
                return bVar;
            }
        }
        throw new NoSuchFieldException(B0.c.j("No such ClipboardContentFormat: ", str));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1388b.clone();
    }
}
