package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcez extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfd zza;

    zzcez(com.google.android.gms.internal.ads.zzcfd zzcfdVar) {
        java.util.Objects.requireNonNull(zzcfdVar);
        this.zza = zzcfdVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.internal.ads.zzcfd zzcfdVar = this.zza;
        com.google.android.gms.internal.ads.zzbit zzbitVar = new com.google.android.gms.internal.ads.zzbit(zzcfdVar.zzz(), zzcfdVar.zzA().afmaVersion);
        synchronized (zzcfdVar.zzy()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                com.google.android.gms.internal.ads.zzbiw.zza(zzcfdVar.zzB(), zzbitVar);
            } catch (java.lang.IllegalArgumentException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}
