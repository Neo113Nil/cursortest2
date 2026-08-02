package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "isComposeRootInScrollableContainer", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "Landroid/view/View;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/View;)Z", "", "TapIndicationDelay", "J", "getTapIndicationDelay", "()J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = android.view.ViewConfiguration.getTapTimeout();

    public static final boolean isComposeRootInScrollableContainer(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.DelegatableNode_androidKt.requireView(delegatableNode));
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
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
}
