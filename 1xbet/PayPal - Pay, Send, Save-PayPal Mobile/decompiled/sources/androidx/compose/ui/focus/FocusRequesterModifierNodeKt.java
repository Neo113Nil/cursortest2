package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "", "requestFocus", "(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z", "captureFocus", "freeFocus", "saveFocusedChild", "restoreFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinFocusedChild", "(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRequesterModifierNodeKt {
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00b5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean requestFocus(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) node;
                return androidx.compose.ui.ComposeUiFlags.isRequestFocusOnNonFocusableFocusTargetEnabled ? androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode, 0, 1, null) : focusTargetNode.fetchFocusProperties$ui().getCanFocus() ? androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode, 0, 1, null) : androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5700findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierNodeKt$requestFocus$1$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode2) {
                        return java.lang.Boolean.valueOf(androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode2, 0, 1, null));
                    }
                });
            }
            if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
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
                if (i != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusRequesterModifierNode2.getNode(), false);
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
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) node2;
                                return androidx.compose.ui.ComposeUiFlags.isRequestFocusOnNonFocusableFocusTargetEnabled ? androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode2, 0, 1, null) : focusTargetNode2.fetchFocusProperties$ui().getCanFocus() ? androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode2, 0, 1, null) : androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5700findChildCorrespondingToFocusEnterOMvw8(focusTargetNode2, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierNodeKt$requestFocus$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                    public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode22) {
                                        return java.lang.Boolean.valueOf(androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode22, 0, 1, null));
                                    }
                                });
                            }
                            if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0091, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean captureFocus(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusTransactionsKt.captureFocus((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
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
                if (i != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusRequesterModifierNode2.getNode(), false);
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
                                if (androidx.compose.ui.focus.FocusTransactionsKt.captureFocus((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0091, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean freeFocus(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusTransactionsKt.freeFocus((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
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
                if (i != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusRequesterModifierNode2.getNode(), false);
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
                                if (androidx.compose.ui.focus.FocusTransactionsKt.freeFocus((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0091, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean saveFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusRestorerKt.saveFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
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
                if (i != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusRequesterModifierNode2.getNode(), false);
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
                                if (androidx.compose.ui.focus.FocusRestorerKt.saveFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0091, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean restoreFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusRestorerKt.restoreFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
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
                if (i != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusRequesterModifierNode2.getNode(), false);
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
                                if (androidx.compose.ui.focus.FocusRestorerKt.restoreFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0091, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinFocusedChild = androidx.compose.ui.focus.FocusRestorerKt.pinFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node);
                if (pinFocusedChild != null) {
                    return pinFocusedChild;
                }
            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
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
                if (i != 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusRequesterModifierNode2.getNode(), false);
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
                                androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinFocusedChild2 = androidx.compose.ui.focus.FocusRestorerKt.pinFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node2);
                                if (pinFocusedChild2 != null) {
                                    return pinFocusedChild2;
                                }
                            } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        return null;
    }
}
