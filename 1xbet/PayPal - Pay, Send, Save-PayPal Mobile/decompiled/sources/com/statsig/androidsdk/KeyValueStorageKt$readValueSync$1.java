package com.statsig.androidsdk;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.KeyValueStorageKt$readValueSync$1", f = "KeyValueStorage.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class KeyValueStorageKt$readValueSync$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ java.lang.String $key;
    final /* synthetic */ java.lang.String $storeName;
    final /* synthetic */ com.statsig.androidsdk.KeyValueStorage<T> $this_readValueSync;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.label = 1;
        java.lang.Object readValue = this.$this_readValueSync.readValue(this.$storeName, this.$key, this);
        return readValue == coroutine_suspended ? coroutine_suspended : readValue;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
        return ((com.statsig.androidsdk.KeyValueStorageKt$readValueSync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.KeyValueStorageKt$readValueSync$1(this.$this_readValueSync, this.$storeName, this.$key, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KeyValueStorageKt$readValueSync$1(com.statsig.androidsdk.KeyValueStorage<T> keyValueStorage, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.KeyValueStorageKt$readValueSync$1> continuation) {
        super(2, continuation);
        this.$this_readValueSync = keyValueStorage;
        this.$storeName = str;
        this.$key = str2;
    }
}
