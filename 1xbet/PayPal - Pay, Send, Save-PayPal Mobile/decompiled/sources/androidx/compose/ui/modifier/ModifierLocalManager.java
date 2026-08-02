package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ1\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010!\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010$"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/node/Owner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Landroidx/compose/ui/node/Owner;)V", "", "invalidate", "()V", "triggerUpdates", "Landroidx/compose/ui/Modifier$Node;", "p0", "Landroidx/compose/ui/modifier/ModifierLocal;", "p1", "", "Landroidx/compose/ui/node/BackwardsCompatNode;", "p2", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/modifier/ModifierLocal;Ljava/util/Set;)V", "node", "key", "updatedProvider", "(Landroidx/compose/ui/node/BackwardsCompatNode;Landroidx/compose/ui/modifier/ModifierLocal;)V", "insertedProvider", "removedProvider", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifierLocalManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.node.Owner owner;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.BackwardsCompatNode> getHighSpeedVideoFpsRanges = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.BackwardsCompatNode[16], 0);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> getHighSpeedVideoSizes = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.modifier.ModifierLocal[16], 0);
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> Camera2StreamConfigurationMap = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LayoutNode[16], 0);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.modifier.ModifierLocal<?>> getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.modifier.ModifierLocal[16], 0);

    public ModifierLocalManager(androidx.compose.ui.node.Owner owner) {
        this.owner = owner;
    }

    public final androidx.compose.ui.node.Owner getOwner() {
        return this.owner;
    }

    public final void invalidate() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        this.owner.registerOnEndApplyChangesListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            public final void Camera2StreamConfigurationMap() {
                androidx.compose.ui.modifier.ModifierLocalManager.this.triggerUpdates();
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
    }

    public final void triggerUpdates() {
        this.getHighSpeedVideoFpsRangesFor = false;
        java.util.HashSet hashSet = new java.util.HashSet();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = this.Camera2StreamConfigurationMap;
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal = this.getHighResolutionOutputSizeshNQ4ISI.content[i];
            if (layoutNode.getNodes().getHead().getIsAttached()) {
                getHighSpeedVideoFpsRanges(layoutNode.getNodes().getHead(), modifierLocal, hashSet);
            }
        }
        this.Camera2StreamConfigurationMap.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.BackwardsCompatNode> mutableVector2 = this.getHighSpeedVideoFpsRanges;
        androidx.compose.ui.node.BackwardsCompatNode[] backwardsCompatNodeArr = mutableVector2.content;
        int size2 = mutableVector2.getSize();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = backwardsCompatNodeArr[i2];
            androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal2 = this.getHighSpeedVideoSizes.content[i2];
            if (backwardsCompatNode.getIsAttached()) {
                getHighSpeedVideoFpsRanges(backwardsCompatNode, modifierLocal2, hashSet);
            }
        }
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoSizes.clear();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.node.BackwardsCompatNode) it.next()).updateModifierLocalConsumer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Set, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode>] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static void getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.Node p0, androidx.compose.ui.modifier.ModifierLocal<?> p1, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode> p2) {
        androidx.compose.ui.Modifier.Node node = p0;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(32);
        if (!node.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = node.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node node3 = node2; node3 != null && node3.getIsAttached(); node3 = node3.getChild()) {
                    if ((node3.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = node3;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode = (androidx.compose.ui.modifier.ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode instanceof androidx.compose.ui.node.BackwardsCompatNode) {
                                    androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = (androidx.compose.ui.node.BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.getElement() instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(p1)) {
                                        p2.add(modifierLocalModifierNode);
                                    }
                                }
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui(p1)) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node2, false);
        }
    }

    public final void updatedProvider(androidx.compose.ui.node.BackwardsCompatNode node, androidx.compose.ui.modifier.ModifierLocal<?> key) {
        this.getHighSpeedVideoFpsRanges.add(node);
        this.getHighSpeedVideoSizes.add(key);
        invalidate();
    }

    public final void insertedProvider(androidx.compose.ui.node.BackwardsCompatNode node, androidx.compose.ui.modifier.ModifierLocal<?> key) {
        this.getHighSpeedVideoFpsRanges.add(node);
        this.getHighSpeedVideoSizes.add(key);
        invalidate();
    }

    public final void removedProvider(androidx.compose.ui.node.BackwardsCompatNode node, androidx.compose.ui.modifier.ModifierLocal<?> key) {
        this.Camera2StreamConfigurationMap.add(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node));
        this.getHighResolutionOutputSizeshNQ4ISI.add(key);
        invalidate();
    }
}
