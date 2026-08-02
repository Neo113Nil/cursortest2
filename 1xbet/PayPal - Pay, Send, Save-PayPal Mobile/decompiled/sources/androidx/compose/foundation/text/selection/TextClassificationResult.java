package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/text/selection/TextClassificationResult;", "", "", "p0", "Landroidx/compose/ui/text/TextRange;", "p1", "Landroid/view/textclassifier/TextClassification;", "p2", "<init>", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRanges", "()J", "getHighSpeedVideoFpsRangesFor", "Landroid/view/textclassifier/TextClassification;", "()Landroid/view/textclassifier/TextClassification;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class TextClassificationResult {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;
    private final android.view.textclassifier.TextClassification getHighSpeedVideoFpsRangesFor;

    private TextClassificationResult(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification) {
        this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = textClassification;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final java.lang.CharSequence getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    public final long getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final android.view.textclassifier.TextClassification getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextClassificationResult(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append((java.lang.Object) this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append((java.lang.Object) androidx.compose.ui.text.TextRange.m8042toStringimpl(this.getHighSpeedVideoFpsRanges));
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + androidx.compose.ui.text.TextRange.m8040hashCodeimpl(this.getHighSpeedVideoFpsRanges)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.text.selection.TextClassificationResult)) {
            return false;
        }
        androidx.compose.foundation.text.selection.TextClassificationResult textClassificationResult = (androidx.compose.foundation.text.selection.TextClassificationResult) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, textClassificationResult.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.text.TextRange.m8032equalsimpl0(this.getHighSpeedVideoFpsRanges, textClassificationResult.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, textClassificationResult.getHighSpeedVideoFpsRangesFor);
    }

    public /* synthetic */ TextClassificationResult(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j, textClassification);
    }
}
