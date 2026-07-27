package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzewz implements zzfdg {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final String zzf;
    private final zzdap zzg;

    public zzewz(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, String str3, zzdap zzdapVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzdapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzx()) {
            bundle.putString(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzx());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgL)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzr(this.zza));
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AppStatsSignal_AppId");
            }
        }
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzdap zzdapVar = this.zzg;
            bundle2.putLong("dload", zzdapVar.zzc(str));
            bundle2.putInt("pcc", zzdapVar.zzb(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlr)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zzo() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzt.zzh().zzo());
    }
}
