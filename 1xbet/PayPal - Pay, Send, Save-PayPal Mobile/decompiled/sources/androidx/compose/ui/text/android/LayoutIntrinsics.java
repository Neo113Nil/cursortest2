package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0002J\u001c\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "charSequence", "", "textPaint", "Landroid/text/TextPaint;", "textDirectionHeuristic", "", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "_maxIntrinsicWidth", "", "_minIntrinsicWidth", "_boringMetrics", "Landroid/text/BoringLayout$Metrics;", "boringMetricsIsInit", "", "_charSequenceForIntrinsicWidth", "charSequenceForIntrinsicWidth", "getCharSequenceForIntrinsicWidth", "()Ljava/lang/CharSequence;", "boringMetrics", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "minIntrinsicWidth", "getMinIntrinsicWidth", "()F", "computeMinIntrinsicWidth", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "computeMaxIntrinsicWidth", "getDesiredWidth", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private java.lang.CharSequence Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private android.text.BoringLayout.Metrics getHighSpeedVideoFpsRangesFor;
    private final android.text.TextPaint getHighSpeedVideoSizesFor;
    private final java.lang.CharSequence getInputFormats;
    private final int getOutputFormats;
    private float getHighSpeedVideoSizes = Float.NaN;
    private float getHighSpeedVideoFpsRanges = Float.NaN;

    public LayoutIntrinsics(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.getInputFormats = charSequence;
        this.getHighSpeedVideoSizesFor = textPaint;
        this.getOutputFormats = i;
    }

    private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor() {
        boolean z;
        java.lang.CharSequence Camera2StreamConfigurationMap;
        java.lang.CharSequence charSequence = this.Camera2StreamConfigurationMap;
        if (charSequence == null) {
            z = androidx.compose.ui.text.android.LayoutIntrinsics_androidKt.Camera2StreamConfigurationMap;
            if (z) {
                Camera2StreamConfigurationMap = androidx.compose.ui.text.android.LayoutIntrinsics_androidKt.Camera2StreamConfigurationMap(this.getInputFormats);
                this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                return Camera2StreamConfigurationMap;
            }
            return this.getInputFormats;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(charSequence);
        return charSequence;
    }

    public final android.text.BoringLayout.Metrics getBoringMetrics() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.text.android.BoringLayoutFactory.INSTANCE.measure(this.getInputFormats, this.getHighSpeedVideoSizesFor, androidx.compose.ui.text.android.TextLayout_androidKt.getTextDirectionHeuristic(this.getOutputFormats));
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final float getMinIntrinsicWidth() {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges)) {
            return this.getHighSpeedVideoFpsRanges;
        }
        float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoFpsRanges = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    private final float getHighResolutionOutputSizeshNQ4ISI() {
        java.text.BreakIterator lineInstance = java.text.BreakIterator.getLineInstance(this.getHighSpeedVideoSizesFor.getTextLocale());
        java.lang.CharSequence charSequence = this.getInputFormats;
        int i = 0;
        lineInstance.setText(new androidx.compose.ui.text.android.CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(10, new java.util.Comparator() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.ui.text.android.LayoutIntrinsics.getHighSpeedVideoFpsRanges((kotlin.Pair) obj, (kotlin.Pair) obj2);
                return highSpeedVideoFpsRanges;
            }
        });
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new kotlin.Pair(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(next)));
            } else {
                kotlin.Pair pair = (kotlin.Pair) priorityQueue.peek();
                if (pair != null && ((java.lang.Number) pair.getSecond()).intValue() - ((java.lang.Number) pair.getFirst()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new kotlin.Pair(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        java.util.Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        kotlin.Pair pair2 = (kotlin.Pair) it.next();
        float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((java.lang.Number) pair2.component1()).intValue(), ((java.lang.Number) pair2.component2()).intValue());
        while (it.hasNext()) {
            kotlin.Pair pair3 = (kotlin.Pair) it.next();
            highResolutionOutputSizeshNQ4ISI = java.lang.Math.max(highResolutionOutputSizeshNQ4ISI, getHighResolutionOutputSizeshNQ4ISI(((java.lang.Number) pair3.component1()).intValue(), ((java.lang.Number) pair3.component2()).intValue()));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(kotlin.Pair pair, kotlin.Pair pair2) {
        return (((java.lang.Number) pair.getSecond()).intValue() - ((java.lang.Number) pair.getFirst()).intValue()) - (((java.lang.Number) pair2.getSecond()).intValue() - ((java.lang.Number) pair2.getFirst()).intValue());
    }

    public final float getMaxIntrinsicWidth() {
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizes)) {
            return this.getHighSpeedVideoSizes;
        }
        float Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        return Camera2StreamConfigurationMap;
    }

    private final float Camera2StreamConfigurationMap() {
        boolean highSpeedVideoFpsRangesFor;
        android.text.BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float f = boringMetrics != null ? boringMetrics.width : -1;
        if (f < 0.0f) {
            f = (float) java.lang.Math.ceil(getHighSpeedVideoFpsRanges(this));
        }
        highSpeedVideoFpsRangesFor = androidx.compose.ui.text.android.LayoutIntrinsics_androidKt.getHighSpeedVideoFpsRangesFor(f, this.getInputFormats, this.getHighSpeedVideoSizesFor);
        return highSpeedVideoFpsRangesFor ? f + 0.5f : f;
    }

    private static /* synthetic */ float getHighSpeedVideoFpsRanges(androidx.compose.ui.text.android.LayoutIntrinsics layoutIntrinsics) {
        return layoutIntrinsics.getHighResolutionOutputSizeshNQ4ISI(0, layoutIntrinsics.getHighSpeedVideoFpsRangesFor().length());
    }

    private final float getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        return android.text.Layout.getDesiredWidth(getHighSpeedVideoFpsRangesFor(), i, i2, this.getHighSpeedVideoSizesFor);
    }
}
