package androidx.compose.ui.focus;

/* compiled from: TwoDimensionalFocusSearch.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u001a2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a2\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000f\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0016H\u0002\u001a\f\u0010\u0017\u001a\u00020\t*\u00020\tH\u0002\u001a\u001a\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001cH\u0002\u001a.\u0010\u001d\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a2\u0010!\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070#H\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a:\u0010&\u001a\u00020\u0007*\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070#H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a:\u0010*\u001a\u00020\u0007*\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070#H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)\u001a\f\u0010,\u001a\u00020\t*\u00020\tH\u0002\u001a4\u0010-\u001a\u0004\u0018\u00010\u0007*\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070#H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"InvalidFocusDirection", "", "getInvalidFocusDirection$annotations", "()V", "NoActiveChild", "getNoActiveChild$annotations", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "activeNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "bottomRight", "collectAccessibleChildren", "", "Landroidx/compose/ui/node/DelegatableNode;", "accessibleChildren", "Landroidx/compose/runtime/collection/MutableVector;", "findBestCandidate", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "findChildCorrespondingToFocusEnter", "onFound", "Lkotlin/Function1;", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "searchChildren", "searchChildren-4C6V_qg", "topLeft", "twoDimensionalFocusSearch", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    private static final java.lang.String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final java.lang.String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    /* renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final java.lang.Boolean m1836twoDimensionalFocusSearchOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int i2 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return java.lang.Boolean.valueOf(m1832findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, function1));
            }
            if (i2 == 4) {
                if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                    return function1.invoke(focusTargetNode);
                }
                return false;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new java.lang.IllegalStateException(NoActiveChild.toString());
        }
        int i3 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[activeChild.getFocusState().ordinal()];
        if (i3 == 1) {
            java.lang.Boolean m1836twoDimensionalFocusSearchOMvw8 = m1836twoDimensionalFocusSearchOMvw8(activeChild, i, function1);
            return !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) m1836twoDimensionalFocusSearchOMvw8, (java.lang.Object) false) ? m1836twoDimensionalFocusSearchOMvw8 : java.lang.Boolean.valueOf(m1833generateAndSearchChildren4C6V_qg(focusTargetNode, activeNode(activeChild), i, function1));
        }
        if (i3 == 2 || i3 == 3) {
            return java.lang.Boolean.valueOf(m1833generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, i, function1));
        }
        if (i3 == 4) {
            throw new java.lang.IllegalStateException(NoActiveChild.toString());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1833generateAndSearchChildren4C6V_qg(final androidx.compose.ui.focus.FocusTargetNode focusTargetNode, final androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, final int i, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (m1835searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.focus.BeyondBoundsLayoutKt.m1787searchBeyondBoundsOMvw8(focusTargetNode, i, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean m1835searchChildren4C6V_qg;
                m1835searchChildren4C6V_qg = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m1835searchChildren4C6V_qg(androidx.compose.ui.focus.FocusTargetNode.this, focusTargetNode2, i, function1);
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m1835searchChildren4C6V_qg);
                valueOf.getClass();
                if (m1835searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final androidx.compose.ui.focus.FocusTargetNode m1831findBestCandidate4WY_MpI(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusTargetNode> mutableVector, androidx.compose.ui.geometry.Rect rect, int i) {
        androidx.compose.ui.geometry.Rect translate;
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            translate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
            translate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
            translate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
            }
            translate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            androidx.compose.ui.focus.FocusTargetNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = content[i2];
                if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    androidx.compose.ui.geometry.Rect focusRect = androidx.compose.ui.focus.FocusTraversalKt.focusRect(focusTargetNode2);
                    if (m1834isBetterCandidateI7lrPNg(focusRect, translate, rect, i)) {
                        focusTargetNode = focusTargetNode2;
                        translate = focusRect;
                    }
                }
                i2++;
            } while (i2 < size);
        }
        return focusTargetNode;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
            }
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                    throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return java.lang.Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return java.lang.Math.max(0.0f, f);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        float f;
        float top;
        float top2;
        float height;
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
            f = 2;
            top = rect2.getTop() + (rect2.getHeight() / f);
            top2 = rect.getTop();
            height = rect.getHeight();
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s()) && !androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
            }
            f = 2;
            top = rect2.getLeft() + (rect2.getWidth() / f);
            top2 = rect.getLeft();
            height = rect.getWidth();
        }
        return top - (top2 + (height / f));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        long abs = (long) java.lang.Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect));
        long abs2 = (long) java.lang.Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m1834isBetterCandidateI7lrPNg(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, androidx.compose.ui.geometry.Rect rect3, int i) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            return !isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) || m1830beamBeatsI7lrPNg(rect3, rect, rect2, i) || (!m1830beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2));
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
            if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
                return true;
            }
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s()) && !androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        }
        return false;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                    throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return java.lang.Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return java.lang.Math.max(0.0f, f);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(androidx.compose.ui.geometry.Rect rect, int i, androidx.compose.ui.geometry.Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
                    throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            return java.lang.Math.max(1.0f, f);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        return java.lang.Math.max(1.0f, f);
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m1830beamBeatsI7lrPNg(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, androidx.compose.ui.geometry.Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        return !beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect);
    }

    private static final androidx.compose.ui.geometry.Rect topLeft(androidx.compose.ui.geometry.Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    private static final androidx.compose.ui.geometry.Rect bottomRight(androidx.compose.ui.geometry.Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final androidx.compose.ui.focus.FocusTargetNode activeNode(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != androidx.compose.ui.focus.FocusStateImpl.ActiveParent) {
            throw new java.lang.IllegalStateException("Searching for active node in inactive hierarchy".toString());
        }
        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode != null) {
            return findActiveFocusNode;
        }
        throw new java.lang.IllegalStateException(NoActiveChild.toString());
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m1832findChildCorrespondingToFocusEnterOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.ui.geometry.Rect rect;
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) (mutableVector.isEmpty() ? null : mutableVector.getContent()[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s())) {
            i = androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s();
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
            rect = topLeft(androidx.compose.ui.focus.FocusTraversalKt.focusRect(focusTargetNode));
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s()) && !androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
                throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
            }
            rect = bottomRight(androidx.compose.ui.focus.FocusTraversalKt.focusRect(focusTargetNode));
        }
        androidx.compose.ui.focus.FocusTargetNode m1831findBestCandidate4WY_MpI = m1831findBestCandidate4WY_MpI(mutableVector, rect, i);
        if (m1831findBestCandidate4WY_MpI != null) {
            return function1.invoke(m1831findBestCandidate4WY_MpI).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m1835searchChildren4C6V_qg(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.ui.focus.FocusTargetNode m1831findBestCandidate4WY_MpI;
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = focusTargetNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode3.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode3.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode3.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i2 == 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        while (mutableVector.isNotEmpty() && (m1831findBestCandidate4WY_MpI = m1831findBestCandidate4WY_MpI(mutableVector, androidx.compose.ui.focus.FocusTraversalKt.focusRect(focusTargetNode2), i)) != null) {
            if (m1831findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(m1831findBestCandidate4WY_MpI).booleanValue();
            }
            if (m1833generateAndSearchChildren4C6V_qg(m1831findBestCandidate4WY_MpI, focusTargetNode2, i, function1)) {
                return true;
            }
            mutableVector.remove(m1831findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final void collectAccessibleChildren(androidx.compose.ui.node.DelegatableNode delegatableNode, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusTargetNode> mutableVector) {
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode.getIsAttached()) {
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                        mutableVector.add(focusTargetNode);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i == 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
    }
}
