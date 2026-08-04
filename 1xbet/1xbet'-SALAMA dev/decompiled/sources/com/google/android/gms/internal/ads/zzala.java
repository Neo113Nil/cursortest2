package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzala implements zzajs {
    private final zzed zza = new zzed();

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        zzcn zzcnVarZzp;
        this.zza.zzJ(bArr, i8 + i7);
        this.zza.zzL(i7);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar = this.zza;
            if (zzedVar.zzb() <= 0) {
                zzddVar.zza(new zzajk(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzcv.zze(zzedVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            zzed zzedVar2 = this.zza;
            int iZzg = zzedVar2.zzg() - 8;
            if (zzedVar2.zzg() == 1987343459) {
                zzed zzedVar3 = this.zza;
                CharSequence charSequenceZza = null;
                zzcl zzclVarZzb = null;
                while (iZzg > 0) {
                    zzcv.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = zzedVar3.zzg();
                    int iZzg3 = zzedVar3.zzg();
                    int i9 = iZzg - 8;
                    int i10 = iZzg2 - 8;
                    String strZzC = zzen.zzC(zzedVar3.zzN(), zzedVar3.zzd(), i10);
                    zzedVar3.zzM(i10);
                    if (iZzg3 == 1937011815) {
                        zzclVarZzb = zzalk.zzb(strZzC);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceZza = zzalk.zza(null, strZzC.trim(), Collections.emptyList());
                    }
                    iZzg = i9 - i10;
                }
                if (charSequenceZza == null) {
                    charSequenceZza = "";
                }
                if (zzclVarZzb != null) {
                    zzclVarZzb.zzl(charSequenceZza);
                    zzcnVarZzp = zzclVarZzb.zzp();
                } else {
                    Pattern pattern = zzalk.zza;
                    zzali zzaliVar = new zzali();
                    zzaliVar.zzc = charSequenceZza;
                    zzcnVarZzp = zzaliVar.zza().zzp();
                }
                arrayList.add(zzcnVarZzp);
            } else {
                this.zza.zzM(iZzg);
            }
        }
    }
}
