package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState;", "", "close", "(Landroidx/compose/foundation/contextmenu/ContextMenuState;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextMenuStateKt {
    public static final void close(androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState) {
        contextMenuState.setStatus(androidx.compose.foundation.contextmenu.ContextMenuState.Status.Closed.INSTANCE);
    }
}
