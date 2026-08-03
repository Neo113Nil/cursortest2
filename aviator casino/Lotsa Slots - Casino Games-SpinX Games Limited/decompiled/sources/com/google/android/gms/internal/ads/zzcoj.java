package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcoj implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcnl zza;

    private zzcoj(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static com.google.android.gms.internal.ads.zzcoj zza(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        return new com.google.android.gms.internal.ads.zzcoj(zzcnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return java.lang.Long.valueOf(this.zza.zzi());
    }
}
