package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfbw implements zzfdg {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzfbw(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfml.zze(bundle, "pn", this.zza);
        zzfml.zzh(bundle, "vc", this.zzb);
        zzfml.zze(bundle, "vnm", this.zzc);
        zzfml.zze(bundle, CmcdConfiguration.KEY_DEADLINE, this.zzd);
        zzfml.zze(bundle, "ins_pn", this.zze);
        zzfml.zze(bundle, "ini_pn", this.zzf);
    }
}
