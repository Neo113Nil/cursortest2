package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahc {
    private final zzeu zza = new zzeu(10);

    private final boolean zzb(zzagi zzagiVar, int i) throws IOException {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    zzeu zzeuVar = this.zza;
                    System.arraycopy(zzeuVar.zzi(), 10, zzeuVar.zzi(), 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                zzeu zzeuVar2 = this.zza;
                int i6 = i4 + 10;
                zzagiVar.zzi(zzeuVar2.zzi(), i6 - i5, i5);
                zzeuVar2.zzh(i2);
                zzeuVar2.zzf(i6);
                if (zzeuVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzahf.zza(zzeuVar2.zzr()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    zzeuVar2.zzc(20);
                }
                i3++;
            } catch (EOFException unused) {
            }
        } while (i3 <= i);
        return false;
    }

    public final zzap zza(zzagi zzagiVar, zzajv zzajvVar, int i) throws IOException {
        zzap zzapVar = null;
        int i2 = 0;
        while (zzb(zzagiVar, i)) {
            zzeu zzeuVar = this.zza;
            int zzg = zzeuVar.zzg();
            zzeuVar.zzk(6);
            int zzG = zzeuVar.zzG();
            int i3 = zzG + 10;
            if (zzapVar == null) {
                byte[] bArr = new byte[i3];
                System.arraycopy(zzeuVar.zzi(), zzg, bArr, 0, 10);
                zzagiVar.zzi(bArr, 10, zzG);
                zzapVar = zzajy.zza(bArr, i3, zzajvVar, new zzajj());
            } else {
                zzagiVar.zzk(zzG);
            }
            i2 += i3;
        }
        zzagiVar.zzl();
        zzagiVar.zzk(i2);
        return zzapVar;
    }
}
