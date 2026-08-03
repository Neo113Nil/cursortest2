package androidx.compose.foundation.text2.input.internal;

/* compiled from: AndroidTextInputSession.android.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002\u001a \u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a8\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0080@¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u000b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005¨\u0006\u001e"}, d2 = {"TAG", "", "TIA_DEBUG", "", "getTIA_DEBUG$annotations", "()V", "hasFlag", "bits", "", "flag", "logDebug", "", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "content", "Lkotlin/Function0;", "platformSpecificTextInputSession", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "state", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onImeAction", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Landroid/view/inputmethod/EditorInfo;", "textFieldValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt {
    private static final java.lang.String TAG = "AndroidTextInputSession";
    public static final boolean TIA_DEBUG = false;

    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    private static final void logDebug(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = (androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) continuation;
            if ((androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(platformTextInputSession, transformedTextFieldState, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(platformTextInputSession.getView()), imeOptions, function1, null);
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(androidTextInputSession_androidKt$platformSpecificTextInputSession$2, androidTextInputSession_androidKt$platformSpecificTextInputSession$1) == coroutine_suspended) {
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
        }
        androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = new androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(continuation);
        java.lang.Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void update(android.view.inputmethod.EditorInfo editorInfo, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.ui.text.input.ImeOptions imeOptions) {
        int imeAction = imeOptions.getImeAction();
        int i = 3;
        int i2 = 6;
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4147getNoneeUduSuo())) {
            i2 = 1;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4145getGoeUduSuo())) {
            i2 = 2;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4146getNexteUduSuo())) {
            i2 = 5;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4148getPreviouseUduSuo())) {
            i2 = 7;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4149getSearcheUduSuo())) {
            i2 = 3;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4150getSendeUduSuo())) {
            i2 = 4;
        } else if (!androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4144getDoneeUduSuo())) {
            throw new java.lang.IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i2;
        int keyboardType = imeOptions.getKeyboardType();
        if (!androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4198getTextPjHm6EE())) {
            if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4191getAsciiPjHm6EE())) {
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else {
                if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4194getNumberPjHm6EE())) {
                    i = 2;
                } else if (!androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4197getPhonePjHm6EE())) {
                    if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4199getUriPjHm6EE())) {
                        i = 17;
                    } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4193getEmailPjHm6EE())) {
                        i = 33;
                    } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4196getPasswordPjHm6EE())) {
                        i = 129;
                    } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4195getNumberPasswordPjHm6EE())) {
                        i = 18;
                    } else {
                        if (!androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4192getDecimalPjHm6EE())) {
                            throw new java.lang.IllegalStateException("Invalid Keyboard Type".toString());
                        }
                        i = 8194;
                    }
                }
                editorInfo.inputType = i;
                if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
                    editorInfo.inputType |= 131072;
                    if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeOptions.getImeAction(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo())) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                if (hasFlag(editorInfo.inputType, 1)) {
                    int capitalization = imeOptions.getCapitalization();
                    if (androidx.compose.ui.text.input.KeyboardCapitalization.m4163equalsimpl0(capitalization, androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m4171getCharactersIUNYP9k())) {
                        editorInfo.inputType |= 4096;
                    } else if (androidx.compose.ui.text.input.KeyboardCapitalization.m4163equalsimpl0(capitalization, androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m4174getWordsIUNYP9k())) {
                        editorInfo.inputType |= 8192;
                    } else if (androidx.compose.ui.text.input.KeyboardCapitalization.m4163equalsimpl0(capitalization, androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m4173getSentencesIUNYP9k())) {
                        editorInfo.inputType |= 16384;
                    }
                    if (imeOptions.getAutoCorrect()) {
                        editorInfo.inputType |= 32768;
                    }
                }
                editorInfo.initialSelStart = androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldCharSequence.getSelectionInChars());
                editorInfo.initialSelEnd = androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldCharSequence.getSelectionInChars());
                androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldCharSequence);
                editorInfo.imeOptions |= 33554432;
            }
        }
        i = 1;
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine()) {
            editorInfo.inputType |= 131072;
            if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeOptions.getImeAction(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo())) {
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldCharSequence.getSelectionInChars());
        editorInfo.initialSelEnd = androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldCharSequence.getSelectionInChars());
        androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldCharSequence);
        editorInfo.imeOptions |= 33554432;
    }

    static /* synthetic */ void logDebug$default(java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = TAG;
        }
        logDebug(str, function0);
    }
}
