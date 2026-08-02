package L5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: L5.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0344x {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0344x f4511a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0344x f4512b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0344x[] f4513c;

    static {
        EnumC0344x enumC0344x = new EnumC0344x("NOT_READY", 0);
        f4511a = enumC0344x;
        EnumC0344x enumC0344x2 = new EnumC0344x("READY", 1);
        f4512b = enumC0344x2;
        f4513c = new EnumC0344x[]{enumC0344x, enumC0344x2};
    }

    public static EnumC0344x valueOf(String str) {
        return (EnumC0344x) Enum.valueOf(EnumC0344x.class, str);
    }

    public static EnumC0344x[] values() {
        return (EnumC0344x[]) f4513c.clone();
    }
}
