package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzaji extends zzajg {
    private zzajh zza;
    private int zzb;
    private boolean zzc;
    private zzaeg zzd;
    private zzaee zze;

    @Override // com.google.android.gms.internal.ads.zzajg
    public final long zza(zzed zzedVar) {
        if ((zzedVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b7 = zzedVar.zzN()[0];
        zzajh zzajhVar = this.zza;
        zzcv.zzb(zzajhVar);
        int i7 = !zzajhVar.zzd[(b7 >> 1) & (255 >>> (8 - zzajhVar.zze))].zza ? zzajhVar.zza.zze : zzajhVar.zza.zzf;
        int i8 = this.zzc ? (this.zzb + i7) / 4 : 0;
        if (zzedVar.zzc() < zzedVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzedVar.zzN(), zzedVar.zze() + 4);
            zzedVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzedVar.zzK(zzedVar.zze() + 4);
        }
        long j = i8;
        byte[] bArrZzN = zzedVar.zzN();
        bArrZzN[zzedVar.zze() - 4] = (byte) (j & 255);
        bArrZzN[zzedVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzN[zzedVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzN[zzedVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i7;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzb(boolean z4) {
        super.zzb(z4);
        if (z4) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03ba  */
    @Override // com.google.android.gms.internal.ads.zzajg
    public final boolean zzc(zzed zzedVar, long j, zzajd zzajdVar) throws zzaz {
        zzajh zzajhVar;
        int i7;
        int iZzb;
        int i8;
        int i9;
        if (this.zza != null) {
            zzajdVar.zza.getClass();
            return false;
        }
        zzaeg zzaegVar = this.zzd;
        int i10 = 4;
        if (zzaegVar != null) {
            zzaee zzaeeVar = this.zze;
            if (zzaeeVar == null) {
                this.zze = zzaeh.zzc(zzedVar, true, true);
            } else {
                byte[] bArr = new byte[zzedVar.zze()];
                System.arraycopy(zzedVar.zzN(), 0, bArr, 0, zzedVar.zze());
                int i11 = zzaegVar.zza;
                int i12 = 5;
                zzaeh.zzd(5, zzedVar, false);
                int iZzm = zzedVar.zzm() + 1;
                zzaed zzaedVar = new zzaed(zzedVar.zzN());
                zzaedVar.zzc(zzedVar.zzd() * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = 16;
                    if (i13 >= iZzm) {
                        zzaeg zzaegVar2 = zzaegVar;
                        int i16 = 6;
                        int iZzb2 = zzaedVar.zzb(6) + 1;
                        for (int i17 = 0; i17 < iZzb2; i17++) {
                            if (zzaedVar.zzb(16) != 0) {
                                throw zzaz.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i18 = 1;
                        int iZzb3 = zzaedVar.zzb(6) + 1;
                        int i19 = 0;
                        while (true) {
                            int i20 = 3;
                            if (i19 >= iZzb3) {
                                int i21 = 1;
                                int iZzb4 = zzaedVar.zzb(i16) + 1;
                                int i22 = 0;
                                while (i22 < iZzb4) {
                                    if (zzaedVar.zzb(16) > 2) {
                                        throw zzaz.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    int iZzb5 = zzaedVar.zzb(i16) + i21;
                                    int i23 = 8;
                                    zzaedVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i24 = 0; i24 < iZzb5; i24++) {
                                        iArr[i24] = ((zzaedVar.zzd() ? zzaedVar.zzb(5) : 0) * 8) + zzaedVar.zzb(3);
                                    }
                                    int i25 = 0;
                                    while (i25 < iZzb5) {
                                        int i26 = 0;
                                        while (i26 < i23) {
                                            if ((iArr[i25] & (1 << i26)) != 0) {
                                                zzaedVar.zzc(i23);
                                            }
                                            i26++;
                                            i23 = 8;
                                        }
                                        i25++;
                                        i23 = 8;
                                    }
                                    i22++;
                                    i16 = 6;
                                    i21 = 1;
                                }
                                int iZzb6 = zzaedVar.zzb(i16) + 1;
                                for (int i27 = 0; i27 < iZzb6; i27++) {
                                    int iZzb7 = zzaedVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        zzdq.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb7);
                                    } else {
                                        if (zzaedVar.zzd()) {
                                            i7 = 1;
                                            iZzb = zzaedVar.zzb(4) + 1;
                                        } else {
                                            i7 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzaedVar.zzd()) {
                                            int iZzb8 = zzaedVar.zzb(8) + i7;
                                            for (int i28 = 0; i28 < iZzb8; i28++) {
                                                int i29 = i11 - 1;
                                                zzaedVar.zzc(zzaeh.zza(i29));
                                                zzaedVar.zzc(zzaeh.zza(i29));
                                            }
                                        }
                                        if (zzaedVar.zzb(2) != 0) {
                                            throw zzaz.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i30 = 0; i30 < i11; i30++) {
                                                zzaedVar.zzc(4);
                                            }
                                        }
                                        for (int i31 = 0; i31 < iZzb; i31++) {
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzaedVar.zzb(6);
                                int i32 = iZzb9 + 1;
                                zzaef[] zzaefVarArr = new zzaef[i32];
                                for (int i33 = 0; i33 < i32; i33++) {
                                    zzaefVarArr[i33] = new zzaef(zzaedVar.zzd(), zzaedVar.zzb(16), zzaedVar.zzb(16), zzaedVar.zzb(8));
                                }
                                if (!zzaedVar.zzd()) {
                                    throw zzaz.zza("framing bit after modes not set as expected", null);
                                }
                                zzajhVar = new zzajh(zzaegVar2, zzaeeVar, bArr, zzaefVarArr, zzaeh.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzaedVar.zzb(i15);
                            if (iZzb10 == 0) {
                                i8 = iZzb3;
                                int i34 = 8;
                                zzaedVar.zzc(8);
                                zzaedVar.zzc(16);
                                zzaedVar.zzc(16);
                                zzaedVar.zzc(6);
                                zzaedVar.zzc(8);
                                int iZzb11 = zzaedVar.zzb(4) + 1;
                                int i35 = 0;
                                while (i35 < iZzb11) {
                                    zzaedVar.zzc(i34);
                                    i35++;
                                    i34 = 8;
                                }
                            } else {
                                if (iZzb10 != i18) {
                                    throw zzaz.zza("floor type greater than 1 not decodable: " + iZzb10, null);
                                }
                                int iZzb12 = zzaedVar.zzb(i12);
                                int[] iArr2 = new int[iZzb12];
                                int i36 = -1;
                                for (int i37 = 0; i37 < iZzb12; i37++) {
                                    int iZzb13 = zzaedVar.zzb(4);
                                    iArr2[i37] = iZzb13;
                                    if (iZzb13 > i36) {
                                        i36 = iZzb13;
                                    }
                                }
                                int i38 = i36 + 1;
                                int[] iArr3 = new int[i38];
                                int i39 = 0;
                                while (i39 < i38) {
                                    iArr3[i39] = zzaedVar.zzb(i20) + 1;
                                    int iZzb14 = zzaedVar.zzb(i14);
                                    if (iZzb14 > 0) {
                                        i9 = 8;
                                        zzaedVar.zzc(8);
                                    } else {
                                        i9 = 8;
                                    }
                                    int i40 = iZzb3;
                                    int i41 = 0;
                                    for (int i42 = 1; i41 < (i42 << iZzb14); i42 = 1) {
                                        zzaedVar.zzc(i9);
                                        i41++;
                                        i9 = 8;
                                    }
                                    i39++;
                                    iZzb3 = i40;
                                    i14 = 2;
                                    i20 = 3;
                                }
                                i8 = iZzb3;
                                zzaedVar.zzc(i14);
                                int iZzb15 = zzaedVar.zzb(4);
                                int i43 = 0;
                                int i44 = 0;
                                for (int i45 = 0; i45 < iZzb12; i45++) {
                                    i43 += iArr3[iArr2[i45]];
                                    while (i44 < i43) {
                                        zzaedVar.zzc(iZzb15);
                                        i44++;
                                    }
                                }
                            }
                            i19++;
                            iZzb3 = i8;
                            i16 = 6;
                            i14 = 2;
                            i15 = 16;
                            i18 = 1;
                            i12 = 5;
                        }
                    } else {
                        if (zzaedVar.zzb(24) != 5653314) {
                            throw zzaz.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaedVar.zza(), null);
                        }
                        int iZzb16 = zzaedVar.zzb(16);
                        int iZzb17 = zzaedVar.zzb(24);
                        if (zzaedVar.zzd()) {
                            zzaedVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzaedVar.zzb(zzaeh.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzaedVar.zzd();
                            for (int i46 = 0; i46 < iZzb17; i46++) {
                                if (!zZzd) {
                                    zzaedVar.zzc(5);
                                } else if (zzaedVar.zzd()) {
                                    zzaedVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzaedVar.zzb(i10);
                        if (iZzb19 > 2) {
                            throw zzaz.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzaegVar = zzaegVar;
                            }
                            i13++;
                            zzaegVar = zzaegVar;
                            i10 = 4;
                        } else {
                            i14 = iZzb19;
                        }
                        zzaedVar.zzc(32);
                        zzaedVar.zzc(32);
                        int iZzb20 = zzaedVar.zzb(i10) + 1;
                        zzaedVar.zzc(1);
                        zzaedVar.zzc((int) ((i14 == 1 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i13++;
                        zzaegVar = zzaegVar;
                        i10 = 4;
                    }
                }
            }
            this.zza = zzajhVar;
            if (zzajhVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzaeg zzaegVar3 = zzajhVar.zza;
            arrayList.add(zzaegVar3.zzg);
            arrayList.add(zzajhVar.zzc);
            zzav zzavVarZzb = zzaeh.zzb(zzfwh.zzm(zzajhVar.zzb.zza));
            zzx zzxVar = new zzx();
            zzxVar.zzE("audio/ogg");
            zzxVar.zzad("audio/vorbis");
            zzxVar.zzA(zzaegVar3.zzd);
            zzxVar.zzY(zzaegVar3.zzc);
            zzxVar.zzB(zzaegVar3.zza);
            zzxVar.zzae(zzaegVar3.zzb);
            zzxVar.zzP(arrayList);
            zzxVar.zzW(zzavVarZzb);
            zzajdVar.zza = zzxVar.zzaj();
            return true;
        }
        zzaeh.zzd(1, zzedVar, false);
        int iZzj = zzedVar.zzj();
        int iZzm2 = zzedVar.zzm();
        int iZzj2 = zzedVar.zzj();
        int iZzi = zzedVar.zzi();
        int i47 = iZzi <= 0 ? -1 : iZzi;
        int iZzi2 = zzedVar.zzi();
        int i48 = iZzi2 <= 0 ? -1 : iZzi2;
        int iZzi3 = zzedVar.zzi();
        int i49 = iZzi3 <= 0 ? -1 : iZzi3;
        int iZzm3 = zzedVar.zzm();
        this.zzd = new zzaeg(iZzj, iZzm2, iZzj2, i47, i48, i49, (int) Math.pow(2.0d, iZzm3 & 15), (int) Math.pow(2.0d, (iZzm3 & 240) >> 4), 1 == (zzedVar.zzm() & 1), Arrays.copyOf(zzedVar.zzN(), zzedVar.zze()));
        zzajhVar = null;
        this.zza = zzajhVar;
        if (zzajhVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzaeg zzaegVar4 = zzajhVar.zza;
        arrayList2.add(zzaegVar4.zzg);
        arrayList2.add(zzajhVar.zzc);
        zzav zzavVarZzb2 = zzaeh.zzb(zzfwh.zzm(zzajhVar.zzb.zza));
        zzx zzxVar2 = new zzx();
        zzxVar2.zzE("audio/ogg");
        zzxVar2.zzad("audio/vorbis");
        zzxVar2.zzA(zzaegVar4.zzd);
        zzxVar2.zzY(zzaegVar4.zzc);
        zzxVar2.zzB(zzaegVar4.zza);
        zzxVar2.zzae(zzaegVar4.zzb);
        zzxVar2.zzP(arrayList2);
        zzxVar2.zzW(zzavVarZzb2);
        zzajdVar.zza = zzxVar2.zzaj();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaeg zzaegVar = this.zzd;
        this.zzb = zzaegVar != null ? zzaegVar.zze : 0;
    }
}
