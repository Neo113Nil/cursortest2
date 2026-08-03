package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzevy implements com.google.android.gms.internal.ads.zzfci {
    final java.lang.String zza;
    final int zzb;

    public zzevy(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        int i;
        java.lang.String str = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (android.text.TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzfln.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", str);
        zza.putInt("pvid_s", i);
    }
}
