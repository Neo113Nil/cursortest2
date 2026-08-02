package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Ljava/util/regex/Matcher;", "", "p0", "", "p1", "Lkotlin/text/MatchResult;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lkotlin/text/MatchResult;", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/regex/MatchResult;)Lkotlin/ranges/IntRange;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RegexKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.text.MatchResult getHighResolutionOutputSizeshNQ4ISI(java.util.regex.Matcher matcher, int i, java.lang.CharSequence charSequence) {
        if (matcher.find(i)) {
            return new kotlin.text.MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.IntRange getHighSpeedVideoFpsRangesFor(java.util.regex.MatchResult matchResult) {
        return kotlin.ranges.RangesKt.until(matchResult.start(), matchResult.end());
    }

    public static final /* synthetic */ kotlin.text.MatchResult access$matchEntire(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        if (matcher.matches()) {
            return new kotlin.text.MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    public static final /* synthetic */ int access$toInt(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((kotlin.text.FlagEnum) it.next()).getValue();
        }
        return i;
    }
}
