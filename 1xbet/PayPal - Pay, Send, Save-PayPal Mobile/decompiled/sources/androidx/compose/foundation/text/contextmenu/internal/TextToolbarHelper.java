package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/TextToolbarHelper;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;", "p1", "Landroid/view/ActionMode;", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;)Landroid/view/ActionMode;", "", "(Landroid/view/ActionMode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextToolbarHelper {
    public static final androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper INSTANCE = new androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelper();

    private TextToolbarHelper() {
    }

    public static android.view.ActionMode getHighSpeedVideoFpsRanges(android.view.View p0, androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback p1) {
        return androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi23.INSTANCE.getHighSpeedVideoFpsRanges(p0, new androidx.compose.foundation.text.contextmenu.internal.FloatingTextActionModeCallback(p1), 1);
    }

    public static void getHighSpeedVideoFpsRanges(android.view.ActionMode p0) {
        androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi23.INSTANCE.getHighSpeedVideoFpsRangesFor(p0);
    }
}
