package androidx.compose.ui.modifier;

/* compiled from: ModifierLocalModifierNode.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J)\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\t2\u0006\u0010\u000f\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/DelegatableNode;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "current", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "provide", "", com.ironsource.X3.i.W, "value", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ModifierLocalModifierNode extends androidx.compose.ui.modifier.ModifierLocalReadScope, androidx.compose.ui.node.DelegatableNode {
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    <T> T getCurrent(androidx.compose.ui.modifier.ModifierLocal<T> modifierLocal);

    androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues();

    <T> void provide(androidx.compose.ui.modifier.ModifierLocal<T> key, T value);

    /* compiled from: ModifierLocalModifierNode.kt */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$provide(androidx.compose.ui.modifier.ModifierLocalModifierNode _this, androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
            if (_this.getProvidedValues() == androidx.compose.ui.modifier.EmptyMap.INSTANCE) {
                throw new java.lang.IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
            }
            if (!_this.getProvidedValues().contains$ui_release(modifierLocal)) {
                throw new java.lang.IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.").toString());
            }
            _this.getProvidedValues().mo3493set$ui_release(modifierLocal, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r3v9 */
        public static java.lang.Object $default$getCurrent(androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocal modifierLocal) {
            androidx.compose.ui.node.NodeChain nodes;
            if (!modifierLocalModifierNode.getNode().getIsAttached()) {
                throw new java.lang.IllegalArgumentException("ModifierLocal accessed from an unattached node".toString());
            }
            androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode2 = modifierLocalModifierNode;
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(32);
            if (!modifierLocalModifierNode2.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent = modifierLocalModifierNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(modifierLocalModifierNode2);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                    androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode3 = (androidx.compose.ui.modifier.ModifierLocalModifierNode) delegatingNode;
                                    if (modifierLocalModifierNode3.getProvidedValues().contains$ui_release(modifierLocal)) {
                                        return modifierLocalModifierNode3.getProvidedValues().get$ui_release(modifierLocal);
                                    }
                                } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNode = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(delegatingNode);
                                                    }
                                                    delegatingNode = 0;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    }
}
