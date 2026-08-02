package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "Camera2StreamConfigurationMap", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "update", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "p0", "p1", "", "getHighSpeedVideoFpsRangesFor", "(I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final boolean getHighSpeedVideoFpsRangesFor(int i) {
        return (i & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(android.view.inputmethod.EditorInfo editorInfo) {
        if (androidx.emoji2.text.EmojiCompat.isConfigured()) {
            androidx.emoji2.text.EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    public static final void update(android.view.inputmethod.EditorInfo editorInfo, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        int i;
        java.lang.String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
            i = 6;
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8217getNoneeUduSuo())) {
            i = 1;
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8215getGoeUduSuo())) {
            i = 2;
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo())) {
            i = 5;
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8218getPreviouseUduSuo())) {
            i = 7;
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8219getSearcheUduSuo())) {
            i = 3;
        } else if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8220getSendeUduSuo())) {
            i = 4;
        } else {
            if (!androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo())) {
                throw new java.lang.IllegalStateException("invalid ImeAction".toString());
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = imeOptions.getKeyboardType();
        if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8272getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8265getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8271getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8274getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8267getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8270getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8269getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8266getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new java.lang.IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && getHighSpeedVideoFpsRangesFor(editorInfo.inputType)) {
            editorInfo.inputType |= 131072;
            if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeOptions.getImeAction(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (getHighSpeedVideoFpsRangesFor(editorInfo.inputType)) {
            int capitalization = imeOptions.getCapitalization();
            if (androidx.compose.ui.text.input.KeyboardCapitalization.m8235equalsimpl0(capitalization, androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8244getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (androidx.compose.ui.text.input.KeyboardCapitalization.m8235equalsimpl0(capitalization, androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8248getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.KeyboardCapitalization.m8235equalsimpl0(capitalization, androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8246getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldValue.getSelection());
        androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    public static final java.util.concurrent.Executor asExecutor(final android.view.Choreographer choreographer) {
        return new java.util.concurrent.Executor() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.getHighSpeedVideoFpsRanges(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(java.lang.Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(android.view.Choreographer choreographer, final java.lang.Runnable runnable) {
        choreographer.postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.Camera2StreamConfigurationMap(runnable);
            }
        });
    }
}
