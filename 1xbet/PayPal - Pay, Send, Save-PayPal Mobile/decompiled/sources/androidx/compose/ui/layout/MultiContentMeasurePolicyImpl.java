package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001b"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicyImpl;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "measurePolicy", "<init>", "(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "component1", "()Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "copy", "(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MultiContentMeasurePolicyImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "getMeasurePolicy"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MultiContentMeasurePolicyImpl implements androidx.compose.ui.layout.MeasurePolicy {
    public static final int $stable = 0;
    private final androidx.compose.ui.layout.MultiContentMeasurePolicy measurePolicy;

    public MultiContentMeasurePolicyImpl(androidx.compose.ui.layout.MultiContentMeasurePolicy multiContentMeasurePolicy) {
        this.measurePolicy = multiContentMeasurePolicy;
    }

    public final androidx.compose.ui.layout.MultiContentMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        return this.measurePolicy.mo1663measure3p2s80s(measureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(measureScope), j);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.minIntrinsicWidth(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.minIntrinsicHeight(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.maxIntrinsicWidth(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        return this.measurePolicy.maxIntrinsicHeight(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiContentMeasurePolicyImpl(measurePolicy=");
        sb.append(this.measurePolicy);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.measurePolicy.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.layout.MultiContentMeasurePolicyImpl) && kotlin.jvm.internal.Intrinsics.areEqual(this.measurePolicy, ((androidx.compose.ui.layout.MultiContentMeasurePolicyImpl) other).measurePolicy);
    }

    public final androidx.compose.ui.layout.MultiContentMeasurePolicyImpl copy(androidx.compose.ui.layout.MultiContentMeasurePolicy measurePolicy) {
        return new androidx.compose.ui.layout.MultiContentMeasurePolicyImpl(measurePolicy);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.layout.MultiContentMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MultiContentMeasurePolicyImpl copy$default(androidx.compose.ui.layout.MultiContentMeasurePolicyImpl multiContentMeasurePolicyImpl, androidx.compose.ui.layout.MultiContentMeasurePolicy multiContentMeasurePolicy, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            multiContentMeasurePolicy = multiContentMeasurePolicyImpl.measurePolicy;
        }
        return multiContentMeasurePolicyImpl.copy(multiContentMeasurePolicy);
    }
}
