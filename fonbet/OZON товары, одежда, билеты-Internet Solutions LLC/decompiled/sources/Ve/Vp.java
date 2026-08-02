package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Vp {

    /* renamed from: a, reason: collision with root package name */
    public static final Vp f30225a;

    /* renamed from: b, reason: collision with root package name */
    public static final Vp f30226b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Vp[] f30227c;

    static {
        Vp vp2 = new Vp("AUTH_BY_BANK", 0);
        f30225a = vp2;
        Vp vp3 = new Vp("AUTH_BY_REFRESH", 1);
        Vp vp4 = new Vp("BIOMETRIC_AUTH", 2);
        Vp vp5 = new Vp("ALL", 3);
        f30226b = vp5;
        f30227c = new Vp[]{vp2, vp3, vp4, vp5};
    }

    public static Vp valueOf(String str) {
        return (Vp) Enum.valueOf(Vp.class, str);
    }

    public static Vp[] values() {
        return (Vp[]) f30227c.clone();
    }
}
