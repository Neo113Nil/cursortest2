package androidx.media3.common.text;

/* loaded from: classes2.dex */
public final class SpanUtil {
    public static void addOrReplaceSpan(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3) {
        for (java.lang.Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, i, i2, i3);
        }
        spannable.setSpan(obj, i, i2, i3);
    }

    public static void addInheritedRelativeSizeSpan(android.text.Spannable spannable, float f, int i, int i2, int i3) {
        for (android.text.style.RelativeSizeSpan relativeSizeSpan : (android.text.style.RelativeSizeSpan[]) spannable.getSpans(i, i2, android.text.style.RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f *= relativeSizeSpan.getSizeChange();
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i, i2, i3);
        }
        spannable.setSpan(new android.text.style.RelativeSizeSpan(f), i, i2, i3);
    }

    private static void removeIfStartEndAndFlagsMatch(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == i3) {
            spannable.removeSpan(obj);
        }
    }

    private SpanUtil() {
    }
}
