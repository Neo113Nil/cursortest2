package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdvi implements zzbqh {
    private final zzbnw zza;
    private final zzdvv zzb;
    private final zzinq zzc;

    public zzdvi(zzdrb zzdrbVar, zzdqr zzdqrVar, zzdvv zzdvvVar, zzinq zzinqVar) {
        this.zza = zzdrbVar.zzg(zzdqrVar.zzS());
        this.zzb = zzdvvVar;
        this.zzc = zzinqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbnm) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb2, e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
