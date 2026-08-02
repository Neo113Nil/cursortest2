package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$3$1", f = "SearchBar.kt", i = {}, l = {559}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SearchBarKt$SearchBar$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRanges.getValue().floatValue() > 0.0f && this.getHighSpeedVideoFpsRanges.getValue().floatValue() < 1.0f) {
                finiteAnimationSpec = androidx.compose.material3.SearchBarKt.getHighSpeedVideoSizesFor;
            } else {
                finiteAnimationSpec = this.getHighResolutionOutputSizeshNQ4ISI ? androidx.compose.material3.SearchBarKt.getHighSpeedVideoSizes : androidx.compose.material3.SearchBarKt.getHighSpeedVideoFpsRangesFor;
            }
            float f = this.getHighResolutionOutputSizeshNQ4ISI ? 1.0f : 0.0f;
            if (this.getHighSpeedVideoFpsRanges.getValue().floatValue() != f) {
                this.getInputFormats = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoFpsRanges, kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), finiteAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.setFloatValue(Float.NaN);
            this.getHighSpeedVideoSizes.setValue(null);
            this.getHighSpeedVideoFpsRangesFor.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.SearchBarKt$SearchBar$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.SearchBarKt$SearchBar$3$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarKt$SearchBar$3$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, boolean z, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState, androidx.compose.runtime.MutableState<androidx.view.BackEventCompat> mutableState2, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarKt$SearchBar$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = animatable;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = mutableFloatState;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRangesFor = mutableState2;
    }
}
