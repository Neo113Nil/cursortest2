package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<androidx.compose.foundation.text.input.TextFieldCharSequence, java.lang.CharSequence, java.lang.Boolean> {
    public static final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3();

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, java.lang.CharSequence charSequence) {
        return java.lang.Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
    }

    TextFieldSelectionState$observeTextChanges$3() {
        super(2, androidx.compose.foundation.text.input.TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }
}
