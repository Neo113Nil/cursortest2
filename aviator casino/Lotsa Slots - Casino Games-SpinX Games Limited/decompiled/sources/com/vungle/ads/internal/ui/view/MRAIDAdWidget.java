package com.vungle.ads.internal.ui.view;

/* compiled from: MRAIDAdWidget.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 B2\u00020\u0001:\u0007?@ABCDEB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010)\u001a\u00020*H\u0003J\u0006\u0010+\u001a\u00020*J\u000e\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u00020*2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103J\b\u00104\u001a\u00020*H\u0014J\u0006\u00105\u001a\u00020*J\b\u00106\u001a\u00020*H\u0002J\u0006\u00107\u001a\u00020*J\u000e\u00108\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u00109\u001a\u00020*2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<J\u0010\u0010=\u001a\u00020*2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u000e\u0010>\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0005R&\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "eventId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "closeDelegate", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;", "getCloseDelegate$vungle_ads_release$annotations", "()V", "getCloseDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;", "setCloseDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;)V", "getEventId", "()Ljava/lang/String;", "onViewTouchListener", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;", "getOnViewTouchListener$vungle_ads_release$annotations", "getOnViewTouchListener$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;", "setOnViewTouchListener$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;)V", "orientationDelegate", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;", "getOrientationDelegate$vungle_ads_release$annotations", "getOrientationDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;", "setOrientationDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;)V", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;", "getPlatform", "()Lcom/vungle/ads/internal/platform/Platform;", "platform$delegate", "Lkotlin/Lazy;", "url", "getUrl", "webView", "Landroid/webkit/WebView;", "bindListeners", "", "close", "destroyWebView", "webViewDestroyDelay", "", "linkWebView", "vngWebViewClient", "Landroid/webkit/WebViewClient;", "webViewSettings", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "onAttachedToWindow", "pauseWeb", "prepare", "resumeWeb", "setCloseDelegate", "setOnViewTouchListener", "setOrientation", "requestedOrientation", "", "setOrientationDelegate", "showWebsite", "AdStopReason", "AudioContextWrapper", "CloseDelegate", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "DestroyRunnable", "OnViewTouchListener", "OrientationDelegate", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MRAIDAdWidget extends android.widget.RelativeLayout {
    private static final java.lang.String TAG = "MRAIDAdWidget";
    private com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate closeDelegate;
    private final java.lang.String eventId;
    private com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener onViewTouchListener;
    private com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate orientationDelegate;

    /* renamed from: platform$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy platform;
    private android.webkit.WebView webView;

    /* compiled from: MRAIDAdWidget.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$CloseDelegate;", "", "close", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CloseDelegate {
        void close();
    }

    /* compiled from: MRAIDAdWidget.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OnViewTouchListener;", "", "onTouch", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnViewTouchListener {
        boolean onTouch(android.view.MotionEvent event);
    }

    /* compiled from: MRAIDAdWidget.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$OrientationDelegate;", "", "setOrientation", "", "orientation", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OrientationDelegate {
        void setOrientation(int orientation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MRAIDAdWidget(android.content.Context context) throws java.lang.InstantiationException {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    public /* synthetic */ MRAIDAdWidget(android.content.Context context, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) throws java.lang.InstantiationException {
        this(context, (i & 2) != 0 ? null : str);
    }

    public final java.lang.String getEventId() {
        return this.eventId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDAdWidget(final android.content.Context context, java.lang.String str) throws java.lang.InstantiationException {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.eventId = str;
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        this.platform = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.platform.Platform>() { // from class: com.vungle.ads.internal.ui.view.MRAIDAdWidget$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.platform.Platform invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.platform.Platform.class);
            }
        });
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        android.webkit.WebView webView = com.vungle.ads.internal.util.ViewUtility.INSTANCE.getWebView(context, str);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        android.webkit.WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setTag("VungleWebView");
        }
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }

    private final com.vungle.ads.internal.platform.Platform getPlatform() {
        return (com.vungle.ads.internal.platform.Platform) this.platform.getValue();
    }

    /* renamed from: getOnViewTouchListener$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener getOnViewTouchListener() {
        return this.onViewTouchListener;
    }

    public final void setOnViewTouchListener$vungle_ads_release(com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    /* renamed from: getCloseDelegate$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate getCloseDelegate() {
        return this.closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate closeDelegate) {
        this.closeDelegate = closeDelegate;
    }

    /* renamed from: getOrientationDelegate$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate getOrientationDelegate() {
        return this.orientationDelegate;
    }

    public final void setOrientationDelegate$vungle_ads_release(com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    private final void bindListeners() {
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            webView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.MRAIDAdWidget$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    boolean m10495bindListeners$lambda0;
                    m10495bindListeners$lambda0 = com.vungle.ads.internal.ui.view.MRAIDAdWidget.m10495bindListeners$lambda0(com.vungle.ads.internal.ui.view.MRAIDAdWidget.this, view, motionEvent);
                    return m10495bindListeners$lambda0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindListeners$lambda-0, reason: not valid java name */
    public static final boolean m10495bindListeners$lambda0(com.vungle.ads.internal.ui.view.MRAIDAdWidget this$0, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener onViewTouchListener = this$0.onViewTouchListener;
        if (onViewTouchListener != null) {
            return onViewTouchListener.onTouch(motionEvent);
        }
        return false;
    }

    private final void prepare() {
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(getPlatform().isProblematicMaliDevice() ? 0 : 2, null);
            webView.setBackgroundColor(0);
            webView.setVisibility(8);
        }
    }

    public final void setCloseDelegate(com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate closeDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setOnViewTouchListener(com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOrientationDelegate(com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void close() {
        com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate closeDelegate = this.closeDelegate;
        if (closeDelegate != null) {
            closeDelegate.close();
        }
    }

    public final void setOrientation(int requestedOrientation) {
        com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate orientationDelegate = this.orientationDelegate;
        if (orientationDelegate != null) {
            orientationDelegate.setOrientation(requestedOrientation);
        }
    }

    public final void linkWebView(android.webkit.WebViewClient vngWebViewClient, com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            com.vungle.ads.internal.platform.WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    public final void showWebsite(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "loadUrl: " + url);
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            webView.loadUrl(url);
        }
    }

    public final void pauseWeb() {
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        }
        android.webkit.WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    public final java.lang.String getUrl() {
        android.webkit.WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void destroyWebView(long webViewDestroyDelay) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget = this;
            android.view.ViewParent parent = getParent();
            kotlin.Unit unit = null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
                unit = kotlin.Unit.INSTANCE;
            }
            kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.MRAIDAdWidget mRAIDAdWidget2 = this;
            removeAllViews();
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (webViewDestroyDelay <= 0) {
            new com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable(this).run();
        } else {
            new com.vungle.ads.internal.util.HandlerScheduler().schedule(new com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable(this), webViewDestroyDelay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MRAIDAdWidget.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$DestroyRunnable;", "Ljava/lang/Runnable;", "widget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;)V", "run", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class DestroyRunnable implements java.lang.Runnable {
        private final com.vungle.ads.internal.ui.view.MRAIDAdWidget widget;

        public DestroyRunnable(com.vungle.ads.internal.ui.view.MRAIDAdWidget widget) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widget, "widget");
            this.widget = widget;
        }

        @Override // java.lang.Runnable
        public void run() {
            kotlin.Unit unit;
            android.webkit.WebView webView = this.widget.webView;
            if (webView == null) {
                return;
            }
            try {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.vungle.ads.internal.ui.view.MRAIDAdWidget$DestroyRunnable$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable.m10496run$lambda0(com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable.this);
                        }
                    });
                    return;
                }
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable = this;
                    webView.onPause();
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                try {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable2 = this;
                    webView.stopLoading();
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th2) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
                }
                try {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable3 = this;
                    webView.setWebChromeClient(null);
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th3) {
                    kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th3));
                }
                try {
                    kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable4 = this;
                    webView.setWebViewClient(new android.webkit.WebViewClient());
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th4) {
                    kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th4));
                }
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    try {
                        kotlin.Result.Companion companion9 = kotlin.Result.INSTANCE;
                        com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable5 = this;
                        webView.setWebViewRenderProcessClient(null);
                        kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                    } catch (java.lang.Throwable th5) {
                        kotlin.Result.Companion companion10 = kotlin.Result.INSTANCE;
                        kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th5));
                    }
                }
                try {
                    kotlin.Result.Companion companion11 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable6 = this;
                    webView.loadUrl(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion12 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                try {
                    kotlin.Result.Companion companion13 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable7 = this;
                    webView.clearHistory();
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion14 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
                try {
                    kotlin.Result.Companion companion15 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable8 = this;
                    webView.removeAllViews();
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th8) {
                    kotlin.Result.Companion companion16 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th8));
                }
                try {
                    kotlin.Result.Companion companion17 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable9 = this;
                    this.widget.removeAllViews();
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th9) {
                    kotlin.Result.Companion companion18 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th9));
                }
                try {
                    kotlin.Result.Companion companion19 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable10 = this;
                    java.lang.String eventId = this.widget.getEventId();
                    if (eventId != null) {
                        com.vungle.ads.internal.presenter.WebViewManager.INSTANCE.destroyWebView(eventId);
                        unit = kotlin.Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    kotlin.Result.m10798constructorimpl(unit);
                } catch (java.lang.Throwable th10) {
                    kotlin.Result.Companion companion20 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th10));
                }
                try {
                    kotlin.Result.Companion companion21 = kotlin.Result.INSTANCE;
                    com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable destroyRunnable11 = this;
                    webView.destroy();
                    kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th11) {
                    kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                    kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th11));
                }
                this.widget.webView = null;
            } catch (java.lang.Throwable th12) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(com.vungle.ads.internal.ui.view.MRAIDAdWidget.TAG, "Destroy webview: " + th12.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: run$lambda-0, reason: not valid java name */
        public static final void m10496run$lambda0(com.vungle.ads.internal.ui.view.MRAIDAdWidget.DestroyRunnable this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        android.view.ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        android.webkit.WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    /* compiled from: MRAIDAdWidget.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$AudioContextWrapper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getSystemService", "", "name", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AudioContextWrapper extends android.content.ContextWrapper {
        public AudioContextWrapper(android.content.Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String name) {
            java.lang.Object systemService;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            if (kotlin.jvm.internal.Intrinsics.areEqual("audio", name)) {
                systemService = getApplicationContext().getSystemService(name);
            } else {
                systemService = super.getSystemService(name);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(systemService, "if (AUDIO_SERVICE == nam…rvice(name)\n            }");
            return systemService;
        }
    }

    /* compiled from: MRAIDAdWidget.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$AdStopReason;", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface AdStopReason {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.vungle.ads.internal.ui.view.MRAIDAdWidget.AdStopReason.Companion INSTANCE = com.vungle.ads.internal.ui.view.MRAIDAdWidget.AdStopReason.Companion.$$INSTANCE;
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;

        /* compiled from: MRAIDAdWidget.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget$AdStopReason$Companion;", "", "()V", "IS_AD_FINISHED_BY_API", "", "IS_AD_FINISHING", "IS_CHANGING_CONFIGURATION", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.vungle.ads.internal.ui.view.MRAIDAdWidget.AdStopReason.Companion $$INSTANCE = new com.vungle.ads.internal.ui.view.MRAIDAdWidget.AdStopReason.Companion();
            public static final int IS_AD_FINISHED_BY_API = 4;
            public static final int IS_AD_FINISHING = 2;
            public static final int IS_CHANGING_CONFIGURATION = 1;

            private Companion() {
            }
        }
    }
}
