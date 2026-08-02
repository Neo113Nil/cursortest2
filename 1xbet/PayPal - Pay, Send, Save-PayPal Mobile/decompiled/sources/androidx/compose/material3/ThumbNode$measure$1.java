package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ThumbNode$measure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.ThumbNode getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        boolean z;
        androidx.compose.animation.core.SnapSpec snapSpec;
        androidx.compose.animation.core.SnapSpec snapSpec2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            animatable = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            if (animatable != null) {
                java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap);
                z = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                if (z) {
                    snapSpec2 = androidx.compose.material3.SwitchKt.getHighSpeedVideoFpsRanges;
                    snapSpec = snapSpec2;
                } else {
                    snapSpec = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                }
                this.getHighSpeedVideoSizes = 1;
                obj = androidx.compose.animation.core.Animatable.animateTo$default(animatable, boxFloat, snapSpec, null, null, this, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.ThumbNode$measure$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.ThumbNode$measure$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThumbNode$measure$1(androidx.compose.material3.ThumbNode thumbNode, float f, kotlin.coroutines.Continuation<? super androidx.compose.material3.ThumbNode$measure$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = thumbNode;
        this.Camera2StreamConfigurationMap = f;
    }
}
