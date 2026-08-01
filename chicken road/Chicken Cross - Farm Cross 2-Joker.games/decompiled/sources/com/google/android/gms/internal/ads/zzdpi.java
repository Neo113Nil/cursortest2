package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdpi implements zzbqh {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        zzdpl zzdplVar = (zzdpl) this.zza.get();
        if (zzdplVar == null) {
            return;
        }
        zzdplVar.zzD().onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzms)).booleanValue()) {
            zzdplVar.zzE().zzdu();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdplVar.zzE().zzdT();
        }
    }
}
