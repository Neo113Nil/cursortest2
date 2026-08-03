package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfzb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzc zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfzb(com.google.android.gms.internal.ads.zzfzc zzfzcVar, byte[] bArr, byte[] bArr2) {
        java.util.Objects.requireNonNull(zzfzcVar);
        this.zza = zzfzcVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            com.google.android.gms.internal.ads.zzfzc zzfzcVar = this.zza;
            if (zzfzcVar.zzb) {
                com.google.android.gms.internal.ads.zzfzf zzfzfVar = zzfzcVar.zza;
                zzfzfVar.zzg(this.zzb);
                zzfzfVar.zzh(this.zzc);
                zzfzfVar.zzi(this.zzd);
                zzfzfVar.zzf(null);
                zzfzfVar.zze();
            }
        } catch (android.os.RemoteException e) {
            android.util.Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public final com.google.android.gms.internal.ads.zzfzb zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfzb zzc(int i) {
        this.zzd = i;
        return this;
    }
}
