package kotlin.text;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlin/text/MatchResult;", "", io.ktor.http.LinkHeader.Rel.Next, "()Lkotlin/text/MatchResult;", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "range", "", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "groups", "", "getGroupValues", "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "destructured", "Destructured"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MatchResult {
    kotlin.text.MatchResult.Destructured getDestructured();

    java.util.List<java.lang.String> getGroupValues();

    kotlin.text.MatchGroupCollection getGroups();

    kotlin.ranges.IntRange getRange();

    java.lang.String getValue();

    kotlin.text.MatchResult next();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static kotlin.text.MatchResult.Destructured getDestructured(kotlin.text.MatchResult matchResult) {
            return new kotlin.text.MatchResult.Destructured(matchResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "Lkotlin/text/MatchResult;", "match", "<init>", "(Lkotlin/text/MatchResult;)V", "", "", "toList", "()Ljava/util/List;", "Lkotlin/text/MatchResult;", "getMatch", "()Lkotlin/text/MatchResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Destructured {
        private final kotlin.text.MatchResult match;

        public Destructured(kotlin.text.MatchResult matchResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "");
            this.match = matchResult;
        }

        public final kotlin.text.MatchResult getMatch() {
            return this.match;
        }

        public final java.util.List<java.lang.String> toList() {
            return this.match.getGroupValues().subList(1, this.match.getGroupValues().size());
        }
    }
}
