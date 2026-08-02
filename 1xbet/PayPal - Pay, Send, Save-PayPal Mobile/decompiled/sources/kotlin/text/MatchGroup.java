package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lkotlin/text/MatchGroup;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/ranges/IntRange;", "range", "<init>", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/ranges/IntRange;", "copy", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Lkotlin/text/MatchGroup;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Lkotlin/ranges/IntRange;", "getRange"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MatchGroup {
    private final kotlin.ranges.IntRange range;
    private final java.lang.String value;

    public MatchGroup(java.lang.String str, kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        this.value = str;
        this.range = intRange;
    }

    public final kotlin.ranges.IntRange getRange() {
        return this.range;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MatchGroup(value=");
        sb.append(this.value);
        sb.append(", range=");
        sb.append(this.range);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.value.hashCode() * 31) + this.range.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.text.MatchGroup)) {
            return false;
        }
        kotlin.text.MatchGroup matchGroup = (kotlin.text.MatchGroup) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, matchGroup.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.range, matchGroup.range);
    }

    public final kotlin.text.MatchGroup copy(java.lang.String value, kotlin.ranges.IntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        return new kotlin.text.MatchGroup(value, range);
    }

    /* renamed from: component2, reason: from getter */
    public final kotlin.ranges.IntRange getRange() {
        return this.range;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public static /* synthetic */ kotlin.text.MatchGroup copy$default(kotlin.text.MatchGroup matchGroup, java.lang.String str, kotlin.ranges.IntRange intRange, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = matchGroup.value;
        }
        if ((i & 2) != 0) {
            intRange = matchGroup.range;
        }
        return matchGroup.copy(str, intRange);
    }
}
