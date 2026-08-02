package androidx.core.text;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\f\u0010\u0010"}, d2 = {"", "Landroid/text/Spannable;", "toSpannable", "(Ljava/lang/CharSequence;)Landroid/text/Spannable;", "", "clearSpans", "(Landroid/text/Spannable;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "span", "set", "(Landroid/text/Spannable;IILjava/lang/Object;)V", "Lkotlin/ranges/IntRange;", "range", "(Landroid/text/Spannable;Lkotlin/ranges/IntRange;Ljava/lang/Object;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpannableStringKt {
    public static final android.text.Spannable toSpannable(java.lang.CharSequence charSequence) {
        return android.text.SpannableString.valueOf(charSequence);
    }

    public static final void clearSpans(android.text.Spannable spannable) {
        android.text.Spannable spannable2 = spannable;
        for (java.lang.Object obj : spannable2.getSpans(0, spannable2.length(), java.lang.Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(android.text.Spannable spannable, int i, int i2, java.lang.Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final void set(android.text.Spannable spannable, kotlin.ranges.IntRange intRange, java.lang.Object obj) {
        spannable.setSpan(obj, intRange.getStart().intValue(), intRange.getEndInclusive().intValue(), 17);
    }
}
