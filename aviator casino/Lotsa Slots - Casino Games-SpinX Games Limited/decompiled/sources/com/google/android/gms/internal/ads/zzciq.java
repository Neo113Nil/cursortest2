package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzciq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcis zza;

    zzciq(com.google.android.gms.internal.ads.zzcis zzcisVar) {
        java.util.Objects.requireNonNull(zzcisVar);
        this.zza = zzcisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zza);
    }
}
