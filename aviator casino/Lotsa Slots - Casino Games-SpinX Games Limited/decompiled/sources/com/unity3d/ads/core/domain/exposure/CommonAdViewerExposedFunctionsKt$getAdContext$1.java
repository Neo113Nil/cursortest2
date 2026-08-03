package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ java.lang.String $adData;
    final /* synthetic */ java.lang.String $adDataRefreshToken;
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidGetAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ java.lang.String $impressionConfig;
    final /* synthetic */ com.unity3d.ads.core.domain.om.IsOMActivated $isOMActivated;

    CommonAdViewerExposedFunctionsKt$getAdContext$1(java.lang.String str, java.lang.String str2, java.lang.String str3, com.unity3d.ads.core.domain.AndroidGetAdPlayerContext androidGetAdPlayerContext, com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = androidGetAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1;
        int i;
        java.lang.String str;
        com.unity3d.ads.core.data.model.AdObject adObject;
        com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        org.json.JSONObject data;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str2 = this.$adData;
                    java.lang.String str3 = this.$impressionConfig;
                    java.lang.String str4 = this.$adDataRefreshToken;
                    com.unity3d.ads.core.domain.AndroidGetAdPlayerContext androidGetAdPlayerContext = this.$getAndroidAdPlayerContext;
                    com.unity3d.ads.core.data.model.AdObject adObject2 = this.$adObject;
                    com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated2 = this.$isOMActivated;
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    createMapBuilder.put("adData", str2);
                    createMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str3);
                    createMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str4);
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0 = adObject2;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1 = isOMActivated2;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2 = createMapBuilder;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3 = createMapBuilder;
                    str = com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4 = com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5 = createMapBuilder;
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = 1;
                    obj = androidGetAdPlayerContext.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adObject = adObject2;
                    isOMActivated = isOMActivated2;
                    map = createMapBuilder;
                    map2 = map;
                    map3 = map2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (java.util.Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5;
                    str = (java.lang.String) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4;
                    map2 = (java.util.Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3;
                    map3 = (java.util.Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2;
                    isOMActivated = (com.unity3d.ads.core.domain.om.IsOMActivated) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1;
                    adObject = (com.unity3d.ads.core.data.model.AdObject) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                map.put(str, obj);
                map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
                data = adObject.getLoadOptions().getData();
                if (data != null && data.length() != 0) {
                    java.util.Iterator<java.lang.String> keys = data.keys();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "loadOptions.keys()");
                    kotlin.sequences.Sequence<java.lang.String> asSequence = kotlin.sequences.SequencesKt.asSequence(keys);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    for (java.lang.String str5 : asSequence) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(str5, "adMarkup") && !kotlin.jvm.internal.Intrinsics.areEqual(str5, "objectId")) {
                            jSONObject = jSONObject.put(str5, data.get(str5));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "acc.put(key, loadOptions[key])");
                        }
                    }
                    map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
                }
                if (isOMActivated.invoke()) {
                    map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OMID, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), kotlin.TuplesKt.to(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
                }
                map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(adObject.isHeaderBidding()));
                return kotlin.collections.MapsKt.build(map3);
            }
        }
        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, continuation);
        java.lang.Object obj2 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
        if (i != 0) {
        }
        map.put(str, obj2);
        map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
        data = adObject.getLoadOptions().getData();
        if (data != null) {
            java.util.Iterator<java.lang.String> keys2 = data.keys();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys2, "loadOptions.keys()");
            kotlin.sequences.Sequence<java.lang.String> asSequence2 = kotlin.sequences.SequencesKt.asSequence(keys2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            while (r0.hasNext()) {
            }
            map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject2);
        }
        if (isOMActivated.invoke()) {
        }
        map2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(adObject.isHeaderBidding()));
        return kotlin.collections.MapsKt.build(map3);
    }
}
