package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2729E {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2729E f21592k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2729E f21593l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2729E f21594m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC2729E[] f21595n;

    static {
        EnumC2729E enumC2729E = new EnumC2729E("InMeasureBlock", 0);
        f21592k = enumC2729E;
        EnumC2729E enumC2729E2 = new EnumC2729E("InLayoutBlock", 1);
        f21593l = enumC2729E2;
        EnumC2729E enumC2729E3 = new EnumC2729E("NotUsed", 2);
        f21594m = enumC2729E3;
        f21595n = new EnumC2729E[]{enumC2729E, enumC2729E2, enumC2729E3};
    }

    public static EnumC2729E valueOf(String str) {
        return (EnumC2729E) Enum.valueOf(EnumC2729E.class, str);
    }

    public static EnumC2729E[] values() {
        return (EnumC2729E[]) f21595n.clone();
    }
}
