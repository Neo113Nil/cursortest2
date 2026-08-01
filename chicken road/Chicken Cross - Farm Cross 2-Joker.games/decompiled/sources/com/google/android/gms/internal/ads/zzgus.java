package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgus extends zzgux {
    zzgus(zzguz zzguzVar, CharSequence charSequence, int i) {
        super(zzguzVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzc(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzd(int i) {
        return i;
    }
}
