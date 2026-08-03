package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmx extends com.google.android.gms.internal.ads.zzwy {
    private final com.google.android.gms.internal.ads.zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmx(com.google.android.gms.internal.ads.zzmy zzmyVar, com.google.android.gms.internal.ads.zzbf zzbfVar) {
        super(zzbfVar);
        java.util.Objects.requireNonNull(zzmyVar);
        this.zzc = new com.google.android.gms.internal.ads.zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbd zzd(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, boolean z) {
        com.google.android.gms.internal.ads.zzbf zzbfVar = this.zzb;
        com.google.android.gms.internal.ads.zzbd zzd = zzbfVar.zzd(i, zzbdVar, z);
        if (zzbfVar.zzb(zzd.zzc, this.zzc, 0L).zzb()) {
            java.lang.Object obj = zzbdVar.zza;
            java.lang.Object obj2 = zzbdVar.zzb;
            int i2 = zzbdVar.zzc;
            long j = zzbdVar.zzd;
            long j2 = zzbdVar.zze;
            zzd.zza(obj, obj2, i2, j, 0L, com.google.android.gms.internal.ads.zzc.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
