package U1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3154a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f3155b;

    static {
        d dVar = new d("DEFAULT", 0);
        f3154a = dVar;
        f3155b = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3155b.clone();
    }
}
