package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/TextToolbarHelperApi23;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Landroid/view/ActionMode$Callback;", "p1", "", "p2", "Landroid/view/ActionMode;", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/ActionMode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextToolbarHelperApi23 {
    public static final androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi23 INSTANCE = new androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi23();

    private TextToolbarHelperApi23() {
    }

    public final android.view.ActionMode getHighSpeedVideoFpsRanges(android.view.View p0, android.view.ActionMode.Callback p1, int p2) {
        return p0.startActionMode(p1, p2);
    }

    public final void getHighSpeedVideoFpsRangesFor(android.view.ActionMode p0) {
        p0.invalidateContentRect();
    }
}
