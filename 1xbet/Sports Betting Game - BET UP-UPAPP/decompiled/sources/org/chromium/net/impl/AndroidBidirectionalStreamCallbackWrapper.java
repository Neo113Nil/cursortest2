package org.chromium.net.impl;

import android.net.http.BidirectionalStream;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* loaded from: classes4.dex */
class AndroidBidirectionalStreamCallbackWrapper implements BidirectionalStream.Callback {
    private final BidirectionalStream.Callback mBackend;
    private AndroidBidirectionalStreamWrapper mWrappedStream;

    public AndroidBidirectionalStreamCallbackWrapper(BidirectionalStream.Callback backend) {
        this.mBackend = (BidirectionalStream.Callback) Objects.requireNonNull(backend, "Callback is required.");
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.mBackend.onStreamReady(this.mWrappedStream);
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.mBackend.onResponseHeadersReceived(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo));
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean endOfStream) {
        this.mBackend.onReadCompleted(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo), byteBuffer, endOfStream);
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean endOfStream) {
        this.mBackend.onWriteCompleted(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo), byteBuffer, endOfStream);
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.mBackend.onResponseTrailersReceived(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo), new AndroidHeaderBlockWrapper(headerBlock));
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper createForBidirectionalStream = AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo);
        try {
            this.mBackend.onSucceeded(this.mWrappedStream, createForBidirectionalStream);
        } finally {
            this.mWrappedStream.maybeReportMetrics(0, createForBidirectionalStream, null);
        }
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException e) {
        AndroidUrlResponseInfoWrapper createForBidirectionalStream = AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo);
        CronetException translateCheckedAndroidCronetException = CronetExceptionTranslationUtils.translateCheckedAndroidCronetException(e);
        try {
            this.mBackend.onFailed(this.mWrappedStream, createForBidirectionalStream, translateCheckedAndroidCronetException);
        } finally {
            this.mWrappedStream.maybeReportMetrics(1, createForBidirectionalStream, translateCheckedAndroidCronetException);
        }
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper createForBidirectionalStream = AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo);
        try {
            this.mBackend.onCanceled(this.mWrappedStream, createForBidirectionalStream);
        } finally {
            this.mWrappedStream.maybeReportMetrics(2, createForBidirectionalStream, null);
        }
    }

    void setStream(AndroidBidirectionalStreamWrapper stream) {
        this.mWrappedStream = stream;
    }
}
