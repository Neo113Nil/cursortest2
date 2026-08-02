package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfpv {
    private static zzfpv zzb;
    final zzfpw zza;

    private zzfpv(Context context) {
        this.zza = zzfpw.zzb(context);
    }

    public static final zzfpv zza(Context context) {
        zzfpv zzfpvVar;
        synchronized (zzfpv.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfpv(context);
                }
                zzfpvVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfpvVar;
    }

    public final void zzb(boolean z4) {
        synchronized (zzfpv.class) {
            this.zza.zzd("paidv2_user_option", Boolean.valueOf(z4));
        }
    }

    public final void zzc(boolean z4) {
        synchronized (zzfpv.class) {
            try {
                this.zza.zzd("paidv2_publisher_option", Boolean.valueOf(z4));
                if (!z4) {
                    this.zza.zze("paidv2_creation_time");
                    this.zza.zze("paidv2_id");
                    this.zza.zze("vendor_scoped_gpid_v2_id");
                    this.zza.zze("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd() {
        boolean zzf;
        synchronized (zzfpv.class) {
            zzf = this.zza.zzf("paidv2_publisher_option", true);
        }
        return zzf;
    }

    public final boolean zze() {
        boolean zzf;
        synchronized (zzfpv.class) {
            zzf = this.zza.zzf("paidv2_user_option", true);
        }
        return zzf;
    }
}
