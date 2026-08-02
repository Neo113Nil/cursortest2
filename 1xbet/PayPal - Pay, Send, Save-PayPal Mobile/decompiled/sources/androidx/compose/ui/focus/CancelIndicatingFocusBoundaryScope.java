package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010"}, d2 = {"Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Landroidx/compose/ui/focus/FocusDirection;", "requestedFocusDirection", "<init>", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "cancelFocusChange", "()V", com.visa.cbp.getEncExpo.warmup, "getRequestedFocusDirection-dhqQ-8s", "()I", "", "p0", "isCanceled", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CancelIndicatingFocusBoundaryScope implements androidx.compose.ui.focus.FocusEnterExitScope {
    public static final int $stable = 8;
    private boolean isCanceled;
    private final int requestedFocusDirection;

    private CancelIndicatingFocusBoundaryScope(int i) {
        this.requestedFocusDirection = i;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    /* renamed from: getRequestedFocusDirection-dhqQ-8s, reason: not valid java name and from getter */
    public final int getRequestedFocusDirection() {
        return this.requestedFocusDirection;
    }

    /* renamed from: isCanceled, reason: from getter */
    public final boolean getIsCanceled() {
        return this.isCanceled;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    public final void cancelFocusChange() {
        this.isCanceled = true;
    }

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
