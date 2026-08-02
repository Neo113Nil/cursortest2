package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;II)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder> range = list.get(i3);
            if (androidx.compose.ui.text.AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                java.util.ArrayList arrayList2 = arrayList;
                if (i > range.getStart() || range.getEnd() > i2) {
                    androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList2.add(new androidx.compose.ui.text.AnnotatedString.Range(range.getItem(), range.getStart() - i, range.getEnd() - i));
            }
        }
        return arrayList;
    }
}
