package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzicl implements com.google.android.gms.internal.ads.zzifx {
    static {
        int i = com.google.android.gms.internal.ads.zzido.zzb;
        int i2 = com.google.android.gms.internal.ads.zzicn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final /* synthetic */ java.lang.Object zza(java.io.InputStream inputStream, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        com.google.android.gms.internal.ads.zzigs zzaU;
        com.google.android.gms.internal.ads.zzide zzH = com.google.android.gms.internal.ads.zzide.zzH(inputStream, 4096);
        com.google.android.gms.internal.ads.zzifp zzifpVar = (com.google.android.gms.internal.ads.zzifp) zzb(zzH, zzidoVar);
        zzH.zzb(0);
        if (zzifpVar == null || zzifpVar.zzbi()) {
            return zzifpVar;
        }
        if (zzifpVar instanceof com.google.android.gms.internal.ads.zzicj) {
            zzaU = ((com.google.android.gms.internal.ads.zzicj) zzifpVar).zzaU();
        } else {
            if (zzifpVar instanceof com.google.android.gms.internal.ads.zzick) {
                throw null;
            }
            zzaU = new com.google.android.gms.internal.ads.zzigs(zzifpVar);
        }
        throw zzaU.zza();
    }
}
