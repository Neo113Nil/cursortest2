package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5321a = new HashMap();

    public final void a(com.fyber.inneractive.sdk.response.a aVar, e eVar) {
        if (this.f5321a.containsKey(aVar)) {
            IAlog.f("Handler already exists for ad type %s! : %s", aVar, this.f5321a.get(aVar));
        } else {
            this.f5321a.put(aVar, eVar);
        }
    }
}
