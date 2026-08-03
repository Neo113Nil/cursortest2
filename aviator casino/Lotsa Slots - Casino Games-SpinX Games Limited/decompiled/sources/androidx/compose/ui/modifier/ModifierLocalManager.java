package androidx.compose.ui.modifier;

/* compiled from: ModifierLocalManager.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u0015\u001a\u00020\u0012J*\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00172\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u001b\u001a\u00020\u0012J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroidx/compose/ui/node/Owner;)V", "inserted", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "insertedLocal", "Landroidx/compose/ui/modifier/ModifierLocal;", "invalidated", "", "getOwner", "()Landroidx/compose/ui/node/Owner;", "removed", "Landroidx/compose/ui/node/LayoutNode;", "removedLocal", "insertedProvider", "", "node", com.ironsource.X3.i.W, "invalidate", "invalidateConsumersOfNodeForKey", "Landroidx/compose/ui/Modifier$Node;", "set", "", "removedProvider", "triggerUpdates", "updatedProvider", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifierLocalManager {
    public static final int $stable = 8;
    private boolean invalidated;
    private final androidx.compose.ui.node.Owner owner;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.BackwardsCompatNode> inserted = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.BackwardsCompatNode[16], 0);
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> insertedLocal = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.modifier.ModifierLocal[16], 0);
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> removed = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LayoutNode[16], 0);
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> removedLocal = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.modifier.ModifierLocal[16], 0);

    public ModifierLocalManager(androidx.compose.ui.node.Owner owner) {
        this.owner = owner;
    }

    public final androidx.compose.ui.node.Owner getOwner() {
        return this.owner;
    }

    public final void invalidate() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.registerOnEndApplyChangesListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.ui.modifier.ModifierLocalManager.this.triggerUpdates();
            }
        });
    }

    public final void triggerUpdates() {
        int i = 0;
        this.invalidated = false;
        java.util.HashSet hashSet = new java.util.HashSet();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = this.removed;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                androidx.compose.ui.node.LayoutNode layoutNode = content[i2];
                androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal = this.removedLocal.getContent()[i2];
                if (layoutNode.getNodes().getHead().getIsAttached()) {
                    invalidateConsumersOfNodeForKey(layoutNode.getNodes().getHead(), modifierLocal, hashSet);
                }
                i2++;
            } while (i2 < size);
        }
        this.removed.clear();
        this.removedLocal.clear();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.BackwardsCompatNode> mutableVector2 = this.inserted;
        int size2 = mutableVector2.getSize();
        if (size2 > 0) {
            androidx.compose.ui.node.BackwardsCompatNode[] content2 = mutableVector2.getContent();
            do {
                androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = content2[i];
                androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal2 = this.insertedLocal.getContent()[i];
                if (backwardsCompatNode.getIsAttached()) {
                    invalidateConsumersOfNodeForKey(backwardsCompatNode, modifierLocal2, hashSet);
                }
                i++;
            } while (i < size2);
        }
        this.inserted.clear();
        this.insertedLocal.clear();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.node.BackwardsCompatNode) it.next()).updateModifierLocalConsumer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Set, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode>] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final void invalidateConsumersOfNodeForKey(androidx.compose.ui.Modifier.Node node, androidx.compose.ui.modifier.ModifierLocal<?> key, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode> set) {
        androidx.compose.ui.Modifier.Node node2 = node;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(32);
        if (!node2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = node2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node2.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node3 = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node3.getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node node4 = node3; node4 != null; node4 = node4.getChild()) {
                    if ((node4.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = node4;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode = (androidx.compose.ui.modifier.ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode instanceof androidx.compose.ui.node.BackwardsCompatNode) {
                                    androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = (androidx.compose.ui.node.BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.getElement() instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(key)) {
                                        set.add(modifierLocalModifierNode);
                                    }
                                }
                                if (!(!modifierLocalModifierNode.getProvidedValues().contains$ui_release(key))) {
                                    break;
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
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node3);
        }
    }

    public final void updatedProvider(androidx.compose.ui.node.BackwardsCompatNode node, androidx.compose.ui.modifier.ModifierLocal<?> key) {
        this.inserted.add(node);
        this.insertedLocal.add(key);
        invalidate();
    }

    public final void insertedProvider(androidx.compose.ui.node.BackwardsCompatNode node, androidx.compose.ui.modifier.ModifierLocal<?> key) {
        this.inserted.add(node);
        this.insertedLocal.add(key);
        invalidate();
    }

    public final void removedProvider(androidx.compose.ui.node.BackwardsCompatNode node, androidx.compose.ui.modifier.ModifierLocal<?> key) {
        this.removed.add(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node));
        this.removedLocal.add(key);
        invalidate();
    }
}
