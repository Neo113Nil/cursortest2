package C;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final A f4075c = new A(0, 0);

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public static final A f4076d = new A(1, 8);

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public static final A f4077e = new A(3, 10);

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public static final A f4078f = new A(4, 10);

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public static final A f4079g = new A(5, 10);

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public static final A f4080h = new A(6, 10);

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public static final A f4081i = new A(6, 8);

    /* renamed from: a, reason: collision with root package name */
    private final int f4082a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4083b;

    public A(int i11, int i12) {
        this.f4082a = i11;
        this.f4083b = i12;
    }

    public final int a() {
        return this.f4083b;
    }

    public final int b() {
        return this.f4082a;
    }

    public final boolean c() {
        return d() && this.f4082a != 1 && this.f4083b == 10;
    }

    public final boolean d() {
        int i11 = this.f4082a;
        return (i11 == 0 || i11 == 2 || this.f4083b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            A a11 = (A) obj;
            if (this.f4082a == a11.f4082a && this.f4083b == a11.f4083b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4082a ^ 1000003) * 1000003) ^ this.f4083b;
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.f4082a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return K00.b.e(this.f4083b, "}", sb2);
    }
}
