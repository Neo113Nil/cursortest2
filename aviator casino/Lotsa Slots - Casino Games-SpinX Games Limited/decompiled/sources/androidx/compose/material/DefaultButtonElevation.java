package androidx.compose.material;

/* compiled from: Button.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\bJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/DefaultButtonElevation;", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "elevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultButtonElevation implements androidx.compose.material.ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ DefaultButtonElevation(float f, float f2, float f3, float f4, float f5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    private DefaultButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.disabledElevation = f3;
        this.hoveredElevation = f4;
        this.focusedElevation = f5;
    }

    @Override // androidx.compose.material.ButtonElevation
    public androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> elevation(boolean z, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        float f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1588756907);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(elevation)503@20460L46,504@20515L1111,545@22075L51:Button.kt#jmzs0o");
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
        androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, new androidx.compose.material.DefaultButtonElevation$elevation$1(interactionSource, snapshotStateList, null), composer, (i >> 3) & 14);
        androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) snapshotStateList);
        if (!z) {
            f = this.disabledElevation;
        } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            f = this.pressedElevation;
        } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            f = this.hoveredElevation;
        } else {
            f = interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        }
        float f2 = f;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.animation.core.Animatable(androidx.compose.ui.unit.Dp.m4476boximpl(f2), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), null, 4, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue2;
        if (!z) {
            composer.startReplaceableGroup(-1598807481);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "549@22225L80");
            androidx.compose.runtime.EffectsKt.LaunchedEffect(androidx.compose.ui.unit.Dp.m4476boximpl(f2), new androidx.compose.material.DefaultButtonElevation$elevation$2(animatable, f2, null), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1598807310);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "553@22335L546");
            androidx.compose.runtime.EffectsKt.LaunchedEffect(androidx.compose.ui.unit.Dp.m4476boximpl(f2), new androidx.compose.material.DefaultButtonElevation$elevation$3(animatable, this, f2, interaction, null), composer, 0);
            composer.endReplaceableGroup();
        }
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> asState = animatable.asState();
        composer.endReplaceableGroup();
        return asState;
    }
}
