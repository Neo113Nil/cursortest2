package io.ktor.sse;

/* compiled from: ServerSentEvent.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013JR\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b)\u0010\u0013¨\u0006*"}, d2 = {"Lio/ktor/sse/TypedServerSentEvent;", "T", "Lio/ktor/sse/ServerSentEventMetadata;", "data", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "id", "", "retry", "comments", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Lkotlin/Function1;", "serializer", "toString", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lio/ktor/sse/TypedServerSentEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getData", "Ljava/lang/String;", "getEvent", "getId", "Ljava/lang/Long;", "getRetry", "getComments", "ktor-sse"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TypedServerSentEvent<T> implements io.ktor.sse.ServerSentEventMetadata<T> {
    private final java.lang.String comments;
    private final T data;
    private final java.lang.String event;
    private final java.lang.String id;
    private final java.lang.Long retry;

    public TypedServerSentEvent() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.ktor.sse.TypedServerSentEvent copy$default(io.ktor.sse.TypedServerSentEvent typedServerSentEvent, java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, int i, java.lang.Object obj2) {
        T t = obj;
        if ((i & 1) != 0) {
            t = typedServerSentEvent.data;
        }
        if ((i & 2) != 0) {
            str = typedServerSentEvent.event;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = typedServerSentEvent.id;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            l = typedServerSentEvent.retry;
        }
        java.lang.Long l2 = l;
        if ((i & 16) != 0) {
            str3 = typedServerSentEvent.comments;
        }
        return typedServerSentEvent.copy(t, str4, str5, l2, str3);
    }

    public final T component1() {
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

    public final io.ktor.sse.TypedServerSentEvent<T> copy(T data, java.lang.String event, java.lang.String id, java.lang.Long retry, java.lang.String comments) {
        return new io.ktor.sse.TypedServerSentEvent<>(data, event, id, retry, comments);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.sse.TypedServerSentEvent)) {
            return false;
        }
        io.ktor.sse.TypedServerSentEvent typedServerSentEvent = (io.ktor.sse.TypedServerSentEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.data, typedServerSentEvent.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.event, typedServerSentEvent.event) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, typedServerSentEvent.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.retry, typedServerSentEvent.retry) && kotlin.jvm.internal.Intrinsics.areEqual(this.comments, typedServerSentEvent.comments);
    }

    public int hashCode() {
        T t = this.data;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        java.lang.String str = this.event;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l = this.retry;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.String str3 = this.comments;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TypedServerSentEvent(data=" + this.data + ", event=" + this.event + ", id=" + this.id + ", retry=" + this.retry + ", comments=" + this.comments + ')';
    }

    public TypedServerSentEvent(T t, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3) {
        this.data = t;
        this.event = str;
        this.id = str2;
        this.retry = l;
        this.comments = str3;
    }

    public /* synthetic */ TypedServerSentEvent(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3);
    }

    @Override // io.ktor.sse.ServerSentEventMetadata
    public T getData() {
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

    public final java.lang.String toString(kotlin.jvm.functions.Function1<? super T, java.lang.String> serializer) {
        java.lang.String eventToString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        T data = getData();
        eventToString = io.ktor.sse.ServerSentEventKt.eventToString(data != null ? serializer.invoke(data) : null, getEvent(), getId(), getRetry(), getComments());
        return eventToString;
    }
}
