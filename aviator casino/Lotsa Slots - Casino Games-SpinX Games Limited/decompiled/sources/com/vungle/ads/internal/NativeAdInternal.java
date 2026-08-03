package com.vungle.ads.internal;

/* compiled from: NativeAdInternal.kt */
@kotlin.Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0002\u0080\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000107J\u001a\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u001c2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0010\u0010:\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u000107J\u0010\u0010<\u001a\u0002042\b\u0010=\u001a\u0004\u0018\u000107J\u0006\u0010>\u001a\u00020\u001cJ\u0006\u0010?\u001a\u00020\u001cJ\n\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0006\u0010B\u001a\u00020\u001cJ\r\u0010C\u001a\u0004\u0018\u00010D¢\u0006\u0002\u0010EJ\u0006\u0010F\u001a\u00020\u001cJ\u0006\u0010G\u001a\u00020\u001cJ\b\u0010H\u001a\u00020\u001cH\u0002J\b\u0010I\u001a\u00020\u001cH\u0002J\r\u0010J\u001a\u00020\u001cH\u0000¢\u0006\u0002\bKJ\u0006\u0010L\u001a\u00020\u0007J\b\u0010M\u001a\u00020\u001cH\u0002J\r\u0010N\u001a\u00020\u001cH\u0000¢\u0006\u0002\bOJ\n\u0010P\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010Q\u001a\u00020\u001cH\u0002J\b\u0010R\u001a\u00020\u001cH\u0002J\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020TJ\u0018\u0010V\u001a\u0002042\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010ZJ\n\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020TH\u0016J\r\u0010^\u001a\u00020TH\u0000¢\u0006\u0002\b_J\r\u0010`\u001a\u00020TH\u0000¢\u0006\u0002\baJ\u0012\u0010b\u001a\u00020T2\b\u0010c\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010d\u001a\u00020T2\u0006\u0010e\u001a\u00020fH\u0016J\b\u0010g\u001a\u000204H\u0002J\u0015\u0010h\u001a\u0002042\u0006\u0010i\u001a\u00020jH\u0011¢\u0006\u0002\bkJ\r\u0010l\u001a\u000204H\u0001¢\u0006\u0002\bmJ\u0006\u0010n\u001a\u000204J\u0006\u0010o\u001a\u000204J\u0006\u0010p\u001a\u000204J\b\u0010q\u001a\u000204H\u0002J\b\u0010r\u001a\u000204H\u0003J\u0018\u0010s\u001a\u0002042\u0006\u0010W\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u001cJ&\u0010v\u001a\u0002042\u0006\u0010w\u001a\u00020x2\u0016\b\u0002\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020{\u0018\u00010zJ\u001a\u0010|\u001a\u0002042\u0006\u0010w\u001a\u00020\u001c2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010~\u001a\u0002042\u0006\u0010\u007f\u001a\u00020XR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R&\u0010$\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b.\u0010/R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lcom/vungle/ads/internal/NativeAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "aspectRatio", "", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "executors$delegate", "Lkotlin/Lazy;", "imageLoader", "Lcom/vungle/ads/internal/util/ImageLoader;", "getImageLoader", "()Lcom/vungle/ads/internal/util/ImageLoader;", "imageLoader$delegate", "impressionTracker", "Lcom/vungle/ads/internal/ImpressionTracker;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "isInvisibleLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeAdAssetMap", "", "", "onTouchListener", "Landroid/view/View$OnTouchListener;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;", "getPlatform", "()Lcom/vungle/ads/internal/platform/Platform;", "platform$delegate", "presenter", "Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "getPresenter$vungle_ads_release$annotations", "()V", "getPresenter$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "setPresenter$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/NativeAdPresenter;)V", "videoOptions", "Lcom/vungle/ads/nativead/NativeVideoOptions;", "getVideoOptions$vungle_ads_release", "()Lcom/vungle/ads/nativead/NativeVideoOptions;", "videoOptions$delegate", "waterMarkView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "destroy", "", "displayAppIcon", "imageView", "Landroid/widget/ImageView;", "displayImage", "path", "displayMainImage", "mainImage", "displayPrivacyIcon", com.ironsource.X3.i.J0, "getAdBodyText", "getAdCallToActionText", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "getAdSponsoredText", "getAdStarRating", "", "()Ljava/lang/Double;", "getAdTitle", "getAppIcon", "getCtaUrl", "getMainImagePath", "getMainVideoPath", "getMainVideoPath$vungle_ads_release", "getMediaAspectRatio", "getOMSDKData", "getOriginalVideoUrl", "getOriginalVideoUrl$vungle_ads_release", "getPlacementRefId", "getPrivacyIconUrl", "getPrivacyUrl", "hasCallToAction", "", "hasVideoContent", "initPresenter", "rootView", "Landroid/view/View;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "isAdStateValidOnCanPlay", "Lcom/vungle/ads/VungleError;", "isNativeVideo", "isStartMuted", "isStartMuted$vungle_ads_release", "isStartMutedByServer", "isStartMutedByServer$vungle_ads_release", "isValidAdSize", com.ironsource.X3.i.O, "isValidAdTypeForPlacement", "placement", "Lcom/vungle/ads/internal/model/Placement;", "logViewVisibleOnPlay", com.ironsource.Vf.j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "onImpression", "onImpression$vungle_ads_release", "onPrivacyIconClicked", "openCallToActionUrl", "openCallToActionUrlByUser", "retrieveImageRatio", "retrieveVideoRatio", "showWatermark", "Landroid/view/ViewGroup;", "watermark", "trackOMEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "args", "", "", "trackTpatEvent", "value", "trySetTouchListener", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class NativeAdInternal extends com.vungle.ads.internal.AdInternal implements com.vungle.ads.internal.presenter.NativePresenterDelegate {
    public static final int PLAYBACK_EVENT_CLICK = 8;
    public static final int PLAYBACK_EVENT_COMPLETE = 3;
    public static final int PLAYBACK_EVENT_IMPRESSION = 11;
    public static final int PLAYBACK_EVENT_MUTE = 9;
    public static final int PLAYBACK_EVENT_PAUSE = 2;
    public static final int PLAYBACK_EVENT_PLAY = 1;
    public static final int PLAYBACK_EVENT_QUARTILE_FIRST = 5;
    public static final int PLAYBACK_EVENT_QUARTILE_SECOND = 6;
    public static final int PLAYBACK_EVENT_QUARTILE_START = 4;
    public static final int PLAYBACK_EVENT_QUARTILE_THIRD = 7;
    public static final int PLAYBACK_EVENT_UNMUTE = 10;
    public static final java.lang.String QUARTILE_START_KEY_DURATION = "OM_KEY_DURATION";
    public static final java.lang.String QUARTILE_START_KEY_VOLUME = "OM_KEY_VOLUME";
    private static final java.lang.String TAG = "NativeAdInternal";
    private static final java.lang.String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    private static final java.lang.String TOKEN_APP_ICON = "APP_ICON";
    private static final java.lang.String TOKEN_APP_NAME = "APP_NAME";
    private static final java.lang.String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    private static final java.lang.String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    private static final java.lang.String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final java.lang.String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final java.lang.String TOKEN_MAIN_VIDEO = "MAIN_VIDEO";
    private static final java.lang.String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    private static final java.lang.String TOKEN_ORIGINAL_VIDEO_URL = "ORIGINAL_VIDEO_URL";
    private static final java.lang.String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    private static final java.lang.String TOKEN_START_MUTED = "START_MUTED";
    public static final java.lang.String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    private static final java.lang.String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";
    private float aspectRatio;

    /* renamed from: executors$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy executors;

    /* renamed from: imageLoader$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy imageLoader;

    /* renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy impressionTracker;
    private final java.util.concurrent.atomic.AtomicBoolean isInvisibleLogged;
    private java.util.Map<java.lang.String, java.lang.String> nativeAdAssetMap;
    private final android.view.View.OnTouchListener onTouchListener;

    /* renamed from: platform$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy platform;
    private com.vungle.ads.internal.presenter.NativeAdPresenter presenter;

    /* renamed from: videoOptions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy videoOptions;
    private com.vungle.ads.internal.ui.WatermarkView waterMarkView;

    public static /* synthetic */ void getPresenter$vungle_ads_release$annotations() {
    }

    @Override // com.vungle.ads.internal.AdInternal
    public com.vungle.ads.VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(com.vungle.ads.VungleAdSize adSize) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdInternal(final android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.impressionTracker = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.ImpressionTracker>() { // from class: com.vungle.ads.internal.NativeAdInternal$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.ImpressionTracker invoke() {
                return new com.vungle.ads.internal.ImpressionTracker(context);
            }
        });
        this.isInvisibleLogged = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        this.platform = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.platform.Platform>() { // from class: com.vungle.ads.internal.NativeAdInternal$special$$inlined$inject$1
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
        com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
        this.executors = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.internal.NativeAdInternal$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.executor.Executors invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.Executors.class);
            }
        });
        this.imageLoader = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.internal.util.ImageLoader>() { // from class: com.vungle.ads.internal.NativeAdInternal$imageLoader$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.util.ImageLoader invoke() {
                com.vungle.ads.internal.executor.Executors executors;
                com.vungle.ads.internal.util.ImageLoader companion3 = com.vungle.ads.internal.util.ImageLoader.INSTANCE.getInstance();
                executors = com.vungle.ads.internal.NativeAdInternal.this.getExecutors();
                companion3.init(executors.getIO_EXECUTOR());
                return companion3;
            }
        });
        this.videoOptions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.vungle.ads.nativead.NativeVideoOptions>() { // from class: com.vungle.ads.internal.NativeAdInternal$videoOptions$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.nativead.NativeVideoOptions invoke() {
                return new com.vungle.ads.nativead.NativeVideoOptions();
            }
        });
        this.onTouchListener = new android.view.View.OnTouchListener() { // from class: com.vungle.ads.internal.NativeAdInternal$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                boolean m10412onTouchListener$lambda0;
                m10412onTouchListener$lambda0 = com.vungle.ads.internal.NativeAdInternal.m10412onTouchListener$lambda0(com.vungle.ads.internal.NativeAdInternal.this, view, motionEvent);
                return m10412onTouchListener$lambda0;
            }
        };
    }

    private final com.vungle.ads.internal.ImpressionTracker getImpressionTracker() {
        return (com.vungle.ads.internal.ImpressionTracker) this.impressionTracker.getValue();
    }

    private final com.vungle.ads.internal.platform.Platform getPlatform() {
        return (com.vungle.ads.internal.platform.Platform) this.platform.getValue();
    }

    /* renamed from: getPresenter$vungle_ads_release, reason: from getter */
    public final com.vungle.ads.internal.presenter.NativeAdPresenter getPresenter() {
        return this.presenter;
    }

    public final void setPresenter$vungle_ads_release(com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter) {
        this.presenter = nativeAdPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.executor.Executors getExecutors() {
        return (com.vungle.ads.internal.executor.Executors) this.executors.getValue();
    }

    private final com.vungle.ads.internal.util.ImageLoader getImageLoader() {
        return (com.vungle.ads.internal.util.ImageLoader) this.imageLoader.getValue();
    }

    public final com.vungle.ads.nativead.NativeVideoOptions getVideoOptions$vungle_ads_release() {
        return (com.vungle.ads.nativead.NativeVideoOptions) this.videoOptions.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTouchListener$lambda-0, reason: not valid java name */
    public static final boolean m10412onTouchListener$lambda0(com.vungle.ads.internal.NativeAdInternal this$0, android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter == null) {
            return false;
        }
        nativeAdPresenter.onViewTouched(motionEvent);
        return false;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public java.lang.String getPlacementRefId() {
        com.vungle.ads.internal.model.Placement placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public boolean isNativeVideo() {
        return hasVideoContent();
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(com.vungle.ads.internal.model.Placement placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isNative();
    }

    public final java.lang.String getAppIcon() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final java.lang.String getAdTitle() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final java.lang.String getAdBodyText() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final java.lang.String getAdCallToActionText() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final java.lang.Double getAdStarRating() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(TOKEN_APP_RATING_VALUE)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toDoubleOrNull(str);
    }

    public final java.lang.String getAdSponsoredText() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final boolean hasCallToAction() {
        return getCtaUrl().length() > 0;
    }

    /* renamed from: getMediaAspectRatio, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    private final java.lang.String getPrivacyUrl() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    private final java.lang.String getCtaUrl() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    private final java.lang.String getOMSDKData() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_OM_SDK_DATA)) == null) ? "" : str;
    }

    private final java.lang.String getPrivacyIconUrl() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    private final java.lang.String getMainImagePath() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    public final java.lang.String getMainVideoPath$vungle_ads_release() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("MAIN_VIDEO")) == null) ? "" : str;
    }

    public final java.lang.String getOriginalVideoUrl$vungle_ads_release() {
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(TOKEN_ORIGINAL_VIDEO_URL)) == null) ? "" : str;
    }

    public final boolean isStartMutedByServer$vungle_ads_release() {
        java.lang.String str;
        java.lang.Boolean booleanStrictOrNull;
        java.util.Map<java.lang.String, java.lang.String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get("START_MUTED")) == null || (booleanStrictOrNull = kotlin.text.StringsKt.toBooleanStrictOrNull(str)) == null) {
            return true;
        }
        return booleanStrictOrNull.booleanValue();
    }

    public final boolean isStartMuted$vungle_ads_release() {
        if (!getPlatform().isSilentModeEnabled()) {
            java.lang.Boolean startMuted = getVideoOptions$vungle_ads_release().getStartMuted();
            if (!(startMuted != null ? startMuted.booleanValue() : isStartMutedByServer$vungle_ads_release())) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasVideoContent() {
        return getMainVideoPath$vungle_ads_release().length() > 0;
    }

    public final void displayAppIcon(android.widget.ImageView imageView) {
        displayImage(getAppIcon(), imageView);
    }

    public final void displayPrivacyIcon(android.widget.ImageView privacyIcon) {
        displayImage(getPrivacyIconUrl(), privacyIcon);
    }

    public final void displayMainImage(android.widget.ImageView mainImage) {
        displayImage(getMainImagePath(), mainImage);
    }

    public final void openCallToActionUrlByUser() {
        trackOMEvent$default(this, 8, null, 2, null);
        openCallToActionUrl();
    }

    public final void openCallToActionUrl() {
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            com.vungle.ads.internal.presenter.NativeAdPresenter.processCommand$default(nativeAdPresenter, com.vungle.ads.internal.presenter.NativeAdPresenter.DOWNLOAD, null, getCtaUrl(), 2, null);
        }
    }

    public final void onPrivacyIconClicked() {
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            com.vungle.ads.internal.presenter.NativeAdPresenter.processCommand$default(nativeAdPresenter, "openPrivacy", null, getPrivacyUrl(), 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackOMEvent$default(com.vungle.ads.internal.NativeAdInternal nativeAdInternal, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            map = null;
        }
        nativeAdInternal.trackOMEvent(i, map);
    }

    public final void trackOMEvent(int event, java.util.Map<java.lang.String, ? extends java.lang.Object> args) {
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.onOMEvent(event, args);
        }
    }

    public static /* synthetic */ void trackTpatEvent$default(com.vungle.ads.internal.NativeAdInternal nativeAdInternal, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        nativeAdInternal.trackTpatEvent(str, str2);
    }

    public final void trackTpatEvent(java.lang.String event, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand("tpat", event, value);
        }
    }

    @Override // com.vungle.ads.internal.AdInternal
    public com.vungle.ads.VungleError isAdStateValidOnCanPlay() {
        if (getAdState() == com.vungle.ads.internal.AdInternal.AdState.READY || isAdPlaying$vungle_ads_release()) {
            return null;
        }
        return new com.vungle.ads.InvalidAdStateError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED, getAdState() + " can not play native ad.");
    }

    public final void onImpression$vungle_ads_release() {
        trackTpatEvent$default(this, com.vungle.ads.internal.Constants.CHECKPOINT_0, null, 2, null);
        trackOMEvent$default(this, 11, null, 2, null);
    }

    public final void showWatermark(android.view.ViewGroup rootView, java.lang.String watermark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (watermark == null) {
            return;
        }
        if (this.waterMarkView == null) {
            android.content.Context context = rootView.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "rootView.context");
            this.waterMarkView = new com.vungle.ads.internal.ui.WatermarkView(context, watermark);
        }
        com.vungle.ads.internal.ui.WatermarkView watermarkView = this.waterMarkView;
        if (watermarkView == null || kotlin.jvm.internal.Intrinsics.areEqual(watermarkView.getParent(), rootView)) {
            return;
        }
        android.view.ViewParent parent = watermarkView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(watermarkView);
        }
        rootView.addView(watermarkView);
        watermarkView.bringToFront();
    }

    public final void initPresenter(android.view.View rootView, com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        com.vungle.ads.internal.model.AdPayload advertisement = getAdvertisement();
        if (advertisement == null) {
            com.vungle.ads.VungleError logError$vungle_ads_release = new com.vungle.ads.AdNotLoadedCantPlay("Ad is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release();
            if (adPlayCallback != null) {
                adPlayCallback.onFailure(logError$vungle_ads_release);
                return;
            }
            return;
        }
        if (this.presenter == null) {
            com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = new com.vungle.ads.internal.presenter.NativeAdPresenter(getContext(), this, advertisement, getPlatform());
            this.presenter = nativeAdPresenter;
            nativeAdPresenter.setEventListener(new com.vungle.ads.internal.presenter.AdEventListener(adPlayCallback, getPlacement()));
        }
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter2 = this.presenter;
        if (nativeAdPresenter2 != null) {
            nativeAdPresenter2.initAndStartOMTracker(rootView, getOMSDKData());
        }
        getImpressionTracker().addView(rootView, new com.vungle.ads.internal.ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.internal.NativeAdInternal$initPresenter$1
            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onImpression(android.view.View view) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d("NativeAdInternal", "ImpressionTracker checked the native ad view become visible.");
                com.vungle.ads.internal.NativeAdInternal.this.onImpression$vungle_ads_release();
                com.vungle.ads.internal.NativeAdInternal.this.logViewVisibleOnPlay();
            }

            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onViewInvisible(android.view.View view) {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                atomicBoolean = com.vungle.ads.internal.NativeAdInternal.this.isInvisibleLogged;
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                com.vungle.ads.internal.util.Logger.INSTANCE.d("NativeAdInternal", "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
                com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
                com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                singleValueMetric.setValue(1L);
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, com.vungle.ads.internal.NativeAdInternal.this.getLogEntry$vungle_ads_release(), (java.lang.String) null, 4, (java.lang.Object) null);
            }
        });
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter3 = this.presenter;
        if (nativeAdPresenter3 != null) {
            nativeAdPresenter3.prepare();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j = this.isInvisibleLogged.get() ? 3L : 2L;
        com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
        com.vungle.ads.SingleValueMetric singleValueMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(java.lang.Long.valueOf(j));
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry$vungle_ads_release(), (java.lang.String) null, 4, (java.lang.Object) null);
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j);
    }

    private final void displayImage(java.lang.String path, final android.widget.ImageView imageView) {
        getImageLoader().displayImage(path, new kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit>() { // from class: com.vungle.ads.internal.NativeAdInternal$displayImage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.graphics.Bitmap bitmap) {
                invoke2(bitmap);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final android.graphics.Bitmap it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                if (imageView != null) {
                    com.vungle.ads.internal.util.ThreadUtil threadUtil = com.vungle.ads.internal.util.ThreadUtil.INSTANCE;
                    final android.widget.ImageView imageView2 = imageView;
                    threadUtil.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.NativeAdInternal$displayImage$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            imageView2.setImageBitmap(it);
                        }
                    });
                }
            }
        });
    }

    private final void retrieveVideoRatio() {
        java.lang.Object m10798constructorimpl;
        java.lang.Throwable m10801exceptionOrNullimpl;
        java.lang.Object m10798constructorimpl2;
        java.lang.Integer intOrNull;
        java.lang.Integer intOrNull2;
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        try {
            android.content.Context context = getContext();
            android.net.Uri parse = android.net.Uri.parse(getMainVideoPath$vungle_ads_release());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            mediaMetadataRetriever.setDataSource(context, parse);
            java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            int i = 0;
            int intValue = (extractMetadata == null || (intOrNull2 = kotlin.text.StringsKt.toIntOrNull(extractMetadata)) == null) ? 0 : intOrNull2.intValue();
            java.lang.String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(extractMetadata2)) != null) {
                i = intOrNull.intValue();
            }
            if (intValue > 0 && i > 0) {
                this.aspectRatio = intValue / i;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.vungle.ads.internal.NativeAdInternal nativeAdInternal = this;
                mediaMetadataRetriever.release();
                m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl2);
            if (m10801exceptionOrNullimpl == null) {
                return;
            }
        } catch (java.lang.Throwable th2) {
            try {
                com.vungle.ads.internal.util.Logger.INSTANCE.e("NativeAd", "Failed to retrieve video metadata: " + th2.getLocalizedMessage());
                try {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    mediaMetadataRetriever.release();
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th3) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th3));
                }
                m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                if (m10801exceptionOrNullimpl == null) {
                    return;
                }
            } finally {
            }
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to release metadata retriever", m10801exceptionOrNullimpl);
    }

    private final void retrieveImageRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: com.vungle.ads.internal.NativeAdInternal$retrieveImageRatio$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i, int i2) {
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                com.vungle.ads.internal.NativeAdInternal.this.aspectRatio = i / i2;
            }
        });
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.AdPayload advertisement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        com.vungle.ads.internal.util.LogEntry logEntry$vungle_ads_release = getLogEntry$vungle_ads_release();
        java.lang.Long adLoadType = logEntry$vungle_ads_release != null ? logEntry$vungle_ads_release.getAdLoadType() : null;
        if ((adLoadType != null && adLoadType.longValue() == 3) || (adLoadType != null && adLoadType.longValue() == 4)) {
            sendWinURL();
        }
        if (hasVideoContent()) {
            retrieveVideoRatio();
        } else {
            retrieveImageRatio();
        }
    }

    public final void trySetTouchListener(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.vungle.ads.internal.model.AdPayload advertisement = getAdvertisement();
        if (advertisement == null || !advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        view.setOnTouchListener(this.onTouchListener);
    }

    public final void destroy() {
        com.vungle.ads.internal.ui.WatermarkView watermarkView = this.waterMarkView;
        if (watermarkView != null) {
            android.view.ViewParent parent = watermarkView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(watermarkView);
            }
        }
        this.waterMarkView = null;
        getImpressionTracker().destroy();
        com.vungle.ads.internal.presenter.NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.detach();
        }
    }
}
