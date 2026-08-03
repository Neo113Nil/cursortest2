package com.google.common.eventbus;

@com.google.common.eventbus.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class DeadEvent {
    private final java.lang.Object event;
    private final java.lang.Object source;

    public DeadEvent(java.lang.Object source, java.lang.Object event) {
        this.source = com.google.common.base.Preconditions.checkNotNull(source);
        this.event = com.google.common.base.Preconditions.checkNotNull(event);
    }

    public java.lang.Object getSource() {
        return this.source;
    }

    public java.lang.Object getEvent() {
        return this.event;
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("source", this.source).add(androidx.core.app.NotificationCompat.CATEGORY_EVENT, this.event).toString();
    }
}
