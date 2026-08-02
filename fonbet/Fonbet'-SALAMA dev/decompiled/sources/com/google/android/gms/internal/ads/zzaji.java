package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
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
            byte[] copyOf = Arrays.copyOf(zzedVar.zzN(), zzedVar.zze() + 4);
            zzedVar.zzJ(copyOf, copyOf.length);
        } else {
            zzedVar.zzK(zzedVar.zze() + 4);
        }
        long j = i8;
        byte[] zzN = zzedVar.zzN();
        zzN[zzedVar.zze() - 4] = (byte) (j & 255);
        zzN[zzedVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzN[zzedVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzN[zzedVar.zze() - 1] = (byte) ((j >>> 24) & 255);
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

    @Override // com.google.android.gms.internal.ads.zzajg
    public final boolean zzc(zzed zzedVar, long j, zzajd zzajdVar) {
        zzajh zzajhVar;
        int i7;
        int i8;
        int i9;
        int i10;
        zzaeg zzaegVar;
        long j3;
        if (this.zza != null) {
            zzajdVar.zza.getClass();
            return false;
        }
        zzaeg zzaegVar2 = this.zzd;
        int i11 = 4;
        if (zzaegVar2 == null) {
            zzaeh.zzd(1, zzedVar, false);
            int zzj = zzedVar.zzj();
            int zzm = zzedVar.zzm();
            int zzj2 = zzedVar.zzj();
            int zzi = zzedVar.zzi();
            int i12 = zzi <= 0 ? -1 : zzi;
            int zzi2 = zzedVar.zzi();
            int i13 = zzi2 <= 0 ? -1 : zzi2;
            int zzi3 = zzedVar.zzi();
            int i14 = zzi3 <= 0 ? -1 : zzi3;
            int zzm2 = zzedVar.zzm();
            this.zzd = new zzaeg(zzj, zzm, zzj2, i12, i13, i14, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzedVar.zzm() & 1), Arrays.copyOf(zzedVar.zzN(), zzedVar.zze()));
        } else {
            zzaee zzaeeVar = this.zze;
            if (zzaeeVar == null) {
                this.zze = zzaeh.zzc(zzedVar, true, true);
            } else {
                byte[] bArr = new byte[zzedVar.zze()];
                System.arraycopy(zzedVar.zzN(), 0, bArr, 0, zzedVar.zze());
                int i15 = zzaegVar2.zza;
                int i16 = 5;
                zzaeh.zzd(5, zzedVar, false);
                int zzm3 = zzedVar.zzm() + 1;
                zzaed zzaedVar = new zzaed(zzedVar.zzN());
                zzaedVar.zzc(zzedVar.zzd() * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = 16;
                    if (i17 >= zzm3) {
                        zzaeg zzaegVar3 = zzaegVar2;
                        int i20 = 6;
                        int zzb = zzaedVar.zzb(6) + 1;
                        for (int i21 = 0; i21 < zzb; i21++) {
                            if (zzaedVar.zzb(16) != 0) {
                                throw zzaz.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i22 = 1;
                        int zzb2 = zzaedVar.zzb(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 < zzb2) {
                                int zzb3 = zzaedVar.zzb(i19);
                                if (zzb3 == 0) {
                                    i9 = zzb2;
                                    int i25 = 8;
                                    zzaedVar.zzc(8);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(6);
                                    zzaedVar.zzc(8);
                                    int zzb4 = zzaedVar.zzb(4) + 1;
                                    int i26 = 0;
                                    while (i26 < zzb4) {
                                        zzaedVar.zzc(i25);
                                        i26++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (zzb3 != i22) {
                                        throw zzaz.zza("floor type greater than 1 not decodable: " + zzb3, null);
                                    }
                                    int zzb5 = zzaedVar.zzb(i16);
                                    int[] iArr = new int[zzb5];
                                    int i27 = -1;
                                    for (int i28 = 0; i28 < zzb5; i28++) {
                                        int zzb6 = zzaedVar.zzb(4);
                                        iArr[i28] = zzb6;
                                        if (zzb6 > i27) {
                                            i27 = zzb6;
                                        }
                                    }
                                    int i29 = i27 + 1;
                                    int[] iArr2 = new int[i29];
                                    int i30 = 0;
                                    while (i30 < i29) {
                                        iArr2[i30] = zzaedVar.zzb(i24) + 1;
                                        int zzb7 = zzaedVar.zzb(i18);
                                        if (zzb7 > 0) {
                                            i10 = 8;
                                            zzaedVar.zzc(8);
                                        } else {
                                            i10 = 8;
                                        }
                                        int i31 = zzb2;
                                        int i32 = 0;
                                        for (int i33 = 1; i32 < (i33 << zzb7); i33 = 1) {
                                            zzaedVar.zzc(i10);
                                            i32++;
                                            i10 = 8;
                                        }
                                        i30++;
                                        zzb2 = i31;
                                        i18 = 2;
                                        i24 = 3;
                                    }
                                    i9 = zzb2;
                                    zzaedVar.zzc(i18);
                                    int zzb8 = zzaedVar.zzb(4);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 0; i36 < zzb5; i36++) {
                                        i34 += iArr2[iArr[i36]];
                                        while (i35 < i34) {
                                            zzaedVar.zzc(zzb8);
                                            i35++;
                                        }
                                    }
                                }
                                i23++;
                                zzb2 = i9;
                                i20 = 6;
                                i18 = 2;
                                i19 = 16;
                                i22 = 1;
                                i16 = 5;
                            } else {
                                int i37 = 1;
                                int zzb9 = zzaedVar.zzb(i20) + 1;
                                int i38 = 0;
                                while (i38 < zzb9) {
                                    if (zzaedVar.zzb(16) > 2) {
                                        throw zzaz.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    int zzb10 = zzaedVar.zzb(i20) + i37;
                                    int i39 = 8;
                                    zzaedVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i40 = 0; i40 < zzb10; i40++) {
                                        iArr3[i40] = ((zzaedVar.zzd() ? zzaedVar.zzb(5) : 0) * 8) + zzaedVar.zzb(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < zzb10) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr3[i41] & (1 << i42)) != 0) {
                                                zzaedVar.zzc(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i20 = 6;
                                    i37 = 1;
                                }
                                int zzb11 = zzaedVar.zzb(i20) + 1;
                                for (int i43 = 0; i43 < zzb11; i43++) {
                                    int zzb12 = zzaedVar.zzb(16);
                                    if (zzb12 != 0) {
                                        zzdq.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb12);
                                    } else {
                                        if (zzaedVar.zzd()) {
                                            i7 = 1;
                                            i8 = zzaedVar.zzb(4) + 1;
                                        } else {
                                            i7 = 1;
                                            i8 = 1;
                                        }
                                        if (zzaedVar.zzd()) {
                                            int zzb13 = zzaedVar.zzb(8) + i7;
                                            for (int i44 = 0; i44 < zzb13; i44++) {
                                                int i45 = i15 - 1;
                                                zzaedVar.zzc(zzaeh.zza(i45));
                                                zzaedVar.zzc(zzaeh.zza(i45));
                                            }
                                        }
                                        if (zzaedVar.zzb(2) != 0) {
                                            throw zzaz.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i8 > 1) {
                                            for (int i46 = 0; i46 < i15; i46++) {
                                                zzaedVar.zzc(4);
                                            }
                                        }
                                        for (int i47 = 0; i47 < i8; i47++) {
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzaedVar.zzb(6);
                                int i48 = zzb14 + 1;
                                zzaef[] zzaefVarArr = new zzaef[i48];
                                for (int i49 = 0; i49 < i48; i49++) {
                                    zzaefVarArr[i49] = new zzaef(zzaedVar.zzd(), zzaedVar.zzb(16), zzaedVar.zzb(16), zzaedVar.zzb(8));
                                }
                                if (!zzaedVar.zzd()) {
                                    throw zzaz.zza("framing bit after modes not set as expected", null);
                                }
                                zzajhVar = new zzajh(zzaegVar3, zzaeeVar, bArr, zzaefVarArr, zzaeh.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzaedVar.zzb(24) != 5653314) {
                            throw zzaz.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaedVar.zza(), null);
                        }
                        int zzb15 = zzaedVar.zzb(16);
                        int zzb16 = zzaedVar.zzb(24);
                        if (zzaedVar.zzd()) {
                            zzaedVar.zzc(5);
                            for (int i50 = 0; i50 < zzb16; i50 += zzaedVar.zzb(zzaeh.zza(zzb16 - i50))) {
                            }
                        } else {
                            boolean zzd = zzaedVar.zzd();
                            for (int i51 = 0; i51 < zzb16; i51++) {
                                if (!zzd) {
                                    zzaedVar.zzc(5);
                                } else if (zzaedVar.zzd()) {
                                    zzaedVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzaedVar.zzb(i11);
                        if (zzb17 > 2) {
                            throw zzaz.zza("lookup type greater than 2 not decodable: " + zzb17, null);
                        }
                        if (zzb17 == 1) {
                            i18 = zzb17;
                        } else if (zzb17 != 2) {
                            zzaegVar = zzaegVar2;
                            i17++;
                            zzaegVar2 = zzaegVar;
                            i11 = 4;
                        }
                        zzaedVar.zzc(32);
                        zzaedVar.zzc(32);
                        int zzb18 = zzaedVar.zzb(i11) + 1;
                        zzaedVar.zzc(1);
                        if (i18 != 1) {
                            zzaegVar = zzaegVar2;
                            j3 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzaegVar = zzaegVar2;
                            j3 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzaegVar = zzaegVar2;
                            j3 = 0;
                        }
                        zzaedVar.zzc((int) (j3 * zzb18));
                        i17++;
                        zzaegVar2 = zzaegVar;
                        i11 = 4;
                    }
                }
            }
        }
        zzajhVar = null;
        this.zza = zzajhVar;
        if (zzajhVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaeg zzaegVar4 = zzajhVar.zza;
        arrayList.add(zzaegVar4.zzg);
        arrayList.add(zzajhVar.zzc);
        zzav zzb19 = zzaeh.zzb(zzfwh.zzm(zzajhVar.zzb.zza));
        zzx zzxVar = new zzx();
        zzxVar.zzE("audio/ogg");
        zzxVar.zzad("audio/vorbis");
        zzxVar.zzA(zzaegVar4.zzd);
        zzxVar.zzY(zzaegVar4.zzc);
        zzxVar.zzB(zzaegVar4.zza);
        zzxVar.zzae(zzaegVar4.zzb);
        zzxVar.zzP(arrayList);
        zzxVar.zzW(zzb19);
        zzajdVar.zza = zzxVar.zzaj();
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
