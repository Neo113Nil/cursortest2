package R5;

import a.AbstractC0603a;
import e6.C1054c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class U {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ U[] f6102A;

    /* renamed from: b, reason: collision with root package name */
    public static final C1054c f6103b;

    /* renamed from: c, reason: collision with root package name */
    public static final U f6104c;

    /* renamed from: d, reason: collision with root package name */
    public static final U f6105d;

    /* renamed from: e, reason: collision with root package name */
    public static final U f6106e;

    /* renamed from: f, reason: collision with root package name */
    public static final U f6107f;

    /* renamed from: x, reason: collision with root package name */
    public static final U f6108x;

    /* renamed from: y, reason: collision with root package name */
    public static final U f6109y;

    /* renamed from: z, reason: collision with root package name */
    public static final U f6110z;

    /* renamed from: a, reason: collision with root package name */
    public final int f6111a;

    static {
        U u4 = new U("DATE_INVALID", 0, 0);
        f6104c = u4;
        U u7 = new U("EXPIRED", 1, 1);
        f6105d = u7;
        U u8 = new U("ID_MISMATCH", 2, 2);
        f6106e = u8;
        U u9 = new U("INVALID", 3, 3);
        f6107f = u9;
        U u10 = new U("NOT_YET_VALID", 4, 4);
        f6108x = u10;
        U u11 = new U("UNTRUSTED", 5, 5);
        f6109y = u11;
        U u12 = new U("UNKNOWN", 6, 6);
        f6110z = u12;
        U[] uArr = {u4, u7, u8, u9, u10, u11, u12};
        f6102A = uArr;
        AbstractC0603a.T(uArr);
        f6103b = new C1054c(11);
    }

    public U(String str, int i7, int i8) {
        this.f6111a = i8;
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f6102A.clone();
    }
}
