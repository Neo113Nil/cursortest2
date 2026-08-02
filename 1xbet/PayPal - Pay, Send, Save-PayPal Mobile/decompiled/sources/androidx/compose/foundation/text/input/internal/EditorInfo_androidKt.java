package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a=\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "", "contentMimeTypes", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "update"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditorInfo_androidKt {
    /* renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m2222updatepLxbY9I$default(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, long j, androidx.compose.ui.text.input.ImeOptions imeOptions, java.lang.String[] strArr, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        m2221updatepLxbY9I(editorInfo, charSequence, j, imeOptions, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac  */
    /* renamed from: update-pLxbY9I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2221updatepLxbY9I(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, long j, androidx.compose.ui.text.input.ImeOptions imeOptions, java.lang.String[] strArr) {
        int i;
        java.lang.String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        int i2 = 3;
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
        androidx.compose.foundation.text.input.internal.LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        if (!androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8272getTextPjHm6EE())) {
            if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8265getAsciiPjHm6EE())) {
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else {
                if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE())) {
                    i2 = 2;
                } else if (!androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8271getPhonePjHm6EE())) {
                    if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8274getUriPjHm6EE())) {
                        i2 = 17;
                    } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8267getEmailPjHm6EE())) {
                        i2 = 33;
                    } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8270getPasswordPjHm6EE())) {
                        i2 = 129;
                    } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8269getNumberPasswordPjHm6EE())) {
                        i2 = 18;
                    } else {
                        if (!androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8266getDecimalPjHm6EE())) {
                            throw new java.lang.IllegalStateException("Invalid Keyboard Type".toString());
                        }
                        i2 = 8194;
                    }
                }
                editorInfo.inputType = i2;
                if (!imeOptions.getSingleLine() && (editorInfo.inputType & 1) == 1) {
                    editorInfo.inputType |= 131072;
                    if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeOptions.getImeAction(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo())) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                if ((editorInfo.inputType & 1) == 1) {
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
                editorInfo.initialSelStart = androidx.compose.ui.text.TextRange.m8039getStartimpl(j);
                editorInfo.initialSelEnd = androidx.compose.ui.text.TextRange.m8034getEndimpl(j);
                androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
                if (strArr != null) {
                    androidx.core.view.inputmethod.EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
                }
                editorInfo.imeOptions |= 33554432;
                if (!androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt.isStylusHandwritingSupported() && !androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(imeOptions.getKeyboardType(), androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8270getPasswordPjHm6EE()) && !androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(imeOptions.getKeyboardType(), androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8269getNumberPasswordPjHm6EE())) {
                    androidx.core.view.inputmethod.EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
                    androidx.compose.foundation.text.input.internal.EditorInfoApi34.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(editorInfo);
                    return;
                } else {
                    androidx.core.view.inputmethod.EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
                }
            }
        }
        i2 = 1;
        editorInfo.inputType = i2;
        if (!imeOptions.getSingleLine()) {
            editorInfo.inputType |= 131072;
            if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeOptions.getImeAction(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo())) {
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.TextRange.m8039getStartimpl(j);
        editorInfo.initialSelEnd = androidx.compose.ui.text.TextRange.m8034getEndimpl(j);
        androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
        }
        editorInfo.imeOptions |= 33554432;
        if (!androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
        }
        androidx.core.view.inputmethod.EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
    }
}
