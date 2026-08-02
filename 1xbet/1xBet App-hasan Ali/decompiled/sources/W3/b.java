package W3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f6032k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f6033l;

    static {
        b bVar = new b("WARNING", 0);
        f6032k = bVar;
        f6033l = new b[]{bVar, new b("ERROR", 1), new b("HIDDEN", 2)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6033l.clone();
    }
}
