package androidx.compose.ui.focus;

/* compiled from: FocusRequesterModifierNode.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "freeFocus", "requestFocus", "restoreFocusedChild", "saveFocusedChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRequesterModifierNodeKt {
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean requestFocus(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) node;
                return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? androidx.compose.ui.focus.FocusTransactionsKt.requestFocus(focusTargetNode) : androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m1832findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierNodeKt$requestFocus$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode2) {
                        return java.lang.Boolean.valueOf(androidx.compose.ui.focus.FocusTransactionsKt.requestFocus(focusTargetNode2));
                    }
                });
            }
            if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                if (i == 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) node2;
                                return focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus() ? androidx.compose.ui.focus.FocusTransactionsKt.requestFocus(focusTargetNode2) : androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m1832findChildCorrespondingToFocusEnterOMvw8(focusTargetNode2, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierNodeKt$requestFocus$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode22) {
                                        return java.lang.Boolean.valueOf(androidx.compose.ui.focus.FocusTransactionsKt.requestFocus(focusTargetNode22));
                                    }
                                });
                            }
                            if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i2 == 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean captureFocus(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusTransactionsKt.captureFocus((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                if (i == 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                if (androidx.compose.ui.focus.FocusTransactionsKt.captureFocus((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i2 == 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean freeFocus(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusTransactionsKt.freeFocus((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                if (i == 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                if (androidx.compose.ui.focus.FocusTransactionsKt.freeFocus((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i2 == 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean saveFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusRestorerKt.saveFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                if (i == 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                if (androidx.compose.ui.focus.FocusRestorerKt.saveFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i2 == 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean restoreFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode) {
        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode2 = focusRequesterModifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusRequesterModifierNode2.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                if (androidx.compose.ui.focus.FocusRestorerKt.restoreFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node)) {
                    return true;
                }
            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                if (i == 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        if (!focusRequesterModifierNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode2.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                if (androidx.compose.ui.focus.FocusRestorerKt.restoreFocusedChild((androidx.compose.ui.focus.FocusTargetNode) node2)) {
                                    return true;
                                }
                            } else if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i2 == 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
        return false;
    }
}
