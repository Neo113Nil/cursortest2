package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdvq {
    private final zzddn zza;
    private final zzdew zzb;
    private final zzdfj zzc;
    private final zzdga zzd;
    private final zzdit zze;
    private final zzfld zzf;
    private final zzflg zzg;
    private final zzcub zzh;

    public zzdvq(zzddn zzddnVar, zzdew zzdewVar, zzdfj zzdfjVar, zzdga zzdgaVar, zzdit zzditVar, zzfld zzfldVar, zzflg zzflgVar, zzcub zzcubVar) {
        this.zza = zzddnVar;
        this.zzb = zzdewVar;
        this.zzc = zzdfjVar;
        this.zzd = zzdgaVar;
        this.zze = zzditVar;
        this.zzf = zzfldVar;
        this.zzg = zzflgVar;
        this.zzh = zzcubVar;
    }

    public final void zza(zzdvv zzdvvVar) {
        final zzdew zzdewVar = this.zzb;
        zzdvj zzk = zzdvvVar.zzk();
        Objects.requireNonNull(zzdewVar);
        zzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvp
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdew.this.zzb();
            }
        });
        zzdvvVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
