package io.ktor.http;

/* compiled from: Ranges.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\b\u0012\u0004\u0012\u00020\t0\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "rangeSpec", "Lio/ktor/http/RangesSpecifier;", "parseRangesSpecifier", "(Ljava/lang/String;)Lio/ktor/http/RangesSpecifier;", "", "Lio/ktor/http/ContentRange;", "", "contentLength", "Lkotlin/ranges/LongRange;", "toLongRanges", "(Ljava/util/List;J)Ljava/util/List;", "mergeRangesKeepOrder", "(Ljava/util/List;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RangesKt {
    public static final io.ktor.http.RangesSpecifier parseRangesSpecifier(java.lang.String rangeSpec) {
        kotlin.Pair pair;
        io.ktor.http.ContentRange bounded;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rangeSpec, "rangeSpec");
        try {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) rangeSpec, com.ironsource.X3.j.b, 0, false, 6, (java.lang.Object) null);
            if (indexOf$default == -1) {
                return null;
            }
            java.lang.String substring = rangeSpec.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            java.lang.String substring2 = rangeSpec.substring(indexOf$default + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            kotlin.Pair pair2 = kotlin.TuplesKt.to(substring, substring2);
            java.lang.String str = (java.lang.String) pair2.component1();
            java.util.List<java.lang.String> split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) pair2.component2(), new char[]{kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
            for (java.lang.String str2 : split$default) {
                if (kotlin.text.StringsKt.startsWith$default(str2, "-", false, 2, (java.lang.Object) null)) {
                    bounded = new io.ktor.http.ContentRange.Suffix(java.lang.Long.parseLong(kotlin.text.StringsKt.removePrefix(str2, (java.lang.CharSequence) "-")));
                } else {
                    int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, "-", 0, false, 6, (java.lang.Object) null);
                    if (indexOf$default2 == -1) {
                        pair = kotlin.TuplesKt.to("", "");
                    } else {
                        java.lang.String substring3 = str2.substring(0, indexOf$default2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                        java.lang.String substring4 = str2.substring(indexOf$default2 + 1);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                        pair = kotlin.TuplesKt.to(substring3, substring4);
                    }
                    java.lang.String str3 = (java.lang.String) pair.component1();
                    java.lang.String str4 = (java.lang.String) pair.component2();
                    bounded = str4.length() > 0 ? new io.ktor.http.ContentRange.Bounded(java.lang.Long.parseLong(str3), java.lang.Long.parseLong(str4)) : new io.ktor.http.ContentRange.TailFrom(java.lang.Long.parseLong(str3));
                }
                arrayList.add(bounded);
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty() && str.length() != 0) {
                io.ktor.http.RangesSpecifier rangesSpecifier = new io.ktor.http.RangesSpecifier(str, arrayList2);
                if (io.ktor.http.RangesSpecifier.isValid$default(rangesSpecifier, null, 1, null)) {
                    return rangesSpecifier;
                }
                return null;
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.util.List<kotlin.ranges.LongRange> toLongRanges(java.util.List<? extends io.ktor.http.ContentRange> list, long j) {
        kotlin.ranges.LongRange until;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        java.util.List<? extends io.ktor.http.ContentRange> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (io.ktor.http.ContentRange contentRange : list2) {
            if (contentRange instanceof io.ktor.http.ContentRange.Bounded) {
                io.ktor.http.ContentRange.Bounded bounded = (io.ktor.http.ContentRange.Bounded) contentRange;
                until = new kotlin.ranges.LongRange(bounded.getFrom(), kotlin.ranges.RangesKt.coerceAtMost(bounded.getTo(), j - 1));
            } else if (contentRange instanceof io.ktor.http.ContentRange.TailFrom) {
                until = kotlin.ranges.RangesKt.until(((io.ktor.http.ContentRange.TailFrom) contentRange).getFrom(), j);
            } else {
                if (!(contentRange instanceof io.ktor.http.ContentRange.Suffix)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                until = kotlin.ranges.RangesKt.until(kotlin.ranges.RangesKt.coerceAtLeast(j - ((io.ktor.http.ContentRange.Suffix) contentRange).getLastCount(), 0L), j);
            }
            arrayList.add(until);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!((kotlin.ranges.LongRange) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final java.util.List<kotlin.ranges.LongRange> mergeRangesKeepOrder(java.util.List<kotlin.ranges.LongRange> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        java.util.List<kotlin.ranges.LongRange> sortedWith = kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: io.ktor.http.RangesKt$mergeRangesKeepOrder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((kotlin.ranges.LongRange) t).getFirst()), java.lang.Long.valueOf(((kotlin.ranges.LongRange) t2).getFirst()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (kotlin.ranges.LongRange longRange : sortedWith) {
            if (arrayList.isEmpty()) {
                arrayList.add(longRange);
            } else {
                java.util.ArrayList arrayList2 = arrayList;
                if (((kotlin.ranges.LongRange) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).getLast() < longRange.getFirst() - 1) {
                    arrayList.add(longRange);
                } else {
                    kotlin.ranges.LongRange longRange2 = (kotlin.ranges.LongRange) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2);
                    arrayList.set(kotlin.collections.CollectionsKt.getLastIndex(arrayList2), new kotlin.ranges.LongRange(longRange2.getFirst(), java.lang.Math.max(longRange2.getLast(), longRange.getLast())));
                }
            }
        }
        kotlin.ranges.LongRange[] longRangeArr = new kotlin.ranges.LongRange[list.size()];
        java.util.Iterator it = arrayList.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            kotlin.ranges.LongRange longRange3 = (kotlin.ranges.LongRange) next;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (io.ktor.util.RangesKt.contains(longRange3, list.get(i))) {
                    longRangeArr[i] = longRange3;
                    break;
                }
                i++;
            }
        }
        return kotlin.collections.ArraysKt.filterNotNull(longRangeArr);
    }
}
