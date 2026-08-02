package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzboq {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbov zza;
    private final com.google.android.libraries.places.internal.zzblg zzb;
    private com.google.android.libraries.places.internal.zzblp zzc;
    private com.google.android.libraries.places.internal.zzblr zzd;

    zzboq(com.google.android.libraries.places.internal.zzbov zzbovVar, com.google.android.libraries.places.internal.zzblg zzblgVar) {
        java.util.Objects.requireNonNull(zzbovVar);
        this.zza = zzbovVar;
        this.zzb = zzblgVar;
        com.google.android.libraries.places.internal.zzblr zzb = zzbovVar.zzc().zzb(zzbovVar.zzd());
        this.zzd = zzb;
        if (zzb != null) {
            this.zzc = zzb.zza(zzblgVar);
            return;
        }
        java.lang.String zzd = zzbovVar.zzd();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE);
        sb.append("Could not find policy '");
        sb.append(zzd);
        sb.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    final com.google.android.libraries.places.internal.zzbnp zza(com.google.android.libraries.places.internal.zzbll zzbllVar) {
        com.google.android.libraries.places.internal.zzbzs zzbzsVar = (com.google.android.libraries.places.internal.zzbzs) zzbllVar.zze();
        byte[] bArr = null;
        if (zzbzsVar == null) {
            try {
                com.google.android.libraries.places.internal.zzbov zzbovVar = this.zza;
                zzbzsVar = new com.google.android.libraries.places.internal.zzbzs(zzbovVar.zzb(zzbovVar.zzd(), "using default policy"), null);
            } catch (com.google.android.libraries.places.internal.zzbou e) {
                this.zzb.zzb(com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE, new com.google.android.libraries.places.internal.zzbos(com.google.android.libraries.places.internal.zzbnp.zzh.zze(e.getMessage())));
                this.zzc.zzc();
                this.zzd = null;
                this.zzc = new com.google.android.libraries.places.internal.zzbot(bArr);
                return com.google.android.libraries.places.internal.zzbnp.zza;
            }
        }
        if (this.zzd == null || !zzbzsVar.zza.zzd().equals(this.zzd.zzd())) {
            com.google.android.libraries.places.internal.zzblg zzblgVar = this.zzb;
            zzblgVar.zzb(com.google.android.libraries.places.internal.zzbjn.CONNECTING, new com.google.android.libraries.places.internal.zzbor(bArr));
            this.zzc.zzc();
            com.google.android.libraries.places.internal.zzblr zzblrVar = zzbzsVar.zza;
            this.zzd = zzblrVar;
            com.google.android.libraries.places.internal.zzblp zzblpVar = this.zzc;
            this.zzc = zzblrVar.zza(zzblgVar);
            ((com.google.android.libraries.places.internal.zzbuz) zzblgVar).zzb.zzW().zzb(2, "Load balancer changed from {0} to {1}", zzblpVar.getClass().getSimpleName(), this.zzc.getClass().getSimpleName());
        }
        java.lang.Object obj = zzbzsVar.zzb;
        if (obj != null) {
            ((com.google.android.libraries.places.internal.zzbuz) this.zzb).zzb.zzW().zzb(1, "Load-balancing config: {0}", obj);
        }
        com.google.android.libraries.places.internal.zzblp zzblpVar2 = this.zzc;
        com.google.android.libraries.places.internal.zzblk zza = com.google.android.libraries.places.internal.zzbll.zza();
        zza.zza(zzbllVar.zzc());
        zza.zzb(zzbllVar.zzd());
        zza.zzc(obj);
        return zzblpVar2.zza(zza.zzd());
    }

    final void zzb() {
        this.zzc.zzc();
        this.zzc = null;
    }

    public final com.google.android.libraries.places.internal.zzblp zzc() {
        return this.zzc;
    }
}
