package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbt extends com.google.android.gms.ads.internal.util.zzb {
    private final com.google.android.gms.ads.internal.util.client.zzu zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;

    public zzbt(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzfru zzfruVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzu(context, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
        this.zzb = str2;
        this.zzc = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        if (zzvVar == null) {
            this.zza.zzc(this.zzb, null);
        } else {
            new com.google.android.gms.internal.ads.zzfrt(zzvVar.zza(), this.zza, com.google.android.gms.internal.ads.zzcfr.zze, null, null).zza(this.zzb);
        }
    }
}
