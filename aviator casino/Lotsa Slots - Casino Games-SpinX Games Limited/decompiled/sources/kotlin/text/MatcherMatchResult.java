package kotlin.text;

/* compiled from: Regex.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "", "getValue", "()Ljava/lang/String;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "groupValues_", "", "groupValues", "getGroupValues", "()Ljava/util/List;", io.ktor.http.LinkHeader.Rel.Next, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MatcherMatchResult implements kotlin.text.MatchResult {
    private java.util.List<java.lang.String> groupValues_;
    private final kotlin.text.MatchGroupCollection groups;
    private final java.lang.CharSequence input;
    private final java.util.regex.Matcher matcher;

    public MatcherMatchResult(java.util.regex.Matcher matcher, java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matcher, "matcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new kotlin.text.MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.MatchResult
    public kotlin.text.MatchResult.Destructured getDestructured() {
        return kotlin.text.MatchResult.DefaultImpls.getDestructured(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult getMatchResult() {
        return this.matcher;
    }

    @Override // kotlin.text.MatchResult
    public kotlin.ranges.IntRange getRange() {
        kotlin.ranges.IntRange range;
        range = kotlin.text.RegexKt.range(getMatchResult());
        return range;
    }

    @Override // kotlin.text.MatchResult
    public java.lang.String getValue() {
        java.lang.String group = getMatchResult().group();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public kotlin.text.MatchGroupCollection getGroups() {
        return this.groups;
    }

    @Override // kotlin.text.MatchResult
    public java.util.List<java.lang.String> getGroupValues() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new kotlin.collections.AbstractList<java.lang.String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(java.lang.Object obj) {
                    if (obj instanceof java.lang.String) {
                        return contains((java.lang.String) obj);
                    }
                    return false;
                }

                public /* bridge */ boolean contains(java.lang.String str) {
                    return super.contains((java.lang.Object) str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(java.lang.Object obj) {
                    if (obj instanceof java.lang.String) {
                        return indexOf((java.lang.String) obj);
                    }
                    return -1;
                }

                public /* bridge */ int indexOf(java.lang.String str) {
                    return super.indexOf((java.lang.Object) str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
                    if (obj instanceof java.lang.String) {
                        return lastIndexOf((java.lang.String) obj);
                    }
                    return -1;
                }

                public /* bridge */ int lastIndexOf(java.lang.String str) {
                    return super.lastIndexOf((java.lang.Object) str);
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                /* renamed from: getSize */
                public int get_size() {
                    java.util.regex.MatchResult matchResult;
                    matchResult = kotlin.text.MatcherMatchResult.this.getMatchResult();
                    return matchResult.groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public java.lang.String get(int index) {
                    java.util.regex.MatchResult matchResult;
                    matchResult = kotlin.text.MatcherMatchResult.this.getMatchResult();
                    java.lang.String group = matchResult.group(index);
                    return group == null ? "" : group;
                }
            };
        }
        java.util.List<java.lang.String> list = this.groupValues_;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public kotlin.text.MatchResult next() {
        kotlin.text.MatchResult findNext;
        int end = getMatchResult().end() + (getMatchResult().end() == getMatchResult().start() ? 1 : 0);
        if (end > this.input.length()) {
            return null;
        }
        java.util.regex.Matcher matcher = this.matcher.pattern().matcher(this.input);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        findNext = kotlin.text.RegexKt.findNext(matcher, end, this.input);
        return findNext;
    }
}
