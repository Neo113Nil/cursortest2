package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/platform/TestTagNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TestTagNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.SemanticsModifierNode {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public TestTagNode(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
