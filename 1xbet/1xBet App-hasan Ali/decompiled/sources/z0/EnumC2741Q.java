package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2741Q {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2741Q f21693k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2741Q f21694l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2741Q f21695m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC2741Q[] f21696n;

    static {
        EnumC2741Q enumC2741Q = new EnumC2741Q("IsPlacedInLookahead", 0);
        f21693k = enumC2741Q;
        EnumC2741Q enumC2741Q2 = new EnumC2741Q("IsPlacedInApproach", 1);
        f21694l = enumC2741Q2;
        EnumC2741Q enumC2741Q3 = new EnumC2741Q("IsNotPlaced", 2);
        f21695m = enumC2741Q3;
        f21696n = new EnumC2741Q[]{enumC2741Q, enumC2741Q2, enumC2741Q3};
    }

    public static EnumC2741Q valueOf(String str) {
        return (EnumC2741Q) Enum.valueOf(EnumC2741Q.class, str);
    }

    public static EnumC2741Q[] values() {
        return (EnumC2741Q[]) f21696n.clone();
    }
}
