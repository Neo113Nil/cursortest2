package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0822a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0822a f10448a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0822a[] f10449b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0822a EF0;

    static {
        EnumC0822a enumC0822a = new EnumC0822a("BLOCKING", 0);
        EnumC0822a enumC0822a2 = new EnumC0822a("FUTURE", 1);
        EnumC0822a enumC0822a3 = new EnumC0822a("ASYNC", 2);
        f10448a = enumC0822a3;
        f10449b = new EnumC0822a[]{enumC0822a, enumC0822a2, enumC0822a3};
    }

    public static EnumC0822a valueOf(String str) {
        return (EnumC0822a) Enum.valueOf(EnumC0822a.class, str);
    }

    public static EnumC0822a[] values() {
        return (EnumC0822a[]) f10449b.clone();
    }
}
