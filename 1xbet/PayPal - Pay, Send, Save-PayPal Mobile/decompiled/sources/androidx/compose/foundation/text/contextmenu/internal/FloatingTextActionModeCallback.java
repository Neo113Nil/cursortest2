package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "Landroid/view/ActionMode$Callback;", "Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;", "p0", "<init>", "(Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;)V", "Landroid/view/ActionMode;", "Landroid/view/Menu;", "p1", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/View;", "Landroid/graphics/Rect;", "p2", "onGetContentRect", "(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FloatingTextActionModeCallback extends android.view.ActionMode.Callback2 implements android.view.ActionMode.Callback {
    private final androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback getHighResolutionOutputSizeshNQ4ISI;

    public FloatingTextActionModeCallback(androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback textActionModeCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = textActionModeCallback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onCreateActionMode(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onPrepareActionMode(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onActionItemClicked(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.onDestroyActionMode(p0);
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2) {
        androidx.compose.ui.geometry.Rect onGetContentRect = this.getHighResolutionOutputSizeshNQ4ISI.onGetContentRect(p0, p1);
        p2.set(java.lang.Math.round(onGetContentRect.getLeft()), java.lang.Math.round(onGetContentRect.getTop()), java.lang.Math.round(onGetContentRect.getRight()), java.lang.Math.round(onGetContentRect.getBottom()));
    }
}
