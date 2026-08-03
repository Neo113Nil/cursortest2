package androidx.compose.ui.text.android.animation;

/* compiled from: SegmentBreaker.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", "text", "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SegmentBreaker {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.android.animation.SegmentBreaker INSTANCE = new androidx.compose.ui.text.android.animation.SegmentBreaker();

    /* compiled from: SegmentBreaker.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.text.android.animation.SegmentType.values().length];
            try {
                iArr[androidx.compose.ui.text.android.animation.SegmentType.Document.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.text.android.animation.SegmentType.Paragraph.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.text.android.animation.SegmentType.Line.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.text.android.animation.SegmentType.Word.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.ui.text.android.animation.SegmentType.Character.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final java.util.List<java.lang.Integer> breakInWords(androidx.compose.ui.text.android.LayoutHelper layoutHelper) {
        java.util.List<java.lang.Integer> breakWithBreakIterator = breakWithBreakIterator(layoutHelper.getLayout().getText(), java.text.BreakIterator.getLineInstance(java.util.Locale.getDefault()));
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int size = breakWithBreakIterator.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(java.lang.Integer.valueOf(breakWithBreakIterator.get(i).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            java.text.Bidi analyzeBidi = layoutHelper.analyzeBidi(i2);
            if (analyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i2);
                int runCount = analyzeBidi.getRunCount();
                for (int i3 = 0; i3 < runCount; i3++) {
                    treeSet.add(java.lang.Integer.valueOf(analyzeBidi.getRunStart(i3) + paragraphStart));
                }
            }
        }
        return kotlin.collections.CollectionsKt.toList(treeSet);
    }

    private final java.util.List<java.lang.Integer> breakWithBreakIterator(java.lang.CharSequence text, java.text.BreakIterator breaker) {
        androidx.compose.ui.text.android.CharSequenceCharacterIterator charSequenceCharacterIterator = new androidx.compose.ui.text.android.CharSequenceCharacterIterator(text, 0, text.length());
        java.util.List<java.lang.Integer> mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(0);
        breaker.setText(charSequenceCharacterIterator);
        while (breaker.next() != -1) {
            mutableListOf.add(java.lang.Integer.valueOf(breaker.current()));
        }
        return mutableListOf;
    }

    public final java.util.List<java.lang.Integer> breakOffsets(androidx.compose.ui.text.android.LayoutHelper layoutHelper, androidx.compose.ui.text.android.animation.SegmentType segmentType) {
        android.text.Layout layout = layoutHelper.getLayout();
        java.lang.CharSequence text = layout.getText();
        int i = androidx.compose.ui.text.android.animation.SegmentBreaker.WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, java.lang.Integer.valueOf(text.length())});
        }
        if (i == 2) {
            java.util.List<java.lang.Integer> mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i2 < paragraphCount) {
                mutableListOf.add(java.lang.Integer.valueOf(layoutHelper.getParagraphEnd(i2)));
                i2++;
            }
            return mutableListOf;
        }
        if (i != 3) {
            if (i == 4) {
                return breakInWords(layoutHelper);
            }
            if (i == 5) {
                return breakWithBreakIterator(text, java.text.BreakIterator.getCharacterInstance(java.util.Locale.getDefault()));
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<java.lang.Integer> mutableListOf2 = kotlin.collections.CollectionsKt.mutableListOf(0);
        int lineCount = layout.getLineCount();
        while (i2 < lineCount) {
            mutableListOf2.add(java.lang.Integer.valueOf(layout.getLineEnd(i2)));
            i2++;
        }
        return mutableListOf2;
    }

    public final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegments(androidx.compose.ui.text.android.LayoutHelper layoutHelper, androidx.compose.ui.text.android.animation.SegmentType segmentType, boolean dropSpaces) {
        int i = androidx.compose.ui.text.android.animation.SegmentBreaker.WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i == 3) {
            return breakSegmentWithLine(layoutHelper, dropSpaces);
        }
        if (i == 4) {
            return breakSegmentWithWord(layoutHelper, dropSpaces);
        }
        if (i == 5) {
            return breakSegmentWithChar(layoutHelper, dropSpaces);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegmentWithDocument(androidx.compose.ui.text.android.LayoutHelper layoutHelper) {
        return kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.text.android.animation.Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegmentWithParagraph(androidx.compose.ui.text.android.LayoutHelper layoutHelper) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.text.Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            int paragraphStart = layoutHelper.getParagraphStart(i);
            int paragraphEnd = layoutHelper.getParagraphEnd(i);
            arrayList.add(new androidx.compose.ui.text.android.animation.Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(androidx.compose.ui.text.android.LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(androidx.compose.ui.text.android.LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegmentWithLine(androidx.compose.ui.text.android.LayoutHelper layoutHelper, boolean dropSpaces) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.text.Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i = 0; i < lineCount; i++) {
            arrayList.add(new androidx.compose.ui.text.android.animation.Segment(layout.getLineStart(i), layout.getLineEnd(i), dropSpaces ? (int) java.lang.Math.ceil(layout.getLineLeft(i)) : 0, layout.getLineTop(i), dropSpaces ? (int) java.lang.Math.ceil(layout.getLineRight(i)) : layout.getWidth(), layout.getLineBottom(i)));
        }
        return arrayList;
    }

    private final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegmentWithWord(androidx.compose.ui.text.android.LayoutHelper layoutHelper, boolean dropSpaces) {
        int i;
        android.text.Layout layout = layoutHelper.getLayout();
        int ceil = (int) java.lang.Math.ceil(layout.getPaint().measureText(io.ktor.sse.ServerSentEventKt.SPACE));
        java.util.List<java.lang.Integer> breakOffsets = breakOffsets(layoutHelper, androidx.compose.ui.text.android.animation.SegmentType.Word);
        if (breakOffsets.size() != 0) {
            boolean z = true;
            if (breakOffsets.size() != 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z2 = false;
                java.lang.Integer num = breakOffsets.get(0);
                int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(breakOffsets);
                int i2 = 0;
                while (i2 < lastIndex) {
                    i2++;
                    java.lang.Integer num2 = breakOffsets.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int lineForOffset = androidx.compose.ui.text.android.LayoutCompatKt.getLineForOffset(layout, intValue2, z2);
                    boolean z3 = layout.getParagraphDirection(lineForOffset) == -1;
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z3) {
                        z = false;
                    }
                    int ceil2 = (int) java.lang.Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z, z2));
                    boolean z4 = isRtlCharAt == z3;
                    int i3 = lastIndex;
                    int ceil3 = (int) java.lang.Math.ceil(layoutHelper.getHorizontalPosition(intValue, z4, true));
                    int min = java.lang.Math.min(ceil2, ceil3);
                    int max = java.lang.Math.max(ceil2, ceil3);
                    if (dropSpaces && intValue != 0 && layout.getText().charAt(intValue - 1) == ' ') {
                        i = lineForOffset;
                        if (layout.getLineEnd(i) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    } else {
                        i = lineForOffset;
                    }
                    arrayList.add(new androidx.compose.ui.text.android.animation.Segment(intValue2, intValue, min, layout.getLineTop(i), max, layout.getLineBottom(i)));
                    num = num2;
                    lastIndex = i3;
                    z = true;
                    z2 = false;
                }
                return arrayList;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private final java.util.List<androidx.compose.ui.text.android.animation.Segment> breakSegmentWithChar(androidx.compose.ui.text.android.LayoutHelper layoutHelper, boolean dropSpaces) {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<java.lang.Integer> breakOffsets = breakOffsets(layoutHelper, androidx.compose.ui.text.android.animation.SegmentType.Character);
        if (breakOffsets.size() != 0) {
            boolean z = true;
            if (breakOffsets.size() != 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z2 = false;
                java.lang.Integer num = breakOffsets.get(0);
                int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(breakOffsets);
                int i2 = 0;
                while (i2 < lastIndex) {
                    i2++;
                    java.lang.Integer num2 = breakOffsets.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    android.text.Layout layout = layoutHelper.getLayout();
                    if (dropSpaces && intValue == intValue2 + 1 && layoutHelper.isLineEndSpace(layout.getText().charAt(intValue2))) {
                        i = lastIndex;
                    } else {
                        int lineForOffset = androidx.compose.ui.text.android.LayoutCompatKt.getLineForOffset(layout, intValue2, z2);
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == -1;
                        boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z3) {
                            z = false;
                        }
                        int ceil = (int) java.lang.Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z, z2));
                        i = lastIndex;
                        int ceil2 = (int) java.lang.Math.ceil(layoutHelper.getHorizontalPosition(intValue, isRtlCharAt == z3, true));
                        arrayList.add(new androidx.compose.ui.text.android.animation.Segment(intValue2, intValue, java.lang.Math.min(ceil, ceil2), layout.getLineTop(lineForOffset), java.lang.Math.max(ceil, ceil2), layout.getLineBottom(lineForOffset)));
                    }
                    arrayList2.add(kotlin.Unit.INSTANCE);
                    num = num2;
                    lastIndex = i;
                    z = true;
                    z2 = false;
                }
                return arrayList;
            }
        }
        kotlin.collections.CollectionsKt.emptyList();
        return arrayList;
    }
}
