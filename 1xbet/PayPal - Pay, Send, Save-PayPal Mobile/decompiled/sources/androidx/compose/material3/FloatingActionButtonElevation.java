package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "shadowElevation$material3", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tonalElevation-D9Ej5fM$material3", "()F", "tonalElevation", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FloatingActionButtonElevation {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    private FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
        this.getHighSpeedVideoFpsRanges = f3;
        this.getHighSpeedVideoSizes = f4;
    }

    public final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> shadowElevation$material3(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-424810125, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:619)");
        }
        int i2 = i & 126;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1845106002, i2, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:628)");
        }
        int i3 = i & 14;
        int i4 = i3 ^ 6;
        boolean z = (i4 > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material3.FloatingActionButtonElevationAnimatable(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) rememberedValue;
        boolean changedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable);
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(this)) || (i & 48) == 32;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable, this, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(this, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, (i2 >> 3) & 14);
        boolean z3 = (i4 > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        boolean changedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1(interactionSource, floatingActionButtonElevationAnimatable, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(interactionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, i3);
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> asState = floatingActionButtonElevationAnimatable.getHighSpeedVideoSizes.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return asState;
    }

    /* renamed from: tonalElevation-D9Ej5fM$material3, reason: not valid java name and from getter */
    public final float getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.FloatingActionButtonElevation)) {
            return false;
        }
        androidx.compose.material3.FloatingActionButtonElevation floatingActionButtonElevation = (androidx.compose.material3.FloatingActionButtonElevation) other;
        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, floatingActionButtonElevation.Camera2StreamConfigurationMap) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, floatingActionButtonElevation.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, floatingActionButtonElevation.getHighSpeedVideoFpsRanges)) {
            return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes, floatingActionButtonElevation.getHighSpeedVideoSizes);
        }
        return false;
    }

    public int hashCode() {
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap);
        return (((((m8607hashCodeimpl * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges)) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public /* synthetic */ FloatingActionButtonElevation(float f, float f2, float f3, float f4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}
