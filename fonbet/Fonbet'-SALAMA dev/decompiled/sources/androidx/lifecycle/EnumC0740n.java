package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0740n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0740n f9626a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0740n f9627b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0740n f9628c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0740n f9629d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0740n f9630e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0740n[] f9631f;

    static {
        EnumC0740n enumC0740n = new EnumC0740n("DESTROYED", 0);
        f9626a = enumC0740n;
        EnumC0740n enumC0740n2 = new EnumC0740n("INITIALIZED", 1);
        f9627b = enumC0740n2;
        EnumC0740n enumC0740n3 = new EnumC0740n("CREATED", 2);
        f9628c = enumC0740n3;
        EnumC0740n enumC0740n4 = new EnumC0740n("STARTED", 3);
        f9629d = enumC0740n4;
        EnumC0740n enumC0740n5 = new EnumC0740n("RESUMED", 4);
        f9630e = enumC0740n5;
        f9631f = new EnumC0740n[]{enumC0740n, enumC0740n2, enumC0740n3, enumC0740n4, enumC0740n5};
    }

    public static EnumC0740n valueOf(String str) {
        return (EnumC0740n) Enum.valueOf(EnumC0740n.class, str);
    }

    public static EnumC0740n[] values() {
        return (EnumC0740n[]) f9631f.clone();
    }
}
