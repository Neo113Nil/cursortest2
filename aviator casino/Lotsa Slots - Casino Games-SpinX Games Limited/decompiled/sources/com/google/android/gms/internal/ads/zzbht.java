package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbht {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbhu zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbht(com.google.android.gms.internal.ads.zzbhu zzbhuVar, byte[] bArr, byte[] bArr2) {
        java.util.Objects.requireNonNull(zzbhuVar);
        this.zza = zzbhuVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            com.google.android.gms.internal.ads.zzbhu zzbhuVar = this.zza;
            if (zzbhuVar.zzb) {
                zzbhuVar.zza.zzh(this.zzb);
                zzbhuVar.zza.zzi(0);
                zzbhuVar.zza.zzj(this.zzc);
                zzbhuVar.zza.zzg(null);
                zzbhuVar.zza.zzf();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbhs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbht.this.zzc();
            }
        });
    }

    public final com.google.android.gms.internal.ads.zzbht zzb(int i) {
        this.zzc = i;
        return this;
    }
}
