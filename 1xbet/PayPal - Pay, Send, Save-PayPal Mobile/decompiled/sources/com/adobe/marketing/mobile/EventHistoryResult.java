package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/EventHistoryResult;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "oldestOccurrence", "newestOccurrence", "<init>", "(ILjava/lang/Long;Ljava/lang/Long;)V", "component1", "()I", "component2", "()Ljava/lang/Long;", "component3", "copy", "(ILjava/lang/Long;Ljava/lang/Long;)Lcom/adobe/marketing/mobile/EventHistoryResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "Ljava/lang/Long;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EventHistoryResult {
    public static final int $stable = 0;
    public final int count;
    public final java.lang.Long newestOccurrence;
    public final java.lang.Long oldestOccurrence;

    public EventHistoryResult(int i, java.lang.Long l, java.lang.Long l2) {
        this.count = i;
        this.oldestOccurrence = l;
        this.newestOccurrence = l2;
    }

    public /* synthetic */ EventHistoryResult(int i, java.lang.Long l, java.lang.Long l2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventHistoryResult(count=");
        sb.append(this.count);
        sb.append(", oldestOccurrence=");
        sb.append(this.oldestOccurrence);
        sb.append(", newestOccurrence=");
        sb.append(this.newestOccurrence);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.count);
        java.lang.Long l = this.oldestOccurrence;
        int hashCode2 = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.newestOccurrence;
        return (((hashCode * 31) + hashCode2) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.adobe.marketing.mobile.EventHistoryResult)) {
            return false;
        }
        com.adobe.marketing.mobile.EventHistoryResult eventHistoryResult = (com.adobe.marketing.mobile.EventHistoryResult) other;
        return this.count == eventHistoryResult.count && kotlin.jvm.internal.Intrinsics.areEqual(this.oldestOccurrence, eventHistoryResult.oldestOccurrence) && kotlin.jvm.internal.Intrinsics.areEqual(this.newestOccurrence, eventHistoryResult.newestOccurrence);
    }

    public final com.adobe.marketing.mobile.EventHistoryResult copy(int count, java.lang.Long oldestOccurrence, java.lang.Long newestOccurrence) {
        return new com.adobe.marketing.mobile.EventHistoryResult(count, oldestOccurrence, newestOccurrence);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getNewestOccurrence() {
        return this.newestOccurrence;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getOldestOccurrence() {
        return this.oldestOccurrence;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public static /* synthetic */ com.adobe.marketing.mobile.EventHistoryResult copy$default(com.adobe.marketing.mobile.EventHistoryResult eventHistoryResult, int i, java.lang.Long l, java.lang.Long l2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = eventHistoryResult.count;
        }
        if ((i2 & 2) != 0) {
            l = eventHistoryResult.oldestOccurrence;
        }
        if ((i2 & 4) != 0) {
            l2 = eventHistoryResult.newestOccurrence;
        }
        return eventHistoryResult.copy(i, l, l2);
    }
}
