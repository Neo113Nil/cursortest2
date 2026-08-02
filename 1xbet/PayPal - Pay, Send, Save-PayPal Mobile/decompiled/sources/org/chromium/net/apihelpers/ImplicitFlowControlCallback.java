package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public abstract class ImplicitFlowControlCallback extends org.chromium.net.UrlRequest.Callback {
    protected abstract void onBodyChunkRead(org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) throws java.lang.Exception;

    protected abstract void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo);

    protected abstract void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException);

    protected abstract void onResponseStarted(org.chromium.net.UrlResponseInfo urlResponseInfo) throws java.lang.Exception;

    protected abstract void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo);

    protected abstract boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception;

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) throws java.lang.Exception {
        onResponseStarted(urlResponseInfo);
        urlRequest.read(java.nio.ByteBuffer.allocateDirect(32768));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception {
        if (shouldFollowRedirect(urlResponseInfo, str)) {
            urlRequest.followRedirect();
        } else {
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) throws java.lang.Exception {
        onBodyChunkRead(urlResponseInfo, byteBuffer);
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        onSucceeded(urlResponseInfo);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        onFailed(urlResponseInfo, cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        onCanceled(urlResponseInfo);
    }
}
