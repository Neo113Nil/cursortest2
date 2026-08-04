package W5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: W5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0543u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0543u f7372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0543u f7373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0543u f7374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0543u f7375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0543u[] f7376e;

    static {
        EnumC0543u enumC0543u = new EnumC0543u("PROCESSED", 0);
        f7372a = enumC0543u;
        EnumC0543u enumC0543u2 = new EnumC0543u("REFUSED", 1);
        f7373b = enumC0543u2;
        EnumC0543u enumC0543u3 = new EnumC0543u("DROPPED", 2);
        f7374c = enumC0543u3;
        EnumC0543u enumC0543u4 = new EnumC0543u("MISCARRIED", 3);
        f7375d = enumC0543u4;
        f7376e = new EnumC0543u[]{enumC0543u, enumC0543u2, enumC0543u3, enumC0543u4};
    }

    public static EnumC0543u valueOf(String str) {
        return (EnumC0543u) Enum.valueOf(EnumC0543u.class, str);
    }

    public static EnumC0543u[] values() {
        return (EnumC0543u[]) f7376e.clone();
    }
}
