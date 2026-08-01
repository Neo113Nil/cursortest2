package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeqz implements zzdom {
    private final Context zza;
    private final zzdxg zzb;
    private final zzflw zzc;
    private final VersionInfoParcel zzd;
    private final zzfld zze;
    private final ListenableFuture zzf;
    private final zzclm zzg;
    private final zzbqk zzh;
    private final boolean zzi;
    private final zzelp zzj;
    private final zzeae zzk;
    private final zzeaj zzl;

    zzeqz(Context context, zzdxg zzdxgVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel, zzfld zzfldVar, ListenableFuture listenableFuture, zzclm zzclmVar, zzbqk zzbqkVar, boolean z, zzelp zzelpVar, zzeae zzeaeVar, zzeaj zzeajVar) {
        this.zza = context;
        this.zzb = zzdxgVar;
        this.zzc = zzflwVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfldVar;
        this.zzf = listenableFuture;
        this.zzg = zzclmVar;
        this.zzh = zzbqkVar;
        this.zzi = z;
        this.zzj = zzelpVar;
        this.zzk = zzeaeVar;
        this.zzl = zzeajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    @Override // com.google.android.gms.internal.ads.zzdom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzdec zzdecVar) {
        boolean z2;
        zzdwl zzdwlVar = (zzdwl) zzhcy.zzt(this.zzf);
        try {
            zzfld zzfldVar = this.zze;
            final zzclm zzclmVar = this.zzg;
            if (zzclmVar.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbD)).booleanValue()) {
                    zzclmVar = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbrb.zzb(zzclmVar, zzdwlVar.zzk());
                    final zzdxk zzdxkVar = new zzdxk();
                    zzdwlVar.zzl().zzi(zzclmVar, true, this.zzi ? this.zzh : null, this.zzk);
                    zzclmVar.zzP().zzG(new zzcni(zzdxkVar, zzclmVar) { // from class: com.google.android.gms.internal.ads.zzeqy
                        private final /* synthetic */ zzclm zza;

                        {
                            this.zza = zzclmVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcni
                        public final /* synthetic */ void zza(boolean z3, int i, String str, String str2) {
                            zzclm zzclmVar2 = this.zza;
                            zzclmVar2.zzJ();
                            zzclmVar2.zzP().zzq();
                        }
                    });
                    zzcnk zzP = zzclmVar.zzP();
                    Objects.requireNonNull(zzclmVar);
                    zzP.zzH(new zzcnj() { // from class: com.google.android.gms.internal.ads.zzeqx
                        @Override // com.google.android.gms.internal.ads.zzcnj
                        public final /* synthetic */ void zza() {
                            zzclm.this.zzI();
                        }
                    });
                    zzfli zzfliVar = zzfldVar.zzs;
                    zzclmVar.zzau(zzfliVar.zzb, zzfliVar.zza, null);
                }
            }
            zzclm zzclmVar2 = zzclmVar;
            zzclmVar2.zzag(true);
            boolean z3 = this.zzi;
            boolean z4 = false;
            boolean zzc = z3 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
            if (z3) {
                if (!this.zzh.zzd()) {
                    z2 = false;
                    z4 = true;
                    float zze = !z4 ? this.zzh.zze() : 0.0f;
                    zzfld zzfldVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze, -1, z, zzfldVar2.zzO, zzfldVar2.zzP);
                    if (zzdecVar != null) {
                        zzdecVar.zzb();
                    }
                    com.google.android.gms.ads.internal.zzt.zzb();
                    zzdob zzj = zzdwlVar.zzj();
                    int i = zzfldVar2.zzQ;
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    String str = zzfldVar2.zzB;
                    zzfli zzfliVar2 = zzfldVar2.zzs;
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzclmVar2, i, versionInfoParcel, str, zzlVar, zzfliVar2.zzb, zzfliVar2.zza, this.zzc.zzg, zzdecVar, zzfldVar2.zzb() ? this.zzj : null, zzclmVar2.zzn()), true, this.zzl);
                }
                z4 = true;
            }
            z2 = z4;
            float zze2 = !z4 ? this.zzh.zze() : 0.0f;
            zzfld zzfldVar22 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zzc, zzL, z2, zze2, -1, z, zzfldVar22.zzO, zzfldVar22.zzP);
            if (zzdecVar != null) {
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdob zzj2 = zzdwlVar.zzj();
            int i2 = zzfldVar22.zzQ;
            VersionInfoParcel versionInfoParcel2 = this.zzd;
            String str2 = zzfldVar22.zzB;
            zzfli zzfliVar22 = zzfldVar22.zzs;
            if (zzfldVar22.zzb()) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj2, null, zzclmVar2, i2, versionInfoParcel2, str2, zzlVar2, zzfliVar22.zzb, zzfliVar22.zza, this.zzc.zzg, zzdecVar, zzfldVar22.zzb() ? this.zzj : null, zzclmVar2.zzn()), true, this.zzl);
        } catch (zzcmb e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final zzfld zzb() {
        return this.zze;
    }
}
