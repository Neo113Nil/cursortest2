package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0268e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0268e f4770a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0268e f4771b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0268e f4772c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0268e[] f4773d;

    static {
        EnumC0268e enumC0268e = new EnumC0268e("NETWORK_UNMETERED", 0);
        f4770a = enumC0268e;
        EnumC0268e enumC0268e2 = new EnumC0268e("DEVICE_IDLE", 1);
        f4771b = enumC0268e2;
        EnumC0268e enumC0268e3 = new EnumC0268e("DEVICE_CHARGING", 2);
        f4772c = enumC0268e3;
        f4773d = new EnumC0268e[]{enumC0268e, enumC0268e2, enumC0268e3};
    }

    public static EnumC0268e valueOf(String str) {
        return (EnumC0268e) Enum.valueOf(EnumC0268e.class, str);
    }

    public static EnumC0268e[] values() {
        return (EnumC0268e[]) f4773d.clone();
    }
}
