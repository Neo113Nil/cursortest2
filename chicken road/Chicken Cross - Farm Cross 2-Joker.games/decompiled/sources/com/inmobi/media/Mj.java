package com.inmobi.media;

import android.content.Context;
import android.view.View;
import androidx.webkit.Profile;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Mj extends Ej {
    public final byte l1;
    public final Z9 m1;
    public final String n1;
    public final Ej o1;
    public final Lj p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mj(Context context, byte b, Z9 z9, C3979p0 adMetaData, yq webViewFactory, C3715fk route, AdConfig adConfig) {
        super(context, b, null, null, adMetaData.r, 0L, adMetaData.s, z9, route, webViewFactory, adMetaData, adConfig, 92);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.l1 = b;
        this.m1 = z9;
        this.n1 = "RenderViewSibling - " + route.b;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        this.o1 = (Ej) webViewFactory.b.get(BuildConfig.FLAVOR);
        this.p1 = new Lj(this, webViewFactory, route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ej getAdRenderView() {
        Z9 z9;
        if (this.o1 == null && (z9 = this.m1) != null) {
            z9.b(this.n1, "Ad RenderView not found for id: " + getRoute().b);
        }
        return this.o1;
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.Ej
    public final void E() {
    }

    @Override // com.inmobi.media.Ej
    public final void a(Jg orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        Z9 z9 = this.m1;
        if (z9 != null) {
            z9.a(this.n1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }

    @Override // com.inmobi.media.Ej, com.inmobi.media.D
    public final void b() {
        l();
        removeAllViews();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    public final void b0() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        Z9 z9 = this.m1;
        if (z9 != null) {
            z9.a(this.n1, "initialize RenderViewSibling");
        }
        a(this.p1);
        Ej adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        Ej adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        Ej adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof Mj)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Z9 z92 = this.m1;
        if (z92 != null) {
            z92.a(this.n1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(MapsKt.toMutableMap(linkedHashMap));
    }

    public final Y9 getLogger() {
        return this.m1;
    }

    public final byte getMPlacementType() {
        return this.l1;
    }

    @Override // com.inmobi.media.Ej, com.inmobi.media.D
    public Tp getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new C3989pa(this, this, new T7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.m1), this.m1));
        }
        Tp mViewableAd = getMViewableAd();
        Intrinsics.checkNotNull(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.Ej
    public final void o() {
        Z9 z9 = this.m1;
        if (z9 != null) {
            z9.a(this.n1, "dismissCurrentViewContainer " + this);
        }
        C4187wd mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C3764hd c3764hd = mediaProcessor.c;
            if (c3764hd != null) {
                c3764hd.b();
            }
            mediaProcessor.c = null;
        }
        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.Ej, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yq webViewFactory = getWebViewFactory();
        String id = getRoute().f7109a;
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Ej ej = (Ej) webViewFactory.b.get(id);
        if (ej != null) {
            c(ej, getRoute().b);
            return;
        }
        Z9 z9 = this.m1;
        if (z9 != null) {
            z9.b(this.n1, "Not able to give show success as the source view is not present");
        }
    }

    @Override // com.inmobi.media.Ej
    public final void v() {
    }
}
