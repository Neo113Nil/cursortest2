package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\fR\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0010\"\u0004\b\u0012\u0010\u0011R(\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018"}, d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "p2", "<init>", "(JJLkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "()V", "onAttach", "onDetach", "getHighSpeedVideoFpsRangesFor", "J", "(J)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnLayoutRectChangedNode extends androidx.compose.ui.Modifier.Node {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public androidx.compose.ui.node.DelegatableNode.RegistrationHandle getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoSizes;

    public OnLayoutRectChangedNode(long j, long j2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = j2;
        this.Camera2StreamConfigurationMap = function1;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    public final void getHighSpeedVideoSizes(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    public final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = function1;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.getHighSpeedVideoFpsRanges;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.getHighSpeedVideoFpsRanges = androidx.compose.ui.layout.OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.getHighSpeedVideoFpsRanges;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.getHighSpeedVideoFpsRanges = null;
    }
}
