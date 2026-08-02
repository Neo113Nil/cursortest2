package org.chromium.net.impl;

import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
class AndroidUrlResponseInfoWrapper extends UrlResponseInfo {
    private final android.net.http.UrlResponseInfo mBackend;
    private final String mProxyServerCompat;

    private AndroidUrlResponseInfoWrapper(android.net.http.UrlResponseInfo backend, String proxyServerCompat) {
        this.mBackend = backend;
        this.mProxyServerCompat = proxyServerCompat;
    }

    public static AndroidUrlResponseInfoWrapper createForUrlRequest(android.net.http.UrlResponseInfo backend) {
        if (isResponseInfoNull(backend)) {
            return null;
        }
        return new AndroidUrlResponseInfoWrapper(backend, ":0");
    }

    public static AndroidUrlResponseInfoWrapper createForBidirectionalStream(android.net.http.UrlResponseInfo backend) {
        if (isResponseInfoNull(backend)) {
            return null;
        }
        return new AndroidUrlResponseInfoWrapper(backend, null);
    }

    private static boolean isResponseInfoNull(android.net.http.UrlResponseInfo backend) {
        if (backend == null) {
            return true;
        }
        try {
            backend.getUrl();
            return false;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getUrl() {
        return this.mBackend.getUrl();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<String> getUrlChain() {
        return this.mBackend.getUrlChain();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public int getHttpStatusCode() {
        return this.mBackend.getHttpStatusCode();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getHttpStatusText() {
        return this.mBackend.getHttpStatusText();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.mBackend.getHeaders().getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public Map<String, List<String>> getAllHeaders() {
        return this.mBackend.getHeaders().getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public boolean wasCached() {
        return this.mBackend.wasCached();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getNegotiatedProtocol() {
        return this.mBackend.getNegotiatedProtocol();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getProxyServer() {
        return this.mProxyServerCompat;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public long getReceivedByteCount() {
        return this.mBackend.getReceivedByteCount();
    }
}
