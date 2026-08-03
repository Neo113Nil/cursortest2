package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfcx implements com.google.android.gms.internal.ads.zzfci {
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzfcx(java.lang.String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.google.android.gms.internal.ads.zzfln.zzb(bundle, com.ironsource.M6.R0, this.zza, !android.text.TextUtils.isEmpty(r0));
        int i = this.zzb;
        com.google.android.gms.internal.ads.zzfln.zzc(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzfln.zza(bundle, "device");
        bundle.putBundle("device", zza);
        android.os.Bundle zza2 = com.google.android.gms.internal.ads.zzfln.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
