package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class y0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5517a;
    public final /* synthetic */ long b;

    public y0(String str, long j) {
        this.f5517a = str;
        this.b = j;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.f5517a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.b));
    }
}
