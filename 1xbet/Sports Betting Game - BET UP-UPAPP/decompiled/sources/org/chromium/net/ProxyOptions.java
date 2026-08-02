package org.chromium.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class ProxyOptions {
    private final List<Proxy> mProxyList;

    public @interface Experimental {
    }

    public ProxyOptions(List<Proxy> proxyList) {
        if (((List) Objects.requireNonNull(proxyList)).isEmpty()) {
            throw new IllegalArgumentException("ProxyList cannot be empty");
        }
        int indexOf = proxyList.indexOf(null);
        if (indexOf != -1 && indexOf != proxyList.size() - 1) {
            throw new IllegalArgumentException("Null is allowed only as the last element in the proxy list");
        }
        this.mProxyList = new ArrayList(proxyList);
    }

    public List<Proxy> getProxyList() {
        return Collections.unmodifiableList(this.mProxyList);
    }
}
