package com.vungle.ads.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes7.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BlockingQueue f12201a;

    public y(LinkedBlockingQueue linkedBlockingQueue) {
        this.f12201a = linkedBlockingQueue;
    }

    @Override // com.vungle.ads.internal.w
    public final void a() {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AnalyticsClient", com.iab.omid.library.vungle.internal.l.a("Failed to send ").append(this.f12201a.size()).append(" metrics").toString());
        AnalyticsClient.INSTANCE.getClass();
        AnalyticsClient.b.addAll(this.f12201a);
    }

    @Override // com.vungle.ads.internal.w
    public final void onSuccess() {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AnalyticsClient", com.iab.omid.library.vungle.internal.l.a("Sent ").append(this.f12201a.size()).append(" metrics").toString());
    }
}
