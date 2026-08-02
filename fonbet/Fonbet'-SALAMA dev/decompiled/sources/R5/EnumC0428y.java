package R5;

import a.AbstractC0603a;
import w1.C1722m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: R5.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0428y {

    /* renamed from: b, reason: collision with root package name */
    public static final C1722m0 f6221b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0428y f6222c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0428y[] f6223d;

    /* renamed from: a, reason: collision with root package name */
    public final int f6224a;

    static {
        EnumC0428y enumC0428y = new EnumC0428y("ALWAYS", 0, 0);
        EnumC0428y enumC0428y2 = new EnumC0428y("IF_CONTENT_SCROLLS", 1, 1);
        EnumC0428y enumC0428y3 = new EnumC0428y("NEVER", 2, 2);
        EnumC0428y enumC0428y4 = new EnumC0428y("UNKNOWN", 3, 3);
        f6222c = enumC0428y4;
        EnumC0428y[] enumC0428yArr = {enumC0428y, enumC0428y2, enumC0428y3, enumC0428y4};
        f6223d = enumC0428yArr;
        AbstractC0603a.T(enumC0428yArr);
        f6221b = new C1722m0(10);
    }

    public EnumC0428y(String str, int i7, int i8) {
        this.f6224a = i8;
    }

    public static EnumC0428y valueOf(String str) {
        return (EnumC0428y) Enum.valueOf(EnumC0428y.class, str);
    }

    public static EnumC0428y[] values() {
        return (EnumC0428y[]) f6223d.clone();
    }
}
