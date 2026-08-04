package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt {
    public final q getSpatulaHeader(o oVar) {
        D.i(oVar);
        return ((F) oVar).f11115b.doWrite(new zzbs(this, oVar));
    }

    public final q performProxyRequest(o oVar, ProxyRequest proxyRequest) {
        D.i(oVar);
        D.i(proxyRequest);
        return ((F) oVar).f11115b.doWrite(new zzbq(this, oVar, proxyRequest));
    }
}
