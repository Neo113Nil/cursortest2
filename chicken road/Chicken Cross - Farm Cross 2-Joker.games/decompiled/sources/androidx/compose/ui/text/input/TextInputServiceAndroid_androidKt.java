package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int imeAction = imeOptions.getImeAction();
        int i = 6;
        if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3617getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3621getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3619getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3620getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3622getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3623getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3624getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m3613equalsimpl0(imeAction, ImeAction.INSTANCE.m3618getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int keyboardType = imeOptions.getKeyboardType();
        if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3657getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3650getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3653getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3656getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3658getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3652getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3655getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3654getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m3646equalsimpl0(keyboardType, KeyboardType.INSTANCE.m3651getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m3613equalsimpl0(imeOptions.getImeAction(), ImeAction.INSTANCE.m3617getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            if (KeyboardCapitalization.m3635equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m3639getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m3635equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m3642getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m3635equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m3641getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m3486getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m3481getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }
}
