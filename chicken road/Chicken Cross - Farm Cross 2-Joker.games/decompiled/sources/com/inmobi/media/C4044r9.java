package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.r9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4044r9 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f7346a;
    public final WeakHashMap b;
    public final C4209x8 c;
    public final String d;
    public final Handler e;
    public final RunnableC4016q9 f;
    public final long g;
    public final R7 h;

    public C4044r9(AdConfig.ViewabilityConfig viewabilityConfig, C4209x8 visibilityTracker, R7 listener) {
        Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f7346a = weakHashMap;
        this.b = weakHashMap2;
        this.c = visibilityTracker;
        this.d = "r9";
        this.g = viewabilityConfig.getImpressionPollIntervalMillis();
        C3960o9 c3960o9 = new C3960o9(this);
        Y9 y9 = visibilityTracker.d;
        if (y9 != null) {
            ((Z9) y9).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.h = c3960o9;
        this.e = handler;
        this.f = new RunnableC4016q9(this);
        this.h = listener;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f7346a.remove(view);
        this.b.remove(view);
        this.c.a(view);
    }
}
