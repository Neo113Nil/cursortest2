package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbgt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbgx zza;

    zzbgt(com.google.android.gms.internal.ads.zzbgx zzbgxVar) {
        java.util.Objects.requireNonNull(zzbgxVar);
        this.zza = zzbgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
