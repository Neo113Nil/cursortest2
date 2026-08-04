package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzabz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzabz(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f7, String str) {
        this.zza = list;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = i13;
        this.zzi = i14;
        this.zzj = i15;
        this.zzk = f7;
        this.zzl = str;
    }

    public static zzabz zza(zzed zzedVar) throws zzaz {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String strZzc;
        float f7;
        try {
            zzedVar.zzM(4);
            int iZzm = (zzedVar.zzm() & 3) + 1;
            if (iZzm == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = zzedVar.zzm() & 31;
            for (int i15 = 0; i15 < iZzm2; i15++) {
                arrayList.add(zzb(zzedVar));
            }
            int iZzm3 = zzedVar.zzm();
            for (int i16 = 0; i16 < iZzm3; i16++) {
                arrayList.add(zzb(zzedVar));
            }
            if (iZzm2 > 0) {
                zzfi zzfiVarZzg = zzfj.zzg((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i17 = zzfiVarZzg.zze;
                int i18 = zzfiVarZzg.zzf;
                int i19 = zzfiVarZzg.zzh + 8;
                int i20 = zzfiVarZzg.zzi + 8;
                int i21 = zzfiVarZzg.zzj;
                int i22 = zzfiVarZzg.zzk;
                int i23 = zzfiVarZzg.zzl;
                int i24 = zzfiVarZzg.zzm;
                float f8 = zzfiVarZzg.zzg;
                strZzc = zzda.zzc(zzfiVarZzg.zza, zzfiVarZzg.zzb, zzfiVarZzg.zzc);
                i13 = i23;
                i14 = i24;
                f7 = f8;
                i10 = i20;
                i11 = i21;
                i12 = i22;
                i7 = i17;
                i8 = i18;
                i9 = i19;
            } else {
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                strZzc = null;
                f7 = 1.0f;
            }
            return new zzabz(arrayList, iZzm, i7, i8, i9, i10, i11, i12, i13, i14, f7, strZzc);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw zzaz.zza("Error parsing AVC config", e7);
        }
    }

    private static byte[] zzb(zzed zzedVar) {
        int iZzq = zzedVar.zzq();
        int iZzd = zzedVar.zzd();
        zzedVar.zzM(iZzq);
        return zzda.zze(zzedVar.zzN(), iZzd, iZzq);
    }
}
