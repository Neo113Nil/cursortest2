package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000b\u001a\u00020\b*\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "saveFocusedChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "restoreFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinFocusedChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "fallback", "focusRestorer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "onRestoreFailed", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRestorerKt {
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0043, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean saveFocusedChild(final androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getFocusState().getHasFocus()) {
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusTargetNode2.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
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
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode3.getFocusState().getHasFocus()) {
                                    focusTargetNode.setPreviouslyFocusedChildHash(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode3).getCompositeKeyHash());
                                    androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry = (androidx.compose.runtime.saveable.SaveableStateRegistry) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode, androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                                    if (saveableStateRegistry != null) {
                                        saveableStateRegistry.registerProvider("previouslyFocusedChildHash", new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return java.lang.Integer.valueOf(androidx.compose.ui.focus.FocusTargetNode.this.getPreviouslyFocusedChildHash());
                                            }

                                            {
                                                super(0);
                                            }
                                        });
                                    }
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
                                if (i != 1) {
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
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0068, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry;
        java.lang.Object consumeRestored;
        if (focusTargetNode.getPreviouslyFocusedChildHash() == 0 && (saveableStateRegistry = (androidx.compose.runtime.saveable.SaveableStateRegistry) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode, androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry())) != null && (consumeRestored = saveableStateRegistry.consumeRestored("previouslyFocusedChildHash")) != null) {
            focusTargetNode.setPreviouslyFocusedChildHash(((java.lang.Integer) consumeRestored).intValue());
        }
        if (focusTargetNode.getPreviouslyFocusedChildHash() == 0) {
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusTargetNode2.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
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
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode3.getIsAttached() && androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode3).getCompositeKeyHash() == focusTargetNode.getPreviouslyFocusedChildHash()) {
                                    return androidx.compose.ui.ComposeUiFlags.isRequestFocusOnNonFocusableFocusTargetEnabled ? restoreFocusedChild(focusTargetNode3) || (focusTargetNode3.fetchFocusProperties$ui().getCanFocus() && androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode3, 0, 1, null)) : restoreFocusedChild(focusTargetNode3) || androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(focusTargetNode3, 0, 1, null);
                                }
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i != 1) {
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
        return false;
    }

    public static final androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinFocusedChild(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.layout.PinnableContainer pinnableContainer;
        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode == null || (pinnableContainer = (androidx.compose.ui.layout.PinnableContainer) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(findActiveFocusNode, androidx.compose.ui.layout.PinnableContainerKt.getLocalPinnableContainer())) == null) {
            return null;
        }
        return pinnableContainer.pin();
    }

    public static /* synthetic */ androidx.compose.ui.Modifier focusRestorer$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.focus.FocusRequester focusRequester, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    public static final androidx.compose.ui.Modifier focusRestorer(androidx.compose.ui.Modifier modifier, androidx.compose.ui.focus.FocusRequester focusRequester) {
        return modifier.then(new androidx.compose.ui.focus.FocusRestorerElement(focusRequester));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use focusRestorer(FocusRequester) instead", replaceWith = @kotlin.ReplaceWith(expression = "this.focusRestorer(onRestoreFailed())", imports = {}))
    public static final androidx.compose.ui.Modifier focusRestorer(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusRequester> function0) {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        if (function0 == null || (focusRequester = function0.invoke()) == null) {
            focusRequester = androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }
}
