package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzarp implements zzarh {
    final /* synthetic */ zzarr zza;
    private final zzet zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzarp(zzarr zzarrVar, int i) {
        Objects.requireNonNull(zzarrVar);
        this.zza = zzarrVar;
        this.zzb = new zzet(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zzb(zzeu zzeuVar) {
        zzfj zzfjVar;
        int i;
        zzfj zzfjVar2;
        int i2;
        zzet zzetVar;
        int i3;
        if (zzeuVar.zzs() == 2) {
            zzarr zzarrVar = this.zza;
            zzfj zzfjVar3 = (zzfj) zzarrVar.zzh().get(0);
            if ((zzeuVar.zzs() & 128) != 0) {
                zzeuVar.zzk(1);
                int zzt = zzeuVar.zzt();
                int i4 = 3;
                zzeuVar.zzk(3);
                zzet zzetVar2 = this.zzb;
                zzeuVar.zzl(zzetVar2, 2);
                zzetVar2.zzh(3);
                int i5 = 13;
                zzarrVar.zzq(zzetVar2.zzj(13));
                zzeuVar.zzl(zzetVar2, 2);
                int i6 = 4;
                zzetVar2.zzh(4);
                int i7 = 12;
                zzeuVar.zzk(zzetVar2.zzj(12));
                SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int zzd = zzeuVar.zzd();
                while (zzd > 0) {
                    int i8 = 5;
                    zzeuVar.zzl(zzetVar2, 5);
                    int zzj = zzetVar2.zzj(8);
                    zzetVar2.zzh(i4);
                    int zzj2 = zzetVar2.zzj(i5);
                    zzetVar2.zzh(i6);
                    int zzj3 = zzetVar2.zzj(i7);
                    int zzg = zzeuVar.zzg();
                    int i9 = zzg + zzj3;
                    String str = null;
                    ArrayList arrayList = null;
                    int i10 = -1;
                    int i11 = 0;
                    while (zzeuVar.zzg() < i9) {
                        int zzs = zzeuVar.zzs();
                        int zzg2 = zzeuVar.zzg() + zzeuVar.zzs();
                        if (zzg2 > i9) {
                            break;
                        }
                        if (zzs == i8) {
                            long zzz = zzeuVar.zzz();
                            if (zzz != 1094921523) {
                                if (zzz != 1161904947) {
                                    if (zzz != 1094921524) {
                                        if (zzz == 1212503619) {
                                            i3 = 36;
                                            i10 = i3;
                                        }
                                        zzfjVar2 = zzfjVar3;
                                        i2 = zzt;
                                        zzetVar = zzetVar2;
                                    }
                                    zzfjVar2 = zzfjVar3;
                                    i2 = zzt;
                                    zzetVar = zzetVar2;
                                    i10 = 172;
                                }
                                zzfjVar2 = zzfjVar3;
                                i2 = zzt;
                                zzetVar = zzetVar2;
                                i10 = 135;
                            }
                            zzfjVar2 = zzfjVar3;
                            i2 = zzt;
                            zzetVar = zzetVar2;
                            i10 = 129;
                        } else {
                            if (zzs != 106) {
                                if (zzs != 122) {
                                    if (zzs == 127) {
                                        int zzs2 = zzeuVar.zzs();
                                        if (zzs2 != 21) {
                                            if (zzs2 == 14) {
                                                i3 = 136;
                                            } else {
                                                if (zzs2 == 33) {
                                                    i3 = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                                                }
                                                zzfjVar2 = zzfjVar3;
                                                i2 = zzt;
                                                zzetVar = zzetVar2;
                                            }
                                            i10 = i3;
                                            zzfjVar2 = zzfjVar3;
                                            i2 = zzt;
                                            zzetVar = zzetVar2;
                                        }
                                        zzfjVar2 = zzfjVar3;
                                        i2 = zzt;
                                        zzetVar = zzetVar2;
                                        i10 = 172;
                                    } else if (zzs == 123) {
                                        i3 = 138;
                                        i10 = i3;
                                        zzfjVar2 = zzfjVar3;
                                        i2 = zzt;
                                        zzetVar = zzetVar2;
                                    } else if (zzs == 10) {
                                        String trim = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        i11 = zzeuVar.zzs();
                                        str = trim;
                                        zzfjVar2 = zzfjVar3;
                                        i2 = zzt;
                                        zzetVar = zzetVar2;
                                    } else {
                                        if (zzs == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (zzeuVar.zzg() < zzg2) {
                                                zzet zzetVar3 = zzetVar2;
                                                String trim2 = zzeuVar.zzK(3, StandardCharsets.UTF_8).trim();
                                                int zzs3 = zzeuVar.zzs();
                                                zzfj zzfjVar4 = zzfjVar3;
                                                byte[] bArr = new byte[4];
                                                zzeuVar.zzm(bArr, 0, 4);
                                                arrayList2.add(new zzars(trim2, zzs3, bArr));
                                                zzfjVar3 = zzfjVar4;
                                                zzetVar2 = zzetVar3;
                                                zzt = zzt;
                                            }
                                            zzfjVar2 = zzfjVar3;
                                            i2 = zzt;
                                            zzetVar = zzetVar2;
                                            arrayList = arrayList2;
                                            i10 = 89;
                                        } else {
                                            zzfjVar2 = zzfjVar3;
                                            i2 = zzt;
                                            zzetVar = zzetVar2;
                                            if (zzs == 111) {
                                                i10 = 257;
                                            }
                                        }
                                        zzeuVar.zzk(zzg2 - zzeuVar.zzg());
                                        zzfjVar3 = zzfjVar2;
                                        zzetVar2 = zzetVar;
                                        zzt = i2;
                                        i8 = 5;
                                    }
                                }
                                zzfjVar2 = zzfjVar3;
                                i2 = zzt;
                                zzetVar = zzetVar2;
                                i10 = 135;
                            }
                            zzfjVar2 = zzfjVar3;
                            i2 = zzt;
                            zzetVar = zzetVar2;
                            i10 = 129;
                        }
                        zzeuVar.zzk(zzg2 - zzeuVar.zzg());
                        zzfjVar3 = zzfjVar2;
                        zzetVar2 = zzetVar;
                        zzt = i2;
                        i8 = 5;
                    }
                    zzfj zzfjVar5 = zzfjVar3;
                    int i12 = zzt;
                    zzet zzetVar4 = zzetVar2;
                    zzeuVar.zzh(i9);
                    zzart zzartVar = new zzart(i10, str, i11, arrayList, Arrays.copyOfRange(zzeuVar.zzi(), zzg, i9));
                    if (zzj == 6 || zzj == 5) {
                        zzj = zzartVar.zza;
                    }
                    zzd -= zzj3 + 5;
                    if (!zzarrVar.zzk().get(zzj2)) {
                        zzarw zzb = zzarrVar.zzi().zzb(zzj, zzartVar);
                        sparseIntArray.put(zzj2, zzj2);
                        sparseArray.put(zzj2, zzb);
                    }
                    i6 = 4;
                    zzfjVar3 = zzfjVar5;
                    zzetVar2 = zzetVar4;
                    zzt = i12;
                    i4 = 3;
                    i5 = 13;
                    i7 = 12;
                }
                zzfj zzfjVar6 = zzfjVar3;
                int i13 = zzt;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    zzarrVar.zzk().put(keyAt, true);
                    zzarrVar.zzl().put(valueAt, true);
                    zzarw zzarwVar = (zzarw) sparseArray.valueAt(i14);
                    if (zzarwVar != null) {
                        i = i13;
                        zzfjVar = zzfjVar6;
                        zzarwVar.zza(zzfjVar, zzarrVar.zzm(), new zzarv(i, keyAt, 8192));
                        zzarrVar.zzj().put(valueAt, zzarwVar);
                    } else {
                        zzfjVar = zzfjVar6;
                        i = i13;
                    }
                    i14++;
                    zzfjVar6 = zzfjVar;
                    i13 = i;
                }
                zzarrVar.zzj().remove(this.zze);
                zzarrVar.zzo(0);
                if (zzarrVar.zzn() == 0) {
                    zzarrVar.zzm().zzv();
                    zzarrVar.zzp(true);
                }
            }
        }
    }
}
