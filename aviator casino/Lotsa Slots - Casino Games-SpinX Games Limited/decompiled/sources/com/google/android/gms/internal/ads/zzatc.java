package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzatc implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzate zzc;

    zzatc(com.google.android.gms.internal.ads.zzate zzateVar, java.lang.String str, long j) {
        this.zza = str;
        this.zzb = j;
        java.util.Objects.requireNonNull(zzateVar);
        this.zzc = zzateVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzate zzateVar = this.zzc;
        zzateVar.zzx().zza(this.zza, this.zzb);
        zzateVar.zzx().zzb(zzateVar.toString());
    }
}
