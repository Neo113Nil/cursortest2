package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public abstract class InMemoryTransformCronetCallback<T> extends org.chromium.net.apihelpers.ImplicitFlowControlCallback {
    private java.nio.channels.WritableByteChannel Camera2StreamConfigurationMap;
    private final java.util.Set<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();
    private java.io.ByteArrayOutputStream getHighSpeedVideoSizes;

    protected abstract T transformBodyBytes(org.chromium.net.UrlResponseInfo urlResponseInfo, byte[] bArr);

    public org.chromium.net.apihelpers.ImplicitFlowControlCallback addCompletionListener(org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T> cronetRequestCompletionListener) {
        this.getHighSpeedVideoFpsRanges.add(cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onResponseStarted(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(urlResponseInfo);
        if (highSpeedVideoSizes > 2147483639) {
            throw new java.lang.IllegalArgumentException("The body is too large and wouldn't fit in a byte array!");
        }
        if (highSpeedVideoSizes >= 0) {
            this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream((int) highSpeedVideoSizes);
        } else {
            this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();
        }
        this.Camera2StreamConfigurationMap = java.nio.channels.Channels.newChannel(this.getHighSpeedVideoSizes);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onBodyChunkRead(org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) throws java.lang.Exception {
        this.Camera2StreamConfigurationMap.write(byteBuffer);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        T transformBodyBytes = transformBodyBytes(urlResponseInfo, this.getHighSpeedVideoSizes.toByteArray());
        java.util.Iterator<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onSucceeded(urlResponseInfo, transformBodyBytes);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        java.util.Iterator<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onFailed(urlResponseInfo, cronetException);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.util.Iterator<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onCanceled(urlResponseInfo);
        }
    }

    private static long getHighSpeedVideoSizes(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.util.List<java.lang.String> list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null || list.size() != 1) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(list.get(0));
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }
}
