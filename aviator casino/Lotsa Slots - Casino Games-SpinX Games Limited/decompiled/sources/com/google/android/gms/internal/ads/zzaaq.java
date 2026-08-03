package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzaaq {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzbg zzb;
    public final int zzc;
    public final com.google.android.gms.internal.ads.zzv zzd;

    public zzaaq(int i, com.google.android.gms.internal.ads.zzbg zzbgVar, int i2) {
        this.zza = i;
        this.zzb = zzbgVar;
        this.zzc = i2;
        this.zzd = zzbgVar.zza(i2);
    }

    public abstract int zza();

    public abstract boolean zzc(com.google.android.gms.internal.ads.zzaaq zzaaqVar);
}
