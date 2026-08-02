package org.chromium.net.impl;

import android.net.http.QuicException;
import org.chromium.net.NetworkException;

/* loaded from: classes4.dex */
class AndroidNetworkExceptionWrapper extends NetworkException {
    private final android.net.http.NetworkException mBackend;

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return -1;
    }

    AndroidNetworkExceptionWrapper(android.net.http.NetworkException backend) {
        this(backend, false);
    }

    AndroidNetworkExceptionWrapper(android.net.http.NetworkException backend, boolean expectQuicException) {
        super(backend.getMessage(), backend);
        this.mBackend = backend;
        if (!expectQuicException && (backend instanceof QuicException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", backend);
        }
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        return this.mBackend.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        return this.mBackend.isImmediatelyRetryable();
    }
}
