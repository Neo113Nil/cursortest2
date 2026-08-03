package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfwn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfws zza;

    zzfwn(com.google.android.gms.internal.ads.zzfws zzfwsVar) {
        java.util.Objects.requireNonNull(zzfwsVar);
        this.zza = zzfwsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
