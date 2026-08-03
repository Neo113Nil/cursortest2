package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes3.dex */
public abstract class PersistedEvent {
    public abstract com.google.android.datatransport.runtime.EventInternal getEvent();

    public abstract long getId();

    public abstract com.google.android.datatransport.runtime.TransportContext getTransportContext();

    public static com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent create(long j, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent(j, transportContext, eventInternal);
    }
}
