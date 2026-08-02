package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/compose/ui/layout/WindowInsetsRulersImpl;", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "getAnimation", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/WindowInsetsAnimation;", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/RectRulers;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/RectRulers;", "getCurrent", "()Landroidx/compose/ui/layout/RectRulers;", "getHighSpeedVideoFpsRangesFor", "getMaximum", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WindowInsetsRulersImpl implements androidx.compose.ui.layout.WindowInsetsRulers {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.RectRulers Camera2StreamConfigurationMap;
    private final androidx.compose.ui.layout.RectRulers getHighSpeedVideoSizes;

    public WindowInsetsRulersImpl(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = androidx.compose.ui.layout.RectRulersKt.RectRulers(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" maximum");
        this.Camera2StreamConfigurationMap = androidx.compose.ui.layout.RectRulersKt.RectRulers(sb.toString());
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    /* renamed from: getCurrent, reason: from getter */
    public final androidx.compose.ui.layout.RectRulers getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    /* renamed from: getMaximum, reason: from getter */
    public final androidx.compose.ui.layout.RectRulers getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public final androidx.compose.ui.layout.WindowInsetsAnimation getAnimation(androidx.compose.ui.layout.Placeable.PlacementScope p0) {
        return androidx.compose.ui.layout.WindowInsetsRulers_androidKt.findInsetsAnimationProperties(p0, this);
    }

    /* renamed from: toString, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
