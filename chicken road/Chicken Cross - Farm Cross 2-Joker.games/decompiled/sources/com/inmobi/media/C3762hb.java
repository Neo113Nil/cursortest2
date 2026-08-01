package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3762hb extends AbstractC3734gb {

    /* renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f7139a;

    public C3762hb(InterstitialAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f7139a = adEventListener;
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, Map params) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f7139a.onAdClicked(ad, params);
    }

    @Override // com.inmobi.media.K
    public final void b(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f7139a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f7139a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f7139a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, String data) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f7139a, ad, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
