package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableKt$anchoredDraggable$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ float getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.material.AnchoredDraggableState<T> getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (this.getHighSpeedVideoFpsRanges.settle(this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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
            return ((androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material.AnchoredDraggableState<T> anchoredDraggableState, float f, kotlin.coroutines.Continuation<? super androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
            this.getHighResolutionOutputSizeshNQ4ISI = f;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap, null, null, new androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float floatValue = f.floatValue();
        androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1(this.getHighSpeedVideoFpsRanges, continuation);
        anchoredDraggableKt$anchoredDraggable$1.Camera2StreamConfigurationMap = coroutineScope;
        anchoredDraggableKt$anchoredDraggable$1.getHighSpeedVideoSizes = floatValue;
        return anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$anchoredDraggable$1(androidx.compose.material.AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.Continuation<? super androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = anchoredDraggableState;
    }
}
