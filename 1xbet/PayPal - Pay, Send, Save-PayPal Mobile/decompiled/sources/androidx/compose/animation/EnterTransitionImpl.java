package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/animation/EnterTransitionImpl;", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/TransitionData;", "p0", "<init>", "(Landroidx/compose/animation/TransitionData;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/TransitionData;", "getData$animation", "()Landroidx/compose/animation/TransitionData;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EnterTransitionImpl extends androidx.compose.animation.EnterTransition {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.animation.TransitionData Camera2StreamConfigurationMap;

    public EnterTransitionImpl(androidx.compose.animation.TransitionData transitionData) {
        super(null);
        this.Camera2StreamConfigurationMap = transitionData;
    }

    @Override // androidx.compose.animation.EnterTransition
    /* renamed from: getData$animation, reason: from getter */
    public final androidx.compose.animation.TransitionData getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }
}
