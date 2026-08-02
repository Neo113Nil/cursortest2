package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "unbox", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/text/AnnotatedString$Range;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringAnnotationKt {
    public static final androidx.compose.ui.text.AnnotatedString.Range<java.lang.String> unbox(androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation> range) {
        androidx.compose.ui.text.AnnotatedString.Annotation item = range.getItem();
        kotlin.jvm.internal.Intrinsics.checkNotNull(item, "");
        return new androidx.compose.ui.text.AnnotatedString.Range<>(((androidx.compose.ui.text.StringAnnotation) item).m7995unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
