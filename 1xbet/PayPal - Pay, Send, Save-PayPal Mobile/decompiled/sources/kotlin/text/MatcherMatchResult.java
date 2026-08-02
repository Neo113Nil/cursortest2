package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "p0", "", "p1", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", io.ktor.http.LinkHeader.Rel.Next, "()Lkotlin/text/MatchResult;", "getHighSpeedVideoFpsRanges", "Ljava/util/regex/Matcher;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/CharSequence;", "Ljava/util/regex/MatchResult;", "()Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "", "getValue", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlin/text/MatchGroupCollection;", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "getInputFormats", "", "Ljava/util/List;", "getInputSizeshNQ4ISI", "getGroupValues", "()Ljava/util/List;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MatcherMatchResult implements kotlin.text.MatchResult {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.text.MatchGroupCollection getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.regex.Matcher getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<java.lang.String> getInputSizeshNQ4ISI;

    public MatcherMatchResult(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        this.getHighResolutionOutputSizeshNQ4ISI = matcher;
        this.getHighSpeedVideoFpsRangesFor = charSequence;
        this.getInputFormats = new kotlin.text.MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.MatchResult
    public final /* bridge */ kotlin.text.MatchResult.Destructured getDestructured() {
        return kotlin.text.MatchResult.DefaultImpls.getDestructured(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.text.MatchResult
    public final kotlin.ranges.IntRange getRange() {
        kotlin.ranges.IntRange highSpeedVideoFpsRangesFor;
        highSpeedVideoFpsRangesFor = kotlin.text.RegexKt.getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor());
        return highSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.text.MatchResult
    public final java.lang.String getValue() {
        java.lang.String group = getHighSpeedVideoFpsRangesFor().group();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "");
        return group;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: getGroups, reason: from getter */
    public final kotlin.text.MatchGroupCollection getGetInputFormats() {
        return this.getInputFormats;
    }

    @Override // kotlin.text.MatchResult
    public final java.util.List<java.lang.String> getGroupValues() {
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new kotlin.collections.AbstractList<java.lang.String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(java.lang.Object obj) {
                    if (obj instanceof java.lang.String) {
                        return contains((java.lang.String) obj);
                    }
                    return false;
                }

                public final /* bridge */ boolean contains(java.lang.String str) {
                    return super.contains((java.lang.Object) str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(java.lang.Object obj) {
                    if (obj instanceof java.lang.String) {
                        return indexOf((java.lang.String) obj);
                    }
                    return -1;
                }

                public final /* bridge */ int indexOf(java.lang.String str) {
                    return super.indexOf((java.lang.Object) str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
                    if (obj instanceof java.lang.String) {
                        return lastIndexOf((java.lang.String) obj);
                    }
                    return -1;
                }

                public final /* bridge */ int lastIndexOf(java.lang.String str) {
                    return super.lastIndexOf((java.lang.Object) str);
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                /* renamed from: getSize */
                public final int getGetHighSpeedVideoFpsRangesFor() {
                    java.util.regex.MatchResult highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = kotlin.text.MatcherMatchResult.this.getHighSpeedVideoFpsRangesFor();
                    return highSpeedVideoFpsRangesFor.groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final java.lang.String get(int index) {
                    java.util.regex.MatchResult highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = kotlin.text.MatcherMatchResult.this.getHighSpeedVideoFpsRangesFor();
                    java.lang.String group = highSpeedVideoFpsRangesFor.group(index);
                    return group == null ? "" : group;
                }
            };
        }
        java.util.List<java.lang.String> list = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public final kotlin.text.MatchResult next() {
        kotlin.text.MatchResult highResolutionOutputSizeshNQ4ISI;
        int end = getHighSpeedVideoFpsRangesFor().end() + (getHighSpeedVideoFpsRangesFor().end() == getHighSpeedVideoFpsRangesFor().start() ? 1 : 0);
        if (end > this.getHighSpeedVideoFpsRangesFor.length()) {
            return null;
        }
        java.util.regex.Matcher matcher = this.getHighResolutionOutputSizeshNQ4ISI.pattern().matcher(this.getHighSpeedVideoFpsRangesFor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(matcher, "");
        highResolutionOutputSizeshNQ4ISI = kotlin.text.RegexKt.getHighResolutionOutputSizeshNQ4ISI(matcher, end, this.getHighSpeedVideoFpsRangesFor);
        return highResolutionOutputSizeshNQ4ISI;
    }
}
