package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgch {
    private static com.google.android.gms.internal.ads.zzgch zzb;
    final com.google.android.gms.internal.ads.zzgci zza;

    private zzgch(android.content.Context context) {
        this.zza = com.google.android.gms.internal.ads.zzgci.zza(context);
    }

    public static final com.google.android.gms.internal.ads.zzgch zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzgch zzgchVar;
        synchronized (com.google.android.gms.internal.ads.zzgch.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.ads.zzgch(context);
            }
            zzgchVar = zzb;
        }
        return zzgchVar;
    }

    public final void zzb(boolean z) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzgch.class) {
            com.google.android.gms.internal.ads.zzgci zzgciVar = this.zza;
            zzgciVar.zzb("paidv2_publisher_option", java.lang.Boolean.valueOf(z));
            if (!z) {
                zzgciVar.zzf("paidv2_creation_time");
                zzgciVar.zzf("paidv2_id");
                zzgciVar.zzf("vendor_scoped_gpid_v2_id");
                zzgciVar.zzf("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzc() {
        boolean zze;
        synchronized (com.google.android.gms.internal.ads.zzgch.class) {
            zze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zze;
    }

    public final void zzd(boolean z) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzgch.class) {
            this.zza.zzb("paidv2_user_option", java.lang.Boolean.valueOf(z));
        }
    }

    public final boolean zze() {
        boolean zze;
        synchronized (com.google.android.gms.internal.ads.zzgch.class) {
            zze = this.zza.zze("paidv2_user_option", true);
        }
        return zze;
    }
}
