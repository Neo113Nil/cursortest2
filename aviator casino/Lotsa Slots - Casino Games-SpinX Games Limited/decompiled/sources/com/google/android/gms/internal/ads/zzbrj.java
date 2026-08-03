package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbrj extends com.google.android.gms.internal.ads.zzbrg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;

    zzbrj(com.google.android.gms.internal.ads.zzbrk zzbrkVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        java.util.Objects.requireNonNull(zzbrkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzb(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
