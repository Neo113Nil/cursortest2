package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzdvk implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzdvk(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzffe zzffeVar = (zzffe) this.zza.zzb();
        final CookieManager cookieManagerH = o.f1952C.f1959e.h();
        zzfeu zzfeuVarZzi = zzfeo.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdve
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerH;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) C0254t.f2723d.f2726c.zzb(zzbby.zzbb));
            }
        }, zzfey.WEBVIEW_COOKIE, zzffeVar).zzi(1L, TimeUnit.SECONDS);
        final zzfei zzfeiVar = new zzfei() { // from class: com.google.android.gms.internal.ads.zzdvf
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzfeuVarZzi.zzc(Exception.class, new zzgaj(zzfeiVar) { // from class: com.google.android.gms.internal.ads.zzfep
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh("");
            }
        }).zza();
    }
}
