package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldDecoratorModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0003"}, d2 = {"withDefaultsFrom", "Landroidx/compose/foundation/text/KeyboardOptions;", com.google.firebase.remoteconfig.RemoteConfigComponent.DEFAULTS_FILE_NAME, "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierKt {
    public static final androidx.compose.foundation.text.KeyboardOptions withDefaultsFrom(androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardOptions keyboardOptions2) {
        int capitalization;
        int keyboardType;
        int imeAction;
        if (keyboardOptions2 == null) {
            return keyboardOptions;
        }
        if (!androidx.compose.ui.text.input.KeyboardCapitalization.m4163equalsimpl0(keyboardOptions.getCapitalization(), androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m4172getNoneIUNYP9k())) {
            capitalization = keyboardOptions.getCapitalization();
        } else {
            capitalization = keyboardOptions2.getCapitalization();
        }
        int i = capitalization;
        boolean z = keyboardOptions.getAutoCorrect() && keyboardOptions2.getAutoCorrect();
        if (!androidx.compose.ui.text.input.KeyboardType.m4178equalsimpl0(keyboardOptions.getKeyboardType(), androidx.compose.ui.text.input.KeyboardType.INSTANCE.m4198getTextPjHm6EE())) {
            keyboardType = keyboardOptions.getKeyboardType();
        } else {
            keyboardType = keyboardOptions2.getKeyboardType();
        }
        int i2 = keyboardType;
        if (!androidx.compose.ui.text.input.ImeAction.m4131equalsimpl0(keyboardOptions.getImeAction(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m4143getDefaulteUduSuo())) {
            imeAction = keyboardOptions.getImeAction();
        } else {
            imeAction = keyboardOptions2.getImeAction();
        }
        return new androidx.compose.foundation.text.KeyboardOptions(i, z, i2, imeAction, null, 16, null);
    }
}
