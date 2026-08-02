package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0071o {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0071o f1181a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0071o f1182b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0071o f1183c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0071o f1184d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0071o[] f1185e;

    static {
        EnumC0071o enumC0071o = new EnumC0071o("NONE", 0);
        f1181a = enumC0071o;
        EnumC0071o enumC0071o2 = new EnumC0071o("ESTIMATE", 1);
        f1182b = enumC0071o2;
        EnumC0071o enumC0071o3 = new EnumC0071o("PREVIOUS", 2);
        f1183c = enumC0071o3;
        f1185e = new EnumC0071o[]{enumC0071o, enumC0071o2, enumC0071o3};
        f1184d = enumC0071o;
    }

    public static EnumC0071o valueOf(String str) {
        return (EnumC0071o) Enum.valueOf(EnumC0071o.class, str);
    }

    public static EnumC0071o[] values() {
        return (EnumC0071o[]) f1185e.clone();
    }
}
