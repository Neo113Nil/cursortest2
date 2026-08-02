package K1;

import P1.AbstractC3809p;
import Sc.C;
import V1.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.H0;
import n1.AbstractC8413f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final V1.l f14960a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14961b;

    /* renamed from: c, reason: collision with root package name */
    private final P1.F f14962c;

    /* renamed from: d, reason: collision with root package name */
    private final P1.A f14963d;

    /* renamed from: e, reason: collision with root package name */
    private final P1.B f14964e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3809p f14965f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14966g;

    /* renamed from: h, reason: collision with root package name */
    private final long f14967h;

    /* renamed from: i, reason: collision with root package name */
    private final V1.a f14968i;

    /* renamed from: j, reason: collision with root package name */
    private final V1.m f14969j;

    /* renamed from: k, reason: collision with root package name */
    private final R1.c f14970k;

    /* renamed from: l, reason: collision with root package name */
    private final long f14971l;

    /* renamed from: m, reason: collision with root package name */
    private final V1.i f14972m;

    /* renamed from: n, reason: collision with root package name */
    private final H0 f14973n;

    /* renamed from: o, reason: collision with root package name */
    private final z f14974o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC8413f f14975p;

    public D(V1.l lVar, long j11, P1.F f7, P1.A a11, P1.B b11, AbstractC3809p abstractC3809p, String str, long j12, V1.a aVar, V1.m mVar, R1.c cVar, long j13, V1.i iVar, H0 h02, z zVar, AbstractC8413f abstractC8413f) {
        this.f14960a = lVar;
        this.f14961b = j11;
        this.f14962c = f7;
        this.f14963d = a11;
        this.f14964e = b11;
        this.f14965f = abstractC3809p;
        this.f14966g = str;
        this.f14967h = j12;
        this.f14968i = aVar;
        this.f14969j = mVar;
        this.f14970k = cVar;
        this.f14971l = j13;
        this.f14972m = iVar;
        this.f14973n = h02;
        this.f14974o = zVar;
        this.f14975p = abstractC8413f;
    }

    public static D a(D d11) {
        long a11 = d11.f14960a.a();
        long j11 = d11.f14961b;
        P1.F f7 = d11.f14962c;
        P1.A a12 = d11.f14963d;
        P1.B b11 = d11.f14964e;
        String str = d11.f14966g;
        long j12 = d11.f14967h;
        V1.a aVar = d11.f14968i;
        V1.m mVar = d11.f14969j;
        R1.c cVar = d11.f14970k;
        long j13 = d11.f14971l;
        V1.i iVar = d11.f14972m;
        H0 h02 = d11.f14973n;
        z zVar = d11.f14974o;
        AbstractC8413f abstractC8413f = d11.f14975p;
        V1.l lVar = d11.f14960a;
        if (!C7807Z.p(a11, lVar.a())) {
            lVar = l.a.b(a11);
        }
        return new D(lVar, j11, f7, a12, b11, null, str, j12, aVar, mVar, cVar, j13, iVar, h02, zVar, abstractC8413f);
    }

    public final float b() {
        return this.f14960a.getAlpha();
    }

    public final long c() {
        return this.f14971l;
    }

    public final V1.a d() {
        return this.f14968i;
    }

    public final AbstractC7799Q e() {
        return this.f14960a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d11 = (D) obj;
        return u(d11) && v(d11);
    }

    public final long f() {
        return this.f14960a.a();
    }

    public final AbstractC8413f g() {
        return this.f14975p;
    }

    public final AbstractC3809p h() {
        return this.f14965f;
    }

    public final int hashCode() {
        V1.l lVar = this.f14960a;
        long a11 = lVar.a();
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        int hashCode = Long.hashCode(a11) * 31;
        AbstractC7799Q d11 = lVar.d();
        int hashCode2 = (Float.hashCode(lVar.getAlpha()) + ((hashCode + (d11 != null ? d11.hashCode() : 0)) * 31)) * 31;
        int i12 = Z1.u.f35335d;
        int a12 = Pk0.c.a(hashCode2, 31, this.f14961b);
        P1.F f7 = this.f14962c;
        int hashCode3 = (a12 + (f7 != null ? f7.hashCode() : 0)) * 31;
        P1.A a13 = this.f14963d;
        int hashCode4 = (hashCode3 + (a13 != null ? Integer.hashCode(a13.b()) : 0)) * 31;
        P1.B b11 = this.f14964e;
        int hashCode5 = (hashCode4 + (b11 != null ? Integer.hashCode(b11.b()) : 0)) * 31;
        AbstractC3809p abstractC3809p = this.f14965f;
        int hashCode6 = (hashCode5 + (abstractC3809p != null ? abstractC3809p.hashCode() : 0)) * 31;
        String str = this.f14966g;
        int a14 = Pk0.c.a((hashCode6 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f14967h);
        V1.a aVar = this.f14968i;
        int hashCode7 = (a14 + (aVar != null ? Float.hashCode(aVar.b()) : 0)) * 31;
        V1.m mVar = this.f14969j;
        int hashCode8 = (hashCode7 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        R1.c cVar = this.f14970k;
        int a15 = Pk0.c.a((hashCode8 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f14971l);
        V1.i iVar = this.f14972m;
        int hashCode9 = (a15 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        H0 h02 = this.f14973n;
        int hashCode10 = (hashCode9 + (h02 != null ? h02.hashCode() : 0)) * 31;
        z zVar = this.f14974o;
        int hashCode11 = (hashCode10 + (zVar != null ? zVar.hashCode() : 0)) * 31;
        AbstractC8413f abstractC8413f = this.f14975p;
        return hashCode11 + (abstractC8413f != null ? abstractC8413f.hashCode() : 0);
    }

    public final String i() {
        return this.f14966g;
    }

    public final long j() {
        return this.f14961b;
    }

    public final P1.A k() {
        return this.f14963d;
    }

    public final P1.B l() {
        return this.f14964e;
    }

    public final P1.F m() {
        return this.f14962c;
    }

    public final long n() {
        return this.f14967h;
    }

    public final R1.c o() {
        return this.f14970k;
    }

    public final z p() {
        return this.f14974o;
    }

    public final H0 q() {
        return this.f14973n;
    }

    public final V1.i r() {
        return this.f14972m;
    }

    @NotNull
    public final V1.l s() {
        return this.f14960a;
    }

    public final V1.m t() {
        return this.f14969j;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        V1.l lVar = this.f14960a;
        sb2.append((Object) C7807Z.v(lVar.a()));
        sb2.append(", brush=");
        sb2.append(lVar.d());
        sb2.append(", alpha=");
        sb2.append(lVar.getAlpha());
        sb2.append(", fontSize=");
        sb2.append((Object) Z1.u.f(this.f14961b));
        sb2.append(", fontWeight=");
        sb2.append(this.f14962c);
        sb2.append(", fontStyle=");
        sb2.append(this.f14963d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f14964e);
        sb2.append(", fontFamily=");
        sb2.append(this.f14965f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f14966g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) Z1.u.f(this.f14967h));
        sb2.append(", baselineShift=");
        sb2.append(this.f14968i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f14969j);
        sb2.append(", localeList=");
        sb2.append(this.f14970k);
        sb2.append(", background=");
        Bi.a.e(this.f14971l, ", textDecoration=", sb2);
        sb2.append(this.f14972m);
        sb2.append(", shadow=");
        sb2.append(this.f14973n);
        sb2.append(", platformStyle=");
        sb2.append(this.f14974o);
        sb2.append(", drawStyle=");
        sb2.append(this.f14975p);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean u(@NotNull D d11) {
        if (this == d11) {
            return true;
        }
        return Z1.u.c(this.f14961b, d11.f14961b) && Intrinsics.d(this.f14962c, d11.f14962c) && Intrinsics.d(this.f14963d, d11.f14963d) && Intrinsics.d(this.f14964e, d11.f14964e) && Intrinsics.d(this.f14965f, d11.f14965f) && Intrinsics.d(this.f14966g, d11.f14966g) && Z1.u.c(this.f14967h, d11.f14967h) && Intrinsics.d(this.f14968i, d11.f14968i) && Intrinsics.d(this.f14969j, d11.f14969j) && Intrinsics.d(this.f14970k, d11.f14970k) && C7807Z.p(this.f14971l, d11.f14971l) && Intrinsics.d(this.f14974o, d11.f14974o);
    }

    public final boolean v(@NotNull D d11) {
        return Intrinsics.d(this.f14960a, d11.f14960a) && Intrinsics.d(this.f14972m, d11.f14972m) && Intrinsics.d(this.f14973n, d11.f14973n) && Intrinsics.d(this.f14975p, d11.f14975p);
    }

    public final int w() {
        int i11 = Z1.u.f35335d;
        int hashCode = Long.hashCode(this.f14961b) * 31;
        P1.F f7 = this.f14962c;
        int hashCode2 = (hashCode + (f7 != null ? f7.hashCode() : 0)) * 31;
        P1.A a11 = this.f14963d;
        int hashCode3 = (hashCode2 + (a11 != null ? Integer.hashCode(a11.b()) : 0)) * 31;
        P1.B b11 = this.f14964e;
        int hashCode4 = (hashCode3 + (b11 != null ? Integer.hashCode(b11.b()) : 0)) * 31;
        AbstractC3809p abstractC3809p = this.f14965f;
        int hashCode5 = (hashCode4 + (abstractC3809p != null ? abstractC3809p.hashCode() : 0)) * 31;
        String str = this.f14966g;
        int a12 = Pk0.c.a((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f14967h);
        V1.a aVar = this.f14968i;
        int hashCode6 = (a12 + (aVar != null ? Float.hashCode(aVar.b()) : 0)) * 31;
        V1.m mVar = this.f14969j;
        int hashCode7 = (hashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        R1.c cVar = this.f14970k;
        int hashCode8 = (hashCode7 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        int i12 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        int a13 = Pk0.c.a(hashCode8, 31, this.f14971l);
        z zVar = this.f14974o;
        return a13 + (zVar != null ? zVar.hashCode() : 0);
    }

    @NotNull
    public final D x(D d11) {
        if (d11 == null) {
            return this;
        }
        V1.l lVar = d11.f14960a;
        return E.b(this, lVar.a(), lVar.d(), lVar.getAlpha(), d11.f14961b, d11.f14962c, d11.f14963d, d11.f14964e, d11.f14965f, d11.f14966g, d11.f14967h, d11.f14968i, d11.f14969j, d11.f14970k, d11.f14971l, d11.f14972m, d11.f14973n, d11.f14974o, d11.f14975p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(AbstractC7799Q abstractC7799Q) {
        this(abstractC7799Q, Float.NaN, r3, null, null, null, null, null, r10, null, null, null, r15, null, null, null, null);
        long j11;
        long j12;
        long j13;
        j11 = Z1.u.f35334c;
        j12 = Z1.u.f35334c;
        j13 = C7807Z.f72259m;
    }

    public D(long j11, long j12, P1.F f7, P1.A a11, P1.B b11, AbstractC3809p abstractC3809p, String str, long j13, V1.a aVar, V1.m mVar, R1.c cVar, long j14, V1.i iVar, H0 h02, z zVar) {
        this(l.a.b(j11), j12, f7, a11, b11, abstractC3809p, str, j13, aVar, mVar, cVar, j14, iVar, h02, zVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(long j11, long j12, P1.F f7, P1.A a11, P1.B b11, AbstractC3809p abstractC3809p, String str, long j13, V1.a aVar, V1.m mVar, R1.c cVar, long j14, V1.i iVar, H0 h02, int i11) {
        this(r4, r6, (i11 & 4) != 0 ? null : f7, (i11 & 8) != 0 ? null : a11, (i11 & 16) != 0 ? null : b11, (i11 & 32) != 0 ? null : abstractC3809p, (i11 & 64) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Z1.u.f35334c : j13, (i11 & 256) != 0 ? null : aVar, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : mVar, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : cVar, (i11 & 2048) != 0 ? C7807Z.f72259m : j14, (i11 & 4096) != 0 ? null : iVar, (i11 & 8192) != 0 ? null : h02, (z) null);
        long j15;
        long j16;
        long j17;
        long j18;
        if ((i11 & 1) != 0) {
            j18 = C7807Z.f72259m;
            j15 = j18;
        } else {
            j15 = j11;
        }
        if ((i11 & 2) != 0) {
            j17 = Z1.u.f35334c;
            j16 = j17;
        } else {
            j16 = j12;
        }
    }

    public D(AbstractC7799Q abstractC7799Q, float f7, long j11, P1.F f11, P1.A a11, P1.B b11, AbstractC3809p abstractC3809p, String str, long j12, V1.a aVar, V1.m mVar, R1.c cVar, long j13, V1.i iVar, H0 h02, z zVar, AbstractC8413f abstractC8413f) {
        this(l.a.a(abstractC7799Q, f7), j11, f11, a11, b11, abstractC3809p, str, j12, aVar, mVar, cVar, j13, iVar, h02, zVar, abstractC8413f);
    }
}
