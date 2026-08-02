package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\t2\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u000e¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/data/mapper/HomeFeedMapper;", "", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "homeConfigManager", "<init>", "(Lcom/paypal/oslo/feature/home/domain/StringProvider;Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;)V", "", "Lcom/paypal/oslo/feature/home/graphql/GetHomeFeedQuery$Item;", "items", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "mapHomeFeedItems", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/home/graphql/GetHomeFeedQuery$Item;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/home/domain/model/Section;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HomeFeedMapper {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.StringProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.featureflags.HomeConfigManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public HomeFeedMapper(com.paypal.oslo.feature.home.domain.StringProvider stringProvider, com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeConfigManager, "");
        this.getHighSpeedVideoFpsRanges = stringProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = homeConfigManager;
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> mapHomeFeedItems(java.util.List<com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item> items) {
        com.paypal.oslo.feature.home.domain.model.Section<?> Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final int i = 0;
        for (java.lang.Object obj : items) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item) obj;
            java.lang.String str = item.get__typename();
            int hashCode = str.hashCode();
            com.paypal.oslo.feature.home.domain.model.Section<?> section = null;
            if (hashCode == -884557903) {
                if (str.equals("NBAContentComponent")) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(item, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper.$r8$lambda$dVzSJf95EWtvB1mgPThhx68pnMo(com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper.this, i, (com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item) obj2);
                        }
                    });
                }
                com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Home feed component dropped: unknown type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, item.get__typename())), null, 8, null);
                Camera2StreamConfigurationMap = null;
            } else if (hashCode == 401364311) {
                if (str.equals("ShoppingCollectionComponent")) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(item, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper.$r8$lambda$EZn7LFW3T8gOgmi_Qkww4gBN0zo(com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper.this, i, (com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item) obj2);
                        }
                    });
                }
                com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Home feed component dropped: unknown type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, item.get__typename())), null, 8, null);
                Camera2StreamConfigurationMap = null;
            } else {
                if (hashCode == 1589825530 && str.equals("AdComponent")) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(item, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper.$r8$lambda$pfWe3xpFLS1jxv7TS0FLjtI10Pc(com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper.this, (com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item) obj2);
                        }
                    });
                }
                com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Home feed component dropped: unknown type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, item.get__typename())), null, 8, null);
                Camera2StreamConfigurationMap = null;
            }
            if (Camera2StreamConfigurationMap != null && linkedHashSet.add(Camera2StreamConfigurationMap.getId())) {
                section = Camera2StreamConfigurationMap;
            }
            if (section != null) {
                arrayList.add(section);
            }
            i++;
        }
        return arrayList;
    }

    private static com.paypal.oslo.feature.home.domain.model.Section<?> Camera2StreamConfigurationMap(com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item item, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item, ? extends com.paypal.oslo.feature.home.domain.model.Section<?>> function1) {
        com.paypal.oslo.feature.home.domain.model.Section<?> invoke = function1.invoke(item);
        if (invoke != null) {
            if (invoke.getItems().isEmpty()) {
                com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Home feed section dropped: no valid items after mapping", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sectionId", invoke.getId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, invoke.getType())), null, 8, null);
            }
            return invoke;
        }
        com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Home feed component dropped: fragment is null", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("componentType", item.get__typename())), null, 8, null);
        return invoke;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Section $r8$lambda$EZn7LFW3T8gOgmi_Qkww4gBN0zo(com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper homeFeedMapper, int i, com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item item) {
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment shoppingCollectionComponentFragment;
        com.paypal.oslo.api.graphql.schema.type.ShoppingCollectionStoreVariant variant;
        com.paypal.oslo.feature.home.domain.model.Section copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.OnShoppingCollectionComponent onShoppingCollectionComponent = item.getOnShoppingCollectionComponent();
        if (onShoppingCollectionComponent != null && (shoppingCollectionComponentFragment = onShoppingCollectionComponent.getShoppingCollectionComponentFragment()) != null) {
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection = shoppingCollectionComponentFragment.getShoppingCollection();
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection = shoppingCollection.getOnStoreShoppingCollection();
            if (onStoreShoppingCollection != null && (variant = onStoreShoppingCollection.getVariant()) != null) {
                java.lang.String sectionIdPrefix = com.paypal.oslo.feature.home.data.mapper.SectionMapperFactory.INSTANCE.getSectionIdPrefix(variant);
                java.lang.String id = shoppingCollection.getId();
                java.lang.Object personalizationTrackingId = shoppingCollectionComponentFragment.getPersonalizationTrackingId();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(sectionIdPrefix);
                sb.append("_");
                sb.append(id);
                sb.append("_");
                sb.append(personalizationTrackingId);
                java.lang.String obj = sb.toString();
                com.paypal.oslo.feature.home.data.mapper.SectionMapper<?> mapper = com.paypal.oslo.feature.home.data.mapper.SectionMapperFactory.INSTANCE.getMapper(variant);
                com.paypal.oslo.feature.home.domain.StringProvider stringProvider = homeFeedMapper.getHighSpeedVideoFpsRanges;
                java.lang.Object personalizationTrackingId2 = shoppingCollectionComponentFragment.getPersonalizationTrackingId();
                com.paypal.oslo.feature.home.domain.model.Section<?> map = mapper.map(obj, i, shoppingCollection, stringProvider, personalizationTrackingId2 != null ? personalizationTrackingId2.toString() : null);
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.home.LoggerKt.log, "Collection variant mapped", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("variant", variant.getRawValue()), kotlin.TuplesKt.to("itemCount", java.lang.Integer.valueOf(map.getItems().size())), kotlin.TuplesKt.to("collectionId", shoppingCollection.getId())), null, 4, null);
                if (map.getButtonText() != null && kotlin.text.StringsKt.isBlank(map.getCtaPrompt())) {
                    map = map.copy((r18 & 1) != 0 ? map.id : null, (r18 & 2) != 0 ? map.type : null, (r18 & 4) != 0 ? map.title : null, (r18 & 8) != 0 ? map.subtitle : null, (r18 & 16) != 0 ? map.items : null, (r18 & 32) != 0 ? map.buttonText : null, (r18 & 64) != 0 ? map.ctaPrompt : homeFeedMapper.getHighSpeedVideoFpsRanges.getSeeMoreDefaultPrompt(), (r18 & 128) != 0 ? map.instrumentation : null);
                }
                if (homeFeedMapper.getHighResolutionOutputSizeshNQ4ISI.isSearchIntelligenceEnabled()) {
                    return map;
                }
                copy = r0.copy((r18 & 1) != 0 ? r0.id : null, (r18 & 2) != 0 ? r0.type : null, (r18 & 4) != 0 ? r0.title : null, (r18 & 8) != 0 ? r0.subtitle : null, (r18 & 16) != 0 ? r0.items : null, (r18 & 32) != 0 ? r0.buttonText : null, (r18 & 64) != 0 ? r0.ctaPrompt : "", (r18 & 128) != 0 ? map.instrumentation : null);
                return copy;
            }
            com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Unknown collection variant, using default mapping", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("collectionId", shoppingCollection.getId())), null, 8, null);
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Section $r8$lambda$dVzSJf95EWtvB1mgPThhx68pnMo(com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper homeFeedMapper, int i, com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item item) {
        com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment nBAContentComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent;
        com.paypal.oslo.feature.home.data.mapper.ValidatedNBAContent validatedContentOrLog;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.OnNBAContentComponent onNBAContentComponent = item.getOnNBAContentComponent();
        if (onNBAContentComponent == null || (nBAContentComponentFragment = onNBAContentComponent.getNBAContentComponentFragment()) == null || (validatedContentOrLog = com.paypal.oslo.feature.home.data.mapper.NBAContentExtensionsKt.toValidatedContentOrLog((nbaContent = nBAContentComponentFragment.getNbaContent()))) == null) {
            return null;
        }
        java.lang.String id = validatedContentOrLog.getId();
        java.lang.Object personalizationTrackingId = nBAContentComponentFragment.getPersonalizationTrackingId();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("nba_spotlight_");
        sb.append(id);
        sb.append("_");
        sb.append(personalizationTrackingId);
        java.lang.String obj = sb.toString();
        com.paypal.oslo.feature.home.domain.model.SpotlightNBA spotlightNBA = new com.paypal.oslo.feature.home.domain.model.SpotlightNBA(validatedContentOrLog.getId(), validatedContentOrLog.getVisualAssetUrl(), validatedContentOrLog.getDescription(), validatedContentOrLog.getSubDescription(), validatedContentOrLog.getButtonText(), validatedContentOrLog.getCtaUrl(), validatedContentOrLog.getCtaType(), validatedContentOrLog.getCtaNativeId(), new com.paypal.oslo.feature.home.domain.model.TileInstrumentation("spotlight_card", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.HOME_FEED, "nba", "view"), 0));
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.home.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        pairArr[0] = kotlin.TuplesKt.to("variant", "spotlight_nba");
        pairArr[1] = kotlin.TuplesKt.to("id", validatedContentOrLog.getId());
        java.lang.String ctaUrl = validatedContentOrLog.getCtaUrl();
        if (ctaUrl == null) {
            ctaUrl = "";
        }
        pairArr[2] = kotlin.TuplesKt.to("url", ctaUrl);
        com.paypal.oslo.feature.home.domain.model.NbaCtaType ctaType = validatedContentOrLog.getCtaType();
        java.lang.String name2 = ctaType != null ? ctaType.name() : null;
        if (name2 == null) {
            name2 = "";
        }
        pairArr[3] = kotlin.TuplesKt.to("type", name2);
        java.lang.String ctaNativeId = validatedContentOrLog.getCtaNativeId();
        pairArr[4] = kotlin.TuplesKt.to("nativeId", ctaNativeId != null ? ctaNativeId : "");
        com.paypal.android.logger.Logger.i$default(logger, "NBA mapped", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        java.lang.String title = nbaContent.getTitle();
        java.lang.String subtitle = nbaContent.getSubtitle();
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(spotlightNBA);
        com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta = nbaContent.getCta();
        java.lang.String text = cta != null ? cta.getText() : null;
        com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[] analyticsContextArr = new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[2];
        analyticsContextArr[0] = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.HOME_FEED, "nba", "view");
        java.lang.Object personalizationTrackingId2 = nBAContentComponentFragment.getPersonalizationTrackingId();
        analyticsContextArr[1] = personalizationTrackingId2 != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType.PIE, personalizationTrackingId2.toString()) : null;
        return new com.paypal.oslo.feature.home.domain.model.Section(obj, com.paypal.oslo.feature.home.domain.model.SectionTypes.NEXT_BEST_ACTION, title, subtitle, listOf, text, (java.lang.String) null, new com.paypal.oslo.feature.home.domain.model.SectionInstrumentation("spotlight_nba", i, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) analyticsContextArr)), 64, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Section $r8$lambda$pfWe3xpFLS1jxv7TS0FLjtI10Pc(com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper homeFeedMapper, com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.Item item) {
        com.paypal.oslo.feature.home.graphql.fragment.AdComponentFragment adComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.AdComponentFragment takeIfValidOrLog;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.home.graphql.GetHomeFeedQuery.OnAdComponent onAdComponent = item.getOnAdComponent();
        if (onAdComponent == null || (adComponentFragment = onAdComponent.getAdComponentFragment()) == null || (takeIfValidOrLog = com.paypal.oslo.feature.home.data.mapper.AdComponentExtensionsKt.takeIfValidOrLog(adComponentFragment)) == null) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(takeIfValidOrLog.getPersonalizationTrackingId());
        com.paypal.oslo.feature.home.domain.model.Advertisement advertisement = new com.paypal.oslo.feature.home.domain.model.Advertisement(valueOf, valueOf, "home_feed", 0, (java.lang.String) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.home.LoggerKt.log, "Ads fetched successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("adCount", 1)), null, 4, null);
        return new com.paypal.oslo.feature.home.domain.model.Section("ad_".concat(java.lang.String.valueOf(valueOf)), com.paypal.oslo.feature.home.domain.model.SectionTypes.ADS, (java.lang.String) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf(advertisement), (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 192, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
