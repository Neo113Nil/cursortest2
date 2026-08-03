package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvm extends com.google.android.gms.internal.ads.zzgvp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvm(com.google.android.gms.internal.ads.zzgvt zzgvtVar) {
        super(zzgvtVar, null);
        java.util.Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    final /* bridge */ /* synthetic */ java.lang.Object zza(int i) {
        return new com.google.android.gms.internal.ads.zzgvr(this.zza, i);
    }
}
