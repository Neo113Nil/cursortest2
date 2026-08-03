package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class h extends java.util.HashMap {
    public h() {
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                put(cVar, new com.fyber.inneractive.sdk.cache.session.g(0, 0, 0, java.lang.System.currentTimeMillis()));
            }
        }
    }
}
