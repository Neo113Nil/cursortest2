package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "modifier", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "", "animateMotionFrameOfReference", "animateBounds", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/BoundsTransform;Z)Landroidx/compose/ui/Modifier;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/BoundsTransform;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimateBoundsModifierKt {
    private static final androidx.compose.animation.BoundsTransform getHighSpeedVideoSizes = new androidx.compose.animation.BoundsTransform() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.BoundsTransform
        public final androidx.compose.animation.core.FiniteAnimationSpec createAnimationSpec(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
            androidx.compose.animation.core.FiniteAnimationSpec spring;
            spring = androidx.compose.animation.core.AnimationSpecKt.spring(1.0f, 400.0f, androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Rect.INSTANCE));
            return spring;
        }
    };

    public static /* synthetic */ androidx.compose.ui.Modifier animateBounds$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.ui.Modifier modifier2, androidx.compose.animation.BoundsTransform boundsTransform, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
        }
        if ((i & 4) != 0) {
            boundsTransform = getHighSpeedVideoSizes;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return animateBounds(modifier, lookaheadScope, modifier2, boundsTransform, z);
    }

    public static final androidx.compose.ui.Modifier animateBounds(androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.ui.Modifier modifier2, androidx.compose.animation.BoundsTransform boundsTransform, boolean z) {
        return modifier.then(new androidx.compose.animation.BoundsAnimationElement(lookaheadScope, boundsTransform, new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$1
            public final long Camera2StreamConfigurationMap(long j, long j2) {
                return j2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.Constraints constraints) {
                return androidx.compose.ui.unit.Constraints.m8542boximpl(Camera2StreamConfigurationMap(intSize.m8776unboximpl(), constraints.getGetHighSpeedVideoFpsRangesFor()));
            }
        }, z)).then(modifier2).then(new androidx.compose.animation.BoundsAnimationElement(lookaheadScope, boundsTransform, new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints>() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ androidx.compose.ui.unit.Constraints invoke(androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.Constraints constraints) {
                return androidx.compose.ui.unit.Constraints.m8542boximpl(Camera2StreamConfigurationMap(intSize.m8776unboximpl(), constraints.getGetHighSpeedVideoFpsRangesFor()));
            }

            public final long Camera2StreamConfigurationMap(long j, long j2) {
                return androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo((int) (j >> 32), (int) (j & 4294967295L));
            }
        }, z));
    }
}
