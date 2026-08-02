package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\nJ#\u0010\u000e\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001e"}, d2 = {"Lio/ktor/http/RangesSpecifier;", "", "", "unit", "", "Lio/ktor/http/ContentRange;", "ranges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Lio/ktor/http/RangeUnits;", "(Lio/ktor/http/RangeUnits;Ljava/util/List;)V", "Lkotlin/Function1;", "", "rangeUnitPredicate", "isValid", "(Lkotlin/jvm/functions/Function1;)Z", "", "length", "", "maxRangeCount", "Lkotlin/ranges/LongRange;", "merge", "(JI)Ljava/util/List;", "(J)Ljava/util/List;", "mergeToSingle", "(J)Lkotlin/ranges/LongRange;", "toString", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/RangesSpecifier;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getUnit", "Ljava/util/List;", "getRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RangesSpecifier {
    private final java.util.List<io.ktor.http.ContentRange> ranges;
    private final java.lang.String unit;

    /* JADX WARN: Multi-variable type inference failed */
    public RangesSpecifier(java.lang.String str, java.util.List<? extends io.ktor.http.ContentRange> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.unit = str;
        this.ranges = list;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("It should be at least one range".toString());
        }
    }

    public /* synthetic */ RangesSpecifier(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? io.ktor.http.RangeUnits.Bytes.getUnitToken() : str, (java.util.List<? extends io.ktor.http.ContentRange>) list);
    }

    public final java.util.List<io.ktor.http.ContentRange> getRanges() {
        return this.ranges;
    }

    public final java.lang.String getUnit() {
        return this.unit;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangesSpecifier(io.ktor.http.RangeUnits rangeUnits, java.util.List<? extends io.ktor.http.ContentRange> list) {
        this(rangeUnits.getUnitToken(), list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rangeUnits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isValid$default(io.ktor.http.RangesSpecifier rangesSpecifier, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.RangesSpecifier$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(io.ktor.http.RangesSpecifier.$r8$lambda$eX1WZAl_VVNiFvxYSfa1H8AJTh0((java.lang.String) obj2));
                }
            };
        }
        return rangesSpecifier.isValid(function1);
    }

    public final boolean isValid(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> rangeUnitPredicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rangeUnitPredicate, "");
        if (!rangeUnitPredicate.invoke(this.unit).booleanValue()) {
            return false;
        }
        java.util.List<io.ktor.http.ContentRange> list = this.ranges;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        for (io.ktor.http.ContentRange contentRange : list) {
            if (contentRange instanceof io.ktor.http.ContentRange.Bounded) {
                io.ktor.http.ContentRange.Bounded bounded = (io.ktor.http.ContentRange.Bounded) contentRange;
                if (bounded.getFrom() < 0 || bounded.getTo() < bounded.getFrom()) {
                    return false;
                }
            } else if (contentRange instanceof io.ktor.http.ContentRange.TailFrom) {
                if (((io.ktor.http.ContentRange.TailFrom) contentRange).getFrom() < 0) {
                    return false;
                }
            } else {
                if (!(contentRange instanceof io.ktor.http.ContentRange.Suffix)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (((io.ktor.http.ContentRange.Suffix) contentRange).getLastCount() < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ java.util.List merge$default(io.ktor.http.RangesSpecifier rangesSpecifier, long j, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 50;
        }
        return rangesSpecifier.merge(j, i);
    }

    public final java.util.List<kotlin.ranges.LongRange> merge(long length, int maxRangeCount) {
        if (this.ranges.size() > maxRangeCount) {
            kotlin.ranges.LongRange mergeToSingle = mergeToSingle(length);
            return mergeToSingle == null ? kotlin.collections.CollectionsKt.emptyList() : kotlin.collections.CollectionsKt.listOf(mergeToSingle);
        }
        return merge(length);
    }

    public final java.util.List<kotlin.ranges.LongRange> merge(long length) {
        return io.ktor.http.RangesKt.mergeRangesKeepOrder(io.ktor.http.RangesKt.toLongRanges(this.ranges, length));
    }

    public final kotlin.ranges.LongRange mergeToSingle(long length) {
        java.lang.Object next;
        java.util.List<kotlin.ranges.LongRange> longRanges = io.ktor.http.RangesKt.toLongRanges(this.ranges, length);
        java.lang.Object obj = null;
        if (longRanges.isEmpty()) {
            return null;
        }
        java.util.List<kotlin.ranges.LongRange> list = longRanges;
        java.util.Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long first = ((kotlin.ranges.LongRange) next).getFirst();
                do {
                    java.lang.Object next2 = it.next();
                    long first2 = ((kotlin.ranges.LongRange) next2).getFirst();
                    if (first > first2) {
                        next = next2;
                        first = first2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(next);
        long first3 = ((kotlin.ranges.LongRange) next).getFirst();
        java.util.Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                long last = ((kotlin.ranges.LongRange) obj).getLast();
                do {
                    java.lang.Object next3 = it2.next();
                    long last2 = ((kotlin.ranges.LongRange) next3).getLast();
                    if (last < last2) {
                        obj = next3;
                        last = last2;
                    }
                } while (it2.hasNext());
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return new kotlin.ranges.LongRange(first3, kotlin.ranges.RangesKt.coerceAtMost(((kotlin.ranges.LongRange) obj).getLast(), length - 1));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.unit);
        sb.append('=');
        return kotlin.collections.CollectionsKt.joinToString$default(this.ranges, ",", sb.toString(), null, 0, null, null, 60, null);
    }

    public static /* synthetic */ boolean $r8$lambda$eX1WZAl_VVNiFvxYSfa1H8AJTh0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.RangeUnits.Bytes.getUnitToken());
    }

    public final int hashCode() {
        return (this.unit.hashCode() * 31) + this.ranges.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.RangesSpecifier)) {
            return false;
        }
        io.ktor.http.RangesSpecifier rangesSpecifier = (io.ktor.http.RangesSpecifier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.unit, rangesSpecifier.unit) && kotlin.jvm.internal.Intrinsics.areEqual(this.ranges, rangesSpecifier.ranges);
    }

    public final io.ktor.http.RangesSpecifier copy(java.lang.String unit, java.util.List<? extends io.ktor.http.ContentRange> ranges) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ranges, "");
        return new io.ktor.http.RangesSpecifier(unit, ranges);
    }

    public final java.util.List<io.ktor.http.ContentRange> component2() {
        return this.ranges;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUnit() {
        return this.unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.ktor.http.RangesSpecifier copy$default(io.ktor.http.RangesSpecifier rangesSpecifier, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rangesSpecifier.unit;
        }
        if ((i & 2) != 0) {
            list = rangesSpecifier.ranges;
        }
        return rangesSpecifier.copy(str, list);
    }
}
