package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdhx implements com.google.android.gms.internal.ads.zzdfx {
    private int zza = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbS)).intValue();
    private int zzb = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzor)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final synchronized void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbT)).booleanValue()) {
            try {
                com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkqVar.zzb.zzb;
                this.zza = zzfkiVar.zzc;
                this.zzb = zzfkiVar.zzd;
            } catch (java.lang.NullPointerException unused) {
            }
        }
    }
}
