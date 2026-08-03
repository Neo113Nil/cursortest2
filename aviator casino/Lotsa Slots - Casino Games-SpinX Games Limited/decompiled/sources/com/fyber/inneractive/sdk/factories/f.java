package com.fyber.inneractive.sdk.factories;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3668a = new java.util.HashMap();

    public final void a(com.fyber.inneractive.sdk.response.a aVar, com.fyber.inneractive.sdk.factories.e eVar) {
        if (this.f3668a.containsKey(aVar)) {
            com.fyber.inneractive.sdk.util.IAlog.f("Handler already exists for ad type %s! : %s", aVar, this.f3668a.get(aVar));
        } else {
            this.f3668a.put(aVar, eVar);
        }
    }
}
