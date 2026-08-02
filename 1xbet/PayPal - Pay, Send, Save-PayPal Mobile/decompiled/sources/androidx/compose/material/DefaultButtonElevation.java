package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010"}, d2 = {"Landroidx/compose/material/DefaultButtonElevation;", "Landroidx/compose/material/ButtonElevation;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "p4", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/runtime/State;", "elevation", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultButtonElevation implements androidx.compose.material.ButtonElevation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    private DefaultButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getHighSpeedVideoSizes = f4;
        this.getHighResolutionOutputSizeshNQ4ISI = f5;
    }

    @Override // androidx.compose.material.ButtonElevation
    public final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> elevation(boolean z, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        float f;
        composer.startReplaceGroup(-1588756907);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1588756907, i, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:500)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i & 48) == 32;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material.DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, (i >> 3) & 14);
        androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) snapshotStateList);
        if (!z) {
            f = this.getHighSpeedVideoFpsRangesFor;
        } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            f = this.Camera2StreamConfigurationMap;
        } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            f = this.getHighSpeedVideoSizes;
        } else {
            f = interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus ? this.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoFpsRanges;
        }
        float f2 = f;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.compose.animation.core.Animatable(androidx.compose.ui.unit.Dp.m8599boximpl(f2), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), null, null, 12, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
        androidx.compose.ui.unit.Dp m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(f2);
        boolean changedInstance = composer.changedInstance(animatable);
        boolean changed = composer.changed(f2);
        boolean z4 = (((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean changedInstance2 = composer.changedInstance(interaction);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changedInstance | changed | z4 | z2 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (kotlin.jvm.functions.Function2) new androidx.compose.material.DefaultButtonElevation$elevation$2$1(animatable, f2, z, this, interaction, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(m8599boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer, 0);
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> asState = animatable.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asState;
    }

    public /* synthetic */ DefaultButtonElevation(float f, float f2, float f3, float f4, float f5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }
}
