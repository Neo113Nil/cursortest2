package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MeasurePolicy;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiContentMeasurePolicyKt {
    public static final androidx.compose.ui.layout.MeasurePolicy createMeasurePolicy(androidx.compose.ui.layout.MultiContentMeasurePolicy multiContentMeasurePolicy) {
        return new androidx.compose.ui.layout.MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
    }
}
