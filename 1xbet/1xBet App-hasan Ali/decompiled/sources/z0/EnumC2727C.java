package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2727C {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2727C f21585k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2727C f21586l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2727C f21587m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC2727C f21588n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2727C f21589o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC2727C[] f21590p;

    static {
        EnumC2727C enumC2727C = new EnumC2727C("Measuring", 0);
        f21585k = enumC2727C;
        EnumC2727C enumC2727C2 = new EnumC2727C("LookaheadMeasuring", 1);
        f21586l = enumC2727C2;
        EnumC2727C enumC2727C3 = new EnumC2727C("LayingOut", 2);
        f21587m = enumC2727C3;
        EnumC2727C enumC2727C4 = new EnumC2727C("LookaheadLayingOut", 3);
        f21588n = enumC2727C4;
        EnumC2727C enumC2727C5 = new EnumC2727C("Idle", 4);
        f21589o = enumC2727C5;
        f21590p = new EnumC2727C[]{enumC2727C, enumC2727C2, enumC2727C3, enumC2727C4, enumC2727C5};
    }

    public static EnumC2727C valueOf(String str) {
        return (EnumC2727C) Enum.valueOf(EnumC2727C.class, str);
    }

    public static EnumC2727C[] values() {
        return (EnumC2727C[]) f21590p.clone();
    }
}
