package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/text/input/AllCapsTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Landroidx/compose/ui/text/intl/Locale;", "p0", "<init>", "(Landroidx/compose/ui/text/intl/Locale;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Landroidx/compose/ui/text/intl/Locale;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/KeyboardOptions;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class AllCapsTransformation implements androidx.compose.foundation.text.input.InputTransformation {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.KeyboardOptions getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.text.KeyboardOptions(androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8244getCharactersIUNYP9k(), (java.lang.Boolean) null, 0, 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 126, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.text.intl.Locale getHighSpeedVideoFpsRanges;

    public AllCapsTransformation(androidx.compose.ui.text.intl.Locale locale) {
        this.getHighSpeedVideoFpsRanges = locale;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    /* renamed from: getKeyboardOptions, reason: from getter */
    public final androidx.compose.foundation.text.KeyboardOptions getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList changes = textFieldBuffer.getChanges();
        for (int i = 0; i < changes.getChangeCount(); i++) {
            long mo2178getRangejx7JFs = changes.mo2178getRangejx7JFs(i);
            changes.mo2177getOriginalRangejx7JFs(i);
            if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(mo2178getRangejx7JFs)) {
                textFieldBuffer.replace(androidx.compose.ui.text.TextRange.m8037getMinimpl(mo2178getRangejx7JFs), androidx.compose.ui.text.TextRange.m8036getMaximpl(mo2178getRangejx7JFs), androidx.compose.ui.text.StringKt.toUpperCase(androidx.compose.ui.text.TextRangeKt.m8046substringFDrldGo(textFieldBuffer.asCharSequence(), mo2178getRangejx7JFs), this.getHighSpeedVideoFpsRanges));
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InputTransformation.allCaps(locale=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.text.input.AllCapsTransformation) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((androidx.compose.foundation.text.input.AllCapsTransformation) p0).getHighSpeedVideoFpsRanges);
    }
}
