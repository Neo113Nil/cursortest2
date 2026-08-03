package androidx.compose.foundation.text2.input;

/* compiled from: AllCapsTransformation.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text2/input/AllCapsTransformation;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "locale", "Landroidx/compose/ui/text/intl/Locale;", "(Landroidx/compose/ui/text/intl/Locale;)V", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "transformInput", "", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "valueWithChanges", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class AllCapsTransformation implements androidx.compose.foundation.text2.input.InputTransformation {
    private final androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m4171getCharactersIUNYP9k(), false, 0, 0, null, 30, null);
    private final androidx.compose.ui.text.intl.Locale locale;

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.ui.text.intl.Locale getLocale() {
        return this.locale;
    }

    public static /* synthetic */ androidx.compose.foundation.text2.input.AllCapsTransformation copy$default(androidx.compose.foundation.text2.input.AllCapsTransformation allCapsTransformation, androidx.compose.ui.text.intl.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = allCapsTransformation.locale;
        }
        return allCapsTransformation.copy(locale);
    }

    public final androidx.compose.foundation.text2.input.AllCapsTransformation copy(androidx.compose.ui.text.intl.Locale locale) {
        return new androidx.compose.foundation.text2.input.AllCapsTransformation(locale);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.text2.input.AllCapsTransformation) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, ((androidx.compose.foundation.text2.input.AllCapsTransformation) other).locale);
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    public AllCapsTransformation(androidx.compose.ui.text.intl.Locale locale) {
        this.locale = locale;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(androidx.compose.foundation.text2.input.TextFieldCharSequence originalValue, androidx.compose.foundation.text2.input.TextFieldBuffer valueWithChanges) {
        androidx.compose.foundation.text2.input.TextFieldBuffer.ChangeList changes = valueWithChanges.getChanges();
        for (int i = 0; i < changes.getChangeCount(); i++) {
            long mo1089getRangejx7JFs = changes.mo1089getRangejx7JFs(i);
            changes.mo1088getOriginalRangejx7JFs(i);
            if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(mo1089getRangejx7JFs)) {
                valueWithChanges.replace(androidx.compose.ui.text.TextRange.m3962getMinimpl(mo1089getRangejx7JFs), androidx.compose.ui.text.TextRange.m3961getMaximpl(mo1089getRangejx7JFs), androidx.compose.ui.text.StringKt.toUpperCase(androidx.compose.ui.text.TextRangeKt.m3971substringFDrldGo(valueWithChanges.asCharSequence(), mo1089getRangejx7JFs), this.locale));
            }
        }
    }

    public java.lang.String toString() {
        return "InputTransformation.allCaps(locale=" + this.locale + ')';
    }
}
