package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfmj {
    private final zzfld zza;
    private final zzflg zzb;
    private final zzfte zzc;
    private final zzfsw zzd;
    private final zzfrg zze;
    private final zzcub zzf;

    public zzfmj(zzfte zzfteVar, zzfsw zzfswVar, zzfld zzfldVar, zzflg zzflgVar, zzcub zzcubVar, zzfrg zzfrgVar) {
        this.zza = zzfldVar;
        this.zzb = zzflgVar;
        this.zzc = zzfteVar;
        this.zzd = zzfswVar;
        this.zzf = zzcubVar;
        this.zze = zzfrgVar;
    }

    public final void zza(List list, zzdge zzdgeVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzdgeVar);
        }
    }

    public final void zzb(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzhcy.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue() && zzcub.zzc(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcy.zza(str), new zzfmi(this, i), zzcgj.zza);
        }
    }

    public final void zzc(String str, int i, zzdge zzdgeVar) {
        zzfld zzfldVar = this.zza;
        if (zzfldVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzb(str, zzfldVar.zzax, this.zze, zzdgeVar);
    }
}
