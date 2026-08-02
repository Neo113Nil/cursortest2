package Gf0;

import B0.C2454a;
import C.o0;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10119a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10120b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qf0.b f10121c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Lf0.d f10122d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10123e;

    /* renamed from: f, reason: collision with root package name */
    private final long f10124f;

    /* renamed from: g, reason: collision with root package name */
    private final long f10125g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f10126h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10127i;

    public D(@NotNull String domain, int i11, @NotNull qf0.b networkMode, @NotNull Lf0.d protocolType, int i12, long j11, long j12, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(networkMode, "networkMode");
        Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.f10119a = domain;
        this.f10120b = i11;
        this.f10121c = networkMode;
        this.f10122d = protocolType;
        this.f10123e = i12;
        this.f10124f = j11;
        this.f10125g = j12;
        this.f10126h = z11;
        this.f10127i = str;
    }

    public static D a(D d11, String str, int i11, qf0.b bVar, Lf0.d dVar, int i12, long j11, long j12, boolean z11, String str2, int i13) {
        if ((i13 & 1) != 0) {
            str = d11.f10119a;
        }
        String domain = str;
        if ((i13 & 2) != 0) {
            i11 = d11.f10120b;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            bVar = d11.f10121c;
        }
        qf0.b networkMode = bVar;
        Lf0.d protocolType = (i13 & 8) != 0 ? d11.f10122d : dVar;
        int i15 = (i13 & 16) != 0 ? d11.f10123e : i12;
        long j13 = (i13 & 32) != 0 ? d11.f10124f : j11;
        long j14 = (i13 & 64) != 0 ? d11.f10125g : j12;
        boolean z12 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? d11.f10126h : z11;
        String str3 = (i13 & 256) != 0 ? d11.f10127i : str2;
        d11.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(networkMode, "networkMode");
        Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        return new D(domain, i14, networkMode, protocolType, i15, j13, j14, z12, str3);
    }

    public final boolean b() {
        return this.f10126h;
    }

    @NotNull
    public final String c() {
        return this.f10119a;
    }

    public final String d() {
        return this.f10127i;
    }

    @NotNull
    public final qf0.b e() {
        return this.f10121c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d11 = (D) obj;
        return Intrinsics.d(this.f10119a, d11.f10119a) && this.f10120b == d11.f10120b && this.f10121c == d11.f10121c && this.f10122d == d11.f10122d && this.f10123e == d11.f10123e && this.f10124f == d11.f10124f && this.f10125g == d11.f10125g && this.f10126h == d11.f10126h && Intrinsics.d(this.f10127i, d11.f10127i);
    }

    public final int f() {
        return this.f10123e;
    }

    @NotNull
    public final Lf0.d g() {
        return this.f10122d;
    }

    public final int h() {
        return this.f10120b;
    }

    public final int hashCode() {
        int a11 = C3532b.a(Pk0.c.a(Pk0.c.a(C2454a.a(this.f10123e, (this.f10122d.hashCode() + ((this.f10121c.hashCode() + C2454a.a(this.f10120b, this.f10119a.hashCode() * 31, 31)) * 31)) * 31, 31), 31, this.f10124f), 31, this.f10125g), 31, this.f10126h);
        String str = this.f10127i;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    public final long i() {
        return this.f10124f;
    }

    public final long j() {
        return this.f10125g;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddDomainUiState(domain=");
        sb2.append(this.f10119a);
        sb2.append(", retryAttempts=");
        sb2.append(this.f10120b);
        sb2.append(", networkMode=");
        sb2.append(this.f10121c);
        sb2.append(", protocolType=");
        sb2.append(this.f10122d);
        sb2.append(", port=");
        sb2.append(this.f10123e);
        sb2.append(", retryAvailableDomainAfterMillis=");
        sb2.append(this.f10124f);
        sb2.append(", retryNotAvailableDomainAfterMillis=");
        sb2.append(this.f10125g);
        sb2.append(", addButtonEnabled=");
        sb2.append(this.f10126h);
        sb2.append(", errorMessage=");
        return o0.c(sb2, this.f10127i, ")");
    }
}
