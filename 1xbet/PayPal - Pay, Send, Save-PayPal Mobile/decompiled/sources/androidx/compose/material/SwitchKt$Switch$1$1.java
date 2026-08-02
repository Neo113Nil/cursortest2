package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SwitchKt$Switch$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material.AnchoredDraggableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.material.AnchoredDraggableState<java.lang.Boolean> anchoredDraggableState = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.SwitchKt$Switch$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean booleanValue;
                    booleanValue = ((java.lang.Boolean) androidx.compose.material.AnchoredDraggableState.this.getCurrentValue()).booleanValue();
                    return java.lang.Boolean.valueOf(booleanValue);
                }
            }), new androidx.compose.material.SwitchKt$Switch$1$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material.SwitchKt$Switch$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ boolean getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean booleanValue;
            boolean booleanValue2;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z = this.getHighSpeedVideoFpsRanges;
            booleanValue = ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
            if (booleanValue != z) {
                kotlin.jvm.functions.Function1 access$Switch$lambda$7 = androidx.compose.material.SwitchKt.access$Switch$lambda$7(this.getHighSpeedVideoSizes);
                if (access$Switch$lambda$7 != null) {
                    access$Switch$lambda$7.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                }
                androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.Camera2StreamConfigurationMap;
                booleanValue2 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                mutableState.setValue(java.lang.Boolean.valueOf(!booleanValue2));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material.SwitchKt$Switch$1$1.AnonymousClass2) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.material.SwitchKt$Switch$1$1.AnonymousClass2 anonymousClass2 = new androidx.compose.material.SwitchKt$Switch$1$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass2.getHighSpeedVideoFpsRanges = ((java.lang.Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super androidx.compose.material.SwitchKt$Switch$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = state;
            this.getHighSpeedVideoSizes = state2;
            this.Camera2StreamConfigurationMap = mutableState;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SwitchKt$Switch$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.SwitchKt$Switch$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwitchKt$Switch$1$1(androidx.compose.material.AnchoredDraggableState<java.lang.Boolean> anchoredDraggableState, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super androidx.compose.material.SwitchKt$Switch$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = anchoredDraggableState;
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRanges = state2;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
