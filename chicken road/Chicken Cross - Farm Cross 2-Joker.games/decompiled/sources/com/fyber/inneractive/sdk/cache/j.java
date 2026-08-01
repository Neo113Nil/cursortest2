package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes4.dex */
public final class j implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f5205a;

    public j(l lVar) {
        this.f5205a = lVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f5205a.d = str;
        }
    }
}
