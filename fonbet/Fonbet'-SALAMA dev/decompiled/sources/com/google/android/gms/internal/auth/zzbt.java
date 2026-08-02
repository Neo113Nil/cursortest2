package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
public final class zzbt {
    public final q getSpatulaHeader(o oVar) {
        D.i(oVar);
        return ((F) oVar).f11115b.doWrite((l) new zzbs(this, oVar));
    }

    public final q performProxyRequest(o oVar, ProxyRequest proxyRequest) {
        D.i(oVar);
        D.i(proxyRequest);
        return ((F) oVar).f11115b.doWrite((l) new zzbq(this, oVar, proxyRequest));
    }
}
