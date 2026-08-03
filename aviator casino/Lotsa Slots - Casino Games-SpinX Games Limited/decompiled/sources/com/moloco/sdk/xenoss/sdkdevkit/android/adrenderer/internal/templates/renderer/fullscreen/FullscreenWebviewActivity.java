package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J'\u0010\u0011\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0011\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/fullscreen/FullscreenWebviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", com.ironsource.X3.i.t0, com.ironsource.X3.i.u0, "onDestroy", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;", "expectedOrientationSettings", "Lkotlinx/coroutines/CoroutineScope;", "scope", "a", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)V", "orientationSettings", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;", "", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;)Ljava/lang/Integer;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "backCallback", "b", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class FullscreenWebviewActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: b, reason: from kotlin metadata */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.Companion INSTANCE = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.Companion(null);
    public static final int c = 8;
    public static final java.lang.String d = "FullscreenWebviewActivity";
    public static java.lang.ref.WeakReference<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a> e = new java.lang.ref.WeakReference<>(null);
    public static java.lang.ref.WeakReference<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity> f = new java.lang.ref.WeakReference<>(null);
    public static java.lang.ref.WeakReference<com.moloco.sdk.acm.recorder.MetricsRecorder> g = new java.lang.ref.WeakReference<>(null);
    public static kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> h;
    public static kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public androidx.activity.OnBackPressedCallback backCallback;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(android.content.Context context, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isAdDisplayingEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a webviewAd, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isAdForciblyClosed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAdDisplayingEvent, "isAdDisplayingEvent");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewAd, "webviewAd");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.d, "Showing ad", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.Companion companion = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.INSTANCE;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.e = new java.lang.ref.WeakReference(webviewAd);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.h = isAdDisplayingEvent;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.i = isAdForciblyClosed;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.g = new java.lang.ref.WeakReference(metricsRecorder);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }

        public Companion() {
        }

        public final void a() {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.d, "Closing ad", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.e.clear();
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.h;
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(java.lang.Boolean.FALSE);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.h = null;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity fullscreenWebviewActivity = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.f.get();
            if (fullscreenWebviewActivity != null && !fullscreenWebviewActivity.isFinishing() && !fullscreenWebviewActivity.isDestroyed()) {
                fullscreenWebviewActivity.finish();
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.f.clear();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.g.clear();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7606a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.b.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.c.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f7606a = iArr;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        public c(java.lang.Object obj) {
            super(2, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/OrientationSettings;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity) this.receiver, bVar, continuation);
        }
    }

    public static final kotlin.Unit f() {
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "WebviewAd is null in onPause, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit g() {
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "WebviewAd is null in onResume, cannot call webviewBridge.viewVisible", null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.String str = d;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "onCreate called", null, false, 12, null);
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = g.get();
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.W.c()));
        }
        androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        this.backCallback = androidx.activity.OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.a((androidx.activity.OnBackPressedCallback) obj);
            }
        }, 2, null);
        f = new java.lang.ref.WeakReference<>(this);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = e.get();
        if (aVar == null) {
            com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, str, "WebviewAd is null, something went wrong", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b p = aVar.p();
        if (p.getParent() != null) {
            android.view.ViewParent parent = p.getParent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(p);
        }
        setContentView(p);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = h;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(java.lang.Boolean.TRUE);
        }
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "WebView is not null, proceeding to notify viewReady and viewVisible", null, false, 12, null);
        aVar.s().a();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3444a.a(this);
        a(this, aVar.x(), null, 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "onDestroy called for FullscreenWebviewActivity", null, false, 12, null);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = i;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(java.lang.Boolean.TRUE);
        }
        i = null;
        androidx.activity.OnBackPressedCallback onBackPressedCallback = this.backCallback;
        if (onBackPressedCallback != null && onBackPressedCallback.getIsEnabled()) {
            onBackPressedCallback.remove();
        }
        INSTANCE.a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a s;
        super.onPause();
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.String str = d;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "Lifecycle onPause called", null, false, 12, null);
        if (isFinishing() || isDestroyed()) {
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "Activity is finishing or destroyed, skipping viewVisible call", null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, "Activity is not finishing or destroyed, setting viewVisible to false", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = e.get();
        if (aVar == null || (s = aVar.s()) == null) {
            new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.f();
                }
            };
        } else {
            s.a(false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a s;
        super.onResume();
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Lifecycle onResume called", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = e.get();
        if (aVar == null || (s = aVar.s()) == null) {
            new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.g();
                }
            };
        } else {
            s.a(true);
        }
    }

    public static final /* synthetic */ java.lang.Object b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity fullscreenWebviewActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, kotlin.coroutines.Continuation continuation) {
        fullscreenWebviewActivity.a(bVar);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity fullscreenWebviewActivity, kotlinx.coroutines.flow.StateFlow stateFlow, kotlinx.coroutines.CoroutineScope coroutineScope, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        }
        fullscreenWebviewActivity.a(stateFlow, coroutineScope);
    }

    public final void a(kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> expectedOrientationSettings, kotlinx.coroutines.CoroutineScope scope) {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Starting to listen to orientation events", null, false, 12, null);
        a(expectedOrientationSettings.getValue());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(expectedOrientationSettings, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.c(this)), scope);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b orientationSettings) {
        if (orientationSettings.d() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.d) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Orientation is none, not setting requested orientation", false, 4, null);
            return;
        }
        java.lang.Integer a2 = a(orientationSettings.d());
        if (a2 != null) {
            int intValue = a2.intValue();
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Setting orientation to " + intValue, null, false, 12, null);
            setRequestedOrientation(intValue);
        }
    }

    public final java.lang.Integer a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar) {
        int i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity.b.f7606a[aVar.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.Unit a(androidx.activity.OnBackPressedCallback addCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, "Back press detected, but disabled", false, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
