package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class zzakg implements zzajs {
    private final zzed zza = new zzed();
    private final zzed zzb = new zzed();
    private final zzakf zzc = new zzakf();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        this.zza.zzJ(bArr, i8 + i7);
        this.zza.zzL(i7);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        if (zzen.zzO(this.zza, this.zzb, this.zzd)) {
            zzed zzedVar = this.zza;
            zzed zzedVar2 = this.zzb;
            zzedVar.zzJ(zzedVar2.zzN(), zzedVar2.zze());
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar3 = this.zza;
            if (zzedVar3.zzb() < 3) {
                zzddVar.zza(new zzajk(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzakf zzakfVar = this.zzc;
            int iZze = zzedVar3.zze();
            int iZzm = zzedVar3.zzm();
            int iZzq = zzedVar3.zzq();
            int iZzd = zzedVar3.zzd() + iZzq;
            zzcn zzcnVarZza = null;
            if (iZzd > iZze) {
                zzedVar3.zzL(iZze);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            zzakf.zzd(zzakfVar, zzedVar3, iZzq);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            zzakf.zzb(zzakfVar, zzedVar3, iZzq);
                            break;
                        case 22:
                            zzakf.zzc(zzakfVar, zzedVar3, iZzq);
                            break;
                    }
                } else {
                    zzcnVarZza = zzakfVar.zza();
                    zzakfVar.zze();
                }
                zzedVar3.zzL(iZzd);
            }
            if (zzcnVarZza != null) {
                arrayList.add(zzcnVarZza);
            }
        }
    }
}
