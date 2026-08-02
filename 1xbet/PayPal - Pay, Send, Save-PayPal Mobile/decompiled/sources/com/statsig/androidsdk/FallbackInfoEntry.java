package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u001dR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010%"}, d2 = {"Lcom/statsig/androidsdk/FallbackInfoEntry;", "", "", "url", "", "previous", "", "expiryTime", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/util/List;J)Lcom/statsig/androidsdk/FallbackInfoEntry;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getExpiryTime", "setExpiryTime", "(J)V", "Ljava/util/List;", "getPrevious", "setPrevious", "(Ljava/util/List;)V", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FallbackInfoEntry {
    public long expiryTime;
    public java.util.List<java.lang.String> previous;
    public java.lang.String url;

    public FallbackInfoEntry(java.lang.String str, java.util.List<java.lang.String> list, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.url = str;
        this.previous = list;
        this.expiryTime = j;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final void setUrl(java.lang.String str) {
        this.url = str;
    }

    public /* synthetic */ FallbackInfoEntry(java.lang.String str, java.util.ArrayList arrayList, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new java.util.ArrayList() : arrayList, j);
    }

    public final java.util.List<java.lang.String> getPrevious() {
        return this.previous;
    }

    public final void setPrevious(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.previous = list;
    }

    public final long getExpiryTime() {
        return this.expiryTime;
    }

    public final void setExpiryTime(long j) {
        this.expiryTime = j;
    }

    public /* synthetic */ FallbackInfoEntry() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.util.List<java.lang.String> list = this.previous;
        long j = this.expiryTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FallbackInfoEntry(url=");
        sb.append(str);
        sb.append(", previous=");
        sb.append(list);
        sb.append(", expiryTime=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.url;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.previous.hashCode()) * 31) + java.lang.Long.hashCode(this.expiryTime);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.FallbackInfoEntry)) {
            return false;
        }
        com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry = (com.statsig.androidsdk.FallbackInfoEntry) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, fallbackInfoEntry.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.previous, fallbackInfoEntry.previous) && this.expiryTime == fallbackInfoEntry.expiryTime;
    }

    public final com.statsig.androidsdk.FallbackInfoEntry copy(java.lang.String url, java.util.List<java.lang.String> previous, long expiryTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previous, "");
        return new com.statsig.androidsdk.FallbackInfoEntry(url, previous, expiryTime);
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpiryTime() {
        return this.expiryTime;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.previous;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.FallbackInfoEntry copy$default(com.statsig.androidsdk.FallbackInfoEntry fallbackInfoEntry, java.lang.String str, java.util.List list, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fallbackInfoEntry.url;
        }
        if ((i & 2) != 0) {
            list = fallbackInfoEntry.previous;
        }
        if ((i & 4) != 0) {
            j = fallbackInfoEntry.expiryTime;
        }
        return fallbackInfoEntry.copy(str, list, j);
    }
}
