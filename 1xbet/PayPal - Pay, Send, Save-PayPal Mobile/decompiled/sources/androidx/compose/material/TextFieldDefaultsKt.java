package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0004X\u008a\u0084\u0002"}, d2 = {"animateBorderStrokeAsState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "focusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material", "focused"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaultsKt {
    /* renamed from: access$animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m2819access$animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material.TextFieldColors textFieldColors, float f, float f2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> rememberUpdatedState;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1097899920, i, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:955)");
        }
        androidx.compose.runtime.State<java.lang.Boolean> collectIsFocusedAsState = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> indicatorColor = textFieldColors.indicatorColor(z, z2, interactionSource, composer, i & 8190);
        float f3 = !collectIsFocusedAsState.getValue().booleanValue() ? f2 : f;
        if (z) {
            composer.startReplaceGroup(1361082574);
            rememberUpdatedState = androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(f3, androidx.compose.animation.core.AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1361186796);
            rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(androidx.compose.ui.unit.Dp.m8599boximpl(f2), composer, (i >> 15) & 14);
            composer.endReplaceGroup();
        }
        androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(new androidx.compose.foundation.BorderStroke(rememberUpdatedState.getValue().m8615unboximpl(), new androidx.compose.ui.graphics.SolidColor(indicatorColor.getValue().m6006unboximpl(), null), null), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState2;
    }
}
