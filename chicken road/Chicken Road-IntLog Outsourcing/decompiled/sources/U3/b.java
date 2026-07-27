package U3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3171a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f3172b;

    static {
        b bVar = new b("INSTANCE", 0);
        f3171a = bVar;
        f3172b = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3172b.clone();
    }
}
