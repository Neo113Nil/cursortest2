package com.inmobi.media;

/* loaded from: classes5.dex */
public final class U2 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4987a;
    public final com.inmobi.media.Q2 b;
    public final com.inmobi.media.C2431gb c;
    public final java.lang.String d;
    public final com.inmobi.media.C2477i5 e;
    public final android.content.Context f;
    public final com.inmobi.media.C2502j5 g;
    public boolean h;
    public final java.lang.ref.WeakReference i;
    public final java.lang.ref.WeakReference j;

    public U2(java.lang.String urlToLoad, com.inmobi.media.Q2 q2, android.content.Context context, com.inmobi.media.C2279ai c2279ai, com.inmobi.media.InterfaceC2859wh redirectionValidator, com.inmobi.media.C2431gb c2431gb, java.lang.String api) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlToLoad, "urlToLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        this.f4987a = urlToLoad;
        this.b = q2;
        this.c = c2431gb;
        this.d = api;
        com.inmobi.media.C2477i5 c2477i5 = new com.inmobi.media.C2477i5();
        this.e = c2477i5;
        this.g = new com.inmobi.media.C2502j5(c2279ai, c2431gb);
        this.i = new java.lang.ref.WeakReference(c2279ai);
        this.j = new java.lang.ref.WeakReference(redirectionValidator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "connectionCallback");
        c2477i5.c = this;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f = applicationContext;
        com.inmobi.media.Xi.a(context, this);
    }

    public final com.inmobi.media.Ti a() {
        return new com.inmobi.media.Ti(new com.inmobi.media.R2(this), new com.inmobi.media.S2(), new com.inmobi.media.T2(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.inmobi.media.C2477i5 c2477i5 = this.e;
        android.content.Context context = this.f;
        c2477i5.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.inmobi.media.C2425g5 c2425g5 = c2477i5.b;
        if (c2425g5 != null) {
            context.unbindService(c2425g5);
            c2477i5.f5253a = null;
        }
        c2477i5.b = null;
        c2477i5.c = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void a(android.net.Uri uri) {
        androidx.browser.customtabs.CustomTabsIntent.Builder builder;
        androidx.browser.customtabs.CustomTabsSession newSession;
        com.inmobi.media.Q2 q2 = this.b;
        if (q2 != null) {
            try {
                builder = a(q2);
            } catch (java.lang.Error e) {
                e.getMessage();
                com.inmobi.media.C2477i5 c2477i5 = this.e;
                androidx.browser.customtabs.CustomTabsSession customTabsSession = c2477i5.d;
                if (customTabsSession == null) {
                    androidx.browser.customtabs.CustomTabsClient customTabsClient = c2477i5.f5253a;
                    newSession = customTabsClient != null ? customTabsClient.newSession(new com.inmobi.media.C2451h5(c2477i5)) : null;
                    c2477i5.d = newSession;
                    customTabsSession = newSession;
                }
                builder = new androidx.browser.customtabs.CustomTabsIntent.Builder(customTabsSession);
                builder.setUrlBarHidingEnabled(true);
            }
        } else {
            com.inmobi.media.C2477i5 c2477i52 = this.e;
            androidx.browser.customtabs.CustomTabsSession customTabsSession2 = c2477i52.d;
            if (customTabsSession2 == null) {
                androidx.browser.customtabs.CustomTabsClient customTabsClient2 = c2477i52.f5253a;
                newSession = customTabsClient2 != null ? customTabsClient2.newSession(new com.inmobi.media.C2451h5(c2477i52)) : null;
                c2477i52.d = newSession;
                customTabsSession2 = newSession;
            }
            builder = new androidx.browser.customtabs.CustomTabsIntent.Builder(customTabsSession2);
            builder.setUrlBarHidingEnabled(true);
        }
        android.content.Context context = this.f;
        androidx.browser.customtabs.CustomTabsIntent build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        com.inmobi.media.C2279ai c2279ai = (com.inmobi.media.C2279ai) this.i.get();
        com.inmobi.media.C2431gb c2431gb = this.c;
        java.lang.Object obj = this.j.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        com.inmobi.media.AbstractC2398f5.a(context, build, uri, c2279ai, c2431gb, (com.inmobi.media.InterfaceC2859wh) obj, this.d);
    }

    public final androidx.browser.customtabs.CustomTabsIntent.Builder a(com.inmobi.media.Q2 q2) {
        android.graphics.Bitmap bitmap;
        com.inmobi.media.C2477i5 c2477i5 = this.e;
        androidx.browser.customtabs.CustomTabsSession customTabsSession = c2477i5.d;
        if (customTabsSession == null) {
            androidx.browser.customtabs.CustomTabsClient customTabsClient = c2477i5.f5253a;
            customTabsSession = customTabsClient != null ? customTabsClient.newSession(new com.inmobi.media.C2451h5(c2477i5)) : null;
            c2477i5.d = customTabsSession;
        }
        androidx.browser.customtabs.CustomTabsIntent.Builder closeButtonPosition = new androidx.browser.customtabs.CustomTabsIntent.Builder(customTabsSession).setCloseButtonPosition(2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(closeButtonPosition, "setCloseButtonPosition(...)");
        try {
            closeButtonPosition.setShareState(2);
            closeButtonPosition.setShowTitle(false);
            closeButtonPosition.setDownloadButtonEnabled(false);
            kotlin.jvm.internal.Intrinsics.checkNotNull(closeButtonPosition.setBookmarksButtonEnabled(false));
        } catch (java.lang.Error e) {
            e.getMessage();
        }
        if (q2.b) {
            android.content.Context context = this.f;
            int i = com.inmobi.ads.R.drawable.im_close_transparent;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
            android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, i);
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            } else {
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, android.graphics.Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(width, height, config)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = createBitmap;
            }
            closeButtonPosition.setCloseButtonIcon(bitmap);
        }
        com.inmobi.media.P5 h = com.inmobi.media.N5.h();
        com.inmobi.media.Lf a2 = com.inmobi.media.Mf.a(com.inmobi.media.N5.g());
        if (a2 != com.inmobi.media.Lf.b && a2 != com.inmobi.media.Lf.d) {
            closeButtonPosition.setInitialActivityHeightPx((int) (((int) (h.b * q2.f4908a)) * h.c), 2);
        } else {
            int i2 = (int) (h.f4888a * q2.f4908a);
            closeButtonPosition.setInitialActivityWidthPx((int) (i2 * h.c));
            closeButtonPosition.setActivitySideSheetBreakpointDp(i2);
        }
        closeButtonPosition.setUrlBarHidingEnabled(true);
        return closeButtonPosition;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        com.inmobi.media.C2279ai c2279ai = (com.inmobi.media.C2279ai) this.i.get();
        if (c2279ai != null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2279ai.f5106a.i;
            if (interfaceC2772t9 != null) {
                java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "onCCTLayout");
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = c2279ai.f5106a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "customTabLayout");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("left", com.inmobi.media.J3.a(i));
            jSONObject2.put("top", com.inmobi.media.J3.a(i2));
            jSONObject2.put("right", com.inmobi.media.J3.a(i3));
            jSONObject2.put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, com.inmobi.media.J3.a(i4));
            jSONObject2.put("state", i5);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            jSONObject.put("layout", jSONObject2);
            gestureDetectorOnGestureListenerC2675pi.b(jSONObject);
        }
    }
}
