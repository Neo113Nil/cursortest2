package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
abstract class CronetTransportResponseBody extends okhttp3.ResponseBody {
    private final okhttp3.ResponseBody delegate;

    abstract void customCloseHook();

    protected CronetTransportResponseBody(okhttp3.ResponseBody responseBody) {
        this.delegate = responseBody;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
        return this.delegate.getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getGetHighSpeedVideoSizes() {
        return this.delegate.getGetHighSpeedVideoSizes();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final okio.BufferedSource getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.delegate.getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
        customCloseHook();
    }
}
