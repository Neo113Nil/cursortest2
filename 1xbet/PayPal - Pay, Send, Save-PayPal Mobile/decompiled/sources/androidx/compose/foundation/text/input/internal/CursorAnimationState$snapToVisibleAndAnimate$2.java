package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.CursorAnimationState getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        kotlinx.coroutines.Job launch$default;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
            atomicReference = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) atomicReference.getAndSet(null);
            atomicReference2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1(job, this.getHighResolutionOutputSizeshNQ4ISI, null), 3, null);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, null, launch$default));
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {72, 77, 79, 81}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.CursorAnimationState getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.Job getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(500, r10) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
        
            if (kotlinx.coroutines.JobKt.cancelAndJoin(r11, r10) != r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:9:0x007f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
                    if (job != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    }
                } else if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (i == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getHighSpeedVideoFpsRangesFor.setCursorAlpha(0.0f);
                        this.getHighResolutionOutputSizeshNQ4ISI = 4;
                    } else {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getHighSpeedVideoFpsRangesFor.setCursorAlpha(1.0f);
                        this.getHighResolutionOutputSizeshNQ4ISI = 3;
                        if (kotlinx.coroutines.DelayKt.delay(500L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.getHighSpeedVideoFpsRangesFor.setCursorAlpha(0.0f);
                        this.getHighResolutionOutputSizeshNQ4ISI = 4;
                    }
                }
                this.getHighSpeedVideoFpsRangesFor.setCursorAlpha(1.0f);
                if (!this.getHighSpeedVideoFpsRangesFor.getAnimate()) {
                    this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    if (kotlinx.coroutines.DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw new kotlin.KotlinNothingValueException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = 3;
                if (kotlinx.coroutines.DelayKt.delay(500L, this) == coroutine_suspended) {
                }
                this.getHighSpeedVideoFpsRangesFor.setCursorAlpha(0.0f);
                this.getHighResolutionOutputSizeshNQ4ISI = 4;
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor.setCursorAlpha(0.0f);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.Job job, androidx.compose.foundation.text.input.internal.CursorAnimationState cursorAnimationState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = job;
            this.getHighSpeedVideoFpsRangesFor = cursorAnimationState;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        cursorAnimationState$snapToVisibleAndAnimate$2.Camera2StreamConfigurationMap = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CursorAnimationState$snapToVisibleAndAnimate$2(androidx.compose.foundation.text.input.internal.CursorAnimationState cursorAnimationState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cursorAnimationState;
    }
}
