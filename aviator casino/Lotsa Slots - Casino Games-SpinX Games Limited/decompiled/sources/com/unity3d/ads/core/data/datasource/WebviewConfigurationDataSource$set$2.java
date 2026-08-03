package com.unity3d.ads.core.data.datasource;

/* compiled from: WebviewConfigurationDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class WebviewConfigurationDataSource$set$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebviewConfigurationDataSource$set$2(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2> continuation) {
        super(2, continuation);
        this.$data = webViewConfigurationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2(this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> continuation) {
        return ((com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return this.$data;
    }
}
