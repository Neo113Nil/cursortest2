package com.fyber.inneractive.sdk.measurement;

import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes4.dex */
public final class a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5436a;

    public a(e eVar) {
        this.f5436a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f5436a.b = str;
        }
    }
}
