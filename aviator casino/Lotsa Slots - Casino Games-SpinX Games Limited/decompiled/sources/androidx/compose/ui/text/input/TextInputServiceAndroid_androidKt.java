package androidx.compose.ui.text.input;

/* compiled from: TextInputServiceAndroid.android.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final java.lang.String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(android.view.inputmethod.EditorInfo editorInfo) {
        if (androidx.emoji2.text.EmojiCompat.isConfigured()) {
            androidx.emoji2.text.EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    public static final void update(android.view.inputmethod.EditorInfo editorInfo, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        java.lang.String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        int i = 6;
        if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4147getNoneeUduSuo())) {
            i = 1;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4145getGoeUduSuo())) {
            i = 2;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4146getNexteUduSuo())) {
            i = 5;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4148getPreviouseUduSuo())) {
            i = 7;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4149getSearcheUduSuo())) {
            i = 3;
        } else if (androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4150getSendeUduSuo())) {
            i = 4;
        } else if (!androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m4144getDoneeUduSuo())) {
            throw new java.lang.IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = imeOptions.getKeyboardType();
        if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4198getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4191getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4194getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4197getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4199getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4193getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4196getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4195getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4192getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new java.lang.IllegalStateException("Invalid Keyboard Type".toString());
        }
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
        editorInfo.initialSelStart = androidx.compose.ui.text.TextRange.m3964getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = androidx.compose.ui.text.TextRange.m3959getEndimpl(textFieldValue.getSelection());
        androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    public static final java.util.concurrent.Executor asExecutor(final android.view.Choreographer choreographer) {
        return new java.util.concurrent.Executor() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(android.view.Choreographer choreographer, final java.lang.Runnable runnable) {
        choreographer.postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
