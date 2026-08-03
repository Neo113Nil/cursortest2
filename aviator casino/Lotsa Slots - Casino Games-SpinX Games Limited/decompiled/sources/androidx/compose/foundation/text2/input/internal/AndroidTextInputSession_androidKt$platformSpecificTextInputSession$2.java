package androidx.compose.foundation.text2.input.internal;

/* compiled from: AndroidTextInputSession.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2", f = "AndroidTextInputSession.android.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<?>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager $composeImm;
    final /* synthetic */ androidx.compose.ui.text.input.ImeOptions $imeOptions;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> $onImeAction;
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.TransformedTextFieldState $state;
    final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputSession $this_platformSpecificTextInputSession;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager composeInputMethodManager, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2> continuation) {
        super(2, continuation);
        this.$this_platformSpecificTextInputSession = platformTextInputSession;
        this.$state = transformedTextFieldState;
        this.$composeImm = composeInputMethodManager;
        this.$imeOptions = imeOptions;
        this.$onImeAction = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(this.$this_platformSpecificTextInputSession, this.$state, this.$composeImm, this.$imeOptions, this.$onImeAction, continuation);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$2.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<?> continuation) {
        return ((androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: AndroidTextInputSession.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager $composeImm;
        final /* synthetic */ androidx.compose.ui.text.input.ImeOptions $imeOptions;
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.TransformedTextFieldState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager composeInputMethodManager, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$state = transformedTextFieldState;
            this.$composeImm = composeInputMethodManager;
            this.$imeOptions = imeOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.AnonymousClass1(this.$state, this.$composeImm, this.$imeOptions, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = this.$state;
                final androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                final androidx.compose.ui.text.input.ImeOptions imeOptions = this.$imeOptions;
                this.label = 1;
                if (transformedTextFieldState.collectImeNotifications(new androidx.compose.foundation.text2.input.TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1$$ExternalSyntheticLambda0
                    @Override // androidx.compose.foundation.text2.input.TextFieldState.NotifyImeListener
                    public final void onChange(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence2) {
                        androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.AnonymousClass1.invokeSuspend$lambda$0(androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager.this, imeOptions, textFieldCharSequence, textFieldCharSequence2);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager composeInputMethodManager, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence2) {
            if (!androidx.compose.ui.text.TextRange.m3957equalsimpl0(textFieldCharSequence.getSelectionInChars(), textFieldCharSequence2.getSelectionInChars()) || !kotlin.jvm.internal.Intrinsics.areEqual(textFieldCharSequence.getCompositionInChars(), textFieldCharSequence2.getCompositionInChars())) {
                int m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(textFieldCharSequence2.getSelectionInChars());
                int m3961getMaximpl = androidx.compose.ui.text.TextRange.m3961getMaximpl(textFieldCharSequence2.getSelectionInChars());
                androidx.compose.ui.text.TextRange compositionInChars = textFieldCharSequence2.getCompositionInChars();
                int m3962getMinimpl2 = compositionInChars != null ? androidx.compose.ui.text.TextRange.m3962getMinimpl(compositionInChars.getPackedValue()) : -1;
                androidx.compose.ui.text.TextRange compositionInChars2 = textFieldCharSequence2.getCompositionInChars();
                composeInputMethodManager.updateSelection(m3962getMinimpl, m3961getMaximpl, m3962getMinimpl2, compositionInChars2 != null ? androidx.compose.ui.text.TextRange.m3961getMaximpl(compositionInChars2.getPackedValue()) : -1);
            }
            if (textFieldCharSequence.contentEquals(textFieldCharSequence2) || androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(imeOptions.getKeyboardType(), androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4196getPasswordPjHm6EE())) {
                return;
            }
            composeInputMethodManager.restartInput();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.L$0, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.AnonymousClass1(this.$state, this.$composeImm, this.$imeOptions, null), 1, null);
            androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
            final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = this.$state;
            final androidx.compose.ui.text.input.ImeOptions imeOptions = this.$imeOptions;
            final androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
            final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1 = this.$onImeAction;
            this.label = 1;
            if (platformTextInputSession.startInputMethod(new androidx.compose.ui.platform.PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                public final android.view.inputmethod.InputConnection createInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
                    android.view.inputmethod.InputConnection invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.invokeSuspend$lambda$0(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.this, imeOptions, composeInputMethodManager, function1, editorInfo);
                    return invokeSuspend$lambda$0;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.inputmethod.InputConnection invokeSuspend$lambda$0(final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.input.ImeOptions imeOptions, final androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager composeInputMethodManager, final kotlin.jvm.functions.Function1 function1, android.view.inputmethod.EditorInfo editorInfo) {
        androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt.logDebug$default(null, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                return "createInputConnection(value=\"" + ((java.lang.Object) androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.this.getText()) + "\")";
            }
        }, 1, null);
        androidx.compose.foundation.text2.input.internal.TextInputSession textInputSession = new androidx.compose.foundation.text2.input.internal.TextInputSession() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1
            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            public androidx.compose.foundation.text2.input.TextFieldCharSequence getText() {
                return androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.this.getText();
            }

            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            public void requestEdit(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text2.input.internal.EditingBuffer, kotlin.Unit> block) {
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState2 = androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.this;
                androidx.compose.foundation.text2.input.TextFieldState textFieldState = transformedTextFieldState2.textFieldState;
                androidx.compose.foundation.text2.input.InputTransformation inputTransformation = transformedTextFieldState2.inputTransformation;
                androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
                androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
                textFieldState.getMainBuffer().getChangeTracker().clearChanges();
                block.invoke(textFieldState.getMainBuffer());
                if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
                    return;
                }
                textFieldState.commitEditAsUser(text, inputTransformation, false, textFieldEditUndoBehavior);
            }

            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            public void sendKeyEvent(android.view.KeyEvent keyEvent) {
                composeInputMethodManager.sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
            public void mo1118onImeActionKlQnJC8(int imeAction) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(imeAction));
                }
            }
        };
        androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt.update(editorInfo, transformedTextFieldState.getText(), imeOptions);
        return new androidx.compose.foundation.text2.input.internal.StatelessInputConnection(textInputSession);
    }
}
