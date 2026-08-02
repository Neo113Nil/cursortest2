package com.datadog.android.profiling.internal.perfetto;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "tag", "resultFilePath", "<init>", "(JJLjava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(JJLjava/lang/String;Ljava/lang/String;)Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getEnd", "Ljava/lang/String;", "getResultFilePath", "getStart", "getTag"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PerfettoResult {
    private final long end;
    private final java.lang.String resultFilePath;
    private final long start;
    private final java.lang.String tag;

    public PerfettoResult(long j, long j2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.start = j;
        this.end = j2;
        this.tag = str;
        this.resultFilePath = str2;
    }

    public final long getStart() {
        return this.start;
    }

    public final long getEnd() {
        return this.end;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String getResultFilePath() {
        return this.resultFilePath;
    }

    public final java.lang.String toString() {
        long j = this.start;
        long j2 = this.end;
        java.lang.String str = this.tag;
        java.lang.String str2 = this.resultFilePath;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PerfettoResult(start=");
        sb.append(j);
        sb.append(", end=");
        sb.append(j2);
        sb.append(", tag=");
        sb.append(str);
        sb.append(", resultFilePath=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Long.hashCode(this.start) * 31) + java.lang.Long.hashCode(this.end)) * 31) + this.tag.hashCode()) * 31) + this.resultFilePath.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.profiling.internal.perfetto.PerfettoResult)) {
            return false;
        }
        com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult = (com.datadog.android.profiling.internal.perfetto.PerfettoResult) other;
        return this.start == perfettoResult.start && this.end == perfettoResult.end && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, perfettoResult.tag) && kotlin.jvm.internal.Intrinsics.areEqual(this.resultFilePath, perfettoResult.resultFilePath);
    }

    public final com.datadog.android.profiling.internal.perfetto.PerfettoResult copy(long start, long end, java.lang.String tag, java.lang.String resultFilePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultFilePath, "");
        return new com.datadog.android.profiling.internal.perfetto.PerfettoResult(start, end, tag, resultFilePath);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getResultFilePath() {
        return this.resultFilePath;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* renamed from: component1, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    public static /* synthetic */ com.datadog.android.profiling.internal.perfetto.PerfettoResult copy$default(com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult, long j, long j2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = perfettoResult.start;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = perfettoResult.end;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = perfettoResult.tag;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = perfettoResult.resultFilePath;
        }
        return perfettoResult.copy(j3, j4, str3, str2);
    }
}
