package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ti implements androidx.browser.customtabs.EngagementSignalsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.R2 f4980a;
    public final com.inmobi.media.S2 b;
    public final com.inmobi.media.T2 c;

    public Ti(com.inmobi.media.R2 r2, com.inmobi.media.S2 s2, com.inmobi.media.T2 t2) {
        this.f4980a = r2;
        this.b = s2;
        this.c = t2;
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) {
        try {
            this.b.a(i);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z, android.os.Bundle bundle) {
        try {
            this.c.a(z);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) {
        try {
            com.inmobi.media.U2 u2 = this.f4980a.f4929a;
            if (u2.h) {
                return;
            }
            u2.h = true;
            com.inmobi.media.C2279ai c2279ai = (com.inmobi.media.C2279ai) u2.i.get();
            if (c2279ai != null) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                c2279ai.a(com.inmobi.media.Vh.a("IN_NATIVE_BROWSER", "onScroll"));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
