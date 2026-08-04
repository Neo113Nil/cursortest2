package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:19:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzed zzedVar) {
        zzek zzekVar;
        zzek zzekVar2;
        int i7;
        if (zzedVar.zzm() != 2) {
            return;
        }
        zzek zzekVar3 = (zzek) this.zza.zzb.get(0);
        if ((zzedVar.zzm() & 128) != 0) {
            zzedVar.zzM(1);
            int iZzq = zzedVar.zzq();
            int i8 = 3;
            zzedVar.zzM(3);
            zzedVar.zzG(this.zzb, 2);
            this.zzb.zzn(3);
            int i9 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzedVar.zzG(this.zzb, 2);
            int i10 = 4;
            this.zzb.zzn(4);
            int i11 = 12;
            zzedVar.zzM(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int iZzb = zzedVar.zzb();
            while (iZzb > 0) {
                int i12 = 5;
                zzedVar.zzG(this.zzb, 5);
                zzec zzecVar = this.zzb;
                int iZzd = zzecVar.zzd(8);
                zzecVar.zzn(i8);
                int iZzd2 = this.zzb.zzd(i9);
                this.zzb.zzn(i10);
                int iZzd3 = this.zzb.zzd(i11);
                int iZzd4 = zzedVar.zzd();
                int i13 = iZzd4 + iZzd3;
                int iZzm = 0;
                String str = null;
                ArrayList arrayList = null;
                int i14 = -1;
                while (zzedVar.zzd() < i13) {
                    int iZzm2 = zzedVar.zzm();
                    int iZzd5 = zzedVar.zzd() + zzedVar.zzm();
                    if (iZzd5 > i13) {
                        break;
                    }
                    if (iZzm2 == i12) {
                        long jZzu = zzedVar.zzu();
                        if (jZzu == 1094921523) {
                            zzekVar2 = zzekVar3;
                            i14 = 129;
                        } else if (jZzu == 1161904947) {
                            zzekVar2 = zzekVar3;
                            i14 = 135;
                        } else if (jZzu == 1094921524) {
                            zzekVar2 = zzekVar3;
                            i14 = 172;
                        } else if (jZzu == 1212503619) {
                            i7 = 36;
                            zzekVar2 = zzekVar3;
                            i14 = i7;
                        } else {
                            zzekVar2 = zzekVar3;
                        }
                    } else if (iZzm2 == 106) {
                        zzekVar2 = zzekVar3;
                        i14 = 129;
                    } else if (iZzm2 == 122) {
                        zzekVar2 = zzekVar3;
                        i14 = 135;
                    } else {
                        if (iZzm2 == 127) {
                            int iZzm3 = zzedVar.zzm();
                            if (iZzm3 == 21) {
                                zzekVar2 = zzekVar3;
                                i14 = 172;
                            } else if (iZzm3 == 14) {
                                i7 = 136;
                            } else if (iZzm3 == 33) {
                                i7 = 139;
                            } else {
                                zzekVar2 = zzekVar3;
                            }
                        } else if (iZzm2 == 123) {
                            i7 = 138;
                        } else if (iZzm2 == 10) {
                            String strTrim = zzedVar.zzB(i8, StandardCharsets.UTF_8).trim();
                            iZzm = zzedVar.zzm();
                            zzekVar2 = zzekVar3;
                            str = strTrim;
                        } else if (iZzm2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzedVar.zzd() < iZzd5) {
                                String strTrim2 = zzedVar.zzB(i8, StandardCharsets.UTF_8).trim();
                                int iZzm4 = zzedVar.zzm();
                                zzek zzekVar4 = zzekVar3;
                                byte[] bArr = new byte[i10];
                                zzedVar.zzH(bArr, 0, i10);
                                arrayList2.add(new zzanj(strTrim2, iZzm4, bArr));
                                zzekVar3 = zzekVar4;
                                i8 = 3;
                                i10 = 4;
                            }
                            zzekVar2 = zzekVar3;
                            arrayList = arrayList2;
                            i14 = 89;
                        } else {
                            zzekVar2 = zzekVar3;
                            if (iZzm2 == 111) {
                                i14 = 257;
                            }
                        }
                        zzekVar2 = zzekVar3;
                        i14 = i7;
                    }
                    zzedVar.zzM(iZzd5 - zzedVar.zzd());
                    zzekVar3 = zzekVar2;
                    i8 = 3;
                    i10 = 4;
                    i12 = 5;
                }
                zzek zzekVar5 = zzekVar3;
                zzedVar.zzL(i13);
                zzank zzankVar = new zzank(i14, str, iZzm, arrayList, Arrays.copyOfRange(zzedVar.zzN(), iZzd4, i13));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzankVar.zza;
                }
                iZzb -= iZzd3 + 5;
                if (!this.zza.zzh.get(iZzd2)) {
                    zzann zzannVarZzb = this.zza.zze.zzb(iZzd, zzankVar);
                    this.zzd.put(iZzd2, iZzd2);
                    this.zzc.put(iZzd2, zzannVarZzb);
                }
                zzekVar3 = zzekVar5;
                i8 = 3;
                i10 = 4;
                i11 = 12;
                i9 = 13;
            }
            zzek zzekVar6 = zzekVar3;
            int size = this.zzd.size();
            int i15 = 0;
            while (i15 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzani zzaniVar = this.zza;
                int iKeyAt = sparseIntArray.keyAt(i15);
                int iValueAt = sparseIntArray.valueAt(i15);
                zzaniVar.zzh.put(iKeyAt, true);
                this.zza.zzi.put(iValueAt, true);
                zzann zzannVar = (zzann) this.zzc.valueAt(i15);
                if (zzannVar != null) {
                    zzacy zzacyVar = this.zza.zzl;
                    zzanm zzanmVar = new zzanm(iZzq, iKeyAt, 8192);
                    zzekVar = zzekVar6;
                    zzannVar.zzb(zzekVar, zzacyVar, zzanmVar);
                    this.zza.zzg.put(iValueAt, zzannVar);
                } else {
                    zzekVar = zzekVar6;
                }
                i15++;
                zzekVar6 = zzekVar;
            }
            this.zza.zzg.remove(this.zze);
            this.zza.zzm = 0;
            zzani zzaniVar2 = this.zza;
            if (zzaniVar2.zzm == 0) {
                zzaniVar2.zzl.zzG();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
    }
}
