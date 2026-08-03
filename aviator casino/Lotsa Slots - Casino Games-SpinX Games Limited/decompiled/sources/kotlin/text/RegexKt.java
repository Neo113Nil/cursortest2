package kotlin.text;

/* compiled from: Regex.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0014\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0082\b\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002¨\u0006\u0014"}, d2 = {"toInt", "", "", "Lkotlin/text/FlagEnum;", "fromInt", "", "T", "", "value", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegexKt {
    private static final /* synthetic */ <T extends java.lang.Enum<T> & kotlin.text.FlagEnum> java.util.Set<T> fromInt(final int i) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.util.EnumSet allOf = java.util.EnumSet.allOf(java.lang.Enum.class);
        kotlin.jvm.internal.Intrinsics.checkNotNull(allOf);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlin.collections.CollectionsKt.retainAll(allOf, new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: kotlin.text.RegexKt$fromInt$1$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.lang.Enum r3) {
                kotlin.text.FlagEnum flagEnum = (kotlin.text.FlagEnum) r3;
                return java.lang.Boolean.valueOf((i & flagEnum.getMask()) == flagEnum.getValue());
            }
        });
        java.util.Set<T> unmodifiableSet = java.util.Collections.unmodifiableSet(allOf);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.text.MatchResult findNext(java.util.regex.Matcher matcher, int i, java.lang.CharSequence charSequence) {
        if (matcher.find(i)) {
            return new kotlin.text.MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.text.MatchResult matchEntire(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        if (matcher.matches()) {
            return new kotlin.text.MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.IntRange range(java.util.regex.MatchResult matchResult) {
        return kotlin.ranges.RangesKt.until(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.IntRange range(java.util.regex.MatchResult matchResult, int i) {
        return kotlin.ranges.RangesKt.until(matchResult.start(i), matchResult.end(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toInt(java.lang.Iterable<? extends kotlin.text.FlagEnum> iterable) {
        java.util.Iterator<? extends kotlin.text.FlagEnum> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= it.next().getValue();
        }
        return i;
    }
}
