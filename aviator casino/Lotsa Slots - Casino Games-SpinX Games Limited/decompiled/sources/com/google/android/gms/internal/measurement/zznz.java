package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznz extends com.google.android.gms.internal.measurement.zzod {
    zznz() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzod
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry zzd = zzd(i);
                if (((com.google.android.gms.internal.measurement.zzlu) ((com.google.android.gms.internal.measurement.zzoa) zzd).zza()).zzd()) {
                    zzd.setValue(java.util.Collections.unmodifiableList((java.util.List) zzd.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zze()) {
                if (((com.google.android.gms.internal.measurement.zzlu) entry.getKey()).zzd()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
