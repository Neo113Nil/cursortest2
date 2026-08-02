package com.google.common.eventbus;

/* loaded from: classes9.dex */
public class DeadEvent {
    private final java.lang.Object event;
    private final java.lang.Object source;

    public DeadEvent(java.lang.Object obj, java.lang.Object obj2) {
        this.source = com.google.common.base.Preconditions.checkNotNull(obj);
        this.event = com.google.common.base.Preconditions.checkNotNull(obj2);
    }

    public java.lang.Object getSource() {
        return this.source;
    }

    public java.lang.Object getEvent() {
        return this.event;
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("source", this.source).add("event", this.event).toString();
    }
}
