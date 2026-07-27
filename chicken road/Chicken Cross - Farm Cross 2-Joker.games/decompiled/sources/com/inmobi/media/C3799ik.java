package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.EngagementSignalsCallback;

/* renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3799ik implements EngagementSignalsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final C3953o3 f7166a;
    public final C3982p3 b;
    public final C4010q3 c;

    public C3799ik(C3953o3 c3953o3, C3982p3 c3982p3, C4010q3 c4010q3) {
        this.f7166a = c3953o3;
        this.b = c3982p3;
        this.c = c4010q3;
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.b.a(i);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.c.a(z);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            C4038r3 c4038r3 = this.f7166a.f7278a;
            if (c4038r3.j) {
                return;
            }
            c4038r3.j = true;
            C3998pj c3998pj = (C3998pj) c4038r3.k.get();
            if (c3998pj != null) {
                Ej.h1.getClass();
                c3998pj.a(C3855kj.a("IN_NATIVE_BROWSER", "onScroll"));
            }
        } catch (Exception unused) {
        }
    }
}
