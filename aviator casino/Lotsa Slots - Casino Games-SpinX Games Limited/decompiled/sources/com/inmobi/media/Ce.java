package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ce extends com.inmobi.media.AbstractC2892y {
    public final com.inmobi.media.Fi b;
    public final com.inmobi.media.C2304bh c;
    public final com.inmobi.media.H4 d;
    public final com.inmobi.media.AbstractC2367e1 e;
    public final com.inmobi.media.Vc f;
    public final com.inmobi.media.Mc g;
    public final kotlinx.coroutines.CoroutineScope h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ce(com.inmobi.media.Fi renderedStateCache, com.inmobi.media.C2304bh publisherNativeViewData, com.inmobi.media.H4 contextualDataHandler, com.inmobi.media.AbstractC2367e1 adSessionManager, com.inmobi.media.Vc nativeBeaconProcessor, com.inmobi.media.Mc nativeAdUnitComponent) {
        super(nativeAdUnitComponent.f4836a);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.b = renderedStateCache;
        this.c = publisherNativeViewData;
        this.d = contextualDataHandler;
        this.e = adSessionManager;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = com.inmobi.media.T4.a(k());
        this.i = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.g(com.inmobi.media.Ce.this);
            }
        });
        this.j = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.c(com.inmobi.media.Ce.this);
            }
        });
        this.k = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.e(com.inmobi.media.Ce.this);
            }
        });
        this.l = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.h(com.inmobi.media.Ce.this);
            }
        });
        this.m = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.b(com.inmobi.media.Ce.this);
            }
        });
        this.n = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.a(com.inmobi.media.Ce.this);
            }
        });
        this.o = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.f(com.inmobi.media.Ce.this);
            }
        });
        this.p = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ce$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ce.d(com.inmobi.media.Ce.this);
            }
        });
    }

    public static final com.inmobi.media.Ai a(com.inmobi.media.Ce ce) {
        return new com.inmobi.media.Ai(ce.d, ce.e, ce.g);
    }

    public static final com.inmobi.media.C2274ad b(com.inmobi.media.Ce ce) {
        com.inmobi.media.Mc mc = ce.g;
        com.inmobi.media.AbstractC2367e1 clickSession = ce.e;
        com.inmobi.media.H4 contextualDataHandler = ce.d;
        com.inmobi.media.Vc nativeBeaconProcessor = ce.f;
        com.inmobi.media.C2721rd nativeLandingPageHandler = (com.inmobi.media.C2721rd) ce.p.getValue();
        com.inmobi.media.InterfaceC2772t9 l = ce.l();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = mc.b.getAssetsObject();
        if (assetsObject != null) {
            com.inmobi.media.ads.network.inmobiJson.model.Title title = assetsObject.getTitle();
            if (title != null) {
                com.inmobi.media.ads.network.inmobiJson.model.Link link = title.getLink();
                linkedHashMap.put((short) 3, new com.inmobi.media.Sc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            com.inmobi.media.ads.network.inmobiJson.model.Description description = assetsObject.getDescription();
            if (description != null) {
                com.inmobi.media.ads.network.inmobiJson.model.Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new com.inmobi.media.Sc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            com.inmobi.media.ads.network.inmobiJson.model.Icon icon = assetsObject.getIcon();
            if (icon != null) {
                com.inmobi.media.ads.network.inmobiJson.model.Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new com.inmobi.media.Sc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            com.inmobi.media.ads.network.inmobiJson.model.CTA cta = assetsObject.getCta();
            if (cta != null) {
                com.inmobi.media.ads.network.inmobiJson.model.Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new com.inmobi.media.Sc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            com.inmobi.media.ads.network.inmobiJson.model.Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                com.inmobi.media.ads.network.inmobiJson.model.Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new com.inmobi.media.Sc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new com.inmobi.media.Sc(mc.f4836a.b.f4714a.b.getNative().getAdChoiceConfig().getLink(), kotlin.collections.CollectionsKt.emptyList()));
            }
        }
        return new com.inmobi.media.C2274ad(nativeLandingPageHandler, clickSession, contextualDataHandler, nativeBeaconProcessor, new com.inmobi.media.Zc(mc.e, new com.inmobi.media.Ki(linkedHashMap, mc.b.getMainLink(), mc.f4836a.b.g)), l);
    }

    public static final com.inmobi.media.C2617nd c(com.inmobi.media.Ce ce) {
        kotlinx.coroutines.CoroutineScope coroutineScope = ce.h;
        com.inmobi.media.Ln ln = (com.inmobi.media.Ln) ce.i.getValue();
        com.inmobi.media.Mc mc = ce.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
        com.inmobi.media.core.config.models.AdConfig.NativeViewabilityConfig viewabilityConfig = mc.f4836a.b.f4714a.b.getNative().getViewabilityConfig();
        com.inmobi.media.F f = mc.f4836a.b.m;
        com.inmobi.media.On on = new com.inmobi.media.On(viewabilityConfig.getImpressionConfig().getPollInterval(), f.d, com.inmobi.media.AbstractC2914yl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f.c);
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = ((com.inmobi.media.Po) ce.l.getValue()).b;
        ce.l();
        return new com.inmobi.media.C2617nd(coroutineScope, ln, on, mutableStateFlow);
    }

    public static final com.inmobi.media.C2721rd d(com.inmobi.media.Ce ce) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List<com.inmobi.media.ads.network.common.model.LandingPageParam> landingPageParams;
        com.inmobi.media.ads.network.common.model.LandingPageParam landingPageParam;
        java.util.List<com.inmobi.media.ads.network.common.model.LandingPageParam> landingPageParams2;
        com.inmobi.media.ads.network.common.model.LandingPageParam landingPageParam2;
        android.content.Context context = ce.g.f4836a.f5538a.b;
        com.inmobi.media.G g = ce.f5559a.b;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo = g.d;
        boolean z = (metaInfo == null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam2 = (com.inmobi.media.ads.network.common.model.LandingPageParam) kotlin.collections.CollectionsKt.getOrNull(landingPageParams2, 0)) == null || !landingPageParam2.getSupportLockScreen()) ? false : true;
        com.inmobi.media.G g2 = ce.f5559a.b;
        com.inmobi.media.Sg sg = g2.f4714a.f5382a;
        long j = sg.f4958a;
        java.lang.String str3 = g2.m.b;
        java.lang.String str4 = sg.g;
        java.lang.String str5 = g2.c;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo2 = g2.d;
        if (metaInfo2 == null || (str = metaInfo2.getCreativeType()) == null) {
            str = "unknown";
        }
        java.lang.String str6 = str;
        java.lang.String str7 = ce.g.f4836a.b.i;
        if (str7 == null) {
            str7 = "";
        }
        java.lang.String str8 = str7;
        com.inmobi.media.G g3 = ce.f5559a.b;
        boolean z2 = g3.b.f4651a;
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo3 = g3.d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (com.inmobi.media.ads.network.common.model.LandingPageParam) kotlin.collections.CollectionsKt.getOrNull(landingPageParams, 0)) == null || (str2 = landingPageParam.getOpenMode()) == null) {
            str2 = "DEFAULT";
        }
        return new com.inmobi.media.C2721rd(new com.inmobi.media.C2748sd(context, g, z, new com.inmobi.media.C2457hb(j, str3, str4, "native", str5, str6, str8, z2, str2), (com.inmobi.media.Lc) ce.g.f.getValue(), ce.g.c, ce.l()));
    }

    public static final com.inmobi.media.Nd e(com.inmobi.media.Ce ce) {
        com.inmobi.media.AbstractC2353dc o5;
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media;
        com.inmobi.media.ads.network.inmobiJson.model.NativeVideo video;
        kotlinx.coroutines.CoroutineScope coroutineScope = ce.h;
        com.inmobi.media.Mc mc = ce.g;
        com.inmobi.media.Ln viewHolderConfig = (com.inmobi.media.Ln) ce.i.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolderConfig, "viewHolderConfig");
        com.inmobi.media.E e = mc.f4836a.b.n;
        com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse inMobiJsonResponse = mc.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if (assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null || !video.getRequired()) {
            com.inmobi.media.core.config.models.AdConfig.NativeViewabilityConfig viewabilityConfig = mc.f4836a.b.f4714a.b.getNative().getViewabilityConfig();
            o5 = new com.inmobi.media.O5(viewHolderConfig, new com.inmobi.media.On(viewabilityConfig.getImpressionConfig().getPollInterval(), e.b, com.inmobi.media.AbstractC2914yl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e.f4671a));
        } else {
            o5 = new com.inmobi.media.C2390en(((com.inmobi.media.C2775tc) mc.g.getValue()).e, e.f4671a);
        }
        return new com.inmobi.media.Nd(coroutineScope, o5, ((com.inmobi.media.Po) ce.l.getValue()).b);
    }

    public static final com.inmobi.media.C2358dh f(com.inmobi.media.Ce ce) {
        ce.getClass();
        return new com.inmobi.media.C2358dh();
    }

    public static final com.inmobi.media.Ln g(com.inmobi.media.Ce ce) {
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media;
        com.inmobi.media.ads.network.inmobiJson.model.NativeImage image;
        com.inmobi.media.ads.network.inmobiJson.model.Icon icon;
        boolean required;
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media2;
        com.inmobi.media.ads.network.inmobiJson.model.NativeVideo video;
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media3;
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media4;
        com.inmobi.media.Mc mc = ce.g;
        com.inmobi.media.C2304bh publisherNativeViewData = ce.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        com.inmobi.media.core.config.models.AdConfig.NativeConfig nativeConfig = mc.f4836a.b.f4714a.b.getNative();
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = mc.b.getAssetsObject();
        java.lang.Boolean bool = null;
        java.lang.String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse inMobiJsonResponse = mc.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (kotlin.jvm.internal.Intrinsics.areEqual((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                bool = java.lang.Boolean.valueOf(video.getRequired());
            }
        } else {
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                bool = java.lang.Boolean.valueOf(image.getRequired());
            }
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, "video")) {
            if (!booleanValue) {
                required = true;
            }
            required = false;
        } else {
            if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
                required = icon.getRequired();
            }
            required = false;
        }
        return new com.inmobi.media.Ln(required, booleanValue, com.inmobi.media.AbstractC2914yl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), com.inmobi.media.AbstractC2914yl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), publisherNativeViewData);
    }

    public static final com.inmobi.media.Po h(com.inmobi.media.Ce ce) {
        return new com.inmobi.media.Po(ce.f5559a.b.f4714a.b.getViewability().getWindowPollingInterval(), ce.h, ce.c.f5125a.getParentView(), ce.l());
    }
}
