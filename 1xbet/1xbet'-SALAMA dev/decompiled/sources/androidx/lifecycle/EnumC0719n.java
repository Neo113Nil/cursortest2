package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0719n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0719n f9626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0719n f9627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0719n f9628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0719n f9629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC0719n f9630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0719n[] f9631f;

    static {
        EnumC0719n enumC0719n = new EnumC0719n("DESTROYED", 0);
        f9626a = enumC0719n;
        EnumC0719n enumC0719n2 = new EnumC0719n("INITIALIZED", 1);
        f9627b = enumC0719n2;
        EnumC0719n enumC0719n3 = new EnumC0719n("CREATED", 2);
        f9628c = enumC0719n3;
        EnumC0719n enumC0719n4 = new EnumC0719n("STARTED", 3);
        f9629d = enumC0719n4;
        EnumC0719n enumC0719n5 = new EnumC0719n("RESUMED", 4);
        f9630e = enumC0719n5;
        f9631f = new EnumC0719n[]{enumC0719n, enumC0719n2, enumC0719n3, enumC0719n4, enumC0719n5};
    }

    public static EnumC0719n valueOf(String str) {
        return (EnumC0719n) Enum.valueOf(EnumC0719n.class, str);
    }

    public static EnumC0719n[] values() {
        return (EnumC0719n[]) f9631f.clone();
    }
}
