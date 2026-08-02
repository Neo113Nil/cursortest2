package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {810}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldDecoratorModifierNode$startInputSession$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.content.internal.ReceiveContentConfiguration getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.establishTextInputSession(this.Camera2StreamConfigurationMap, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {811}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.platform.PlatformTextInputSessionScope, kotlin.coroutines.Continuation<?>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.content.internal.ReceiveContentConfiguration Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.platform.PlatformTextInputSessionScope platformTextInputSessionScope = (androidx.compose.ui.platform.PlatformTextInputSessionScope) this.getHighSpeedVideoFpsRanges;
                androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState = this.getHighSpeedVideoSizes.getTextFieldState();
                androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState = this.getHighSpeedVideoSizes.getTextLayoutState();
                androidx.compose.ui.text.input.ImeOptions imeOptions$foundation = this.getHighSpeedVideoSizes.getKeyboardOptions().toImeOptions$foundation(this.getHighSpeedVideoSizes.getSingleLine());
                androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration = this.Camera2StreamConfigurationMap;
                androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1.C00241 c00241 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1.C00241(this.getHighSpeedVideoSizes);
                final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this);
                    }
                };
                kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> stylusHandwritingTrigger = this.getHighSpeedVideoSizes.getStylusHandwritingTrigger();
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.getHighSpeedVideoSizes, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
                final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation, receiveContentConfiguration, c00241, function0, stylusHandwritingTrigger, viewConfiguration, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1.Camera2StreamConfigurationMap(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, ((java.lang.Boolean) obj2).booleanValue());
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        static final /* synthetic */ class C00241 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.ImeAction imeAction) {
                ((androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode) this.receiver).Camera2StreamConfigurationMap(imeAction.getGetHighSpeedVideoFpsRanges());
                return kotlin.Unit.INSTANCE;
            }

            C00241(java.lang.Object obj) {
                super(1, obj, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
            }
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, boolean z) {
            textFieldDecoratorModifierNode.getTextFieldSelectionState().setInTouchMode(z);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
            textFieldDecoratorModifierNode.getTextFieldSelectionState().updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.platform.PlatformTextInputSessionScope platformTextInputSessionScope, kotlin.coroutines.Continuation<?> continuation) {
            return ((androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1) create(platformTextInputSessionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = textFieldDecoratorModifierNode;
            this.Camera2StreamConfigurationMap = receiveContentConfiguration;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldDecoratorModifierNode$startInputSession$1(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = textFieldDecoratorModifierNode;
        this.getHighSpeedVideoFpsRangesFor = receiveContentConfiguration;
    }
}
