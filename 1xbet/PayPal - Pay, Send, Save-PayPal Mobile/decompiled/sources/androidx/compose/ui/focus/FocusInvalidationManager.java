package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/node/Owner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Landroidx/compose/ui/focus/FocusOwner;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "()V", "", "hasPendingInvalidation", "()Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/node/Owner;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "getHighSpeedVideoSizes", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.node.Owner getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.focus.FocusOwner getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterSet<androidx.compose.ui.focus.FocusTargetNode> getHighResolutionOutputSizeshNQ4ISI = androidx.collection.ScatterSetKt.mutableScatterSetOf();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterSet<androidx.compose.ui.focus.FocusEventModifierNode> getHighSpeedVideoSizes = androidx.collection.ScatterSetKt.mutableScatterSetOf();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    public FocusInvalidationManager(androidx.compose.ui.focus.FocusOwner focusOwner, androidx.compose.ui.node.Owner owner) {
        this.getHighSpeedVideoFpsRanges = focusOwner;
        this.getHighSpeedVideoFpsRangesFor = owner;
    }

    public final void scheduleInvalidation(androidx.compose.ui.focus.FocusTargetNode node) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.add(node)) {
            scheduleInvalidation();
        }
    }

    public final void scheduleInvalidation(androidx.compose.ui.focus.FocusEventModifierNode node) {
        if (this.getHighSpeedVideoSizes.add(node)) {
            scheduleInvalidation();
        }
    }

    public final void scheduleInvalidation() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.registerOnEndApplyChangesListener(new androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidation$1(this));
        this.Camera2StreamConfigurationMap = true;
    }

    /* renamed from: hasPendingInvalidation, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap() {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = this.getHighSpeedVideoFpsRanges.getActiveFocusTargetNode();
        long j = 128;
        long j2 = 255;
        if (activeFocusTargetNode == null) {
            androidx.collection.MutableScatterSet<androidx.compose.ui.focus.FocusEventModifierNode> mutableScatterSet = this.getHighSpeedVideoSizes;
            java.lang.Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    java.lang.Object[] objArr2 = objArr;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j3 & 255) < j) {
                                ((androidx.compose.ui.focus.FocusEventModifierNode) objArr2[(i << 3) + i3]).onFocusEvent(androidx.compose.ui.focus.FocusStateImpl.Inactive);
                            }
                            j3 >>= 8;
                            i3++;
                            j = 128;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    objArr = objArr2;
                    j = 128;
                }
            }
        } else if (activeFocusTargetNode.getIsAttached()) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.contains(activeFocusTargetNode)) {
                activeFocusTargetNode.invalidateFocus$ui();
            }
            androidx.compose.ui.focus.FocusStateImpl focusState = activeFocusTargetNode.getFocusState();
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = activeFocusTargetNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024) | androidx.compose.ui.node.NodeKind.m7621constructorimpl(4096);
            if (!focusTargetNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            int i4 = 0;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & m7621constructorimpl) != 0) {
                            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024) & node.getKindSet()) != 0) {
                                i4++;
                            }
                            if ((node instanceof androidx.compose.ui.focus.FocusEventModifierNode) && this.getHighSpeedVideoSizes.contains(node)) {
                                if (i4 <= 1) {
                                    ((androidx.compose.ui.focus.FocusEventModifierNode) node).onFocusEvent(focusState);
                                } else {
                                    ((androidx.compose.ui.focus.FocusEventModifierNode) node).onFocusEvent(androidx.compose.ui.focus.FocusStateImpl.ActiveParent);
                                }
                                this.getHighSpeedVideoSizes.remove(node);
                            }
                        }
                        node = node.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            androidx.collection.MutableScatterSet<androidx.compose.ui.focus.FocusEventModifierNode> mutableScatterSet2 = this.getHighSpeedVideoSizes;
            java.lang.Object[] objArr3 = mutableScatterSet2.elements;
            long[] jArr2 = mutableScatterSet2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr2[i5];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & j2) < 128) {
                                ((androidx.compose.ui.focus.FocusEventModifierNode) objArr3[(i5 << 3) + i7]).onFocusEvent(androidx.compose.ui.focus.FocusStateImpl.Inactive);
                            }
                            j4 >>= 8;
                            i7++;
                            j2 = 255;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    }
                    i5++;
                    j2 = 255;
                }
            }
        }
        getHighSpeedVideoFpsRanges();
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighSpeedVideoSizes.clear();
        this.Camera2StreamConfigurationMap = false;
    }

    private final void getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoFpsRanges.getActiveFocusTargetNode() == null || this.getHighSpeedVideoFpsRanges.getRootState() == androidx.compose.ui.focus.FocusStateImpl.Inactive) {
            this.getHighSpeedVideoFpsRanges.clearOwnerFocus();
        }
    }
}
