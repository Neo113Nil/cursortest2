package androidx.compose.ui.layout;

/* compiled from: LookaheadLayoutCoordinates.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0096\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\nH\u0016J\"\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\"\u00100\u001a\u0002012\u0006\u0010$\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b8\u0010-R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "isAttached", "", "()Z", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadOffset", "Landroidx/compose/ui/geometry/Offset;", "getLookaheadOffset-F1C5BW0", "()J", "parentCoordinates", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "get", "", "alignmentLine", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "clipBounds", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "(J)J", "localToWindow", "localToWindow-MK-Hz9U", "transformFrom", "", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements androidx.compose.ui.layout.LayoutCoordinates {
    public static final int $stable = 0;
    private final androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final androidx.compose.ui.node.LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public final androidx.compose.ui.node.NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo3409getSizeYbymL2g() {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return androidx.compose.ui.unit.IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public java.util.Set<androidx.compose.ui.layout.AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public androidx.compose.ui.layout.LayoutCoordinates getParentLayoutCoordinates() {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            throw new java.lang.IllegalStateException(androidx.compose.ui.node.NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
        }
        androidx.compose.ui.node.NodeCoordinator wrappedBy = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public androidx.compose.ui.layout.LayoutCoordinates getParentCoordinates() {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            throw new java.lang.IllegalStateException(androidx.compose.ui.node.NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
        }
        androidx.compose.ui.node.NodeCoordinator wrappedBy = getCoordinator().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m3421getLookaheadOffsetF1C5BW0() {
        androidx.compose.ui.node.LookaheadDelegate rootLookaheadDelegate = androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(mo3410localPositionOfR5De75A(rootLookaheadDelegate.getCoordinates(), androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()), getCoordinator().mo3410localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo3414windowToLocalMKHz9U(long relativeToWindow) {
        return androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(getCoordinator().mo3414windowToLocalMKHz9U(relativeToWindow), m3421getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo3412localToWindowMKHz9U(long relativeToLocal) {
        return getCoordinator().mo3412localToWindowMKHz9U(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(relativeToLocal, m3421getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo3411localToRootMKHz9U(long relativeToLocal) {
        return getCoordinator().mo3411localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(relativeToLocal, m3421getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo3410localPositionOfR5De75A(androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, long relativeToSource) {
        if (sourceCoordinates instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates) {
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = ((androidx.compose.ui.layout.LookaheadLayoutCoordinates) sourceCoordinates).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long m3565positionInBjo55l4$ui_release = lookaheadDelegate.m3565positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1871getXimpl(relativeToSource)), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1872getYimpl(relativeToSource)));
                long IntOffset2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m3565positionInBjo55l4$ui_release) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m3565positionInBjo55l4$ui_release) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset));
                long m3565positionInBjo55l4$ui_release2 = this.lookaheadDelegate.m3565positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset3 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset2) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(m3565positionInBjo55l4$ui_release2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset2) - androidx.compose.ui.unit.IntOffset.m4611getYimpl(m3565positionInBjo55l4$ui_release2));
                return androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset3), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset3));
            }
            androidx.compose.ui.node.LookaheadDelegate rootLookaheadDelegate = androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            long m3565positionInBjo55l4$ui_release3 = lookaheadDelegate.m3565positionInBjo55l4$ui_release(rootLookaheadDelegate);
            long position = rootLookaheadDelegate.getPosition();
            long IntOffset4 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m3565positionInBjo55l4$ui_release3) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(position), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m3565positionInBjo55l4$ui_release3) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(position));
            long IntOffset5 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1871getXimpl(relativeToSource)), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1872getYimpl(relativeToSource)));
            long IntOffset6 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset4) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset5), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset4) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset5));
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
            long m3565positionInBjo55l4$ui_release4 = lookaheadDelegate3.m3565positionInBjo55l4$ui_release(androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
            long position2 = androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).getPosition();
            long IntOffset7 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m3565positionInBjo55l4$ui_release4) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(position2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m3565positionInBjo55l4$ui_release4) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(position2));
            long IntOffset8 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset6) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset7), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset6) - androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset7));
            androidx.compose.ui.node.NodeCoordinator wrappedBy = androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy();
            kotlin.jvm.internal.Intrinsics.checkNotNull(wrappedBy);
            androidx.compose.ui.node.NodeCoordinator wrappedBy2 = rootLookaheadDelegate.getCoordinator().getWrappedBy();
            kotlin.jvm.internal.Intrinsics.checkNotNull(wrappedBy2);
            return wrappedBy.mo3410localPositionOfR5De75A(wrappedBy2, androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset8), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset8)));
        }
        androidx.compose.ui.node.LookaheadDelegate rootLookaheadDelegate2 = androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(mo3410localPositionOfR5De75A(rootLookaheadDelegate2.getLookaheadLayoutCoordinates(), relativeToSource), rootLookaheadDelegate2.getCoordinator().getCoordinates().mo3410localPositionOfR5De75A(sourceCoordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public androidx.compose.ui.geometry.Rect localBoundingBoxOf(androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo3413transformFromEL8BTi8(androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, float[] matrix) {
        getCoordinator().mo3413transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }
}
