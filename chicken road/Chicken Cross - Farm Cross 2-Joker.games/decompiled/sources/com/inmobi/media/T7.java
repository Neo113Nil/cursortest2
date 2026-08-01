package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T7 {
    public static final Q7 k = new Q7();

    /* renamed from: a, reason: collision with root package name */
    public final byte f6866a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final Y9 f;
    public C4044r9 g;
    public C4209x8 h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final R7 j = new R7(this);

    public T7(byte b, String str, int i, int i2, int i3, Y9 y9) {
        this.f6866a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = y9;
    }

    public final void a(View view) {
        C4044r9 c4044r9;
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (Intrinsics.areEqual(this.b, "video") || Intrinsics.areEqual(this.b, "audio") || (c4044r9 = this.g) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        c4044r9.f7346a.remove(view);
        c4044r9.b.remove(view);
        c4044r9.c.a(view);
        if (c4044r9.f7346a.isEmpty()) {
            Y9 y92 = this.f;
            if (y92 != null) {
                ((Z9) y92).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            C4044r9 c4044r92 = this.g;
            if (c4044r92 != null) {
                c4044r92.f7346a.clear();
                c4044r92.b.clear();
                c4044r92.c.a();
                c4044r92.e.removeMessages(0);
                c4044r92.c.b();
            }
            this.g = null;
        }
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        C4209x8 c4209x8 = this.h;
        if (c4209x8 != null) {
            c4209x8.a(view);
            if (c4209x8.f7131a.isEmpty()) {
                Y9 y92 = this.f;
                if (y92 != null) {
                    ((Z9) y92).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                C4209x8 c4209x82 = this.h;
                if (c4209x82 != null) {
                    c4209x82.b();
                }
                this.h = null;
            }
        }
        this.i.remove(view);
    }

    public final void a(View view, View token, Zp listener, AdConfig.ViewabilityConfig config, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(config, "config");
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        C4209x8 c4209x8 = this.h;
        if (c4209x8 == null) {
            if (z) {
                c4209x8 = new C4095t4(config, this.f);
            } else {
                c4209x8 = new C4209x8(config, (byte) 1, this.f);
            }
            this.h = c4209x8;
        }
        S7 s7 = new S7(this);
        Y9 y92 = c4209x8.d;
        if (y92 != null) {
            ((Z9) y92).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        c4209x8.h = s7;
        this.i.put(view, listener);
        if (z) {
            i = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            i = this.e;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        c4209x8.a(view, view, token, i);
    }

    public final void a() {
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "onActivityStarted");
        }
        C4044r9 c4044r9 = this.g;
        if (c4044r9 != null) {
            String TAG = c4044r9.d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            for (Map.Entry entry : c4044r9.f7346a.entrySet()) {
                View view = (View) entry.getKey();
                C3988p9 c3988p9 = (C3988p9) entry.getValue();
                C4209x8 c4209x8 = c4044r9.c;
                View view2 = c3988p9.f7301a;
                int i = c3988p9.b;
                c4209x8.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                c4209x8.a(view, view, view2, i);
            }
            if (!c4044r9.e.hasMessages(0)) {
                c4044r9.e.postDelayed(c4044r9.f, c4044r9.g);
            }
            c4044r9.c.f();
        }
        C4209x8 c4209x82 = this.h;
        if (c4209x82 != null) {
            c4209x82.f();
        }
    }

    public final C4044r9 a(byte b, AdConfig.ViewabilityConfig viewabilityConfig) {
        C4044r9 c4044r9 = this.g;
        if (c4044r9 != null) {
            return c4044r9;
        }
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b));
        }
        C4209x8 c4209x8 = new C4209x8(viewabilityConfig, b, this.f);
        Y9 y92 = this.f;
        if (y92 != null) {
            ((Z9) y92).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b));
        }
        C4044r9 c4044r92 = new C4044r9(viewabilityConfig, c4209x8, this.j);
        this.g = c4044r92;
        return c4044r92;
    }
}
