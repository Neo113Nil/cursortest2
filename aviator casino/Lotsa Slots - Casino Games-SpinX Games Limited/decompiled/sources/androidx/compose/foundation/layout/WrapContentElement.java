package androidx.compose.foundation.layout;

/* compiled from: Size.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\f\u0010\u0019\u001a\u00020\u0017*\u00020\u001aH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/WrapContentNode;", "direction", "Landroidx/compose/foundation/layout/Direction;", "unbounded", "", "alignmentCallback", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "align", "", "inspectorName", "", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/String;)V", "create", "equals", "other", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.WrapContentNode> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.WrapContentElement.Companion INSTANCE = new androidx.compose.foundation.layout.WrapContentElement.Companion(null);
    private final java.lang.Object align;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset> alignmentCallback;
    private final androidx.compose.foundation.layout.Direction direction;
    private final java.lang.String inspectorName;
    private final boolean unbounded;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(androidx.compose.foundation.layout.Direction direction, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset> function2, java.lang.Object obj, java.lang.String str) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = function2;
        this.align = obj;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.layout.WrapContentNode create() {
        return new androidx.compose.foundation.layout.WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.layout.WrapContentNode node) {
        node.setDirection(this.direction);
        node.setUnbounded(this.unbounded);
        node.setAlignmentCallback(this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("align", this.align);
        inspectorInfo.getProperties().set("unbounded", java.lang.Boolean.valueOf(this.unbounded));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.compose.foundation.layout.WrapContentElement wrapContentElement = (androidx.compose.foundation.layout.WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && kotlin.jvm.internal.Intrinsics.areEqual(this.align, wrapContentElement.align);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.direction.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.unbounded)) * 31) + this.align.hashCode();
    }

    /* compiled from: Size.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$Companion;", "", "()V", "height", "Landroidx/compose/foundation/layout/WrapContentElement;", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "size", "Landroidx/compose/ui/Alignment;", "width", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.foundation.layout.WrapContentElement width(final androidx.compose.ui.Alignment.Horizontal align, boolean unbounded) {
            return new androidx.compose.foundation.layout.WrapContentElement(androidx.compose.foundation.layout.Direction.Horizontal, unbounded, new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$width$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                    return androidx.compose.ui.unit.IntOffset.m4601boximpl(m671invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m671invoke5SAbXVA(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                    return androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.Alignment.Horizontal.this.align(0, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), layoutDirection), 0);
                }
            }, align, "wrapContentWidth");
        }

        public final androidx.compose.foundation.layout.WrapContentElement height(final androidx.compose.ui.Alignment.Vertical align, boolean unbounded) {
            return new androidx.compose.foundation.layout.WrapContentElement(androidx.compose.foundation.layout.Direction.Vertical, unbounded, new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$height$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                    return androidx.compose.ui.unit.IntOffset.m4601boximpl(m669invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m669invoke5SAbXVA(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                    return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, androidx.compose.ui.Alignment.Vertical.this.align(0, androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j)));
                }
            }, align, "wrapContentHeight");
        }

        public final androidx.compose.foundation.layout.WrapContentElement size(final androidx.compose.ui.Alignment align, boolean unbounded) {
            return new androidx.compose.foundation.layout.WrapContentElement(androidx.compose.foundation.layout.Direction.Both, unbounded, new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$size$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                    return androidx.compose.ui.unit.IntOffset.m4601boximpl(m670invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m670invoke5SAbXVA(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                    return androidx.compose.ui.Alignment.this.mo1748alignKFBX0sM(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g(), j, layoutDirection);
                }
            }, align, "wrapContentSize");
        }
    }
}
