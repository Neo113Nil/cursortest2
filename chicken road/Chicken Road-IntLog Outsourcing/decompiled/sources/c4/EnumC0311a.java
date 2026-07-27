package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0311a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0311a f4922a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0311a[] f4923b;

    static {
        EnumC0311a enumC0311a = new EnumC0311a("INSTANCE", 0);
        f4922a = enumC0311a;
        f4923b = new EnumC0311a[]{enumC0311a};
    }

    public static EnumC0311a valueOf(String str) {
        return (EnumC0311a) Enum.valueOf(EnumC0311a.class, str);
    }

    public static EnumC0311a[] values() {
        return (EnumC0311a[]) f4923b.clone();
    }

    @Override // c4.d
    public final String getDescription() {
        return "AlwaysOffSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOffSampler";
    }
}
