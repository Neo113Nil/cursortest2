package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "fontWeightAdjustment", "<init>", "(I)V", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "interceptFontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)Landroidx/compose/ui/text/font/FontWeight;", "copy", "(I)Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AndroidFontResolveInterceptor implements androidx.compose.ui.text.font.PlatformResolveInterceptor {
    public static final int $stable = 0;
    private final int getHighSpeedVideoFpsRangesFor;

    public AndroidFontResolveInterceptor(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public final androidx.compose.ui.text.font.FontWeight interceptFontWeight(androidx.compose.ui.text.font.FontWeight fontWeight) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        return (i == 0 || i == Integer.MAX_VALUE) ? fontWeight : new androidx.compose.ui.text.font.FontWeight(kotlin.ranges.RangesKt.coerceIn(fontWeight.getWeight() + this.getHighSpeedVideoFpsRangesFor, 1, 1000));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AndroidFontResolveInterceptor(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.font.AndroidFontResolveInterceptor) && this.getHighSpeedVideoFpsRangesFor == ((androidx.compose.ui.text.font.AndroidFontResolveInterceptor) other).getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.compose.ui.text.font.AndroidFontResolveInterceptor copy(int fontWeightAdjustment) {
        return new androidx.compose.ui.text.font.AndroidFontResolveInterceptor(fontWeightAdjustment);
    }

    public static /* synthetic */ androidx.compose.ui.text.font.AndroidFontResolveInterceptor copy$default(androidx.compose.ui.text.font.AndroidFontResolveInterceptor androidFontResolveInterceptor, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidFontResolveInterceptor.getHighSpeedVideoFpsRangesFor;
        }
        return androidFontResolveInterceptor.copy(i);
    }
}
