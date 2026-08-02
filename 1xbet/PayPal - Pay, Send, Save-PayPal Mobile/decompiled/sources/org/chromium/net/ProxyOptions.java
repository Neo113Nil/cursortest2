package org.chromium.net;

/* loaded from: classes18.dex */
public final class ProxyOptions {
    private final java.util.List<org.chromium.net.Proxy> mProxyList;

    /* loaded from: classes3.dex */
    public @interface Experimental {
    }

    public ProxyOptions(java.util.List<org.chromium.net.Proxy> list) {
        if (((java.util.List) java.util.Objects.requireNonNull(list)).isEmpty()) {
            throw new java.lang.IllegalArgumentException("ProxyList cannot be empty");
        }
        int indexOf = list.indexOf(null);
        if (indexOf != -1 && indexOf != list.size() - 1) {
            throw new java.lang.IllegalArgumentException("Null is allowed only as the last element in the proxy list");
        }
        this.mProxyList = new java.util.ArrayList(list);
    }

    public final java.util.List<org.chromium.net.Proxy> getProxyList() {
        return java.util.Collections.unmodifiableList(this.mProxyList);
    }
}
