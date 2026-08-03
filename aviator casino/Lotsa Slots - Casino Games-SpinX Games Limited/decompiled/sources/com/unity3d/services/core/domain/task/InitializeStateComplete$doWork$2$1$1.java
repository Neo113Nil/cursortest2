package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateComplete.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1", f = "InitializeStateComplete.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateComplete$doWork$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;

    InitializeStateComplete$doWork$2$1$1(kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1(continuation);
        initializeStateComplete$doWork$2$1$1.L$0 = obj;
        return initializeStateComplete$doWork$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore byteStringStore, kotlin.coroutines.Continuation<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1) create(byteStringStore, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore build = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().clear().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "it.toBuilder().clear().build()");
        return build;
    }
}
