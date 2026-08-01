package com.applovin.impl;

import com.applovin.impl.v;

/* loaded from: classes5.dex */
public class t5 extends n5 {
    private final a g;

    public interface a {
        void a(v.a aVar);
    }

    public t5(com.applovin.impl.sdk.l lVar, a aVar) {
        super("TaskCollectAdvertisingId", lVar, true);
        this.g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.g.a(this.f4351a.B().f());
    }
}
