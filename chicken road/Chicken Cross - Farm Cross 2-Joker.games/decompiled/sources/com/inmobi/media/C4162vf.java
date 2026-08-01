package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4162vf extends AbstractC4254z {
    public final Uj b;
    public final C3912mi c;
    public final C3671e5 d;
    public final AbstractC3724g1 e;
    public final Nd f;
    public final Ed g;
    public final CoroutineScope h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4162vf(Uj renderedStateCache, C3912mi publisherNativeViewData, C3671e5 contextualDataHandler, AbstractC3724g1 adSessionManager, Nd nativeBeaconProcessor, Ed nativeAdUnitComponent) {
        super(nativeAdUnitComponent.f6535a);
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.b = renderedStateCache;
        this.c = publisherNativeViewData;
        this.d = contextualDataHandler;
        this.e = adSessionManager;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = AbstractC4012q5.a(k());
        this.i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.g(C4162vf.this);
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.c(C4162vf.this);
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.e(C4162vf.this);
            }
        });
        this.l = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.h(C4162vf.this);
            }
        });
        this.m = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.b(C4162vf.this);
            }
        });
        this.n = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.a(C4162vf.this);
            }
        });
        this.o = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.f(C4162vf.this);
            }
        });
        this.p = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vf$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4162vf.d(C4162vf.this);
            }
        });
    }

    public static final Pj a(C4162vf c4162vf) {
        return new Pj(c4162vf.d, c4162vf.e, c4162vf.g);
    }

    public static final Sd b(C4162vf c4162vf) {
        Ed ed = c4162vf.g;
        AbstractC3724g1 clickSession = c4162vf.e;
        C3671e5 contextualDataHandler = c4162vf.d;
        Nd nativeBeaconProcessor = c4162vf.f;
        C3821je nativeLandingPageHandler = (C3821je) c4162vf.p.getValue();
        Y9 l = c4162vf.l();
        Intrinsics.checkNotNullParameter(ed, "<this>");
        Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        Intrinsics.checkNotNullParameter(ed, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = ed.b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Kd(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Kd(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Kd(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Kd(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Kd(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Kd(ed.f6535a.b.f6590a.b.getNative().getAdChoiceConfig().getLink(), CollectionsKt.emptyList()));
            }
        }
        return new Sd(nativeLandingPageHandler, clickSession, contextualDataHandler, nativeBeaconProcessor, new Rd(ed.e, new Zj(linkedHashMap, ed.b.getMainLink(), ed.f6535a.b.g)), l);
    }

    public static final C3709fe c(C4162vf c4162vf) {
        CoroutineScope coroutineScope = c4162vf.h;
        Ip ip = (Ip) c4162vf.i.getValue();
        Ed ed = c4162vf.g;
        Intrinsics.checkNotNullParameter(ed, "<this>");
        AdConfig.NativeViewabilityConfig viewabilityConfig = ed.f6535a.b.f6590a.b.getNative().getViewabilityConfig();
        G g = ed.f6535a.b.m;
        Lp lp = new Lp(viewabilityConfig.getImpressionConfig().getPollInterval(), g.d, AbstractC4114tn.a(viewabilityConfig.getParentMinDimension().getDimensions()), g.c);
        MutableStateFlow mutableStateFlow = ((Mq) c4162vf.l.getValue()).b;
        c4162vf.l();
        return new C3709fe(coroutineScope, ip, lp, mutableStateFlow);
    }

    public static final C3821je d(C4162vf c4162vf) {
        String str;
        String str2;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        Context context = c4162vf.g.f6535a.f7489a.b;
        H h = c4162vf.f7514a.b;
        MetaInfo metaInfo = h.d;
        boolean z = (metaInfo == null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams2, 0)) == null || !landingPageParam2.getSupportLockScreen()) ? false : true;
        H h2 = c4162vf.f7514a.b;
        C3600bi c3600bi = h2.f6590a.f7340a;
        long j = c3600bi.f7031a;
        String str3 = h2.m.b;
        String str4 = c3600bi.h;
        String str5 = h2.c;
        MetaInfo metaInfo2 = h2.d;
        if (metaInfo2 == null || (str = metaInfo2.getCreativeType()) == null) {
            str = "unknown";
        }
        String str6 = str;
        String str7 = c4162vf.g.f6535a.b.i;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        H h3 = c4162vf.f7514a.b;
        boolean z2 = h3.b.f6522a;
        MetaInfo metaInfo3 = h3.d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams, 0)) == null || (str2 = landingPageParam.getOpenMode()) == null) {
            str2 = "DEFAULT";
        }
        return new C3821je(new C3850ke(context, h, z, new Zb(j, str3, str4, "native", str5, str6, str8, z2, str2), (Dd) c4162vf.g.f.getValue(), c4162vf.g.c, c4162vf.l()));
    }

    public static final Fe e(C4162vf c4162vf) {
        Vc c3870l6;
        NativeMedia media;
        NativeVideo video;
        CoroutineScope coroutineScope = c4162vf.h;
        Ed ed = c4162vf.g;
        Ip viewHolderConfig = (Ip) c4162vf.i.getValue();
        Intrinsics.checkNotNullParameter(ed, "<this>");
        Intrinsics.checkNotNullParameter(viewHolderConfig, "viewHolderConfig");
        F f = ed.f6535a.b.n;
        InMobiJsonResponse inMobiJsonResponse = ed.b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            c3870l6 = new C3608bp(((C3877ld) ed.g.getValue()).e, f.f6543a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = ed.f6535a.b.f6590a.b.getNative().getViewabilityConfig();
            c3870l6 = new C3870l6(viewHolderConfig, new Lp(viewabilityConfig.getImpressionConfig().getPollInterval(), f.b, AbstractC4114tn.a(viewabilityConfig.getParentMinDimension().getDimensions()), f.f6543a));
        }
        return new Fe(coroutineScope, c3870l6, ((Mq) c4162vf.l.getValue()).b);
    }

    public static final C3969oi f(C4162vf c4162vf) {
        c4162vf.getClass();
        return new C3969oi();
    }

    public static final Ip g(C4162vf c4162vf) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Ed ed = c4162vf.g;
        C3912mi publisherNativeViewData = c4162vf.c;
        Intrinsics.checkNotNullParameter(ed, "<this>");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        AdConfig.NativeConfig nativeConfig = ed.f6535a.b.f6590a.b.getNative();
        JsonAssetObject assetsObject = ed.b.getAssetsObject();
        Boolean bool = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = ed.b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (Intrinsics.areEqual((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                bool = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                bool = Boolean.valueOf(image.getRequired());
            }
        }
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (Intrinsics.areEqual(type, "video")) {
            if (!booleanValue) {
                z = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            z = icon.getRequired();
        }
        return new Ip(z, booleanValue, AbstractC4114tn.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), AbstractC4114tn.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), publisherNativeViewData);
    }

    public static final Mq h(C4162vf c4162vf) {
        return new Mq(c4162vf.f7514a.b.f6590a.b.getViewability().getWindowPollingInterval(), c4162vf.h, c4162vf.c.f7250a.getParentView(), c4162vf.l());
    }
}
