package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "shadowElevation$material3", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "p0", "p1", "getHighSpeedVideoFpsRanges", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardElevation {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    private CardElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.Camera2StreamConfigurationMap = f3;
        this.getHighSpeedVideoFpsRanges = f4;
        this.getHighSpeedVideoSizes = f5;
        this.getOutputFormats = f6;
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> shadowElevation$material3(boolean z, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1763481333);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1763481333, i, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:655)");
        }
        if (interactionSource == null) {
            composer.startReplaceGroup(167751211);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(this.getHighResolutionOutputSizeshNQ4ISI), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return mutableState;
        }
        composer.startReplaceGroup(167824247);
        composer.endReplaceGroup();
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(z, interactionSource, composer, i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return highSpeedVideoFpsRanges;
    }

    private final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getHighSpeedVideoFpsRanges(boolean z, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        float f;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1421890746, i, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:666)");
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
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.CardElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, (i >> 3) & 14);
        androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) snapshotStateList);
        if (!z) {
            f = this.getOutputFormats;
        } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            f = this.getHighSpeedVideoFpsRangesFor;
        } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
            f = this.getHighSpeedVideoFpsRanges;
        } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
            f = this.Camera2StreamConfigurationMap;
        } else {
            f = interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start ? this.getHighSpeedVideoSizes : this.getHighResolutionOutputSizeshNQ4ISI;
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
            rememberedValue4 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.CardElevation$animateElevation$2$1(animatable, f2, z, this, interaction, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(m8599boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer, 0);
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> asState = animatable.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return asState;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.CardElevation)) {
            return false;
        }
        androidx.compose.material3.CardElevation cardElevation = (androidx.compose.material3.CardElevation) other;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, cardElevation.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, cardElevation.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, cardElevation.Camera2StreamConfigurationMap) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, cardElevation.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getOutputFormats, cardElevation.getOutputFormats);
    }

    public final int hashCode() {
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        int m8607hashCodeimpl2 = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        return (((((((m8607hashCodeimpl * 31) + m8607hashCodeimpl2) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getOutputFormats);
    }

    public /* synthetic */ CardElevation(float f, float f2, float f3, float f4, float f5, float f6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }
}
