package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzicb extends com.google.android.gms.internal.ads.zzibm {
    public static final com.google.android.gms.internal.ads.zzicb zza = new com.google.android.gms.internal.ads.zzicb();

    private zzicb() {
    }

    public final void zza(com.google.android.gms.internal.ads.zzicf zzicfVar, com.google.android.gms.internal.ads.zzibg zzibgVar) throws java.io.IOException {
        if (zzibgVar == null || (zzibgVar instanceof com.google.android.gms.internal.ads.zzibh)) {
            zzicfVar.zzj();
            return;
        }
        if (zzibgVar instanceof com.google.android.gms.internal.ads.zzibk) {
            com.google.android.gms.internal.ads.zzibk zzg = zzibgVar.zzg();
            if (zzg.zzc()) {
                zzicfVar.zzi(zzg.zzh());
                return;
            } else if (zzg.zza()) {
                zzicfVar.zzh(zzg.zzb());
                return;
            } else {
                zzicfVar.zzg(zzg.zzd());
                return;
            }
        }
        if (zzibgVar instanceof com.google.android.gms.internal.ads.zzibf) {
            zzicfVar.zzb();
            java.util.Iterator it = zzibgVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzicfVar, (com.google.android.gms.internal.ads.zzibg) it.next());
            }
            zzicfVar.zzc();
            return;
        }
        if (!(zzibgVar instanceof com.google.android.gms.internal.ads.zzibi)) {
            java.lang.String valueOf = java.lang.String.valueOf(zzibgVar.getClass());
            java.lang.String.valueOf(valueOf);
            throw new java.lang.IllegalArgumentException("Couldn't write ".concat(java.lang.String.valueOf(valueOf)));
        }
        zzicfVar.zzd();
        for (java.util.Map.Entry entry : zzibgVar.zze().zzb()) {
            zzicfVar.zzf((java.lang.String) entry.getKey());
            zza(zzicfVar, (com.google.android.gms.internal.ads.zzibg) entry.getValue());
        }
        zzicfVar.zze();
    }
}
