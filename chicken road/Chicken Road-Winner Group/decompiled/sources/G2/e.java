package G2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f447a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f448b;

    static {
        e eVar = new e("MEDIA_PLAYER", 0);
        f447a = eVar;
        f448b = new e[]{eVar, new e("LOW_LATENCY", 1)};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f448b.clone();
    }
}
