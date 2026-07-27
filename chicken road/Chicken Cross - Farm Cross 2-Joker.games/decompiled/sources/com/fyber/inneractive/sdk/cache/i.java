package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes4.dex */
public final class i implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f5204a;

    public i(l lVar) {
        this.f5204a = lVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f5204a.c = str;
        }
    }
}
