package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzetn {
    private final com.google.android.gms.internal.ads.zzets zza;
    private final java.lang.String zzb;
    private com.google.android.gms.ads.internal.client.zzdx zzc;

    public zzetn(com.google.android.gms.internal.ads.zzets zzetsVar, java.lang.String str) {
        this.zza = zzetsVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws android.os.RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws android.os.RemoteException {
        this.zzc = null;
        com.google.android.gms.internal.ads.zzett zzettVar = new com.google.android.gms.internal.ads.zzett(i);
        com.google.android.gms.internal.ads.zzetm zzetmVar = new com.google.android.gms.internal.ads.zzetm(this);
        this.zza.zza(zzmVar, this.zzb, zzettVar, zzetmVar);
    }

    public final synchronized java.lang.String zzc() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zze() : null;
    }

    public final synchronized java.lang.String zzd() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zze() : null;
    }

    final /* synthetic */ void zze(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zzc = zzdxVar;
    }
}
