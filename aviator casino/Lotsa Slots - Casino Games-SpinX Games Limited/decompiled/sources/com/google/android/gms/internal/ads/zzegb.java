package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzegb extends com.google.android.gms.internal.ads.zzcat {
    private final com.google.android.gms.internal.ads.zzcfw zza;
    private final com.google.android.gms.internal.ads.zzcbd zzb;

    zzegb(com.google.android.gms.internal.ads.zzcfw zzcfwVar, com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        this.zza = zzcfwVar;
        this.zzb = zzcbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new com.google.android.gms.internal.ads.zzegs(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        this.zza.zzc(new com.google.android.gms.internal.ads.zzegs(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbdVar));
    }
}
