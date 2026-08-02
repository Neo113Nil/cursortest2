package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", i = {}, l = {1808, 1816}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScope getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", i = {1}, l = {1800, 1805}, m = "invokeSuspend", n = {"press"}, s = {"L$0"}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource Camera2StreamConfigurationMap;
        final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
            androidx.compose.foundation.interaction.PressInteraction.Press press;
            androidx.compose.foundation.interaction.PressInteraction.Press press2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.interaction.PressInteraction.Press pressInteraction = this.getHighSpeedVideoFpsRangesFor.getPressInteraction();
                if (pressInteraction != null) {
                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = this.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.interaction.PressInteraction.Cancel cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(pressInteraction);
                    this.getHighSpeedVideoFpsRanges = textFieldSelectionState2;
                    this.getHighSpeedVideoSizes = 1;
                    if (mutableInteractionSource.emit(cancel, this) != coroutine_suspended) {
                        textFieldSelectionState = textFieldSelectionState2;
                    }
                    return coroutine_suspended;
                }
                press = new androidx.compose.foundation.interaction.PressInteraction.Press(this.getHighResolutionOutputSizeshNQ4ISI, null);
                this.getHighSpeedVideoFpsRanges = press;
                this.getHighSpeedVideoSizes = 2;
                if (this.Camera2StreamConfigurationMap.emit(press, this) != coroutine_suspended) {
                    press2 = press;
                    this.getHighSpeedVideoFpsRangesFor.setPressInteraction(press2);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                press2 = (androidx.compose.foundation.interaction.PressInteraction.Press) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor.setPressInteraction(press2);
                return kotlin.Unit.INSTANCE;
            }
            textFieldSelectionState = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            textFieldSelectionState.setPressInteraction(null);
            press = new androidx.compose.foundation.interaction.PressInteraction.Press(this.getHighResolutionOutputSizeshNQ4ISI, null);
            this.getHighSpeedVideoFpsRanges = press;
            this.getHighSpeedVideoSizes = 2;
            if (this.Camera2StreamConfigurationMap.emit(press, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = textFieldSelectionState;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.Camera2StreamConfigurationMap = mutableInteractionSource;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r3.emit(r14, r13) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r14 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.interaction.PressInteraction.Cancel cancel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor, null, null, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), 3, null);
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.tryAwaitRelease(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI.setPressInteraction(null);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        androidx.compose.foundation.interaction.PressInteraction.Press pressInteraction = this.getHighResolutionOutputSizeshNQ4ISI.getPressInteraction();
        if (pressInteraction != null) {
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoSizes;
            if (booleanValue) {
                cancel = new androidx.compose.foundation.interaction.PressInteraction.Release(pressInteraction);
            } else {
                cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(pressInteraction);
            }
            this.Camera2StreamConfigurationMap = 2;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setPressInteraction(null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1.getHighSpeedVideoSizesFor = obj;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pressGestureScope;
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldSelectionState;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = mutableInteractionSource;
    }
}
