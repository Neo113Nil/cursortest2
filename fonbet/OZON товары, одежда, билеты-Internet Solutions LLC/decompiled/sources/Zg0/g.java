package Zg0;

import B0.C2454a;
import Kk.C3532b;
import Zg0.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35947a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35948b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f35949c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35950d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<h> f35951e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b.a f35952f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f35953g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final e f35954h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final i f35955i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f35956j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f35957k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35958l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final c f35959m;

    /* renamed from: n, reason: collision with root package name */
    private final Ld0.c f35960n;

    public g() {
        throw null;
    }

    public g(String appName, String appBuildType, a appInstanceIdProvider, int i11, List notificationChannels, e networkClientConfiguration, i ruStorePushConfiguration, boolean z11, c debugConfiguration, Ld0.c cVar) {
        b.a autoTrackChannelConfiguration = new b.a(0);
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appBuildType, "appBuildType");
        Intrinsics.checkNotNullParameter(appInstanceIdProvider, "appInstanceIdProvider");
        Intrinsics.checkNotNullParameter(notificationChannels, "notificationChannels");
        Intrinsics.checkNotNullParameter(autoTrackChannelConfiguration, "autoTrackChannelConfiguration");
        Intrinsics.checkNotNullParameter(networkClientConfiguration, "networkClientConfiguration");
        Intrinsics.checkNotNullParameter(ruStorePushConfiguration, "ruStorePushConfiguration");
        Intrinsics.checkNotNullParameter(debugConfiguration, "debugConfiguration");
        this.f35947a = appName;
        this.f35948b = appBuildType;
        this.f35949c = appInstanceIdProvider;
        this.f35950d = i11;
        this.f35951e = notificationChannels;
        this.f35952f = autoTrackChannelConfiguration;
        this.f35953g = true;
        this.f35954h = networkClientConfiguration;
        this.f35955i = ruStorePushConfiguration;
        this.f35956j = true;
        this.f35957k = true;
        this.f35958l = z11;
        this.f35959m = debugConfiguration;
        this.f35960n = cVar;
    }

    @NotNull
    public final String a() {
        return this.f35948b;
    }

    @NotNull
    public final a b() {
        return this.f35949c;
    }

    @NotNull
    public final String c() {
        return this.f35947a;
    }

    @NotNull
    public final b d() {
        return this.f35952f;
    }

    @NotNull
    public final c e() {
        return this.f35959m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f35947a, gVar.f35947a) && Intrinsics.d(this.f35948b, gVar.f35948b) && Intrinsics.d(this.f35949c, gVar.f35949c) && this.f35950d == gVar.f35950d && Intrinsics.d(this.f35951e, gVar.f35951e) && Intrinsics.d(this.f35952f, gVar.f35952f) && this.f35953g == gVar.f35953g && Intrinsics.d(this.f35954h, gVar.f35954h) && Intrinsics.d(this.f35955i, gVar.f35955i) && this.f35956j == gVar.f35956j && this.f35957k == gVar.f35957k && this.f35958l == gVar.f35958l && Intrinsics.d(this.f35959m, gVar.f35959m) && Intrinsics.d(this.f35960n, gVar.f35960n);
    }

    public final Ld0.c f() {
        return this.f35960n;
    }

    public final boolean g() {
        return this.f35958l;
    }

    public final boolean h() {
        return this.f35957k;
    }

    public final int hashCode() {
        int hashCode = (this.f35959m.hashCode() + C3532b.a(C3532b.a(C3532b.a((this.f35955i.hashCode() + ((this.f35954h.hashCode() + C3532b.a((this.f35952f.hashCode() + G.g.b(C2454a.a(this.f35950d, (this.f35949c.hashCode() + G.g.a(this.f35947a.hashCode() * 31, 31, this.f35948b)) * 31, 31), 31, this.f35951e)) * 31, 31, this.f35953g)) * 31)) * 31, 31, this.f35956j), 31, this.f35957k), 31, this.f35958l)) * 31;
        Ld0.c cVar = this.f35960n;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    @NotNull
    public final e i() {
        return this.f35954h;
    }

    @NotNull
    public final List<h> j() {
        return this.f35951e;
    }

    public final int k() {
        return this.f35950d;
    }

    @NotNull
    public final i l() {
        return this.f35955i;
    }

    public final boolean m() {
        return this.f35953g;
    }

    public final boolean n() {
        return this.f35956j;
    }

    @NotNull
    public final String toString() {
        return "PushConfiguration(appName=" + this.f35947a + ", appBuildType=" + this.f35948b + ", appInstanceIdProvider=" + this.f35949c + ", pushIcon=" + this.f35950d + ", notificationChannels=" + this.f35951e + ", autoTrackChannelConfiguration=" + this.f35952f + ", sendPushStatusesDirectly=" + this.f35953g + ", networkClientConfiguration=" + this.f35954h + ", ruStorePushConfiguration=" + this.f35955i + ", useV3Analytics=" + this.f35956j + ", migrateToNewHwId=" + this.f35957k + ", logIncorrectHwIdsMigrations=" + this.f35958l + ", debugConfiguration=" + this.f35959m + ", diStore=" + this.f35960n + ")";
    }
}
