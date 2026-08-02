package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material/CheckboxColors;", "", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "checkmarkColor", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "enabled", "boxColor", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderColor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CheckboxColors {
    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> borderColor(boolean z, androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> boxColor(boolean z, androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> checkmarkColor(androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.runtime.Composer composer, int i);
}
