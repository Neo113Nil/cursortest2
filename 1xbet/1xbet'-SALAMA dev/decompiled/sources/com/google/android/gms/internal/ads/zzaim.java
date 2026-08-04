package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzaim {
    private static final zzftw zza = zzftw.zzb(zzfss.zzc(':'));
    private static final zzftw zzb = zzftw.zzb(zzfss.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final int zza(zzacw zzacwVar, zzadr zzadrVar, List list) throws zzaz {
        byte b7;
        char c3;
        int i7 = this.zzd;
        if (i7 == 0) {
            long jZzd = zzacwVar.zzd();
            zzadrVar.zza = (jZzd == -1 || jZzd < 8) ? 0L : jZzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i8 = 2;
        if (i7 != 1) {
            short s7 = 2817;
            short s8 = 2816;
            short s9 = 2192;
            if (i7 != 2) {
                long jZzf = zzacwVar.zzf();
                int iZzd = (int) ((zzacwVar.zzd() - zzacwVar.zzf()) - ((long) this.zze));
                zzed zzedVar = new zzed(iZzd);
                zzacwVar.zzi(zzedVar.zzN(), 0, iZzd);
                for (int i9 = 0; i9 < this.zzc.size(); i9++) {
                    zzail zzailVar = (zzail) this.zzc.get(i9);
                    zzedVar.zzL((int) (zzailVar.zza - jZzf));
                    zzedVar.zzM(4);
                    int iZzi = zzedVar.zzi();
                    Charset charset = StandardCharsets.UTF_8;
                    switch (zzedVar.zzB(iZzi, charset)) {
                        case "SlowMotion_Data":
                            b7 = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b7 = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b7 = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b7 = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b7 = 2;
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        c3 = 2192;
                    } else if (b7 == 1) {
                        c3 = 2816;
                    } else if (b7 == 2) {
                        c3 = 2817;
                    } else if (b7 == 3) {
                        c3 = 2819;
                    } else {
                        if (b7 != 4) {
                            throw zzaz.zza("Invalid SEF name", null);
                        }
                        c3 = 2820;
                    }
                    int i10 = zzailVar.zzb - (iZzi + 8);
                    if (c3 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZzf = zzb.zzf(zzedVar.zzB(i10, charset));
                        for (int i11 = 0; i11 < listZzf.size(); i11++) {
                            List listZzf2 = zza.zzf((CharSequence) listZzf.get(i11));
                            if (listZzf2.size() != 3) {
                                throw zzaz.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzagn(Long.parseLong((String) listZzf2.get(0)), Long.parseLong((String) listZzf2.get(1)), 1 << (Integer.parseInt((String) listZzf2.get(2)) - 1)));
                            } catch (NumberFormatException e7) {
                                throw zzaz.zza(null, e7);
                            }
                        }
                        list.add(new zzago(arrayList));
                    } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                        throw new IllegalStateException();
                    }
                }
                zzadrVar.zza = 0L;
                return 1;
            }
            long jZzd2 = zzacwVar.zzd();
            int i12 = this.zze - 20;
            zzed zzedVar2 = new zzed(i12);
            zzacwVar.zzi(zzedVar2.zzN(), 0, i12);
            int i13 = 0;
            while (i13 < i12 / 12) {
                zzedVar2.zzM(i8);
                short sZzD = zzedVar2.zzD();
                if (sZzD == s9 || sZzD == s8 || sZzD == s7 || sZzD == 2819 || sZzD == 2820) {
                    this.zzc.add(new zzail(sZzD, (jZzd2 - ((long) this.zze)) - ((long) zzedVar2.zzi()), zzedVar2.zzi()));
                } else {
                    zzedVar2.zzM(8);
                }
                i13++;
                i12 = i12;
                i8 = 2;
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
                zzadrVar.zza = zzacwVar.zzf() - ((long) (this.zze - 12));
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
