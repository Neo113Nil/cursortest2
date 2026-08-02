package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u0004R$\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008'@aX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008'@aX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0001\u0003\u001d\u001e\u001f"}, d2 = {"Landroidx/compose/animation/core/TransitionState;", "S", "", "<init>", "()V", "Landroidx/compose/animation/core/Transition;", "transition", "", "transitionConfigured$animation_core", "(Landroidx/compose/animation/core/Transition;)V", "transitionRemoved$animation_core", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core", "(Ljava/lang/Object;)V", "currentState", "getTargetState", "setTargetState$animation_core", "targetState", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning$animation_core", "()Z", "setRunning$animation_core", "(Z)V", "isRunning", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/PreventExhaustiveWhenTransitionState;", "Landroidx/compose/animation/core/SeekableTransitionState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TransitionState<S> {
    public static final int $stable = 0;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isRunning;

    public abstract S getCurrentState();

    public abstract S getTargetState();

    public abstract void setCurrentState$animation_core(S s);

    public abstract void setTargetState$animation_core(S s);

    public abstract void transitionConfigured$animation_core(androidx.compose.animation.core.Transition<S> transition);

    public abstract void transitionRemoved$animation_core();

    private TransitionState() {
        this.isRunning = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core() {
        return ((java.lang.Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void setRunning$animation_core(boolean z) {
        this.isRunning.setValue(java.lang.Boolean.valueOf(z));
    }

    public /* synthetic */ TransitionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
