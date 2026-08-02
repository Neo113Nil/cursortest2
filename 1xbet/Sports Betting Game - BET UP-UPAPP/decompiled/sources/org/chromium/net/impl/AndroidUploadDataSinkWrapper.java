package org.chromium.net.impl;

import org.chromium.net.UploadDataSink;

/* loaded from: classes4.dex */
class AndroidUploadDataSinkWrapper extends UploadDataSink {
    private final android.net.http.UploadDataSink mBackend;

    AndroidUploadDataSinkWrapper(android.net.http.UploadDataSink backend) {
        this.mBackend = backend;
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadSucceeded(boolean finalChunk) {
        this.mBackend.onReadSucceeded(finalChunk);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadError(Exception exception) {
        this.mBackend.onReadError(exception);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        this.mBackend.onRewindSucceeded();
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindError(Exception exception) {
        this.mBackend.onRewindError(exception);
    }
}
