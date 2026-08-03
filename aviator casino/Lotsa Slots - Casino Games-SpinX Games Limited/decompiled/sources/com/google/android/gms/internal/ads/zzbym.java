package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbym extends com.google.android.gms.internal.ads.zzbne {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyo zza;

    /* synthetic */ zzbym(com.google.android.gms.internal.ads.zzbyo zzbyoVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbyoVar);
        this.zza = zzbyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(com.google.android.gms.internal.ads.zzbmv zzbmvVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbyo zzbyoVar = this.zza;
        if (zzbyoVar.zze() == null) {
            return;
        }
        zzbyoVar.zze().onCustomClick(zzbyoVar.zzc(zzbmvVar), str);
    }
}
