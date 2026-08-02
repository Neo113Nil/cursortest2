package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0018\u001a\u00020\u0017*\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/FocusDirection;", "toFocusDirection", "(I)Landroidx/compose/ui/focus/FocusDirection;", "toAndroidFocusDirection-3ESFkO8", "(I)Ljava/lang/Integer;", "toAndroidFocusDirection", "Landroidx/compose/ui/input/key/KeyEvent;", "toFocusDirection-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "androidLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "toLayoutDirection", "(I)Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/view/View;", "view", "Landroidx/compose/ui/geometry/Rect;", "calculateFocusRectRelativeTo", "(Landroid/view/View;Landroid/view/View;)Landroidx/compose/ui/geometry/Rect;", "direction", "Landroid/graphics/Rect;", "rect", "", "requestInteropFocus", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "", "getHighResolutionOutputSizeshNQ4ISI", "[I", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroid/graphics/Rect;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusInteropUtils_androidKt {
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = new int[2];
    private static final android.graphics.Rect getHighSpeedVideoSizes = new android.graphics.Rect();

    public static final androidx.compose.ui.focus.FocusDirection toFocusDirection(int i) {
        if (i == 1) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s());
        }
        if (i == 2) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s());
        }
        if (i == 17) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s());
        }
        if (i == 33) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s());
        }
        if (i == 66) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s());
        }
        if (i != 130) {
            return null;
        }
        return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s());
    }

    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final java.lang.Integer m5657toAndroidFocusDirection3ESFkO8(int i) {
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
            return 33;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            return 130;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s())) {
            return 17;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
            return 66;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s())) {
            return 2;
        }
        return androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s()) ? 1 : null;
    }

    /* renamed from: toFocusDirection-ZmokQxo, reason: not valid java name */
    public static final androidx.compose.ui.focus.FocusDirection m5658toFocusDirectionZmokQxo(android.view.KeyEvent keyEvent) {
        long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(keyEvent);
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6941getNavigatePreviousEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6939getNavigateNextEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m7017getTabEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.input.key.KeyEvent_androidKt.m7095isShiftPressedZmokQxo(keyEvent) ? androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6858getDirectionRightEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6857getDirectionLeftEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6969getPageDownEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6853getDirectionCenterEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6867getEnterEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6959getNumPadEnterEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s());
        }
        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6796getBackEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6870getEscapeEK5gGoQ())) {
            return androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s());
        }
        return null;
    }

    public static final androidx.compose.ui.unit.LayoutDirection toLayoutDirection(int i) {
        if (i == 0) {
            return androidx.compose.ui.unit.LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return androidx.compose.ui.unit.LayoutDirection.Rtl;
    }

    public static final androidx.compose.ui.geometry.Rect calculateFocusRectRelativeTo(android.view.View view, android.view.View view2) {
        int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        android.graphics.Rect rect = getHighSpeedVideoSizes;
        view.getFocusedRect(rect);
        return new androidx.compose.ui.geometry.Rect(rect.left + f, rect.top + f2, f + rect.left + rect.width(), f2 + rect.top + rect.height());
    }

    public static final boolean requestInteropFocus(android.view.View view, java.lang.Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof androidx.compose.ui.platform.AndroidComposeView) {
            return ((androidx.compose.ui.platform.AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            android.view.View findNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
