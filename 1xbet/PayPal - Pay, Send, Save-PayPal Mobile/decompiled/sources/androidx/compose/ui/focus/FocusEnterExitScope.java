package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "", "cancelFocusChange", "()V", "cancelFocus", "Landroidx/compose/ui/focus/FocusDirection;", "getRequestedFocusDirection-dhqQ-8s", "()I", "requestedFocusDirection", "Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FocusEnterExitScope {
    void cancelFocusChange();

    /* renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo5641getRequestedFocusDirectiondhqQ8s();

    @kotlin.Deprecated(message = "Use cancelFocusChange instead", replaceWith = @kotlin.ReplaceWith(expression = "cancelFocusChange", imports = {}))
    default void cancelFocus() {
        cancelFocusChange();
    }
}
