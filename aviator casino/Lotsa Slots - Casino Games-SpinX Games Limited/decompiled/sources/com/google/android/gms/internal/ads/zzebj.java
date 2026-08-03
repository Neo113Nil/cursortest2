package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzebj implements com.google.android.gms.internal.ads.zzeau {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzeay zzb;
    private final com.google.android.gms.internal.ads.zzfjw zzc;

    zzebj(long j, android.content.Context context, com.google.android.gms.internal.ads.zzeay zzeayVar, com.google.android.gms.internal.ads.zzcnj zzcnjVar, java.lang.String str) {
        this.zza = j;
        this.zzb = zzeayVar;
        com.google.android.gms.internal.ads.zzfjy zzq = zzcnjVar.zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        this.zzc = zzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new com.google.android.gms.internal.ads.zzebh(this));
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zzb() {
        try {
            com.google.android.gms.internal.ads.zzfjw zzfjwVar = this.zzc;
            zzfjwVar.zze(new com.google.android.gms.internal.ads.zzebi(this));
            zzfjwVar.zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zzc() {
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeay zze() {
        return this.zzb;
    }
}
