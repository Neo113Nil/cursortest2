package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzg implements Callable<String> {
    private final /* synthetic */ zzd zzwk;

    zzg(zzd zzdVar) {
        this.zzwk = zzdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        CookieManager zzax;
        return (!((Boolean) zzkb.zzik().zzd(zznk.zzbdj)).booleanValue() || (zzax = zzbv.zzem().zzax(this.zzwk.zzvw.zzrt)) == null) ? "" : zzax.getCookie("googleads.g.doubleclick.net");
    }
}
