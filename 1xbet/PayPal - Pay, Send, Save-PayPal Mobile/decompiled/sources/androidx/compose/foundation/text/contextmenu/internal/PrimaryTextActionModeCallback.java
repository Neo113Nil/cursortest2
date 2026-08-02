package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/PrimaryTextActionModeCallback;", "Landroid/view/ActionMode$Callback;", "Landroid/view/ActionMode;", "p0", "Landroid/view/Menu;", "p1", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/contextmenu/internal/TextActionModeCallback;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PrimaryTextActionModeCallback implements android.view.ActionMode.Callback {
    private final androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback getHighResolutionOutputSizeshNQ4ISI;

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
}
