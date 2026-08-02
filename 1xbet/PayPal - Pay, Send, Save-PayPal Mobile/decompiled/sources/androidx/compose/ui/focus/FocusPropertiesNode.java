package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "p0", "<init>", "(Landroidx/compose/ui/focus/FocusPropertiesScope;)V", "Landroidx/compose/ui/focus/FocusProperties;", "", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusPropertiesNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.focus.FocusPropertiesModifierNode {
    private androidx.compose.ui.focus.FocusPropertiesScope Camera2StreamConfigurationMap;

    public FocusPropertiesNode(androidx.compose.ui.focus.FocusPropertiesScope focusPropertiesScope) {
        this.Camera2StreamConfigurationMap = focusPropertiesScope;
    }

    public final void getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusPropertiesScope focusPropertiesScope) {
        this.Camera2StreamConfigurationMap = focusPropertiesScope;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(androidx.compose.ui.focus.FocusProperties p0) {
        this.Camera2StreamConfigurationMap.apply(p0);
    }
}
