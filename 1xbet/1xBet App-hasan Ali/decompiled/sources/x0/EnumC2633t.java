package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2633t {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2633t f21054k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2633t f21055l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC2633t[] f21056m;

    static {
        EnumC2633t enumC2633t = new EnumC2633t("Min", 0);
        f21054k = enumC2633t;
        EnumC2633t enumC2633t2 = new EnumC2633t("Max", 1);
        f21055l = enumC2633t2;
        f21056m = new EnumC2633t[]{enumC2633t, enumC2633t2};
    }

    public static EnumC2633t valueOf(String str) {
        return (EnumC2633t) Enum.valueOf(EnumC2633t.class, str);
    }

    public static EnumC2633t[] values() {
        return (EnumC2633t[]) f21056m.clone();
    }
}
