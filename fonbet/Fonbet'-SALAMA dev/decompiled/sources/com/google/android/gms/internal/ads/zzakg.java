package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
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
            int zze = zzedVar3.zze();
            int zzm = zzedVar3.zzm();
            int zzq = zzedVar3.zzq();
            int zzd = zzedVar3.zzd() + zzq;
            zzcn zzcnVar = null;
            if (zzd > zze) {
                zzedVar3.zzL(zze);
            } else {
                if (zzm != 128) {
                    switch (zzm) {
                        case 20:
                            zzakf.zzd(zzakfVar, zzedVar3, zzq);
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            zzakf.zzb(zzakfVar, zzedVar3, zzq);
                            break;
                        case 22:
                            zzakf.zzc(zzakfVar, zzedVar3, zzq);
                            break;
                    }
                } else {
                    zzcnVar = zzakfVar.zza();
                    zzakfVar.zze();
                }
                zzedVar3.zzL(zzd);
            }
            if (zzcnVar != null) {
                arrayList.add(zzcnVar);
            }
        }
    }
}
