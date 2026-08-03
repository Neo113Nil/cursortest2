package androidx.compose.material;

/* compiled from: TextFieldDefaults.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"animateBorderStrokeAsState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "focusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaultsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.foundation.BorderStroke> m1566animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material.TextFieldColors textFieldColors, float f, float f2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.State rememberUpdatedState;
        composer.startReplaceableGroup(1097899920);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateBorderStrokeAsState)P(1,4,3!1,2:c#ui.unit.Dp,5:c#ui.unit.Dp)842@38066L25,843@38124L51,850@38481L107:TextFieldDefaults.kt#jmzs0o");
        androidx.compose.runtime.State<java.lang.Boolean> collectIsFocusedAsState = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> indicatorColor = textFieldColors.indicatorColor(z, z2, interactionSource, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168));
        float f3 = m1567animateBorderStrokeAsState_NuRrP5Q$lambda0(collectIsFocusedAsState) ? f : f2;
        if (z) {
            composer.startReplaceableGroup(1685712037);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "846@38319L76");
            rememberUpdatedState = androidx.compose.animation.core.AnimateAsStateKt.m118animateDpAsStateKz89ssw(f3, androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.compose.material.TextFieldImplKt.AnimationDuration, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1685712135);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "848@38417L46");
            rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.unit.Dp.m4476boximpl(f2), composer, (i >> 15) & 14);
            composer.endReplaceableGroup();
        }
        androidx.compose.runtime.State<androidx.compose.foundation.BorderStroke> rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(new androidx.compose.foundation.BorderStroke(((androidx.compose.ui.unit.Dp) rememberUpdatedState.getValue()).m4492unboximpl(), new androidx.compose.ui.graphics.SolidColor(indicatorColor.getValue().m2123unboximpl(), null), null), composer, 0);
        composer.endReplaceableGroup();
        return rememberUpdatedState2;
    }

    /* renamed from: animateBorderStrokeAsState_NuRrP5Q$lambda-0, reason: not valid java name */
    private static final boolean m1567animateBorderStrokeAsState_NuRrP5Q$lambda0(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }
}
