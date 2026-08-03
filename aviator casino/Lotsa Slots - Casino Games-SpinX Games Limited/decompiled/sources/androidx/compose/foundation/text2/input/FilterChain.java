package androidx.compose.foundation.text2.input;

/* compiled from: InputTransformation.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text2/input/FilterChain;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "first", "second", "(Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/InputTransformation;)V", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "equals", "", "other", "", "hashCode", "", "toString", "", "transformInput", "", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "valueWithChanges", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FilterChain implements androidx.compose.foundation.text2.input.InputTransformation {
    private final androidx.compose.foundation.text2.input.InputTransformation first;
    private final androidx.compose.foundation.text2.input.InputTransformation second;

    public FilterChain(androidx.compose.foundation.text2.input.InputTransformation inputTransformation, androidx.compose.foundation.text2.input.InputTransformation inputTransformation2) {
        this.first = inputTransformation;
        this.second = inputTransformation2;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions = this.second.getKeyboardOptions();
        return keyboardOptions == null ? this.first.getKeyboardOptions() : keyboardOptions;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(androidx.compose.foundation.text2.input.TextFieldCharSequence originalValue, androidx.compose.foundation.text2.input.TextFieldBuffer valueWithChanges) {
        this.first.transformInput(originalValue, valueWithChanges);
        this.second.transformInput(originalValue, valueWithChanges);
    }

    public java.lang.String toString() {
        return this.first + ".then(" + this.second + ')';
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.compose.foundation.text2.input.FilterChain filterChain = (androidx.compose.foundation.text2.input.FilterChain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.first, filterChain.first) && kotlin.jvm.internal.Intrinsics.areEqual(this.second, filterChain.second) && kotlin.jvm.internal.Intrinsics.areEqual(getKeyboardOptions(), filterChain.getKeyboardOptions());
    }

    public int hashCode() {
        int hashCode = ((this.first.hashCode() * 31) + this.second.hashCode()) * 32;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions = getKeyboardOptions();
        return hashCode + (keyboardOptions != null ? keyboardOptions.hashCode() : 0);
    }
}
