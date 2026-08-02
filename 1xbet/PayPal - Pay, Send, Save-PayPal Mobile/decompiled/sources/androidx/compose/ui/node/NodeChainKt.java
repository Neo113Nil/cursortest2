package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "prev", io.ktor.http.LinkHeader.Rel.Next, "", "actionForModifiers", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/node/ModifierNodeElement;Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/collection/MutableVector;", "p1", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/runtime/collection/MutableVector;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NodeChainKt {
    public static final int actionForModifiers(androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Element element2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(element, element2)) {
            return 2;
        }
        return androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(element, element2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends androidx.compose.ui.Modifier.Node> void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.ModifierNodeElement<T> modifierNodeElement, androidx.compose.ui.Modifier.Node node) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(node, "");
        modifierNodeElement.update(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier> mutableVector2) {
        mutableVector2.add(modifier);
        kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1 = null;
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier removeAt = mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (removeAt instanceof androidx.compose.ui.CombinedModifier) {
                androidx.compose.ui.CombinedModifier combinedModifier = (androidx.compose.ui.CombinedModifier) removeAt;
                mutableVector2.add(combinedModifier.getInner());
                mutableVector2.add(combinedModifier.getOuter());
            } else if (removeAt instanceof androidx.compose.ui.Modifier.Element) {
                mutableVector.add(removeAt);
            } else {
                if (function1 == null) {
                    function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier.Element, java.lang.Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Boolean invoke(androidx.compose.ui.Modifier.Element element) {
                            mutableVector.add(element);
                            return java.lang.Boolean.TRUE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                }
                removeAt.all(function1);
            }
        }
        return mutableVector;
    }
}
