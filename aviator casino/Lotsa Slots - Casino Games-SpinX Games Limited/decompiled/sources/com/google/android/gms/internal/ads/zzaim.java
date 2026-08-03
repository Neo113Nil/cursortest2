package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzaim {
    protected final com.google.android.gms.internal.ads.zzahk zza;

    protected zzaim(com.google.android.gms.internal.ads.zzahk zzahkVar) {
        this.zza = zzahkVar;
    }

    protected abstract boolean zza(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat;

    protected abstract boolean zzb(com.google.android.gms.internal.ads.zzet zzetVar, long j) throws com.google.android.gms.internal.ads.zzat;

    public final boolean zzf(com.google.android.gms.internal.ads.zzet zzetVar, long j) throws com.google.android.gms.internal.ads.zzat {
        return zza(zzetVar) && zzb(zzetVar, j);
    }
}
