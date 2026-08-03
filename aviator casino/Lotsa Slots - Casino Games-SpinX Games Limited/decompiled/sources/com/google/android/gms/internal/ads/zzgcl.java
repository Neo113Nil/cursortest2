package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgcl extends com.google.android.gms.internal.ads.zzgcj {
    private static com.google.android.gms.internal.ads.zzgcl zzd;

    private zzgcl(android.content.Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final com.google.android.gms.internal.ads.zzgcl zzh(android.content.Context context) {
        com.google.android.gms.internal.ads.zzgcl zzgclVar;
        synchronized (com.google.android.gms.internal.ads.zzgcl.class) {
            if (zzd == null) {
                zzd = new com.google.android.gms.internal.ads.zzgcl(context);
            }
            zzgclVar = zzd;
        }
        return zzgclVar;
    }

    public final com.google.android.gms.internal.ads.zzgcg zzi(long j, boolean z) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzgcl.class) {
            if (this.zzc.zzc()) {
                return zza(null, null, j, z);
            }
            return new com.google.android.gms.internal.ads.zzgcg();
        }
    }

    public final void zzj() throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzgcl.class) {
            if (zzg(false)) {
                zzc(false);
            }
        }
    }
}
