package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/text/input/FilterChain;", "Landroidx/compose/foundation/text/input/InputTransformation;", "p0", "p1", "<init>", "(Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/InputTransformation;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/input/InputTransformation;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FilterChain implements androidx.compose.foundation.text.input.InputTransformation {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.InputTransformation getHighSpeedVideoFpsRanges;
    private final androidx.compose.foundation.text.input.InputTransformation getHighSpeedVideoSizes;

    public FilterChain(androidx.compose.foundation.text.input.InputTransformation inputTransformation, androidx.compose.foundation.text.input.InputTransformation inputTransformation2) {
        this.getHighSpeedVideoSizes = inputTransformation;
        this.getHighSpeedVideoFpsRanges = inputTransformation2;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        androidx.compose.foundation.text.KeyboardOptions fillUnspecifiedValuesWith$foundation;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions = this.getHighSpeedVideoFpsRanges.getKeyboardOptions();
        return (keyboardOptions == null || (fillUnspecifiedValuesWith$foundation = keyboardOptions.fillUnspecifiedValuesWith$foundation(this.getHighSpeedVideoSizes.getKeyboardOptions())) == null) ? this.getHighSpeedVideoSizes.getKeyboardOptions() : fillUnspecifiedValuesWith$foundation;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.getHighSpeedVideoSizes.applySemantics(semanticsPropertyReceiver);
        this.getHighSpeedVideoFpsRanges.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        this.getHighSpeedVideoSizes.transformInput(textFieldBuffer);
        this.getHighSpeedVideoFpsRanges.transformInput(textFieldBuffer);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(".then(");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        androidx.compose.foundation.text.input.FilterChain filterChain = (androidx.compose.foundation.text.input.FilterChain) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, filterChain.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, filterChain.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(getKeyboardOptions(), filterChain.getKeyboardOptions());
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions = getKeyboardOptions();
        return (((hashCode * 31) + hashCode2) * 32) + (keyboardOptions != null ? keyboardOptions.hashCode() : 0);
    }
}
