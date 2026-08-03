package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ com.unity3d.ads.core.domain.SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

    CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object obj2 = objArr[0];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
                    java.lang.String privacyUpdateContentBase64 = jSONObject.optString("content");
                    int optInt = jSONObject.optInt("version");
                    com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest = this.$sendPrivacyUpdateRequest;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateContentBase64, "privacyUpdateContentBase64");
                    com.google.protobuf.ByteString fromBase64$default = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(privacyUpdateContentBase64, false, 1, null);
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = 1;
                    obj = sendPrivacyUpdateRequest.invoke(optInt, fromBase64$default, commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) obj;
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                createMapBuilder.put("version", kotlin.coroutines.jvm.internal.Boxing.boxInt(privacyUpdateResponse.getVersion()));
                com.google.protobuf.ByteString content = privacyUpdateResponse.getContent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(content, "response.content");
                createMapBuilder.put("content", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(content, false, 1, null));
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        }
        commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, continuation);
        java.lang.Object obj3 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
        if (i != 0) {
        }
        gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse2 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) obj3;
        java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder2.put("version", kotlin.coroutines.jvm.internal.Boxing.boxInt(privacyUpdateResponse2.getVersion()));
        com.google.protobuf.ByteString content2 = privacyUpdateResponse2.getContent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(content2, "response.content");
        createMapBuilder2.put("content", com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(content2, false, 1, null));
        return kotlin.collections.MapsKt.build(createMapBuilder2);
    }
}
