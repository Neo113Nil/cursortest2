package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<?>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.ComposeInputMethodManager Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.text.input.ImeOptions getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextLayoutState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.content.internal.ReceiveContentConfiguration getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TransformedTextFieldState getInputFormats;
    final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputSession getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOutputFormats;
    final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    final /* synthetic */ androidx.compose.ui.platform.ViewConfiguration getOutputStallDurationlomOqCM;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.text.input.internal.ComposeInputMethodManager getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.TransformedTextFieldState getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState = this.getHighSpeedVideoSizes;
                final androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (transformedTextFieldState.collectImeNotifications(new androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0
                    @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                    public final void onChange(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence2, boolean z) {
                        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.ComposeInputMethodManager.this, textFieldCharSequence, textFieldCharSequence2, z);
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

        public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence2, boolean z) {
            long selection = textFieldCharSequence.getSelection();
            androidx.compose.ui.text.TextRange composition = textFieldCharSequence.getComposition();
            long selection2 = textFieldCharSequence2.getSelection();
            androidx.compose.ui.text.TextRange composition2 = textFieldCharSequence2.getComposition();
            if (z) {
                composeInputMethodManager.restartInput();
            } else {
                if (androidx.compose.ui.text.TextRange.m8032equalsimpl0(selection, selection2) && kotlin.jvm.internal.Intrinsics.areEqual(composition, composition2)) {
                    return;
                }
                composeInputMethodManager.updateSelection(androidx.compose.ui.text.TextRange.m8037getMinimpl(selection2), androidx.compose.ui.text.TextRange.m8036getMaximpl(selection2), composition2 != null ? androidx.compose.ui.text.TextRange.m8037getMinimpl(composition2.getGetHighResolutionOutputSizeshNQ4ISI()) : -1, composition2 != null ? androidx.compose.ui.text.TextRange.m8036getMaximpl(composition2.getGetHighResolutionOutputSizeshNQ4ISI()) : -1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = transformedTextFieldState;
            this.getHighSpeedVideoFpsRanges = composeInputMethodManager;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDurationlomOqCM;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1(this.getInputFormats, this.Camera2StreamConfigurationMap, null), 1, null);
            kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow = this.getOutputMinFrameDuration;
            if (mutableSharedFlow != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(mutableSharedFlow, this.Camera2StreamConfigurationMap, null), 3, null);
            }
            final androidx.compose.foundation.text.input.internal.CursorAnchorInfoController cursorAnchorInfoController = new androidx.compose.foundation.text.input.internal.CursorAnchorInfoController(this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, coroutineScope);
            androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession = this.getInputSizeshNQ4ISI;
            final androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState = this.getInputFormats;
            final androidx.compose.ui.text.input.ImeOptions imeOptions = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            final androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizesFor;
            final androidx.compose.ui.platform.ViewConfiguration viewConfiguration = this.getOutputStallDurationlomOqCM;
            final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function12 = this.getOutputFormats;
            this.getOutputSizes = 1;
            if (platformTextInputSession.startInputMethod(new androidx.compose.ui.platform.PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                public final android.view.inputmethod.InputConnection createInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
                    return androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.TransformedTextFieldState.this, imeOptions, receiveContentConfiguration, composeInputMethodManager, function1, cursorAnchorInfoController, textLayoutState, function0, viewConfiguration, function12, editorInfo);
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

    public static /* synthetic */ android.view.inputmethod.InputConnection getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.text.input.internal.CursorAnchorInfoController cursorAnchorInfoController, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1 function12, android.view.inputmethod.EditorInfo editorInfo) {
        new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.input.internal.TransformedTextFieldState.this);
            }
        };
        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.getHighSpeedVideoSizes();
        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(new androidx.compose.foundation.text.input.internal.DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, function1, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, function0, viewConfiguration, function12);
        androidx.compose.foundation.text.input.internal.EditorInfo_androidKt.m2221updatepLxbY9I(editorInfo, transformedTextFieldState.getVisualText(), transformedTextFieldState.getVisualText().getSelection(), imeOptions, receiveContentConfiguration != null ? androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.getHighResolutionOutputSizeshNQ4ISI : null);
        return new androidx.compose.foundation.text.input.internal.StatelessInputConnection(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, editorInfo);
    }

    public static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("createInputConnection(value=\"");
        sb.append((java.lang.Object) transformedTextFieldState.getVisualText());
        sb.append("\")");
        return sb.toString();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<?> continuation) {
        return ((androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getOutputStallDurationlomOqCM, this.getOutputFormats, continuation);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.getOutputMinFrameDurationlomOqCM = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager, androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = mutableSharedFlow;
        this.getInputFormats = transformedTextFieldState;
        this.getHighSpeedVideoFpsRanges = textLayoutState;
        this.Camera2StreamConfigurationMap = composeInputMethodManager;
        this.getInputSizeshNQ4ISI = platformTextInputSession;
        this.getHighResolutionOutputSizeshNQ4ISI = imeOptions;
        this.getHighSpeedVideoFpsRangesFor = receiveContentConfiguration;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoSizesFor = function0;
        this.getOutputStallDurationlomOqCM = viewConfiguration;
        this.getOutputFormats = function12;
    }
}
