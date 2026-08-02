package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldCoreModifierNode$startCursorJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = 1;
            final androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.this, intRef));
                }
            }), new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isWindowFocused", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode getHighSpeedVideoFpsRangesFor;
        /* synthetic */ int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        
            r4 = r3.getHighSpeedVideoFpsRangesFor.getOutputStallDuration;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.foundation.text.input.internal.CursorAnimationState cursorAnimationState;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (java.lang.Math.abs(this.getHighSpeedVideoSizes) == 1 && cursorAnimationState != null) {
                    this.Camera2StreamConfigurationMap = 1;
                    if (cursorAnimationState.snapToVisibleAndAnimate(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.AnonymousClass2) create(java.lang.Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.AnonymousClass2 anonymousClass2 = new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighSpeedVideoSizes = ((java.lang.Number) obj).intValue();
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = textFieldCoreModifierNode;
        }
    }

    public static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.jvm.internal.Ref.IntRef intRef) {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState;
        transformedTextFieldState = textFieldCoreModifierNode.Camera2StreamConfigurationMap;
        transformedTextFieldState.getVisualText();
        int i = (textFieldCoreModifierNode.getIsAttached() && ((androidx.compose.ui.platform.WindowInfo) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldCoreModifierNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2;
        int i2 = intRef.element;
        intRef.element *= -1;
        return i * i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$startCursorJob$1(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = textFieldCoreModifierNode;
    }
}
