package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdda extends com.google.android.gms.internal.ads.zzdip implements com.google.android.gms.internal.ads.zzdcv {
    public zzdda(java.util.Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzdcz
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzddh) obj).zzj(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzd(final com.google.android.gms.internal.ads.zzdnn zzdnnVar) {
        zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzdcx
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzddh zzddhVar = (com.google.android.gms.internal.ads.zzddh) obj;
                java.lang.String message = com.google.android.gms.internal.ads.zzdnn.this.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzddhVar.zzj(com.google.android.gms.internal.ads.zzfma.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zze() {
        zzs(com.google.android.gms.internal.ads.zzdcy.zza);
    }
}
