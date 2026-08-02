package com.paypal.oslo.core.network.sse.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/network/sse/model/SseEvent;", "", "", "id", "event", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/network/sse/model/SseEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getEvent", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SseEvent {
    private final java.lang.String data;
    private final java.lang.String event;
    private final java.lang.String id;

    public SseEvent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.event = str2;
        this.data = str3;
    }

    public /* synthetic */ SseEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getEvent() {
        return this.event;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.event;
        java.lang.String str3 = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SseEvent(id=");
        sb.append(str);
        sb.append(", event=");
        sb.append(str2);
        sb.append(", data=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.event;
        return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.data.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.network.sse.model.SseEvent)) {
            return false;
        }
        com.paypal.oslo.core.network.sse.model.SseEvent sseEvent = (com.paypal.oslo.core.network.sse.model.SseEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, sseEvent.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.event, sseEvent.event) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, sseEvent.data);
    }

    public final com.paypal.oslo.core.network.sse.model.SseEvent copy(java.lang.String id, java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.core.network.sse.model.SseEvent(id, event, data);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEvent() {
        return this.event;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.core.network.sse.model.SseEvent copy$default(com.paypal.oslo.core.network.sse.model.SseEvent sseEvent, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sseEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = sseEvent.event;
        }
        if ((i & 4) != 0) {
            str3 = sseEvent.data;
        }
        return sseEvent.copy(str, str2, str3);
    }
}
