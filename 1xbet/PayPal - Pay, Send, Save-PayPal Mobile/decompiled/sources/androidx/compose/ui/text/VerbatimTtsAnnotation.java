package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "", "verbatim", "<init>", "(Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getVerbatim"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerbatimTtsAnnotation extends androidx.compose.ui.text.TtsAnnotation {
    public static final int $stable = 0;
    private final java.lang.String verbatim;

    public VerbatimTtsAnnotation(java.lang.String str) {
        super(null);
        this.verbatim = str;
    }

    public final java.lang.String getVerbatim() {
        return this.verbatim;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.VerbatimTtsAnnotation) && kotlin.jvm.internal.Intrinsics.areEqual(this.verbatim, ((androidx.compose.ui.text.VerbatimTtsAnnotation) other).verbatim);
    }

    public final int hashCode() {
        return this.verbatim.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerbatimTtsAnnotation(verbatim=");
        sb.append(this.verbatim);
        sb.append(')');
        return sb.toString();
    }
}
