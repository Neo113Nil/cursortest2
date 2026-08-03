package androidx.compose.foundation;

/* compiled from: Clickable.android.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\r\u001a\u00020\u0005*\u00020\u000eH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0010H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0011"}, d2 = {"TapIndicationDelay", "", "getTapIndicationDelay", "()J", "isClick", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isEnter", "isEnter-ZmokQxo", "isPress", "isPress-ZmokQxo", "isComposeRootInScrollableContainer", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "isInScrollableViewGroup", "Landroid/view/View;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = android.view.ViewConfiguration.getTapTimeout();

    public static final boolean isComposeRootInScrollableContainer(androidx.compose.ui.node.CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return isInScrollableViewGroup((android.view.View) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()));
    }

    private static final boolean isInScrollableViewGroup(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m261isPressZmokQxo(android.view.KeyEvent keyEvent) {
        return androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(keyEvent), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY()) && m260isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m259isClickZmokQxo(android.view.KeyEvent keyEvent) {
        return androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(keyEvent), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3132getKeyUpCS__XNY()) && m260isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m260isEnterZmokQxo(android.view.KeyEvent keyEvent) {
        int m3141getNativeKeyCodeYVgTNJs = androidx.compose.ui.input.key.Key_androidKt.m3141getNativeKeyCodeYVgTNJs(androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(keyEvent));
        return m3141getNativeKeyCodeYVgTNJs == 23 || m3141getNativeKeyCodeYVgTNJs == 66 || m3141getNativeKeyCodeYVgTNJs == 160;
    }
}
