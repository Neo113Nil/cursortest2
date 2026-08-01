package com.fyber.marketplace.fairbid.impl;

import java.util.Map;

/* loaded from: classes4.dex */
public final class d implements com.fyber.inneractive.sdk.network.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f6029a;
    public final /* synthetic */ String b;

    public d(Map map, String str) {
        this.f6029a = map;
        this.b = str;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return new StringBuffer(this.b);
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.f6029a;
    }
}
