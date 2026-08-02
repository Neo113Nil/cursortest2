package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "", "<init>", "()V", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "requireInitialized$foundation", "()Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "", "show", "hide", "toolbarHandlerNode", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "getToolbarHandlerNode$foundation", "setToolbarHandlerNode$foundation", "(Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;)V", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "toolbarHandlerState", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "getToolbarHandlerState$foundation", "()Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "setToolbarHandlerState$foundation", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ToolbarRequester {
    public static final int $stable = 8;
    private androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode toolbarHandlerNode;
    private androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState toolbarHandlerState = androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState.Uninitialized;

    public abstract void hide();

    public abstract void show();

    /* renamed from: getToolbarHandlerNode$foundation, reason: from getter */
    public final androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode getToolbarHandlerNode() {
        return this.toolbarHandlerNode;
    }

    public final void setToolbarHandlerNode$foundation(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        this.toolbarHandlerNode = textContextMenuToolbarHandlerNode;
    }

    /* renamed from: getToolbarHandlerState$foundation, reason: from getter */
    public final androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState getToolbarHandlerState() {
        return this.toolbarHandlerState;
    }

    public final void setToolbarHandlerState$foundation(androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState toolbarHandlerState) {
        this.toolbarHandlerState = toolbarHandlerState;
    }

    public final androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode requireInitialized$foundation() {
        if (this.toolbarHandlerState == androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState.Uninitialized) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("ToolbarRequester is not initialized.");
        }
        return this.toolbarHandlerNode;
    }
}
