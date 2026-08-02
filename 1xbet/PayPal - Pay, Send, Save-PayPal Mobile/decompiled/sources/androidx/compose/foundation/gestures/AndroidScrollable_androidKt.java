package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "platformScrollConfig", "(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Landroidx/compose/foundation/gestures/ScrollConfig;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidScrollable_androidKt {
    public static final androidx.compose.foundation.gestures.ScrollConfig platformScrollConfig(androidx.compose.ui.node.CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new androidx.compose.foundation.gestures.AndroidConfig(android.view.ViewConfiguration.get(androidx.compose.ui.node.DelegatableNode_androidKt.requireView(compositionLocalConsumerModifierNode).getContext()));
    }
}
