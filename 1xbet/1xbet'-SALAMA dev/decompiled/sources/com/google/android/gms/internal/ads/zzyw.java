package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzyw {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyp[] zzd = new zzyp[100];

    public zzyw(boolean z4, int i7) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzyp zzb() {
        zzyp zzypVar;
        try {
            this.zzb++;
            int i7 = this.zzc;
            if (i7 > 0) {
                zzyp[] zzypVarArr = this.zzd;
                int i8 = i7 - 1;
                this.zzc = i8;
                zzypVar = zzypVarArr[i8];
                if (zzypVar == null) {
                    throw null;
                }
                zzypVarArr[i8] = null;
            } else {
                zzypVar = new zzyp(new byte[65536], 0);
                int i9 = this.zzb;
                zzyp[] zzypVarArr2 = this.zzd;
                int length = zzypVarArr2.length;
                if (i9 > length) {
                    this.zzd = (zzyp[]) Arrays.copyOf(zzypVarArr2, length + length);
                    return zzypVar;
                }
            }
            return zzypVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(zzyp zzypVar) {
        zzyp[] zzypVarArr = this.zzd;
        int i7 = this.zzc;
        this.zzc = i7 + 1;
        zzypVarArr[i7] = zzypVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzyq zzyqVar) {
        while (zzyqVar != null) {
            try {
                zzyp[] zzypVarArr = this.zzd;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                zzypVarArr[i7] = zzyqVar.zzc();
                this.zzb--;
                zzyqVar = zzyqVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i7) {
        int i8 = this.zza;
        this.zza = i7;
        if (i7 < i8) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i7 = this.zza;
        int i8 = zzen.zza;
        int iMax = Math.max(0, ((i7 + 65535) / 65536) - this.zzb);
        int i9 = this.zzc;
        if (iMax >= i9) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i9, (Object) null);
        this.zzc = iMax;
    }
}
