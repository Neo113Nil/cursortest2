package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0005\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R-\u0010\u0018\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformationByValue;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class InputTransformationByValue implements androidx.compose.foundation.text.input.InputTransformation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public InputTransformationByValue(kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.CharSequence, ? extends java.lang.CharSequence> function2) {
        this.getHighSpeedVideoSizes = function2;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        androidx.compose.foundation.text.input.TextFieldCharSequence m2170toTextFieldCharSequencewFTz33Y$foundation$default = androidx.compose.foundation.text.input.TextFieldBuffer.m2170toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, 0L, null, null, null, 15, null);
        java.lang.CharSequence invoke = this.getHighSpeedVideoSizes.invoke(textFieldBuffer.getOriginalValue(), m2170toTextFieldCharSequencewFTz33Y$foundation$default);
        if (invoke == m2170toTextFieldCharSequencewFTz33Y$foundation$default) {
            return;
        }
        if (invoke == textFieldBuffer.getOriginalValue()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation(invoke);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InputTransformation.byValue(transformation=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.text.input.InputTransformationByValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((androidx.compose.foundation.text.input.InputTransformationByValue) p0).getHighSpeedVideoSizes);
    }
}
