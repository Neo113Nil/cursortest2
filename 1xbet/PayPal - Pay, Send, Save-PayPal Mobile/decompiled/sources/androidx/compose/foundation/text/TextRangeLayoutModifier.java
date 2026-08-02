package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "measurePolicy", "<init>", "(Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/text/TextRangeLayoutModifier;", "Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextRangeLayoutModifier implements androidx.compose.ui.layout.ParentDataModifier {
    public static final int $stable = 0;
    private final androidx.compose.foundation.text.TextRangeScopeMeasurePolicy measurePolicy;

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final androidx.compose.foundation.text.TextRangeLayoutModifier modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        return this;
    }

    public TextRangeLayoutModifier(androidx.compose.foundation.text.TextRangeScopeMeasurePolicy textRangeScopeMeasurePolicy) {
        this.measurePolicy = textRangeScopeMeasurePolicy;
    }

    public final androidx.compose.foundation.text.TextRangeScopeMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }
}
