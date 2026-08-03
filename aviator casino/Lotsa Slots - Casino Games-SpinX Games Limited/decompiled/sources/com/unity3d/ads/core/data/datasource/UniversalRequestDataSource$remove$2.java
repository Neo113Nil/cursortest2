package com.unity3d.ads.core.data.datasource;

/* compiled from: UniversalRequestDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class UniversalRequestDataSource$remove$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore>, java.lang.Object> {
    final /* synthetic */ java.lang.String $key;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalRequestDataSource$remove$2(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2> continuation) {
        super(2, continuation);
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2 universalRequestDataSource$remove$2 = new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2(this.$key, continuation);
        universalRequestDataSource$remove$2.L$0 = obj;
        return universalRequestDataSource$remove$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> continuation) {
        return ((com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2) create(universalRequestStore, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
        builder.removeUniversalRequestMap(this.$key);
        com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
        return build;
    }
}
