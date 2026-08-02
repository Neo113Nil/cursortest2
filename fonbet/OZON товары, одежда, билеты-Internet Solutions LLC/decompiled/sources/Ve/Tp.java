package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Tp {

    /* renamed from: a, reason: collision with root package name */
    public static final Tp f30075a;

    /* renamed from: b, reason: collision with root package name */
    public static final Tp f30076b;

    /* renamed from: c, reason: collision with root package name */
    public static final Tp f30077c;

    /* renamed from: d, reason: collision with root package name */
    public static final Tp f30078d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Tp[] f30079e;

    static {
        Tp tp = new Tp("OTP_REVIEW_MODE", 0);
        f30075a = tp;
        Tp tp2 = new Tp("REVIEW_HINT_MODE", 1);
        f30076b = tp2;
        Tp tp3 = new Tp("DENY_MODE", 2);
        f30077c = tp3;
        Tp tp4 = new Tp("DENY_BLOCK_MODE", 3);
        f30078d = tp4;
        f30079e = new Tp[]{tp, tp2, tp3, tp4};
    }

    public static Tp valueOf(String str) {
        return (Tp) Enum.valueOf(Tp.class, str);
    }

    public static Tp[] values() {
        return (Tp[]) f30079e.clone();
    }
}
