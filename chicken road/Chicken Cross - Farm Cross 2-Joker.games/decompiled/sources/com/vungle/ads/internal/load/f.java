package com.vungle.ads.internal.load;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11938a;
    public final /* synthetic */ i0 b;

    public f(i iVar, i0 i0Var) {
        this.f11938a = iVar;
        this.b = i0Var;
    }

    public final void a() {
        this.f11938a.y.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        i iVar = this.f11938a;
        AnalyticsClient.a(analyticsClient, iVar.y, iVar.z, 4);
        boolean z = u.f12190a;
        t.b("BaseAdLoader", "fail to load ad");
        this.f11938a.i();
        a aVar = this.f11938a.k;
        if (aVar != null) {
            aVar.onSuccess(this.b);
        }
    }

    public final void b() {
        this.f11938a.y.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        i iVar = this.f11938a;
        AnalyticsClient.a(analyticsClient, iVar.y, iVar.z, 4);
        this.f11938a.i();
        a aVar = this.f11938a.k;
        if (aVar != null) {
            aVar.onSuccess(this.b);
        }
    }
}
