package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0019\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001b"}, d2 = {"Landroidx/compose/ui/layout/InnermostAnimationProperties;", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "p0", "", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "p1", "<init>", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;[Landroidx/compose/ui/layout/WindowInsetsRulers;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getHighResolutionOutputSizeshNQ4ISI", "[Landroidx/compose/ui/layout/WindowInsetsRulers;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/RectRulers;", "getSource", "()Landroidx/compose/ui/layout/RectRulers;", "getHighSpeedVideoFpsRangesFor", "getTarget", "", "isVisible", "()Z", "getHighSpeedVideoSizes", "isAnimating", "getHighSpeedVideoSizesFor", "", "getFraction", "()F", "getInputFormats", "", "getDurationMillis", "()J", "getInputSizeshNQ4ISI", "getAlpha", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InnermostAnimationProperties implements androidx.compose.ui.layout.WindowInsetsAnimation {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.WindowInsetsRulers[] Camera2StreamConfigurationMap;
    private final androidx.compose.ui.layout.Placeable.PlacementScope getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getAlpha() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final long getDurationMillis() {
        return 0L;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getFraction() {
        return 0.0f;
    }

    public InnermostAnimationProperties(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.WindowInsetsRulers[] windowInsetsRulersArr) {
        this.getHighSpeedVideoFpsRanges = placementScope;
        this.Camera2StreamConfigurationMap = windowInsetsRulersArr;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final androidx.compose.ui.layout.RectRulers getSource() {
        return androidx.compose.ui.layout.WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final androidx.compose.ui.layout.RectRulers getTarget() {
        return androidx.compose.ui.layout.WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isVisible() {
        for (androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers : this.Camera2StreamConfigurationMap) {
            if (windowInsetsRulers.getAnimation(this.getHighSpeedVideoFpsRanges).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isAnimating() {
        for (androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers : this.Camera2StreamConfigurationMap) {
            if (windowInsetsRulers.getAnimation(this.getHighSpeedVideoFpsRanges).isAnimating()) {
                return true;
            }
        }
        return false;
    }
}
