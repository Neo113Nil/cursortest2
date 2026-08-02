package Y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Y4.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0588n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0588n0 f7734a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0588n0 f7735b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0588n0 f7736c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0588n0 f7737d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0588n0[] f7738e;

    static {
        EnumC0588n0 enumC0588n0 = new EnumC0588n0("COMPOSITE_FILTER", 0);
        f7734a = enumC0588n0;
        EnumC0588n0 enumC0588n02 = new EnumC0588n0("FIELD_FILTER", 1);
        f7735b = enumC0588n02;
        EnumC0588n0 enumC0588n03 = new EnumC0588n0("UNARY_FILTER", 2);
        f7736c = enumC0588n03;
        EnumC0588n0 enumC0588n04 = new EnumC0588n0("FILTERTYPE_NOT_SET", 3);
        f7737d = enumC0588n04;
        f7738e = new EnumC0588n0[]{enumC0588n0, enumC0588n02, enumC0588n03, enumC0588n04};
    }

    public static EnumC0588n0 valueOf(String str) {
        return (EnumC0588n0) Enum.valueOf(EnumC0588n0.class, str);
    }

    public static EnumC0588n0[] values() {
        return (EnumC0588n0[]) f7738e.clone();
    }
}
