package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgrp extends com.google.android.gms.internal.ads.zzgqn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgrr zza;
    private final com.google.android.gms.internal.ads.zzgrw zzb;

    zzgrp(com.google.android.gms.internal.ads.zzgrr zzgrrVar, com.google.android.gms.internal.ads.zzgrw zzgrwVar) {
        java.util.Objects.requireNonNull(zzgrrVar);
        this.zza = zzgrrVar;
        this.zzb = zzgrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqo
    public final void zzb(android.os.Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        java.lang.String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        com.google.android.gms.internal.ads.zzgru zzd = com.google.android.gms.internal.ads.zzgrv.zzd();
        zzd.zza(i);
        if (string != null) {
            zzd.zzb(string);
        }
        zzd.zzc(i2);
        this.zzb.zza(zzd.zzd());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
