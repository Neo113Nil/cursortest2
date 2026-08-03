package com.unity3d.ads.core.domain;

/* compiled from: AndroidExecuteAdViewerRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", i = {}, l = {28, 29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidExecuteAdViewerRequest$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
    final /* synthetic */ java.lang.Object[] $parameters;
    final /* synthetic */ com.unity3d.services.core.network.model.RequestType $type;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidExecuteAdViewerRequest$invoke$2(java.lang.Object[] objArr, com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, com.unity3d.services.core.network.model.RequestType requestType, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2> continuation) {
        super(2, continuation);
        this.$parameters = objArr;
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2(this.$parameters, this.this$0, this.$type, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider;
        java.lang.Object invoke;
        com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset;
        java.io.InputStream data;
        com.unity3d.services.core.network.model.HttpRequest createRequest;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object orNull = kotlin.collections.ArraysKt.getOrNull(this.$parameters, 1);
            byte[] bArr = null;
            java.lang.String str = orNull instanceof java.lang.String ? (java.lang.String) orNull : null;
            if (str == null) {
                str = "";
            }
            if (str.length() <= 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                android.net.Uri parse = android.net.Uri.parse(str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(parse);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            android.net.Uri uri = (android.net.Uri) m10798constructorimpl;
            if (uri != null) {
                if (this.$type != com.unity3d.services.core.network.model.RequestType.GET) {
                    uri = null;
                }
                if (uri != null) {
                    getCachedAsset = this.this$0.getCachedAsset;
                    android.webkit.WebResourceResponse invoke$default = com.unity3d.ads.core.domain.GetCachedAsset.invoke$default(getCachedAsset, uri, null, 2, null);
                    if (invoke$default != null && (data = invoke$default.getData()) != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
                        bArr = kotlin.io.ByteStreamsKt.readBytes(data);
                    }
                }
            }
            byte[] bArr2 = bArr;
            if (bArr2 == null) {
                httpClientProvider = this.this$0.httpClientProvider;
                this.label = 1;
                invoke = httpClientProvider.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return new com.unity3d.services.core.network.model.HttpResponse(bArr2, 0, null, null, null, null, 0L, 126, null);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        createRequest = this.this$0.createRequest(this.$type, this.$parameters);
        this.label = 2;
        java.lang.Object execute$default = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default((com.unity3d.services.core.network.core.HttpClient) invoke, createRequest, false, this, 2, null);
        return execute$default == coroutine_suspended ? coroutine_suspended : execute$default;
    }
}
