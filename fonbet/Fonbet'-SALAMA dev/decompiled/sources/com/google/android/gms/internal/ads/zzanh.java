package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class zzanh implements zzamz {
    final /* synthetic */ zzani zza;
    private final zzec zzb = new zzec(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzanh(zzani zzaniVar, int i7) {
        this.zza = zzaniVar;
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzed zzedVar) {
        List list;
        SparseArray sparseArray;
        int i7;
        zzacy zzacyVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzek zzekVar;
        zzacy zzacyVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzanl zzanlVar;
        zzek zzekVar2;
        int i8;
        if (zzedVar.zzm() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzek zzekVar3 = (zzek) list.get(0);
        if ((zzedVar.zzm() & 128) != 0) {
            zzedVar.zzM(1);
            int zzq = zzedVar.zzq();
            int i9 = 3;
            zzedVar.zzM(3);
            zzedVar.zzG(this.zzb, 2);
            this.zzb.zzn(3);
            int i10 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzedVar.zzG(this.zzb, 2);
            int i11 = 4;
            this.zzb.zzn(4);
            int i12 = 12;
            zzedVar.zzM(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int zzb = zzedVar.zzb();
            while (zzb > 0) {
                int i13 = 5;
                zzedVar.zzG(this.zzb, 5);
                zzec zzecVar = this.zzb;
                int zzd = zzecVar.zzd(8);
                zzecVar.zzn(i9);
                int zzd2 = this.zzb.zzd(i10);
                this.zzb.zzn(i11);
                int zzd3 = this.zzb.zzd(i12);
                int zzd4 = zzedVar.zzd();
                int i14 = zzd4 + zzd3;
                int i15 = 0;
                String str = null;
                ArrayList arrayList = null;
                int i16 = -1;
                while (zzedVar.zzd() < i14) {
                    int zzm = zzedVar.zzm();
                    int zzd5 = zzedVar.zzd() + zzedVar.zzm();
                    if (zzd5 > i14) {
                        break;
                    }
                    if (zzm == i13) {
                        long zzu = zzedVar.zzu();
                        if (zzu != 1094921523) {
                            if (zzu != 1161904947) {
                                if (zzu != 1094921524) {
                                    if (zzu == 1212503619) {
                                        i8 = 36;
                                        zzekVar2 = zzekVar3;
                                        i16 = i8;
                                    }
                                    zzekVar2 = zzekVar3;
                                }
                                zzekVar2 = zzekVar3;
                                i16 = 172;
                            }
                            zzekVar2 = zzekVar3;
                            i16 = 135;
                        }
                        zzekVar2 = zzekVar3;
                        i16 = 129;
                    } else {
                        if (zzm != 106) {
                            if (zzm != 122) {
                                if (zzm == 127) {
                                    int zzm2 = zzedVar.zzm();
                                    if (zzm2 != 21) {
                                        if (zzm2 == 14) {
                                            i8 = 136;
                                        } else {
                                            if (zzm2 == 33) {
                                                i8 = 139;
                                            }
                                            zzekVar2 = zzekVar3;
                                        }
                                    }
                                    zzekVar2 = zzekVar3;
                                    i16 = 172;
                                } else if (zzm == 123) {
                                    i8 = 138;
                                } else if (zzm == 10) {
                                    String trim = zzedVar.zzB(i9, StandardCharsets.UTF_8).trim();
                                    i15 = zzedVar.zzm();
                                    zzekVar2 = zzekVar3;
                                    str = trim;
                                } else if (zzm == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzedVar.zzd() < zzd5) {
                                        String trim2 = zzedVar.zzB(i9, StandardCharsets.UTF_8).trim();
                                        int zzm3 = zzedVar.zzm();
                                        zzek zzekVar4 = zzekVar3;
                                        byte[] bArr = new byte[i11];
                                        zzedVar.zzH(bArr, 0, i11);
                                        arrayList2.add(new zzanj(trim2, zzm3, bArr));
                                        zzekVar3 = zzekVar4;
                                        i9 = 3;
                                        i11 = 4;
                                    }
                                    zzekVar2 = zzekVar3;
                                    arrayList = arrayList2;
                                    i16 = 89;
                                } else {
                                    zzekVar2 = zzekVar3;
                                    if (zzm == 111) {
                                        i16 = 257;
                                    }
                                }
                                zzekVar2 = zzekVar3;
                                i16 = i8;
                            }
                            zzekVar2 = zzekVar3;
                            i16 = 135;
                        }
                        zzekVar2 = zzekVar3;
                        i16 = 129;
                    }
                    zzedVar.zzM(zzd5 - zzedVar.zzd());
                    zzekVar3 = zzekVar2;
                    i9 = 3;
                    i11 = 4;
                    i13 = 5;
                }
                zzek zzekVar5 = zzekVar3;
                zzedVar.zzL(i14);
                zzank zzankVar = new zzank(i16, str, i15, arrayList, Arrays.copyOfRange(zzedVar.zzN(), zzd4, i14));
                if (zzd == 6 || zzd == 5) {
                    zzd = zzankVar.zza;
                }
                zzb -= zzd3 + 5;
                sparseBooleanArray3 = this.zza.zzh;
                if (!sparseBooleanArray3.get(zzd2)) {
                    zzanlVar = this.zza.zze;
                    zzann zzb2 = zzanlVar.zzb(zzd, zzankVar);
                    this.zzd.put(zzd2, zzd2);
                    this.zzc.put(zzd2, zzb2);
                }
                zzekVar3 = zzekVar5;
                i9 = 3;
                i11 = 4;
                i12 = 12;
                i10 = 13;
            }
            zzek zzekVar6 = zzekVar3;
            int size = this.zzd.size();
            int i17 = 0;
            while (i17 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzani zzaniVar = this.zza;
                int keyAt = sparseIntArray.keyAt(i17);
                int valueAt = sparseIntArray.valueAt(i17);
                sparseBooleanArray = zzaniVar.zzh;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.zza.zzi;
                sparseBooleanArray2.put(valueAt, true);
                zzann zzannVar = (zzann) this.zzc.valueAt(i17);
                if (zzannVar != null) {
                    zzacyVar2 = this.zza.zzl;
                    zzanm zzanmVar = new zzanm(zzq, keyAt, 8192);
                    zzekVar = zzekVar6;
                    zzannVar.zzb(zzekVar, zzacyVar2, zzanmVar);
                    sparseArray2 = this.zza.zzg;
                    sparseArray2.put(valueAt, zzannVar);
                } else {
                    zzekVar = zzekVar6;
                }
                i17++;
                zzekVar6 = zzekVar;
            }
            zzani zzaniVar2 = this.zza;
            int i18 = this.zze;
            sparseArray = zzaniVar2.zzg;
            sparseArray.remove(i18);
            this.zza.zzm = 0;
            zzani zzaniVar3 = this.zza;
            i7 = zzaniVar3.zzm;
            if (i7 == 0) {
                zzacyVar = zzaniVar3.zzl;
                zzacyVar.zzG();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
    }
}
