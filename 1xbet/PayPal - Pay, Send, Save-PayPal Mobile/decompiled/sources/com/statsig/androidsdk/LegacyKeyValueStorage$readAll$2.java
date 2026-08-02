package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.LegacyKeyValueStorage$readAll$2", f = "KeyValueStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class LegacyKeyValueStorage$readAll$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.String>>, java.lang.Object> {
    int label;
    final /* synthetic */ com.statsig.androidsdk.LegacyKeyValueStorage this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.SharedPreferences sharedPreferences;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sharedPreferences = this.this$0.sharedPreferences;
            java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                if (entry.getValue() instanceof java.lang.String) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        return ((com.statsig.androidsdk.LegacyKeyValueStorage$readAll$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.String>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.String>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.LegacyKeyValueStorage$readAll$2(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyKeyValueStorage$readAll$2(com.statsig.androidsdk.LegacyKeyValueStorage legacyKeyValueStorage, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.LegacyKeyValueStorage$readAll$2> continuation) {
        super(2, continuation);
        this.this$0 = legacyKeyValueStorage;
    }
}
