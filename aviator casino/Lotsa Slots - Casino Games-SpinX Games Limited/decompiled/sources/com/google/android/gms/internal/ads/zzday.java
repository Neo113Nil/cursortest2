package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzday implements com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzdlk {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final com.google.android.gms.internal.ads.zzebw zze;
    private final com.google.android.gms.internal.ads.zzfqj zzf;
    private final com.google.android.gms.internal.ads.zzecr zzg;

    public zzday(android.content.Context context, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzebw zzebwVar, com.google.android.gms.internal.ads.zzfqj zzfqjVar, com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zza = context;
        this.zzb = zzfkyVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzebwVar;
        this.zzf = zzfqjVar;
        this.zzg = zzecrVar;
    }

    private final void zzc() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeT)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            android.content.Context context = this.zza;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzc;
            com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzb;
            com.google.android.gms.internal.ads.zzfqj zzfqjVar = this.zzf;
            com.google.android.gms.internal.ads.zzecr zzecrVar = this.zzg;
            com.google.android.gms.ads.internal.zzt.zzl().zzb(context, versionInfoParcel, zzfkyVar.zzg, zzgVar.zzi(), zzfqjVar, zzecrVar.zzs());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeU)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(java.lang.String str) {
    }
}
