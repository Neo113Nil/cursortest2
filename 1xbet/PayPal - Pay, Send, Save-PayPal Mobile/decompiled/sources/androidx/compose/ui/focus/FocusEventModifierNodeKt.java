package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifierNode;", "", "invalidateFocusEvent", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusState;", "getFocusState", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)Landroidx/compose/ui/focus/FocusState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusEventModifierNodeKt {
    public static final void invalidateFocusEvent(androidx.compose.ui.focus.FocusEventModifierNode focusEventModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusEventModifierNode).getFocusOwner().scheduleInvalidation(focusEventModifierNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x00aa, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.focus.FocusState getFocusState(androidx.compose.ui.focus.FocusEventModifierNode focusEventModifierNode) {
        androidx.compose.ui.focus.FocusEventModifierNode focusEventModifierNode2 = focusEventModifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusEventModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                androidx.compose.ui.focus.FocusStateImpl focusState = ((androidx.compose.ui.focus.FocusTargetNode) node).getFocusState();
                int i = androidx.compose.ui.focus.FocusEventModifierNodeKt.WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return focusState;
                }
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i2 = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = null;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!focusEventModifierNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusEventModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusEventModifierNode2.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, node2, false);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusStateImpl focusState2 = ((androidx.compose.ui.focus.FocusTargetNode) node2).getFocusState();
                                int i3 = androidx.compose.ui.focus.FocusEventModifierNodeKt.WhenMappings.$EnumSwitchMapping$0[focusState2.ordinal()];
                                if (i3 == 1 || i3 == 2 || i3 == 3) {
                                    return focusState2;
                                }
                                if (i3 != 4) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                            } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i4 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m7621constructorimpl) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            node2 = delegate2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate2);
                                            }
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
        return androidx.compose.ui.focus.FocusStateImpl.Inactive;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
