package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzevc implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzdxc zzb;
    private final com.google.android.gms.internal.ads.zzebw zzc;
    private final com.google.android.gms.internal.ads.zzeve zzd;

    public zzevc(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzdxc zzdxcVar, com.google.android.gms.internal.ads.zzebw zzebwVar, com.google.android.gms.internal.ads.zzeve zzeveVar) {
        this.zza = zzhcgVar;
        this.zzb = zzdxcVar;
        this.zzc = zzebwVar;
        this.zzd = zzeveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zznd;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            com.google.android.gms.internal.ads.zzeve zzeveVar = this.zzd;
            if (zzeveVar.zzd() != null) {
                com.google.android.gms.internal.ads.zzevd zzd = zzeveVar.zzd();
                zzd.getClass();
                return com.google.android.gms.internal.ads.zzhbw.zza(zzd);
            }
        }
        if (com.google.android.gms.internal.ads.zzgua.zzc((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcc)) || (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevd(new android.os.Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzevc.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzevd zzc() {
        java.util.List<java.lang.String> asList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcc)).split(";"));
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : asList) {
            try {
                com.google.android.gms.internal.ads.zzflw zza = this.zzb.zza(str, new org.json.JSONObject());
                zza.zzn();
                boolean zze = this.zzc.zze();
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznd)).booleanValue() || zze) {
                    try {
                        com.google.android.gms.internal.ads.zzbxq zzC = zza.zzC();
                        if (zzC != null) {
                            bundle2.putString("sdk_version", zzC.toString());
                        }
                    } catch (com.google.android.gms.internal.ads.zzflf unused) {
                    }
                }
                try {
                    com.google.android.gms.internal.ads.zzbxq zzB = zza.zzB();
                    if (zzB != null) {
                        bundle2.putString("adapter_version", zzB.toString());
                    }
                } catch (com.google.android.gms.internal.ads.zzflf unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (com.google.android.gms.internal.ads.zzflf unused3) {
            }
        }
        com.google.android.gms.internal.ads.zzevd zzevdVar = new com.google.android.gms.internal.ads.zzevd(bundle);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznd)).booleanValue()) {
            this.zzd.zzc(zzevdVar);
        }
        return zzevdVar;
    }
}
