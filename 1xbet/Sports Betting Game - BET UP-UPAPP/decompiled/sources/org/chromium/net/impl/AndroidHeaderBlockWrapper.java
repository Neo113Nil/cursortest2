package org.chromium.net.impl;

import android.net.http.HeaderBlock;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
class AndroidHeaderBlockWrapper extends UrlResponseInfo.HeaderBlock {
    private final HeaderBlock mBackend;

    AndroidHeaderBlockWrapper(HeaderBlock backend) {
        this.mBackend = backend;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public List<Map.Entry<String, String>> getAsList() {
        return this.mBackend.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public Map<String, List<String>> getAsMap() {
        return this.mBackend.getAsMap();
    }
}
