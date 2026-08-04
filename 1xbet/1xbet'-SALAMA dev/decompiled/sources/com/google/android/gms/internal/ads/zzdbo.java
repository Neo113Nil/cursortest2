package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdbo extends zzdag implements zzdbq {
    public zzdbo(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzq(new zzdaf(str2) { // from class: com.google.android.gms.internal.ads.zzdbi
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdbq) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    public final void zzb(final String str, final String str2) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdbl
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdbq) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    public final void zzc(final String str) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdbk
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdbq) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    public final void zzd(final String str) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdbm
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdbq) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    public final void zze() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdbn
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdbq) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    public final void zzf() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdbj
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdbq) obj).zzf();
            }
        });
    }
}
