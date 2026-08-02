package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "isAccessibilityIgnoredLink", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsNode_androidKt {
    public static final boolean isAccessibilityIgnoredLink(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLinkTestMarker());
    }
}
