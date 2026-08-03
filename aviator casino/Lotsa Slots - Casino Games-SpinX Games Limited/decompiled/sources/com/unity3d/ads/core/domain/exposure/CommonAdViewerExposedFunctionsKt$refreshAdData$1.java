package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CommonAdViewerExposedFunctionsKt$refreshAdData$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.core.domain.Refresh $refresh;

    CommonAdViewerExposedFunctionsKt$refreshAdData$1(com.unity3d.ads.core.domain.Refresh refresh, com.unity3d.ads.core.data.model.AdObject adObject) {
        this.$refresh = refresh;
        this.$adObject = adObject;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
        int i;
        com.google.protobuf.ByteString refreshTokenByteString;
        gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (objArr.length == 0) {
                        refreshTokenByteString = com.google.protobuf.ByteString.EMPTY;
                    } else {
                        java.lang.Object obj2 = objArr[0];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        java.lang.String refreshToken = ((org.json.JSONObject) obj2).optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refreshToken, "refreshToken");
                        refreshTokenByteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(refreshToken, false, 1, null);
                    }
                    com.unity3d.ads.core.domain.Refresh refresh = this.$refresh;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refreshTokenByteString, "refreshTokenByteString");
                    com.google.protobuf.ByteString opportunityId = this.$adObject.getOpportunityId();
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                    obj = refresh.invoke(refreshTokenByteString, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                adDataRefreshResponse = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                if (!adDataRefreshResponse.hasError()) {
                    throw new java.lang.IllegalArgumentException("Refresh failed");
                }
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                com.google.protobuf.ByteString adData = adDataRefreshResponse.getAdData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData, "adRefreshResponse.adData");
                createMapBuilder.put("adData", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData, false, 1, null));
                com.google.protobuf.ByteString adDataRefreshToken = adDataRefreshResponse.getAdDataRefreshToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "adRefreshResponse.adDataRefreshToken");
                createMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null));
                com.google.protobuf.ByteString trackingToken = adDataRefreshResponse.getTrackingToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "adRefreshResponse.trackingToken");
                createMapBuilder.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(trackingToken, false, 1, null));
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        }
        commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, continuation);
        java.lang.Object obj3 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
        if (i != 0) {
        }
        adDataRefreshResponse = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj3;
        if (!adDataRefreshResponse.hasError()) {
        }
    }
}
