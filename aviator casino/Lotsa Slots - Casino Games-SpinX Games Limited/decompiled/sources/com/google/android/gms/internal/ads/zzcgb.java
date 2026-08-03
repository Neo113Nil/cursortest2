package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgb implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcgd zza;

    zzcgb(com.google.android.gms.internal.ads.zzcgd zzcgdVar) {
        java.util.Objects.requireNonNull(zzcgdVar);
        this.zza = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
        this.zza.zzj().set(1);
    }
}
