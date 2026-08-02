package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzaim {
    private static final zzftw zza = zzftw.zzb(zzfss.zzc(':'));
    private static final zzftw zzb = zzftw.zzb(zzfss.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(zzacw zzacwVar, zzadr zzadrVar, List list) {
        int i7;
        char c3;
        char c4;
        int i8 = this.zzd;
        if (i8 == 0) {
            long zzd = zzacwVar.zzd();
            zzadrVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i9 = 2;
        if (i8 != 1) {
            short s7 = 2817;
            short s8 = 2816;
            short s9 = 2192;
            if (i8 != 2) {
                long zzf = zzacwVar.zzf();
                int zzd2 = (int) ((zzacwVar.zzd() - zzacwVar.zzf()) - this.zze);
                zzed zzedVar = new zzed(zzd2);
                zzacwVar.zzi(zzedVar.zzN(), 0, zzd2);
                for (int i10 = 0; i10 < this.zzc.size(); i10++) {
                    zzail zzailVar = (zzail) this.zzc.get(i10);
                    zzedVar.zzL((int) (zzailVar.zza - zzf));
                    zzedVar.zzM(4);
                    int zzi = zzedVar.zzi();
                    Charset charset = StandardCharsets.UTF_8;
                    String zzB = zzedVar.zzB(zzi, charset);
                    switch (zzB.hashCode()) {
                        case -1711564334:
                            if (zzB.equals("SlowMotion_Data")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1332107749:
                            if (zzB.equals("Super_SlowMotion_Edit_Data")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1251387154:
                            if (zzB.equals("Super_SlowMotion_Data")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -830665521:
                            if (zzB.equals("Super_SlowMotion_Deflickering_On")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1760745220:
                            if (zzB.equals("Super_SlowMotion_BGM")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        c4 = 2192;
                    } else if (c3 == 1) {
                        c4 = 2816;
                    } else if (c3 == 2) {
                        c4 = 2817;
                    } else if (c3 == 3) {
                        c4 = 2819;
                    } else {
                        if (c3 != 4) {
                            throw zzaz.zza("Invalid SEF name", null);
                        }
                        c4 = 2820;
                    }
                    int i11 = zzailVar.zzb - (zzi + 8);
                    if (c4 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zzf2 = zzb.zzf(zzedVar.zzB(i11, charset));
                        for (int i12 = 0; i12 < zzf2.size(); i12++) {
                            List zzf3 = zza.zzf((CharSequence) zzf2.get(i12));
                            if (zzf3.size() != 3) {
                                throw zzaz.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzagn(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                            } catch (NumberFormatException e7) {
                                throw zzaz.zza(null, e7);
                            }
                        }
                        list.add(new zzago(arrayList));
                    } else if (c4 != 2816 && c4 != 2817 && c4 != 2819 && c4 != 2820) {
                        throw new IllegalStateException();
                    }
                }
                zzadrVar.zza = 0L;
                return 1;
            }
            long zzd3 = zzacwVar.zzd();
            int i13 = this.zze - 20;
            zzed zzedVar2 = new zzed(i13);
            zzacwVar.zzi(zzedVar2.zzN(), 0, i13);
            int i14 = 0;
            while (i14 < i13 / 12) {
                zzedVar2.zzM(i9);
                short zzD = zzedVar2.zzD();
                if (zzD == s9 || zzD == s8 || zzD == s7 || zzD == 2819 || zzD == 2820) {
                    i7 = i13;
                    this.zzc.add(new zzail(zzD, (zzd3 - this.zze) - zzedVar2.zzi(), zzedVar2.zzi()));
                } else {
                    zzedVar2.zzM(8);
                    i7 = i13;
                }
                i14++;
                i13 = i7;
                i9 = 2;
                s7 = 2817;
                s8 = 2816;
                s9 = 2192;
            }
            if (this.zzc.isEmpty()) {
                zzadrVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzadrVar.zza = ((zzail) this.zzc.get(0)).zza;
            }
        } else {
            zzed zzedVar3 = new zzed(8);
            zzacwVar.zzi(zzedVar3.zzN(), 0, 8);
            this.zze = zzedVar3.zzi() + 8;
            if (zzedVar3.zzg() != 1397048916) {
                zzadrVar.zza = 0L;
            } else {
                zzadrVar.zza = zzacwVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}
