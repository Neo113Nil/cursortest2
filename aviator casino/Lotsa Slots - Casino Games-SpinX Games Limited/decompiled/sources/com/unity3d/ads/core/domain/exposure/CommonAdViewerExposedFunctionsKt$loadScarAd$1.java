package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "args", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CommonAdViewerExposedFunctionsKt$loadScarAd$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.core.domain.scar.LoadScarAd $loadScarAd;

    CommonAdViewerExposedFunctionsKt$loadScarAd$1(com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.core.domain.scar.LoadScarAd loadScarAd) {
        this.$adObject = adObject;
        this.$loadScarAd = loadScarAd;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$12 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
                java.lang.Object obj = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object obj2 = objArr[0];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
                    java.lang.String adType = jSONObject.optString("type");
                    java.lang.String adUnitId = jSONObject.optString("adUnitId");
                    java.lang.String adString = jSONObject.optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_STRING);
                    java.lang.String queryId = jSONObject.optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_QUERY_ID);
                    int optInt = jSONObject.optInt("videoLength");
                    this.$adObject.setScarAd(true);
                    this.$adObject.setScarAdUnitId(adUnitId);
                    this.$adObject.setScarQueryId(queryId);
                    this.$adObject.setScarAdString(adString);
                    com.unity3d.ads.core.domain.scar.LoadScarAd loadScarAd = this.$loadScarAd;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adType, "adType");
                    java.lang.String placementId = this.$adObject.getPlacementId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adUnitId, "adUnitId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adString, "adString");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryId, "queryId");
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$12.label = 1;
                    if (loadScarAd.invoke(adType, placementId, adUnitId, adString, queryId, optInt, commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(this, continuation);
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$122 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
        java.lang.Object obj3 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$122.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
