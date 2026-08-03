package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgck extends com.google.android.gms.internal.ads.zzgcj {
    private static com.google.android.gms.internal.ads.zzgck zzd;

    private zzgck(android.content.Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final com.google.android.gms.internal.ads.zzgck zzh(android.content.Context context) {
        com.google.android.gms.internal.ads.zzgck zzgckVar;
        synchronized (com.google.android.gms.internal.ads.zzgck.class) {
            if (zzd == null) {
                zzd = new com.google.android.gms.internal.ads.zzgck(context);
            }
            zzgckVar = zzd;
        }
        return zzgckVar;
    }

    public final com.google.android.gms.internal.ads.zzgcg zzi(long j, boolean z) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgcg zza;
        synchronized (com.google.android.gms.internal.ads.zzgck.class) {
            zza = zza(null, null, j, z);
        }
        return zza;
    }

    public final com.google.android.gms.internal.ads.zzgcg zzj(java.lang.String str, java.lang.String str2, long j, boolean z) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgcg zza;
        synchronized (com.google.android.gms.internal.ads.zzgck.class) {
            zza = zza(str, str2, j, z);
        }
        return zza;
    }

    public final void zzk() throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzgck.class) {
            zzc(false);
        }
    }

    public final void zzl() throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzgck.class) {
            zzc(true);
        }
    }
}
