package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzebf implements com.google.android.gms.internal.ads.zzeau {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzetk zzb;

    zzebf(long j, android.content.Context context, com.google.android.gms.internal.ads.zzeay zzeayVar, com.google.android.gms.internal.ads.zzcnj zzcnjVar, java.lang.String str) {
        this.zza = j;
        com.google.android.gms.internal.ads.zzfik zzn = zzcnjVar.zzn();
        zzn.zzd(context);
        zzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzn.zzc(str);
        com.google.android.gms.internal.ads.zzetk zza = zzn.zza().zza();
        this.zzb = zza;
        zza.zzdS(new com.google.android.gms.internal.ads.zzebe(this, zzeayVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zzb() {
        this.zzb.zzR(com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzeau
    public final void zzc() {
        this.zzb.zzc();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
