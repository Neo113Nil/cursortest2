package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u0002J+\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/DelegatableNode;", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "provide", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ModifierLocalModifierNode extends androidx.compose.ui.modifier.ModifierLocalReadScope, androidx.compose.ui.node.DelegatableNode {
    default androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        return androidx.compose.ui.modifier.EmptyMap.INSTANCE;
    }

    default <T> void provide(androidx.compose.ui.modifier.ModifierLocal<T> key, T value) {
        if (getProvidedValues() == androidx.compose.ui.modifier.EmptyMap.INSTANCE) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!getProvidedValues().contains$ui(key)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ");
            sb.append(key);
            sb.append(" was not found.");
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        getProvidedValues().mo7494set$ui(key, value);
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
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    default <T> T getCurrent(androidx.compose.ui.modifier.ModifierLocal<T> modifierLocal) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode = this;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(32);
        if (!modifierLocalModifierNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = modifierLocalModifierNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(modifierLocalModifierNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        ?? r5 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode2 = (androidx.compose.ui.modifier.ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode2.getProvidedValues().contains$ui(modifierLocal)) {
                                    return (T) modifierLocalModifierNode2.getProvidedValues().get$ui(modifierLocal);
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r5 = r5;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (r5 != 0) {
                                                    r5.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (r5 != 0) {
                                                r5.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(r5);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return modifierLocal.getDefaultFactory$ui().invoke();
    }
}
