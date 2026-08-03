package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public interface VideoContentListener extends com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener {
    void onCompleted();

    @java.lang.Deprecated
    void onPlayerError();

    void onProgress(int i, int i2);
}
