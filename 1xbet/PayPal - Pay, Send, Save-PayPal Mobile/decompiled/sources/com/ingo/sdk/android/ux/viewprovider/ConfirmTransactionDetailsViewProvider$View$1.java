package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$1", f = "ConfirmTransactionDetailsViewProvider.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConfirmTransactionDetailsViewProvider$View$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.SheetState Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.material3.SheetState sheetState = this.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow drop = kotlinx.coroutines.flow.FlowKt.drop(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean isVisible;
                    isVisible = androidx.compose.material3.SheetState.this.isVisible();
                    return java.lang.Boolean.valueOf(isVisible);
                }
            }), 1);
            final com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider confirmTransactionDetailsViewProvider = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (drop.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.jvm.functions.Function1 function1;
                    boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    function1 = com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider.this.getOutputStallDurationlomOqCM;
                    function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmTransactionDetailsViewProvider$View$1(androidx.compose.material3.SheetState sheetState, com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider confirmTransactionDetailsViewProvider, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider$View$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sheetState;
        this.getHighSpeedVideoFpsRangesFor = confirmTransactionDetailsViewProvider;
    }
}
