package com.vungle.ads.internal.ui.view;

/* compiled from: AdVideoView.kt */
@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0003z{|B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0002J\b\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020AH\u0002J\b\u0010E\u001a\u00020AH\u0002J\b\u0010F\u001a\u00020AH\u0002J\b\u0010G\u001a\u00020AH\u0002J\b\u0010H\u001a\u00020AH\u0002J\u0006\u0010I\u001a\u00020\rJ\u0006\u0010J\u001a\u00020\rJ\u0006\u0010K\u001a\u00020\tJ\b\u0010L\u001a\u00020\tH\u0002J\b\u0010M\u001a\u00020AH\u0002J\u0018\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010S\u001a\u00020AH\u0002J\b\u0010T\u001a\u00020AH\u0002J\u0010\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020\rH\u0002J\b\u0010W\u001a\u00020AH\u0014J\b\u0010X\u001a\u00020AH\u0014J \u0010Y\u001a\u00020A2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\rH\u0016J\u0010\u0010^\u001a\u00020\t2\u0006\u0010Z\u001a\u00020[H\u0016J \u0010_\u001a\u00020A2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\rH\u0016J\u0010\u0010`\u001a\u00020A2\u0006\u0010Z\u001a\u00020[H\u0016J\u0006\u0010a\u001a\u00020AJ\b\u0010b\u001a\u00020AH\u0002J\r\u0010c\u001a\u00020AH\u0000¢\u0006\u0002\bdJ\u0006\u0010e\u001a\u00020AJ\r\u0010f\u001a\u00020AH\u0000¢\u0006\u0002\bgJ\b\u0010h\u001a\u00020AH\u0002J\u0006\u0010i\u001a\u00020AJ\u000e\u0010j\u001a\u00020A2\u0006\u0010k\u001a\u00020\rJ\u0018\u0010l\u001a\u00020A2\u0006\u0010m\u001a\u00020\t2\b\b\u0002\u0010n\u001a\u00020>J\u000e\u0010o\u001a\u00020A2\u0006\u0010p\u001a\u00020\tJ\u000e\u0010q\u001a\u00020A2\u0006\u0010r\u001a\u00020\tJ\u000e\u0010s\u001a\u00020A2\u0006\u0010t\u001a\u00020(J\u000e\u0010u\u001a\u00020A2\u0006\u0010v\u001a\u00020\u000bJ\u0017\u0010w\u001a\u00020A2\b\u0010\n\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0002\bxJ\u0006\u0010y\u001a\u00020AR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010)\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0002018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoVisibility", "", "callback", "Lcom/vungle/ads/nativead/NativeVideoContract$VideoLifecycleCallback;", "durationMs", "", "handler", "Landroid/os/Handler;", "lastPosMs", "lastProgressSent", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "looping", "mediaPlayerFactory", "Lkotlin/Function0;", "Landroid/media/MediaPlayer;", "getMediaPlayerFactory$vungle_ads_release$annotations", "()V", "getMediaPlayerFactory$vungle_ads_release", "()Lkotlin/jvm/functions/Function0;", "setMediaPlayerFactory$vungle_ads_release", "(Lkotlin/jvm/functions/Function0;)V", "mp", "muted", "prepared", "Ljava/util/concurrent/atomic/AtomicBoolean;", "preparing", "progressUpdater", "Lcom/vungle/ads/internal/ui/view/AdVideoView$ProgressUpdateRunnable;", "scrollListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "sourceUri", "Landroid/net/Uri;", "surface", "Landroid/view/Surface;", "getSurface$vungle_ads_release$annotations", "getSurface$vungle_ads_release", "()Landroid/view/Surface;", "setSurface$vungle_ads_release", "(Landroid/view/Surface;)V", "texture", "Landroid/view/TextureView;", "getTexture$vungle_ads_release$annotations", "getTexture$vungle_ads_release", "()Landroid/view/TextureView;", "setTexture$vungle_ads_release", "(Landroid/view/TextureView;)V", "videoCompleted", "videoH", "videoPaused", "videoTransformCallback", "Lcom/vungle/ads/internal/ui/view/AdVideoView$VideoTransformCallback;", "videoW", "visibilityThreshold", "", "wantPlay", "applyMute", "", "applyTransform", "beginProgressUpdates", "calculateAndNotifyProgress", "checkVisibility", "detachSurface", "endProgressUpdates", "ensurePlayer", "getCurrentPositionMs", "getDurationMs", "isMuted", "isVisibleEnough", "notifyCompleted", "notifyError", "what", "extra", "", "notifyMuted", "notifyPause", "notifyPlay", "notifyProgress", "percentage", "onAttachedToWindow", "onDetachedFromWindow", "onSurfaceTextureAvailable", "st", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "pause", "pauseInternal", "pauseOnActivityPaused", "pauseOnActivityPaused$vungle_ads_release", "play", "playOnActivityResumed", "playOnActivityResumed$vungle_ads_release", "prepareIfNeeded", "release", "seekTo", "ms", "setAutoVisibility", "enabled", "threshold", "setLooping", "loop", "setMuted", "mute", "setSource", com.facebook.share.internal.ShareConstants.MEDIA_URI, "setVideoLifecycleCallback", "lifecycleCallback", "setVideoTransformCallback", "setVideoTransformCallback$vungle_ads_release", "stop", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ProgressUpdateRunnable", "VideoTransformCallback", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AdVideoView extends android.widget.FrameLayout implements android.view.TextureView.SurfaceTextureListener {
    public static final int ERROR_VIDEO_PLAYBACK_FAILED = -2;
    public static final int ERROR_VIDEO_PREPARE_FAILED = -1;
    private static final long PROGRESS_INTERVAL_MS = 1000;
    private static final java.lang.String TAG = "NativeAd-Video";
    private boolean autoVisibility;
    private com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback callback;
    private int durationMs;
    private final android.os.Handler handler;
    private int lastPosMs;
    private int lastProgressSent;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private boolean looping;
    private kotlin.jvm.functions.Function0<? extends android.media.MediaPlayer> mediaPlayerFactory;
    private android.media.MediaPlayer mp;
    private boolean muted;
    private java.util.concurrent.atomic.AtomicBoolean prepared;
    private java.util.concurrent.atomic.AtomicBoolean preparing;
    private final com.vungle.ads.internal.ui.view.AdVideoView.ProgressUpdateRunnable progressUpdater;
    private final android.view.ViewTreeObserver.OnScrollChangedListener scrollListener;
    private android.net.Uri sourceUri;
    private android.view.Surface surface;
    private android.view.TextureView texture;
    private boolean videoCompleted;
    private int videoH;
    private boolean videoPaused;
    private com.vungle.ads.internal.ui.view.AdVideoView.VideoTransformCallback videoTransformCallback;
    private int videoW;
    private float visibilityThreshold;
    private boolean wantPlay;

    /* compiled from: AdVideoView.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$VideoTransformCallback;", "", "onVideoTransformed", "", "left", "", "top", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VideoTransformCallback {
        void onVideoTransformed(float left, float top);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdVideoView(android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture st) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(st, "st");
    }

    public /* synthetic */ AdVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.scrollListener = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                com.vungle.ads.internal.ui.view.AdVideoView.m10494scrollListener$lambda0(com.vungle.ads.internal.ui.view.AdVideoView.this);
            }
        };
        this.layoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                com.vungle.ads.internal.ui.view.AdVideoView.m10493layoutListener$lambda1(com.vungle.ads.internal.ui.view.AdVideoView.this);
            }
        };
        this.visibilityThreshold = 0.01f;
        android.view.TextureView textureView = new android.view.TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.texture = textureView;
        this.prepared = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.preparing = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.lastProgressSent = -1;
        this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.progressUpdater = new com.vungle.ads.internal.ui.view.AdVideoView.ProgressUpdateRunnable(this);
        this.mediaPlayerFactory = new kotlin.jvm.functions.Function0<android.media.MediaPlayer>() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$mediaPlayerFactory$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.media.MediaPlayer invoke() {
                return new android.media.MediaPlayer();
            }
        };
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(this.texture, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scrollListener$lambda-0, reason: not valid java name */
    public static final void m10494scrollListener$lambda0(com.vungle.ads.internal.ui.view.AdVideoView this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: layoutListener$lambda-1, reason: not valid java name */
    public static final void m10493layoutListener$lambda1(com.vungle.ads.internal.ui.view.AdVideoView this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    /* renamed from: getTexture$vungle_ads_release, reason: from getter */
    public final android.view.TextureView getTexture() {
        return this.texture;
    }

    public final void setTexture$vungle_ads_release(android.view.TextureView textureView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textureView, "<set-?>");
        this.texture = textureView;
    }

    /* renamed from: getSurface$vungle_ads_release, reason: from getter */
    public final android.view.Surface getSurface() {
        return this.surface;
    }

    public final void setSurface$vungle_ads_release(android.view.Surface surface) {
        this.surface = surface;
    }

    public final kotlin.jvm.functions.Function0<android.media.MediaPlayer> getMediaPlayerFactory$vungle_ads_release() {
        return this.mediaPlayerFactory;
    }

    public final void setMediaPlayerFactory$vungle_ads_release(kotlin.jvm.functions.Function0<? extends android.media.MediaPlayer> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.mediaPlayerFactory = function0;
    }

    /* compiled from: AdVideoView.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$ProgressUpdateRunnable;", "Ljava/lang/Runnable;", "adVideoView", "Lcom/vungle/ads/internal/ui/view/AdVideoView;", "(Lcom/vungle/ads/internal/ui/view/AdVideoView;)V", "weakRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "run", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class ProgressUpdateRunnable implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<com.vungle.ads.internal.ui.view.AdVideoView> weakRef;

        public ProgressUpdateRunnable(com.vungle.ads.internal.ui.view.AdVideoView adVideoView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adVideoView, "adVideoView");
            this.weakRef = new java.lang.ref.WeakReference<>(adVideoView);
        }

        @Override // java.lang.Runnable
        public void run() {
            android.media.MediaPlayer mediaPlayer;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView = this.weakRef.get();
            if (adVideoView == null) {
                return;
            }
            adVideoView.calculateAndNotifyProgress();
            if (!adVideoView.prepared.get() || (mediaPlayer = adVideoView.mp) == null || !mediaPlayer.isPlaying() || adVideoView.videoCompleted) {
                return;
            }
            adVideoView.handler.postDelayed(this, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        pauseInternal();
        detachSurface();
    }

    public final void setVideoLifecycleCallback(com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback lifecycleCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        this.callback = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(com.vungle.ads.internal.ui.view.AdVideoView.VideoTransformCallback callback) {
        this.videoTransformCallback = callback;
    }

    public final void setSource(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        this.sourceUri = uri;
        this.prepared.set(false);
        this.preparing.set(false);
        this.videoW = 0;
        this.videoH = 0;
        prepareIfNeeded();
    }

    public final void playOnActivityResumed$vungle_ads_release() {
        if (this.wantPlay && this.videoPaused && !this.videoCompleted) {
            play();
        }
    }

    public final void play() {
        android.view.Surface surface;
        this.wantPlay = true;
        this.videoPaused = false;
        this.videoCompleted = false;
        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("play(): prepared=");
        sb.append(this.prepared);
        sb.append(", surfaceValid=");
        android.view.Surface surface2 = this.surface;
        sb.append(surface2 != null ? java.lang.Boolean.valueOf(surface2.isValid()) : null);
        sb.append(", visible=");
        sb.append(isVisibleEnough());
        companion.d(TAG, sb.toString());
        if (this.prepared.get() && (surface = this.surface) != null && surface.isValid() && isVisibleEnough()) {
            android.media.MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("play(): pos=");
                android.media.MediaPlayer mediaPlayer2 = this.mp;
                sb2.append(mediaPlayer2 != null ? java.lang.Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
                sb2.append(" ms");
                companion2.d(TAG, sb2.toString());
                android.media.MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
                notifyPlay();
                return;
            }
            return;
        }
        prepareIfNeeded();
    }

    public final void pauseOnActivityPaused$vungle_ads_release() {
        this.videoPaused = true;
        pauseInternal();
    }

    public final void pause() {
        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("pause() at pos=");
        android.media.MediaPlayer mediaPlayer = this.mp;
        sb.append(mediaPlayer != null ? java.lang.Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb.append(" ms");
        companion.d(TAG, sb.toString());
        this.videoPaused = true;
        this.wantPlay = false;
        pauseInternal();
    }

    public final void stop() {
        this.wantPlay = false;
        this.lastPosMs = 0;
        this.videoCompleted = false;
        android.media.MediaPlayer mediaPlayer = this.mp;
        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("stop(): prepared=");
        sb.append(this.prepared);
        sb.append(", surface=");
        android.view.Surface surface = this.surface;
        sb.append(surface != null ? java.lang.Boolean.valueOf(surface.isValid()) : null);
        companion.d(TAG, sb.toString());
        if (mediaPlayer != null && this.prepared.get()) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                notifyPause();
            }
            mediaPlayer.seekTo(0);
            android.view.Surface surface2 = this.surface;
            if (surface2 != null && surface2.isValid() && !mediaPlayer.isPlaying()) {
                mediaPlayer.start();
                mediaPlayer.pause();
            }
        }
        endProgressUpdates();
        this.lastProgressSent = -1;
    }

    public final void seekTo(int ms) {
        this.lastPosMs = kotlin.ranges.RangesKt.coerceAtLeast(ms, 0);
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "seekTo " + this.lastPosMs);
        if (this.prepared.get()) {
            android.media.MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(this.lastPosMs);
            }
            calculateAndNotifyProgress();
        }
    }

    public final void setLooping(boolean loop) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "setLooping to " + this.looping);
        this.looping = loop;
        android.media.MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(loop);
    }

    public final void setMuted(boolean mute) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "setMuted to " + mute);
        this.muted = mute;
        applyMute();
        notifyMuted(mute);
    }

    /* renamed from: isMuted, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    public static /* synthetic */ void setAutoVisibility$default(com.vungle.ads.internal.ui.view.AdVideoView adVideoView, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.8f;
        }
        adVideoView.setAutoVisibility(z, f);
    }

    public final void setAutoVisibility(boolean enabled, float threshold) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "setAutoVisibility enabled=" + enabled + " threshold=" + threshold);
        this.autoVisibility = enabled;
        this.visibilityThreshold = kotlin.ranges.RangesKt.coerceIn(threshold, 0.0f, 1.0f);
        if (enabled) {
            checkVisibility();
        }
    }

    public final int getCurrentPositionMs() {
        java.lang.Object m10798constructorimpl;
        if (this.prepared.get()) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.vungle.ads.internal.ui.view.AdVideoView adVideoView = this;
                android.media.MediaPlayer mediaPlayer = this.mp;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.lastPosMs);
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = valueOf;
            }
            return kotlin.ranges.RangesKt.coerceAtLeast(((java.lang.Number) m10798constructorimpl).intValue(), 0);
        }
        return kotlin.ranges.RangesKt.coerceAtLeast(this.lastPosMs, 0);
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final void release() {
        java.lang.Object m10798constructorimpl;
        java.lang.Object m10798constructorimpl2;
        java.lang.Object m10798constructorimpl3;
        kotlin.Unit unit;
        kotlin.Unit unit2;
        kotlin.Unit unit3;
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "release()");
        pause();
        this.handler.removeCallbacks(this.progressUpdater);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView = this;
            android.media.MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                unit3 = kotlin.Unit.INSTANCE;
            } else {
                unit3 = null;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(unit3);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to clear Surface", m10801exceptionOrNullimpl);
        }
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView2 = this;
            android.media.MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
                unit2 = kotlin.Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(unit2);
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        java.lang.Throwable m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl2);
        if (m10801exceptionOrNullimpl2 != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to stop MediaPlayer", m10801exceptionOrNullimpl2);
        }
        try {
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView3 = this;
            android.media.MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th3) {
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th3));
        }
        java.lang.Throwable m10801exceptionOrNullimpl3 = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl3);
        if (m10801exceptionOrNullimpl3 != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to release MediaPlayer", m10801exceptionOrNullimpl3);
        }
        this.mp = null;
        detachSurface();
        this.prepared.set(false);
        this.preparing.set(false);
    }

    private final void ensurePlayer() {
        if (this.mp != null) {
            return;
        }
        android.media.MediaPlayer invoke = this.mediaPlayerFactory.invoke();
        invoke.setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        invoke.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
                com.vungle.ads.internal.ui.view.AdVideoView.m10489ensurePlayer$lambda14$lambda10(com.vungle.ads.internal.ui.view.AdVideoView.this, mediaPlayer);
            }
        });
        invoke.setOnVideoSizeChangedListener(new android.media.MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda3
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                com.vungle.ads.internal.ui.view.AdVideoView.m10490ensurePlayer$lambda14$lambda11(com.vungle.ads.internal.ui.view.AdVideoView.this, mediaPlayer, i, i2);
            }
        });
        invoke.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
                com.vungle.ads.internal.ui.view.AdVideoView.m10491ensurePlayer$lambda14$lambda12(com.vungle.ads.internal.ui.view.AdVideoView.this, mediaPlayer);
            }
        });
        invoke.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda5
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                boolean m10492ensurePlayer$lambda14$lambda13;
                m10492ensurePlayer$lambda14$lambda13 = com.vungle.ads.internal.ui.view.AdVideoView.m10492ensurePlayer$lambda14$lambda13(com.vungle.ads.internal.ui.view.AdVideoView.this, mediaPlayer, i, i2);
                return m10492ensurePlayer$lambda14$lambda13;
            }
        });
        this.mp = invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-10, reason: not valid java name */
    public static final void m10489ensurePlayer$lambda14$lambda10(com.vungle.ads.internal.ui.view.AdVideoView this$0, android.media.MediaPlayer mediaPlayer) {
        android.view.Surface surface;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this$0.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPrepared();
        }
        this$0.durationMs = mediaPlayer.getDuration();
        this$0.preparing.set(false);
        this$0.prepared.set(true);
        int i = this$0.lastPosMs;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        this$0.applyMute();
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onPrepared(): duration=" + this$0.durationMs + " ms lastPos=" + this$0.lastPosMs + " wantPlay=" + this$0.wantPlay);
        if (this$0.wantPlay && (surface = this$0.surface) != null && surface.isValid()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "start video on prepared.");
            mediaPlayer.start();
            this$0.notifyPlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-11, reason: not valid java name */
    public static final void m10490ensurePlayer$lambda14$lambda11(com.vungle.ads.internal.ui.view.AdVideoView this$0, android.media.MediaPlayer mediaPlayer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this$0.videoW = i;
        this$0.videoH = i2;
        android.graphics.SurfaceTexture surfaceTexture = this$0.texture.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this$0.applyTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-12, reason: not valid java name */
    public static final void m10491ensurePlayer$lambda14$lambda12(com.vungle.ads.internal.ui.view.AdVideoView this$0, android.media.MediaPlayer mediaPlayer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onCompletion()");
        this$0.lastPosMs = this$0.durationMs;
        this$0.videoCompleted = true;
        this$0.endProgressUpdates();
        this$0.lastProgressSent = 100;
        this$0.notifyProgress(100);
        this$0.notifyCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m10492ensurePlayer$lambda14$lambda13(com.vungle.ads.internal.ui.view.AdVideoView this$0, android.media.MediaPlayer mediaPlayer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "onError(): what=" + i + ", extra=" + i2);
        this$0.preparing.set(false);
        this$0.prepared.set(false);
        this$0.notifyError(i, java.lang.String.valueOf(i2));
        return true;
    }

    private final void pauseInternal() {
        java.lang.Object m10798constructorimpl;
        android.media.MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null || !this.prepared.get() || !mediaPlayer.isPlaying()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "pauseInternal(): no-op (not playing or no player)");
        } else {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "pauseInternal(): pos=" + mediaPlayer.getCurrentPosition() + " ms");
            mediaPlayer.pause();
            notifyPause();
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView = this;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.lastPosMs);
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = valueOf;
        }
        this.lastPosMs = ((java.lang.Number) m10798constructorimpl).intValue();
    }

    private final void prepareIfNeeded() {
        java.lang.Object m10798constructorimpl;
        android.net.Uri uri;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView = this;
            uri = this.sourceUri;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (uri != null && !this.prepared.get() && !this.preparing.get()) {
            ensurePlayer();
            this.preparing.set(true);
            this.prepared.set(false);
            android.media.MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            android.media.MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(this.looping);
            }
            android.media.MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setSurface(this.surface);
            }
            android.media.MediaPlayer mediaPlayer4 = this.mp;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setDataSource(getContext(), uri);
            }
            com.vungle.ads.internal.util.Logger.Companion companion3 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("prepareAsync(): uri=");
            sb.append(uri);
            sb.append(", surfaceValid=");
            android.view.Surface surface = this.surface;
            kotlin.Unit unit = null;
            sb.append(surface != null ? java.lang.Boolean.valueOf(surface.isValid()) : null);
            companion3.d(TAG, sb.toString());
            android.media.MediaPlayer mediaPlayer5 = this.mp;
            if (mediaPlayer5 != null) {
                mediaPlayer5.prepareAsync();
                unit = kotlin.Unit.INSTANCE;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(unit);
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                notifyError(-1, java.lang.String.valueOf(m10801exceptionOrNullimpl.getLocalizedMessage()));
            }
        }
    }

    private final void applyMute() {
        float f = this.muted ? 0.0f : 1.0f;
        android.media.MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    private final void notifyPlay() {
        beginProgressUpdates();
        com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPlay();
        }
    }

    private final void notifyPause() {
        endProgressUpdates();
        com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPause();
        }
    }

    private final void notifyCompleted() {
        com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoCompleted();
        }
    }

    private final void notifyMuted(boolean muted) {
        com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoMuted(muted);
        }
    }

    private final void notifyError(int what, java.lang.String extra) {
        com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoError(what, extra);
        }
    }

    private final void notifyProgress(int percentage) {
        com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoProgress(percentage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateAndNotifyProgress() {
        int coerceIn;
        int i = this.durationMs;
        if (i <= 0 || !this.prepared.get() || (coerceIn = kotlin.ranges.RangesKt.coerceIn((int) ((getCurrentPositionMs() * 100) / i), 0, 100)) == this.lastProgressSent) {
            return;
        }
        this.lastProgressSent = coerceIn;
        notifyProgress(coerceIn);
    }

    private final void beginProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        this.handler.post(this.progressUpdater);
    }

    private final void endProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        calculateAndNotifyProgress();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture st, int width, int height) {
        java.lang.Object m10798constructorimpl;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(st, "st");
        android.view.Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = new android.view.Surface(st);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView = this;
            android.media.MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(this.surface);
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to set surface", m10801exceptionOrNullimpl);
        }
        boolean m10805isSuccessimpl = kotlin.Result.m10805isSuccessimpl(m10798constructorimpl);
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onSurfaceTextureAvailable(): " + width + " x " + height + ", prepared=" + this.prepared + ", wantPlay=" + this.wantPlay + ", surfaceRet=" + m10805isSuccessimpl);
        if (m10805isSuccessimpl && this.prepared.get() && this.wantPlay) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onSurfaceTextureAvailable and videoCompleted=" + this.videoCompleted);
            if (!this.videoCompleted) {
                android.media.MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
                notifyPlay();
            } else {
                seekTo(this.durationMs);
                android.media.MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
                android.media.MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.pause();
                }
            }
        } else {
            prepareIfNeeded();
        }
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture st, int width, int height) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(st, "st");
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onSurfaceTextureSizeChanged() width=" + width + " height=" + height);
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture st) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(st, "st");
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onSurfaceTextureDestroyed()");
        pauseInternal();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.AdVideoView adVideoView = this;
            android.media.MediaPlayer mediaPlayer = this.mp;
            kotlin.Unit unit = null;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                unit = kotlin.Unit.INSTANCE;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to clear surface", m10801exceptionOrNullimpl);
        }
        detachSurface();
        endProgressUpdates();
        return true;
    }

    private final void detachSurface() {
        android.view.Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    private final void applyTransform() {
        float f;
        if (this.videoW <= 0 || this.videoH <= 0) {
            return;
        }
        int width = this.texture.getWidth();
        int height = this.texture.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = this.videoW / this.videoH;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (f4 > f5) {
            f = f3 / this.videoH;
        } else {
            f = f2 / this.videoW;
        }
        matrix.setScale((this.videoW * f) / f2, (this.videoH * f) / f3, f2 / 2.0f, f3 / 2.0f);
        this.texture.setTransform(matrix);
        this.texture.invalidate();
        float f6 = (f2 - (this.videoW * f)) / 2.0f;
        float f7 = (f3 - (this.videoH * f)) / 2.0f;
        com.vungle.ads.internal.ui.view.AdVideoView.VideoTransformCallback videoTransformCallback = this.videoTransformCallback;
        if (videoTransformCallback != null) {
            videoTransformCallback.onVideoTransformed(this.texture.getX() + f6, this.texture.getY() + f7);
        }
    }

    private final void checkVisibility() {
        android.media.MediaPlayer mediaPlayer;
        android.view.Surface surface;
        if (this.autoVisibility) {
            if (isVisibleEnough() && this.wantPlay && !this.videoPaused) {
                if (this.prepared.get() && (surface = this.surface) != null && surface.isValid()) {
                    android.media.MediaPlayer mediaPlayer2 = this.mp;
                    if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.videoCompleted) {
                        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("auto-resume: visibility OK, start() at pos=");
                        android.media.MediaPlayer mediaPlayer3 = this.mp;
                        sb.append(mediaPlayer3 != null ? java.lang.Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                        sb.append(" ms");
                        companion.d(TAG, sb.toString());
                        android.media.MediaPlayer mediaPlayer4 = this.mp;
                        if (mediaPlayer4 != null) {
                            mediaPlayer4.start();
                        }
                        notifyPlay();
                        return;
                    }
                    return;
                }
                prepareIfNeeded();
                return;
            }
            if (this.prepared.get() && (mediaPlayer = this.mp) != null && mediaPlayer.isPlaying()) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "auto-pause: visibility NOT enough");
                pauseInternal();
            }
        }
    }

    private final boolean isVisibleEnough() {
        if (!isShown()) {
            return false;
        }
        if (!getGlobalVisibleRect(new android.graphics.Rect())) {
            return false;
        }
        long height = getHeight() * getWidth();
        return height > 0 && ((float) (r0.height() * r0.width())) / ((float) height) >= this.visibilityThreshold;
    }
}
