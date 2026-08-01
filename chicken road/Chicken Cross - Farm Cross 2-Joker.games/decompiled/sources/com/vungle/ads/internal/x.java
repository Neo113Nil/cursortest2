package com.vungle.ads.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes7.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BlockingQueue f12199a;

    public x(LinkedBlockingQueue linkedBlockingQueue) {
        this.f12199a = linkedBlockingQueue;
    }

    @Override // com.vungle.ads.internal.w
    public final void a() {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AnalyticsClient", com.iab.omid.library.vungle.internal.l.a("Failed to send ").append(this.f12199a.size()).append(" errors").toString());
        AnalyticsClient.INSTANCE.getClass();
        AnalyticsClient.f11881a.addAll(this.f12199a);
    }

    @Override // com.vungle.ads.internal.w
    public final void onSuccess() {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AnalyticsClient", com.iab.omid.library.vungle.internal.l.a("Sent ").append(this.f12199a.size()).append(" errors").toString());
    }
}
