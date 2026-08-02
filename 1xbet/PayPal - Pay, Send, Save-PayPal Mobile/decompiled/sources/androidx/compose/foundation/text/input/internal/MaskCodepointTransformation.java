package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/text/input/internal/MaskCodepointTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "", "p0", "<init>", "(C)V", "", "p1", "transform", "(II)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class MaskCodepointTransformation implements androidx.compose.foundation.text.input.internal.CodepointTransformation {
    private final char getHighSpeedVideoFpsRanges;

    public MaskCodepointTransformation(char c) {
        this.getHighSpeedVideoFpsRanges = c;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int p0, int p1) {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MaskCodepointTransformation(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Character.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.text.input.internal.MaskCodepointTransformation) && this.getHighSpeedVideoFpsRanges == ((androidx.compose.foundation.text.input.internal.MaskCodepointTransformation) p0).getHighSpeedVideoFpsRanges;
    }
}
