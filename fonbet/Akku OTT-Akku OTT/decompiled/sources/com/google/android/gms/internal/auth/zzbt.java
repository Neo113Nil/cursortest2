package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public final class zzbt {
    public final i<Object> getSpatulaHeader(h hVar) {
        C0875q.g(hVar);
        return hVar.b(new zzbs(this, hVar));
    }

    public final i<Object> performProxyRequest(h hVar, a aVar) {
        C0875q.g(hVar);
        C0875q.g(aVar);
        return hVar.b(new zzbq(this, hVar, aVar));
    }
}
