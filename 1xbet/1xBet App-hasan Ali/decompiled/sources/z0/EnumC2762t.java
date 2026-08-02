package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2762t {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2762t f21858k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2762t f21859l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2762t f21860m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC2762t f21861n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC2762t[] f21862o;

    static {
        EnumC2762t enumC2762t = new EnumC2762t("LookaheadMeasurement", 0);
        f21858k = enumC2762t;
        EnumC2762t enumC2762t2 = new EnumC2762t("LookaheadPlacement", 1);
        f21859l = enumC2762t2;
        EnumC2762t enumC2762t3 = new EnumC2762t("Measurement", 2);
        f21860m = enumC2762t3;
        EnumC2762t enumC2762t4 = new EnumC2762t("Placement", 3);
        f21861n = enumC2762t4;
        f21862o = new EnumC2762t[]{enumC2762t, enumC2762t2, enumC2762t3, enumC2762t4};
    }

    public static EnumC2762t valueOf(String str) {
        return (EnumC2762t) Enum.valueOf(EnumC2762t.class, str);
    }

    public static EnumC2762t[] values() {
        return (EnumC2762t[]) f21862o.clone();
    }
}
