package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzabn {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.ads.zzabp zzb;
    private boolean zzc;

    public zzabn(android.os.Handler handler, com.google.android.gms.internal.ads.zzabp zzabpVar) {
        this.zza = handler;
        this.zzb = zzabpVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    final /* synthetic */ android.os.Handler zzb() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzabp zzc() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
