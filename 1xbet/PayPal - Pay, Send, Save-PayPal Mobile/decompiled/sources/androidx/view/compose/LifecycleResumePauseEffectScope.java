package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0019\b\u0004\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "onPauseOrDisposeEffect", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "onPauseOrDispose", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleResumePauseEffectScope implements androidx.view.LifecycleOwner {
    public static final int $stable = 8;
    private final androidx.view.Lifecycle lifecycle;

    public LifecycleResumePauseEffectScope(androidx.view.Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.view.LifecycleOwner
    public final androidx.view.Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final androidx.view.compose.LifecyclePauseOrDisposeEffectResult onPauseOrDispose(final kotlin.jvm.functions.Function1<? super androidx.view.LifecycleOwner, kotlin.Unit> onPauseOrDisposeEffect) {
        return new androidx.view.compose.LifecyclePauseOrDisposeEffectResult() { // from class: androidx.lifecycle.compose.LifecycleResumePauseEffectScope$onPauseOrDispose$1
            @Override // androidx.view.compose.LifecyclePauseOrDisposeEffectResult
            public final void runPauseOrOnDisposeEffect() {
                onPauseOrDisposeEffect.invoke(this);
            }
        };
    }
}
