package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzanp extends zzann {
    private zzano zza;
    private int zzb;
    private boolean zzc;
    private zzhg zzd;
    private zzhe zze;

    zzanp() {
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final long zzb(zzeu zzeuVar) {
        if ((zzeuVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        zzano zzanoVar = this.zza;
        zzanoVar.getClass();
        byte b = zzeuVar.zzi()[0];
        zzhg zzhgVar = zzanoVar.zza;
        zzhf[] zzhfVarArr = zzanoVar.zzd;
        int i = zzhfVarArr[(b >> 1) & (255 >>> (8 - zzhh.zza(zzhfVarArr.length + (-1))))].zza ? zzhgVar.zzf : zzhgVar.zze;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzeuVar.zzj() < zzeuVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze() + 4);
            zzeuVar.zzb(copyOf, copyOf.length);
        } else {
            zzeuVar.zzf(zzeuVar.zze() + 4);
        }
        long j = i2;
        byte[] zzi = zzeuVar.zzi();
        zzi[zzeuVar.zze() - 4] = (byte) (j & 255);
        zzi[zzeuVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzeuVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzeuVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzhg zzhgVar = this.zzd;
        this.zzb = zzhgVar != null ? zzhgVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzeu zzeuVar, long j, zzanl zzanlVar) throws IOException {
        zzano zzanoVar;
        int i;
        int i2;
        int i3;
        int i4;
        zzhg zzhgVar;
        long j2;
        if (this.zza != null) {
            zzanlVar.zza.getClass();
            return false;
        }
        zzhg zzhgVar2 = this.zzd;
        int i5 = 4;
        if (zzhgVar2 == null) {
            zzhh.zzc(1, zzeuVar, false);
            int zzI = zzeuVar.zzI();
            int zzs = zzeuVar.zzs();
            int zzI2 = zzeuVar.zzI();
            int zzC = zzeuVar.zzC();
            int i6 = zzC <= 0 ? -1 : zzC;
            int zzC2 = zzeuVar.zzC();
            int i7 = zzC2 <= 0 ? -1 : zzC2;
            int zzC3 = zzeuVar.zzC();
            int i8 = zzC3 <= 0 ? -1 : zzC3;
            int zzs2 = zzeuVar.zzs();
            this.zzd = new zzhg(zzI, zzs, zzI2, i6, i7, i8, (int) Math.pow(2.0d, zzs2 & 15), (int) Math.pow(2.0d, (zzs2 & 240) >> 4), 1 == (zzeuVar.zzs() & 1), Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze()));
        } else {
            zzhe zzheVar = this.zze;
            if (zzheVar == null) {
                this.zze = zzhh.zzb(zzeuVar, true, true);
            } else {
                byte[] bArr = new byte[zzeuVar.zze()];
                System.arraycopy(zzeuVar.zzi(), 0, bArr, 0, zzeuVar.zze());
                int i9 = zzhgVar2.zza;
                int i10 = 5;
                zzhh.zzc(5, zzeuVar, false);
                int zzs3 = zzeuVar.zzs() + 1;
                zzhd zzhdVar = new zzhd(zzeuVar.zzi());
                zzhdVar.zzc(zzeuVar.zzg() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= zzs3) {
                        zzhg zzhgVar3 = zzhgVar2;
                        int i14 = 6;
                        int zzb = zzhdVar.zzb(6) + 1;
                        for (int i15 = 0; i15 < zzb; i15++) {
                            if (zzhdVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i16 = 1;
                        int zzb2 = zzhdVar.zzb(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < zzb2) {
                                int zzb3 = zzhdVar.zzb(i13);
                                if (zzb3 == 0) {
                                    i3 = zzb2;
                                    int i19 = 8;
                                    zzhdVar.zzc(8);
                                    zzhdVar.zzc(16);
                                    zzhdVar.zzc(16);
                                    zzhdVar.zzc(6);
                                    zzhdVar.zzc(8);
                                    int zzb4 = zzhdVar.zzb(4) + 1;
                                    int i20 = 0;
                                    while (i20 < zzb4) {
                                        zzhdVar.zzc(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (zzb3 != i16) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzb3).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(zzb3);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    int zzb5 = zzhdVar.zzb(i10);
                                    int[] iArr = new int[zzb5];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < zzb5; i22++) {
                                        int zzb6 = zzhdVar.zzb(4);
                                        iArr[i22] = zzb6;
                                        if (zzb6 > i21) {
                                            i21 = zzb6;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = zzhdVar.zzb(i18) + 1;
                                        int zzb7 = zzhdVar.zzb(i12);
                                        if (zzb7 > 0) {
                                            i4 = 8;
                                            zzhdVar.zzc(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i25 = zzb2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << zzb7); i27 = 1) {
                                            zzhdVar.zzc(i4);
                                            i26++;
                                            i4 = 8;
                                        }
                                        i24++;
                                        zzb2 = i25;
                                        i12 = 2;
                                        i18 = 3;
                                    }
                                    i3 = zzb2;
                                    zzhdVar.zzc(i12);
                                    int zzb8 = zzhdVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzhdVar.zzc(zzb8);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                zzb2 = i3;
                                i14 = 6;
                                i12 = 2;
                                i13 = 16;
                                i16 = 1;
                                i10 = 5;
                            } else {
                                int i31 = 1;
                                int zzb9 = zzhdVar.zzb(i14) + 1;
                                int i32 = 0;
                                while (i32 < zzb9) {
                                    if (zzhdVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzhdVar.zzc(24);
                                    zzhdVar.zzc(24);
                                    zzhdVar.zzc(24);
                                    int zzb10 = zzhdVar.zzb(i14) + i31;
                                    int i33 = 8;
                                    zzhdVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i34 = 0; i34 < zzb10; i34++) {
                                        iArr3[i34] = ((zzhdVar.zza() ? zzhdVar.zzb(5) : 0) * 8) + zzhdVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzhdVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i14 = 6;
                                    i31 = 1;
                                }
                                int zzb11 = zzhdVar.zzb(i14) + 1;
                                for (int i37 = 0; i37 < zzb11; i37++) {
                                    int zzb12 = zzhdVar.zzb(16);
                                    if (zzb12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzb12).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(zzb12);
                                        zzeh.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzhdVar.zza()) {
                                            i = 1;
                                            i2 = zzhdVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzhdVar.zza()) {
                                            int zzb13 = zzhdVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < zzb13; i38++) {
                                                int i39 = i9 - 1;
                                                zzhdVar.zzc(zzhh.zza(i39));
                                                zzhdVar.zzc(zzhh.zza(i39));
                                            }
                                        }
                                        if (zzhdVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                zzhdVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            zzhdVar.zzc(8);
                                            zzhdVar.zzc(8);
                                            zzhdVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzhdVar.zzb(6);
                                int i42 = zzb14 + 1;
                                zzhf[] zzhfVarArr = new zzhf[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    zzhfVarArr[i43] = new zzhf(zzhdVar.zza(), zzhdVar.zzb(16), zzhdVar.zzb(16), zzhdVar.zzb(8));
                                }
                                if (!zzhdVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzanoVar = new zzano(zzhgVar3, zzheVar, bArr, zzhfVarArr, zzhh.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzhdVar.zzb(24) != 5653314) {
                            int zzd = zzhdVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(zzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int zzb15 = zzhdVar.zzb(16);
                        int zzb16 = zzhdVar.zzb(24);
                        if (zzhdVar.zza()) {
                            zzhdVar.zzc(5);
                            for (int i44 = 0; i44 < zzb16; i44 += zzhdVar.zzb(zzhh.zza(zzb16 - i44))) {
                            }
                        } else {
                            boolean zza = zzhdVar.zza();
                            for (int i45 = 0; i45 < zzb16; i45++) {
                                if (!zza) {
                                    zzhdVar.zzc(5);
                                } else if (zzhdVar.zza()) {
                                    zzhdVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzhdVar.zzb(i5);
                        if (zzb17 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(zzb17).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(zzb17);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (zzb17 == 1) {
                            i12 = zzb17;
                        } else if (zzb17 != 2) {
                            zzhgVar = zzhgVar2;
                            i11++;
                            zzhgVar2 = zzhgVar;
                            i5 = 4;
                        }
                        zzhdVar.zzc(32);
                        zzhdVar.zzc(32);
                        int zzb18 = zzhdVar.zzb(i5) + 1;
                        zzhdVar.zzc(1);
                        if (i12 != 1) {
                            zzhgVar = zzhgVar2;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzhgVar = zzhgVar2;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzhgVar = zzhgVar2;
                            j2 = 0;
                        }
                        zzhdVar.zzc((int) (j2 * zzb18));
                        i11++;
                        zzhgVar2 = zzhgVar;
                        i5 = 4;
                    }
                }
            }
        }
        zzanoVar = null;
        this.zza = zzanoVar;
        if (zzanoVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzhg zzhgVar4 = zzanoVar.zza;
        arrayList.add(zzhgVar4.zzg);
        arrayList.add(zzanoVar.zzc);
        zzap zzb19 = zzahv.zzb(zzgxm.zzr(zzanoVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzn("audio/ogg");
        zztVar.zzo("audio/vorbis");
        zztVar.zzi(zzhgVar4.zzd);
        zztVar.zzj(zzhgVar4.zzc);
        zztVar.zzH(zzhgVar4.zza);
        zztVar.zzJ(zzhgVar4.zzb);
        zztVar.zzr(arrayList);
        zztVar.zzl(zzb19);
        zzanlVar.zza = zztVar.zzQ();
        return true;
    }
}
