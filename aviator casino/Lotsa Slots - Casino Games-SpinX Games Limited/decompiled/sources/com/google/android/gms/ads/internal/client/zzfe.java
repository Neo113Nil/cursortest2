package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzfe extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzff zza;

    /* synthetic */ zzfe(com.google.android.gms.ads.internal.client.zzff zzffVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzffVar);
        this.zza = zzffVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        zzi(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final java.lang.String zzf() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzg() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final java.lang.String zzh() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.ads.internal.client.zzfd(this));
    }
}
