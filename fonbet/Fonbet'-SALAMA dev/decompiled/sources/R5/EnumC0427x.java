package R5;

import a.AbstractC0603a;
import w1.C1718l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: R5.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0427x {

    /* renamed from: b, reason: collision with root package name */
    public static final C1718l0 f6218b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0427x[] f6219c;

    /* renamed from: a, reason: collision with root package name */
    public final int f6220a;

    static {
        EnumC0427x[] enumC0427xArr = {new EnumC0427x("ALWAYS_ALLOW", 0, 0), new EnumC0427x("COMPATIBILITY_MODE", 1, 1), new EnumC0427x("NEVER_ALLOW", 2, 2)};
        f6219c = enumC0427xArr;
        AbstractC0603a.T(enumC0427xArr);
        f6218b = new C1718l0(10);
    }

    public EnumC0427x(String str, int i7, int i8) {
        this.f6220a = i8;
    }

    public static EnumC0427x valueOf(String str) {
        return (EnumC0427x) Enum.valueOf(EnumC0427x.class, str);
    }

    public static EnumC0427x[] values() {
        return (EnumC0427x[]) f6219c.clone();
    }
}
