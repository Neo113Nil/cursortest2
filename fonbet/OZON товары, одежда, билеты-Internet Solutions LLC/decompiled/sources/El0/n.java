package El0;

import C.o0;
import Kk.C3532b;
import android.app.Application;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f8115a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f8116b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Hl0.a f8117c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final K f8118d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final K f8119e;

    /* renamed from: f, reason: collision with root package name */
    public final Za.c f8120f;

    /* renamed from: g, reason: collision with root package name */
    public final Za.c f8121g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final Za.a f8122h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<Za.a> f8123i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f8124j;

    public n(@NotNull Application application, @NotNull String projectId, @NotNull Hl0.a logger, @NotNull K additionalAuthProviders, @NotNull K additionalPushProviders, Za.c cVar, Za.c cVar2, @NotNull Za.a aVar, @NotNull List providers, @NotNull String sdkType) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(additionalAuthProviders, "additionalAuthProviders");
        Intrinsics.checkNotNullParameter(additionalPushProviders, "additionalPushProviders");
        Intrinsics.checkNotNullParameter(aVar, "default");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        this.f8115a = application;
        this.f8116b = projectId;
        this.f8117c = logger;
        this.f8118d = additionalAuthProviders;
        this.f8119e = additionalPushProviders;
        this.f8120f = cVar;
        this.f8121g = cVar2;
        this.f8122h = aVar;
        this.f8123i = providers;
        this.f8124j = sdkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f8115a, nVar.f8115a) && Intrinsics.d(this.f8116b, nVar.f8116b) && this.f8117c.equals(nVar.f8117c) && Intrinsics.d(this.f8118d, nVar.f8118d) && Intrinsics.d(this.f8119e, nVar.f8119e) && Intrinsics.d(this.f8120f, nVar.f8120f) && Intrinsics.d(this.f8121g, nVar.f8121g) && Intrinsics.d(this.f8122h, nVar.f8122h) && Intrinsics.d(this.f8123i, nVar.f8123i) && Intrinsics.d(this.f8124j, nVar.f8124j);
    }

    public final int hashCode() {
        int hashCode = (this.f8117c.hashCode() + G.g.a(this.f8115a.hashCode() * 31, 961, this.f8116b)) * 31;
        this.f8118d.getClass();
        this.f8119e.getClass();
        int i11 = (1 + ((hashCode + 1) * 31)) * 31;
        Za.c cVar = this.f8120f;
        int hashCode2 = (i11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Za.c cVar2 = this.f8121g;
        return G.g.a(C3532b.a(G.g.b((this.f8122h.hashCode() + ((hashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31)) * 31, 31, this.f8123i), 31, false), 31, this.f8124j);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkpnsConfig(application=");
        sb2.append(this.f8115a);
        sb2.append(", projectId=");
        sb2.append(this.f8116b);
        sb2.append(", clientIdCallback=null, logger=");
        sb2.append(this.f8117c);
        sb2.append(", additionalAuthProviders=");
        sb2.append(this.f8118d);
        sb2.append(", additionalPushProviders=");
        sb2.append(this.f8119e);
        sb2.append(", hostInfoProvider=");
        sb2.append(this.f8120f);
        sb2.append(", topicHostInfoProvider=");
        sb2.append(this.f8121g);
        sb2.append(", default=");
        sb2.append(this.f8122h);
        sb2.append(", providers=");
        sb2.append(this.f8123i);
        sb2.append(", testModeEnabled=false, sdkType=");
        return o0.c(sb2, this.f8124j, ", pushAdsProvider=null)");
    }
}
