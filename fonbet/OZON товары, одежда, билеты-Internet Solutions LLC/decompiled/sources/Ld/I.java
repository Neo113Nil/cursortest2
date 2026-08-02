package Ld;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import je.L0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class I {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final I f16743k = new I(false, false, false, false, false, new I(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16744a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16745b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16746c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16747d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16748e;

    /* renamed from: f, reason: collision with root package name */
    private final I f16749f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16750g;

    /* renamed from: h, reason: collision with root package name */
    private final I f16751h;

    /* renamed from: i, reason: collision with root package name */
    private final I f16752i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16753j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16754a;

        static {
            int[] iArr = new int[L0.values().length];
            try {
                iArr[L0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L0.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16754a = iArr;
        }
    }

    public I(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, I i11, boolean z16, I i12, I i13, int i14) {
        z11 = (i14 & 1) != 0 ? true : z11;
        z12 = (i14 & 2) != 0 ? true : z12;
        z13 = (i14 & 4) != 0 ? false : z13;
        z14 = (i14 & 8) != 0 ? false : z14;
        z15 = (i14 & 16) != 0 ? false : z15;
        i11 = (i14 & 32) != 0 ? null : i11;
        z16 = (i14 & 64) != 0 ? true : z16;
        i12 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? i11 : i12;
        i13 = (i14 & 256) != 0 ? i11 : i13;
        boolean z17 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0;
        this.f16744a = z11;
        this.f16745b = z12;
        this.f16746c = z13;
        this.f16747d = z14;
        this.f16748e = z15;
        this.f16749f = i11;
        this.f16750g = z16;
        this.f16751h = i12;
        this.f16752i = i13;
        this.f16753j = z17;
    }

    public final boolean a() {
        return this.f16750g;
    }

    public final boolean b() {
        return this.f16753j;
    }

    public final boolean c() {
        return this.f16745b;
    }

    public final boolean d() {
        return this.f16744a;
    }

    public final boolean e() {
        return this.f16746c;
    }

    @NotNull
    public final I f(@NotNull L0 effectiveVariance) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!this.f16746c) {
            int i11 = a.f16754a[effectiveVariance.ordinal()];
            if (i11 == 1) {
                I i12 = this.f16751h;
                if (i12 != null) {
                    return i12;
                }
            } else if (i11 != 2) {
                I i13 = this.f16749f;
                if (i13 != null) {
                    return i13;
                }
            } else {
                I i14 = this.f16752i;
                if (i14 != null) {
                    return i14;
                }
            }
        }
        return this;
    }

    @NotNull
    public final I g() {
        return new I(this.f16744a, true, this.f16746c, this.f16747d, this.f16748e, this.f16749f, this.f16750g, this.f16751h, this.f16752i, UserVerificationMethods.USER_VERIFY_NONE);
    }
}
