package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeqv implements zzesg {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzeqv(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcts) obj).zzb;
        zzfbo.zzc(bundle, "pn", this.zza);
        zzfbo.zzc(bundle, "dl", this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        zzfbo.zzc(bundle, "pn", this.zza);
        Integer num = this.zzb;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfbo.zzc(bundle, "vnm", this.zzc);
        zzfbo.zzc(bundle, "dl", this.zzd);
        zzfbo.zzc(bundle, "ins_pn", this.zze);
        zzfbo.zzc(bundle, "ini_pn", this.zzf);
    }
}
