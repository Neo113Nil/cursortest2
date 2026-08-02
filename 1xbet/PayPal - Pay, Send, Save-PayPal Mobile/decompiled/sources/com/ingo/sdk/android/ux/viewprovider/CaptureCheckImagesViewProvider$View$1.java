package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$1", f = "CaptureCheckImagesViewProvider.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class CaptureCheckImagesViewProvider$View$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.SheetState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.material3.SheetState sheetState = this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow drop = kotlinx.coroutines.flow.FlowKt.drop(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean isVisible;
                    isVisible = androidx.compose.material3.SheetState.this.isVisible();
                    return java.lang.Boolean.valueOf(isVisible);
                }
            }), 1);
            final com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (drop.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.jvm.functions.Function1 function1;
                    boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    function1 = com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.this.getOutputStallDuration;
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
        return ((com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureCheckImagesViewProvider$View$1(androidx.compose.material3.SheetState sheetState, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider captureCheckImagesViewProvider, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider$View$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = sheetState;
        this.getHighSpeedVideoFpsRanges = captureCheckImagesViewProvider;
    }
}
