package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzend implements zzdom {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfld zzc;
    private final zzclm zzd;
    private final zzflw zze;
    private final zzbqk zzf;
    private final boolean zzg;
    private final zzelp zzh;
    private final zzeaj zzi;

    zzend(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfld zzfldVar, zzclm zzclmVar, zzflw zzflwVar, boolean z, zzbqk zzbqkVar, zzelp zzelpVar, zzeaj zzeajVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfldVar;
        this.zzd = zzclmVar;
        this.zze = zzflwVar;
        this.zzg = z;
        this.zzf = zzbqkVar;
        this.zzh = zzelpVar;
        this.zzi = zzeajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    @Override // com.google.android.gms.internal.ads.zzdom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdec zzdecVar) {
        boolean z2;
        int i;
        zzcvo zzcvoVar = (zzcvo) zzhcy.zzt(this.zzb);
        zzclm zzclmVar = this.zzd;
        zzclmVar.zzag(true);
        boolean z3 = this.zzg;
        boolean zzc = z3 ? this.zzf.zzc(true) : true;
        boolean z4 = false;
        if (z3) {
            if (!this.zzf.zzd()) {
                z2 = false;
                z4 = true;
                float zze = !z4 ? this.zzf.zze() : 0.0f;
                zzfld zzfldVar = this.zzc;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, true, z2, zze, -1, z, zzfldVar.zzO, false);
                if (zzdecVar != null) {
                    zzdecVar.zzb();
                }
                com.google.android.gms.ads.internal.zzt.zzb();
                zzdob zzj = zzcvoVar.zzj();
                i = zzfldVar.zzQ;
                if (i == -1) {
                    com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
                    if (zzxVar != null) {
                        int i2 = zzxVar.zza;
                        if (i2 == 1) {
                            i = 7;
                        } else if (i2 == 2) {
                            i = 6;
                        }
                    }
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
                int i4 = i;
                VersionInfoParcel versionInfoParcel = this.zza;
                String str = zzfldVar.zzB;
                zzfli zzfliVar = zzfldVar.zzs;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzclmVar, i4, versionInfoParcel, str, zzlVar, zzfliVar.zzb, zzfliVar.zza, this.zze.zzg, zzdecVar, !zzfldVar.zzb() ? this.zzh : null, zzclmVar.zzn()), true, this.zzi);
            }
            z4 = true;
        }
        z2 = z4;
        float zze2 = !z4 ? this.zzf.zze() : 0.0f;
        zzfld zzfldVar2 = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, true, z2, zze2, -1, z, zzfldVar2.zzO, false);
        if (zzdecVar != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdob zzj2 = zzcvoVar.zzj();
        i = zzfldVar2.zzQ;
        if (i == -1) {
        }
        int i42 = i;
        VersionInfoParcel versionInfoParcel2 = this.zza;
        String str2 = zzfldVar2.zzB;
        zzfli zzfliVar2 = zzfldVar2.zzs;
        if (!zzfldVar2.zzb()) {
        }
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj2, null, zzclmVar, i42, versionInfoParcel2, str2, zzlVar2, zzfliVar2.zzb, zzfliVar2.zza, this.zze.zzg, zzdecVar, !zzfldVar2.zzb() ? this.zzh : null, zzclmVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final zzfld zzb() {
        return this.zzc;
    }
}
