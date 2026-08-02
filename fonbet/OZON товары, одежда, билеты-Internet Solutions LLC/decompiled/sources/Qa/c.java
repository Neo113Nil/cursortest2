package Qa;

import B0.C2454a;
import Kk.C3532b;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Ja.a> f23198a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23199b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23200c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23201d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23202e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23203f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23204g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23205h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23206i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f23207j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f23208k;

    static {
        new c(null, false, 0, 16383);
    }

    public c() {
        this(null, false, 0, 16383);
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.f23208k;
    }

    public final boolean b() {
        return this.f23202e;
    }

    public final boolean c() {
        return this.f23206i;
    }

    public final boolean d() {
        return this.f23203f;
    }

    @NotNull
    public final List<Ja.a> e() {
        return this.f23198a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f23198a, cVar.f23198a) && this.f23199b == cVar.f23199b && this.f23200c == cVar.f23200c && this.f23201d == cVar.f23201d && this.f23202e == cVar.f23202e && this.f23203f == cVar.f23203f && this.f23204g == cVar.f23204g && this.f23205h == cVar.f23205h && this.f23206i == cVar.f23206i && this.f23207j == cVar.f23207j && Intrinsics.d(this.f23208k, cVar.f23208k);
    }

    public final int f() {
        return this.f23200c;
    }

    public final int g() {
        return this.f23199b;
    }

    public final boolean h() {
        return this.f23204g;
    }

    public final int hashCode() {
        return this.f23208k.hashCode() + C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.f23201d, C2454a.a(this.f23200c, C2454a.a(this.f23199b, this.f23198a.hashCode() * 31, 31), 31), 31), 31, this.f23202e), 31, this.f23203f), 31, false), 31, false), 31, false), 31, this.f23204g), 31, this.f23205h), 31, this.f23206i), 31, this.f23207j);
    }

    public final int i() {
        return this.f23201d;
    }

    public final boolean j() {
        return this.f23207j;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CronetQuic(hints=");
        sb2.append(this.f23198a);
        sb2.append(", maxServerConfigs=");
        sb2.append(this.f23199b);
        sb2.append(", idleConnectionTimeout=");
        sb2.append(this.f23200c);
        sb2.append(", reducedPingTimeout=");
        sb2.append(this.f23201d);
        sb2.append(", closeSessionOnIpChange=");
        sb2.append(this.f23202e);
        sb2.append(", goAwaySessionOnIpChange=");
        sb2.append(this.f23203f);
        sb2.append(", migrateSessionOnNetworkChange=false, migrateSessionEarly=false, migrateIdleSession=false, originsToForceQuicOn=");
        sb2.append(this.f23204g);
        sb2.append(", recvBufferOptimizations=");
        sb2.append(this.f23205h);
        sb2.append(", disableTlsZeroRtt=");
        sb2.append(this.f23206i);
        sb2.append(", retryAlternateNetworkBeforeHandshake=");
        sb2.append(this.f23207j);
        sb2.append(", additional=");
        return P.f(sb2, this.f23208k, ")");
    }

    public c(List hints, boolean z11, int i11, int i12) {
        hints = (i12 & 1) != 0 ? K.f71697a : hints;
        i11 = (i12 & 2) != 0 ? 0 : i11;
        int i13 = (i12 & 4) != 0 ? 30 : 300;
        z11 = (i12 & 2048) != 0 ? true : z11;
        Map<String, Object> additional = U.c();
        Intrinsics.checkNotNullParameter(hints, "hints");
        Intrinsics.checkNotNullParameter(additional, "additional");
        this.f23198a = hints;
        this.f23199b = i11;
        this.f23200c = i13;
        this.f23201d = 5;
        this.f23202e = true;
        this.f23203f = true;
        this.f23204g = true;
        this.f23205h = true;
        this.f23206i = z11;
        this.f23207j = true;
        this.f23208k = additional;
    }
}
