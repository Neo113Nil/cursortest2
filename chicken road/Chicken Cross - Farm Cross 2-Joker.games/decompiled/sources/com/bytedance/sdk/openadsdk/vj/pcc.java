package com.bytedance.sdk.openadsdk.vj;

import android.text.TextUtils;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.qf;
import com.bytedance.sdk.openadsdk.component.reward.nac;
import com.bytedance.sdk.openadsdk.component.reward.vy;
import com.bytedance.sdk.openadsdk.component.reward.wh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.ork.kj;
import com.bytedance.sdk.openadsdk.pcc.sf.vj;
import com.bytedance.sdk.openadsdk.pcc.vj.sf;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class pcc implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vj.pcc.1
            private int sf;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot build = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                if (pAGAppOpenRequest != null) {
                    this.sf = pAGAppOpenRequest.getTimeout();
                }
                final com.bytedance.sdk.openadsdk.pcc.oo.pcc pccVar = new com.bytedance.sdk.openadsdk.pcc.oo.pcc(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(new gm("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.vj.pcc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!lu.oo().jr() && kun.mk()) {
                                pccVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(pccVar)) {
                                return;
                            }
                            AdSlot adSlot = build;
                            if (adSlot == null) {
                                pccVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                qf.pcc(lu.pcc()).pcc(build, pccVar, AnonymousClass1.this.sf);
                            }
                        } catch (Throwable th) {
                            lo.pcc("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, pccVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vj.pcc.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest != null ? pAGBannerRequest.getAdSize() : null;
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot build = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.pcc.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.pcc.pcc.pcc(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(new gm("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.vj.pcc.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lu.oo().jr() && kun.mk()) {
                            pccVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(pccVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int oo = rj.oo(lu.pcc());
                            int qf = rj.qf(lu.pcc());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > oo || adSize.getWidth() <= 0 || height > qf || height < 0) {
                                pccVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            pccVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            kj.pcc(lu.pcc()).pcc(build, 1, pccVar);
                        }
                    }
                }, pccVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vj.pcc.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final vj vjVar = new vj(pAGNativeAdLoadListener);
                AdSlot.Builder withBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(withBid, pAGNativeRequest);
                final AdSlot build = withBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(new gm("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.vj.pcc.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lu.oo().jr() && kun.mk()) {
                            vjVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(vjVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            vjVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.sf.pcc.pcc().pcc(lu.pcc(), build, vjVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, vjVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vj.pcc.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(codeId, pAGRewardedRequest);
                final AdSlot build = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final sf sfVar = new sf(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(new gm("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.vj.pcc.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lu.oo().jr() && kun.mk()) {
                            sfVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(sfVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            sfVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            if (com.bytedance.sdk.openadsdk.utils.sf.oo()) {
                                com.bytedance.sdk.openadsdk.component.reward.lu.pcc(lu.pcc()).pcc(build, (AdSlot) new vy(sfVar));
                            } else {
                                nac.pcc(lu.pcc()).pcc(build, new vy(sfVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, sfVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vj.pcc.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot build = codeId.build();
                final com.bytedance.sdk.openadsdk.pcc.gm.pcc pccVar = new com.bytedance.sdk.openadsdk.pcc.gm.pcc(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.pcc.pcc.pcc(new gm("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.vj.pcc.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!lu.oo().jr() && kun.mk()) {
                            pccVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.pcc.pcc.pcc(pccVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            pccVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            if (com.bytedance.sdk.openadsdk.utils.sf.oo()) {
                                com.bytedance.sdk.openadsdk.component.reward.qf.pcc(lu.pcc()).pcc(build, (AdSlot) new com.bytedance.sdk.openadsdk.component.gm.sf(pccVar));
                            } else {
                                wh.pcc(lu.pcc()).pcc(build, new com.bytedance.sdk.openadsdk.component.gm.sf(pccVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, pccVar, build);
            }
        };
    }
}
