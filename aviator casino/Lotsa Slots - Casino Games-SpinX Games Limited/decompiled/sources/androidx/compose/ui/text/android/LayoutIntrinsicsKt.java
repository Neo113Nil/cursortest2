package androidx.compose.ui.text.android;

/* compiled from: LayoutIntrinsics.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"minIntrinsicWidth", "", "text", "", "paint", "Landroid/text/TextPaint;", "shouldIncreaseMaxIntrinsic", "", "desiredWidth", "charSequence", "textPaint", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutIntrinsicsKt {
    public static final float minIntrinsicWidth(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        java.text.BreakIterator lineInstance = java.text.BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new androidx.compose.ui.text.android.CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        java.util.PriorityQueue<kotlin.Pair> priorityQueue = new java.util.PriorityQueue(10, new java.util.Comparator() { // from class: androidx.compose.ui.text.android.LayoutIntrinsicsKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int minIntrinsicWidth$lambda$0;
                minIntrinsicWidth$lambda$0 = androidx.compose.ui.text.android.LayoutIntrinsicsKt.minIntrinsicWidth$lambda$0((kotlin.Pair) obj, (kotlin.Pair) obj2);
                return minIntrinsicWidth$lambda$0;
            }
        });
        int next = lineInstance.next();
        int i = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new kotlin.Pair(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(next)));
            } else {
                kotlin.Pair pair = (kotlin.Pair) priorityQueue.peek();
                if (pair != null && ((java.lang.Number) pair.getSecond()).intValue() - ((java.lang.Number) pair.getFirst()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new kotlin.Pair(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(next)));
                }
            }
            int i2 = next;
            next = lineInstance.next();
            i = i2;
        }
        float f = 0.0f;
        for (kotlin.Pair pair2 : priorityQueue) {
            f = java.lang.Math.max(f, android.text.Layout.getDesiredWidth(charSequence, ((java.lang.Number) pair2.component1()).intValue(), ((java.lang.Number) pair2.component2()).intValue(), textPaint));
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicWidth$lambda$0(kotlin.Pair pair, kotlin.Pair pair2) {
        return (((java.lang.Number) pair.getSecond()).intValue() - ((java.lang.Number) pair.getFirst()).intValue()) - (((java.lang.Number) pair2.getSecond()).intValue() - ((java.lang.Number) pair2.getFirst()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(r2, androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean shouldIncreaseMaxIntrinsic(float f, java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        if (f != 0.0f) {
            if (charSequence instanceof android.text.Spanned) {
                android.text.Spanned spanned = (android.text.Spanned) charSequence;
                if (!androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(spanned, androidx.compose.ui.text.android.style.LetterSpacingSpanPx.class)) {
                }
                return true;
            }
            if (textPaint.getLetterSpacing() != 0.0f) {
                return true;
            }
        }
        return false;
    }
}
