package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzdfu implements zzbiz {
    private final WeakReference zza;

    public /* synthetic */ zzdfu(zzdfy zzdfyVar, zzdfx zzdfxVar) {
        this.zza = new WeakReference(zzdfyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzdfy zzdfyVar = (zzdfy) this.zza.get();
        if (zzdfyVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdfyVar.zzh.onAdClicked();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkL)).booleanValue()) {
                zzdfyVar.zzi.zzdd();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdfyVar.zzi.zzu();
            }
        }
    }
}
