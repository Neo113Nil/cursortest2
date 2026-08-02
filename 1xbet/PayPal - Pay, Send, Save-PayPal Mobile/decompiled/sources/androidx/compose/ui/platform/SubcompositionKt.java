package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "container", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/ReusableComposition;", "createSubcomposition", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/PausableComposition;", "createPausableSubcomposition", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/PausableComposition;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubcompositionKt {
    public static final androidx.compose.runtime.ReusableComposition createSubcomposition(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.runtime.CompositionContext compositionContext) {
        return androidx.compose.runtime.CompositionKt.ReusableComposition(androidx.compose.ui.platform.Wrapper_androidKt.createApplier(layoutNode), compositionContext);
    }

    public static final androidx.compose.runtime.PausableComposition createPausableSubcomposition(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.runtime.CompositionContext compositionContext) {
        return androidx.compose.runtime.PausableCompositionKt.PausableComposition(androidx.compose.ui.platform.Wrapper_androidKt.createApplier(layoutNode), compositionContext);
    }
}
