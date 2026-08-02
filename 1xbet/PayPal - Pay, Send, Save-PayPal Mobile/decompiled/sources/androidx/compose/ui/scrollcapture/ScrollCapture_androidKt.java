package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0002\u001a!\u0010\u0017\u001a\u00020\u0001*\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0007H\u0082\b\u001a\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a*\u00020\u0003H\u0002\"E\u0010\t\u001a/\b\u0001\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\n*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"visitScrollCaptureCandidates", "", "fromNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "depth", "", "onCandidate", "Lkotlin/Function1;", "Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "scrollCaptureScrollByAction", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "offset", "Lkotlin/coroutines/Continuation;", "", "getScrollCaptureScrollByAction", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;", "canScrollVertically", "", "getCanScrollVertically", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "visitDescendants", "onNode", "getChildrenForSearch", "", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollCapture_androidKt {
    public static final kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, java.lang.Object> getScrollCaptureScrollByAction(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return (kotlin.jvm.functions.Function2) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollByOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsNode semanticsNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.scrollcapture.ScrollCaptureCandidate, kotlin.Unit> function1) {
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.semantics.SemanticsNode[16], 0);
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> children$ui = semanticsNode.getChildren$ui(false, false, false);
        while (true) {
            mutableVector.addAll(mutableVector.getSize(), (java.util.List) children$ui);
            while (mutableVector.getSize() != 0) {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = (androidx.compose.ui.semantics.SemanticsNode) mutableVector.removeAt(mutableVector.getSize() - 1);
                if (!androidx.compose.ui.semantics.SemanticsOwnerKt.isHidden(semanticsNode2) && !semanticsNode2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getDisabled())) {
                    androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode2.findCoordinatorToGetBounds$ui();
                    if (findCoordinatorToGetBounds$ui != null) {
                        androidx.compose.ui.layout.LayoutCoordinates coordinates = findCoordinatorToGetBounds$ui.getCoordinates();
                        androidx.compose.ui.unit.IntRect roundToIntRect = androidx.compose.ui.unit.IntRectKt.roundToIntRect(androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow$default(coordinates, false, 1, null));
                        if (roundToIntRect.isEmpty()) {
                            continue;
                        } else {
                            kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, java.lang.Object> scrollCaptureScrollByAction = getScrollCaptureScrollByAction(semanticsNode2);
                            androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                            if (scrollCaptureScrollByAction != null && scrollAxisRange != null && scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                                int i2 = 1 + i;
                                function1.invoke(new androidx.compose.ui.scrollcapture.ScrollCaptureCandidate(semanticsNode2, i2, roundToIntRect, coordinates));
                                getHighSpeedVideoSizes(semanticsNode2, i2, function1);
                            } else {
                                children$ui = semanticsNode2.getChildren$ui(false, false, false);
                            }
                        }
                    } else {
                        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Expected semantics node to have a coordinator.");
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }
            return;
        }
    }
}
