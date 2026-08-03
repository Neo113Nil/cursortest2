package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: TextFieldSelectionState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<androidx.compose.foundation.text2.input.TextFieldCharSequence, java.lang.CharSequence, java.lang.Boolean> {
    public static final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 INSTANCE = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$3();

    TextFieldSelectionState$observeTextChanges$3() {
        super(2, androidx.compose.foundation.text2.input.TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Boolean invoke(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, java.lang.CharSequence charSequence) {
        return java.lang.Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
    }
}
