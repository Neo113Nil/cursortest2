package io.ktor.http.cio.internals;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "text", "Lio/ktor/http/cio/internals/MutableRange;", "range", "nextToken", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/CharSequence;", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "skipSpacesAndHorizontalTabs", "(Lio/ktor/http/cio/internals/CharArrayBuilder;II)I", "", "skipSpaces", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)V", "findSpaceOrEnd", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TokenizerKt {
    public static final java.lang.CharSequence nextToken(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableRange, "");
        int findSpaceOrEnd = findSpaceOrEnd(charSequence, mutableRange);
        java.lang.CharSequence subSequence = charSequence.subSequence(mutableRange.getStart(), findSpaceOrEnd);
        mutableRange.setStart(findSpaceOrEnd);
        return subSequence;
    }

    public static final int skipSpacesAndHorizontalTabs(io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charArrayBuilder, "");
        while (i < i2) {
            char charAt = charArrayBuilder.charAt(i);
            if (!kotlin.text.CharsKt.isWhitespace(charAt) && charAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }

    public static final void skipSpaces(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableRange, "");
        int start = mutableRange.getStart();
        int end = mutableRange.getEnd();
        if (start >= end || !kotlin.text.CharsKt.isWhitespace(charSequence.charAt(start))) {
            return;
        }
        do {
            start++;
            if (start >= end) {
                break;
            }
        } while (kotlin.text.CharsKt.isWhitespace(charSequence.charAt(start)));
        mutableRange.setStart(start);
    }

    public static final int findSpaceOrEnd(java.lang.CharSequence charSequence, io.ktor.http.cio.internals.MutableRange mutableRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableRange, "");
        int start = mutableRange.getStart();
        int end = mutableRange.getEnd();
        if (start < end && !kotlin.text.CharsKt.isWhitespace(charSequence.charAt(start))) {
            do {
                start++;
                if (start >= end) {
                    break;
                }
            } while (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(start)));
        }
        return start;
    }
}
