package com.paypal.oslo.feature.ads.data.repository.ol;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/repository/ol/AdProviderRepositoryImpl;", "Lcom/paypal/oslo/feature/ads/data/repository/ol/AdProviderDataSource;", "Lcom/paypal/oslo/feature/ads/data/repository/client/AdsApiClient;", "apiClient", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProvider;", "userIdentifierProvider", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;", "userIdentificationProvider", "<init>", "(Lcom/paypal/oslo/feature/ads/data/repository/client/AdsApiClient;Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProvider;Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;)V", "", "appVersion", "publisher", "page", "Lkotlin/Result;", "", "Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdEntity;", "getAds-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAds", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/ads/data/repository/client/AdsApiClient;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdProviderRepositoryImpl implements com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AdProviderRepositoryImpl(com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient adsApiClient, com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider userIdentifierProvider, com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider userIdentificationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsApiClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIdentifierProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIdentificationProvider, "");
        this.getHighSpeedVideoFpsRangesFor = adsApiClient;
        this.getHighResolutionOutputSizeshNQ4ISI = userIdentifierProvider;
        this.Camera2StreamConfigurationMap = userIdentificationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x018d A[Catch: Exception -> 0x023a, TryCatch #0 {Exception -> 0x023a, blocks: (B:13:0x0049, B:14:0x0164, B:15:0x0187, B:17:0x018d, B:19:0x0193, B:21:0x0196, B:24:0x01a4, B:25:0x01b7, B:27:0x01bd, B:29:0x0214, B:36:0x0066, B:37:0x00c6, B:39:0x0104, B:42:0x010e, B:49:0x0076, B:51:0x00a2, B:55:0x0083), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bd A[Catch: Exception -> 0x023a, LOOP:1: B:25:0x01b7->B:27:0x01bd, LOOP_END, TryCatch #0 {Exception -> 0x023a, blocks: (B:13:0x0049, B:14:0x0164, B:15:0x0187, B:17:0x018d, B:19:0x0193, B:21:0x0196, B:24:0x01a4, B:25:0x01b7, B:27:0x01bd, B:29:0x0214, B:36:0x0066, B:37:0x00c6, B:39:0x0104, B:42:0x010e, B:49:0x0076, B:51:0x00a2, B:55:0x0083), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[Catch: Exception -> 0x023a, TRY_LEAVE, TryCatch #0 {Exception -> 0x023a, blocks: (B:13:0x0049, B:14:0x0164, B:15:0x0187, B:17:0x018d, B:19:0x0193, B:21:0x0196, B:24:0x01a4, B:25:0x01b7, B:27:0x01bd, B:29:0x0214, B:36:0x0066, B:37:0x00c6, B:39:0x0104, B:42:0x010e, B:49:0x0076, B:51:0x00a2, B:55:0x0083), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource
    /* renamed from: getAds-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo11971getAdsBWLJW6A(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity>>> continuation) {
        com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$getAds$1 adProviderRepositoryImpl$getAds$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object obj;
        java.lang.String str6;
        java.lang.Object userCountry;
        java.lang.String str7;
        final java.lang.String str8;
        final com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier userIdentifier;
        java.lang.String str9;
        java.lang.String value;
        com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest getDisplayAdsRequest;
        java.util.Iterator it;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity copy;
        try {
            if (continuation instanceof com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$getAds$1) {
                adProviderRepositoryImpl$getAds$1 = (com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$getAds$1) continuation;
                if ((adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                    adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration -= 2147483648;
                    java.lang.Object obj2 = adProviderRepositoryImpl$getAds$1.getOutputFormats;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration;
                    int i2 = 0;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider userIdentifierProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                        str4 = str;
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRanges = str4;
                        adProviderRepositoryImpl$getAds$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration = 1;
                        java.lang.Object userIdentifier2 = userIdentifierProvider.getUserIdentifier(adProviderRepositoryImpl$getAds$1);
                        if (userIdentifier2 != coroutine_suspended) {
                            str5 = str2;
                            obj = userIdentifier2;
                            str6 = str3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            getDisplayAdsRequest = (com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest) adProviderRepositoryImpl$getAds$1.getInputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            java.util.List flatten = kotlin.collections.CollectionsKt.flatten(((com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse) obj2).getAds().values());
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(flatten, 10));
                            for (java.lang.Object obj3 : flatten) {
                                if (i2 < 0) {
                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                }
                                arrayList.add(com.paypal.oslo.feature.ads.data.repository.ol.AolMapper.INSTANCE.toDomain$ads_prodRelease((com.paypal.oslo.feature.ads.data.models.smithy.Ad) obj3, i2));
                                i2++;
                            }
                            java.util.ArrayList arrayList2 = arrayList;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                copy = r5.copy((r26 & 1) != 0 ? r5.id : null, (r26 & 2) != 0 ? r5.clickUrl : null, (r26 & 4) != 0 ? r5.impressionUrl : null, (r26 & 8) != 0 ? r5.trackingUrls : null, (r26 & 16) != 0 ? r5.asset : null, (r26 & 32) != 0 ? r5.countryCode : getDisplayAdsRequest.getCountry().getValue(), (r26 & 64) != 0 ? r5.impressionStrategy : null, (r26 & 128) != 0 ? r5.metadata : null, (r26 & 256) != 0 ? r5.publisher : getDisplayAdsRequest.getPublisher().getValue(), (r26 & 512) != 0 ? r5.page : getDisplayAdsRequest.getPage().getValue(), (r26 & 1024) != 0 ? r5.placement : kotlin.collections.CollectionsKt.joinToString$default(getDisplayAdsRequest.getPlacements(), ",", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj4) {
                                        return com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl.$r8$lambda$vPhVO8L9PYIxcuGpUIGpJ_h77N4((com.paypal.oslo.feature.ads.data.models.smithy.Placement) obj4);
                                    }
                                }, 30, null), (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity) it.next()).rawClickUrl : null);
                                arrayList3.add(copy);
                            }
                            java.util.ArrayList arrayList4 = arrayList3;
                            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.ads.LoggerKt.log, "Ad fetch successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("adsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(arrayList4.size()))), null, 4, null);
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            return kotlin.Result.m23436constructorimpl(arrayList4);
                        }
                        userIdentifier = (com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier) adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRangesFor;
                        str7 = (java.lang.String) adProviderRepositoryImpl$getAds$1.getHighSpeedVideoSizes;
                        str9 = (java.lang.String) adProviderRepositoryImpl$getAds$1.Camera2StreamConfigurationMap;
                        str8 = (java.lang.String) adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        final java.lang.String str10 = (java.lang.String) obj2;
                        com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest invoke = com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl.$r8$lambda$I9UO2DoeyMZhP88_W8KCYCfqZMk(com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.this, this, str10, str8, (com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest.Builder) obj4);
                            }
                        });
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.ads.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[4];
                        pairArr[0] = kotlin.TuplesKt.to("page", invoke.getPage().getValue());
                        pairArr[1] = kotlin.TuplesKt.to("publisher", invoke.getPublisher().getValue());
                        com.paypal.oslo.feature.ads.data.models.smithy.Placement placement = (com.paypal.oslo.feature.ads.data.models.smithy.Placement) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) invoke.getPlacements());
                        value = placement == null ? placement.getValue() : null;
                        if (value == null) {
                            value = "";
                        }
                        pairArr[2] = kotlin.TuplesKt.to("placement", value);
                        pairArr[3] = kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, invoke.getCountry().getValue());
                        com.paypal.android.logger.Logger.d$default(logger, "Ad fetch requested", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient adsApiClient = this.getHighSpeedVideoFpsRangesFor;
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                        adProviderRepositoryImpl$getAds$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str9);
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userIdentifier);
                        adProviderRepositoryImpl$getAds$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                        adProviderRepositoryImpl$getAds$1.getInputSizeshNQ4ISI = invoke;
                        adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration = 3;
                        obj2 = adsApiClient.getDisplayAds(invoke, adProviderRepositoryImpl$getAds$1);
                        if (obj2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        getDisplayAdsRequest = invoke;
                        java.util.List flatten2 = kotlin.collections.CollectionsKt.flatten(((com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse) obj2).getAds().values());
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(flatten2, 10));
                        while (r0.hasNext()) {
                        }
                        java.util.ArrayList arrayList22 = arrayList5;
                        java.util.ArrayList arrayList32 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
                        it = arrayList22.iterator();
                        while (it.hasNext()) {
                        }
                        java.util.ArrayList arrayList42 = arrayList32;
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.ads.LoggerKt.log, "Ad fetch successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("adsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(arrayList42.size()))), null, 4, null);
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        return kotlin.Result.m23436constructorimpl(arrayList42);
                    }
                    java.lang.String str11 = (java.lang.String) adProviderRepositoryImpl$getAds$1.getHighSpeedVideoSizes;
                    str5 = (java.lang.String) adProviderRepositoryImpl$getAds$1.Camera2StreamConfigurationMap;
                    java.lang.String str12 = (java.lang.String) adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    str6 = str11;
                    str4 = str12;
                    com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier userIdentifier3 = (com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier) obj;
                    com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider userIdentificationProvider = this.Camera2StreamConfigurationMap;
                    adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRanges = str4;
                    adProviderRepositoryImpl$getAds$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    adProviderRepositoryImpl$getAds$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                    adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRangesFor = userIdentifier3;
                    adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration = 2;
                    userCountry = userIdentificationProvider.getUserCountry(adProviderRepositoryImpl$getAds$1);
                    if (userCountry != coroutine_suspended) {
                        java.lang.String str13 = str5;
                        str7 = str6;
                        obj2 = userCountry;
                        str8 = str4;
                        userIdentifier = userIdentifier3;
                        str9 = str13;
                        final java.lang.String str102 = (java.lang.String) obj2;
                        com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest invoke2 = com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl.$r8$lambda$I9UO2DoeyMZhP88_W8KCYCfqZMk(com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier.this, this, str102, str8, (com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest.Builder) obj4);
                            }
                        });
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.ads.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
                        pairArr2[0] = kotlin.TuplesKt.to("page", invoke2.getPage().getValue());
                        pairArr2[1] = kotlin.TuplesKt.to("publisher", invoke2.getPublisher().getValue());
                        com.paypal.oslo.feature.ads.data.models.smithy.Placement placement2 = (com.paypal.oslo.feature.ads.data.models.smithy.Placement) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) invoke2.getPlacements());
                        if (placement2 == null) {
                        }
                        if (value == null) {
                        }
                        pairArr2[2] = kotlin.TuplesKt.to("placement", value);
                        pairArr2[3] = kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, invoke2.getCountry().getValue());
                        com.paypal.android.logger.Logger.d$default(logger2, "Ad fetch requested", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                        com.paypal.oslo.feature.ads.data.repository.client.AdsApiClient adsApiClient2 = this.getHighSpeedVideoFpsRangesFor;
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                        adProviderRepositoryImpl$getAds$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str9);
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                        adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userIdentifier);
                        adProviderRepositoryImpl$getAds$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str102);
                        adProviderRepositoryImpl$getAds$1.getInputSizeshNQ4ISI = invoke2;
                        adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration = 3;
                        obj2 = adsApiClient2.getDisplayAds(invoke2, adProviderRepositoryImpl$getAds$1);
                        if (obj2 != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier userIdentifier32 = (com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier) obj;
            com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider userIdentificationProvider2 = this.Camera2StreamConfigurationMap;
            adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRanges = str4;
            adProviderRepositoryImpl$getAds$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
            adProviderRepositoryImpl$getAds$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
            adProviderRepositoryImpl$getAds$1.getHighSpeedVideoFpsRangesFor = userIdentifier32;
            adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration = 2;
            userCountry = userIdentificationProvider2.getUserCountry(adProviderRepositoryImpl$getAds$1);
            if (userCountry != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            com.paypal.oslo.feature.ads.LoggerKt.log.e("Error fetching ads from AOL", exc);
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(exc));
        }
        adProviderRepositoryImpl$getAds$1 = new com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$getAds$1(this, continuation);
        java.lang.Object obj22 = adProviderRepositoryImpl$getAds$1.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adProviderRepositoryImpl$getAds$1.getOutputMinFrameDuration;
        int i22 = 0;
    }

    /* renamed from: $r8$lambda$0dS2WljL912yjwBX2-fVw9ew29E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11972$r8$lambda$0dS2WljL912yjwBX2fVw9ew29E(java.lang.String str, com.paypal.oslo.feature.ads.data.models.smithy.DeviceAttributes.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setPlatform(com.paypal.oslo.feature.ads.data.models.smithy.DevicePlatform.Android.INSTANCE);
        builder.setAppVersion(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I9UO2DoeyMZhP88_W8KCYCfqZMk(com.paypal.oslo.feature.ads.data.models.smithy.UserIdentifier userIdentifier, com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl adProviderRepositoryImpl, java.lang.String str, final java.lang.String str2, com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest.Builder builder) {
        com.paypal.oslo.feature.ads.data.models.smithy.Country.Us fromValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setGdprConsentRequired(java.lang.Boolean.FALSE);
        builder.setPublisher(com.paypal.oslo.feature.ads.data.models.smithy.Publisher.PayPalApp.INSTANCE);
        builder.setPage(com.paypal.oslo.feature.ads.data.models.smithy.Page.Home.INSTANCE);
        builder.setPlacements(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.ads.data.models.smithy.Placement.Default.INSTANCE));
        builder.setSupportedAdFormats(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop16x9.INSTANCE));
        builder.setUserIdentifier(userIdentifier);
        builder.deviceAttributes(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl.m11972$r8$lambda$0dS2WljL912yjwBX2fVw9ew29E(str2, (com.paypal.oslo.feature.ads.data.models.smithy.DeviceAttributes.Builder) obj);
            }
        });
        if (str == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.ads.LoggerKt.log, "User country not available, defaulting to US", null, null, 6, null);
            fromValue = com.paypal.oslo.feature.ads.data.models.smithy.Country.Us.INSTANCE;
        } else {
            com.paypal.oslo.feature.ads.data.models.smithy.Country.Companion companion = com.paypal.oslo.feature.ads.data.models.smithy.Country.INSTANCE;
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            fromValue = companion.fromValue(upperCase);
            if (fromValue instanceof com.paypal.oslo.feature.ads.data.models.smithy.Country.SdkUnknown) {
                fromValue = null;
            }
            if (fromValue == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.ads.LoggerKt.log, "Unknown country code, defaulting to US", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", str)), null, 4, null);
                fromValue = com.paypal.oslo.feature.ads.data.models.smithy.Country.Us.INSTANCE;
            }
        }
        builder.setCountry(fromValue);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$vPhVO8L9PYIxcuGpUIGpJ_h77N4(com.paypal.oslo.feature.ads.data.models.smithy.Placement placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        return placement.getValue();
    }
}
