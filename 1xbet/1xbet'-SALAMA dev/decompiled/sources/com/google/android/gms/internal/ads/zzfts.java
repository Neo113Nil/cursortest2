package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzfts extends zzftu {
    public zzfts(zzftw zzftwVar, CharSequence charSequence, int i7) {
        super(zzftwVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzc(int i7) {
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzd(int i7) {
        int i8 = i7 + 4000;
        if (i8 < ((zzftu) this).zzb.length()) {
            return i8;
        }
        return -1;
    }
}
