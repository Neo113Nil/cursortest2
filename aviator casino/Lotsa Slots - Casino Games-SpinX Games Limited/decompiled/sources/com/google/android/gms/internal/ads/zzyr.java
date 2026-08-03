package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyr extends com.google.android.gms.internal.ads.zzwy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzyr(com.google.android.gms.internal.ads.zzyu zzyuVar, com.google.android.gms.internal.ads.zzbf zzbfVar) {
        super(zzbfVar);
        java.util.Objects.requireNonNull(zzyuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbe zzb(int i, com.google.android.gms.internal.ads.zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbd zzd(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, boolean z) {
        this.zzb.zzd(i, zzbdVar, z);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
