package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzala implements zzajs {
    private final zzed zza = new zzed();

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        zzcn zzp;
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
            int zzg = zzedVar2.zzg() - 8;
            if (zzedVar2.zzg() == 1987343459) {
                zzed zzedVar3 = this.zza;
                CharSequence charSequence = null;
                zzcl zzclVar = null;
                while (zzg > 0) {
                    zzcv.zze(zzg >= 8, "Incomplete vtt cue box header found.");
                    int zzg2 = zzedVar3.zzg();
                    int zzg3 = zzedVar3.zzg();
                    int i9 = zzg - 8;
                    int i10 = zzg2 - 8;
                    String zzC = zzen.zzC(zzedVar3.zzN(), zzedVar3.zzd(), i10);
                    zzedVar3.zzM(i10);
                    if (zzg3 == 1937011815) {
                        zzclVar = zzalk.zzb(zzC);
                    } else if (zzg3 == 1885436268) {
                        charSequence = zzalk.zza(null, zzC.trim(), Collections.emptyList());
                    }
                    zzg = i9 - i10;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzclVar != null) {
                    zzclVar.zzl(charSequence);
                    zzp = zzclVar.zzp();
                } else {
                    Pattern pattern = zzalk.zza;
                    zzali zzaliVar = new zzali();
                    zzaliVar.zzc = charSequence;
                    zzp = zzaliVar.zza().zzp();
                }
                arrayList.add(zzp);
            } else {
                this.zza.zzM(zzg);
            }
        }
    }
}
