package Lf0;

import Gf0.F;
import Gf0.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import qf0.d;
import rf0.AbstractC9267a;
import xe.B0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17070a;

    /* renamed from: b, reason: collision with root package name */
    private final F f17071b;

    /* renamed from: c, reason: collision with root package name */
    private final G f17072c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f17073d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumC9053a f17074e;

    /* renamed from: f, reason: collision with root package name */
    private final B0 f17075f;

    public c(@NotNull String domain, F f7, G g10, Long l11, @NotNull EnumC9053a domainStatus, B0 b02) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(domainStatus, "domainStatus");
        this.f17070a = domain;
        this.f17071b = f7;
        this.f17072c = g10;
        this.f17073d = l11;
        this.f17074e = domainStatus;
        this.f17075f = b02;
    }

    public static c a(c cVar, Long l11, EnumC9053a enumC9053a, B0 b02, int i11) {
        if ((i11 & 8) != 0) {
            l11 = cVar.f17073d;
        }
        Long l12 = l11;
        if ((i11 & 16) != 0) {
            enumC9053a = cVar.f17074e;
        }
        EnumC9053a domainStatus = enumC9053a;
        if ((i11 & 32) != 0) {
            b02 = cVar.f17075f;
        }
        String domain = cVar.f17070a;
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(domainStatus, "domainStatus");
        return new c(domain, cVar.f17071b, cVar.f17072c, l12, domainStatus, b02);
    }

    @NotNull
    public final String b() {
        return this.f17070a;
    }

    @NotNull
    public final EnumC9053a c() {
        return this.f17074e;
    }

    public final Long d() {
        return this.f17073d;
    }

    public final B0 e() {
        return this.f17075f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f17070a, cVar.f17070a) && Intrinsics.d(this.f17071b, cVar.f17071b) && Intrinsics.d(this.f17072c, cVar.f17072c) && Intrinsics.d(this.f17073d, cVar.f17073d) && this.f17074e == cVar.f17074e && Intrinsics.d(this.f17075f, cVar.f17075f);
    }

    public final AbstractC9267a f() {
        return this.f17071b;
    }

    public final d.b g() {
        return this.f17072c;
    }

    public final int hashCode() {
        int hashCode = this.f17070a.hashCode() * 31;
        F f7 = this.f17071b;
        int hashCode2 = (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31;
        G g10 = this.f17072c;
        int hashCode3 = (hashCode2 + (g10 == null ? 0 : g10.hashCode())) * 31;
        Long l11 = this.f17073d;
        int hashCode4 = (this.f17074e.hashCode() + ((hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31)) * 31;
        B0 b02 = this.f17075f;
        return hashCode4 + (b02 != null ? b02.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DomainData(domain=" + this.f17070a + ", pingConfig=" + this.f17071b + ", pingMode=" + this.f17072c + ", lastUpdateTimestamp=" + this.f17073d + ", domainStatus=" + this.f17074e + ", observeJob=" + this.f17075f + ")";
    }
}
