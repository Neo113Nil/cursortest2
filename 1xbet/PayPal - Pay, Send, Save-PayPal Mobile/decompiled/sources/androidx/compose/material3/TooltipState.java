package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TooltipState;", "", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", "onDispose", "Landroidx/compose/animation/core/MutableTransitionState;", "", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "transition", "isVisible", "()Z", "isPersistent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TooltipState {
    void dismiss();

    androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> getTransition();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    java.lang.Object show(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    static /* synthetic */ java.lang.Object show$default(androidx.compose.material3.TooltipState tooltipState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return tooltipState.show(mutatePriority, continuation);
    }
}
