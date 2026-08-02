package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u000e\u0010\tR'\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/layout/SystemInsetsPaddingModifierNode;", "Landroidx/compose/foundation/layout/InsetsPaddingModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/compose/foundation/layout/WindowInsets;", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "onAttach", "()V", "onDetach", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SystemInsetsPaddingModifierNode extends androidx.compose.foundation.layout.InsetsPaddingModifierNode implements androidx.compose.ui.node.LayoutModifierNode {
    private kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsetsHolder, ? extends androidx.compose.foundation.layout.WindowInsets> Camera2StreamConfigurationMap;
    public androidx.compose.foundation.layout.WindowInsetsHolder getHighResolutionOutputSizeshNQ4ISI;

    public SystemInsetsPaddingModifierNode(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsetsHolder, ? extends androidx.compose.foundation.layout.WindowInsets> function1) {
        super(androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets());
        this.Camera2StreamConfigurationMap = function1;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        android.view.View requireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this);
        androidx.compose.foundation.layout.WindowInsetsHolder orCreateFor = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.getOrCreateFor(requireView);
        orCreateFor.incrementAccessors(requireView);
        update(this.Camera2StreamConfigurationMap.invoke(orCreateFor));
        this.getHighResolutionOutputSizeshNQ4ISI = orCreateFor;
        super.onAttach();
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode, androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        android.view.View requireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this);
        androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder = this.getHighResolutionOutputSizeshNQ4ISI;
        if (windowInsetsHolder != null) {
            windowInsetsHolder.decrementAccessors(requireView);
        }
        super.onDetach();
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsetsHolder, ? extends androidx.compose.foundation.layout.WindowInsets> p0) {
        if (this.Camera2StreamConfigurationMap != p0) {
            this.Camera2StreamConfigurationMap = p0;
            androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder = this.getHighResolutionOutputSizeshNQ4ISI;
            if (windowInsetsHolder != null) {
                update(p0.invoke(windowInsetsHolder));
            }
        }
    }
}
