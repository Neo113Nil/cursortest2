package androidx.compose.foundation.text.selection;

/* compiled from: SelectionMagnifier.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001aC\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122'\u0010\u0017\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0018H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0002X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c²\u0006\n\u0010\u001b\u001a\u00020\u0002X\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/geometry/Offset;", "getMagnifierSpringSpec", "()Landroidx/compose/animation/core/SpringSpec;", "OffsetDisplacementThreshold", "getOffsetDisplacementThreshold", "()J", "J", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getUnspecifiedSafeOffsetVectorConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "rememberAnimatedMagnifierPosition", "Landroidx/compose/runtime/State;", "targetCalculation", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animatedSelectionMagnifier", "Landroidx/compose/ui/Modifier;", "magnifierCenter", "platformMagnifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedCenter", "foundation_release", "targetValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionMagnifierKt {
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final androidx.compose.animation.core.AnimationVector2D UnspecifiedAnimationVector2D = new androidx.compose.animation.core.AnimationVector2D(Float.NaN, Float.NaN);
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = androidx.compose.animation.core.VectorConvertersKt.TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.geometry.Offset offset) {
            return m1022invokek4lQ0M(offset.getPackedValue());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector2D m1022invokek4lQ0M(long j) {
            androidx.compose.animation.core.AnimationVector2D animationVector2D;
            if (!androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(j)) {
                animationVector2D = androidx.compose.foundation.text.selection.SelectionMagnifierKt.UnspecifiedAnimationVector2D;
                return animationVector2D;
            }
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.geometry.Offset.m1871getXimpl(j), androidx.compose.ui.geometry.Offset.m1872getYimpl(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.geometry.Offset.m1860boximpl(m1023invoketuRUvjQ(animationVector2D));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m1023invoketuRUvjQ(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.geometry.OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });

    static {
        long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = Offset;
        MagnifierSpringSpec = new androidx.compose.animation.core.SpringSpec<>(0.0f, 0.0f, androidx.compose.ui.geometry.Offset.m1860boximpl(Offset), 3, null);
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return UnspecifiedSafeOffsetVectorConverter;
    }

    public static final long getOffsetDisplacementThreshold() {
        return OffsetDisplacementThreshold;
    }

    public static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    public static final androidx.compose.ui.Modifier animatedSelectionMagnifier(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> function0, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>, ? extends androidx.compose.ui.Modifier> function1) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1(function0, function1), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> rememberAnimatedMagnifierPosition(kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset> function0, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1589795249);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberAnimatedMagnifierPosition)77@2973L46,78@3041L208,82@3254L1186:SelectionMagnifier.kt#eksfi3");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.animation.core.Animatable(androidx.compose.ui.geometry.Offset.m1860boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), getUnspecifiedSafeOffsetVectorConverter(), androidx.compose.ui.geometry.Offset.m1860boximpl(getOffsetDisplacementThreshold()), null, 8, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue2;
        androidx.compose.runtime.EffectsKt.LaunchedEffect(kotlin.Unit.INSTANCE, new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(state, animatable, null), composer, 70);
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> asState = animatable.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> state) {
        return state.getValue().getPackedValue();
    }
}
