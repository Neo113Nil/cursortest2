package androidx.compose.material;

/* compiled from: TextFieldDefaults.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0006H'ø\u0001\u0000¢\u0006\u0002\u0010\u0007J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH'ø\u0001\u0000¢\u0006\u0002\u0010\rJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH'ø\u0001\u0000¢\u0006\u0002\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H'ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000¢\u0006\u0002\u0010\u0007J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H'ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "backgroundColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "cursorColor", "isError", "indicatorColor", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "error", "leadingIconColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "placeholderColor", com.helpshift.proactive.InAppViewConstants.TEXT_COLOR, "trailingIconColor", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextFieldColors {
    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> backgroundColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> cursorColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> indicatorColor(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> labelColor(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> leadingIconColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> placeholderColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> textColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trailingIconColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i);
}
