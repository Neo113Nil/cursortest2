package com.google.android.gms.ads.initialization;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public enum State {
        NOT_READY,
        READY
    }

    java.lang.String getDescription();

    com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState();

    int getLatency();
}
