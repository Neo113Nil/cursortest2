package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzyk extends zzyn {
    public abstract Pair zzd(zzyj zzyjVar, int[][][] iArr, int[] iArr2, zzuq zzuqVar, zzbn zzbnVar);

    @Override // com.google.android.gms.internal.ads.zzyn
    public final zzyo zzo(zzlp[] zzlpVarArr, zzwv zzwvVar, zzuq zzuqVar, zzbn zzbnVar) {
        boolean z4;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbo[][] zzboVarArr = new zzbo[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = zzwvVar.zzb;
            zzboVarArr[i7] = new zzbo[i8];
            iArr3[i7] = new int[i8][];
        }
        int i9 = 2;
        int[] iArr4 = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr4[i10] = zzlpVarArr[i10].zze();
        }
        int i11 = 0;
        while (i11 < zzwvVar.zzb) {
            zzbo zzb = zzwvVar.zzb(i11);
            int i12 = zzb.zzc;
            int i13 = i9;
            int i14 = 0;
            int i15 = 0;
            boolean z7 = true;
            while (i14 < i9) {
                zzlp zzlpVar = zzlpVarArr[i14];
                int i16 = 0;
                for (int i17 = 0; i17 < zzb.zza; i17++) {
                    i16 = Math.max(i16, zzlpVar.zzY(zzb.zzb(i17)) & 7);
                }
                boolean z8 = iArr2[i14] == 0;
                if (i16 > i15) {
                    z7 = z8;
                    i13 = i14;
                    i15 = i16;
                } else if (i16 == i15 && i12 == 5 && !z7 && z8) {
                    i13 = i14;
                    i15 = i16;
                    z7 = true;
                }
                i14++;
                i9 = 2;
            }
            if (i13 == i9) {
                iArr = new int[zzb.zza];
            } else {
                zzlp zzlpVar2 = zzlpVarArr[i13];
                int[] iArr5 = new int[zzb.zza];
                for (int i18 = 0; i18 < zzb.zza; i18++) {
                    iArr5[i18] = zzlpVar2.zzY(zzb.zzb(i18));
                }
                iArr = iArr5;
            }
            int i19 = iArr2[i13];
            zzboVarArr[i13][i19] = zzb;
            iArr3[i13][i19] = iArr;
            iArr2[i13] = i19 + 1;
            i11++;
            i9 = 2;
        }
        int i20 = i9;
        boolean z9 = true;
        zzwv[] zzwvVarArr = new zzwv[i20];
        String[] strArr = new String[i20];
        int[] iArr6 = new int[i20];
        int i21 = 0;
        while (i21 < i20) {
            int i22 = iArr2[i21];
            zzwvVarArr[i21] = new zzwv((zzbo[]) zzen.zzP(zzboVarArr[i21], i22));
            iArr3[i21] = (int[][]) zzen.zzP(iArr3[i21], i22);
            strArr[i21] = zzlpVarArr[i21].zzU();
            iArr6[i21] = zzlpVarArr[i21].zzb();
            i21++;
            i20 = 2;
        }
        int i23 = i20;
        zzyj zzyjVar = new zzyj(strArr, iArr6, zzwvVarArr, iArr4, iArr3, new zzwv((zzbo[]) zzen.zzP(zzboVarArr[i23], iArr2[i23])));
        Pair zzd = zzd(zzyjVar, iArr3, iArr4, zzuqVar, zzbnVar);
        zzyl[] zzylVarArr = (zzyl[]) zzd.second;
        List[] listArr = new List[zzylVarArr.length];
        for (int i24 = 0; i24 < zzylVarArr.length; i24++) {
            zzyl zzylVar = zzylVarArr[i24];
            listArr[i24] = zzylVar != null ? zzfwh.zzo(zzylVar) : zzfwh.zzn();
        }
        zzfwe zzfweVar = new zzfwe();
        int i25 = 0;
        for (int i26 = 2; i25 < i26; i26 = 2) {
            zzwv zzd2 = zzyjVar.zzd(i25);
            List list = listArr[i25];
            int i27 = 0;
            while (i27 < zzd2.zzb) {
                zzbo zzb2 = zzd2.zzb(i27);
                boolean z10 = zzyjVar.zza(i25, i27, false) != 0 ? z9 : false;
                int i28 = zzb2.zza;
                int[] iArr7 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < zzb2.zza; i29++) {
                    iArr7[i29] = zzyjVar.zzb(i25, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z4 = false;
                            break;
                        }
                        zzyl zzylVar2 = (zzyl) list.get(i30);
                        if (zzylVar2.zzg().equals(zzb2) && zzylVar2.zzc(i29) != -1) {
                            z4 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z4;
                }
                zzfweVar.zzf(new zzbu(zzb2, z10, iArr7, zArr));
                i27++;
                z9 = true;
            }
            i25++;
            z9 = true;
        }
        zzwv zze = zzyjVar.zze();
        for (int i31 = 0; i31 < zze.zzb; i31++) {
            zzbo zzb3 = zze.zzb(i31);
            int[] iArr8 = new int[zzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfweVar.zzf(new zzbu(zzb3, false, iArr8, new boolean[zzb3.zza]));
        }
        return new zzyo((zzlq[]) zzd.first, (zzyh[]) zzd.second, new zzbv(zzfweVar.zzi()), zzyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void zzp(Object obj) {
    }
}
