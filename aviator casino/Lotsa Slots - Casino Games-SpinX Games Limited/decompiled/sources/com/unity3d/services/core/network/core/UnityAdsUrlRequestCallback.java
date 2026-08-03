package com.unity3d.services.core.network.core;

/* compiled from: UnityAdsUrlRequestCallback.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\b \u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ \u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/services/core/network/core/UnityAdsUrlRequestCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "()V", "bytesReceived", "Ljava/io/ByteArrayOutputStream;", "receiveChannel", "Ljava/nio/channels/WritableByteChannel;", "kotlin.jvm.PlatformType", "onReadCompleted", "", "request", "Lorg/chromium/net/UrlRequest;", "info", "Lorg/chromium/net/UrlResponseInfo;", "byteBuffer", "Ljava/nio/ByteBuffer;", "onRedirectReceived", "newLocationUrl", "", "onResponseStarted", "onSucceeded", "bodyBytes", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class UnityAdsUrlRequestCallback extends org.chromium.net.UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;
    private final java.io.ByteArrayOutputStream bytesReceived;
    private final java.nio.channels.WritableByteChannel receiveChannel;

    public abstract void onSucceeded(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, byte[] bodyBytes);

    public UnityAdsUrlRequestCallback() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = java.nio.channels.Channels.newChannel(byteArrayOutputStream);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, java.lang.String newLocationUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        request.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        request.read(java.nio.ByteBuffer.allocateDirect(16384));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info, java.nio.ByteBuffer byteBuffer) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        byteBuffer.flip();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = this;
            this.receiveChannel.write(byteBuffer);
            byteBuffer.clear();
            request.read(byteBuffer);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
            request.cancel();
            onFailed(request, info, null);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(org.chromium.net.UrlRequest request, org.chromium.net.UrlResponseInfo info) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = this;
            obj = kotlin.Result.m10798constructorimpl(this.bytesReceived.toByteArray());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10805isSuccessimpl(obj)) {
            byte[] bodyBytes = (byte[]) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bodyBytes, "bodyBytes");
            onSucceeded(request, info, bodyBytes);
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(obj) != null) {
            onFailed(request, info, null);
        }
    }
}
