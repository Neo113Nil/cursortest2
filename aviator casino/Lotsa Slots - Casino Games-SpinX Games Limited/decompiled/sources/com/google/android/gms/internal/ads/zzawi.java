package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzawi implements java.util.Comparator {
    private final boolean zza;

    public zzawi(boolean z) {
        this.zza = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Comparator comparator;
        java.lang.Object zzn;
        java.lang.Object zzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = i8 % 496612959;
        com.google.android.gms.internal.ads.zzawm zzawmVar = (com.google.android.gms.internal.ads.zzawm) obj;
        com.google.android.gms.internal.ads.zzawm zzawmVar2 = (com.google.android.gms.internal.ads.zzawm) obj2;
        int i11 = zzawmVar.zza;
        if (i11 != zzawmVar2.zza) {
            throw new java.lang.IllegalArgumentException();
        }
        int i12 = i10 ^ i9;
        try {
            if (i11 == 0) {
                throw null;
            }
            switch (i11 + i12) {
                case 0:
                default:
                    return 0;
                case 1:
                    if (!this.zza) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (zzawmVar.zzl() == zzawmVar2.zzl()) {
                        return 0;
                    }
                case 2:
                    return java.lang.Long.compare(zzawmVar.zzm(), zzawmVar2.zzm());
                case 3:
                    comparator = com.google.android.gms.internal.ads.zzavq.zzc;
                    zzn = zzawmVar.zzn();
                    zzn2 = zzawmVar2.zzn();
                    return comparator.compare(zzn, zzn2);
                case 4:
                    zzn = zzawmVar.zzo();
                    zzn2 = zzawmVar2.zzo();
                    comparator = com.google.android.gms.internal.ads.zzgvw.zza(this);
                    return comparator.compare(zzn, zzn2);
                case 5:
                    if (this.zza) {
                        return zzawmVar.zzp() != zzawmVar2.zzp() ? 1 : 0;
                    }
                    throw new java.lang.IllegalArgumentException();
                case 6:
                    return java.lang.Double.compare(zzawmVar.zzq(), zzawmVar2.zzq());
            }
        } catch (com.google.android.gms.internal.ads.zzawj e) {
            throw new java.lang.AssertionError(com.google.android.gms.internal.ads.zzavo.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
