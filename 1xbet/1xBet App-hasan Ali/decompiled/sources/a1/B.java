package a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: k, reason: collision with root package name */
    public static final B f6375k;

    /* renamed from: l, reason: collision with root package name */
    public static final B f6376l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ B[] f6377m;

    static {
        B b3 = new B("Inherit", 0);
        f6375k = b3;
        B b5 = new B("SecureOn", 1);
        f6376l = b5;
        f6377m = new B[]{b3, b5, new B("SecureOff", 2)};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f6377m.clone();
    }
}
