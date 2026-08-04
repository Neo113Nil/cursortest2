package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzerc implements zzesg {
    private zzfpu zza;
    private zzfpu zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzerc(zzfpu zzfpuVar, zzfpu zzfpuVar2, boolean z4, boolean z7, boolean z8) {
        this.zza = zzfpuVar;
        this.zzb = zzfpuVar2;
        this.zzc = z4;
        this.zzd = z7;
        this.zzf = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        if (this.zze) {
            return;
        }
        Bundle bundleZza = zzfbo.zza(bundle, "pii");
        if (!this.zzf) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdj)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zzb());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zza());
                }
            } else if (this.zzf) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdl)).booleanValue()) {
                    if (this.zza.zzc()) {
                        bundleZza.putString("paidv1_id_android", this.zza.zzb());
                        bundleZza.putLong("paidv1_creation_time_android", this.zza.zza());
                    }
                }
            }
        } else if (this.zzf) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdl)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zzb());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zza());
                }
            }
        }
        if (!this.zzf) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdk)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zzb());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zza());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            } else if (this.zzf) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdm)).booleanValue()) {
                    if (this.zzb.zzc()) {
                        bundleZza.putString("paidv2_id_android", this.zzb.zzb());
                        bundleZza.putLong("paidv2_creation_time_android", this.zzb.zza());
                    }
                    bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                    bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
                }
            }
        } else if (this.zzf) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdm)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zzb());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zza());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            }
        }
        if (bundleZza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleZza);
    }

    public zzerc(boolean z4) {
        this.zzf = z4;
    }
}
