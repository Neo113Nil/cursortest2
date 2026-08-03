package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzftp implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfub zza;

    zzftp(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        java.util.Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzy();
    }
}
