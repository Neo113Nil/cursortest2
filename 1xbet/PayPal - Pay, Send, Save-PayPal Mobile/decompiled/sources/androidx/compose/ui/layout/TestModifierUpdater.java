package androidx.compose.ui.layout;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "updateModifier", "(Landroidx/compose/ui/Modifier;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/node/LayoutNode;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TestModifierUpdater {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LayoutNode getHighSpeedVideoSizes;

    public TestModifierUpdater(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.getHighSpeedVideoSizes = layoutNode;
    }

    public final void updateModifier(androidx.compose.ui.Modifier modifier) {
        this.getHighSpeedVideoSizes.setModifier(modifier);
    }
}
