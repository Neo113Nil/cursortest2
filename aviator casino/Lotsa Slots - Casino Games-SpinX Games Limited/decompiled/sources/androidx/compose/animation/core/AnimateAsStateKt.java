package androidx.compose.animation.core;

/* compiled from: AnimateAsState.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010!\u001aW\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\"\u001aC\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010$\u001aM\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010%\u001aH\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aR\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aH\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010(\u001aR\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010*\u001aH\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010(\u001aR\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010*\u001aC\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00102\u001aM\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00103\u001aH\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010(\u001aR\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u0010*\u001as\u00107\u001a\b\u0012\u0004\u0012\u0002H80\u0012\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:2\u0006\u0010\u0013\u001a\u0002H82\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90<2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H80\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u0001H82\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010=\u001a}\u00107\u001a\b\u0012\u0004\u0012\u0002H80\u0012\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:2\u0006\u0010\u0013\u001a\u0002H82\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90<2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H80\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u0001H82\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010>\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006(\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:X\u008a\u0084\u0002²\u0006 \u0010A\u001a\b\u0012\u0004\u0012\u0002H80\u0015\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:X\u008a\u0084\u0002"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "dpDefaultSpring", "Landroidx/compose/ui/unit/Dp;", "intDefaultSpring", "", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "intSizeDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "rectDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "animateDpAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloatAsState", "visibilityThreshold", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState", "animateIntOffsetAsState-8f6pmRE", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-HyPO7BM", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntSizeAsState", "animateIntSizeAsState-zTRF_AQ", "animateIntSizeAsState-4goxYXU", "animateOffsetAsState", "animateOffsetAsState-N6fFfp4", "animateOffsetAsState-7362WCg", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "animateSizeAsState-LjSzlW0", "animateSizeAsState-YLp_XPw", "animateValueAsState", "T", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "animSpec"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> defaultAnimation = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> dpDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.Dp.m4476boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> sizeDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Size.m1928boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Size.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> offsetDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Offset.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> rectDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Rect.INSTANCE), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Integer> intDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, java.lang.Integer.valueOf(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(kotlin.jvm.internal.IntCompanionObject.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> intOffsetDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> intSizeDefaultSpring = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 3, null);

    public static final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState(float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, float f2, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(668842840);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateFloatAsState)P(3!1,4,2)75@3368L173:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec = (i2 & 2) != 0 ? defaultAnimation : animationSpec;
        float f3 = (i2 & 4) != 0 ? 0.01f : f2;
        java.lang.String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function12 = (i2 & 16) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        composer.startReplaceableGroup(841393662);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "71@3220L83");
        if (springSpec == defaultAnimation) {
            java.lang.Float valueOf = java.lang.Float.valueOf(f3);
            composer.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(valueOf);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, java.lang.Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            springSpec = (androidx.compose.animation.core.AnimationSpec) rememberedValue;
        }
        composer.endReplaceableGroup();
        int i3 = i << 3;
        androidx.compose.runtime.State<java.lang.Float> animateValueAsState = animateValueAsState(java.lang.Float.valueOf(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), springSpec, java.lang.Float.valueOf(f3), str2, function12, composer, (i3 & 7168) | (i & 14) | (57344 & i3) | (i3 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> m117animateDpAsStateAjpBEmI(float f, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Dp, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1407150062);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateDpAsState)P(3:c#ui.unit.Dp!1,2)114@5081L165:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> springSpec = (i2 & 2) != 0 ? dpDefaultSpring : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "DpAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Dp, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> animateValueAsState = animateValueAsState(androidx.compose.ui.unit.Dp.m4476boximpl(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), springSpec, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.geometry.Size> m126animateSizeAsStateYLp_XPw(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Size> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Size, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1374633148);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateSizeAsState)P(3:c#ui.geometry.Size!1,2)155@6928L167:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> springSpec = (i2 & 2) != 0 ? sizeDefaultSpring : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "SizeAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Size, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1374633148, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Size> animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Size.m1928boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE), springSpec, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> m123animateOffsetAsState7362WCg(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(357896800);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateOffsetAsState)P(3:c#ui.geometry.Offset!1,2)195@8761L169:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> springSpec = (i2 & 2) != 0 ? offsetDefaultSpring : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "OffsetAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(357896800, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Offset.m1860boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), springSpec, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    public static final androidx.compose.runtime.State<androidx.compose.ui.geometry.Rect> animateRectAsState(androidx.compose.ui.geometry.Rect rect, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Rect> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(536062978);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateRectAsState)P(3!1,2)236@10633L167:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> springSpec = (i2 & 2) != 0 ? rectDefaultSpring : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "RectAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(536062978, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Rect> animateValueAsState = animateValueAsState(rect, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE), springSpec, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    public static final androidx.compose.runtime.State<java.lang.Integer> animateIntAsState(int i, androidx.compose.animation.core.AnimationSpec<java.lang.Integer> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(428074472);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateIntAsState)P(3!1,2)274@12363L166:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<java.lang.Integer> springSpec = (i3 & 2) != 0 ? intDefaultSpring : animationSpec;
        java.lang.String str2 = (i3 & 4) != 0 ? "IntAnimation" : str;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12 = (i3 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(428074472, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        int i4 = i2 << 6;
        androidx.compose.runtime.State<java.lang.Integer> animateValueAsState = animateValueAsState(java.lang.Integer.valueOf(i), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), springSpec, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> m120animateIntOffsetAsStateHyPO7BM(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntOffset, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-696782904);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateIntOffsetAsState)P(3:c#ui.unit.IntOffset!1,2)314@14224L172:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> springSpec = (i2 & 2) != 0 ? intOffsetDefaultSpring : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "IntOffsetAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntOffset, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-696782904, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntOffset.m4601boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), springSpec, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> m121animateIntSizeAsState4goxYXU(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.IntSize> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(582576328);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateIntSizeAsState)P(3:c#ui.unit.IntSize!1,2)352@16009L170:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> springSpec = (i2 & 2) != 0 ? intSizeDefaultSpring : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "IntSizeAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(582576328, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntSize.m4644boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE), springSpec, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValueAsState(final T t, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, androidx.compose.animation.core.AnimationSpec<T> animationSpec, T t2, java.lang.String str, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.SpringSpec springSpec;
        composer.startReplaceableGroup(-1994373980);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateValueAsState)P(3,4!1,5,2)393@18031L21,399@18213L44,400@18279L79,401@18379L38,402@18456L339,413@18814L42,414@18861L55,417@18921L721:AnimateAsState.kt#pdpnli");
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            springSpec = (androidx.compose.animation.core.AnimationSpec) rememberedValue;
        } else {
            springSpec = animationSpec;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        java.lang.String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12 = (i2 & 32) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.compose.animation.core.Animatable(t, twoWayConverter, t3, str2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function12, composer, (i >> 15) & 14);
        if (t3 != null && (springSpec instanceof androidx.compose.animation.core.SpringSpec)) {
            androidx.compose.animation.core.SpringSpec springSpec2 = (androidx.compose.animation.core.SpringSpec) springSpec;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(springSpec2.getVisibilityThreshold(), t3)) {
                springSpec = androidx.compose.animation.core.AnimationSpecKt.spring(springSpec2.getDampingRatio(), springSpec2.getStiffness(), t3);
            }
        }
        androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(springSpec, composer, 0);
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        final kotlinx.coroutines.channels.Channel channel = (kotlinx.coroutines.channels.Channel) rememberedValue4;
        androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                channel.mo10716trySendJP2dKIU(t);
            }
        }, composer, 0);
        androidx.compose.runtime.EffectsKt.LaunchedEffect(channel, new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3(channel, animatable, rememberUpdatedState2, rememberUpdatedState, null), composer, 72);
        androidx.compose.runtime.State<T> state = (androidx.compose.runtime.State) mutableState.getValue();
        if (state == null) {
            state = animatable.asState();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateFloatAsState(float f, androidx.compose.animation.core.AnimationSpec animationSpec, float f2, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1091643291);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateFloatAsState)P(2!1,3)446@20047L143:AnimateAsState.kt#pdpnli");
        if ((i2 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        float f3 = (i2 & 4) != 0 ? 0.01f : f2;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1091643291, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = animateFloatAsState(f, animationSpec2, f3, null, function12, composer, (i & 14) | (i & 112) | (i & 896) | ((i << 3) & 57344), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateFloatAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m118animateDpAsStateKz89ssw(float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(704104481);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateDpAsState)P(2:c#ui.unit.Dp)463@20491L142:AnimateAsState.kt#pdpnli");
        if ((i2 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(704104481, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.unit.Dp.m4476boximpl(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m125animateSizeAsStateLjSzlW0(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(875212471);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateSizeAsState)P(2:c#ui.geometry.Size)481@20948L144:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> springSpec = (i2 & 2) != 0 ? sizeDefaultSpring : animationSpec;
        kotlin.jvm.functions.Function1 function12 = (i2 & 4) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(875212471, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Size.m1928boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE), springSpec, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m124animateOffsetAsStateN6fFfp4(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-456513133);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateOffsetAsState)P(2:c#ui.geometry.Offset)499@21419L122:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> springSpec = (i2 & 2) != 0 ? offsetDefaultSpring : animationSpec;
        kotlin.jvm.functions.Function1 function12 = (i2 & 4) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-456513133, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Offset.m1860boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), springSpec, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateRectAsState(androidx.compose.ui.geometry.Rect rect, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-782613967);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateRectAsState)P(2)514@21856L120:AnimateAsState.kt#pdpnli");
        if ((i2 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-782613967, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:513)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(rect, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateIntAsState(int i, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-842612981);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateIntAsState)P(2)529@22285L119:AnimateAsState.kt#pdpnli");
        if ((i3 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-842612981, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:528)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(java.lang.Integer.valueOf(i), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m119animateIntOffsetAsState8f6pmRE(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1010307371);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateIntOffsetAsState)P(2:c#ui.unit.IntOffset)544@22749L125:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> springSpec = (i2 & 2) != 0 ? intOffsetDefaultSpring : animationSpec;
        kotlin.jvm.functions.Function1 function12 = (i2 & 4) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1010307371, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:543)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntOffset.m4601boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), springSpec, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m122animateIntSizeAsStatezTRF_AQ(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1749239765);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateIntSizeAsState)P(2:c#ui.unit.IntSize)559@23207L123:AnimateAsState.kt#pdpnli");
        androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> springSpec = (i2 & 2) != 0 ? intSizeDefaultSpring : animationSpec;
        kotlin.jvm.functions.Function1 function12 = (i2 & 4) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1749239765, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:558)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntSize.m4644boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE), springSpec, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateValueAsState(java.lang.Object obj, androidx.compose.animation.core.TwoWayConverter twoWayConverter, androidx.compose.animation.core.AnimationSpec animationSpec, java.lang.Object obj2, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.AnimationSpec animationSpec2;
        composer.startReplaceableGroup(-846382129);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animateValueAsState)P(2,3!1,4)572@23613L21,575@23730L240:AnimateAsState.kt#pdpnli");
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (androidx.compose.animation.core.AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        java.lang.Object obj3 = (i2 & 8) != 0 ? null : obj2;
        kotlin.jvm.functions.Function1 function12 = (i2 & 16) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-846382129, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:575)");
        }
        int i3 = i & 8;
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", function12, composer, (i3 << 9) | i3 | 24576 | (i & 14) | (i & 112) | (i & 896) | (i & 7168) | ((i << 3) & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> kotlin.jvm.functions.Function1<T, kotlin.Unit> animateValueAsState$lambda$4(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super T, kotlin.Unit>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> androidx.compose.animation.core.AnimationSpec<T> animateValueAsState$lambda$6(androidx.compose.runtime.State<? extends androidx.compose.animation.core.AnimationSpec<T>> state) {
        return state.getValue();
    }
}
