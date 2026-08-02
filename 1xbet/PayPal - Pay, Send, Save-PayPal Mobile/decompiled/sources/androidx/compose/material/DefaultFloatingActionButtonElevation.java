package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015"}, d2 = {"Landroidx/compose/material/DefaultFloatingActionButtonElevation;", "Landroidx/compose/material/FloatingActionButtonElevation;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/runtime/State;", "elevation", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation implements androidx.compose.material.FloatingActionButtonElevation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    private DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRanges = f2;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getHighSpeedVideoSizes = f4;
    }

    @Override // androidx.compose.material.FloatingActionButtonElevation
    public final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> elevation(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-478475335);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-478475335, i, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.FloatingActionButtonElevationAnimatable(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (androidx.compose.material.FloatingActionButtonElevationAnimatable) rememberedValue;
        boolean changedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable);
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(this)) || (i & 48) == 32;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1(floatingActionButtonElevationAnimatable, this, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(this, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, (i >> 3) & 14);
        boolean z3 = (i3 > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        boolean changedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1(interactionSource, floatingActionButtonElevationAnimatable, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, i2);
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> asState = floatingActionButtonElevationAnimatable.getHighResolutionOutputSizeshNQ4ISI.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asState;
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.material.DefaultFloatingActionButtonElevation)) {
            return false;
        }
        androidx.compose.material.DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (androidx.compose.material.DefaultFloatingActionButtonElevation) p0;
        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, defaultFloatingActionButtonElevation.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, defaultFloatingActionButtonElevation.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, defaultFloatingActionButtonElevation.getHighSpeedVideoFpsRangesFor)) {
            return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes, defaultFloatingActionButtonElevation.getHighSpeedVideoSizes);
        }
        return false;
    }

    public final int hashCode() {
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        return (((((m8607hashCodeimpl * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}
