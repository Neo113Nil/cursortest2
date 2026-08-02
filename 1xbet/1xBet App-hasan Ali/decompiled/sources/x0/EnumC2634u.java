package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2634u {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2634u f21057k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2634u f21058l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC2634u[] f21059m;

    static {
        EnumC2634u enumC2634u = new EnumC2634u("Width", 0);
        f21057k = enumC2634u;
        EnumC2634u enumC2634u2 = new EnumC2634u("Height", 1);
        f21058l = enumC2634u2;
        f21059m = new EnumC2634u[]{enumC2634u, enumC2634u2};
    }

    public static EnumC2634u valueOf(String str) {
        return (EnumC2634u) Enum.valueOf(EnumC2634u.class, str);
    }

    public static EnumC2634u[] values() {
        return (EnumC2634u[]) f21059m.clone();
    }
}
