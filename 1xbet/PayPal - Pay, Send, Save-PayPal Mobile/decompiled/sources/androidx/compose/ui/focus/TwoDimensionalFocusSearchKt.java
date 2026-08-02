package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001a;\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a!\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00152\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u001f"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "twoDimensionalFocusSearch", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "findChildCorrespondingToFocusEnter", "p0", "p1", "p2", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/geometry/Rect;ILkotlin/jvm/functions/Function1;)Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/runtime/collection/MutableVector;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/runtime/collection/MutableVector;)V", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "p3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    /* renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final java.lang.Boolean m5702twoDimensionalFocusSearchsMXa3k8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int i2 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return java.lang.Boolean.valueOf(m5700findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, function1));
            }
            if (i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
                return function1.invoke(focusTargetNode);
            }
            if (rect == null) {
                return java.lang.Boolean.valueOf(m5700findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, function1));
            }
            return java.lang.Boolean.valueOf(getHighSpeedVideoFpsRanges(focusTargetNode, rect, i, function1));
        }
        androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i3 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[activeChild.getFocusState().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                if (rect == null) {
                    rect = androidx.compose.ui.focus.FocusTraversalKt.focusRect(activeChild);
                }
                return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap(focusTargetNode, rect, i, function1));
            }
            if (i3 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        java.lang.Boolean m5702twoDimensionalFocusSearchsMXa3k8 = m5702twoDimensionalFocusSearchsMXa3k8(activeChild, i, rect, function1);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(m5702twoDimensionalFocusSearchsMXa3k8, java.lang.Boolean.FALSE)) {
            return m5702twoDimensionalFocusSearchsMXa3k8;
        }
        if (rect == null) {
            if (activeChild.getFocusState() != androidx.compose.ui.focus.FocusStateImpl.ActiveParent) {
                throw new java.lang.IllegalStateException("Searching for active node in inactive hierarchy".toString());
            }
            androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(activeChild);
            if (findActiveFocusNode != null) {
                rect = androidx.compose.ui.focus.FocusTraversalKt.focusRect(findActiveFocusNode);
            } else {
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap(focusTargetNode, rect, i, function1));
    }

    private static final boolean Camera2StreamConfigurationMap(final androidx.compose.ui.focus.FocusTargetNode focusTargetNode, final androidx.compose.ui.geometry.Rect rect, final int i, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (getHighSpeedVideoFpsRanges(focusTargetNode, rect, i, function1)) {
            return true;
        }
        final androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.focus.BeyondBoundsLayoutKt.m5640searchBeyondBoundsOMvw8(focusTargetNode, i, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean highSpeedVideoFpsRanges;
                if (androidx.compose.ui.focus.FocusTargetNode.this == androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode()) {
                    highSpeedVideoFpsRanges = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.getHighSpeedVideoFpsRanges(focusTargetNode, rect, i, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>) function1);
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
                    if (valueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                        return valueOf;
                    }
                    return null;
                }
                return java.lang.Boolean.TRUE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final androidx.compose.ui.focus.FocusTargetNode getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusTargetNode> mutableVector, androidx.compose.ui.geometry.Rect rect, int i) {
        androidx.compose.ui.geometry.Rect translate;
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s())) {
            translate = rect.translate((rect.getRight() - rect.getLeft()) + 1.0f, 0.0f);
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
            translate = rect.translate(-((rect.getRight() - rect.getLeft()) + 1.0f), 0.0f);
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
            translate = rect.translate(0.0f, (rect.getBottom() - rect.getTop()) + 1.0f);
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            translate = rect.translate(0.0f, -((rect.getBottom() - rect.getTop()) + 1.0f));
        } else {
            throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        androidx.compose.ui.focus.FocusTargetNode[] focusTargetNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = null;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i2];
            if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                androidx.compose.ui.geometry.Rect focusRect = androidx.compose.ui.focus.FocusTraversalKt.focusRect(focusTargetNode2);
                if (m5701isBetterCandidateI7lrPNg(focusRect, translate, rect, i)) {
                    focusTargetNode = focusTargetNode2;
                    translate = focusRect;
                }
            }
        }
        return focusTargetNode;
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float Camera2StreamConfigurationMap(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s())) {
            if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            if (f >= 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        if (f >= 0.0f) {
        }
    }

    private static final float getHighSpeedVideoFpsRanges(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        float top;
        float top2;
        float bottom;
        float top3;
        if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s()) && !androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
            if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s()) && !androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            top = rect2.getLeft() + ((rect2.getRight() - rect2.getLeft()) / 2.0f);
            top2 = rect.getLeft();
            bottom = rect.getRight();
            top3 = rect.getLeft();
        } else {
            top = rect2.getTop() + ((rect2.getBottom() - rect2.getTop()) / 2.0f);
            top2 = rect.getTop();
            bottom = rect.getBottom();
            top3 = rect.getTop();
        }
        return top - (top2 + ((bottom - top3) / 2.0f));
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m5701isBetterCandidateI7lrPNg(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, androidx.compose.ui.geometry.Rect rect3, int i) {
        if (!getHighResolutionOutputSizeshNQ4ISI(rect, i, rect3)) {
            return false;
        }
        if (!getHighResolutionOutputSizeshNQ4ISI(rect2, i, rect3) || getHighSpeedVideoFpsRanges(rect3, rect, rect2, i)) {
            return true;
        }
        if (getHighSpeedVideoFpsRanges(rect3, rect2, rect, i)) {
            return false;
        }
        long Camera2StreamConfigurationMap = (long) Camera2StreamConfigurationMap(rect, i, rect3);
        long highSpeedVideoFpsRanges = (long) getHighSpeedVideoFpsRanges(rect, i, rect3);
        long j = (Camera2StreamConfigurationMap * 13 * Camera2StreamConfigurationMap) + (highSpeedVideoFpsRanges * highSpeedVideoFpsRanges);
        long Camera2StreamConfigurationMap2 = (long) Camera2StreamConfigurationMap(rect2, i, rect3);
        long highSpeedVideoFpsRanges2 = (long) getHighSpeedVideoFpsRanges(rect2, i, rect3);
        return j < ((13 * Camera2StreamConfigurationMap2) * Camera2StreamConfigurationMap2) + (highSpeedVideoFpsRanges2 * highSpeedVideoFpsRanges2);
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s()) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s()) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s()) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        r0 = r5.getLeft();
        r6 = r6.getRight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
    
        r0 = r0 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e4, code lost:
    
        if (r0 >= 0.0f) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e6, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s()) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        r5 = r5.getLeft();
        r6 = r7.getLeft();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0125, code lost:
    
        r5 = r5 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0141, code lost:
    
        if (r5 >= 1.0f) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0143, code lost:
    
        r5 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0146, code lost:
    
        if (r0 >= r5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0149, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s()) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r6 = r7.getRight();
        r5 = r5.getRight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
    
        r5 = r6 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s()) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
    
        r5 = r5.getTop();
        r6 = r7.getTop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s()) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0133, code lost:
    
        r6 = r7.getBottom();
        r5 = r5.getBottom();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0153, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s()) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        r6 = r6.getLeft();
        r0 = r5.getRight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
    
        r0 = r6 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        r0 = r5.getTop();
        r6 = r6.getBottom();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(r8, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s()) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        r6 = r6.getTop();
        r0 = r5.getBottom();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015d, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003f, code lost:
    
        if (r5.getRight() <= r7.getLeft()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0058, code lost:
    
        if (r5.getTop() >= r7.getBottom()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0071, code lost:
    
        if (r5.getBottom() <= r7.getTop()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5.getLeft() >= r7.getRight()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, androidx.compose.ui.geometry.Rect rect3, int i) {
        if (getHighSpeedVideoFpsRangesFor(rect3, i, rect) || !getHighSpeedVideoFpsRangesFor(rect2, i, rect)) {
            return false;
        }
        if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s())) {
            if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
                if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
                    if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
                        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m5700findChildCorrespondingToFocusEnterOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.ui.geometry.Rect rect;
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        getHighResolutionOutputSizeshNQ4ISI(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) (mutableVector.getSize() == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s())) {
            i = androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            androidx.compose.ui.geometry.Rect focusRect = androidx.compose.ui.focus.FocusTraversalKt.focusRect(focusTargetNode);
            rect = new androidx.compose.ui.geometry.Rect(focusRect.getLeft(), focusRect.getTop(), focusRect.getLeft(), focusRect.getTop());
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
            androidx.compose.ui.geometry.Rect focusRect2 = androidx.compose.ui.focus.FocusTraversalKt.focusRect(focusTargetNode);
            rect = new androidx.compose.ui.geometry.Rect(focusRect2.getRight(), focusRect2.getBottom(), focusRect2.getRight(), focusRect2.getBottom());
        } else {
            throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusTargetNode>) mutableVector, rect, i);
        if (highSpeedVideoFpsRangesFor != null) {
            return function1.invoke(highSpeedVideoFpsRangesFor).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.geometry.Rect rect, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRangesFor;
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusTargetNode2.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode3.getIsAttached()) {
                                    mutableVector.add(focusTargetNode3);
                                }
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                if (i2 != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        while (mutableVector.getSize() != 0 && (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusTargetNode>) mutableVector, rect, i)) != null) {
            if (highSpeedVideoFpsRangesFor.fetchFocusProperties$ui().getCanFocus()) {
                return function1.invoke(highSpeedVideoFpsRangesFor).booleanValue();
            }
            if (Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, rect, i, function1)) {
                return true;
            }
            mutableVector.remove(highSpeedVideoFpsRangesFor);
        }
        return false;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.DelegatableNode delegatableNode, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusTargetNode> mutableVector) {
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, delegatableNode.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode.getIsAttached()) {
                                    androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
                                    if (!androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getIsDeactivated()) {
                                        if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
                                            mutableVector.add(focusTargetNode);
                                        } else {
                                            getHighResolutionOutputSizeshNQ4ISI(focusTargetNode2, mutableVector);
                                        }
                                    }
                                }
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
