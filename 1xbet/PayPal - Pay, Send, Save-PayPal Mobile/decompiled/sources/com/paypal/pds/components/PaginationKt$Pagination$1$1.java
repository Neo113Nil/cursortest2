package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.PaginationKt$Pagination$1$1", f = "Pagination.kt", i = {0, 0, 0, 0, 0, 0, 1, 2, 3, 4}, l = {84, 87, 93, 94, 98}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "outgoingIndex", "$i$f$forEach", "$i$a$-forEach-PaginationKt$Pagination$1$1$1", "outgoingIndex", "outgoingIndex", "outgoingIndex", "outgoingIndex"}, nl = {149, 93, 94, 95, 102}, s = {"L$0", "L$2", "L$3", "I$0", "I$1", "I$2", "I$0", "I$0", "I$0", "I$0"}, v = 2)
/* loaded from: classes16.dex */
final class PaginationKt$Pagination$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Easing Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Easing getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ java.util.List<androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:24:0x00a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        java.util.Iterator it;
        java.lang.Iterable iterable;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputSizeshNQ4ISI;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            intValue = this.getHighSpeedVideoSizes.getIntValue();
            if (intValue == this.getHighSpeedVideoFpsRangesFor) {
                return kotlin.Unit.INSTANCE;
            }
            java.util.List<androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> list = this.getInputSizeshNQ4ISI;
            it = list.iterator();
            iterable = list;
            i = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    intValue = this.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 3;
                    if (this.getInputSizeshNQ4ISI.get(intValue).snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 4;
                    if (this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor).snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.6f), this) == coroutine_suspended) {
                    }
                    this.getHighSpeedVideoSizes.setIntValue(this.getHighSpeedVideoFpsRangesFor);
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 5;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor), kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i2 == 3) {
                    intValue = this.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 4;
                    if (this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor).snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.6f), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.getHighSpeedVideoSizes.setIntValue(this.getHighSpeedVideoFpsRangesFor);
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 5;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor), kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                intValue = this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes.setIntValue(this.getHighSpeedVideoFpsRangesFor);
                this.getOutputMinFrameDuration = intValue;
                this.getOutputSizeshNQ4ISI = 5;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor), kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            int i3 = this.getHighSpeedVideoSizesFor;
            int i4 = this.getOutputMinFrameDuration;
            it = (java.util.Iterator) this.getOutputMinFrameDurationlomOqCM;
            iterable = (java.lang.Iterable) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            i = i3;
            intValue = i4;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) next;
                java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                this.getOutputMinFrameDurationlomOqCM = it;
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(animatable);
                this.getOutputMinFrameDuration = intValue;
                this.getHighSpeedVideoSizesFor = i;
                this.getOutputFormats = 0;
                this.getOutputSizeshNQ4ISI = 1;
                if (animatable.snapTo(boxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (it.hasNext()) {
                    this.getInputFormats = null;
                    this.getOutputMinFrameDurationlomOqCM = null;
                    this.getOutputStallDuration = null;
                    this.getOutputStallDurationlomOqCM = null;
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 2;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(this.getInputSizeshNQ4ISI.get(intValue), kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.6f), androidx.compose.animation.core.AnimationSpecKt.tween$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.Camera2StreamConfigurationMap, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 3;
                    if (this.getInputSizeshNQ4ISI.get(intValue).snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                    }
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 4;
                    if (this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor).snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.6f), this) == coroutine_suspended) {
                    }
                    this.getHighSpeedVideoSizes.setIntValue(this.getHighSpeedVideoFpsRangesFor);
                    this.getOutputMinFrameDuration = intValue;
                    this.getOutputSizeshNQ4ISI = 5;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor), kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.PaginationKt$Pagination$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.PaginationKt$Pagination$1$1(this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaginationKt$Pagination$1$1(int i, java.util.List<androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> list, int i2, androidx.compose.animation.core.Easing easing, androidx.compose.animation.core.Easing easing2, androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.pds.components.PaginationKt$Pagination$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputSizeshNQ4ISI = list;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = easing;
        this.getHighSpeedVideoFpsRanges = easing2;
        this.getHighSpeedVideoSizes = mutableIntState;
    }
}
