package P;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: P.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0330z0 {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0330z0 f4607k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0330z0 f4608l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0330z0 f4609m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0330z0 f4610n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0330z0 f4611o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC0330z0 f4612p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0330z0[] f4613q;

    static {
        EnumC0330z0 enumC0330z0 = new EnumC0330z0("ShutDown", 0);
        f4607k = enumC0330z0;
        EnumC0330z0 enumC0330z02 = new EnumC0330z0("ShuttingDown", 1);
        f4608l = enumC0330z02;
        EnumC0330z0 enumC0330z03 = new EnumC0330z0("Inactive", 2);
        f4609m = enumC0330z03;
        EnumC0330z0 enumC0330z04 = new EnumC0330z0("InactivePendingWork", 3);
        f4610n = enumC0330z04;
        EnumC0330z0 enumC0330z05 = new EnumC0330z0("Idle", 4);
        f4611o = enumC0330z05;
        EnumC0330z0 enumC0330z06 = new EnumC0330z0("PendingWork", 5);
        f4612p = enumC0330z06;
        f4613q = new EnumC0330z0[]{enumC0330z0, enumC0330z02, enumC0330z03, enumC0330z04, enumC0330z05, enumC0330z06};
    }

    public static EnumC0330z0 valueOf(String str) {
        return (EnumC0330z0) Enum.valueOf(EnumC0330z0.class, str);
    }

    public static EnumC0330z0[] values() {
        return (EnumC0330z0[]) f4613q.clone();
    }
}
