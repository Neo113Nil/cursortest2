package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzcvc extends zzdag implements zzcuu {
    public zzcvc(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcvb
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzcvg) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zzb() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcva
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzcvg) obj).zzq(zzfcb.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuu
    public final void zzc(final zzdey zzdeyVar) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcuz
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                zzcvg zzcvgVar = (zzcvg) obj;
                String message = zzdeyVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcvgVar.zzq(zzfcb.zzd(12, message, null));
            }
        });
    }
}
