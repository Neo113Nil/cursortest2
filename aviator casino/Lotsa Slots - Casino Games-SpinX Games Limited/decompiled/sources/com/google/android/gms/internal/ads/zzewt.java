package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewt implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzfhe zza;

    zzewt(com.google.android.gms.internal.ads.zzfhe zzfheVar) {
        this.zza = zzfheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzfhe zzfheVar = this.zza;
        if (zzfheVar == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzews(null));
        }
        java.lang.String zza = zzfheVar.zza();
        return com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(zza) ? com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzews(null)) : com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzews(zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 15;
    }
}
