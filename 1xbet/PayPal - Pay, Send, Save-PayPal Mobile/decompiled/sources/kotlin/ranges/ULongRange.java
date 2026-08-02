package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001!B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010 \u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u001b"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains-VKZWuLQ", "(J)Z", "contains", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getStart-s-VKNKU", "()J", "getEndInclusive-s-VKNKU", "getEndExclusive-s-VKNKU", "getEndExclusive-s-VKNKU$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ULongRange extends kotlin.ranges.ULongProgression implements kotlin.ranges.ClosedRange<kotlin.ULong>, kotlin.ranges.OpenEndRange<kotlin.ULong> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.ULongRange.Companion INSTANCE = new kotlin.ranges.ULongRange.Companion(null);
    private static final kotlin.ranges.ULongRange EMPTY = new kotlin.ranges.ULongRange(-1, 0, null);

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m23854getEndExclusivesVKNKU$annotations() {
    }

    private ULongRange(long j, long j2) {
        super(j, j2, 1L, null);
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(kotlin.ULong uLong) {
        return m23855containsVKZWuLQ(uLong.getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* synthetic */ kotlin.ULong getEndExclusive() {
        return kotlin.ULong.m23493boximpl(m23856getEndExclusivesVKNKU());
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ kotlin.ULong getEndInclusive() {
        return kotlin.ULong.m23493boximpl(m23857getEndInclusivesVKNKU());
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ kotlin.ULong getStart() {
        return kotlin.ULong.m23493boximpl(m23858getStartsVKNKU());
    }

    /* renamed from: getStart-s-VKNKU, reason: not valid java name */
    public final long m23858getStartsVKNKU() {
        return getFirst();
    }

    /* renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public final long m23857getEndInclusivesVKNKU() {
        return getLast();
    }

    /* renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public final long m23856getEndExclusivesVKNKU() {
        if (getLast() == -1) {
            throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return kotlin.ULong.m23494constructorimpl(getLast() + kotlin.ULong.m23494constructorimpl(1L));
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public final boolean m23855containsVKZWuLQ(long value) {
        return java.lang.Long.compareUnsigned(getFirst(), value) <= 0 && java.lang.Long.compareUnsigned(value, getLast()) <= 0;
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return java.lang.Long.compareUnsigned(getFirst(), getLast()) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.ranges.ULongRange)) {
            return false;
        }
        if (isEmpty() && ((kotlin.ranges.ULongRange) other).isEmpty()) {
            return true;
        }
        kotlin.ranges.ULongRange uLongRange = (kotlin.ranges.ULongRange) other;
        return getFirst() == uLongRange.getFirst() && getLast() == uLongRange.getLast();
    }

    @Override // kotlin.ranges.ULongProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) kotlin.ULong.m23494constructorimpl(getFirst() ^ kotlin.ULong.m23494constructorimpl(getFirst() >>> 32))) * 31) + ((int) kotlin.ULong.m23494constructorimpl(getLast() ^ kotlin.ULong.m23494constructorimpl(getLast() >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) kotlin.ULong.m23498toStringimpl(getFirst()));
        sb.append("..");
        sb.append((java.lang.Object) kotlin.ULong.m23498toStringimpl(getLast()));
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/ULongRange;", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.ranges.ULongRange getEMPTY() {
            return kotlin.ranges.ULongRange.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ULongRange(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
