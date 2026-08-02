package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/text/TextAnnotatorScope;", "", "Landroidx/compose/ui/text/AnnotatedString;", "p0", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/SpanStyle;", "p1", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/SpanStyle;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/AnnotatedString;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/text/AnnotatedString;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextAnnotatorScope {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.text.AnnotatedString Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.text.AnnotatedString getHighSpeedVideoFpsRangesFor;

    public TextAnnotatorScope(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.Camera2StreamConfigurationMap = annotatedString;
        this.getHighSpeedVideoFpsRangesFor = annotatedString;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final androidx.compose.ui.text.AnnotatedString getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void getHighSpeedVideoSizes(final androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> p0, final androidx.compose.ui.text.SpanStyle p1) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.mapAnnotations(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextAnnotatorScope$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.ui.text.AnnotatedString.Range highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextAnnotatorScope.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.BooleanRef.this, p0, p1, (androidx.compose.ui.text.AnnotatedString.Range) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.AnnotatedString.Range getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.ui.text.AnnotatedString.Range range, androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.AnnotatedString.Range range2) {
        androidx.compose.ui.text.AnnotatedString.Range range3;
        androidx.compose.ui.text.AnnotatedString.Range range4;
        androidx.compose.ui.text.AnnotatedString.Range range5;
        if (booleanRef.element && (range2.getItem() instanceof androidx.compose.ui.text.SpanStyle) && range2.getStart() == range.getStart() && range2.getEnd() == range.getEnd()) {
            range4 = new androidx.compose.ui.text.AnnotatedString.Range(spanStyle == null ? new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65535, (kotlin.jvm.internal.DefaultConstructorMarker) null) : spanStyle, range2.getStart(), range2.getEnd());
            range3 = range;
            range5 = range2;
        } else {
            range3 = range;
            range4 = range2;
            range5 = range4;
        }
        booleanRef.element = kotlin.jvm.internal.Intrinsics.areEqual(range3, range5);
        return range4;
    }
}
