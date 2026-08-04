package Y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Y4.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0588n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0588n0 f7734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0588n0 f7735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0588n0 f7736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0588n0 f7737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0588n0[] f7738e;

    static {
        EnumC0588n0 enumC0588n0 = new EnumC0588n0("COMPOSITE_FILTER", 0);
        f7734a = enumC0588n0;
        EnumC0588n0 enumC0588n1 = new EnumC0588n0("FIELD_FILTER", 1);
        f7735b = enumC0588n1;
        EnumC0588n0 enumC0588n2 = new EnumC0588n0("UNARY_FILTER", 2);
        f7736c = enumC0588n2;
        EnumC0588n0 enumC0588n3 = new EnumC0588n0("FILTERTYPE_NOT_SET", 3);
        f7737d = enumC0588n3;
        f7738e = new EnumC0588n0[]{enumC0588n0, enumC0588n1, enumC0588n2, enumC0588n3};
    }

    public static EnumC0588n0 valueOf(String str) {
        return (EnumC0588n0) Enum.valueOf(EnumC0588n0.class, str);
    }

    public static EnumC0588n0[] values() {
        return (EnumC0588n0[]) f7738e.clone();
    }
}
