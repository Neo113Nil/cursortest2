package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\u0004\u001a\"\u0010\u0005\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\bH\u0007\u001a\"\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0007\u001a;\u0010\f\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r0\u000fH\u0007\u001a;\u0010\u0014\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r0\u000fH\u0007\u001a3\u0010\u0016\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010 \u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020!0\u00072\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&\u001a3\u0010'\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020!0\u00072\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0004\b)\u0010*\u001aQ\u0010+\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00100\u000fH\u0007\u001aQ\u00100\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00100\u000fH\u0007\u001aQ\u00103\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010,\u001a\u0002042\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001aQ\u00108\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010,\u001a\u0002092\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010:\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001aQ\u0010<\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u00101\u001a\u0002042\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010=\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001aQ\u0010>\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u00101\u001a\u0002092\b\b\u0002\u0010.\u001a\u00020$2#\b\u0002\u0010?\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010@\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010B\u001a\u00020\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010C\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010D\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010E\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a=\u0010F\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00072#\b\u0002\u0010G\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002060\u000fH\u0007\u001a\f\u0010H\u001a\u00020-*\u000204H\u0002\u001a\f\u0010H\u001a\u00020-*\u000209H\u0002\u001a,\u0010I\u001a\u0004\u0018\u0001HJ\"\b\b\u0000\u0010J*\u00020\u0003*\u00020\u00012\f\u0010K\u001a\b\u0012\u0004\u0012\u0002HJ0LH\u0080\u0002¢\u0006\u0002\u0010M\u001a,\u0010I\u001a\u0004\u0018\u0001HJ\"\b\b\u0000\u0010J*\u00020\u0003*\u00020\u00042\f\u0010K\u001a\b\u0012\u0004\u0012\u0002HJ0LH\u0080\u0002¢\u0006\u0002\u0010N\u001a?\u0010O\u001a\u00020P*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u00042\u000e\b\u0002\u0010U\u001a\b\u0012\u0004\u0012\u00020$0V2\u0006\u0010W\u001a\u00020XH\u0001¢\u0006\u0002\u0010Y\u001a\u001f\u0010Z\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010[\u001a\u001f\u0010\\\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010T\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010]\u001a/\u0010^\u001a\u00020_*\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u00042\u0006\u0010W\u001a\u00020XH\u0003¢\u0006\u0002\u0010`\"\u001a\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020c0bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020!0eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00100eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i²\u0006\n\u0010j\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010k\u001a\u00020\u0004X\u008a\u008e\u0002"}, d2 = {"withEffect", "Landroidx/compose/animation/EnterTransition;", "effect", "Landroidx/compose/animation/TransitionEffect;", "Landroidx/compose/animation/ExitTransition;", "fadeIn", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "initialAlpha", "fadeOut", "targetAlpha", "slideIn", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "slideOut", "targetOffset", "scaleIn", "initialScale", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "unveilIn", "Landroidx/compose/ui/graphics/Color;", "initialColor", "matchParentSize", "", "unveilIn-bw27NRU", "(Landroidx/compose/animation/core/FiniteAnimationSpec;JZ)Landroidx/compose/animation/EnterTransition;", "veilOut", "targetColor", "veilOut-bw27NRU", "(Landroidx/compose/animation/core/FiniteAnimationSpec;JZ)Landroidx/compose/animation/ExitTransition;", "expandIn", "expandFrom", "Landroidx/compose/ui/Alignment;", "clip", "initialSize", "shrinkOut", "shrinkTowards", "targetSize", "expandHorizontally", "Landroidx/compose/ui/Alignment$Horizontal;", "initialWidth", "", "fullWidth", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "shrinkHorizontally", "targetWidth", "shrinkVertically", "targetHeight", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "toAlignment", "get", "T", "key", "Landroidx/compose/animation/TransitionEffectKey;", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "createModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "isEnabled", "Lkotlin/Function0;", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "createGraphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultColorAnimationSpec", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "animation", "activeEnter", "activeExit"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.TransformOrigin, androidx.compose.animation.core.AnimationVector2D> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.VectorConvertersKt.TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.TransformOrigin, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.graphics.TransformOrigin transformOrigin) {
            return getHighSpeedVideoSizes(transformOrigin.getGetHighSpeedVideoFpsRanges());
        }

        public final androidx.compose.animation.core.AnimationVector2D getHighSpeedVideoSizes(long j) {
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.graphics.TransformOrigin.m6373getPivotFractionXimpl(j), androidx.compose.ui.graphics.TransformOrigin.m6374getPivotFractionYimpl(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.graphics.TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ androidx.compose.ui.graphics.TransformOrigin invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(getHighSpeedVideoSizes(animationVector2D));
        }

        public final long getHighSpeedVideoSizes(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.graphics.Color> getHighSpeedVideoFpsRangesFor = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> getHighSpeedVideoFpsRanges = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);

    public static final androidx.compose.animation.EnterTransition withEffect(androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.TransitionEffect transitionEffect) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, null, null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(transitionEffect.getKey$animation(), transitionEffect)), 63, null));
    }

    public static final androidx.compose.animation.ExitTransition withEffect(androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.TransitionEffect transitionEffect) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, null, null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(transitionEffect.getKey$animation(), transitionEffect)), 63, null));
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition fadeIn$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    public static final androidx.compose.animation.EnterTransition fadeIn(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, float f) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(new androidx.compose.animation.Fade(f, finiteAnimationSpec), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition fadeOut$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    public static final androidx.compose.animation.ExitTransition fadeOut(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, float f) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(new androidx.compose.animation.Fade(f, finiteAnimationSpec), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition slideIn$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.EnterTransition slideIn(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> function1) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, new androidx.compose.animation.Slide(function1, finiteAnimationSpec), null, null, null, false, null, 125, null));
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition slideOut$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.ExitTransition slideOut(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> function1) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, new androidx.compose.animation.Slide(function1, finiteAnimationSpec), null, null, null, false, null, 125, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.EnterTransition m1127scaleInL8ZKhE$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();
        }
        return m1126scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final androidx.compose.animation.EnterTransition m1126scaleInL8ZKhE(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, float f, long j) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, new androidx.compose.animation.Scale(f, j, finiteAnimationSpec, null), null, false, null, 119, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.ExitTransition m1129scaleOutL8ZKhE$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();
        }
        return m1128scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final androidx.compose.animation.ExitTransition m1128scaleOutL8ZKhE(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, float f, long j) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, new androidx.compose.animation.Scale(f, j, finiteAnimationSpec, null), null, false, null, 119, null));
    }

    /* renamed from: unveilIn-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.EnterTransition m1131unveilInbw27NRU$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            j = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m1130unveilInbw27NRU(finiteAnimationSpec, j, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: unveilIn-bw27NRU, reason: not valid java name */
    public static final androidx.compose.animation.EnterTransition m1130unveilInbw27NRU(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec, long j, boolean z) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, null, new androidx.compose.animation.Veil(j, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), finiteAnimationSpec, z, null), false, 0 == true ? 1 : 0, 111, null));
    }

    /* renamed from: veilOut-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.ExitTransition m1133veilOutbw27NRU$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            j = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m1132veilOutbw27NRU(finiteAnimationSpec, j, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: veilOut-bw27NRU, reason: not valid java name */
    public static final androidx.compose.animation.ExitTransition m1132veilOutbw27NRU(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec, long j, boolean z) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, null, new androidx.compose.animation.Veil(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j, finiteAnimationSpec, z, null), false, 0 == true ? 1 : 0, 111, null));
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition expandIn$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                    return androidx.compose.ui.unit.IntSize.m8764boximpl(getHighSpeedVideoSizes(intSize.m8776unboximpl()));
                }

                public final long getHighSpeedVideoSizes(long j) {
                    return androidx.compose.ui.unit.IntSize.m8767constructorimpl(0L);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    public static final androidx.compose.animation.EnterTransition expandIn(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> function1) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, new androidx.compose.animation.ChangeSize(alignment, function1, finiteAnimationSpec, z), null, null, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null));
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition shrinkOut$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                    return androidx.compose.ui.unit.IntSize.m8764boximpl(getHighSpeedVideoFpsRanges(intSize.m8776unboximpl()));
                }

                public final long getHighSpeedVideoFpsRanges(long j) {
                    return androidx.compose.ui.unit.IntSize.m8767constructorimpl(0L);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    public static final androidx.compose.animation.ExitTransition shrinkOut(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> function1) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, null, new androidx.compose.animation.ChangeSize(alignment, function1, finiteAnimationSpec, z), null, null, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null));
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition expandHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = androidx.compose.ui.Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                public final java.lang.Integer getHighSpeedVideoFpsRanges(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighSpeedVideoFpsRanges(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final androidx.compose.animation.EnterTransition expandHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return expandIn(finiteAnimationSpec, Camera2StreamConfigurationMap(horizontal), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m8764boximpl(getHighSpeedVideoSizes(intSize.m8776unboximpl()));
            }

            public final long getHighSpeedVideoSizes(long j) {
                return androidx.compose.ui.unit.IntSize.m8767constructorimpl((((int) (j & 4294967295L)) & 4294967295L) | (function1.invoke(java.lang.Integer.valueOf((int) (j >> 32))).intValue() << 32));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition expandVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = androidx.compose.ui.Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                public final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighResolutionOutputSizeshNQ4ISI(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final androidx.compose.animation.EnterTransition expandVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return expandIn(finiteAnimationSpec, getHighSpeedVideoFpsRanges(vertical), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m8764boximpl(getHighSpeedVideoFpsRangesFor(intSize.m8776unboximpl()));
            }

            public final long getHighSpeedVideoFpsRangesFor(long j) {
                return androidx.compose.ui.unit.IntSize.m8767constructorimpl((function1.invoke(java.lang.Integer.valueOf((int) (j & 4294967295L))).intValue() & 4294967295L) | (((int) (j >> 32)) << 32));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition shrinkHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = androidx.compose.ui.Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                public final java.lang.Integer getHighSpeedVideoFpsRanges(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighSpeedVideoFpsRanges(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final androidx.compose.animation.ExitTransition shrinkHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return shrinkOut(finiteAnimationSpec, Camera2StreamConfigurationMap(horizontal), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m8764boximpl(getHighResolutionOutputSizeshNQ4ISI(intSize.m8776unboximpl()));
            }

            public final long getHighResolutionOutputSizeshNQ4ISI(long j) {
                return androidx.compose.ui.unit.IntSize.m8767constructorimpl((((int) (j & 4294967295L)) & 4294967295L) | (function1.invoke(java.lang.Integer.valueOf((int) (j >> 32))).intValue() << 32));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition shrinkVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = androidx.compose.ui.Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                public final java.lang.Integer Camera2StreamConfigurationMap(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return Camera2StreamConfigurationMap(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final androidx.compose.animation.ExitTransition shrinkVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return shrinkOut(finiteAnimationSpec, getHighSpeedVideoFpsRanges(vertical), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m8764boximpl(getHighSpeedVideoFpsRangesFor(intSize.m8776unboximpl()));
            }

            public final long getHighSpeedVideoFpsRangesFor(long j) {
                return androidx.compose.ui.unit.IntSize.m8767constructorimpl((function1.invoke(java.lang.Integer.valueOf((int) (j & 4294967295L))).intValue() & 4294967295L) | (((int) (j >> 32)) << 32));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition slideInHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                public final java.lang.Integer Camera2StreamConfigurationMap(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return Camera2StreamConfigurationMap(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.EnterTransition slideInHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideIn(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m8720boximpl(getHighResolutionOutputSizeshNQ4ISI(intSize.m8776unboximpl()));
            }

            public final long getHighResolutionOutputSizeshNQ4ISI(long j) {
                return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(function1.invoke(java.lang.Integer.valueOf((int) (j >> 32))).intValue() << 32);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition slideInVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                public final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighResolutionOutputSizeshNQ4ISI(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.EnterTransition slideInVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideIn(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m8720boximpl(getHighResolutionOutputSizeshNQ4ISI(intSize.m8776unboximpl()));
            }

            public final long getHighResolutionOutputSizeshNQ4ISI(long j) {
                return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(function1.invoke(java.lang.Integer.valueOf((int) (j & 4294967295L))).intValue() & 4294967295L);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition slideOutHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                public final java.lang.Integer getHighSpeedVideoFpsRangesFor(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighSpeedVideoFpsRangesFor(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.ExitTransition slideOutHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideOut(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m8720boximpl(getHighSpeedVideoSizes(intSize.m8776unboximpl()));
            }

            public final long getHighSpeedVideoSizes(long j) {
                return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(function1.invoke(java.lang.Integer.valueOf((int) (j >> 32))).intValue() << 32);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition slideOutVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                public final java.lang.Integer getHighSpeedVideoSizes(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return getHighSpeedVideoSizes(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.ExitTransition slideOutVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideOut(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m8720boximpl(getHighSpeedVideoSizes(intSize.m8776unboximpl()));
            }

            public final long getHighSpeedVideoSizes(long j) {
                return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(function1.invoke(java.lang.Integer.valueOf((int) (j & 4294967295L))).intValue() & 4294967295L);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    private static final androidx.compose.ui.Alignment Camera2StreamConfigurationMap(androidx.compose.ui.Alignment.Horizontal horizontal) {
        return kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getStart()) ? androidx.compose.ui.Alignment.INSTANCE.getCenterStart() : kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getEnd()) ? androidx.compose.ui.Alignment.INSTANCE.getCenterEnd() : androidx.compose.ui.Alignment.INSTANCE.getCenter();
    }

    private static final androidx.compose.ui.Alignment getHighSpeedVideoFpsRanges(androidx.compose.ui.Alignment.Vertical vertical) {
        return kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.ui.Alignment.INSTANCE.getTop()) ? androidx.compose.ui.Alignment.INSTANCE.getTopCenter() : kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.ui.Alignment.INSTANCE.getBottom()) ? androidx.compose.ui.Alignment.INSTANCE.getBottomCenter() : androidx.compose.ui.Alignment.INSTANCE.getCenter();
    }

    public static final <T extends androidx.compose.animation.TransitionEffect> T get(androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.TransitionEffectKey<T> transitionEffectKey) {
        androidx.compose.animation.TransitionEffect transitionEffect = enterTransition.getCamera2StreamConfigurationMap().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof androidx.compose.animation.TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    public static final <T extends androidx.compose.animation.TransitionEffect> T get(androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.TransitionEffectKey<T> transitionEffectKey) {
        androidx.compose.animation.TransitionEffect transitionEffect = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof androidx.compose.animation.TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    public static final androidx.compose.animation.EnterTransition trackActiveEnter(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:1004)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == androidx.compose.animation.EnterExitState.Visible) {
            if (transition.isSeeking()) {
                getHighResolutionOutputSizeshNQ4ISI(mutableState, enterTransition);
            } else {
                getHighResolutionOutputSizeshNQ4ISI(mutableState, androidx.compose.animation.EnterTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() == androidx.compose.animation.EnterExitState.Visible) {
            getHighResolutionOutputSizeshNQ4ISI(mutableState, getHighSpeedVideoFpsRanges((androidx.compose.runtime.MutableState<androidx.compose.animation.EnterTransition>) mutableState).plus(enterTransition));
        }
        androidx.compose.animation.EnterTransition highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((androidx.compose.runtime.MutableState<androidx.compose.animation.EnterTransition>) mutableState);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRanges;
    }

    private static final androidx.compose.animation.EnterTransition getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState<androidx.compose.animation.EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    public static final androidx.compose.animation.ExitTransition trackActiveExit(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.ExitTransition exitTransition, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:1024)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == androidx.compose.animation.EnterExitState.Visible) {
            if (transition.isSeeking()) {
                getHighSpeedVideoFpsRangesFor(mutableState, exitTransition);
            } else {
                getHighSpeedVideoFpsRangesFor(mutableState, androidx.compose.animation.ExitTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() != androidx.compose.animation.EnterExitState.Visible) {
            getHighSpeedVideoFpsRangesFor(mutableState, getHighSpeedVideoFpsRangesFor(mutableState).plus(exitTransition));
        }
        androidx.compose.animation.ExitTransition highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(mutableState);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static final androidx.compose.animation.ExitTransition getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState<androidx.compose.animation.ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0117, code lost:
    
        if (r24.changed(r21) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0131, code lost:
    
        if (r24.changed(r22) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014e, code lost:
    
        if (r24.changed(r20) == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final androidx.compose.animation.GraphicsLayerBlockForEnterExit getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation;
        final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation2;
        boolean z;
        boolean z2;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(642253525, i, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:1052)");
        }
        boolean z3 = true;
        boolean z4 = (enterTransition.getCamera2StreamConfigurationMap().getFade() == null && exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getFade() == null) ? false : true;
        boolean z5 = (enterTransition.getCamera2StreamConfigurationMap().getScale() == null && exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getScale() == null) ? false : true;
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation3 = null;
        if (z4) {
            composer.startReplaceGroup(-703879421);
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" alpha");
                rememberedValue2 = sb.toString();
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.animation.core.Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (java.lang.String) rememberedValue2, composer, (i & 14) | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation = createDeferredAnimation;
        } else {
            composer.startReplaceGroup(-703709976);
            composer.endReplaceGroup();
            deferredAnimation = null;
        }
        if (z5) {
            composer.startReplaceGroup(-703642333);
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" scale");
                rememberedValue3 = sb2.toString();
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.animation.core.Transition.DeferredAnimation createDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (java.lang.String) rememberedValue3, composer, (i & 14) | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation2 = createDeferredAnimation2;
        } else {
            composer.startReplaceGroup(-703472888);
            composer.endReplaceGroup();
            deferredAnimation2 = null;
        }
        if (z5) {
            composer.startReplaceGroup(-703395232);
            deferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, getHighResolutionOutputSizeshNQ4ISI, "TransformOriginInterruptionHandling", composer, (i & 14) | 384, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-703222904);
            composer.endReplaceGroup();
        }
        boolean changedInstance3 = composer.changedInstance(deferredAnimation);
        if (((i & 112) ^ 48) <= 32) {
        }
        if ((i & 48) != 32) {
            z = false;
            if (((i & 896) ^ 384) <= 256) {
            }
            if ((i & 384) != 256) {
                z2 = false;
                changedInstance = composer.changedInstance(deferredAnimation2);
                if (((i & 14) ^ 6) <= 4) {
                }
                if ((i & 6) != 4) {
                    z3 = false;
                }
                changedInstance2 = composer.changedInstance(deferredAnimation3);
                rememberedValue = composer.rememberedValue();
                if (!(changedInstance3 | z | z2 | changedInstance | z3 | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation4 = deferredAnimation3;
                    rememberedValue = new androidx.compose.animation.GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.EnterExitTransitionKt$$ExternalSyntheticLambda0
                        @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                        public final kotlin.jvm.functions.Function1 init() {
                            kotlin.jvm.functions.Function1 highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.EnterExitTransitionKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.DeferredAnimation.this, deferredAnimation2, transition, enterTransition, exitTransition, deferredAnimation4);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = (androidx.compose.animation.GraphicsLayerBlockForEnterExit) rememberedValue;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return graphicsLayerBlockForEnterExit;
            }
            z2 = true;
            changedInstance = composer.changedInstance(deferredAnimation2);
            if (((i & 14) ^ 6) <= 4) {
            }
            if ((i & 6) != 4) {
            }
            changedInstance2 = composer.changedInstance(deferredAnimation3);
            rememberedValue = composer.rememberedValue();
            if (!(changedInstance3 | z | z2 | changedInstance | z3 | changedInstance2)) {
            }
            final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation42 = deferredAnimation3;
            rememberedValue = new androidx.compose.animation.GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.EnterExitTransitionKt$$ExternalSyntheticLambda0
                @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                public final kotlin.jvm.functions.Function1 init() {
                    kotlin.jvm.functions.Function1 highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.EnterExitTransitionKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.DeferredAnimation.this, deferredAnimation2, transition, enterTransition, exitTransition, deferredAnimation42);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit2 = (androidx.compose.animation.GraphicsLayerBlockForEnterExit) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return graphicsLayerBlockForEnterExit2;
        }
        z = true;
        if (((i & 896) ^ 384) <= 256) {
        }
        if ((i & 384) != 256) {
        }
        z2 = true;
        changedInstance = composer.changedInstance(deferredAnimation2);
        if (((i & 14) ^ 6) <= 4) {
        }
        if ((i & 6) != 4) {
        }
        changedInstance2 = composer.changedInstance(deferredAnimation3);
        rememberedValue = composer.rememberedValue();
        if (!(changedInstance3 | z | z2 | changedInstance | z3 | changedInstance2)) {
        }
        final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation422 = deferredAnimation3;
        rememberedValue = new androidx.compose.animation.GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.EnterExitTransitionKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
            public final kotlin.jvm.functions.Function1 init() {
                kotlin.jvm.functions.Function1 highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.EnterExitTransitionKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.DeferredAnimation.this, deferredAnimation2, transition, enterTransition, exitTransition, deferredAnimation422);
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit22 = (androidx.compose.animation.GraphicsLayerBlockForEnterExit) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return graphicsLayerBlockForEnterExit22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function1 getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation, androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation2, androidx.compose.animation.core.Transition transition, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation3) {
        final androidx.compose.ui.graphics.TransformOrigin m6365boximpl;
        final androidx.compose.runtime.State animate = deferredAnimation != null ? deferredAnimation.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                androidx.compose.animation.core.SpringSpec springSpec;
                androidx.compose.animation.core.SpringSpec springSpec2;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec;
                androidx.compose.animation.core.SpringSpec springSpec3;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec2;
                if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                    androidx.compose.animation.Fade fade = androidx.compose.animation.EnterTransition.this.getCamera2StreamConfigurationMap().getFade();
                    if (fade != null && (animationSpec2 = fade.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoSizes;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                    springSpec = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoSizes;
                    return springSpec;
                }
                androidx.compose.animation.Fade fade2 = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getFade();
                if (fade2 != null && (animationSpec = fade2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoSizes;
                return springSpec2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, java.lang.Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float invoke(androidx.compose.animation.EnterExitState enterExitState) {
                int i = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        androidx.compose.animation.Fade fade = androidx.compose.animation.EnterTransition.this.getCamera2StreamConfigurationMap().getFade();
                        if (fade != null) {
                            f = fade.getAlpha();
                        }
                    } else {
                        if (i != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        androidx.compose.animation.Fade fade2 = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getFade();
                        if (fade2 != null) {
                            f = fade2.getAlpha();
                        }
                    }
                }
                return java.lang.Float.valueOf(f);
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.animation.EnterExitState.values().length];
                    try {
                        iArr[androidx.compose.animation.EnterExitState.Visible.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PostExit.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }) : null;
        final androidx.compose.runtime.State animate2 = deferredAnimation2 != null ? deferredAnimation2.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                androidx.compose.animation.core.SpringSpec springSpec;
                androidx.compose.animation.core.SpringSpec springSpec2;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec;
                androidx.compose.animation.core.SpringSpec springSpec3;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec2;
                if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                    androidx.compose.animation.Scale scale = androidx.compose.animation.EnterTransition.this.getCamera2StreamConfigurationMap().getScale();
                    if (scale != null && (animationSpec2 = scale.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoSizes;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                    springSpec = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoSizes;
                    return springSpec;
                }
                androidx.compose.animation.Scale scale2 = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getScale();
                if (scale2 != null && (animationSpec = scale2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoSizes;
                return springSpec2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, java.lang.Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Float invoke(androidx.compose.animation.EnterExitState enterExitState) {
                int i = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        androidx.compose.animation.Scale scale = androidx.compose.animation.EnterTransition.this.getCamera2StreamConfigurationMap().getScale();
                        if (scale != null) {
                            f = scale.getScale();
                        }
                    } else {
                        if (i != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        androidx.compose.animation.Scale scale2 = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getScale();
                        if (scale2 != null) {
                            f = scale2.getScale();
                        }
                    }
                }
                return java.lang.Float.valueOf(f);
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.animation.EnterExitState.values().length];
                    try {
                        iArr[androidx.compose.animation.EnterExitState.Visible.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PostExit.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }) : null;
        if (transition.getCurrentState() == androidx.compose.animation.EnterExitState.PreEnter) {
            androidx.compose.animation.Scale scale = enterTransition.getCamera2StreamConfigurationMap().getScale();
            if (scale != null || (scale = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getScale()) != null) {
                m6365boximpl = androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(scale.m1139getTransformOriginSzJe1aQ());
            }
            m6365boximpl = null;
        } else {
            androidx.compose.animation.Scale scale2 = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getScale();
            if (scale2 != null || (scale2 = enterTransition.getCamera2StreamConfigurationMap().getScale()) != null) {
                m6365boximpl = androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(scale2.m1139getTransformOriginSzJe1aQ());
            }
            m6365boximpl = null;
        }
        final androidx.compose.runtime.State animate3 = deferredAnimation3 != null ? deferredAnimation3.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.TransformOrigin> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                return androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.graphics.TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.graphics.TransformOrigin invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(getHighResolutionOutputSizeshNQ4ISI(enterExitState));
            }

            public final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.EnterExitState enterExitState) {
                androidx.compose.ui.graphics.TransformOrigin transformOrigin;
                int i = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i == 1) {
                    transformOrigin = androidx.compose.ui.graphics.TransformOrigin.this;
                } else if (i == 2) {
                    androidx.compose.animation.Scale scale3 = enterTransition.getCamera2StreamConfigurationMap().getScale();
                    if (scale3 != null || (scale3 = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getScale()) != null) {
                        transformOrigin = androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(scale3.m1139getTransformOriginSzJe1aQ());
                    }
                    transformOrigin = null;
                } else {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    androidx.compose.animation.Scale scale4 = exitTransition.getGetHighResolutionOutputSizeshNQ4ISI().getScale();
                    if (scale4 != null || (scale4 = enterTransition.getCamera2StreamConfigurationMap().getScale()) != null) {
                        transformOrigin = androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(scale4.m1139getTransformOriginSzJe1aQ());
                    }
                    transformOrigin = null;
                }
                if (transformOrigin != null) {
                    return transformOrigin.getGetHighSpeedVideoFpsRanges();
                }
                return androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ();
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.animation.EnterExitState.values().length];
                    try {
                        iArr[androidx.compose.animation.EnterExitState.Visible.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PostExit.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }) : null;
        return new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                getHighSpeedVideoFpsRangesFor(graphicsLayerScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                androidx.compose.runtime.State<java.lang.Float> state = animate;
                graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
                androidx.compose.runtime.State<java.lang.Float> state2 = animate2;
                graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
                androidx.compose.runtime.State<java.lang.Float> state3 = animate2;
                graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
                androidx.compose.runtime.State<androidx.compose.ui.graphics.TransformOrigin> state4 = animate3;
                graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().getGetHighSpeedVideoFpsRanges() : androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m6378getCenterSzJe1aQ());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
    }

    public static final androidx.compose.ui.Modifier createModifier(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        final kotlin.jvm.functions.Function0<java.lang.Boolean> function02;
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation;
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation2;
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation3;
        androidx.compose.animation.ChangeSize changeSize;
        androidx.compose.ui.graphics.colorspace.Rgb m6000getColorSpaceimpl;
        final boolean z;
        androidx.compose.ui.Modifier.Companion companion;
        if ((i2 & 4) != 0) {
            androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1 rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Boolean invoke() {
                        return java.lang.Boolean.TRUE;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function02 = (kotlin.jvm.functions.Function0) rememberedValue;
        } else {
            function02 = function0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(28261782, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:933)");
        }
        int i3 = i & 14;
        androidx.compose.animation.EnterTransition trackActiveEnter = trackActiveEnter(transition, enterTransition, composer, i & 126);
        int i4 = i >> 3;
        androidx.compose.animation.ExitTransition trackActiveExit = trackActiveExit(transition, exitTransition, composer, (i4 & 112) | i3);
        boolean z2 = (trackActiveEnter.getCamera2StreamConfigurationMap().getVeil() == null && trackActiveExit.getGetHighResolutionOutputSizeshNQ4ISI().getVeil() == null) ? false : true;
        boolean z3 = (trackActiveEnter.getCamera2StreamConfigurationMap().getSlide() == null && trackActiveExit.getGetHighResolutionOutputSizeshNQ4ISI().getSlide() == null) ? false : true;
        boolean z4 = (trackActiveEnter.getCamera2StreamConfigurationMap().getChangeSize() == null && trackActiveExit.getGetHighResolutionOutputSizeshNQ4ISI().getChangeSize() == null) ? false : true;
        if (z3) {
            composer.startReplaceGroup(133792645);
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" slide");
                rememberedValue2 = sb.toString();
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.animation.core.Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (java.lang.String) rememberedValue2, composer, i3 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation = createDeferredAnimation;
        } else {
            composer.startReplaceGroup(133898448);
            composer.endReplaceGroup();
            deferredAnimation = null;
        }
        if (z4) {
            composer.startReplaceGroup(133990239);
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" shrink/expand");
                rememberedValue3 = sb2.toString();
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.animation.core.Transition.DeferredAnimation createDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (java.lang.String) rememberedValue3, composer, i3 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation2 = createDeferredAnimation2;
        } else {
            composer.startReplaceGroup(134101063);
            composer.endReplaceGroup();
            deferredAnimation2 = null;
        }
        if (z4) {
            composer.startReplaceGroup(134174689);
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> vectorConverter3 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" InterruptionHandlingOffset");
                rememberedValue4 = sb3.toString();
                composer.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.animation.core.Transition.DeferredAnimation createDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (java.lang.String) rememberedValue4, composer, i3 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation3 = createDeferredAnimation3;
        } else {
            composer.startReplaceGroup(134345095);
            composer.endReplaceGroup();
            deferredAnimation3 = null;
        }
        androidx.compose.animation.ChangeSize changeSize2 = trackActiveEnter.getCamera2StreamConfigurationMap().getChangeSize();
        boolean z5 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = trackActiveExit.getGetHighResolutionOutputSizeshNQ4ISI().getChangeSize()) == null || changeSize.getClip()) && z4) ? false : true;
        androidx.compose.animation.Veil veil = trackActiveEnter.getCamera2StreamConfigurationMap().getVeil();
        if (veil == null || (m6000getColorSpaceimpl = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(veil.m1171getInitialColor0d7_KjU())) == null) {
            androidx.compose.animation.Veil veil2 = trackActiveEnter.getCamera2StreamConfigurationMap().getVeil();
            if (veil2 != null) {
                m6000getColorSpaceimpl = androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(veil2.m1172getTargetColor0d7_KjU());
            } else {
                androidx.compose.animation.Veil veil3 = trackActiveExit.getGetHighResolutionOutputSizeshNQ4ISI().getVeil();
                m6000getColorSpaceimpl = veil3 != null ? androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(veil3.m1171getInitialColor0d7_KjU()) : null;
                if (m6000getColorSpaceimpl == null) {
                    androidx.compose.animation.Veil veil4 = trackActiveExit.getGetHighResolutionOutputSizeshNQ4ISI().getVeil();
                    androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl2 = veil4 != null ? androidx.compose.ui.graphics.Color.m6000getColorSpaceimpl(veil4.m1172getTargetColor0d7_KjU()) : null;
                    m6000getColorSpaceimpl = m6000getColorSpaceimpl2 == null ? androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb() : m6000getColorSpaceimpl2;
                }
            }
        }
        if (z2) {
            composer.startReplaceGroup(134871569);
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> invoke = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(androidx.compose.ui.graphics.Color.INSTANCE).invoke(m6000getColorSpaceimpl);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" veil");
                rememberedValue5 = sb4.toString();
                composer.updateRememberedValue(rememberedValue5);
            }
            z = z5;
            androidx.compose.animation.VeilModifierElement veilModifierElement = new androidx.compose.animation.VeilModifierElement(transition, androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, invoke, (java.lang.String) rememberedValue5, composer, i3 | 384, 0), trackActiveEnter, trackActiveExit);
            composer.endReplaceGroup();
            companion = veilModifierElement;
        } else {
            z = z5;
            composer.startReplaceGroup(135150476);
            composer.endReplaceGroup();
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        androidx.compose.ui.Modifier.Companion companion2 = companion;
        androidx.compose.animation.Veil veil5 = trackActiveEnter.getCamera2StreamConfigurationMap().getVeil();
        boolean matchParentSize = (veil5 == null && (veil5 = trackActiveExit.getGetHighResolutionOutputSizeshNQ4ISI().getVeil()) == null) ? false : veil5.getMatchParentSize();
        androidx.compose.animation.GraphicsLayerBlockForEnterExit highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(transition, trackActiveEnter, trackActiveExit, str, composer, i3 | (i4 & 7168));
        androidx.compose.ui.Modifier.Companion companion3 = matchParentSize ? companion2 : androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
        boolean changed = composer.changed(z);
        boolean z6 = (((i & 7168) ^ 3072) > 2048 && composer.changed(function02)) || (i & 3072) == 2048;
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if ((changed | z6) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                public final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setClip(!z && function02.invoke().booleanValue());
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    Camera2StreamConfigurationMap(graphicsLayerScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        androidx.compose.ui.Modifier then = companion3.then(androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion4, (kotlin.jvm.functions.Function1) rememberedValue6)).then(new androidx.compose.animation.EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimation3, deferredAnimation, trackActiveEnter, trackActiveExit, function02, highResolutionOutputSizeshNQ4ISI));
        if (matchParentSize) {
            companion2 = androidx.compose.ui.Modifier.INSTANCE;
        }
        androidx.compose.ui.Modifier then2 = then.then(companion2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then2;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState<androidx.compose.animation.EnterTransition> mutableState, androidx.compose.animation.EnterTransition enterTransition) {
        mutableState.setValue(enterTransition);
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState<androidx.compose.animation.ExitTransition> mutableState, androidx.compose.animation.ExitTransition exitTransition) {
        mutableState.setValue(exitTransition);
    }
}
