package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class a extends java.util.HashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3560a = 25;

    public a() {
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                put(cVar, new com.fyber.inneractive.sdk.cache.session.k(this.f3560a));
            }
        }
    }
}
