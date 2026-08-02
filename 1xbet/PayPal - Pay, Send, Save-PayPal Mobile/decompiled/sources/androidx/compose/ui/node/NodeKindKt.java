package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\f¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\n\u001a\u00020\u0007*\u00020\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\n¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\r\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001a\u001a\u0013\u0010 \u001a\u00020\u0007*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!\u001a\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\"\u0010\u0011\"\u001c\u0010%\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010("}, d2 = {"", "Landroidx/compose/ui/node/NodeKind;", "other", "or-64DMado", "(II)I", "or", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains-64DMado", "(II)Z", "contains", "Landroidx/compose/ui/Modifier$Element;", "element", "calculateNodeKindSetFrom", "(Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", "node", "(Landroidx/compose/ui/Modifier$Node;)I", "", "autoInvalidateRemovedNode", "(Landroidx/compose/ui/Modifier$Node;)V", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", "remainingSet", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateNodeIncludingDelegates", "(Landroidx/compose/ui/Modifier$Node;II)V", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)Z", "calculateNodeKindSetFromIncludingDelegates", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "includeSelfInTraversal", "Landroidx/collection/MutableObjectIntMap;", "", "Landroidx/collection/MutableObjectIntMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeKindKt {
    private static final androidx.collection.MutableObjectIntMap<java.lang.Object> getHighSpeedVideoFpsRanges = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf();

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m7629contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m7631or64DMado(int i, int i2) {
        return i | i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int calculateNodeKindSetFrom(androidx.compose.ui.Modifier.Node node) {
        int m7621constructorimpl;
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = getHighSpeedVideoFpsRanges;
        java.lang.Object classKeyForObject = androidx.compose.ui.Actual_jvmKt.classKeyForObject(node);
        int findKeyIndex = mutableObjectIntMap.findKeyIndex(classKeyForObject);
        if (findKeyIndex >= 0) {
            return mutableObjectIntMap.values[findKeyIndex];
        }
        int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1);
        if (node instanceof androidx.compose.ui.node.LayoutModifierNode) {
            m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(2);
        }
        if (node instanceof androidx.compose.ui.node.DrawModifierNode) {
            m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(4);
        }
        if (node instanceof androidx.compose.ui.node.SemanticsModifierNode) {
            m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
        }
        if (node instanceof androidx.compose.ui.node.PointerInputModifierNode) {
            m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
        }
        if (node instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
            m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(32);
        }
        if (node instanceof androidx.compose.ui.node.ParentDataModifierNode) {
            m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(64);
        }
        if (!(node instanceof androidx.compose.ui.layout.OnPlacedNode)) {
            if (!(node instanceof androidx.compose.ui.layout.OnSizeChangedNode)) {
                if (node instanceof androidx.compose.ui.node.LayoutAwareModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(128);
                    m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304);
                }
                if (node instanceof androidx.compose.ui.node.GlobalPositionAwareModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(256);
                }
                if (node instanceof androidx.compose.ui.layout.ApproachLayoutModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(512);
                }
                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
                }
                if (node instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(2048);
                }
                if (node instanceof androidx.compose.ui.focus.FocusEventModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(4096);
                }
                if (node instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(8192);
                }
                if (node instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(16384);
                }
                if (node instanceof androidx.compose.ui.node.CompositionLocalConsumerModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(32768);
                }
                if (node instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(131072);
                }
                if (node instanceof androidx.compose.ui.node.TraversableNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
                }
                if (node instanceof androidx.compose.ui.relocation.BringIntoViewModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(524288);
                }
                if (node instanceof androidx.compose.ui.node.UnplacedAwareModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(1048576);
                }
                if (node instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
                }
                if (node instanceof androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode) {
                    m7621constructorimpl2 |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(8388608);
                }
                mutableObjectIntMap.set(classKeyForObject, m7621constructorimpl2);
                return m7621constructorimpl2;
            }
            m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(128);
        } else {
            m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304);
        }
        m7621constructorimpl2 |= m7621constructorimpl;
        if (node instanceof androidx.compose.ui.node.GlobalPositionAwareModifierNode) {
        }
        if (node instanceof androidx.compose.ui.layout.ApproachLayoutModifierNode) {
        }
        if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
        }
        if (node instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode) {
        }
        if (node instanceof androidx.compose.ui.focus.FocusEventModifierNode) {
        }
        if (node instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
        }
        if (node instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
        }
        if (node instanceof androidx.compose.ui.node.CompositionLocalConsumerModifierNode) {
        }
        if (node instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
        }
        if (node instanceof androidx.compose.ui.node.TraversableNode) {
        }
        if (node instanceof androidx.compose.ui.relocation.BringIntoViewModifierNode) {
        }
        if (node instanceof androidx.compose.ui.node.UnplacedAwareModifierNode) {
        }
        if (node instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
        }
        if (node instanceof androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode) {
        }
        mutableObjectIntMap.set(classKeyForObject, m7621constructorimpl2);
        return m7621constructorimpl2;
    }

    public static final void autoInvalidateRemovedNode(androidx.compose.ui.Modifier.Node node) {
        if (!node.getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(androidx.compose.ui.Modifier.Node node) {
        if (!node.getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(androidx.compose.ui.Modifier.Node node) {
        if (!node.getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(androidx.compose.ui.Modifier.Node node, int i, int i2) {
        if (node instanceof androidx.compose.ui.node.DelegatingNode) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = (androidx.compose.ui.node.DelegatingNode) node;
            getHighSpeedVideoFpsRanges(node, delegatingNode.getSelfKindSet() & i, i2);
            int selfKindSet = delegatingNode.getSelfKindSet();
            for (androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                autoInvalidateNodeIncludingDelegates(delegate, (~selfKindSet) & i, i2);
            }
            return;
        }
        getHighSpeedVideoFpsRanges(node, i & node.getKindSet(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(2) & i) != 0 && (node instanceof androidx.compose.ui.node.LayoutModifierNode)) {
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement((androidx.compose.ui.node.LayoutModifierNode) node);
                if (i2 == 2) {
                    androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(node, androidx.compose.ui.node.NodeKind.m7621constructorimpl(2)).onRelease();
                }
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(128) & i) != 0 && i2 != 2) {
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui();
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304) & i) != 0 && i2 != 2) {
                androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node), false, 1, null);
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(256) & i) != 0 && (node instanceof androidx.compose.ui.node.GlobalPositionAwareModifierNode)) {
                if (i2 == 1) {
                    androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node);
                    requireLayoutNode.setGloballyPositionedObservers(requireLayoutNode.getGloballyPositionedObservers() + 1);
                } else if (i2 == 2) {
                    androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node);
                    requireLayoutNode2.setGloballyPositionedObservers(requireLayoutNode2.getGloballyPositionedObservers() - 1);
                }
                if (i2 != 2) {
                    androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui();
                }
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(4) & i) != 0 && (node instanceof androidx.compose.ui.node.DrawModifierNode)) {
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw((androidx.compose.ui.node.DrawModifierNode) node);
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(8) & i) != 0 && (node instanceof androidx.compose.ui.node.SemanticsModifierNode)) {
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node).setSemanticsInvalidated$ui(true);
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(64) & i) != 0 && (node instanceof androidx.compose.ui.node.ParentDataModifierNode)) {
                androidx.compose.ui.node.ParentDataModifierNodeKt.invalidateParentData((androidx.compose.ui.node.ParentDataModifierNode) node);
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(2048) & i) != 0 && (node instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode)) {
                androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode = (androidx.compose.ui.focus.FocusPropertiesModifierNode) node;
                if (getHighSpeedVideoSizes(focusPropertiesModifierNode)) {
                    androidx.compose.ui.focus.FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                }
            }
            if ((i & androidx.compose.ui.node.NodeKind.m7621constructorimpl(4096)) == 0 || !(node instanceof androidx.compose.ui.focus.FocusEventModifierNode)) {
                return;
            }
            androidx.compose.ui.focus.FocusEventModifierNodeKt.invalidateFocusEvent((androidx.compose.ui.focus.FocusEventModifierNode) node);
        }
    }

    private static final boolean getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode) {
        androidx.compose.ui.node.CanFocusChecker canFocusChecker = androidx.compose.ui.node.CanFocusChecker.INSTANCE;
        androidx.compose.ui.node.CanFocusChecker.getHighSpeedVideoFpsRangesFor();
        focusPropertiesModifierNode.applyFocusProperties(androidx.compose.ui.node.CanFocusChecker.INSTANCE);
        androidx.compose.ui.node.CanFocusChecker canFocusChecker2 = androidx.compose.ui.node.CanFocusChecker.INSTANCE;
        return androidx.compose.ui.node.CanFocusChecker.getHighSpeedVideoFpsRanges();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(androidx.compose.ui.Modifier.Node node) {
        if (node instanceof androidx.compose.ui.node.DelegatingNode) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = (androidx.compose.ui.node.DelegatingNode) node;
            int selfKindSet = delegatingNode.getSelfKindSet();
            for (androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                selfKindSet |= calculateNodeKindSetFromIncludingDelegates(delegate);
            }
            return selfKindSet;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m7630getIncludeSelfInTraversalH91voCI(int i) {
        return ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(128) & i) != 0) | ((i & androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304)) != 0);
    }

    public static final int calculateNodeKindSetFrom(androidx.compose.ui.Modifier.Element element) {
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1);
        if (element instanceof androidx.compose.ui.layout.LayoutModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(2);
        }
        if (element instanceof androidx.compose.ui.draw.DrawModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(4);
        }
        if (element instanceof androidx.compose.ui.semantics.SemanticsModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
        }
        if (element instanceof androidx.compose.ui.input.pointer.PointerInputModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
        }
        if ((element instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) || (element instanceof androidx.compose.ui.modifier.ModifierLocalProvider)) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(32);
        }
        if (element instanceof androidx.compose.ui.focus.FocusEventModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(4096);
        }
        if (element instanceof androidx.compose.ui.focus.FocusOrderModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(2048);
        }
        if (element instanceof androidx.compose.ui.layout.OnGloballyPositionedModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(256);
        }
        if (element instanceof androidx.compose.ui.layout.ParentDataModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(64);
        }
        if (element instanceof androidx.compose.ui.layout.OnPlacedModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304);
        }
        if (element instanceof androidx.compose.ui.layout.OnRemeasuredModifier) {
            m7621constructorimpl |= androidx.compose.ui.node.NodeKind.m7621constructorimpl(128);
        }
        return element instanceof androidx.compose.ui.relocation.BringIntoViewModifierNode ? androidx.compose.ui.node.NodeKind.m7621constructorimpl(524288) | m7621constructorimpl : m7621constructorimpl;
    }
}
