package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzerr {
    private final java.util.concurrent.ConcurrentHashMap zza = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.ads.zzdxc zzb;

    public zzerr(com.google.android.gms.internal.ads.zzdxc zzdxcVar) {
        this.zzb = zzdxcVar;
    }

    public final void zza(java.lang.String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }

    @javax.annotation.CheckForNull
    public final com.google.android.gms.internal.ads.zzbxb zzb(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (com.google.android.gms.internal.ads.zzbxb) concurrentHashMap.get(str);
        }
        return null;
    }
}
