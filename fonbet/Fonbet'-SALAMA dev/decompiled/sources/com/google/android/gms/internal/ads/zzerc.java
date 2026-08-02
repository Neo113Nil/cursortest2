package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdk)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (r5.zzb.zzc() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r1.putString("paidv2_id_android", r5.zzb.zzb());
        r1.putLong("paidv2_creation_time_android", r5.zzb.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r5.zzc);
        r1.putBoolean("paidv2_user_option_android", r5.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdm)).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdl)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzdj)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r5.zza.zzc() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        r1.putString("paidv1_id_android", r5.zza.zzb());
        r1.putLong("paidv1_creation_time_android", r5.zza.zza());
     */
    @Override // com.google.android.gms.internal.ads.zzesg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        if (this.zze) {
            return;
        }
        Bundle zza = zzfbo.zza(bundle, "pii");
        if (!this.zzf) {
        }
        if (this.zzf) {
        }
        if (!this.zzf) {
        }
        if (this.zzf) {
        }
        if (zza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", zza);
    }

    public zzerc(boolean z4) {
        this.zzf = z4;
    }
}
