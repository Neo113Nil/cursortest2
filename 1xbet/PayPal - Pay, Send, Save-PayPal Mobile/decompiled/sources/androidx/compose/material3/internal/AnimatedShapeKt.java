package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/shape/RoundedCornerShape;", "currentShape", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "Landroidx/compose/ui/graphics/Shape;", "rememberAnimatedShape", "(Landroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedShapeKt {
    public static final androidx.compose.ui.graphics.Shape rememberAnimatedShape(final androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-288714613, i, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:131)");
        }
        boolean changed = composer.changed(finiteAnimationSpec);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material3.internal.AnimatedShapeState(roundedCornerShape, finiteAnimationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.material3.internal.AnimatedShapeState animatedShapeState = (androidx.compose.material3.internal.AnimatedShapeState) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final kotlinx.coroutines.channels.Channel channel = (kotlinx.coroutines.channels.Channel) rememberedValue2;
        boolean changedInstance = composer.changedInstance(channel);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(roundedCornerShape)) || (i & 6) == 4;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((z | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AnimatedShapeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.internal.AnimatedShapeKt.m4273$r8$lambda$dxpM81v9PfSd9xou_3J8FBS_Xw(kotlinx.coroutines.channels.Channel.this, roundedCornerShape);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue3, composer, 0);
        boolean changedInstance2 = composer.changedInstance(channel);
        boolean changed2 = composer.changed(animatedShapeState);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1(channel, animatedShapeState, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(animatedShapeState, channel, (kotlin.jvm.functions.Function2) rememberedValue4, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1383367813, 0, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:89)");
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        animatedShapeState.setDensity(density);
        boolean changed3 = composer.changed(density);
        boolean changed4 = composer.changed(animatedShapeState);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changed3 | changed4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new androidx.compose.material3.ShapeWithHorizontalCenterOptically() { // from class: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$1$1

                /* renamed from: clampedRange$delegate, reason: from kotlin metadata */
                private final androidx.compose.runtime.MutableState clampedRange = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f), null, 2, null);

                public final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getClampedRange() {
                    return (kotlin.ranges.ClosedFloatingPointRange) this.clampedRange.getValue();
                }

                public final void setClampedRange(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange) {
                    this.clampedRange.setValue(closedFloatingPointRange);
                }

                @Override // androidx.compose.material3.ShapeWithHorizontalCenterOptically
                public final float offset() {
                    float floatValue = ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4277topStartTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue();
                    float floatValue2 = ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4276topEndTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue();
                    return (((floatValue + ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4275bottomStartTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f) - ((floatValue2 + ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4274bottomEndTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f)) * 0.11f;
                }

                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density2) {
                    androidx.compose.material3.internal.AnimatedShapeState.this.m4281setSizeuvyYCjk(size);
                    setClampedRange(kotlin.ranges.RangesKt.rangeTo(0.0f, java.lang.Float.intBitsToFloat((int) (4294967295L & size)) / 2.0f));
                    return androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape(((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4277topStartTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue(), ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4276topEndTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue(), ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4274bottomEndTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue(), ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(androidx.compose.material3.internal.AnimatedShapeState.m4275bottomStartTmRCtEA$default(androidx.compose.material3.internal.AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue()).mo1334createOutlinePq9zytI(size, layoutDirection, density2);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$1$1 animatedShapeKt$rememberAnimatedShape$1$1 = (androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$1$1) rememberedValue5;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$1$1 animatedShapeKt$rememberAnimatedShape$1$12 = animatedShapeKt$rememberAnimatedShape$1$1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animatedShapeKt$rememberAnimatedShape$1$12;
    }

    /* renamed from: $r8$lambda$d-xpM81v9PfSd9xou_3J8FBS_Xw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4273$r8$lambda$dxpM81v9PfSd9xou_3J8FBS_Xw(kotlinx.coroutines.channels.Channel channel, androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape) {
        channel.mo9266trySendJP2dKIU(roundedCornerShape);
        return kotlin.Unit.INSTANCE;
    }
}
