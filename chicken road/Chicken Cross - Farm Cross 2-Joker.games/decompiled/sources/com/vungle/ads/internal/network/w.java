package com.vungle.ads.internal.network;

import androidx.core.util.Consumer;
import com.vungle.ads.UserAgentError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.l2;

/* loaded from: classes7.dex */
public final class w implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VungleApiClient f12061a;
    public final /* synthetic */ l2 b;

    public w(VungleApiClient vungleApiClient, l2 l2Var) {
        this.f12061a = vungleApiClient;
        this.b = l2Var;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        String str;
        String str2 = (String) obj;
        if ((str2 == null || str2.length() == 0) && ((str = this.f12061a.i) == null || str.length() == 0)) {
            ((com.vungle.ads.internal.platform.c) this.f12061a.b).getClass();
            str2 = System.getProperty("http.agent");
        }
        if (str2 == null || str2.length() == 0) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("VungleApiClient", "All UA sources failed, logging USER_AGENT_ERROR");
            new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
        } else {
            this.b.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.b, (com.vungle.ads.internal.util.s) null, 6);
            this.f12061a.i = str2;
        }
    }
}
