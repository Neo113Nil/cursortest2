package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzequ implements com.google.android.gms.internal.ads.zzels {
    private final com.google.android.gms.internal.ads.zzelu zza;
    private final com.google.android.gms.internal.ads.zzely zzb;
    private final com.google.android.gms.internal.ads.zzfpk zzc;
    private final com.google.android.gms.internal.ads.zzhcg zzd;

    public zzequ(com.google.android.gms.internal.ads.zzfpk zzfpkVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzelu zzeluVar, com.google.android.gms.internal.ads.zzely zzelyVar) {
        this.zzc = zzfpkVar;
        this.zzd = zzhcgVar;
        this.zzb = zzelyVar;
        this.zza = zzeluVar;
    }

    static final java.lang.String zze(java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 20 + java.lang.String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        return !zzfkfVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        final com.google.android.gms.internal.ads.zzelv zzelvVar;
        java.util.Iterator it = zzfkfVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzelvVar = null;
                break;
            }
            try {
                zzelvVar = this.zza.zza((java.lang.String) it.next(), zzfkfVar.zzv);
                break;
            } catch (com.google.android.gms.internal.ads.zzflf unused) {
            }
        }
        if (zzelvVar == null) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeol("Unable to instantiate mediation adapter class."));
        }
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        zzelvVar.zzc.zza(new com.google.android.gms.internal.ads.zzeqr(this, zzelvVar, zzcfwVar));
        if (zzfkfVar.zzM) {
            android.os.Bundle bundle = zzfkqVar.zza.zza.zzd.zzm;
            android.os.Bundle bundle2 = bundle.getBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
                bundle.putBundle(com.google.ads.mediation.admob.AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zzc;
        com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.ADAPTER_LOAD_AD_SYN;
        java.util.Objects.requireNonNull(zzfpkVar);
        return com.google.android.gms.internal.ads.zzfov.zzd(new com.google.android.gms.internal.ads.zzfoq() { // from class: com.google.android.gms.internal.ads.zzeqt
            @Override // com.google.android.gms.internal.ads.zzfoq
            public final /* synthetic */ void zza() {
                com.google.android.gms.internal.ads.zzequ.this.zzc(zzfkqVar, zzfkfVar, zzelvVar);
            }
        }, this.zzd, zzfpeVar, zzfpkVar).zzj(com.google.android.gms.internal.ads.zzfpe.ADAPTER_LOAD_AD_ACK).zze(zzcfwVar).zzj(com.google.android.gms.internal.ads.zzfpe.ADAPTER_WRAP_ADAPTER).zzb(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzeqs
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzequ.this.zzd(zzfkqVar, zzfkfVar, zzelvVar, (java.lang.Void) obj);
            }
        }).zzi();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) {
        this.zzb.zza(zzfkqVar, zzfkfVar, zzelvVar);
    }

    final /* synthetic */ java.lang.Object zzd(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar, java.lang.Void r4) {
        return this.zzb.zzb(zzfkqVar, zzfkfVar, zzelvVar);
    }
}
