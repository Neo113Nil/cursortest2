package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzega extends com.google.android.gms.internal.ads.zzcat {
    final /* synthetic */ com.google.android.gms.internal.ads.zzegc zza;

    protected zzega(com.google.android.gms.internal.ads.zzegc zzegcVar) {
        java.util.Objects.requireNonNull(zzegcVar);
        this.zza = zzegcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        com.google.android.gms.internal.ads.zzegc zzegcVar = this.zza;
        zzegcVar.zza.zzc(new com.google.android.gms.internal.ads.zzegs(autoCloseInputStream, zzegcVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        this.zza.zza.zzc(new com.google.android.gms.internal.ads.zzegs(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbdVar));
    }
}
