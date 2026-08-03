package androidx.compose.foundation.text2.input;

/* compiled from: InputTransformation.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B=\u00126\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\tJ9\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JC\u0010\r\u001a\u00020\u000028\b\u0002\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016RA\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text2/input/InputTransformationByValue;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "transformation", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "old", "proposed", "(Lkotlin/jvm/functions/Function2;)V", "getTransformation", "()Lkotlin/jvm/functions/Function2;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "transformInput", "", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "valueWithChanges", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class InputTransformationByValue implements androidx.compose.foundation.text2.input.InputTransformation {
    private final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence> transformation;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.foundation.text2.input.InputTransformationByValue copy$default(androidx.compose.foundation.text2.input.InputTransformationByValue inputTransformationByValue, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(function2);
    }

    public final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence> component1() {
        return this.transformation;
    }

    public final androidx.compose.foundation.text2.input.InputTransformationByValue copy(kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.CharSequence, ? extends java.lang.CharSequence> transformation) {
        return new androidx.compose.foundation.text2.input.InputTransformationByValue(transformation);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.text2.input.InputTransformationByValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.transformation, ((androidx.compose.foundation.text2.input.InputTransformationByValue) other).transformation);
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public /* synthetic */ androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        return androidx.compose.foundation.text2.input.InputTransformation.CC.$default$getKeyboardOptions(this);
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputTransformationByValue(kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.CharSequence, ? extends java.lang.CharSequence> function2) {
        this.transformation = function2;
    }

    public final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence> getTransformation() {
        return this.transformation;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(androidx.compose.foundation.text2.input.TextFieldCharSequence originalValue, androidx.compose.foundation.text2.input.TextFieldBuffer valueWithChanges) {
        androidx.compose.foundation.text2.input.TextFieldCharSequence m1093toTextFieldCharSequenceOEnZFl4$foundation_release$default = androidx.compose.foundation.text2.input.TextFieldBuffer.m1093toTextFieldCharSequenceOEnZFl4$foundation_release$default(valueWithChanges, null, 1, null);
        java.lang.CharSequence invoke = this.transformation.invoke(originalValue, m1093toTextFieldCharSequenceOEnZFl4$foundation_release$default);
        if (invoke == m1093toTextFieldCharSequenceOEnZFl4$foundation_release$default) {
            return;
        }
        if (invoke == originalValue) {
            valueWithChanges.revertAllChanges();
        } else {
            valueWithChanges.setTextIfChanged$foundation_release(invoke);
        }
    }

    public java.lang.String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }
}
