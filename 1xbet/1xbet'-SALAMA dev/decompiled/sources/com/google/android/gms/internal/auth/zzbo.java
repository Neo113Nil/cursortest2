package com.google.android.gms.internal.auth;

import X2.c;
import X2.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.internal.AbstractC0801w;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends l {
    public zzbo(Activity activity, d dVar) {
        super(activity, activity, c.f7470a, dVar == null ? d.f7471b : dVar, k.f11205c);
    }

    public final Task<String> getSpatulaHeader() {
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c0800vA.f11194a = 1520;
        return doRead(c0800vA.e());
    }

    public final Task<ProxyResponse> performProxyRequest(final ProxyRequest proxyRequest) {
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = this.zza;
                ProxyRequest proxyRequest2 = proxyRequest;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), proxyRequest2);
            }
        };
        c0800vA.f11194a = 1518;
        return doWrite(c0800vA.e());
    }

    public zzbo(Context context, d dVar) {
        super(context, null, c.f7470a, dVar == null ? d.f7471b : dVar, k.f11205c);
    }
}
