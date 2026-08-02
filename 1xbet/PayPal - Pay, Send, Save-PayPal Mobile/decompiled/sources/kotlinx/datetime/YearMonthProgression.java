package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0014\u0010,\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010!"}, d2 = {"Lkotlinx/datetime/YearMonthProgression;", "", "Lkotlinx/datetime/YearMonth;", "Lkotlin/ranges/LongProgression;", "longProgression", "<init>", "(Lkotlin/ranges/LongProgression;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "", "step", "(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;J)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "elements", "containsAll", "(Ljava/util/Collection;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "contains", "(Lkotlinx/datetime/YearMonth;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/ranges/LongProgression;", "getLongProgression$kotlinx_datetime", "()Lkotlin/ranges/LongProgression;", "first", "Lkotlinx/datetime/YearMonth;", "getFirst", "()Lkotlinx/datetime/YearMonth;", "last", "getLast", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class YearMonthProgression implements java.util.Collection<kotlinx.datetime.YearMonth>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.YearMonthProgression.Companion INSTANCE = new kotlinx.datetime.YearMonthProgression.Companion(null);
    private final kotlinx.datetime.YearMonth first;
    private final kotlinx.datetime.YearMonth last;
    private final kotlin.ranges.LongProgression longProgression;

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlinx.datetime.YearMonth) {
            return contains((kotlinx.datetime.YearMonth) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    public YearMonthProgression(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "");
        this.longProgression = longProgression;
        this.first = kotlinx.datetime.YearMonthKt.fromProlepticMonth(kotlinx.datetime.YearMonth.INSTANCE, longProgression.getFirst());
        this.last = kotlinx.datetime.YearMonthKt.fromProlepticMonth(kotlinx.datetime.YearMonth.INSTANCE, longProgression.getLast());
    }

    /* renamed from: getLongProgression$kotlinx_datetime, reason: from getter */
    public final kotlin.ranges.LongProgression getLongProgression() {
        return this.longProgression;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YearMonthProgression(kotlinx.datetime.YearMonth yearMonth, kotlinx.datetime.YearMonth yearMonth2, long j) {
        this(kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(kotlinx.datetime.YearMonthKt.getProlepticMonth(yearMonth), kotlinx.datetime.YearMonthKt.getProlepticMonth(yearMonth2), j));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearMonth2, "");
    }

    public final kotlinx.datetime.YearMonth getFirst() {
        return this.first;
    }

    public final kotlinx.datetime.YearMonth getLast() {
        return this.last;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.LongIterator] */
    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<kotlinx.datetime.YearMonth> iterator() {
        return new kotlinx.datetime.YearMonthProgressionIterator(this.longProgression.iterator());
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.longProgression.isEmpty();
    }

    public java.lang.String toString() {
        if (this.longProgression.getStep() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            sb.append(this.longProgression.getStep());
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.first);
        sb2.append(" downTo ");
        sb2.append(this.last);
        sb2.append(" step ");
        sb2.append(this.longProgression.getStep());
        sb2.append(io.ktor.util.date.GMTDateParser.MONTH);
        return sb2.toString();
    }

    public int getSize() {
        return kotlinx.datetime.internal.MathKt.getSizeUnsafe(this.longProgression);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection) {
            if (!(obj instanceof kotlinx.datetime.YearMonth) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(kotlinx.datetime.YearMonth value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return kotlinx.datetime.internal.MathKt.containsUnsafe(this.longProgression, kotlinx.datetime.YearMonthKt.getProlepticMonth(value));
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.YearMonthProgression) && kotlin.jvm.internal.Intrinsics.areEqual(this.longProgression, ((kotlinx.datetime.YearMonthProgression) other).longProgression);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.longProgression.hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/datetime/YearMonthProgression$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/YearMonth;", "rangeStart", "rangeEnd", "", "stepValue", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "stepUnit", "Lkotlinx/datetime/YearMonthProgression;", "fromClosedRange$kotlinx_datetime", "(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;JLkotlinx/datetime/DateTimeUnit$MonthBased;)Lkotlinx/datetime/YearMonthProgression;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.datetime.YearMonthProgression fromClosedRange$kotlinx_datetime(kotlinx.datetime.YearMonth rangeStart, kotlinx.datetime.YearMonth rangeEnd, long stepValue, kotlinx.datetime.DateTimeUnit.MonthBased stepUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rangeStart, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rangeEnd, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUnit, "");
            return new kotlinx.datetime.YearMonthProgression(rangeStart, rangeEnd, kotlinx.datetime.internal.MathKt.safeMultiplyOrClamp(stepValue, stepUnit.getMonths()));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(java.util.function.Predicate<? super kotlinx.datetime.YearMonth> predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends kotlinx.datetime.YearMonth> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(kotlinx.datetime.YearMonth yearMonth) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(kotlinx.datetime.YearMonth yearMonth) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
