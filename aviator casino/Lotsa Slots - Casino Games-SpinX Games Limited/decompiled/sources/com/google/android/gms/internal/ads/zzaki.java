package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaki {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet(8);
    private int zzb;

    private final long zzb(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
        int i2 = 0;
        zzafpVar.zzh(zzetVar.zzi(), 0, 1, false);
        int i3 = zzetVar.zzi()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzafpVar.zzh(zzetVar.zzi(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (zzetVar.zzi()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        long zzo = zzafzVar.zzo();
        long j = 1024;
        if (zzo != -1 && zzo <= 1024) {
            j = zzo;
        }
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
        zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long zzz = zzetVar.zzz(); zzz != 440786851; zzz = ((zzz << 8) & (-256)) | (zzetVar.zzi()[0] & 255)) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzafpVar.zzh(zzetVar.zzi(), 0, 1, false);
        }
        long zzb = zzb(zzafzVar);
        long j2 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j3 = j2 + zzb;
            if (zzo == -1 || j3 < zzo) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzafzVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzafzVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i3 = (int) zzb2;
                            zzafpVar.zzj(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
