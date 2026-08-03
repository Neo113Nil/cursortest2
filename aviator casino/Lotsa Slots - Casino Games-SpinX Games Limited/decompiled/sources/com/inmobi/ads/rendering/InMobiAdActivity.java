package com.inmobi.ads.rendering;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/U8", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public class InMobiAdActivity extends android.app.Activity {
    public static final android.util.SparseArray t = new android.util.SparseArray();
    public static com.inmobi.media.GestureDetectorOnGestureListenerC2675pi u;

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.T8 f4589a;
    public com.inmobi.media.R8 b;
    public com.inmobi.media.GestureDetectorOnGestureListenerC2675pi c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public com.inmobi.media.InterfaceC2772t9 h;
    public com.inmobi.media.Oo i;
    public android.window.OnBackInvokedCallback j;
    public boolean k;
    public final kotlinx.coroutines.CoroutineScope l = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate()));
    public kotlinx.coroutines.Job m;
    public boolean n;
    public boolean o;
    public android.widget.RelativeLayout p;
    public android.widget.FrameLayout q;
    public com.inmobi.media.C2431gb r;
    public long s;

    public static final void a(com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.c();
    }

    public static final boolean b(com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.Y5 y5;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC2675pi != null && (y5 = gestureDetectorOnGestureListenerC2675pi.E0) != null) {
            com.inmobi.media.Y5.a(y5, 6, true, null, 12);
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC2675pi2 != null) {
            gestureDetectorOnGestureListenerC2675pi2.reload();
        }
        return true;
    }

    public static final boolean c(com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.Y5 y5;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC2675pi == null || !gestureDetectorOnGestureListenerC2675pi.canGoBack()) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi2 != null && (y5 = gestureDetectorOnGestureListenerC2675pi2.E0) != null) {
                com.inmobi.media.Y5.a(y5, 5, true, null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.b();
        } else {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi3 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi3 != null) {
                gestureDetectorOnGestureListenerC2675pi3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC2675pi2 != null && gestureDetectorOnGestureListenerC2675pi2.canGoForward() && (gestureDetectorOnGestureListenerC2675pi = inMobiAdActivity.c) != null) {
            gestureDetectorOnGestureListenerC2675pi.goForward();
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        com.inmobi.media.T8 t8 = this.f4589a;
        if (t8 != null) {
            if (t8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                t8 = null;
            }
            t8.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0156, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        int i;
        com.inmobi.media.C2431gb c2431gb;
        com.inmobi.media.core.config.models.Config a2;
        com.inmobi.media.AbstractC2726ri abstractC2726ri;
        java.lang.String str;
        java.lang.String str2;
        com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        com.inmobi.media.core.config.models.AdConfig adConfig;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        java.lang.Object obj;
        super.onCreate(bundle);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.h;
        if (interfaceC2772t92 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a("InMobiAdActivity", "onCreate called");
        }
        if (!com.inmobi.media.Xi.d()) {
            b();
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.h;
            if (interfaceC2772t93 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t93).b("InMobiAdActivity", "session not found. close");
            }
            com.inmobi.media.Sb.a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f = false;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            com.inmobi.media.N5.c(this);
        }
        this.d = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.f4589a = new com.inmobi.media.T8(this);
        java.lang.String key = getIntent().getStringExtra("loggerCacheKey");
        if (key != null) {
            java.util.HashMap hashMap = com.inmobi.media.U8.f4992a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            try {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) com.inmobi.media.U8.f4992a.get(key);
                obj = weakReference != null ? weakReference.get() : null;
            } catch (java.lang.ClassCastException unused) {
            }
        }
        i = this.d;
        if (i == 100) {
            if (i == 102) {
                com.inmobi.media.R8 orientationListener = new com.inmobi.media.R8(this);
                com.inmobi.media.InterfaceC2772t9 logger = this.h;
                if (logger != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
                    orientationListener.h = logger;
                }
                com.inmobi.media.T8 t8 = this.f4589a;
                if (t8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                    t8 = null;
                }
                t8.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
                t8.b.add(orientationListener);
                t8.a();
                this.b = orientationListener;
                android.content.Intent intent = getIntent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                orientationListener.a(intent, t);
            }
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
        long longExtra = getIntent().getLongExtra("placementId", Long.MIN_VALUE);
        long longExtra2 = getIntent().getLongExtra("viewTouchTimestamp", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("impressionId");
        java.lang.String stringExtra3 = getIntent().getStringExtra("creativeId");
        boolean booleanExtra2 = getIntent().getBooleanExtra("supportLockScreen", false);
        this.n = getIntent().getBooleanExtra("isImmersive", false);
        this.o = getIntent().getBooleanExtra("supportBrowserLoader", false);
        try {
        } catch (java.lang.Exception unused2) {
            c2431gb = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            c2431gb = (com.inmobi.media.C2431gb) getIntent().getParcelableExtra("lpTelemetryControlInfo", com.inmobi.media.C2431gb.class);
        } else {
            android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("lpTelemetryControlInfo");
            if (parcelableExtra instanceof com.inmobi.media.C2431gb) {
                c2431gb = (com.inmobi.media.C2431gb) parcelableExtra;
            }
            c2431gb = null;
        }
        this.r = c2431gb;
        if (booleanExtra2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            getWindow().requestFeature(1);
            com.inmobi.media.B5.f4614a.getClass();
            if (android.os.Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
            } else {
                getWindow().addFlags(524288);
            }
        }
        com.inmobi.media.AbstractC2726ri abstractC2726ri2 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.h1;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = u;
        if (gestureDetectorOnGestureListenerC2675pi2 != null) {
            abstractC2726ri2 = gestureDetectorOnGestureListenerC2675pi2.getListener();
            a2 = gestureDetectorOnGestureListenerC2675pi2.getAdConfig();
        } else {
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
            a2 = com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
        }
        com.inmobi.media.AbstractC2726ri abstractC2726ri3 = abstractC2726ri2;
        com.inmobi.media.core.config.models.Config config = a2;
        long j = longExtra2 + 4;
        try {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t94 = this.h;
            com.inmobi.media.Bo bo = new com.inmobi.media.Bo(interfaceC2772t94);
            com.inmobi.media.Qi qi = new com.inmobi.media.Qi(com.unity3d.ads.BuildConfig.FLAVOR, "browser");
            if (config == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adConfig");
                adConfig = null;
            } else {
                adConfig = (com.inmobi.media.core.config.models.AdConfig) config;
            }
            str = "InMobiAdActivity";
            str2 = "TAG";
            try {
                gestureDetectorOnGestureListenerC2675pi = new com.inmobi.media.GestureDetectorOnGestureListenerC2675pi((android.content.Context) this, (byte) 1, (java.util.LinkedHashSet) null, stringExtra2, (java.lang.String) null, j, (com.inmobi.media.C2781ti) null, interfaceC2772t94, qi, bo, (com.inmobi.media.C2630o0) null, adConfig, 164);
                inMobiAdActivity = this;
            } catch (java.lang.Exception e) {
                e = e;
                inMobiAdActivity = this;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            abstractC2726ri = abstractC2726ri3;
            str = "InMobiAdActivity";
            str2 = "TAG";
            inMobiAdActivity = this;
        }
        try {
            inMobiAdActivity.c = gestureDetectorOnGestureListenerC2675pi;
            gestureDetectorOnGestureListenerC2675pi.setPlacementId(longExtra);
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi3 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi3 != null) {
                gestureDetectorOnGestureListenerC2675pi3.setCreativeId(stringExtra3);
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi4 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi4 != null) {
                gestureDetectorOnGestureListenerC2675pi4.setAllowAutoRedirection(booleanExtra);
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi5 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi5 != null) {
                abstractC2726ri = abstractC2726ri3;
                try {
                    gestureDetectorOnGestureListenerC2675pi5.a(abstractC2726ri);
                } catch (java.lang.Exception e3) {
                    e = e3;
                    interfaceC2772t9 = inMobiAdActivity.h;
                    if (interfaceC2772t9 != null) {
                    }
                    kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
                    abstractC2726ri.c();
                    b();
                    return;
                }
            } else {
                abstractC2726ri = abstractC2726ri3;
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi6 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi6 != null) {
                gestureDetectorOnGestureListenerC2675pi6.setLandingPageTelemetryControlInfoOnWebViewClient(inMobiAdActivity.r);
            }
            inMobiAdActivity.a(((com.inmobi.media.core.config.models.AdConfig) config).getCustomBrowser().getInt());
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi7 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi7 != null) {
                gestureDetectorOnGestureListenerC2675pi7.setFullScreenActivityContext(inMobiAdActivity);
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi8 = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi8 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(stringExtra);
                gestureDetectorOnGestureListenerC2675pi8.loadUrl(stringExtra);
            }
            com.inmobi.media.T8 t82 = inMobiAdActivity.f4589a;
            if (t82 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                t82 = null;
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi orientationListener2 = inMobiAdActivity.c;
            kotlin.jvm.internal.Intrinsics.checkNotNull(orientationListener2);
            t82.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationListener2, "orientationListener");
            t82.b.add(orientationListener2);
            t82.a();
            return;
        } catch (java.lang.Exception e4) {
            e = e4;
            abstractC2726ri = abstractC2726ri3;
            interfaceC2772t9 = inMobiAdActivity.h;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = str;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, str2);
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str3, "Exception while initializing In-App browser", e);
            }
            kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            abstractC2726ri.c();
            b();
            return;
        }
        obj = null;
        this.h = (com.inmobi.media.InterfaceC2772t9) obj;
        i = this.d;
        if (i == 100) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        com.inmobi.media.R8 r8;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi;
        com.inmobi.media.Y5 y5;
        com.inmobi.media.B fullScreenEventsListener;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", "onDestroy");
        }
        int i = this.d;
        if (100 == i) {
            a();
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = u;
            if (gestureDetectorOnGestureListenerC2675pi2 != null) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                gestureDetectorOnGestureListenerC2675pi2.c(com.inmobi.media.Vh.a("IN_CUSTOM_BROWSER", "onClose"));
            }
            u = null;
        } else if (102 == i && (r8 = this.b) != null && r8.e != null && r8 != null) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
            r8.a(com.inmobi.media.Vh.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.e) {
            int i2 = this.d;
            if (100 == i2) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi3 = this.c;
                if (gestureDetectorOnGestureListenerC2675pi3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC2675pi3.getFullScreenEventsListener()) != null) {
                    try {
                        com.inmobi.media.C2489ii c2489ii = (com.inmobi.media.C2489ii) fullScreenEventsListener;
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = c2489ii.f5262a.i;
                        if (interfaceC2772t92 != null) {
                            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(str, com.ironsource.Vf.m);
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.webkit.Profile.DEFAULT_PROFILE_NAME, c2489ii.f5262a.getViewState())) {
                            c2489ii.f5262a.setAndUpdateViewState("Hidden");
                        }
                        c2489ii.f5262a.W();
                        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi4 = this.c;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC2675pi4);
                        gestureDetectorOnGestureListenerC2675pi4.b();
                        com.inmobi.media.T8 t8 = this.f4589a;
                        if (t8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                            t8 = null;
                        }
                        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi orientationListener = this.c;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(orientationListener);
                        t8.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
                        t8.b.remove(orientationListener);
                        t8.a();
                        this.c = null;
                    } catch (java.lang.Exception unused) {
                    }
                }
            } else if (102 == i2) {
                com.inmobi.media.R8 orientationListener2 = this.b;
                if (orientationListener2 != null) {
                    com.inmobi.media.T8 t82 = this.f4589a;
                    if (t82 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        t82 = null;
                    }
                    t82.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationListener2, "orientationListener");
                    t82.b.remove(orientationListener2);
                    t82.a();
                    com.inmobi.media.C2823v7 c2823v7 = orientationListener2.c;
                    if (c2823v7 != null) {
                        c2823v7.b();
                    }
                    android.widget.RelativeLayout relativeLayout = orientationListener2.d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    com.inmobi.media.U5 u5 = orientationListener2.e;
                    if (u5 != null) {
                        com.inmobi.media.Z5 z5 = u5.c;
                        if (z5 != null) {
                            z5.destroy();
                        }
                        u5.c = null;
                        u5.d = null;
                        u5.e = null;
                        com.inmobi.media.Oo oo = u5.g;
                        if (oo != null) {
                            oo.a();
                        }
                        u5.removeAllViews();
                    }
                    orientationListener2.f4934a.clear();
                    orientationListener2.b = null;
                    orientationListener2.c = null;
                    orientationListener2.d = null;
                    orientationListener2.e = null;
                }
                this.b = null;
            }
        } else {
            int i3 = this.d;
            if (100 != i3 && 102 == i3) {
                com.inmobi.media.R8 orientationListener3 = this.b;
                if (orientationListener3 != null) {
                    com.inmobi.media.T8 t83 = this.f4589a;
                    if (t83 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
                        t83 = null;
                    }
                    t83.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationListener3, "orientationListener");
                    t83.b.remove(orientationListener3);
                    t83.a();
                    com.inmobi.media.C2823v7 c2823v72 = orientationListener3.c;
                    if (c2823v72 != null) {
                        c2823v72.b();
                    }
                    android.widget.RelativeLayout relativeLayout2 = orientationListener3.d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    com.inmobi.media.U5 u52 = orientationListener3.e;
                    if (u52 != null) {
                        com.inmobi.media.Z5 z52 = u52.c;
                        if (z52 != null) {
                            z52.destroy();
                        }
                        u52.c = null;
                        u52.d = null;
                        u52.e = null;
                        com.inmobi.media.Oo oo2 = u52.g;
                        if (oo2 != null) {
                            oo2.a();
                        }
                        u52.removeAllViews();
                    }
                    orientationListener3.f4934a.clear();
                    orientationListener3.b = null;
                    orientationListener3.c = null;
                    orientationListener3.d = null;
                    orientationListener3.e = null;
                }
                this.b = null;
            }
            if (100 == this.d && (gestureDetectorOnGestureListenerC2675pi = this.c) != null && (y5 = gestureDetectorOnGestureListenerC2675pi.E0) != null) {
                com.inmobi.media.Y5.a(y5, 9, true, null, 12);
                com.inmobi.media.C2465hj c2465hj = y5.m;
                if (!c2465hj.f && c2465hj.f5245a > 0) {
                    c2465hj.f = true;
                    c2465hj.g = com.inmobi.media.EnumC2412fj.f;
                    c2465hj.a();
                }
                kotlinx.coroutines.CoroutineScopeKt.cancel$default(c2465hj.d, null, 1, null);
            }
        }
        com.inmobi.media.Oo oo3 = this.i;
        if (oo3 != null) {
            oo3.a();
        }
        this.i = null;
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.l, null, 1, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        com.inmobi.media.R8 r8;
        com.inmobi.media.T8 t8;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", "multiWindow mode - " + z);
        }
        super.onMultiWindowModeChanged(z);
        if (z || (r8 = this.b) == null) {
            return;
        }
        com.inmobi.media.C c = r8.b;
        com.inmobi.media.T8 t82 = null;
        com.inmobi.media.Nf orientationProperties = (c == null || !(c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi)) ? null : ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).getOrientationProperties();
        if (orientationProperties == null || (t8 = this.f4589a) == null) {
            return;
        }
        if (t8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
        } else {
            t82 = t8;
        }
        t82.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f = false;
        this.c = null;
        setIntent(intent);
        com.inmobi.media.R8 r8 = this.b;
        if (r8 != null) {
            android.util.SparseArray adContainers = t;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainers, "adContainers");
            r8.a(intent, adContainers);
            com.inmobi.media.C2823v7 c2823v7 = r8.c;
            if (c2823v7 != null) {
                c2823v7.e();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        com.inmobi.media.R8 r8;
        super.onPause();
        int i = this.d;
        if (100 == i) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = u;
            if (gestureDetectorOnGestureListenerC2675pi != null) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                gestureDetectorOnGestureListenerC2675pi.c(com.inmobi.media.Vh.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i || (r8 = this.b) == null || r8.e == null || r8 == null) {
            return;
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
        r8.a(com.inmobi.media.Vh.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        com.inmobi.media.C2823v7 c2823v7;
        com.inmobi.media.B fullScreenEventsListener;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", com.ironsource.X3.i.u0);
        }
        super.onResume();
        if (this.e) {
            return;
        }
        int i = this.d;
        if (100 == i) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.c;
            if (gestureDetectorOnGestureListenerC2675pi != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC2675pi.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f) {
                        this.f = true;
                        ((com.inmobi.media.C2489ii) fullScreenEventsListener).b();
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi2 = u;
            if (gestureDetectorOnGestureListenerC2675pi2 != null) {
                com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
                gestureDetectorOnGestureListenerC2675pi2.c(com.inmobi.media.Vh.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i) {
            com.inmobi.media.R8 r8 = this.b;
            if (r8 != null && (c2823v7 = r8.c) != null && !c2823v7.h) {
                try {
                    c2823v7.h = true;
                    com.inmobi.media.B fullScreenEventsListener2 = c2823v7.f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((com.inmobi.media.C2489ii) fullScreenEventsListener2).b();
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
            com.inmobi.media.R8 r82 = this.b;
            if (r82 == null || r82.e == null || r82 == null) {
                return;
            }
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
            r82.a(com.inmobi.media.Vh.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        com.inmobi.media.R8 r8;
        android.view.Window window;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        com.inmobi.media.B5.f4614a.getClass();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            if (this.j == null) {
                this.j = new android.window.OnBackInvokedCallback() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda4
                    @Override // android.window.OnBackInvokedCallback
                    public final void onBackInvoked() {
                        com.inmobi.ads.rendering.InMobiAdActivity.a(com.inmobi.ads.rendering.InMobiAdActivity.this);
                    }
                };
            }
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            android.window.OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.e || 102 != this.d || (r8 = this.b) == null) {
            return;
        }
        com.inmobi.media.C2823v7 c2823v7 = r8.c;
        if (c2823v7 != null) {
            c2823v7.e();
        }
        com.inmobi.media.C c = r8.b;
        if (c != null && (c instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) && ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) c).X0 && !com.inmobi.media.B5.t() && com.inmobi.media.B5.w()) {
            java.lang.Object obj = r8.f4934a.get();
            com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity = obj instanceof com.inmobi.ads.rendering.InMobiAdActivity ? (com.inmobi.ads.rendering.InMobiAdActivity) obj : null;
            if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(5638);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        com.inmobi.media.B5.f4614a.getClass();
        if (android.os.Build.VERSION.SDK_INT >= 33 && this.j != null) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            android.window.OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.d == 100) {
            a("ACTIVITY_STOP");
        }
    }

    public final void a(com.inmobi.media.core.config.models.AdConfig.FormatCustomBrowserConfig formatCustomBrowserConfig) {
        kotlinx.coroutines.Job launch$default;
        android.view.View inflate = getLayoutInflater().inflate(com.inmobi.ads.R.layout.inmobi_in_app_browser_activity, (android.view.ViewGroup) null);
        if (inflate == null) {
            return;
        }
        this.p = (android.widget.RelativeLayout) inflate.findViewById(com.inmobi.ads.R.id.inmobi_in_app_browser_webview_container);
        this.q = (android.widget.FrameLayout) inflate.findViewById(com.inmobi.ads.R.id.inmobi_in_app_browser_loader_overlay);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, com.inmobi.ads.R.id.inmobi_in_app_browser_bottom_bar);
        android.view.ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            viewGroup.addView(this.c, layoutParams);
            a(viewGroup);
            long loaderTimeout = formatCustomBrowserConfig.getLoaderTimeout();
            if (!this.o || loaderTimeout <= 0) {
                android.widget.FrameLayout frameLayout = this.q;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            } else {
                viewGroup.setVisibility(8);
                android.widget.FrameLayout frameLayout2 = this.q;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                this.k = true;
                if (this.n) {
                    android.view.Window window = getWindow();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                    kotlin.Lazy lazy = com.inmobi.media.Gi.f4728a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
                    com.inmobi.media.B5.f4614a.getClass();
                    if (com.inmobi.media.B5.t()) {
                        com.inmobi.media.Gi.a(window, 3);
                    } else if (com.inmobi.media.B5.r()) {
                        com.inmobi.media.Gi.a(window, 1);
                    }
                    android.view.Window window2 = getWindow();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                    com.inmobi.media.Gi.a(window2);
                }
                this.s = android.os.SystemClock.elapsedRealtime();
                com.inmobi.media.Xa.a("InAppBrowserLoaderShown", this.r, (java.lang.String) null, (java.lang.Long) null);
                long loaderTimeout2 = formatCustomBrowserConfig.getLoaderTimeout();
                if (this.k) {
                    a();
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new com.inmobi.media.W8(loaderTimeout2, this, null), 3, null);
                    this.m = launch$default;
                }
            }
        }
        setContentView(inflate);
    }

    public final void b() {
        if (isTaskRoot()) {
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.x()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z, newConfig);
        onMultiWindowModeChanged(z);
    }

    public final void c() {
        com.inmobi.media.Y5 y5;
        com.inmobi.media.C2823v7 c2823v7;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("InMobiAdActivity", "onBackPressed");
        }
        int i = this.d;
        if (i == 102) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.h;
            if (interfaceC2772t92 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t92).c("InMobiAdActivity", "back pressed on ad");
            }
            com.inmobi.media.R8 r8 = this.b;
            if (r8 == null || (c2823v7 = r8.c) == null) {
                return;
            }
            c2823v7.a();
            return;
        }
        if (i != 100 || this.k) {
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.h;
        if (interfaceC2772t93 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t93).c("InMobiAdActivity", "back pressed in browser");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.c;
        if (gestureDetectorOnGestureListenerC2675pi != null && (y5 = gestureDetectorOnGestureListenerC2675pi.E0) != null) {
            com.inmobi.media.Y5.a(y5, 7, true, null, 12);
        }
        this.e = true;
        b();
    }

    public final void a(java.lang.String reason) {
        com.inmobi.media.Y5 y5;
        com.inmobi.media.C2465hj c2465hj;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.k) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("InMobiAdActivity", "hideLoaderAndShowWebView reason=" + reason);
            }
            android.widget.FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout = this.p;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.n) {
                android.view.Window window = getWindow();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                com.inmobi.media.Gi.b(window);
                android.view.Window window2 = getWindow();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                com.inmobi.media.Gi.c(window2);
            }
            this.k = false;
            a();
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.c;
            if (gestureDetectorOnGestureListenerC2675pi != null && (y5 = gestureDetectorOnGestureListenerC2675pi.E0) != null && !(z = (c2465hj = y5.m).f) && !z && c2465hj.f5245a > 0) {
                c2465hj.f = true;
                c2465hj.g = com.inmobi.media.EnumC2412fj.f;
                c2465hj.a();
            }
            com.inmobi.media.Xa.a("InAppBrowserLoaderHidden", this.r, reason, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.s));
        }
    }

    public final void a() {
        try {
            kotlinx.coroutines.Job job = this.m;
            if (job != null) {
                kotlinx.coroutines.JobKt.ensureActive(job);
            }
            kotlinx.coroutines.Job job2 = this.m;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        } catch (java.lang.Exception unused) {
        }
        this.m = null;
    }

    public final void a(android.view.ViewGroup viewGroup) {
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.LinearLayout) viewGroup.findViewById(com.inmobi.ads.R.id.inmobi_in_app_browser_bottom_bar)).getLayoutParams();
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (com.inmobi.media.J3.a(this)) {
            com.inmobi.media.Oo oo = this.i;
            if (oo != null) {
                oo.a();
            }
            this.i = new com.inmobi.media.Oo(this, new com.inmobi.media.V8(layoutParams2), this.h);
        }
        com.inmobi.media.C2607n5 c2607n5 = new com.inmobi.media.C2607n5(this, (byte) 2, this.h);
        c2607n5.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.ads.rendering.InMobiAdActivity.a(com.inmobi.ads.rendering.InMobiAdActivity.this, view, motionEvent);
            }
        });
        com.inmobi.media.C2607n5 c2607n52 = new com.inmobi.media.C2607n5(this, (byte) 3, this.h);
        c2607n52.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.ads.rendering.InMobiAdActivity.b(com.inmobi.ads.rendering.InMobiAdActivity.this, view, motionEvent);
            }
        });
        com.inmobi.media.C2607n5 c2607n53 = new com.inmobi.media.C2607n5(this, (byte) 4, this.h);
        c2607n53.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.ads.rendering.InMobiAdActivity.c(com.inmobi.ads.rendering.InMobiAdActivity.this, view, motionEvent);
            }
        });
        com.inmobi.media.C2607n5 c2607n54 = new com.inmobi.media.C2607n5(this, (byte) 6, this.h);
        c2607n54.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.inmobi.ads.rendering.InMobiAdActivity.d(com.inmobi.ads.rendering.InMobiAdActivity.this, view, motionEvent);
            }
        });
        try {
            ((android.widget.FrameLayout) viewGroup.findViewById(com.inmobi.ads.R.id.inmobi_in_app_browser_close_slot)).addView(c2607n5);
            ((android.widget.FrameLayout) viewGroup.findViewById(com.inmobi.ads.R.id.inmobi_in_app_browser_refresh_slot)).addView(c2607n52);
            ((android.widget.FrameLayout) viewGroup.findViewById(com.inmobi.ads.R.id.inmobi_in_app_browser_back_slot)).addView(c2607n53);
            ((android.widget.FrameLayout) viewGroup.findViewById(com.inmobi.ads.R.id.inmobi_in_app_browser_forward_slot)).addView(c2607n54);
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.h;
            if (interfaceC2772t9 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiAdActivity", "TAG");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("InMobiAdActivity", "Error setting up bottom bar buttons", e);
            }
        }
    }

    public static final boolean a(com.inmobi.ads.rendering.InMobiAdActivity inMobiAdActivity, android.view.View view, android.view.MotionEvent motionEvent) {
        com.inmobi.media.Y5 y5;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC2675pi != null && (y5 = gestureDetectorOnGestureListenerC2675pi.E0) != null) {
                com.inmobi.media.Y5.a(y5, 5, true, null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.b();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
