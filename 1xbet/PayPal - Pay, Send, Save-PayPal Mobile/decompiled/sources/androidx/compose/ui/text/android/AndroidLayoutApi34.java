package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/android/AndroidLayoutApi34;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/TextLayout;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "getRangeForRect$ui_text", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLayoutApi34 {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.android.AndroidLayoutApi34 INSTANCE = new androidx.compose.ui.text.android.AndroidLayoutApi34();

    private AndroidLayoutApi34() {
    }

    public final int[] getRangeForRect$ui_text(androidx.compose.ui.text.android.TextLayout layout, android.graphics.RectF rectF, int granularity, final kotlin.jvm.functions.Function2<? super android.graphics.RectF, ? super android.graphics.RectF, java.lang.Boolean> inclusionStrategy) {
        android.text.GraphemeClusterSegmentFinder graphemeClusterSegmentFinder;
        if (granularity == 1) {
            graphemeClusterSegmentFinder = androidx.compose.ui.text.android.selection.Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text(new androidx.compose.ui.text.android.selection.WordSegmentFinder(layout.getText(), layout.getWordIterator()));
        } else {
            graphemeClusterSegmentFinder = new android.text.GraphemeClusterSegmentFinder(layout.getText(), layout.getTextPaint());
        }
        return layout.getLayout().getRangeForRect(rectF, graphemeClusterSegmentFinder, new android.text.Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.AndroidLayoutApi34$$ExternalSyntheticLambda0
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(android.graphics.RectF rectF2, android.graphics.RectF rectF3) {
                boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.ui.text.android.AndroidLayoutApi34.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2.this, rectF2, rectF3);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2 function2, android.graphics.RectF rectF, android.graphics.RectF rectF2) {
        return ((java.lang.Boolean) function2.invoke(rectF, rectF2)).booleanValue();
    }
}
