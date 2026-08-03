package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzarb implements com.google.android.gms.internal.ads.zzaqt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzard zza;
    private final com.google.android.gms.internal.ads.zzes zzb;
    private final android.util.SparseArray zzc;
    private final android.util.SparseIntArray zzd;
    private final int zze;

    public zzarb(com.google.android.gms.internal.ads.zzard zzardVar, int i) {
        java.util.Objects.requireNonNull(zzardVar);
        this.zza = zzardVar;
        this.zzb = new com.google.android.gms.internal.ads.zzes(new byte[5], 5);
        this.zzc = new android.util.SparseArray();
        this.zzd = new android.util.SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zza(com.google.android.gms.internal.ads.zzfi zzfiVar, com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        com.google.android.gms.internal.ads.zzfi zzfiVar;
        int i;
        com.google.android.gms.internal.ads.zzfi zzfiVar2;
        int i2;
        com.google.android.gms.internal.ads.zzes zzesVar;
        if (zzetVar.zzs() == 2) {
            com.google.android.gms.internal.ads.zzard zzardVar = this.zza;
            com.google.android.gms.internal.ads.zzfi zzfiVar3 = (com.google.android.gms.internal.ads.zzfi) zzardVar.zzh().get(0);
            if ((zzetVar.zzs() & 128) != 0) {
                zzetVar.zzk(1);
                int zzt = zzetVar.zzt();
                int i3 = 3;
                zzetVar.zzk(3);
                com.google.android.gms.internal.ads.zzes zzesVar2 = this.zzb;
                zzetVar.zzl(zzesVar2, 2);
                zzesVar2.zzh(3);
                int i4 = 13;
                zzardVar.zzq(zzesVar2.zzj(13));
                zzetVar.zzl(zzesVar2, 2);
                int i5 = 4;
                zzesVar2.zzh(4);
                int i6 = 12;
                zzetVar.zzk(zzesVar2.zzj(12));
                android.util.SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                android.util.SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int zzd = zzetVar.zzd();
                while (zzd > 0) {
                    int i7 = 5;
                    zzetVar.zzl(zzesVar2, 5);
                    int zzj = zzesVar2.zzj(8);
                    zzesVar2.zzh(i3);
                    int zzj2 = zzesVar2.zzj(i4);
                    zzesVar2.zzh(i5);
                    int zzj3 = zzesVar2.zzj(i6);
                    int zzg = zzetVar.zzg();
                    int i8 = zzg + zzj3;
                    java.lang.String str = null;
                    java.util.ArrayList arrayList = null;
                    int i9 = -1;
                    int i10 = 0;
                    while (zzetVar.zzg() < i8) {
                        int zzs = zzetVar.zzs();
                        int zzg2 = zzetVar.zzg() + zzetVar.zzs();
                        if (zzg2 > i8) {
                            break;
                        }
                        if (zzs == i7) {
                            long zzz = zzetVar.zzz();
                            if (zzz != 1094921523) {
                                if (zzz != 1161904947) {
                                    if (zzz != 1094921524) {
                                        if (zzz == 1212503619) {
                                            zzfiVar2 = zzfiVar3;
                                            i2 = zzt;
                                            zzesVar = zzesVar2;
                                            i9 = 36;
                                        }
                                        zzfiVar2 = zzfiVar3;
                                        i2 = zzt;
                                        zzesVar = zzesVar2;
                                    }
                                    zzfiVar2 = zzfiVar3;
                                    i2 = zzt;
                                    zzesVar = zzesVar2;
                                    i9 = 172;
                                }
                                zzfiVar2 = zzfiVar3;
                                i2 = zzt;
                                zzesVar = zzesVar2;
                                i9 = 135;
                            }
                            zzfiVar2 = zzfiVar3;
                            i2 = zzt;
                            zzesVar = zzesVar2;
                            i9 = 129;
                        } else {
                            if (zzs != 106) {
                                if (zzs != 122) {
                                    if (zzs == 127) {
                                        int zzs2 = zzetVar.zzs();
                                        if (zzs2 != 21) {
                                            if (zzs2 == 14) {
                                                zzfiVar2 = zzfiVar3;
                                                i2 = zzt;
                                                zzesVar = zzesVar2;
                                                i9 = 136;
                                            } else {
                                                if (zzs2 == 33) {
                                                    zzfiVar2 = zzfiVar3;
                                                    i2 = zzt;
                                                    zzesVar = zzesVar2;
                                                    i9 = androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                                                }
                                                zzfiVar2 = zzfiVar3;
                                                i2 = zzt;
                                                zzesVar = zzesVar2;
                                            }
                                        }
                                        zzfiVar2 = zzfiVar3;
                                        i2 = zzt;
                                        zzesVar = zzesVar2;
                                        i9 = 172;
                                    } else if (zzs == 123) {
                                        zzfiVar2 = zzfiVar3;
                                        i2 = zzt;
                                        zzesVar = zzesVar2;
                                        i9 = 138;
                                    } else if (zzs == 10) {
                                        java.lang.String trim = zzetVar.zzK(3, java.nio.charset.StandardCharsets.UTF_8).trim();
                                        i10 = zzetVar.zzs();
                                        str = trim;
                                        zzfiVar2 = zzfiVar3;
                                        i2 = zzt;
                                        zzesVar = zzesVar2;
                                    } else if (zzs == 89) {
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        while (zzetVar.zzg() < zzg2) {
                                            com.google.android.gms.internal.ads.zzes zzesVar3 = zzesVar2;
                                            java.lang.String trim2 = zzetVar.zzK(3, java.nio.charset.StandardCharsets.UTF_8).trim();
                                            int zzs3 = zzetVar.zzs();
                                            com.google.android.gms.internal.ads.zzfi zzfiVar4 = zzfiVar3;
                                            byte[] bArr = new byte[4];
                                            zzetVar.zzm(bArr, 0, 4);
                                            arrayList2.add(new com.google.android.gms.internal.ads.zzare(trim2, zzs3, bArr));
                                            zzfiVar3 = zzfiVar4;
                                            zzesVar2 = zzesVar3;
                                            zzt = zzt;
                                        }
                                        zzfiVar2 = zzfiVar3;
                                        i2 = zzt;
                                        zzesVar = zzesVar2;
                                        arrayList = arrayList2;
                                        i9 = 89;
                                    } else {
                                        zzfiVar2 = zzfiVar3;
                                        i2 = zzt;
                                        zzesVar = zzesVar2;
                                        if (zzs == 111) {
                                            i9 = 257;
                                        }
                                    }
                                }
                                zzfiVar2 = zzfiVar3;
                                i2 = zzt;
                                zzesVar = zzesVar2;
                                i9 = 135;
                            }
                            zzfiVar2 = zzfiVar3;
                            i2 = zzt;
                            zzesVar = zzesVar2;
                            i9 = 129;
                        }
                        zzetVar.zzk(zzg2 - zzetVar.zzg());
                        zzfiVar3 = zzfiVar2;
                        zzesVar2 = zzesVar;
                        zzt = i2;
                        i7 = 5;
                    }
                    com.google.android.gms.internal.ads.zzfi zzfiVar5 = zzfiVar3;
                    int i11 = zzt;
                    com.google.android.gms.internal.ads.zzes zzesVar4 = zzesVar2;
                    zzetVar.zzh(i8);
                    com.google.android.gms.internal.ads.zzarf zzarfVar = new com.google.android.gms.internal.ads.zzarf(i9, str, i10, arrayList, java.util.Arrays.copyOfRange(zzetVar.zzi(), zzg, i8));
                    if (zzj == 6 || zzj == 5) {
                        zzj = zzarfVar.zza;
                    }
                    zzd -= zzj3 + 5;
                    if (!zzardVar.zzk().get(zzj2)) {
                        com.google.android.gms.internal.ads.zzari zzb = zzardVar.zzi().zzb(zzj, zzarfVar);
                        sparseIntArray.put(zzj2, zzj2);
                        sparseArray.put(zzj2, zzb);
                    }
                    zzfiVar3 = zzfiVar5;
                    zzesVar2 = zzesVar4;
                    zzt = i11;
                    i5 = 4;
                    i3 = 3;
                    i4 = 13;
                    i6 = 12;
                }
                com.google.android.gms.internal.ads.zzfi zzfiVar6 = zzfiVar3;
                int i12 = zzt;
                int size = sparseIntArray.size();
                int i13 = 0;
                while (i13 < size) {
                    int keyAt = sparseIntArray.keyAt(i13);
                    int valueAt = sparseIntArray.valueAt(i13);
                    zzardVar.zzk().put(keyAt, true);
                    zzardVar.zzl().put(valueAt, true);
                    com.google.android.gms.internal.ads.zzari zzariVar = (com.google.android.gms.internal.ads.zzari) sparseArray.valueAt(i13);
                    if (zzariVar != null) {
                        i = i12;
                        zzfiVar = zzfiVar6;
                        zzariVar.zza(zzfiVar, zzardVar.zzm(), new com.google.android.gms.internal.ads.zzarh(i, keyAt, 8192));
                        zzardVar.zzj().put(valueAt, zzariVar);
                    } else {
                        zzfiVar = zzfiVar6;
                        i = i12;
                    }
                    i13++;
                    zzfiVar6 = zzfiVar;
                    i12 = i;
                }
                zzardVar.zzj().remove(this.zze);
                zzardVar.zzo(0);
                if (zzardVar.zzn() == 0) {
                    zzardVar.zzm().zzv();
                    zzardVar.zzp(true);
                }
            }
        }
    }
}
