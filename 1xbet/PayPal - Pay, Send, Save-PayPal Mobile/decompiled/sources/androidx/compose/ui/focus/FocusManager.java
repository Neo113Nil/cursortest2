package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusManager;", "", "", "force", "", "clearFocus", "(Z)V", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "moveFocus-3ESFkO8", "(I)Z", "moveFocus"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FocusManager {
    void clearFocus(boolean force);

    /* renamed from: moveFocus-3ESFkO8, reason: not valid java name */
    boolean mo5659moveFocus3ESFkO8(int focusDirection);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void clearFocus$default(androidx.compose.ui.focus.FocusManager focusManager, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        focusManager.clearFocus(z);
    }
}
