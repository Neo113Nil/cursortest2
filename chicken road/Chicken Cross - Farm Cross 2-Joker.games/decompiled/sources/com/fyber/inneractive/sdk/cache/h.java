package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes4.dex */
public final class h implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f5203a;

    public h(l lVar) {
        this.f5203a = lVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f5203a.b = str;
        }
    }
}
