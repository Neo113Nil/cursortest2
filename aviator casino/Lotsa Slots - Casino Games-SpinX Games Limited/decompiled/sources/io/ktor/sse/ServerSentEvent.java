package io.ktor.sse;

/* compiled from: ServerSentEvent.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJL\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lio/ktor/sse/ServerSentEvent;", "Lio/ktor/sse/ServerSentEventMetadata;", "", "data", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "id", "", "retry", "comments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lio/ktor/sse/ServerSentEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getData", "getEvent", "getId", "Ljava/lang/Long;", "getRetry", "getComments", "ktor-sse"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ServerSentEvent implements io.ktor.sse.ServerSentEventMetadata<java.lang.String> {
    private final java.lang.String comments;
    private final java.lang.String data;
    private final java.lang.String event;
    private final java.lang.String id;
    private final java.lang.Long retry;

    public ServerSentEvent() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ io.ktor.sse.ServerSentEvent copy$default(io.ktor.sse.ServerSentEvent serverSentEvent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = serverSentEvent.data;
        }
        if ((i & 2) != 0) {
            str2 = serverSentEvent.event;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = serverSentEvent.id;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            l = serverSentEvent.retry;
        }
        java.lang.Long l2 = l;
        if ((i & 16) != 0) {
            str4 = serverSentEvent.comments;
        }
        return serverSentEvent.copy(str, str5, str6, l2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEvent() {
        return this.event;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getRetry() {
        return this.retry;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getComments() {
        return this.comments;
    }

    public final io.ktor.sse.ServerSentEvent copy(java.lang.String data, java.lang.String event, java.lang.String id, java.lang.Long retry, java.lang.String comments) {
        return new io.ktor.sse.ServerSentEvent(data, event, id, retry, comments);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.sse.ServerSentEvent)) {
            return false;
        }
        io.ktor.sse.ServerSentEvent serverSentEvent = (io.ktor.sse.ServerSentEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.data, serverSentEvent.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.event, serverSentEvent.event) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, serverSentEvent.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.retry, serverSentEvent.retry) && kotlin.jvm.internal.Intrinsics.areEqual(this.comments, serverSentEvent.comments);
    }

    public int hashCode() {
        java.lang.String str = this.data;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.event;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l = this.retry;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.String str4 = this.comments;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public ServerSentEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.lang.String str4) {
        this.data = str;
        this.event = str2;
        this.id = str3;
        this.retry = l;
        this.comments = str4;
    }

    public /* synthetic */ ServerSentEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4);
    }

    @Override // io.ktor.sse.ServerSentEventMetadata
    public java.lang.String getData() {
        return this.data;
    }

    @Override // io.ktor.sse.ServerSentEventMetadata
    public java.lang.String getEvent() {
        return this.event;
    }

    @Override // io.ktor.sse.ServerSentEventMetadata
    public java.lang.String getId() {
        return this.id;
    }

    @Override // io.ktor.sse.ServerSentEventMetadata
    public java.lang.Long getRetry() {
        return this.retry;
    }

    @Override // io.ktor.sse.ServerSentEventMetadata
    public java.lang.String getComments() {
        return this.comments;
    }

    public java.lang.String toString() {
        java.lang.String eventToString;
        eventToString = io.ktor.sse.ServerSentEventKt.eventToString(getData(), getEvent(), getId(), getRetry(), getComments());
        return eventToString;
    }
}
