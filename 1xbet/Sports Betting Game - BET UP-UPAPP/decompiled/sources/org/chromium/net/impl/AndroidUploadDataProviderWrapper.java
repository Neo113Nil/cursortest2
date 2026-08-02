package org.chromium.net.impl;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes4.dex */
class AndroidUploadDataProviderWrapper extends UploadDataProvider {
    private final org.chromium.net.UploadDataProvider mBackend;

    public AndroidUploadDataProviderWrapper(org.chromium.net.UploadDataProvider backend) {
        this.mBackend = (org.chromium.net.UploadDataProvider) Objects.requireNonNull(backend, "Invalid UploadDataProvider.");
    }

    @Override // android.net.http.UploadDataProvider
    public long getLength() throws IOException {
        return this.mBackend.getLength();
    }

    @Override // android.net.http.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        this.mBackend.read(new AndroidUploadDataSinkWrapper(uploadDataSink), byteBuffer);
    }

    @Override // android.net.http.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.mBackend.rewind(new AndroidUploadDataSinkWrapper(uploadDataSink));
    }

    @Override // android.net.http.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mBackend.close();
    }
}
