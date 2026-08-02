package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aI\u0010\b\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012&\b\u0002\u0010\u0007\u001a \u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\b\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2&\b\u0002\u0010\u0007\u001a \u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\f\"\u001a\u0010\r\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "finishedListener", "animateContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "alignment", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "InvalidSize", "J", "getInvalidSize", "()J", "", "isValid-ozmzZPI", "(J)Z", "isValid"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimationModifierKt {
    private static final long InvalidSize = androidx.compose.ui.unit.IntSize.m8767constructorimpl(-9223372034707292160L);

    public static /* synthetic */ androidx.compose.ui.Modifier animateContentSize$default(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, function2);
    }

    public static final androidx.compose.ui.Modifier animateContentSize(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function2) {
        return androidx.compose.ui.draw.ClipKt.clipToBounds(modifier).then(new androidx.compose.animation.SizeAnimationModifierElement(finiteAnimationSpec, androidx.compose.ui.Alignment.INSTANCE.getTopStart(), function2));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier animateContentSize$default(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, alignment, function2);
    }

    public static final androidx.compose.ui.Modifier animateContentSize(androidx.compose.ui.Modifier modifier, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> finiteAnimationSpec, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function2) {
        return androidx.compose.ui.draw.ClipKt.clipToBounds(modifier).then(new androidx.compose.animation.SizeAnimationModifierElement(finiteAnimationSpec, alignment, function2));
    }

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    /* renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m1118isValidozmzZPI(long j) {
        return !androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, InvalidSize);
    }
}
