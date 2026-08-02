package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzers implements zzesg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzers(String str, String str2, String str3, String str4, Long l7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l7;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfbo.zzc(((zzcts) obj).zzb, "fbs_aeid", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        zzfbo.zzc(bundle, "gmp_app_id", this.zza);
        zzfbo.zzc(bundle, "fbs_aiid", this.zzb);
        zzfbo.zzc(bundle, "fbs_aeid", this.zzc);
        zzfbo.zzc(bundle, "apm_id_origin", this.zzd);
        Long l7 = this.zze;
        if (l7 != null) {
            bundle.putLong("sai_timeout", l7.longValue());
        }
    }
}
