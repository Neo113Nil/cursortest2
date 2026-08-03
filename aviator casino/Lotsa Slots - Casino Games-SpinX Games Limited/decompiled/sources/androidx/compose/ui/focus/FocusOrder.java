package androidx.compose.ui.focus;

/* compiled from: FocusOrderModifier.kt */
@kotlin.Deprecated(message = "Use FocusProperties instead")
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Landroidx/compose/ui/focus/FocusOrder;", "", "()V", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "(Landroidx/compose/ui/focus/FocusProperties;)V", "down", "Landroidx/compose/ui/focus/FocusRequester;", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "left", "getLeft", "setLeft", io.ktor.http.LinkHeader.Rel.Next, "getNext", "setNext", "previous", "getPrevious", "setPrevious", "right", "getRight", "setRight", "start", "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOrder {
    public static final int $stable = 8;
    private final androidx.compose.ui.focus.FocusProperties focusProperties;

    public FocusOrder(androidx.compose.ui.focus.FocusProperties focusProperties) {
        this.focusProperties = focusProperties;
    }

    public FocusOrder() {
        this(new androidx.compose.ui.focus.FocusPropertiesImpl());
    }

    public final androidx.compose.ui.focus.FocusRequester getNext() {
        return this.focusProperties.getNext();
    }

    public final void setNext(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setNext(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getPrevious() {
        return this.focusProperties.getPrevious();
    }

    public final void setPrevious(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setPrevious(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getUp() {
        return this.focusProperties.getUp();
    }

    public final void setUp(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setUp(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getDown() {
        return this.focusProperties.getDown();
    }

    public final void setDown(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setDown(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getLeft() {
        return this.focusProperties.getLeft();
    }

    public final void setLeft(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setLeft(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getRight() {
        return this.focusProperties.getRight();
    }

    public final void setRight(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setRight(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getStart() {
        return this.focusProperties.getStart();
    }

    public final void setStart(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setStart(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getEnd() {
        return this.focusProperties.getEnd();
    }

    public final void setEnd(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusProperties.setEnd(focusRequester);
    }
}
