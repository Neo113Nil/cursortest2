package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018"}, d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "shadowElevation$material3", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonElevation {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    private ButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighSpeedVideoSizes = f3;
        this.getHighSpeedVideoFpsRanges = f4;
        this.getHighSpeedVideoFpsRangesFor = f5;
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> shadowElevation$material3(boolean z, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        float f;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2045116089, i, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:939)");
        }
        int i2 = i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1312510462, i2, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:947)");
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
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.ButtonElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, (i2 >> 3) & 14);
        androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) snapshotStateList);
        if (!z) {
            f = this.getHighSpeedVideoFpsRangesFor;
        } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            f = this.Camera2StreamConfigurationMap;
        } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            f = this.getHighSpeedVideoFpsRanges;
        } else {
            f = interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus ? this.getHighSpeedVideoSizes : this.getHighResolutionOutputSizeshNQ4ISI;
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
            rememberedValue4 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.ButtonElevation$animateElevation$2$1(animatable, f2, z, this, interaction, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(m8599boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer, 0);
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> asState = animatable.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return asState;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.ButtonElevation)) {
            return false;
        }
        androidx.compose.material3.ButtonElevation buttonElevation = (androidx.compose.material3.ButtonElevation) other;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, buttonElevation.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, buttonElevation.Camera2StreamConfigurationMap) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes, buttonElevation.getHighSpeedVideoSizes) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, buttonElevation.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, buttonElevation.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        int m8607hashCodeimpl2 = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap);
        return (((((((m8607hashCodeimpl * 31) + m8607hashCodeimpl2) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoSizes)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public /* synthetic */ ButtonElevation(float f, float f2, float f3, float f4, float f5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }
}
