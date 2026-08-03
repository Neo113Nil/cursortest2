package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeps extends com.google.android.gms.internal.ads.zzbwx {
    private final com.google.android.gms.internal.ads.zzelv zza;

    /* synthetic */ zzeps(com.google.android.gms.internal.ads.zzept zzeptVar, com.google.android.gms.internal.ads.zzelv zzelvVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzeptVar);
        this.zza = zzelvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zze() throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzenh) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzenh) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzenh) this.zza.zzc).zzx(zzeVar);
    }
}
