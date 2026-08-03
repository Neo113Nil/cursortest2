package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyo {
    private final com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener zzb;
    private com.google.android.gms.ads.nativead.NativeCustomFormatAd zzc;

    public zzbyo(com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.ads.nativead.NativeCustomFormatAd zzc(com.google.android.gms.internal.ads.zzbmv zzbmvVar) {
        com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        com.google.android.gms.internal.ads.zzbyp zzbypVar = new com.google.android.gms.internal.ads.zzbyp(zzbmvVar);
        this.zzc = zzbypVar;
        return zzbypVar;
    }

    public final com.google.android.gms.internal.ads.zzbni zza() {
        return new com.google.android.gms.internal.ads.zzbyn(this, null);
    }

    public final com.google.android.gms.internal.ads.zzbnf zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzbym(this, null);
    }

    final /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener zzd() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener zze() {
        return this.zzb;
    }
}
