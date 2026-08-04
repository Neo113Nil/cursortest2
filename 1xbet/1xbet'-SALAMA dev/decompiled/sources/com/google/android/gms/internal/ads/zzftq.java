package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzftq extends zzftu {
    final /* synthetic */ zzfss zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzftq(zzftw zzftwVar, CharSequence charSequence, zzfss zzfssVar) {
        super(zzftwVar, charSequence);
        this.zza = zzfssVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzc(int i7) {
        return i7 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final int zzd(int i7) {
        CharSequence charSequence = ((zzftu) this).zzb;
        int length = charSequence.length();
        zzfth.zzb(i7, length, "index");
        while (i7 < length) {
            if (this.zza.zzb(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }
}
