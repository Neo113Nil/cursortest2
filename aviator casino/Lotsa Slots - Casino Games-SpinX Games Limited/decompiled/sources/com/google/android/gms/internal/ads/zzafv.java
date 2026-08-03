package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafv implements com.google.android.gms.internal.ads.zzahk {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzA(com.google.android.gms.internal.ads.zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ void zzO(long j) {
        com.google.android.gms.internal.ads.zzahk.CC.$default$zzO(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ int zza(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z) {
        int zzb;
        zzb = zzb(zzjVar, i, z, 0);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final int zzb(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z, int i2) throws java.io.IOException {
        int zza = zzjVar.zza(this.zza, 0, java.lang.Math.min(4096, i));
        if (zza != -1) {
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        zzd(zzetVar, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2) {
        zzetVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zze(long j, int i, int i2, int i3, com.google.android.gms.internal.ads.zzahj zzahjVar) {
    }
}
