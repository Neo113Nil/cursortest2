package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0007J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u000eJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "textColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "backgroundColor", "placeholderColor", "error", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "labelColor", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isError", "leadingIconColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trailingIconColor", "indicatorColor", "cursorColor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextFieldColors {
    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> backgroundColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> cursorColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> indicatorColor(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> labelColor(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @kotlin.ReplaceWith(expression = "leadingIconColor(enabled, isError, interactionSource)", imports = {}))
    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> leadingIconColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> placeholderColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> textColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use/implement overload with interactionSource parameter", replaceWith = @kotlin.ReplaceWith(expression = "trailingIconColor(enabled, isError, interactionSource)", imports = {}))
    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trailingIconColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i);

    default androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> leadingIconColor(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1036335134);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1036335134, i, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:123)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> leadingIconColor = leadingIconColor(z, z2, composer, (i & 126) | ((i >> 3) & 896));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return leadingIconColor;
    }

    default androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trailingIconColor(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(454310320);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(454310320, i, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trailingIconColor = trailingIconColor(z, z2, composer, (i & 126) | ((i >> 3) & 896));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return trailingIconColor;
    }
}
