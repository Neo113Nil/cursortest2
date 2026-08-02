package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/BasicTooltipState;", "", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", "onDispose", "", "isVisible", "()Z", "isPersistent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BasicTooltipState {
    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    java.lang.Object show(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    static /* synthetic */ java.lang.Object show$default(androidx.compose.foundation.BasicTooltipState basicTooltipState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return basicTooltipState.show(mutatePriority, continuation);
    }
}
