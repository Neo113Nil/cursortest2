package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "args", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CommonAdViewerExposedFunctionsKt$request$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ com.unity3d.ads.core.domain.ExecuteAdViewerRequest $executeAdViewerRequest;
    final /* synthetic */ com.unity3d.services.core.network.model.RequestType $type;

    CommonAdViewerExposedFunctionsKt$request$1(com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest, com.unity3d.services.core.network.model.RequestType requestType) {
        this.$executeAdViewerRequest = executeAdViewerRequest;
        this.$type = requestType;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:11:0x0031, B:12:0x0068, B:14:0x0072, B:15:0x0085, B:19:0x0075, B:21:0x0079), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:11:0x0031, B:12:0x0068, B:14:0x0072, B:15:0x0085, B:19:0x0075, B:21:0x0079), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 commonAdViewerExposedFunctionsKt$request$1$invoke$1;
        int i;
        java.lang.String str;
        java.lang.Exception e;
        java.lang.String str2;
        java.lang.String message;
        java.lang.Object body;
        java.lang.String str3;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$request$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$request$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$request$1$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object first = kotlin.collections.ArraysKt.first(objArr);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(first, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str4 = (java.lang.String) first;
                    java.lang.String str5 = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(objArr, 1);
                    try {
                        com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest = this.$executeAdViewerRequest;
                        com.unity3d.services.core.network.model.RequestType requestType = this.$type;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0 = str4;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1 = str5;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = 1;
                        java.lang.Object invoke = executeAdViewerRequest.invoke(requestType, objArr, commonAdViewerExposedFunctionsKt$request$1$invoke$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str4;
                        obj = invoke;
                        str2 = str5;
                    } catch (java.lang.Exception e2) {
                        str = str4;
                        e = e2;
                        str2 = str5;
                        java.lang.String[] strArr = new java.lang.String[3];
                        strArr[0] = str;
                        strArr[1] = str2;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        strArr[2] = message;
                        return new com.unity3d.ads.adplayer.model.OnWebRequestFailed(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) strArr));
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1;
                    str = (java.lang.String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        java.lang.String[] strArr2 = new java.lang.String[3];
                        strArr2[0] = str;
                        strArr2[1] = str2;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        strArr2[2] = message;
                        return new com.unity3d.ads.adplayer.model.OnWebRequestFailed(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) strArr2));
                    }
                }
                com.unity3d.services.core.network.model.HttpResponse httpResponse = (com.unity3d.services.core.network.model.HttpResponse) obj;
                body = httpResponse.getBody();
                if (body instanceof java.lang.String) {
                    str3 = body instanceof byte[] ? new java.lang.String((byte[]) body, kotlin.text.Charsets.UTF_8) : null;
                } else {
                    str3 = (java.lang.String) body;
                }
                return new com.unity3d.ads.adplayer.model.OnWebRequestComplete(kotlin.collections.CollectionsKt.listOf(str, httpResponse.getUrlString(), str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(httpResponse.getStatusCode()), com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse.getHeaders())));
            }
        }
        commonAdViewerExposedFunctionsKt$request$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1(this, continuation);
        java.lang.Object obj2 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
        if (i != 0) {
        }
        com.unity3d.services.core.network.model.HttpResponse httpResponse2 = (com.unity3d.services.core.network.model.HttpResponse) obj2;
        body = httpResponse2.getBody();
        if (body instanceof java.lang.String) {
        }
        return new com.unity3d.ads.adplayer.model.OnWebRequestComplete(kotlin.collections.CollectionsKt.listOf(str, httpResponse2.getUrlString(), str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(httpResponse2.getStatusCode()), com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse2.getHeaders())));
    }
}
