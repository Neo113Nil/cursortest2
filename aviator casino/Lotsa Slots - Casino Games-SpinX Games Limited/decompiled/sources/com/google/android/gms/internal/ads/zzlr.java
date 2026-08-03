package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzlr {
    public com.google.android.gms.internal.ads.zzms zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlr(com.google.android.gms.internal.ads.zzms zzmsVar) {
        this.zza = zzmsVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzms zzmsVar) {
        this.zze |= this.zza != zzmsVar;
        this.zza = zzmsVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            com.google.android.gms.internal.ads.zzgtj.zza(i == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }

    final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
