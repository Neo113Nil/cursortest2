package coil3.transition;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/transition/Transition;", "", "", "transition", "()V", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Transition {
    void transition();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/transition/Transition$Factory;", "", "Lcoil3/transition/TransitionTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", "Lcoil3/transition/Transition;", "create", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;)Lcoil3/transition/Transition;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final coil3.transition.Transition.Factory.Companion INSTANCE = coil3.transition.Transition.Factory.Companion.Camera2StreamConfigurationMap;
        public static final coil3.transition.Transition.Factory NONE = new coil3.transition.NoneTransition.Factory();

        coil3.transition.Transition create(coil3.transition.TransitionTarget target, coil3.view.ImageResult result);

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcoil3/transition/Transition$Factory$Companion;", "", "<init>", "()V", "Lcoil3/transition/Transition$Factory;", "NONE", "Lcoil3/transition/Transition$Factory;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            static final /* synthetic */ coil3.transition.Transition.Factory.Companion Camera2StreamConfigurationMap = new coil3.transition.Transition.Factory.Companion();

            private Companion() {
            }
        }
    }
}
