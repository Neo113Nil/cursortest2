package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbnz extends com.google.android.gms.internal.ads.zzbne {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbob zza;

    /* synthetic */ zzbnz(com.google.android.gms.internal.ads.zzbob zzbobVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbobVar);
        this.zza = zzbobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(com.google.android.gms.internal.ads.zzbmv zzbmvVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbob zzbobVar = this.zza;
        if (zzbobVar.zzd() == null) {
            return;
        }
        zzbobVar.zzd().zzc(zzbobVar.zze(zzbmvVar), str);
    }
}
