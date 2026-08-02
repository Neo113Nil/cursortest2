package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "startValue", "startVelocity", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/AnimationVector1D;", "createAnimation", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;FF)Landroidx/compose/animation/core/Animation;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatDecayAnimationSpecKt {
    public static /* synthetic */ androidx.compose.animation.core.Animation createAnimation$default(androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return createAnimation(floatDecayAnimationSpec, f, f2);
    }

    public static final androidx.compose.animation.core.Animation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> createAnimation(androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2) {
        return androidx.compose.animation.core.AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2);
    }
}
