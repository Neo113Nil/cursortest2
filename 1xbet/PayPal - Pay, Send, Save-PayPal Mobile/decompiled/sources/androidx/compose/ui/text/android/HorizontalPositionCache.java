package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", "Landroidx/compose/ui/text/android/TextLayout;", "p0", "<init>", "(Landroidx/compose/ui/text/android/TextLayout;)V", "", "", "p1", "p2", "p3", "", "getHighSpeedVideoFpsRangesFor", "(IZZZ)F", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/android/TextLayout;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HorizontalPositionCache {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.text.android.TextLayout getHighSpeedVideoFpsRanges;
    private float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap = -1;

    public HorizontalPositionCache(androidx.compose.ui.text.android.TextLayout textLayout) {
        this.getHighSpeedVideoFpsRanges = textLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final float getHighSpeedVideoFpsRangesFor(int p0, boolean p1, boolean p2, boolean p3) {
        boolean z;
        int i;
        float secondaryHorizontal;
        int i2 = 0;
        if (p1) {
            int lineForOffset = androidx.compose.ui.text.android.LayoutCompat_androidKt.getLineForOffset(this.getHighSpeedVideoFpsRanges.getLayout(), p0, p1);
            int lineStart = this.getHighSpeedVideoFpsRanges.getLineStart(lineForOffset);
            int lineEnd = this.getHighSpeedVideoFpsRanges.getLineEnd(lineForOffset);
            if (p0 == lineStart || p0 == lineEnd) {
                z = true;
                if (p3) {
                    i2 = z ? 2 : 3;
                } else if (!z) {
                    i2 = 1;
                }
                i = (p0 * 4) + i2;
                if (this.Camera2StreamConfigurationMap != i) {
                    return this.getHighResolutionOutputSizeshNQ4ISI;
                }
                if (p3) {
                    secondaryHorizontal = this.getHighSpeedVideoFpsRanges.getPrimaryHorizontal(p0, p1);
                } else {
                    secondaryHorizontal = this.getHighSpeedVideoFpsRanges.getSecondaryHorizontal(p0, p1);
                }
                if (p2) {
                    this.Camera2StreamConfigurationMap = i;
                    this.getHighResolutionOutputSizeshNQ4ISI = secondaryHorizontal;
                }
                return secondaryHorizontal;
            }
        }
        z = false;
        if (p3) {
        }
        i = (p0 * 4) + i2;
        if (this.Camera2StreamConfigurationMap != i) {
        }
    }
}
