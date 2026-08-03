package androidx.compose.ui.node;

/* compiled from: NodeChain.kt */
@kotlin.Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002\u001a$\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0011*\u00020\u0012*\b\u0012\u0004\u0012\u0002H\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0015"}, d2 = {"ActionReplace", "", "ActionReuse", "ActionUpdate", "SentinelHead", "androidx/compose/ui/node/NodeChainKt$SentinelHead$1", "Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;", "actionForModifiers", "prev", "Landroidx/compose/ui/Modifier$Element;", io.ktor.http.LinkHeader.Rel.Next, "fillVector", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier;", "result", "updateUnsafe", "", "T", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ModifierNodeElement;", "node", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;
    private static final androidx.compose.ui.node.NodeChainKt$SentinelHead$1 SentinelHead;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r0 = new androidx.compose.ui.Modifier.Node() { // from class: androidx.compose.ui.node.NodeChainKt$SentinelHead$1
            public java.lang.String toString() {
                return "<Head>";
            }
        };
        r0.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = r0;
    }

    public static final int actionForModifiers(androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Element element2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(element, element2)) {
            return 2;
        }
        return (androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(element, element2) || ((element instanceof androidx.compose.ui.node.ForceUpdateElement) && androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(((androidx.compose.ui.node.ForceUpdateElement) element).getOriginal(), element2))) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends androidx.compose.ui.Modifier.Node> void updateUnsafe(androidx.compose.ui.node.ModifierNodeElement<T> modifierNodeElement, androidx.compose.ui.Modifier.Node node) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.update(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> fillVector(androidx.compose.ui.Modifier modifier, final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector) {
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier[kotlin.ranges.RangesKt.coerceAtLeast(mutableVector.getSize(), 16)], 0);
        mutableVector2.add(modifier);
        kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1 = null;
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier modifier2 = (androidx.compose.ui.Modifier) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifier2 instanceof androidx.compose.ui.CombinedModifier) {
                androidx.compose.ui.CombinedModifier combinedModifier = (androidx.compose.ui.CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner());
                mutableVector2.add(combinedModifier.getOuter());
            } else if (modifier2 instanceof androidx.compose.ui.Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                if (function1 == null) {
                    function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier.Element, java.lang.Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Boolean invoke(androidx.compose.ui.Modifier.Element element) {
                            mutableVector.add(element);
                            return true;
                        }
                    };
                }
                modifier2.all(function1);
                function1 = function1;
            }
        }
        return mutableVector;
    }
}
