package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzawh {
    public final com.google.android.gms.internal.ads.zzavc zza;
    public final com.google.android.gms.internal.ads.zzawd zzb;
    public final com.google.android.gms.internal.ads.zzawa zzc;
    public final com.google.android.gms.internal.ads.zzavv zzd;

    public zzawh(com.google.android.gms.internal.ads.zzavc zzavcVar, com.google.android.gms.internal.ads.zzawd zzawdVar, com.google.android.gms.internal.ads.zzavv zzavvVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        this.zza = zzavcVar;
        this.zzb = zzawdVar;
        this.zzd = zzavvVar;
        this.zzc = new com.google.android.gms.internal.ads.zzawa((i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)) ^ (i8 % 454333378));
    }

    public final java.util.Optional zza() {
        com.google.android.gms.internal.ads.zzauw zzauwVar;
        try {
            java.util.ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new com.google.android.gms.internal.ads.zzavz();
            }
            com.google.android.gms.internal.ads.zzavx zzavxVar = (com.google.android.gms.internal.ads.zzavx) arrayDeque.pop();
            long j = zzavxVar.zza;
            long j2 = zzavxVar.zzb;
            long j3 = zzavxVar.zzc;
            com.google.android.gms.internal.ads.zzawd zzawdVar = this.zzb;
            if (zzawdVar.zzb < j2) {
                return java.util.Optional.of(com.google.android.gms.internal.ads.zzauw.zzG);
            }
            this.zzd.zza(j);
            if (j3 == 0) {
                while (zzawdVar.zzb > j2) {
                    zzawdVar.zzc();
                }
            }
            return java.util.Optional.empty();
        } catch (com.google.android.gms.internal.ads.zzavt e) {
            e = e;
            throw new java.lang.AssertionError(com.google.android.gms.internal.ads.zzavo.zza("CEiv6BFfPnitUE+D"), e);
        } catch (com.google.android.gms.internal.ads.zzavu e2) {
            e = e2;
            throw new java.lang.AssertionError(com.google.android.gms.internal.ads.zzavo.zza("CEiv6BFfPnitUE+D"), e);
        } catch (com.google.android.gms.internal.ads.zzavz unused) {
            zzauwVar = com.google.android.gms.internal.ads.zzauw.zzw;
            return java.util.Optional.of(zzauwVar);
        } catch (com.google.android.gms.internal.ads.zzawb unused2) {
            zzauwVar = com.google.android.gms.internal.ads.zzauw.zzG;
            return java.util.Optional.of(zzauwVar);
        }
    }
}
