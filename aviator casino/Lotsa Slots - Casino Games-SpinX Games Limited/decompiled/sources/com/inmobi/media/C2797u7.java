package com.inmobi.media;

/* renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2797u7 {
    public static final com.inmobi.media.C2715r7 k = new com.inmobi.media.C2715r7();

    /* renamed from: a, reason: collision with root package name */
    public final byte f5482a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;
    public final com.inmobi.media.InterfaceC2772t9 f;
    public com.inmobi.media.N8 g;
    public com.inmobi.media.X7 h;
    public final java.util.LinkedHashMap i = new java.util.LinkedHashMap();
    public final com.inmobi.media.C2741s7 j = new com.inmobi.media.C2741s7(this);

    public C2797u7(byte b, java.lang.String str, int i, int i2, int i3, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        this.f5482a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = interfaceC2772t9;
    }

    public final void a(android.view.View view) {
        com.inmobi.media.N8 n8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.b, "video") || kotlin.jvm.internal.Intrinsics.areEqual(this.b, "audio") || (n8 = this.g) == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        n8.f4850a.remove(view);
        n8.b.remove(view);
        n8.c.a(view);
        if (n8.f4850a.isEmpty()) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            com.inmobi.media.N8 n82 = this.g;
            if (n82 != null) {
                n82.f4850a.clear();
                n82.b.clear();
                n82.c.a();
                n82.e.removeMessages(0);
                n82.c.b();
            }
            this.g = null;
        }
    }

    public final void b(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        com.inmobi.media.X7 x7 = this.h;
        if (x7 != null) {
            x7.a(view);
            if (x7.f5302a.isEmpty()) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
                if (interfaceC2772t92 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                com.inmobi.media.X7 x72 = this.h;
                if (x72 != null) {
                    x72.b();
                }
                this.h = null;
            }
        }
        this.i.remove(view);
    }

    public final void a(android.view.View view, android.view.View token, com.inmobi.media.InterfaceC2339co listener, com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig config, boolean z) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        com.inmobi.media.X7 x7 = this.h;
        if (x7 == null) {
            if (z) {
                x7 = new com.inmobi.media.W3(config, this.f);
            } else {
                x7 = new com.inmobi.media.X7(config, (byte) 1, this.f);
            }
            this.h = x7;
        }
        com.inmobi.media.C2770t7 c2770t7 = new com.inmobi.media.C2770t7(this);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = x7.d;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        x7.h = c2770t7;
        this.i.put(view, listener);
        if (z) {
            i = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            i = this.e;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        x7.a(view, view, token, i);
    }

    public final void a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("HtmlAdTracker", "onActivityStarted");
        }
        com.inmobi.media.N8 n8 = this.g;
        if (n8 != null) {
            java.lang.String TAG = n8.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            for (java.util.Map.Entry entry : n8.f4850a.entrySet()) {
                android.view.View view = (android.view.View) entry.getKey();
                com.inmobi.media.L8 l8 = (com.inmobi.media.L8) entry.getValue();
                com.inmobi.media.X7 x7 = n8.c;
                android.view.View view2 = l8.f4813a;
                int i = l8.b;
                x7.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                x7.a(view, view, view2, i);
            }
            if (!n8.e.hasMessages(0)) {
                n8.e.postDelayed(n8.f, n8.g);
            }
            n8.c.f();
        }
        com.inmobi.media.X7 x72 = this.h;
        if (x72 != null) {
            x72.f();
        }
    }

    public final com.inmobi.media.N8 a(byte b, com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewabilityConfig) {
        com.inmobi.media.N8 n8 = this.g;
        if (n8 != null) {
            return n8;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b));
        }
        com.inmobi.media.X7 x7 = new com.inmobi.media.X7(viewabilityConfig, b, this.f);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.f;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b));
        }
        com.inmobi.media.N8 n82 = new com.inmobi.media.N8(viewabilityConfig, x7, this.j);
        this.g = n82;
        return n82;
    }
}
