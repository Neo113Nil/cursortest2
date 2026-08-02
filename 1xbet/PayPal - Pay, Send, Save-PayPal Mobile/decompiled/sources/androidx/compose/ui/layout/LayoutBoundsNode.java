package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/ui/layout/LayoutBoundsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "holder", "<init>", "(Landroidx/compose/ui/layout/LayoutBoundsHolder;)V", "", "forceUpdate", "()V", "onAttach", "onDetach", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "getHolder", "()Landroidx/compose/ui/layout/LayoutBoundsHolder;", "setHolder", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "handle", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "getHandle", "()Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "setHandle", "(Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;)V", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "lastBounds", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "getLastBounds", "()Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "setLastBounds", "(Landroidx/compose/ui/spatial/RelativeLayoutBounds;)V", "Lkotlin/Function1;", "rectChanged", "Lkotlin/jvm/functions/Function1;", "getRectChanged", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutBoundsNode extends androidx.compose.ui.Modifier.Node {
    public static final int $stable = 8;
    private androidx.compose.ui.node.DelegatableNode.RegistrationHandle handle;
    private androidx.compose.ui.layout.LayoutBoundsHolder holder;
    private androidx.compose.ui.spatial.RelativeLayoutBounds lastBounds;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> rectChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LayoutBoundsNode$rectChanged$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds) {
            getHighSpeedVideoFpsRanges(relativeLayoutBounds);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds) {
            androidx.compose.ui.layout.LayoutBoundsNode.this.getHolder().setBounds$ui(relativeLayoutBounds);
            androidx.compose.ui.layout.LayoutBoundsNode.this.setLastBounds(relativeLayoutBounds);
        }

        {
            super(1);
        }
    };

    public LayoutBoundsNode(androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public final androidx.compose.ui.layout.LayoutBoundsHolder getHolder() {
        return this.holder;
    }

    public final void setHolder(androidx.compose.ui.layout.LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public final androidx.compose.ui.node.DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final void setHandle(androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final androidx.compose.ui.spatial.RelativeLayoutBounds getLastBounds() {
        return this.lastBounds;
    }

    public final void setLastBounds(androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds) {
        this.lastBounds = relativeLayoutBounds;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> getRectChanged() {
        return this.rectChanged;
    }

    public final void forceUpdate() {
        this.holder.setBounds$ui(this.lastBounds);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = androidx.compose.ui.layout.OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.holder.setBounds$ui(null);
    }
}
