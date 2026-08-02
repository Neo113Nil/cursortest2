package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DefaultTransformableState$transform$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.DefaultTransformableState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.MutatePriority getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.foundation.gestures.DefaultTransformableState getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.runtime.MutableState mutableState;
            androidx.compose.runtime.MutableState mutableState2;
            androidx.compose.runtime.MutableState mutableState3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.TransformScope transformScope = (androidx.compose.foundation.gestures.TransformScope) this.getHighSpeedVideoFpsRanges;
                    mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                    mutableState2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                    this.Camera2StreamConfigurationMap = 1;
                    if (function2.invoke(transformScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                mutableState3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                mutableState3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                mutableState = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                mutableState.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(androidx.compose.foundation.gestures.TransformScope transformScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.DefaultTransformableState$transform$2.AnonymousClass1) create(transformScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.DefaultTransformableState$transform$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.DefaultTransformableState$transform$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.foundation.gestures.DefaultTransformableState defaultTransformableState, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.TransformScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DefaultTransformableState$transform$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = defaultTransformableState;
            this.getHighSpeedVideoSizes = function2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.MutatorMutex mutatorMutex;
        androidx.compose.foundation.gestures.TransformScope transformScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutatorMutex = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            transformScope = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (mutatorMutex.mutateWith(transformScope, this.getHighSpeedVideoFpsRangesFor, new androidx.compose.foundation.gestures.DefaultTransformableState$transform$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DefaultTransformableState$transform$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.DefaultTransformableState$transform$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultTransformableState$transform$2(androidx.compose.foundation.gestures.DefaultTransformableState defaultTransformableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.TransformScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DefaultTransformableState$transform$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = defaultTransformableState;
        this.getHighSpeedVideoFpsRangesFor = mutatePriority;
        this.Camera2StreamConfigurationMap = function2;
    }
}
