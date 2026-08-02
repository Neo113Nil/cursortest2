package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzadl {
    private final zzed zza = new zzed(10);

    public final zzav zza(zzacw zzacwVar, zzagc zzagcVar) {
        zzav zzavVar = null;
        int i7 = 0;
        while (true) {
            try {
                zzacwVar.zzh(this.zza.zzN(), 0, 10);
                this.zza.zzL(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzM(3);
                int zzl = this.zza.zzl();
                int i8 = zzl + 10;
                if (zzavVar == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(this.zza.zzN(), 0, bArr, 0, 10);
                    zzacwVar.zzh(bArr, 10, zzl);
                    zzavVar = zzage.zza(bArr, i8, zzagcVar, new zzafq());
                } else {
                    zzacwVar.zzg(zzl);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        zzacwVar.zzj();
        zzacwVar.zzg(i7);
        return zzavVar;
    }
}
