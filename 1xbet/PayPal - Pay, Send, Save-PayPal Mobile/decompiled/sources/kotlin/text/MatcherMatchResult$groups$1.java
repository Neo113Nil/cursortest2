package kotlin.text;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/text/MatcherMatchResult$groups$1;", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lkotlin/text/MatchGroup;", "", "name", "(Ljava/lang/String;)Lkotlin/text/MatchGroup;", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MatcherMatchResult$groups$1 extends kotlin.collections.AbstractCollection<kotlin.text.MatchGroup> implements kotlin.text.MatchNamedGroupCollection {
    final /* synthetic */ kotlin.text.MatcherMatchResult getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    MatcherMatchResult$groups$1(kotlin.text.MatcherMatchResult matcherMatchResult) {
        this.getHighSpeedVideoFpsRangesFor = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj == null || (obj instanceof kotlin.text.MatchGroup)) {
            return contains((kotlin.text.MatchGroup) obj);
        }
        return false;
    }

    public final /* bridge */ boolean contains(kotlin.text.MatchGroup matchGroup) {
        return super.contains((java.lang.Object) matchGroup);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        java.util.regex.MatchResult highSpeedVideoFpsRangesFor;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        return highSpeedVideoFpsRangesFor.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<kotlin.text.MatchGroup> iterator() {
        return kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(kotlin.collections.CollectionsKt.getIndices(this)), new kotlin.jvm.functions.Function1() { // from class: kotlin.text.MatcherMatchResult$groups$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.text.MatchGroup matchGroup;
                matchGroup = kotlin.text.MatcherMatchResult$groups$1.this.get(((java.lang.Integer) obj).intValue());
                return matchGroup;
            }
        }).iterator();
    }

    @Override // kotlin.text.MatchGroupCollection
    public final kotlin.text.MatchGroup get(int index) {
        java.util.regex.MatchResult highSpeedVideoFpsRangesFor;
        kotlin.ranges.IntRange until;
        java.util.regex.MatchResult highSpeedVideoFpsRangesFor2;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        until = kotlin.ranges.RangesKt.until(highSpeedVideoFpsRangesFor.start(index), highSpeedVideoFpsRangesFor.end(index));
        if (until.getStart().intValue() < 0) {
            return null;
        }
        highSpeedVideoFpsRangesFor2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        java.lang.String group = highSpeedVideoFpsRangesFor2.group(index);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "");
        return new kotlin.text.MatchGroup(group, until);
    }

    @Override // kotlin.text.MatchNamedGroupCollection
    public final kotlin.text.MatchGroup get(java.lang.String name2) {
        java.util.regex.MatchResult highSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.internal.PlatformImplementations platformImplementations = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        return platformImplementations.getMatchResultNamedGroup(highSpeedVideoFpsRangesFor, name2);
    }
}
