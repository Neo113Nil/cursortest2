package org.betup.services.offer.banner;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.Image;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoader;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdRequest;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.offer.PromoService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AdMobNativeBannerProvider.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lorg/betup/services/offer/banner/AdMobNativeBannerProvider;", "Lorg/betup/services/offer/banner/BannerProvider;", "context", "Landroid/app/Activity;", "promoService", "Lorg/betup/services/offer/PromoService;", "adUnitRegistry", "Lorg/betup/services/ads/AdUnitRegistry;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/app/Activity;Lorg/betup/services/offer/PromoService;Lorg/betup/services/ads/AdUnitRegistry;)V", "mainHandler", "Landroid/os/Handler;", "nativeAd", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "pendingView", "Landroid/view/View;", "bannerController", "Lorg/betup/services/offer/banner/BannerController;", "isError", "", "isRequestingAds", "lastRequestTime", "", "requestNew", "", "loadNativeAd", "release", "getLayoutId", "", "fillView", ViewHierarchyConstants.VIEW_KEY, VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdMobNativeBannerProvider implements BannerProvider {
    private static final long REQUEST_COOLDOWN_MS = 5000;
    private static final String TAG = "AdMobNativeBanner";
    private final AdUnitRegistry adUnitRegistry;
    private BannerController bannerController;
    private final Activity context;
    private boolean isError;
    private boolean isRequestingAds;
    private long lastRequestTime;
    private final Handler mainHandler;
    private NativeAd nativeAd;
    private View pendingView;
    private final PromoService promoService;
    public static final int $stable = 8;

    @Override // org.betup.services.offer.banner.BannerProvider
    public int getLayoutId() {
        return R.layout.native_ad_banner;
    }

    public AdMobNativeBannerProvider(Activity context, PromoService promoService, AdUnitRegistry adUnitRegistry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(promoService, "promoService");
        Intrinsics.checkNotNullParameter(adUnitRegistry, "adUnitRegistry");
        this.context = context;
        this.promoService = promoService;
        this.adUnitRegistry = adUnitRegistry;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    @Override // org.betup.services.offer.banner.BannerProvider
    public void requestNew() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.isRequestingAds || currentTimeMillis - this.lastRequestTime < 5000 || !this.promoService.shouldDisplayPromo(PromoService.PromoCase.DEFAULT)) {
            return;
        }
        loadNativeAd();
    }

    private final void loadNativeAd() {
        if (this.context.isFinishing()) {
            return;
        }
        if (!MobileAds.INSTANCE.isInitialized()) {
            Log.d(TAG, "Skipping native load — GMA Next-Gen not initialized yet");
            return;
        }
        this.isRequestingAds = true;
        this.lastRequestTime = System.currentTimeMillis();
        this.isError = false;
        NativeAdLoader.INSTANCE.load(new NativeAdRequest.Builder(this.adUnitRegistry.nativeUnit(), CollectionsKt.listOf(NativeAd.NativeAdType.NATIVE)).build(), new AdMobNativeBannerProvider$loadNativeAd$1(this));
    }

    @Override // org.betup.services.offer.banner.BannerProvider
    public void release() {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.nativeAd = null;
        this.pendingView = null;
        this.bannerController = null;
    }

    @Override // org.betup.services.offer.banner.BannerProvider
    public void fillView(BannerController bannerController, View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        ImageView imageView;
        Button button;
        Intrinsics.checkNotNullParameter(view, "view");
        this.bannerController = bannerController;
        if (this.isError || !this.promoService.shouldDisplayPromo(PromoService.PromoCase.DEFAULT)) {
            if (bannerController != null) {
                bannerController.hideBanner();
                return;
            }
            return;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            this.pendingView = view;
            requestNew();
            return;
        }
        NativeAdView nativeAdView = (NativeAdView) view.findViewById(R.id.adView);
        if (nativeAdView == null || (textView = (TextView) view.findViewById(R.id.title)) == null || (textView2 = (TextView) view.findViewById(R.id.description)) == null || (textView3 = (TextView) view.findViewById(R.id.ad)) == null || (imageView = (ImageView) view.findViewById(R.id.icon)) == null || (button = (Button) view.findViewById(R.id.action)) == null) {
            return;
        }
        nativeAdView.setVisibility(0);
        textView.setText(nativeAd.getHeadline());
        textView2.setText(nativeAd.getBody());
        button.setText(nativeAd.getCallToAction());
        textView3.setText(this.context.getString(R.string.ad_label));
        Image icon = nativeAd.getIcon();
        Drawable drawable = icon != null ? icon.getDrawable() : null;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        nativeAdView.setHeadlineView(textView);
        nativeAdView.setBodyView(textView2);
        nativeAdView.setCallToActionView(button);
        nativeAdView.setIconView(imageView);
        nativeAdView.setAdvertiserView(textView3);
        nativeAdView.registerNativeAd(nativeAd, null);
    }
}
