package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzftr extends zzftu {
    final /* synthetic */ zzfst zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzftr(zzftw zzftwVar, CharSequence charSequence, zzfst zzfstVar) {
        super(zzftwVar, charSequence);
        this.zza = zzfstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzc(int i7) {
        return ((zzfsx) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzd(int i7) {
        if (((zzfsx) this.zza).zza.find(i7)) {
            return ((zzfsx) this.zza).zza.start();
        }
        return -1;
    }
}
