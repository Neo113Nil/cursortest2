package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$7$1", f = "MapEffect.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, nl = {95}, s = {"L$0"}, v = 2)
/* loaded from: classes9.dex */
final class MapEffectKt$MapEffect$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, com.google.android.gms.maps.GoogleMap, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    final /* synthetic */ com.google.android.gms.maps.GoogleMap $map;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, com.google.android.gms.maps.GoogleMap, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.$block;
            com.google.android.gms.maps.GoogleMap googleMap = this.$map;
            this.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.label = 1;
            if (function3.invoke(coroutineScope, googleMap, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.maps.android.compose.MapEffectKt$MapEffect$7$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.google.maps.android.compose.MapEffectKt$MapEffect$7$1 mapEffectKt$MapEffect$7$1 = new com.google.maps.android.compose.MapEffectKt$MapEffect$7$1(this.$block, this.$map, continuation);
        mapEffectKt$MapEffect$7$1.L$0 = obj;
        return mapEffectKt$MapEffect$7$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MapEffectKt$MapEffect$7$1(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super com.google.android.gms.maps.GoogleMap, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, com.google.android.gms.maps.GoogleMap googleMap, kotlin.coroutines.Continuation<? super com.google.maps.android.compose.MapEffectKt$MapEffect$7$1> continuation) {
        super(2, continuation);
        this.$block = function3;
        this.$map = googleMap;
    }
}
