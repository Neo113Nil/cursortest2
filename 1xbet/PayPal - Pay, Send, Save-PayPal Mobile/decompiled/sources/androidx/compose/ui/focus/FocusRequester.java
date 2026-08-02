package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0011J$\u0010\u0015\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0080\b¢\u0006\u0004\b\u0015\u0010\u000fR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "<init>", "()V", "", "requestFocus", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", "requestFocus-3ESFkO8", "(I)Z", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "findFocusTargetNode$ui", "(Lkotlin/jvm/functions/Function1;)Z", "captureFocus", "()Z", "freeFocus", "saveFocusedChild", "restoreFocusedChild", "findFocusTarget$ui", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "focusRequesterNodes", "Landroidx/compose/runtime/collection/MutableVector;", "getFocusRequesterNodes$ui", "()Landroidx/compose/runtime/collection/MutableVector;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRequester {
    public static final int $stable = 0;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> focusRequesterNodes = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.focus.FocusRequesterModifierNode[16], 0);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.focus.FocusRequester.Companion INSTANCE = new androidx.compose.ui.focus.FocusRequester.Companion(null);
    private static final androidx.compose.ui.focus.FocusRequester Default = new androidx.compose.ui.focus.FocusRequester();
    private static final androidx.compose.ui.focus.FocusRequester Cancel = new androidx.compose.ui.focus.FocusRequester();
    private static final androidx.compose.ui.focus.FocusRequester Redirect = new androidx.compose.ui.focus.FocusRequester();

    public final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> getFocusRequesterNodes$ui() {
        return this.focusRequesterNodes;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "use the version the has a FocusDirection", replaceWith = @kotlin.ReplaceWith(expression = "this.requestFocus()", imports = {}))
    public final /* synthetic */ void requestFocus() {
        m5671requestFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s());
    }

    /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    public static /* synthetic */ boolean m5670requestFocus3ESFkO8$default(androidx.compose.ui.focus.FocusRequester focusRequester, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s();
        }
        return focusRequester.m5671requestFocus3ESFkO8(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0073, code lost:
    
        continue;
     */
    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5671requestFocus3ESFkO8(final int focusDirection) {
        if (!androidx.compose.ui.ComposeUiFlags.isRequestFocusOnNonFocusableFocusTargetEnabled) {
            return findFocusTargetNode$ui(new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$requestFocus$2
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                    return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(focusDirection));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        androidx.compose.ui.focus.FocusRequester.Companion companion = INSTANCE;
        if (this == companion.getDefault()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (this == companion.getCancel()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (getFocusRequesterNodes$ui().getSize() == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> focusRequesterNodes$ui = getFocusRequesterNodes$ui();
        androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = focusRequesterNodes$ui.content;
        int size = focusRequesterNodes$ui.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode = focusRequesterModifierNodeArr[i];
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
            androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
            if (child == null) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusRequesterModifierNode.getNode(), false);
            } else {
                mutableVector.add(child);
            }
            while (true) {
                if (mutableVector.getSize() != 0) {
                    androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                    if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                        androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            }
                            if ((node.getKindSet() & m7621constructorimpl) != 0) {
                                androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                        if (((androidx.compose.ui.focus.FocusTargetNode) node).mo5674requestFocus3ESFkO8(focusDirection)) {
                                            z = true;
                                            break;
                                        }
                                    } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node = delegate;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(node);
                                                        }
                                                        node = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(delegate);
                                                    }
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                                }
                            } else {
                                node = node.getChild();
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public final boolean captureFocus() {
        if (this.focusRequesterNodes.getSize() == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            if (androidx.compose.ui.focus.FocusRequesterModifierNodeKt.captureFocus(focusRequesterModifierNodeArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean freeFocus() {
        if (this.focusRequesterNodes.getSize() == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            if (androidx.compose.ui.focus.FocusRequesterModifierNodeKt.freeFocus(focusRequesterModifierNodeArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean saveFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            if (androidx.compose.ui.focus.FocusRequesterModifierNodeKt.saveFocusedChild(focusRequesterModifierNodeArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean restoreFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = androidx.compose.ui.focus.FocusRequesterModifierNodeKt.restoreFocusedChild(focusRequesterModifierNodeArr[i]) || z;
        }
        return z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "createRefs", "()Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "Landroidx/compose/ui/focus/FocusRequester;", "Default", "Landroidx/compose/ui/focus/FocusRequester;", "getDefault", "()Landroidx/compose/ui/focus/FocusRequester;", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "getCancel", "Redirect", "getRedirect$ui", "FocusRequesterFactory"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.focus.FocusRequester getDefault() {
            return androidx.compose.ui.focus.FocusRequester.Default;
        }

        public final androidx.compose.ui.focus.FocusRequester getCancel() {
            return androidx.compose.ui.focus.FocusRequester.Cancel;
        }

        public final androidx.compose.ui.focus.FocusRequester getRedirect$ui() {
            return androidx.compose.ui.focus.FocusRequester.Redirect;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0006"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusRequester;", "component1", "()Landroidx/compose/ui/focus/FocusRequester;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
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

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean findFocusTarget$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> onFound) {
        androidx.compose.ui.focus.FocusRequester.Companion companion = INSTANCE;
        if (this == companion.getDefault()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (this == companion.getCancel()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (getFocusRequesterNodes$ui().getSize() == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> focusRequesterNodes$ui = getFocusRequesterNodes$ui();
        androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = focusRequesterNodes$ui.content;
        int size = focusRequesterNodes$ui.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode = focusRequesterModifierNodeArr[i];
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
            androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
            if (child == null) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusRequesterModifierNode.getNode(), false);
            } else {
                mutableVector.add(child);
            }
            while (true) {
                if (mutableVector.getSize() != 0) {
                    androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                    if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                        androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            }
                            if ((node.getKindSet() & m7621constructorimpl) != 0) {
                                androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                        if (onFound.invoke((androidx.compose.ui.focus.FocusTargetNode) node).booleanValue()) {
                                            z = true;
                                            break;
                                        }
                                    } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node = delegate;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(node);
                                                        }
                                                        node = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(delegate);
                                                    }
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                                }
                            } else {
                                node = node.getChild();
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x006f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean findFocusTargetNode$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> onFound) {
        boolean m5700findChildCorrespondingToFocusEnterOMvw8;
        androidx.compose.ui.focus.FocusRequester.Companion companion = INSTANCE;
        if (this == companion.getDefault()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (this == companion.getCancel()) {
            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (getFocusRequesterNodes$ui().getSize() == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> focusRequesterNodes$ui = getFocusRequesterNodes$ui();
        androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = focusRequesterNodes$ui.content;
        int size = focusRequesterNodes$ui.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode = focusRequesterModifierNodeArr[i];
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
            androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
            if (child == null) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusRequesterModifierNode.getNode(), false);
            } else {
                mutableVector.add(child);
            }
            while (true) {
                if (mutableVector.getSize() != 0) {
                    androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                    if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                        androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            }
                            if ((node.getKindSet() & m7621constructorimpl) != 0) {
                                androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                                while (node != null) {
                                    if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) node;
                                        if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
                                            m5700findChildCorrespondingToFocusEnterOMvw8 = onFound.invoke(focusTargetNode).booleanValue();
                                        } else {
                                            m5700findChildCorrespondingToFocusEnterOMvw8 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5700findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s(), onFound);
                                        }
                                        if (m5700findChildCorrespondingToFocusEnterOMvw8) {
                                            z = true;
                                            break;
                                        }
                                    } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node = delegate;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(node);
                                                        }
                                                        node = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(delegate);
                                                    }
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                                }
                            } else {
                                node = node.getChild();
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
