package com.unity3d.services.banners.bridge;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceProvider;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: BannerBridge.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J:\u0010\u0015\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0007J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010 \u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010!\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\"\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006#"}, d2 = {"Lcom/unity3d/services/banners/bridge/BannerBridge;", "", "<init>", "()V", "load", "", "placementId", "", "bannerAdId", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "onBannerLoaded", "bannerAdView", "Lcom/unity3d/services/banners/BannerView;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "data", "Lorg/json/JSONObject;", "destroy", n.g, "left", "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "alpha", "", "visibilityChanged", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "didLoad", "didDestroy", "didAttach", "didDetach", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BannerBridge {
    public static final BannerBridge INSTANCE = new BannerBridge();

    @JvmStatic
    public static final void destroy(String bannerAdId) {
    }

    @JvmStatic
    public static final void didAttach(String bannerAdId) {
    }

    @JvmStatic
    public static final void didDestroy(String bannerAdId) {
    }

    @JvmStatic
    public static final void didDetach(String bannerAdId) {
    }

    @JvmStatic
    public static final void didLoad(String bannerAdId) {
    }

    @JvmStatic
    public static final void resize(String bannerAdId, int left, int top, int right, int bottom, float alpha) {
    }

    @JvmStatic
    public static final void visibilityChanged(String bannerAdId, int visibility) {
    }

    private BannerBridge() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void load(final String placementId, final String bannerAdId, UnityBannerSize bannerSize, final UnityAdsLoadOptions loadOptions) {
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        final BannerView bannerView = BannerViewCache.getInstance().getBannerView(bannerAdId);
        if (bannerView == null) {
            return;
        }
        if (loadOptions.getObjectId() == null) {
            loadOptions.setObjectId(bannerAdId);
        }
        new UnityAdsSDK(null, 1, 0 == true ? 1 : 0).load(placementId, loadOptions, new InternalLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$load$listener$1
            @Override // com.unity3d.ads.core.domain.InternalLoadListener
            public void onAdLoadFail(UnityAdsError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
                if (bannerView2 == null || bannerView2.getListener() == null) {
                    return;
                }
                bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(error));
            }

            @Override // com.unity3d.ads.core.domain.InternalLoadListener
            public void onAdLoaded(AdObject adObject) {
                Intrinsics.checkNotNullParameter(adObject, "adObject");
                BannerBridge.INSTANCE.onBannerLoaded(bannerView, bannerAdId, placementId, loadOptions);
            }
        }, bannerSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onBannerLoaded(final BannerView bannerAdView, final String bannerAdId, final String placementId, final UnityAdsLoadOptions loadOptions) {
        final BannerView.IListener listener = bannerAdView.getListener();
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(bannerAdId);
        if (bannerView == null) {
            if (listener != null) {
                listener.onBannerFailedToLoad(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                return;
            }
            return;
        }
        final BannerView bannerView2 = bannerView;
        if (ViewCompat.isAttachedToWindow(bannerView2)) {
            if (BannerViewCache.getInstance().getBannerView(bannerAdId) == null) {
                if (listener instanceof BannerShowListenerWithOnFailedToShow) {
                    ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                }
            } else {
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(loadOptions.getObjectId());
                IServiceProvider iServiceProvider = null;
                Object[] objArr = 0;
                if (loadOptions.loadConfiguration != null) {
                    unityAdsShowOptions.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                }
                new UnityAdsSDK(iServiceProvider, 1, objArr == true ? 1 : 0).show(placementId, unityAdsShowOptions, new BannerBridge$onBannerLoaded$1$2(listener, bannerAdView));
            }
        } else {
            bannerView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$onBannerLoaded$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    bannerView2.removeOnAttachStateChangeListener(this);
                    if (BannerViewCache.getInstance().getBannerView(bannerAdId) == null) {
                        BannerView.IListener iListener = listener;
                        if (iListener instanceof BannerShowListenerWithOnFailedToShow) {
                            Intrinsics.checkNotNull(iListener, "null cannot be cast to non-null type com.unity3d.ads.BannerShowListenerWithOnFailedToShow");
                            ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                            return;
                        }
                        return;
                    }
                    UnityAdsShowOptions unityAdsShowOptions2 = new UnityAdsShowOptions();
                    unityAdsShowOptions2.setObjectId(loadOptions.getObjectId());
                    if (loadOptions.loadConfiguration != null) {
                        unityAdsShowOptions2.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                    }
                    new UnityAdsSDK(null, 1, null).show(placementId, unityAdsShowOptions2, new BannerBridge$onBannerLoaded$1$2(listener, bannerAdView));
                }
            });
        }
        if (listener != null) {
            listener.onBannerLoaded(bannerAdView);
        }
    }

    private final boolean isHeaderBidding(JSONObject data) {
        if (data == null) {
            return false;
        }
        return data.has("adMarkup");
    }
}
