package com.unity3d.ads.core.domain;

/* compiled from: AndroidHttpClientProvider.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1", f = "AndroidHttpClientProvider.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidHttpClientProvider$createHttpClient$client$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.domain.HttpClientSelection $selectedHttpClient;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHttpClientProvider this$0;

    /* compiled from: AndroidHttpClientProvider.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.ads.core.domain.HttpClientSelection.values().length];
            try {
                iArr[com.unity3d.ads.core.domain.HttpClientSelection.OKHTTP3.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ads.core.domain.HttpClientSelection.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHttpClientProvider$createHttpClient$client$1(com.unity3d.ads.core.domain.HttpClientSelection httpClientSelection, com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1> continuation) {
        super(2, continuation);
        this.$selectedHttpClient = httpClientSelection;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1(this.$selectedHttpClient, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers;
        android.content.Context context;
        com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i2 = com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1.WhenMappings.$EnumSwitchMapping$0[this.$selectedHttpClient.ordinal()];
            if (i2 == 1) {
                return this.this$0.getOkHttp3Client();
            }
            if (i2 == 2) {
                iSDKDispatchers = this.this$0.dispatchers;
                return new com.unity3d.services.core.network.core.LegacyHttpClient(iSDKDispatchers);
            }
            com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            context = androidHttpClientProvider.context;
            iSDKDispatchers2 = this.this$0.dispatchers;
            this.label = 1;
            obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers2, this.$selectedHttpClient, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (com.unity3d.services.core.network.core.HttpClient) obj;
    }
}
