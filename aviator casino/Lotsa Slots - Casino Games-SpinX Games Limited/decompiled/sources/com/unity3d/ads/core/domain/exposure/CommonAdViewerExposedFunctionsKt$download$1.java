package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CommonAdViewerExposedFunctionsKt$download$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.core.domain.CacheFile $cacheFile;

    CommonAdViewerExposedFunctionsKt$download$1(com.unity3d.ads.core.domain.CacheFile cacheFile, com.unity3d.ads.core.data.model.AdObject adObject) {
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        int i;
        com.unity3d.ads.core.data.model.CacheResult cacheResult;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$download$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$12 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
                java.lang.Object obj = commonAdViewerExposedFunctionsKt$download$1$invoke$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$download$1$invoke$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object obj2 = objArr[0];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
                    java.lang.String url = jSONObject.getString("url");
                    org.json.JSONArray jSONArray = (org.json.JSONArray) kotlin.collections.ArraysKt.getOrNull(objArr, 2);
                    int optInt = jSONObject.optInt("priority", 0);
                    com.unity3d.ads.core.domain.CacheFile cacheFile = this.$cacheFile;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                    com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.label = 1;
                    obj = cacheFile.invoke(url, adObject, jSONArray, optInt, commonAdViewerExposedFunctionsKt$download$1$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj;
                if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
                    if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Failure) {
                        throw new java.lang.IllegalStateException(((com.unity3d.ads.core.data.model.CacheResult.Failure) cacheResult).getError().name().toString());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return "unity-ads-cache://unity.ads.cache/" + ((com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult).getCachedFile().getName();
            }
        }
        commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, continuation);
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$122 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        java.lang.Object obj3 = commonAdViewerExposedFunctionsKt$download$1$invoke$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$download$1$invoke$122.label;
        if (i != 0) {
        }
        cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj3;
        if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
        }
    }
}
