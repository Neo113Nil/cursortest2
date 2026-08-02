package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/AnchorFunctions;", "", "<init>", "()V", "", "index", "", "horizontalAnchorIndexToAnchorName", "(I)Ljava/lang/String;", "verticalAnchorIndexToAnchorName"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnchorFunctions {
    public static final int $stable = 0;
    public static final androidx.constraintlayout.compose.AnchorFunctions INSTANCE = new androidx.constraintlayout.compose.AnchorFunctions();

    private AnchorFunctions() {
    }

    public final java.lang.String horizontalAnchorIndexToAnchorName(int index) {
        if (index == 0 || index != 1) {
            return com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP;
        }
        return com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM;
    }

    public final java.lang.String verticalAnchorIndexToAnchorName(int index) {
        if (index == -2) {
            return com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START;
        }
        if (index == -1) {
            return "end";
        }
        if (index == 0) {
            return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
        }
        if (index != 1) {
            return com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START;
        }
        return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
    }
}
