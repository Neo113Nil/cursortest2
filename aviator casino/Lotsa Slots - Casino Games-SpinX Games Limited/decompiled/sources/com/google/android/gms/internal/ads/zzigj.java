package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigj extends com.google.android.gms.internal.ads.zzign {
    zzigj() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry zzd = zzd(i);
                if (((com.google.android.gms.internal.ads.zzids) ((com.google.android.gms.internal.ads.zzigk) zzd).zza()).zzd()) {
                    zzd.setValue(java.util.Collections.unmodifiableList((java.util.List) zzd.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zze()) {
                if (((com.google.android.gms.internal.ads.zzids) entry.getKey()).zzd()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
