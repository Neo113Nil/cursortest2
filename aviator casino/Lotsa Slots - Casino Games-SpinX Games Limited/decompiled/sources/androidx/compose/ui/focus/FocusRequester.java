package androidx.compose.ui.focus;

/* compiled from: FocusRequester.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u001d\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0083\bJ\r\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "()V", "focusRequesterNodes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "captureFocus", "", "findFocusTarget", "onFound", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "focus", "focus$ui_release", "freeFocus", "requestFocus", "", "restoreFocusedChild", "saveFocusedChild", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRequester {
    public static final int $stable = 0;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> focusRequesterNodes = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.focus.FocusRequesterModifierNode[16], 0);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.focus.FocusRequester.Companion INSTANCE = new androidx.compose.ui.focus.FocusRequester.Companion(null);
    private static final androidx.compose.ui.focus.FocusRequester Default = new androidx.compose.ui.focus.FocusRequester();
    private static final androidx.compose.ui.focus.FocusRequester Cancel = new androidx.compose.ui.focus.FocusRequester();

    public final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        focus$ui_release();
    }

    public final boolean captureFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new java.lang.IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.focus.FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i = 0;
            while (!androidx.compose.ui.focus.FocusRequesterModifierNodeKt.captureFocus(content[i])) {
                i++;
                if (i >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean freeFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new java.lang.IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.focus.FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i = 0;
            while (!androidx.compose.ui.focus.FocusRequesterModifierNodeKt.freeFocus(content[i])) {
                i++;
                if (i >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean saveFocusedChild() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new java.lang.IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.focus.FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i = 0;
            while (!androidx.compose.ui.focus.FocusRequesterModifierNodeKt.saveFocusedChild(content[i])) {
                i++;
                if (i >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean restoreFocusedChild() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new java.lang.IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        androidx.compose.ui.focus.FocusRequesterModifierNode[] content = mutableVector.getContent();
        int i = 0;
        boolean z = false;
        do {
            z = androidx.compose.ui.focus.FocusRequesterModifierNodeKt.restoreFocusedChild(content[i]) || z;
            i++;
        } while (i < size);
        return z;
    }

    /* compiled from: FocusRequester.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "()V", "Cancel", "Landroidx/compose/ui/focus/FocusRequester;", "getCancel$annotations", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "getDefault", "createRefs", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCancel$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.focus.FocusRequester getDefault() {
            return androidx.compose.ui.focus.FocusRequester.Default;
        }

        public final androidx.compose.ui.focus.FocusRequester getCancel() {
            return androidx.compose.ui.focus.FocusRequester.Cancel;
        }

        /* compiled from: FocusRequester.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "()V", "component1", "Landroidx/compose/ui/focus/FocusRequester;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            public static final androidx.compose.ui.focus.FocusRequester.Companion.FocusRequesterFactory INSTANCE = new androidx.compose.ui.focus.FocusRequester.Companion.FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            public final androidx.compose.ui.focus.FocusRequester component1() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component2() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component3() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component4() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component5() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component6() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component7() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component8() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component9() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component10() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component11() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component12() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component13() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component14() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component15() {
                return new androidx.compose.ui.focus.FocusRequester();
            }

            public final androidx.compose.ui.focus.FocusRequester component16() {
                return new androidx.compose.ui.focus.FocusRequester();
            }
        }

        public final androidx.compose.ui.focus.FocusRequester.Companion.FocusRequesterFactory createRefs() {
            return androidx.compose.ui.focus.FocusRequester.Companion.FocusRequesterFactory.INSTANCE;
        }
    }

    private final boolean findFocusTarget(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> onFound) {
        androidx.compose.ui.focus.FocusRequester.Companion companion = INSTANCE;
        if (this == companion.getDefault()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (this == companion.getCancel()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new java.lang.IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        androidx.compose.ui.focus.FocusRequesterModifierNode[] content = mutableVector.getContent();
        int i = 0;
        boolean z = false;
        do {
            androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode = content[i];
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
            }
            androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
            androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
            if (child == null) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
            } else {
                mutableVector2.add(child);
            }
            while (true) {
                if (!mutableVector2.isNotEmpty()) {
                    break;
                }
                androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                    androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                    if (onFound.invoke((androidx.compose.ui.focus.FocusTargetNode) node).booleanValue()) {
                                        z = true;
                                        break;
                                    }
                                } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(node);
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild();
                        }
                    }
                }
            }
            i++;
        } while (i < size);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean focus$ui_release() {
        boolean m1832findChildCorrespondingToFocusEnterOMvw8;
        androidx.compose.ui.focus.FocusRequester.Companion companion = INSTANCE;
        if (this == companion.getDefault()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (this == companion.getCancel()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new java.lang.IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        androidx.compose.ui.focus.FocusRequesterModifierNode[] content = mutableVector.getContent();
        int i = 0;
        boolean z = false;
        do {
            androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode = content[i];
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
            }
            androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
            androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
            if (child == null) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
            } else {
                mutableVector2.add(child);
            }
            while (true) {
                if (!mutableVector2.isNotEmpty()) {
                    break;
                }
                androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                    androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                    androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) node;
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                        m1832findChildCorrespondingToFocusEnterOMvw8 = androidx.compose.ui.focus.FocusTransactionsKt.requestFocus(focusTargetNode);
                                    } else {
                                        m1832findChildCorrespondingToFocusEnterOMvw8 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m1832findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$focus$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode2) {
                                                return java.lang.Boolean.valueOf(androidx.compose.ui.focus.FocusTransactionsKt.requestFocus(focusTargetNode2));
                                            }
                                        });
                                    }
                                    if (m1832findChildCorrespondingToFocusEnterOMvw8) {
                                        z = true;
                                        break;
                                    }
                                } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(node);
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                            }
                        } else {
                            node = node.getChild();
                        }
                    }
                }
            }
            i++;
        } while (i < size);
        return z;
    }
}
