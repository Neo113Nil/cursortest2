package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfay implements com.google.android.gms.internal.ads.zzfci {
    private final java.lang.String zza;
    private final java.lang.Integer zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;

    public zzfay(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "pn", this.zza);
        com.google.android.gms.internal.ads.zzfln.zzh(bundle, "vc", this.zzb);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "vnm", this.zzc);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_DEADLINE, this.zzd);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "ins_pn", this.zze);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "ini_pn", this.zzf);
    }
}
