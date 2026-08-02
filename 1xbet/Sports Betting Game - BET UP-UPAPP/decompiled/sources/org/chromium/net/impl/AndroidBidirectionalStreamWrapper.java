package org.chromium.net.impl;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* loaded from: classes4.dex */
class AndroidBidirectionalStreamWrapper extends ExperimentalBidirectionalStream {
    private final Collection<Object> mAnnotations;
    private final BidirectionalStream mBackend;
    private final AndroidHttpEngineWrapper mEngine;
    private final String mInitialUrl;

    AndroidBidirectionalStreamWrapper(BidirectionalStream backend, AndroidHttpEngineWrapper engine, String url, Collection<Object> annotations) {
        this.mBackend = backend;
        this.mEngine = engine;
        this.mInitialUrl = url;
        this.mAnnotations = annotations;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void start() {
        this.mBackend.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public void read(ByteBuffer buffer) {
        this.mBackend.read(buffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public void write(ByteBuffer buffer, boolean endOfStream) {
        this.mBackend.write(buffer, endOfStream);
    }

    @Override // org.chromium.net.BidirectionalStream
    public void flush() {
        this.mBackend.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public void cancel() {
        this.mBackend.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public boolean isDone() {
        return this.mBackend.isDone();
    }

    static AndroidBidirectionalStreamWrapper createAndAddToCallback(BidirectionalStream backend, AndroidBidirectionalStreamCallbackWrapper callback, AndroidHttpEngineWrapper engine, String url, Collection<Object> annotations) {
        AndroidBidirectionalStreamWrapper androidBidirectionalStreamWrapper = new AndroidBidirectionalStreamWrapper(backend, engine, url, annotations);
        callback.setStream(androidBidirectionalStreamWrapper);
        return androidBidirectionalStreamWrapper;
    }

    void maybeReportMetrics(int finishedReason, AndroidUrlResponseInfoWrapper responseInfo, CronetException exception) {
        AndroidRequestFinishedInfoWrapper.reportFinished(this.mEngine, this.mInitialUrl, this.mAnnotations, null, finishedReason, responseInfo, exception);
    }
}
