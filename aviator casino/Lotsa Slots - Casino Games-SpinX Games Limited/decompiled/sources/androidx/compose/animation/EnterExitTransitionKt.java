package androidx.compose.animation;

/* compiled from: EnterExitTransition.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0000\u001a \u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0000\u001aQ\u0010\u0014\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001aQ\u0010!\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u0010\u0017\u001a\u00020\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00060\u001cH\u0007\u001aQ\u0010%\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u0010\u0017\u001a\u00020&2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a\"\u0010)\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u0002H\u0007\u001a\"\u0010+\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0002H\u0007\u001a6\u0010-\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a6\u00102\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aQ\u00106\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001aQ\u00109\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010:\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00060\u001cH\u0007\u001aQ\u0010;\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u00107\u001a\u00020&2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a;\u0010=\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\u001cH\u0007\u001a=\u0010?\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010@\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a=\u0010A\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a;\u0010C\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162!\u0010D\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\u001cH\u0007\u001a=\u0010E\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010F\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a=\u0010G\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010H\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a/\u0010I\u001a\u00020J*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020PH\u0003¢\u0006\u0002\u0010Q\u001a/\u0010R\u001a\u00020S*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020PH\u0001¢\u0006\u0002\u0010T\u001a\u001f\u0010U\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0080\u0002\u001a\u001f\u0010U\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010*\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0080\u0002\u001a\f\u0010V\u001a\u00020\"*\u00020\u0018H\u0002\u001a\f\u0010V\u001a\u00020\"*\u00020&H\u0002\u001a\u001f\u0010W\u001a\u00020\f*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020\fH\u0001¢\u0006\u0002\u0010X\u001a\u001f\u0010Y\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010N\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010Z\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006[²\u0006\n\u0010\\\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010]\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "EnterTransition", "Landroidx/compose/animation/EnterTransition;", com.ironsource.X3.i.W, "", "node", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "ExitTransition", "Landroidx/compose/animation/ExitTransition;", "expandHorizontally", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createGraphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "createModifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "get", "toAlignment", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "animation_release", "activeEnter", "activeExit"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.TransformOrigin, androidx.compose.animation.core.AnimationVector2D> TransformOriginVectorConverter = androidx.compose.animation.core.VectorConvertersKt.TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.TransformOrigin, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.graphics.TransformOrigin transformOrigin) {
            return m77invoke__ExYCQ(transformOrigin.getPackedValue());
        }

        /* renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector2D m77invoke__ExYCQ(long j) {
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.graphics.TransformOrigin.m2507getPivotFractionXimpl(j), androidx.compose.ui.graphics.TransformOrigin.m2508getPivotFractionYimpl(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.graphics.TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.TransformOrigin invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(m78invokeLIALnN8(animationVector2D));
        }

        /* renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m78invokeLIALnN8(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> DefaultAlphaAndScaleSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> DefaultOffsetAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> DefaultSizeAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);

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
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(new androidx.compose.animation.Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
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
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(new androidx.compose.animation.Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition slideIn$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.EnterTransition slideIn(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> function1) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, new androidx.compose.animation.Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition slideOut$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.ExitTransition slideOut(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> function1) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, new androidx.compose.animation.Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.EnterTransition m74scaleInL8ZKhE$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ();
        }
        return m73scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final androidx.compose.animation.EnterTransition m73scaleInL8ZKhE(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, float f, long j) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, new androidx.compose.animation.Scale(f, j, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.ExitTransition m76scaleOutL8ZKhE$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ();
        }
        return m75scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final androidx.compose.animation.ExitTransition m75scaleOutL8ZKhE(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, float f, long j) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, new androidx.compose.animation.Scale(f, j, finiteAnimationSpec, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition expandIn$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
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
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                    return androidx.compose.ui.unit.IntSize.m4644boximpl(m81invokemzRDjE0(intSize.getPackedValue()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m81invokemzRDjE0(long j) {
                    return androidx.compose.ui.unit.IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    public static final androidx.compose.animation.EnterTransition expandIn(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> function1) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, new androidx.compose.animation.ChangeSize(alignment, function1, finiteAnimationSpec, z), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition shrinkOut$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
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
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                    return androidx.compose.ui.unit.IntSize.m4644boximpl(m84invokemzRDjE0(intSize.getPackedValue()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m84invokemzRDjE0(long j) {
                    return androidx.compose.ui.unit.IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    public static final androidx.compose.animation.ExitTransition shrinkOut(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment alignment, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize> function1) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, null, new androidx.compose.animation.ChangeSize(alignment, function1, finiteAnimationSpec, z), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition expandHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = androidx.compose.ui.Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                public final java.lang.Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final androidx.compose.animation.EnterTransition expandHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m4644boximpl(m80invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m80invokemzRDjE0(long j) {
                return androidx.compose.ui.unit.IntSizeKt.IntSize(function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j))).intValue(), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition expandVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = androidx.compose.ui.Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                public final java.lang.Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final androidx.compose.animation.EnterTransition expandVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m4644boximpl(m82invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m82invokemzRDjE0(long j) {
                return androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition shrinkHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = androidx.compose.ui.Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                public final java.lang.Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final androidx.compose.animation.ExitTransition shrinkHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Horizontal horizontal, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m4644boximpl(m83invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m83invokemzRDjE0(long j) {
                return androidx.compose.ui.unit.IntSizeKt.IntSize(function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j))).intValue(), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition shrinkVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = androidx.compose.ui.Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                public final java.lang.Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final androidx.compose.animation.ExitTransition shrinkVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment.Vertical vertical, boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntSize.m4644boximpl(m85invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m85invokemzRDjE0(long j) {
                return androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition slideInHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                public final java.lang.Integer invoke(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.EnterTransition slideInHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideIn(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m86invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m86invokemHKZG7I(long j) {
                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.EnterTransition slideInVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                public final java.lang.Integer invoke(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.EnterTransition slideInVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideIn(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m87invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m87invokemHKZG7I(long j) {
                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition slideOutHorizontally$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                public final java.lang.Integer invoke(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.ExitTransition slideOutHorizontally(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideOut(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m88invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m88invokemHKZG7I(long j) {
                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ androidx.compose.animation.ExitTransition slideOutVertically$default(androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                public final java.lang.Integer invoke(int i2) {
                    return java.lang.Integer.valueOf((-i2) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    public static final androidx.compose.animation.ExitTransition slideOutVertically(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        return slideOut(finiteAnimationSpec, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize) {
                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m89invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m89invokemHKZG7I(long j) {
                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j))).intValue());
            }
        });
    }

    public static final androidx.compose.animation.EnterTransition EnterTransition(java.lang.Object obj, androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node> modifierNodeElement) {
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, modifierNodeElement)), 31, null));
    }

    public static final androidx.compose.animation.ExitTransition ExitTransition(java.lang.Object obj, androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node> modifierNodeElement) {
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, modifierNodeElement)), 31, null));
    }

    private static final androidx.compose.ui.Alignment toAlignment(androidx.compose.ui.Alignment.Horizontal horizontal) {
        return kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getStart()) ? androidx.compose.ui.Alignment.INSTANCE.getCenterStart() : kotlin.jvm.internal.Intrinsics.areEqual(horizontal, androidx.compose.ui.Alignment.INSTANCE.getEnd()) ? androidx.compose.ui.Alignment.INSTANCE.getCenterEnd() : androidx.compose.ui.Alignment.INSTANCE.getCenter();
    }

    private static final androidx.compose.ui.Alignment toAlignment(androidx.compose.ui.Alignment.Vertical vertical) {
        return kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.ui.Alignment.INSTANCE.getTop()) ? androidx.compose.ui.Alignment.INSTANCE.getTopCenter() : kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.ui.Alignment.INSTANCE.getBottom()) ? androidx.compose.ui.Alignment.INSTANCE.getBottomCenter() : androidx.compose.ui.Alignment.INSTANCE.getCenter();
    }

    public static final androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node> get(androidx.compose.animation.EnterTransition enterTransition, java.lang.Object obj) {
        return enterTransition.getData().getEffectsMap().get(obj);
    }

    public static final androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node> get(androidx.compose.animation.ExitTransition exitTransition, java.lang.Object obj) {
        return exitTransition.getData().getEffectsMap().get(obj);
    }

    public static final androidx.compose.ui.Modifier createModifier(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str2;
        int i2;
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation;
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation2;
        androidx.compose.animation.ChangeSize changeSize;
        composer.startReplaceableGroup(914000546);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(createModifier)856@37697L31,857@37750L28,882@38722L56:EnterExitTransition.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(914000546, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:855)");
        }
        int i3 = i & 14;
        androidx.compose.animation.EnterTransition trackActiveEnter = trackActiveEnter(transition, enterTransition, composer, (i & 112) | i3);
        androidx.compose.animation.ExitTransition trackActiveExit = trackActiveExit(transition, exitTransition, composer, ((i >> 3) & 112) | i3);
        boolean z = (trackActiveEnter.getData().getSlide() == null && trackActiveExit.getData().getSlide() == null) ? false : true;
        boolean z2 = (trackActiveEnter.getData().getChangeSize() == null && trackActiveExit.getData().getChangeSize() == null) ? false : true;
        composer.startReplaceableGroup(1657242209);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "864@38100L27,864@38049L79");
        androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation3 = null;
        if (!z) {
            str2 = "CC(remember):Composables.kt#9igjgp";
            i2 = -492369756;
            deferredAnimation = null;
        } else {
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE);
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = str + " slide";
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            i2 = -492369756;
            str2 = "CC(remember):Composables.kt#9igjgp";
            deferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (java.lang.String) rememberedValue, composer, i3 | 448, 0);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1657242379);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "869@38273L35,869@38224L85");
        if (z2) {
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE);
            composer.startReplaceableGroup(i2);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, str2);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = str + " shrink/expand";
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            deferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (java.lang.String) rememberedValue2, composer, i3 | 448, 0);
        } else {
            deferredAnimation2 = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1657242547);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "875@38468L48,873@38392L134");
        if (z2) {
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> vectorConverter3 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE);
            composer.startReplaceableGroup(i2);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, str2);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            deferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (java.lang.String) rememberedValue3, composer, i3 | 448, 0);
        }
        composer.endReplaceableGroup();
        androidx.compose.animation.ChangeSize changeSize2 = trackActiveEnter.getData().getChangeSize();
        androidx.compose.ui.Modifier then = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2275graphicsLayerAp8cVGQ$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, !(((changeSize2 == null || changeSize2.getClip()) && ((changeSize = trackActiveExit.getData().getChangeSize()) == null || changeSize.getClip()) && z2) ? false : true), null, 0L, 0L, 0, 126975, null).then(new androidx.compose.animation.EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimation3, deferredAnimation, trackActiveEnter, trackActiveExit, createGraphicsLayerBlock(transition, trackActiveEnter, trackActiveExit, str, composer, i3 | (i & 7168))));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    public static final androidx.compose.animation.EnterTransition trackActiveEnter(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(21614502);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(trackActiveEnter)899@39573L40:EnterExitTransition.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(transition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == androidx.compose.animation.EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(androidx.compose.animation.EnterTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() == androidx.compose.animation.EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$4(mutableState).plus(enterTransition));
        }
        androidx.compose.animation.EnterTransition trackActiveEnter$lambda$4 = trackActiveEnter$lambda$4(mutableState);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trackActiveEnter$lambda$4;
    }

    private static final androidx.compose.animation.EnterTransition trackActiveEnter$lambda$4(androidx.compose.runtime.MutableState<androidx.compose.animation.EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    public static final androidx.compose.animation.ExitTransition trackActiveExit(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.ExitTransition exitTransition, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1363864804);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(trackActiveExit)919@40554L39:EnterExitTransition.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(transition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == androidx.compose.animation.EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(androidx.compose.animation.ExitTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() != androidx.compose.animation.EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$7(mutableState).plus(exitTransition));
        }
        androidx.compose.animation.ExitTransition trackActiveExit$lambda$7 = trackActiveExit$lambda$7(mutableState);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trackActiveExit$lambda$7;
    }

    private static final androidx.compose.animation.ExitTransition trackActiveExit$lambda$7(androidx.compose.runtime.MutableState<androidx.compose.animation.ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    private static final androidx.compose.animation.GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation;
        final androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation2;
        composer.startReplaceableGroup(642253525);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(createGraphicsLayerBlock)963@42205L136:EnterExitTransition.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(642253525, i, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        boolean z = (enterTransition.getData().getFade() == null && exitTransition.getData().getFade() == null) ? false : true;
        boolean z2 = (enterTransition.getData().getScale() == null && exitTransition.getData().getScale() == null) ? false : true;
        composer.startReplaceableGroup(-1158245383);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "952@41884L27,951@41801L120");
        if (z) {
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = str + " alpha";
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            deferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (java.lang.String) rememberedValue, composer, (i & 14) | 448, 0);
        } else {
            deferredAnimation = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1158245186);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "958@42081L27,957@41998L120");
        if (z2) {
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = str + " scale";
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            deferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (java.lang.String) rememberedValue2, composer, (i & 14) | 448, 0);
        } else {
            deferredAnimation2 = null;
        }
        composer.endReplaceableGroup();
        final androidx.compose.animation.core.Transition.DeferredAnimation createDeferredAnimation = z2 ? androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", composer, (i & 14) | 448, 0) : null;
        androidx.compose.animation.GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = new androidx.compose.animation.GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.EnterExitTransitionKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
            public final kotlin.jvm.functions.Function1 init() {
                kotlin.jvm.functions.Function1 createGraphicsLayerBlock$lambda$11;
                createGraphicsLayerBlock$lambda$11 = androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock$lambda$11(androidx.compose.animation.core.Transition.DeferredAnimation.this, deferredAnimation2, transition, enterTransition, exitTransition, createDeferredAnimation);
                return createGraphicsLayerBlock$lambda$11;
            }
        };
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return graphicsLayerBlockForEnterExit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function1 createGraphicsLayerBlock$lambda$11(androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation, androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation2, androidx.compose.animation.core.Transition transition, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, androidx.compose.animation.core.Transition.DeferredAnimation deferredAnimation3) {
        final androidx.compose.ui.graphics.TransformOrigin m2499boximpl;
        final androidx.compose.runtime.State animate = deferredAnimation != null ? deferredAnimation.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                androidx.compose.animation.core.SpringSpec springSpec;
                androidx.compose.animation.core.SpringSpec springSpec2;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec;
                androidx.compose.animation.core.SpringSpec springSpec3;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec2;
                if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                    androidx.compose.animation.Fade fade = androidx.compose.animation.EnterTransition.this.getData().getFade();
                    if (fade != null && (animationSpec2 = fade.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = androidx.compose.animation.EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                    springSpec = androidx.compose.animation.EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec;
                }
                androidx.compose.animation.Fade fade2 = exitTransition.getData().getFade();
                if (fade2 != null && (animationSpec = fade2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = androidx.compose.animation.EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                return springSpec2;
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, java.lang.Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2

            /* compiled from: EnterExitTransition.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
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

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Float invoke(androidx.compose.animation.EnterExitState enterExitState) {
                int i = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        androidx.compose.animation.Fade fade = androidx.compose.animation.EnterTransition.this.getData().getFade();
                        if (fade != null) {
                            f = fade.getAlpha();
                        }
                    } else {
                        if (i != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        androidx.compose.animation.Fade fade2 = exitTransition.getData().getFade();
                        if (fade2 != null) {
                            f = fade2.getAlpha();
                        }
                    }
                }
                return java.lang.Float.valueOf(f);
            }
        }) : null;
        final androidx.compose.runtime.State animate2 = deferredAnimation2 != null ? deferredAnimation2.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                androidx.compose.animation.core.SpringSpec springSpec;
                androidx.compose.animation.core.SpringSpec springSpec2;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec;
                androidx.compose.animation.core.SpringSpec springSpec3;
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec2;
                if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                    androidx.compose.animation.Scale scale = androidx.compose.animation.EnterTransition.this.getData().getScale();
                    if (scale != null && (animationSpec2 = scale.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = androidx.compose.animation.EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                    springSpec = androidx.compose.animation.EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec;
                }
                androidx.compose.animation.Scale scale2 = exitTransition.getData().getScale();
                if (scale2 != null && (animationSpec = scale2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = androidx.compose.animation.EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                return springSpec2;
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, java.lang.Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$2

            /* compiled from: EnterExitTransition.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
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

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Float invoke(androidx.compose.animation.EnterExitState enterExitState) {
                int i = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$2.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        androidx.compose.animation.Scale scale = androidx.compose.animation.EnterTransition.this.getData().getScale();
                        if (scale != null) {
                            f = scale.getScale();
                        }
                    } else {
                        if (i != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        androidx.compose.animation.Scale scale2 = exitTransition.getData().getScale();
                        if (scale2 != null) {
                            f = scale2.getScale();
                        }
                    }
                }
                return java.lang.Float.valueOf(f);
            }
        }) : null;
        if (transition.getCurrentState() == androidx.compose.animation.EnterExitState.PreEnter) {
            androidx.compose.animation.Scale scale = enterTransition.getData().getScale();
            if (scale != null || (scale = exitTransition.getData().getScale()) != null) {
                m2499boximpl = androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(scale.m102getTransformOriginSzJe1aQ());
            }
            m2499boximpl = null;
        } else {
            androidx.compose.animation.Scale scale2 = exitTransition.getData().getScale();
            if (scale2 != null || (scale2 = enterTransition.getData().getScale()) != null) {
                m2499boximpl = androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(scale2.m102getTransformOriginSzJe1aQ());
            }
            m2499boximpl = null;
        }
        final androidx.compose.runtime.State animate3 = deferredAnimation3 != null ? deferredAnimation3.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$1
            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.TransformOrigin> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                return androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.graphics.TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2

            /* compiled from: EnterExitTransition.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
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

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.TransformOrigin invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(m79invokeLIALnN8(enterExitState));
            }

            /* renamed from: invoke-LIALnN8, reason: not valid java name */
            public final long m79invokeLIALnN8(androidx.compose.animation.EnterExitState enterExitState) {
                androidx.compose.ui.graphics.TransformOrigin transformOrigin;
                int i = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i != 1) {
                    transformOrigin = null;
                    if (i == 2) {
                        androidx.compose.animation.Scale scale3 = enterTransition.getData().getScale();
                        if (scale3 != null || (scale3 = exitTransition.getData().getScale()) != null) {
                            transformOrigin = androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(scale3.m102getTransformOriginSzJe1aQ());
                        }
                    } else {
                        if (i != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        androidx.compose.animation.Scale scale4 = exitTransition.getData().getScale();
                        if (scale4 != null || (scale4 = enterTransition.getData().getScale()) != null) {
                            transformOrigin = androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(scale4.m102getTransformOriginSzJe1aQ());
                        }
                    }
                } else {
                    transformOrigin = androidx.compose.ui.graphics.TransformOrigin.this;
                }
                if (transformOrigin != null) {
                    return transformOrigin.getPackedValue();
                }
                return androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ();
            }
        }) : null;
        return new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                androidx.compose.runtime.State<java.lang.Float> state = animate;
                graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
                androidx.compose.runtime.State<java.lang.Float> state2 = animate2;
                graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
                androidx.compose.runtime.State<java.lang.Float> state3 = animate2;
                graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
                androidx.compose.runtime.State<androidx.compose.ui.graphics.TransformOrigin> state4 = animate3;
                graphicsLayerScope.mo2288setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().getPackedValue() : androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ());
            }
        };
    }
}
