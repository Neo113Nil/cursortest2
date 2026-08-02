package R5;

import a.AbstractC0603a;
import w1.C1718l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: R5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0414j {

    /* renamed from: b, reason: collision with root package name */
    public static final C1718l0 f6179b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0414j f6180c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0414j f6181d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0414j f6182e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0414j f6183f;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC0414j f6184x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC0414j f6185y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ EnumC0414j[] f6186z;

    /* renamed from: a, reason: collision with root package name */
    public final int f6187a;

    static {
        EnumC0414j enumC0414j = new EnumC0414j("DEBUG", 0, 0);
        f6180c = enumC0414j;
        EnumC0414j enumC0414j2 = new EnumC0414j("ERROR", 1, 1);
        f6181d = enumC0414j2;
        EnumC0414j enumC0414j3 = new EnumC0414j("LOG", 2, 2);
        f6182e = enumC0414j3;
        EnumC0414j enumC0414j4 = new EnumC0414j("TIP", 3, 3);
        f6183f = enumC0414j4;
        EnumC0414j enumC0414j5 = new EnumC0414j("WARNING", 4, 4);
        f6184x = enumC0414j5;
        EnumC0414j enumC0414j6 = new EnumC0414j("UNKNOWN", 5, 5);
        f6185y = enumC0414j6;
        EnumC0414j[] enumC0414jArr = {enumC0414j, enumC0414j2, enumC0414j3, enumC0414j4, enumC0414j5, enumC0414j6};
        f6186z = enumC0414jArr;
        AbstractC0603a.T(enumC0414jArr);
        f6179b = new C1718l0(9);
    }

    public EnumC0414j(String str, int i7, int i8) {
        this.f6187a = i8;
    }

    public static EnumC0414j valueOf(String str) {
        return (EnumC0414j) Enum.valueOf(EnumC0414j.class, str);
    }

    public static EnumC0414j[] values() {
        return (EnumC0414j[]) f6186z.clone();
    }
}
