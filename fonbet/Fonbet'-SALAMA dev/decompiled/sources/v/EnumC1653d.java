package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1653d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1653d f16912a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1653d f16913b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1653d f16914c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1653d f16915d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1653d[] f16916e;

    static {
        EnumC1653d enumC1653d = new EnumC1653d("FIXED", 0);
        f16912a = enumC1653d;
        EnumC1653d enumC1653d2 = new EnumC1653d("WRAP_CONTENT", 1);
        f16913b = enumC1653d2;
        EnumC1653d enumC1653d3 = new EnumC1653d("MATCH_CONSTRAINT", 2);
        f16914c = enumC1653d3;
        EnumC1653d enumC1653d4 = new EnumC1653d("MATCH_PARENT", 3);
        f16915d = enumC1653d4;
        f16916e = new EnumC1653d[]{enumC1653d, enumC1653d2, enumC1653d3, enumC1653d4};
    }

    public static EnumC1653d valueOf(String str) {
        return (EnumC1653d) Enum.valueOf(EnumC1653d.class, str);
    }

    public static EnumC1653d[] values() {
        return (EnumC1653d[]) f16916e.clone();
    }
}
