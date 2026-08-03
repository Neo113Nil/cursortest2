package androidx.compose.foundation.pager;

/* compiled from: MeasuredPage.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003J\u001d\u0010!\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u001e\u00101\u001a\u00020*2\u0006\u0010 \u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003J+\u00104\u001a\u00020\t*\u00020\t2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000306H\u0082\bø\u0001\u0000¢\u0006\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010%R\u0018\u0010&\u001a\u00020\u0003*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "size", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", com.ironsource.X3.i.W, "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "isVertical", "getKey", "()Ljava/lang/Object;", "mainAxisLayoutSize", "<set-?>", "offset", "getOffset", "placeableOffsets", "", "getSize", "J", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "getOffset-Bjo55l4", "(I)J", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "position", "layoutWidth", "layoutHeight", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasuredPage implements androidx.compose.foundation.pager.PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;
    private final androidx.compose.ui.Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final java.lang.Object key;
    private final androidx.compose.ui.unit.LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final java.util.List<androidx.compose.ui.layout.Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final androidx.compose.ui.Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ MeasuredPage(int i, int i2, java.util.List list, long j, java.lang.Object obj, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, j, obj, orientation, horizontal, vertical, layoutDirection, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i, int i2, java.util.List<? extends androidx.compose.ui.layout.Placeable> list, long j, java.lang.Object obj, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z) {
        this.index = i;
        this.size = i2;
        this.placeables = list;
        this.visualOffset = j;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z;
        this.isVertical = orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i4);
            i3 = java.lang.Math.max(i3, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = i3;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    public final java.lang.Object getKey() {
        return this.key;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final void position(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        java.util.List<androidx.compose.ui.layout.Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable = list.get(i);
            int i2 = i * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                androidx.compose.ui.Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new java.lang.IllegalArgumentException("null horizontalAlignment".toString());
                }
                iArr[i2] = horizontal.align(placeable.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i2 + 1] = offset;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i2] = offset;
                int i3 = i2 + 1;
                androidx.compose.ui.Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new java.lang.IllegalArgumentException("null verticalAlignment".toString());
                }
                iArr2[i3] = vertical.align(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            offset += width;
        }
    }

    public final void place(androidx.compose.ui.layout.Placeable.PlacementScope scope) {
        int m4611getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("position() should be called first".toString());
        }
        int size = this.placeables.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable = this.placeables.get(i);
            long m801getOffsetBjo55l4 = m801getOffsetBjo55l4(i);
            if (this.reverseLayout) {
                int m4610getXimpl = this.isVertical ? androidx.compose.ui.unit.IntOffset.m4610getXimpl(m801getOffsetBjo55l4) : (this.mainAxisLayoutSize - androidx.compose.ui.unit.IntOffset.m4610getXimpl(m801getOffsetBjo55l4)) - getMainAxisSize(placeable);
                if (this.isVertical) {
                    m4611getYimpl = (this.mainAxisLayoutSize - androidx.compose.ui.unit.IntOffset.m4611getYimpl(m801getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(m801getOffsetBjo55l4);
                }
                m801getOffsetBjo55l4 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(m4610getXimpl, m4611getYimpl);
            }
            long j = this.visualOffset;
            long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m801getOffsetBjo55l4) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m801getOffsetBjo55l4) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j));
            if (this.isVertical) {
                androidx.compose.ui.layout.Placeable.PlacementScope.m3459placeWithLayeraW9wM$default(scope, placeable, IntOffset, 0.0f, null, 6, null);
            } else {
                androidx.compose.ui.layout.Placeable.PlacementScope.m3458placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset, 0.0f, null, 6, null);
            }
        }
    }

    public final void applyScrollDelta(int delta) {
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i = 0; i < length; i++) {
            boolean z = this.isVertical;
            if ((z && i % 2 == 1) || (!z && i % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i] = iArr[i] + delta;
            }
        }
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m801getOffsetBjo55l4(int index) {
        int[] iArr = this.placeableOffsets;
        int i = index * 2;
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(iArr[i], iArr[i + 1]);
    }

    private final int getMainAxisSize(androidx.compose.ui.layout.Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m800copy4Tuh3kE(long j, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        int m4610getXimpl = this.isVertical ? androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) : function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(j);
        if (z) {
            m4611getYimpl = function1.invoke(java.lang.Integer.valueOf(m4611getYimpl)).intValue();
        }
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(m4610getXimpl, m4611getYimpl);
    }
}
