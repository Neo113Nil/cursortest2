package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcdw implements com.google.android.gms.internal.ads.zzbeq {
    private final android.content.Context zza;
    private final java.lang.Object zzb;
    private final java.lang.String zzc;
    private boolean zzd;

    public zzcdw(android.content.Context context, java.lang.String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new java.lang.Object();
    }

    public final void zza(boolean z) {
        com.google.android.gms.internal.ads.zzcdz zzD = com.google.android.gms.ads.internal.zzt.zzD();
        android.content.Context context = this.zza;
        if (zzD.zza(context)) {
            synchronized (this.zzb) {
                if (this.zzd == z) {
                    return;
                }
                this.zzd = z;
                java.lang.String str = this.zzc;
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzt.zzD().zzd(context, str);
                } else {
                    com.google.android.gms.ads.internal.zzt.zzD().zze(context, str);
                }
            }
        }
    }

    public final java.lang.String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        zza(zzbepVar.zzj);
    }
}
