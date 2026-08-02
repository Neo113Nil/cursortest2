package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013"}, d2 = {"Landroidx/compose/material/ripple/RippleHostMap;", "", "<init>", "()V", "Landroidx/compose/material/ripple/RippleHostKey;", "p0", "Landroidx/compose/material/ripple/RippleHostView;", "p1", "", "getHighSpeedVideoSizes", "(Landroidx/compose/material/ripple/RippleHostKey;Landroidx/compose/material/ripple/RippleHostView;)V", "Camera2StreamConfigurationMap", "(Landroidx/compose/material/ripple/RippleHostKey;)Landroidx/compose/material/ripple/RippleHostView;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/material/ripple/RippleHostView;)Landroidx/compose/material/ripple/RippleHostKey;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/material/ripple/RippleHostKey;)V", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RippleHostMap {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<androidx.compose.material.ripple.RippleHostKey, androidx.compose.material.ripple.RippleHostView> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<androidx.compose.material.ripple.RippleHostView, androidx.compose.material.ripple.RippleHostKey> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

    public final void getHighSpeedVideoSizes(androidx.compose.material.ripple.RippleHostKey p0, androidx.compose.material.ripple.RippleHostView p1) {
        this.getHighSpeedVideoSizes.put(p0, p1);
        this.getHighSpeedVideoFpsRanges.put(p1, p0);
    }

    public final androidx.compose.material.ripple.RippleHostView Camera2StreamConfigurationMap(androidx.compose.material.ripple.RippleHostKey p0) {
        return this.getHighSpeedVideoSizes.get(p0);
    }

    public final androidx.compose.material.ripple.RippleHostKey getHighSpeedVideoFpsRangesFor(androidx.compose.material.ripple.RippleHostView p0) {
        return this.getHighSpeedVideoFpsRanges.get(p0);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.ripple.RippleHostKey p0) {
        androidx.compose.material.ripple.RippleHostView rippleHostView = this.getHighSpeedVideoSizes.get(p0);
        if (rippleHostView != null) {
            this.getHighSpeedVideoFpsRanges.remove(rippleHostView);
        }
        this.getHighSpeedVideoSizes.remove(p0);
    }
}
