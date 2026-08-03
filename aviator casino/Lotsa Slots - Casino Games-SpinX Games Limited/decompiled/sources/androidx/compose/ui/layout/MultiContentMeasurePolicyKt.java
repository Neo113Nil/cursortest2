package androidx.compose.ui.layout;

/* compiled from: MultiContentMeasurePolicy.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiContentMeasurePolicyKt {
    public static final androidx.compose.ui.layout.MeasurePolicy createMeasurePolicy(final androidx.compose.ui.layout.MultiContentMeasurePolicy multiContentMeasurePolicy) {
        return new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.ui.layout.MultiContentMeasurePolicyKt$createMeasurePolicy$1$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                return androidx.compose.ui.layout.MultiContentMeasurePolicy.this.m3447measure3p2s80s(measureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(measureScope), j);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
                return androidx.compose.ui.layout.MultiContentMeasurePolicy.this.minIntrinsicWidth(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
                return androidx.compose.ui.layout.MultiContentMeasurePolicy.this.minIntrinsicHeight(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
                return androidx.compose.ui.layout.MultiContentMeasurePolicy.this.maxIntrinsicWidth(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
                return androidx.compose.ui.layout.MultiContentMeasurePolicy.this.maxIntrinsicHeight(intrinsicMeasureScope, androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope), i);
            }
        };
    }
}
