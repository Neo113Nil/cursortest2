package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdp {
    public static final com.google.android.gms.internal.ads.zzdp zza = new com.google.android.gms.internal.ads.zzdp(0, 0, false);
    private final int zzb;
    private final int zzc;
    private final boolean zzd;

    public zzdp(int i, int i2) {
        this(i, i2, true);
    }

    private zzdp(int i, int i2, boolean z) {
        this.zzd = z;
        this.zzb = i;
        this.zzc = i2;
    }

    public final int zza() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzd);
        return this.zzb;
    }

    public final int zzb() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzd);
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
