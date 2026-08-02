package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0019B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Lkotlinx/datetime/YearMonthRange;", "Lkotlinx/datetime/YearMonthProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlinx/datetime/YearMonth;", "Lkotlin/ranges/OpenEndRange;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "contains", "(Lkotlinx/datetime/YearMonth;)Z", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "getStart", "()Lkotlinx/datetime/YearMonth;", "getEndInclusive", "getEndExclusive", "getEndExclusive$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YearMonthRange extends kotlinx.datetime.YearMonthProgression implements kotlin.ranges.ClosedRange<kotlinx.datetime.YearMonth>, kotlin.ranges.OpenEndRange<kotlinx.datetime.YearMonth> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.YearMonthRange.Companion INSTANCE = new kotlinx.datetime.YearMonthRange.Companion(null);
    private static final kotlinx.datetime.YearMonthRange EMPTY = new kotlinx.datetime.YearMonthRange(new kotlinx.datetime.YearMonth(0, 2), new kotlinx.datetime.YearMonth(0, 1));

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This throws an exception if the exclusive end if not inside the platform-specific boundaries for YearMonth. The 'endInclusive' property does not throw and should be preferred.")
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearMonthRange(kotlinx.datetime.YearMonth yearMonth, kotlinx.datetime.YearMonth yearMonth2) {
        super(yearMonth, yearMonth2, 1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth2, "");
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* bridge */ /* synthetic */ boolean contains(kotlinx.datetime.YearMonth yearMonth) {
        return contains(yearMonth);
    }

    @Override // kotlin.ranges.ClosedRange
    public final kotlinx.datetime.YearMonth getStart() {
        return getFirst();
    }

    @Override // kotlin.ranges.ClosedRange
    public final kotlinx.datetime.YearMonth getEndInclusive() {
        return getLast();
    }

    @Override // kotlin.ranges.OpenEndRange
    public final kotlinx.datetime.YearMonth getEndExclusive() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getLast(), kotlinx.datetime.YearMonthKt.getMAX(kotlinx.datetime.YearMonth.INSTANCE))) {
            throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes YearMonth.MAX.".toString());
        }
        return kotlinx.datetime.YearMonthKt.plus(getEndInclusive(), 1, kotlinx.datetime.DateTimeUnit.INSTANCE.getMONTH());
    }

    @Override // kotlinx.datetime.YearMonthProgression
    /* renamed from: contains, reason: avoid collision after fix types in other method */
    public final boolean contains2(kotlinx.datetime.YearMonth value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return getFirst().compareTo(value) <= 0 && value.compareTo(getLast()) <= 0;
    }

    @Override // kotlinx.datetime.YearMonthProgression, java.util.Collection
    public final boolean isEmpty() {
        return getFirst().compareTo(getLast()) > 0;
    }

    @Override // kotlinx.datetime.YearMonthProgression
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getFirst());
        sb.append("..");
        sb.append(getLast());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/datetime/YearMonthRange$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/YearMonth;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endExclusive", "Lkotlinx/datetime/YearMonthRange;", "fromRangeUntil$kotlinx_datetime", "(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/YearMonthRange;", "endInclusive", "fromRangeTo$kotlinx_datetime", "EMPTY", "Lkotlinx/datetime/YearMonthRange;", "getEMPTY", "()Lkotlinx/datetime/YearMonthRange;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.datetime.YearMonthRange getEMPTY() {
            return kotlinx.datetime.YearMonthRange.EMPTY;
        }

        public final kotlinx.datetime.YearMonthRange fromRangeUntil$kotlinx_datetime(kotlinx.datetime.YearMonth start, kotlinx.datetime.YearMonth endExclusive) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endExclusive, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(endExclusive, kotlinx.datetime.YearMonthKt.getMIN(kotlinx.datetime.YearMonth.INSTANCE)) ? getEMPTY() : fromRangeTo$kotlinx_datetime(start, kotlinx.datetime.YearMonthKt.minus(endExclusive, 1, kotlinx.datetime.DateTimeUnit.INSTANCE.getMONTH()));
        }

        public final kotlinx.datetime.YearMonthRange fromRangeTo$kotlinx_datetime(kotlinx.datetime.YearMonth start, kotlinx.datetime.YearMonth endInclusive) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endInclusive, "");
            return new kotlinx.datetime.YearMonthRange(start, endInclusive);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
