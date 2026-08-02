package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR\u0014\u0010)\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010&"}, d2 = {"Lio/ktor/http/content/LastModifiedVersion;", "Lio/ktor/http/content/Version;", "Lio/ktor/util/date/GMTDate;", "lastModified", "<init>", "(Lio/ktor/util/date/GMTDate;)V", "Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/VersionCheckResult;", "check", "(Lio/ktor/http/Headers;)Lio/ktor/http/content/VersionCheckResult;", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER_DATES_ITEM, "", "ifModifiedSince", "(Ljava/util/List;)Z", "ifUnmodifiedSince", "Lio/ktor/http/HeadersBuilder;", "builder", "", "appendHeadersTo", "(Lio/ktor/http/HeadersBuilder;)V", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;)Ljava/util/List;", "component1", "()Lio/ktor/util/date/GMTDate;", "copy", "(Lio/ktor/util/date/GMTDate;)Lio/ktor/http/content/LastModifiedVersion;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lio/ktor/util/date/GMTDate;", "getLastModified", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LastModifiedVersion implements io.ktor.http.content.Version {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final io.ktor.util.date.GMTDate getHighSpeedVideoSizes;
    private final io.ktor.util.date.GMTDate lastModified;

    public LastModifiedVersion(io.ktor.util.date.GMTDate gMTDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        this.lastModified = gMTDate;
        this.getHighSpeedVideoSizes = io.ktor.util.date.DateKt.truncateToSeconds(gMTDate);
    }

    public final io.ktor.util.date.GMTDate getLastModified() {
        return this.lastModified;
    }

    @Override // io.ktor.http.content.Version
    public final io.ktor.http.content.VersionCheckResult check(io.ktor.http.Headers requestHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
        java.util.List<java.lang.String> all = requestHeaders.getAll(io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince());
        java.util.List<io.ktor.util.date.GMTDate> highSpeedVideoFpsRanges = all != null ? getHighSpeedVideoFpsRanges(all) : null;
        if (highSpeedVideoFpsRanges != null && !ifModifiedSince(highSpeedVideoFpsRanges)) {
            return io.ktor.http.content.VersionCheckResult.NOT_MODIFIED;
        }
        java.util.List<java.lang.String> all2 = requestHeaders.getAll(io.ktor.http.HttpHeaders.INSTANCE.getIfUnmodifiedSince());
        java.util.List<io.ktor.util.date.GMTDate> highSpeedVideoFpsRanges2 = all2 != null ? getHighSpeedVideoFpsRanges(all2) : null;
        if (highSpeedVideoFpsRanges2 != null && !ifUnmodifiedSince(highSpeedVideoFpsRanges2)) {
            return io.ktor.http.content.VersionCheckResult.PRECONDITION_FAILED;
        }
        return io.ktor.http.content.VersionCheckResult.OK;
    }

    public final boolean ifModifiedSince(java.util.List<io.ktor.util.date.GMTDate> dates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dates, "");
        java.util.List<io.ktor.util.date.GMTDate> list = dates;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.getHighSpeedVideoSizes.compareTo((io.ktor.util.date.GMTDate) it.next()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean ifUnmodifiedSince(java.util.List<io.ktor.util.date.GMTDate> dates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dates, "");
        java.util.List<io.ktor.util.date.GMTDate> list = dates;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.getHighSpeedVideoSizes.compareTo((io.ktor.util.date.GMTDate) it.next()) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // io.ktor.http.content.Version
    public final void appendHeadersTo(io.ktor.http.HeadersBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.set(io.ktor.http.HttpHeaders.INSTANCE.getLastModified(), io.ktor.http.DateUtilsKt.toHttpDate(this.lastModified));
    }

    private static java.util.List<io.ktor.util.date.GMTDate> getHighSpeedVideoFpsRanges(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            io.ktor.util.date.GMTDate gMTDate = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                gMTDate = io.ktor.http.DateUtilsKt.fromHttpToGmtDate((java.lang.String) it.next());
            } catch (java.lang.Throwable unused) {
            }
            if (gMTDate != null) {
                arrayList2.add(gMTDate);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return null;
        }
        return arrayList3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LastModifiedVersion(lastModified=");
        sb.append(this.lastModified);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.lastModified.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof io.ktor.http.content.LastModifiedVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastModified, ((io.ktor.http.content.LastModifiedVersion) other).lastModified);
    }

    public final io.ktor.http.content.LastModifiedVersion copy(io.ktor.util.date.GMTDate lastModified) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastModified, "");
        return new io.ktor.http.content.LastModifiedVersion(lastModified);
    }

    /* renamed from: component1, reason: from getter */
    public final io.ktor.util.date.GMTDate getLastModified() {
        return this.lastModified;
    }

    public static /* synthetic */ io.ktor.http.content.LastModifiedVersion copy$default(io.ktor.http.content.LastModifiedVersion lastModifiedVersion, io.ktor.util.date.GMTDate gMTDate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            gMTDate = lastModifiedVersion.lastModified;
        }
        return lastModifiedVersion.copy(gMTDate);
    }
}
