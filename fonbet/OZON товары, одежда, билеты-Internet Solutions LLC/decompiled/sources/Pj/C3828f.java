package Pj;

import B0.C2454a;
import Pj.AbstractC3826d;
import Pj.AbstractC3827e;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* renamed from: Pj.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3828f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC3825c f22570a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC3823a f22571b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC3824b f22572c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3824b f22573d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC3824b f22574e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22575f;

    /* renamed from: g, reason: collision with root package name */
    private final int f22576g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AbstractC3827e f22577h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AbstractC3826d f22578i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final AbstractC3826d f22579j;

    public C3828f() {
        this(null, null, null, 0, 0, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3828f)) {
            return false;
        }
        C3828f c3828f = (C3828f) obj;
        return this.f22570a == c3828f.f22570a && this.f22571b == c3828f.f22571b && this.f22572c == c3828f.f22572c && this.f22573d == c3828f.f22573d && this.f22574e == c3828f.f22574e && this.f22575f == c3828f.f22575f && this.f22576g == c3828f.f22576g && Intrinsics.d(this.f22577h, c3828f.f22577h) && Intrinsics.d(this.f22578i, c3828f.f22578i) && Intrinsics.d(this.f22579j, c3828f.f22579j);
    }

    public final int hashCode() {
        int hashCode = (this.f22572c.hashCode() + ((this.f22571b.hashCode() + (this.f22570a.hashCode() * 31)) * 31)) * 31;
        EnumC3824b enumC3824b = this.f22573d;
        int hashCode2 = (hashCode + (enumC3824b == null ? 0 : enumC3824b.hashCode())) * 31;
        EnumC3824b enumC3824b2 = this.f22574e;
        return this.f22579j.hashCode() + ((this.f22578i.hashCode() + ((this.f22577h.hashCode() + C2454a.a(this.f22576g, C2454a.a(this.f22575f, (hashCode2 + (enumC3824b2 != null ? enumC3824b2.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "MainAddonSettings(axis=" + this.f22570a + ", addonSide=" + this.f22571b + ", alignment=" + this.f22572c + ", mainAlignment=" + this.f22573d + ", addonAlignment=" + this.f22574e + ", gap=" + this.f22575f + ", minWrapperHeight=" + this.f22576g + ", padding=" + this.f22577h + ", mainPadding=" + this.f22578i + ", addonPadding=" + this.f22579j + ")";
    }

    public C3828f(@NotNull EnumC3825c axis, @NotNull EnumC3823a addonSide, @NotNull EnumC3824b alignment, EnumC3824b enumC3824b, EnumC3824b enumC3824b2, int i11, int i12, @NotNull AbstractC3827e padding, @NotNull AbstractC3826d mainPadding, @NotNull AbstractC3826d addonPadding) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(addonSide, "addonSide");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(mainPadding, "mainPadding");
        Intrinsics.checkNotNullParameter(addonPadding, "addonPadding");
        this.f22570a = axis;
        this.f22571b = addonSide;
        this.f22572c = alignment;
        this.f22573d = enumC3824b;
        this.f22574e = enumC3824b2;
        this.f22575f = i11;
        this.f22576g = i12;
        this.f22577h = padding;
        this.f22578i = mainPadding;
        this.f22579j = addonPadding;
    }

    public C3828f(EnumC3825c enumC3825c, EnumC3823a enumC3823a, EnumC3824b enumC3824b, int i11, int i12, AbstractC3827e abstractC3827e, AbstractC3826d abstractC3826d, AbstractC3826d.c cVar, int i13) {
        this((i13 & 1) != 0 ? EnumC3825c.HORIZONTAL : enumC3825c, (i13 & 2) != 0 ? EnumC3823a.START : enumC3823a, (i13 & 4) != 0 ? EnumC3824b.LEADING : enumC3824b, null, null, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0 : i12, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new AbstractC3827e.d() : abstractC3827e, (i13 & 256) != 0 ? new AbstractC3826d.c() : abstractC3826d, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new AbstractC3826d.c() : cVar);
    }
}
