package androidx.compose.ui.focus;

@kotlin.Deprecated(message = "Use FocusProperties instead")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010\"\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusOrder;", "", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "<init>", "(Landroidx/compose/ui/focus/FocusProperties;)V", "()V", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/focus/FocusProperties;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/focus/FocusRequester;", io.ktor.http.LinkHeader.Rel.Next, "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "getPrevious", "setPrevious", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP, "getUp", "setUp", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "getDown", "setDown", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "getLeft", "setLeft", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "getRight", "setRight", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getStart", "setStart", "end", "getEnd", "setEnd"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOrder {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.focus.FocusProperties getHighSpeedVideoSizes;

    public FocusOrder(androidx.compose.ui.focus.FocusProperties focusProperties) {
        this.getHighSpeedVideoSizes = focusProperties;
    }

    public FocusOrder() {
        this(new androidx.compose.ui.focus.FocusPropertiesImpl());
    }

    public final androidx.compose.ui.focus.FocusRequester getNext() {
        return this.getHighSpeedVideoSizes.getNext();
    }

    public final void setNext(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setNext(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getPrevious() {
        return this.getHighSpeedVideoSizes.getPrevious();
    }

    public final void setPrevious(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setPrevious(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getUp() {
        return this.getHighSpeedVideoSizes.getUp();
    }

    public final void setUp(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setUp(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getDown() {
        return this.getHighSpeedVideoSizes.getDown();
    }

    public final void setDown(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setDown(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getLeft() {
        return this.getHighSpeedVideoSizes.getLeft();
    }

    public final void setLeft(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setLeft(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getRight() {
        return this.getHighSpeedVideoSizes.getRight();
    }

    public final void setRight(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setRight(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getStart() {
        return this.getHighSpeedVideoSizes.getStart();
    }

    public final void setStart(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setStart(focusRequester);
    }

    public final androidx.compose.ui.focus.FocusRequester getEnd() {
        return this.getHighSpeedVideoSizes.getEnd();
    }

    public final void setEnd(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoSizes.setEnd(focusRequester);
    }
}
