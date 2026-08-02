package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarHelperMethods;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/ActionMode$Callback;", "actionModeCallback", "", "type", "Landroid/view/ActionMode;", "startActionMode", "(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "actionMode", "", "invalidateContentRect", "(Landroid/view/ActionMode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextToolbarHelperMethods {
    public static final int $stable = 0;
    public static final androidx.compose.ui.platform.TextToolbarHelperMethods INSTANCE = new androidx.compose.ui.platform.TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    public final android.view.ActionMode startActionMode(android.view.View view, android.view.ActionMode.Callback actionModeCallback, int type) {
        return view.startActionMode(actionModeCallback, type);
    }

    public final void invalidateContentRect(android.view.ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }
}
