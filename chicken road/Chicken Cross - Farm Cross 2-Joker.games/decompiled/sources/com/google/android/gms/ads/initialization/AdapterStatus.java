package com.google.android.gms.ads.initialization;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
