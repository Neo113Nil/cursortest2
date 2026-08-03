package io.ktor.http;

/* compiled from: ContentRange.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/LongRange;", "range", "", "fullLength", "Lio/ktor/http/RangeUnits;", "unit", "", "contentRangeHeaderValue", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;Lio/ktor/http/RangeUnits;)Ljava/lang/String;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentRangeKt {
    public static /* synthetic */ java.lang.String contentRangeHeaderValue$default(kotlin.ranges.LongRange longRange, java.lang.Long l, io.ktor.http.RangeUnits rangeUnits, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            rangeUnits = io.ktor.http.RangeUnits.Bytes;
        }
        return contentRangeHeaderValue(longRange, l, rangeUnits);
    }

    public static final java.lang.String contentRangeHeaderValue(kotlin.ranges.LongRange longRange, java.lang.Long l, io.ktor.http.RangeUnits unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        return contentRangeHeaderValue(longRange, l, unit.getUnitToken());
    }

    public static /* synthetic */ java.lang.String contentRangeHeaderValue$default(kotlin.ranges.LongRange longRange, java.lang.Long l, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            str = io.ktor.http.RangeUnits.Bytes.getUnitToken();
        }
        return contentRangeHeaderValue(longRange, l, str);
    }

    public static final java.lang.String contentRangeHeaderValue(kotlin.ranges.LongRange longRange, java.lang.Long l, java.lang.String unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(unit);
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        if (longRange != null) {
            sb.append(longRange.getFirst());
            sb.append('-');
            sb.append(longRange.getLast());
        } else {
            sb.append(io.ktor.util.date.GMTDateParser.ANY);
        }
        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        java.lang.Object obj = l;
        if (l == null) {
            obj = "*";
        }
        sb.append(obj);
        return sb.toString();
    }
}
