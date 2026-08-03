package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidByteStringDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "exception", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidByteStringDataSource$get$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    AndroidByteStringDataSource$get$2(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2 androidByteStringDataSource$get$2 = new com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2(continuation);
        androidByteStringDataSource$get$2.L$0 = flowCollector;
        androidByteStringDataSource$get$2.L$1 = th;
        return androidByteStringDataSource$get$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            java.lang.Throwable th = (java.lang.Throwable) this.L$1;
            if (!(th instanceof androidx.datastore.core.CorruptionException)) {
                throw th;
            }
            com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.Companion companion = com.unity3d.ads.datastore.ByteStringStoreKt.Dsl.INSTANCE;
            com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder = com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
            com.unity3d.ads.datastore.ByteStringStoreKt.Dsl _create = companion._create(newBuilder);
            com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            _create.setData(EMPTY);
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(_create._build(), this) == coroutine_suspended) {
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
