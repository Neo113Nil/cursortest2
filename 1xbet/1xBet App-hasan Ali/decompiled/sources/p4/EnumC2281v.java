package p4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2281v {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2281v f18821k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2281v f18822l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2281v f18823m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC2281v f18824n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC2281v[] f18825o;

    static {
        EnumC2281v enumC2281v = new EnumC2281v("DEFAULT", 0);
        f18821k = enumC2281v;
        EnumC2281v enumC2281v2 = new EnumC2281v("LAZY", 1);
        f18822l = enumC2281v2;
        EnumC2281v enumC2281v3 = new EnumC2281v("ATOMIC", 2);
        f18823m = enumC2281v3;
        EnumC2281v enumC2281v4 = new EnumC2281v("UNDISPATCHED", 3);
        f18824n = enumC2281v4;
        f18825o = new EnumC2281v[]{enumC2281v, enumC2281v2, enumC2281v3, enumC2281v4};
    }

    public static EnumC2281v valueOf(String str) {
        return (EnumC2281v) Enum.valueOf(EnumC2281v.class, str);
    }

    public static EnumC2281v[] values() {
        return (EnumC2281v[]) f18825o.clone();
    }
}
