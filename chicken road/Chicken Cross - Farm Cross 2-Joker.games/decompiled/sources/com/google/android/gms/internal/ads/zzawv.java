package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzawv {
    public final zzavq zza;
    public final zzawr zzb;
    public final zzawo zzc;
    public final zzawj zzd;

    public zzawv(zzavq zzavqVar, zzawr zzawrVar, zzawj zzawjVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        this.zza = zzavqVar;
        this.zzb = zzawrVar;
        this.zzd = zzawjVar;
        this.zzc = new zzawo((i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)) ^ (i8 % 454333378));
    }

    public final Optional zza() {
        zzavk zzavkVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzawn();
            }
            zzawl zzawlVar = (zzawl) arrayDeque.pop();
            long j = zzawlVar.zza;
            long j2 = zzawlVar.zzb;
            long j3 = zzawlVar.zzc;
            zzawr zzawrVar = this.zzb;
            if (zzawrVar.zzb < j2) {
                return Optional.of(zzavk.zzG);
            }
            this.zzd.zza(j);
            if (j3 == 0) {
                while (zzawrVar.zzb > j2) {
                    zzawrVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzawh e) {
            e = e;
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawi e2) {
            e = e2;
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawn unused) {
            zzavkVar = zzavk.zzw;
            return Optional.of(zzavkVar);
        } catch (zzawp unused2) {
            zzavkVar = zzavk.zzG;
            return Optional.of(zzavkVar);
        }
    }
}
