package org.chromium.net.impl;

import android.net.http.UrlRequest;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
class AndroidUrlRequestStatusListenerWrapper implements UrlRequest.StatusListener {
    private final UrlRequest.StatusListener mBackend;

    public AndroidUrlRequestStatusListenerWrapper(UrlRequest.StatusListener backend) {
        this.mBackend = backend;
    }

    @Override // android.net.http.UrlRequest.StatusListener
    public void onStatus(int i) {
        this.mBackend.onStatus(i);
    }
}
