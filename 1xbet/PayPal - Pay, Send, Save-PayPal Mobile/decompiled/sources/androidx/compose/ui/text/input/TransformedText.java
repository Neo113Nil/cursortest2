package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/text/input/TransformedText;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/input/OffsetMapping;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformedText {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private final androidx.compose.ui.text.AnnotatedString text;

    public TransformedText(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
        this.text = annotatedString;
        this.offsetMapping = offsetMapping;
    }

    public final androidx.compose.ui.text.AnnotatedString getText() {
        return this.text;
    }

    public final androidx.compose.ui.text.input.OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.input.TransformedText)) {
            return false;
        }
        androidx.compose.ui.text.input.TransformedText transformedText = (androidx.compose.ui.text.input.TransformedText) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, transformedText.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransformedText(text=");
        sb.append((java.lang.Object) this.text);
        sb.append(", offsetMapping=");
        sb.append(this.offsetMapping);
        sb.append(')');
        return sb.toString();
    }
}
