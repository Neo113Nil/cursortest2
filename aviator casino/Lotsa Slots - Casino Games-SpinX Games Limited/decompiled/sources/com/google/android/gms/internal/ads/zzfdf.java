package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdf implements com.google.android.gms.internal.ads.zzfci {
    final java.lang.String zza;
    final int zzb;

    /* synthetic */ zzfdf(java.lang.String str, int i, byte[] bArr) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlP)).booleanValue()) {
            java.lang.String str = this.zza;
            if (!android.text.TextUtils.isEmpty(str)) {
                bundle.putString("topics", str);
            }
            int i = this.zzb;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}
