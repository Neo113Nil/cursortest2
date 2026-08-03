package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzf implements com.google.android.gms.internal.ads.zzbb {
    protected final com.google.android.gms.internal.ads.zzbe zza = new com.google.android.gms.internal.ads.zzbe();

    protected zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zza() {
        return zzh() == 3 && zzk() && zzi() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzb(long j) {
        zzc(zzs(), j, 5, false);
    }

    protected abstract void zzc(int i, long j, int i2, boolean z);
}
