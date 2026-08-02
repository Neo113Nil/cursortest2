package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122'\u0010\u0013\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00100\u0014H\u0000\u001a!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c²\u0006\n\u0010\u0017\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0004X\u008a\u0084\u0002"}, d2 = {"UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset;", "getUnspecifiedSafeOffsetVectorConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "OffsetDisplacementThreshold", "getOffsetDisplacementThreshold", "()J", "J", "MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getMagnifierSpringSpec", "()Landroidx/compose/animation/core/SpringSpec;", "animatedSelectionMagnifier", "Landroidx/compose/ui/Modifier;", "magnifierCenter", "Lkotlin/Function0;", "platformMagnifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedCenter", "rememberAnimatedMagnifierPosition", "Landroidx/compose/runtime/State;", "targetCalculation", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation", "targetValue"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionMagnifierKt {
    private static final long getHighSpeedVideoFpsRanges;
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> getHighSpeedVideoSizes;
    private static final androidx.compose.animation.core.AnimationVector2D getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.AnimationVector2D(Float.NaN, Float.NaN);
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> Camera2StreamConfigurationMap = androidx.compose.animation.core.VectorConvertersKt.TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.foundation.text.selection.SelectionMagnifierKt.$r8$lambda$7sJ4HmTH94fXKsWU7vhkHclgHH0((androidx.compose.ui.geometry.Offset) obj);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.foundation.text.selection.SelectionMagnifierKt.$r8$lambda$_0N27fhgBGXgnwQ9vgCJV7tPnuI((androidx.compose.animation.core.AnimationVector2D) obj);
        }
    });

    static {
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.01f) << 32) | (java.lang.Float.floatToRawIntBits(0.01f) & 4294967295L));
        getHighSpeedVideoFpsRanges = m5744constructorimpl;
        getHighSpeedVideoSizes = new androidx.compose.animation.core.SpringSpec<>(0.0f, 0.0f, androidx.compose.ui.geometry.Offset.m5741boximpl(m5744constructorimpl), 3, null);
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return Camera2StreamConfigurationMap;
    }

    public static final long getOffsetDisplacementThreshold() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> getMagnifierSpringSpec() {
        return getHighSpeedVideoSizes;
    }

    public static final androidx.compose.ui.Modifier animatedSelectionMagnifier(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> function0, final kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>, ? extends androidx.compose.ui.Modifier> function1) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.foundation.text.selection.SelectionMagnifierKt.$r8$lambda$50yFdIIWzgLc7YYTkHiwh2POrh4(kotlin.jvm.functions.Function0.this, function1, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$50yFdIIWzgLc7YYTkHiwh2POrh4(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(759876635);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1589795249, 0, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:73)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.animation.core.Animatable(androidx.compose.ui.geometry.Offset.m5741boximpl(((androidx.compose.ui.geometry.Offset) state.getValue()).m5762unboximpl()), Camera2StreamConfigurationMap, androidx.compose.ui.geometry.Offset.m5741boximpl(getHighSpeedVideoFpsRanges), null, 8, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue2;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        boolean changedInstance = composer.changedInstance(animatable);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(state, animatable, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, 6);
        final androidx.compose.runtime.State asState = animatable.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        boolean changed = composer.changed(asState);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.geometry.Offset m5741boximpl;
                    m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(((androidx.compose.ui.geometry.Offset) androidx.compose.runtime.State.this.getValue()).m5762unboximpl());
                    return m5741boximpl;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.ui.Modifier modifier2 = (androidx.compose.ui.Modifier) function1.invoke((kotlin.jvm.functions.Function0) rememberedValue4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifier2;
    }

    public static /* synthetic */ androidx.compose.animation.core.AnimationVector2D $r8$lambda$7sJ4HmTH94fXKsWU7vhkHclgHH0(androidx.compose.ui.geometry.Offset offset) {
        if ((offset.m5762unboximpl() & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return new androidx.compose.animation.core.AnimationVector2D(java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)));
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Offset $r8$lambda$_0N27fhgBGXgnwQ9vgCJV7tPnuI(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(v1) << 32) | (java.lang.Float.floatToRawIntBits(v2) & 4294967295L)));
    }
}
