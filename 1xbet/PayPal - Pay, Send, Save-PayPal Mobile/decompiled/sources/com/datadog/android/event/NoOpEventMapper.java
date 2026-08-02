package com.datadog.android.event;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/event/NoOpEventMapper;", "", "T", "Lcom/datadog/android/event/EventMapper;", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "event", "map", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoOpEventMapper<T> implements com.datadog.android.event.EventMapper<T> {
    public final int hashCode() {
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        return other instanceof com.datadog.android.event.NoOpEventMapper;
    }

    @Override // com.datadog.android.event.EventMapper
    public final T map(T event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return event;
    }
}
