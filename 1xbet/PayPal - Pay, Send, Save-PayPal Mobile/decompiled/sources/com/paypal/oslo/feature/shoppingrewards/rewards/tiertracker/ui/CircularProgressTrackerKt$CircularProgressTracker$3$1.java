package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerKt$CircularProgressTracker$3$1", f = "CircularProgressTracker.kt", i = {}, l = {709, 710, 715, 717}, m = "invokeSuspend", n = {}, nl = {710, 711, 717, 724}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CircularProgressTrackerKt$CircularProgressTracker$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<kotlin.Pair<java.lang.String, java.lang.Float>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<kotlin.Pair<java.lang.String, java.lang.Float>> getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            if (this.Camera2StreamConfigurationMap.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getInputSizeshNQ4ISI = 4;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRangesFor), androidx.compose.animation.core.AnimationSpecKt.tween$default(1500, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(false));
                this.getOutputMinFrameDuration.clear();
                this.getOutputMinFrameDuration.addAll(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getInputSizeshNQ4ISI = 3;
                if (kotlinx.coroutines.DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.getInputSizeshNQ4ISI = 4;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRangesFor), androidx.compose.animation.core.AnimationSpecKt.tween$default(1500, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getInputSizeshNQ4ISI = 2;
        if (this.getHighSpeedVideoFpsRanges.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(false));
        this.getOutputMinFrameDuration.clear();
        this.getOutputMinFrameDuration.addAll(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getInputSizeshNQ4ISI = 3;
        if (kotlinx.coroutines.DelayKt.delay(1000L, this) == coroutine_suspended) {
        }
        this.getInputSizeshNQ4ISI = 4;
        if (androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRangesFor), androidx.compose.animation.core.AnimationSpecKt.tween$default(1500, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerKt$CircularProgressTracker$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerKt$CircularProgressTracker$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CircularProgressTrackerKt$CircularProgressTracker$3$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2, androidx.compose.runtime.snapshots.SnapshotStateList<kotlin.Pair<java.lang.String, java.lang.Float>> snapshotStateList, java.util.List<kotlin.Pair<java.lang.String, java.lang.Float>> list, float f, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.CircularProgressTrackerKt$CircularProgressTracker$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = animatable;
        this.getHighSpeedVideoFpsRanges = animatable2;
        this.getOutputMinFrameDuration = snapshotStateList;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
