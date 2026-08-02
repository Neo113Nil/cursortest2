package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequesterImpl;", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "<init>", "()V", "", "show", "hide"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToolbarRequesterImpl extends androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester {
    public static final int $stable = 8;

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public final void show() {
        androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode requireInitialized$foundation = requireInitialized$foundation();
        if (requireInitialized$foundation != null) {
            requireInitialized$foundation.show();
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public final void hide() {
        androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode toolbarHandlerNode = getToolbarHandlerNode();
        if (toolbarHandlerNode != null) {
            toolbarHandlerNode.hide();
        }
    }
}
