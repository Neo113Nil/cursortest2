package Q4;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Q4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0147a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0147a f2498a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0147a[] f2499b;

    static {
        EnumC0147a enumC0147a = new EnumC0147a("NONE", 0);
        EnumC0147a enumC0147a2 = new EnumC0147a("ALL_JSON_OBJECTS", 1);
        EnumC0147a enumC0147a3 = new EnumC0147a("POLYMORPHIC", 2);
        f2498a = enumC0147a3;
        EnumC0147a[] enumC0147aArr = {enumC0147a, enumC0147a2, enumC0147a3};
        f2499b = enumC0147aArr;
        AbstractC1477a.n(enumC0147aArr);
    }

    public static EnumC0147a valueOf(String str) {
        return (EnumC0147a) Enum.valueOf(EnumC0147a.class, str);
    }

    public static EnumC0147a[] values() {
        return (EnumC0147a[]) f2499b.clone();
    }
}
