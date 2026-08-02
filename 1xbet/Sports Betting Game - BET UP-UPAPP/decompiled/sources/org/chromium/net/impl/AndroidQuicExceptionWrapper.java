package org.chromium.net.impl;

import org.chromium.net.QuicException;

/* loaded from: classes4.dex */
class AndroidQuicExceptionWrapper extends QuicException {
    private final AndroidNetworkExceptionWrapper mBackend;

    @Override // org.chromium.net.QuicException
    public int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.QuicException
    public int getQuicDetailedErrorCode() {
        return 0;
    }

    AndroidQuicExceptionWrapper(android.net.http.QuicException backend) {
        super(backend.getMessage(), backend);
        this.mBackend = new AndroidNetworkExceptionWrapper(backend, true);
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        return this.mBackend.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return this.mBackend.getCronetInternalErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        return this.mBackend.immediatelyRetryable();
    }
}
