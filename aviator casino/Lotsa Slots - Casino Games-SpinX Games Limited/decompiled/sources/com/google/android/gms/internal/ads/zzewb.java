package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewb implements com.google.android.gms.internal.ads.zzfci {
    private final android.content.Context zza;
    private final android.os.Bundle zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzczx zzg;

    public zzewb(android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, java.lang.String str3, com.google.android.gms.internal.ads.zzczx zzczxVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzczxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzx()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzx());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgF)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzr(this.zza));
            } catch (android.os.RemoteException | java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AppStatsSignal_AppId");
            }
        }
        java.lang.String str = this.zzf;
        if (str != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.internal.ads.zzczx zzczxVar = this.zzg;
            bundle2.putLong("dload", zzczxVar.zzc(str));
            bundle2.putInt("pcc", zzczxVar.zzb(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlg)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zzn() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzt.zzh().zzn());
    }
}
