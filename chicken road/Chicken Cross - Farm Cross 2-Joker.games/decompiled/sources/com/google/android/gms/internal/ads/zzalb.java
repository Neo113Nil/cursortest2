package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzalb implements zzagh {
    public static final /* synthetic */ int zza = 0;
    private final zzeu zzb;
    private final zzahe zzc;
    private final zzaha zzd;
    private final zzahc zze;
    private final zzaht zzf;
    private zzagk zzg;
    private zzaht zzh;
    private zzaht zzi;
    private int zzj;
    private zzap zzk;
    private zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private zzalf zzr;
    private boolean zzs;

    static {
        int i = zzakz.zza;
    }

    public zzalb() {
        throw null;
    }

    public zzalb(int i) {
        this.zzb = new zzeu(10);
        this.zzc = new zzahe();
        this.zzd = new zzaha();
        this.zzm = -9223372036854775807L;
        this.zze = new zzahc();
        zzage zzageVar = new zzage();
        this.zzf = zzageVar;
        this.zzi = zzageVar;
        this.zzp = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d0  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzi(zzagi zzagiVar) throws IOException {
        int i;
        zzaha zzahaVar;
        long j;
        long j2;
        zzalf zzakwVar;
        int i2;
        int i3;
        zzap zzapVar;
        long zzn;
        zzakc zzakcVar;
        zzaky zze;
        zzalf zzalfVar;
        zzap zzapVar2;
        if (this.zzj == 0) {
            try {
                zzk(zzagiVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzr == null) {
            zzahe zzaheVar = this.zzc;
            zzeu zzeuVar = new zzeu(zzaheVar.zzc);
            zzagiVar.zzi(zzeuVar.zzi(), 0, zzaheVar.zzc);
            int i4 = 21;
            if ((zzaheVar.zza & 1) != 0) {
                if (zzaheVar.zze != 1) {
                    i4 = 36;
                }
            } else if (zzaheVar.zze == 1) {
                i4 = 13;
            }
            if (zzeuVar.zze() >= i4 + 4) {
                zzeuVar.zzh(i4);
                i = zzeuVar.zzB();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        zzakwVar = zzalg.zze(zzagiVar.zzo(), zzagiVar.zzn(), zzaheVar, zzeuVar);
                        zzagiVar.zzf(zzaheVar.zzc);
                        zzapVar = this.zzk;
                        zzn = zzagiVar.zzn();
                        if (zzapVar == null) {
                            zzake zzakeVar = (zzake) zzapVar.zzc(zzake.class, zzala.zza);
                            zze = zzaky.zze(zzn, zzakcVar, zzakeVar != null ? -9223372036854775807L : zzfm.zzt(Long.parseLong((String) zzakeVar.zzb.get(0))));
                            if (this.zzs) {
                            }
                            this.zzr = zzalfVar;
                            this.zzg.zzw(zzalfVar);
                            zzapVar2 = this.zzk;
                            if (zzapVar2 == null) {
                            }
                            zzt zztVar = new zzt();
                            zztVar.zzn("audio/mpeg");
                            zztVar.zzo(zzaheVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzH(zzaheVar.zze);
                            zztVar.zzJ(zzaheVar.zzd);
                            zzaha zzahaVar2 = this.zzd;
                            zztVar.zzL(zzahaVar2.zza);
                            zztVar.zzM(zzahaVar2.zzb);
                            zztVar.zzl(zzapVar2);
                            if (this.zzr.zzh() != -2147483647) {
                            }
                            this.zzi.zzA(zztVar.zzQ());
                            this.zzo = zzagiVar.zzn();
                        }
                        zze = null;
                        if (this.zzs) {
                        }
                        this.zzr = zzalfVar;
                        this.zzg.zzw(zzalfVar);
                        zzapVar2 = this.zzk;
                        if (zzapVar2 == null) {
                        }
                        zzt zztVar2 = new zzt();
                        zztVar2.zzn("audio/mpeg");
                        zztVar2.zzo(zzaheVar.zzb);
                        zztVar2.zzp(4096);
                        zztVar2.zzH(zzaheVar.zze);
                        zztVar2.zzJ(zzaheVar.zzd);
                        zzaha zzahaVar22 = this.zzd;
                        zztVar2.zzL(zzahaVar22.zza);
                        zztVar2.zzM(zzahaVar22.zzb);
                        zztVar2.zzl(zzapVar2);
                        if (this.zzr.zzh() != -2147483647) {
                        }
                        this.zzi.zzA(zztVar2.zzQ());
                        this.zzo = zzagiVar.zzn();
                    } else if (i != 1483304551) {
                        zzagiVar.zzl();
                        zzakwVar = null;
                        zzapVar = this.zzk;
                        zzn = zzagiVar.zzn();
                        if (zzapVar == null || (zzakcVar = (zzakc) zzapVar.zzc(zzakc.class, zzguo.zza())) == null) {
                            zze = null;
                        } else {
                            zzake zzakeVar2 = (zzake) zzapVar.zzc(zzake.class, zzala.zza);
                            zze = zzaky.zze(zzn, zzakcVar, zzakeVar2 != null ? -9223372036854775807L : zzfm.zzt(Long.parseLong((String) zzakeVar2.zzb.get(0))));
                        }
                        if (this.zzs) {
                            if (zze != null) {
                                zzakwVar = zze;
                            } else if (zzakwVar == null) {
                                zzakwVar = null;
                            }
                            if (zzakwVar == null) {
                                zzeu zzeuVar2 = this.zzb;
                                zzagiVar.zzi(zzeuVar2.zzi(), 0, 4);
                                zzeuVar2.zzh(0);
                                zzaheVar.zza(zzeuVar2.zzB());
                                zzalfVar = new zzakw(zzagiVar.zzo(), zzagiVar.zzn(), zzaheVar, false);
                            } else {
                                zzalfVar = zzakwVar;
                            }
                            this.zzh.zzP(zzalfVar.zza());
                        } else {
                            zzalfVar = new zzale();
                        }
                        this.zzr = zzalfVar;
                        this.zzg.zzw(zzalfVar);
                        zzapVar2 = this.zzk;
                        if (zzapVar2 == null) {
                            zzap zzapVar3 = this.zzl;
                            if (zzapVar3 != null) {
                                zzapVar2 = zzapVar2.zzf(zzapVar3);
                            }
                        } else {
                            zzapVar2 = this.zzl;
                        }
                        zzt zztVar22 = new zzt();
                        zztVar22.zzn("audio/mpeg");
                        zztVar22.zzo(zzaheVar.zzb);
                        zztVar22.zzp(4096);
                        zztVar22.zzH(zzaheVar.zze);
                        zztVar22.zzJ(zzaheVar.zzd);
                        zzaha zzahaVar222 = this.zzd;
                        zztVar22.zzL(zzahaVar222.zza);
                        zztVar22.zzM(zzahaVar222.zzb);
                        zztVar22.zzl(zzapVar2);
                        if (this.zzr.zzh() != -2147483647) {
                            zztVar22.zzi(this.zzr.zzh());
                        }
                        this.zzi.zzA(zztVar22.zzQ());
                        this.zzo = zzagiVar.zzn();
                    }
                }
                zzalh zza2 = zzalh.zza(zzaheVar, zzeuVar);
                zzahaVar = this.zzd;
                if (!zzahaVar.zzb() && (i2 = zza2.zze) != -1 && (i3 = zza2.zzf) != -1) {
                    zzahaVar.zza = i2;
                    zzahaVar.zzb = i3;
                }
                zzald zzaldVar = zza2.zzd;
                this.zzl = zzaldVar != null ? new zzap(-9223372036854775807L, zzaldVar) : null;
                long zzn2 = zzagiVar.zzn();
                zzagiVar.zzf(zzaheVar.zzc);
                if (i == 1483304551) {
                    zzakwVar = zzali.zze(zza2, zzn2, zzagiVar.zzo());
                } else {
                    long zzo = zzagiVar.zzo();
                    long zzb = zza2.zzb();
                    if (zzb != -9223372036854775807L) {
                        long j3 = zza2.zzc;
                        if (j3 != -1) {
                            long j4 = zzn2 + j3;
                            j = j3 - zza2.zza.zzc;
                            j2 = j4;
                        } else if (zzo != -1) {
                            j = (zzo - zzn2) - zza2.zza.zzc;
                            j2 = zzo;
                        }
                        zzakwVar = new zzakw(j2, zzn2 + zza2.zza.zzc, zzhbj.zza(zzfm.zzw(j, 8000000L, zzb, RoundingMode.HALF_UP)), zzhbj.zza(zzhbb.zza(j, zza2.zzb, RoundingMode.HALF_UP)), false);
                    }
                    zzakwVar = null;
                }
                zzapVar = this.zzk;
                zzn = zzagiVar.zzn();
                if (zzapVar == null) {
                }
                zze = null;
                if (this.zzs) {
                }
                this.zzr = zzalfVar;
                this.zzg.zzw(zzalfVar);
                zzapVar2 = this.zzk;
                if (zzapVar2 == null) {
                }
                zzt zztVar222 = new zzt();
                zztVar222.zzn("audio/mpeg");
                zztVar222.zzo(zzaheVar.zzb);
                zztVar222.zzp(4096);
                zztVar222.zzH(zzaheVar.zze);
                zztVar222.zzJ(zzaheVar.zzd);
                zzaha zzahaVar2222 = this.zzd;
                zztVar222.zzL(zzahaVar2222.zza);
                zztVar222.zzM(zzahaVar2222.zzb);
                zztVar222.zzl(zzapVar2);
                if (this.zzr.zzh() != -2147483647) {
                }
                this.zzi.zzA(zztVar222.zzQ());
                this.zzo = zzagiVar.zzn();
            }
            if (zzeuVar.zze() >= 40) {
                zzeuVar.zzh(36);
                if (zzeuVar.zzB() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    zzalh zza22 = zzalh.zza(zzaheVar, zzeuVar);
                    zzahaVar = this.zzd;
                    if (!zzahaVar.zzb()) {
                        zzahaVar.zza = i2;
                        zzahaVar.zzb = i3;
                    }
                    zzald zzaldVar2 = zza22.zzd;
                    this.zzl = zzaldVar2 != null ? new zzap(-9223372036854775807L, zzaldVar2) : null;
                    long zzn22 = zzagiVar.zzn();
                    zzagiVar.zzf(zzaheVar.zzc);
                    if (i == 1483304551) {
                    }
                    zzapVar = this.zzk;
                    zzn = zzagiVar.zzn();
                    if (zzapVar == null) {
                    }
                    zze = null;
                    if (this.zzs) {
                    }
                    this.zzr = zzalfVar;
                    this.zzg.zzw(zzalfVar);
                    zzapVar2 = this.zzk;
                    if (zzapVar2 == null) {
                    }
                    zzt zztVar2222 = new zzt();
                    zztVar2222.zzn("audio/mpeg");
                    zztVar2222.zzo(zzaheVar.zzb);
                    zztVar2222.zzp(4096);
                    zztVar2222.zzH(zzaheVar.zze);
                    zztVar2222.zzJ(zzaheVar.zzd);
                    zzaha zzahaVar22222 = this.zzd;
                    zztVar2222.zzL(zzahaVar22222.zza);
                    zztVar2222.zzM(zzahaVar22222.zzb);
                    zztVar2222.zzl(zzapVar2);
                    if (this.zzr.zzh() != -2147483647) {
                    }
                    this.zzi.zzA(zztVar2222.zzQ());
                    this.zzo = zzagiVar.zzn();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            zzalh zza222 = zzalh.zza(zzaheVar, zzeuVar);
            zzahaVar = this.zzd;
            if (!zzahaVar.zzb()) {
            }
            zzald zzaldVar22 = zza222.zzd;
            this.zzl = zzaldVar22 != null ? new zzap(-9223372036854775807L, zzaldVar22) : null;
            long zzn222 = zzagiVar.zzn();
            zzagiVar.zzf(zzaheVar.zzc);
            if (i == 1483304551) {
            }
            zzapVar = this.zzk;
            zzn = zzagiVar.zzn();
            if (zzapVar == null) {
            }
            zze = null;
            if (this.zzs) {
            }
            this.zzr = zzalfVar;
            this.zzg.zzw(zzalfVar);
            zzapVar2 = this.zzk;
            if (zzapVar2 == null) {
            }
            zzt zztVar22222 = new zzt();
            zztVar22222.zzn("audio/mpeg");
            zztVar22222.zzo(zzaheVar.zzb);
            zztVar22222.zzp(4096);
            zztVar22222.zzH(zzaheVar.zze);
            zztVar22222.zzJ(zzaheVar.zzd);
            zzaha zzahaVar222222 = this.zzd;
            zztVar22222.zzL(zzahaVar222222.zza);
            zztVar22222.zzM(zzahaVar222222.zzb);
            zztVar22222.zzl(zzapVar2);
            if (this.zzr.zzh() != -2147483647) {
            }
            this.zzi.zzA(zztVar22222.zzQ());
            this.zzo = zzagiVar.zzn();
        } else {
            long j5 = this.zzo;
            if (j5 != 0) {
                long zzn3 = zzagiVar.zzn();
                if (zzn3 < j5) {
                    zzagiVar.zzf((int) (j5 - zzn3));
                }
            }
        }
        int i5 = this.zzq;
        if (i5 == 0) {
            zzagiVar.zzl();
            if (zzl(zzagiVar)) {
                return -1;
            }
            zzeu zzeuVar3 = this.zzb;
            zzeuVar3.zzh(0);
            int zzB = zzeuVar3.zzB();
            if (!zzn(zzB, this.zzj) || zzahf.zza(zzB) == -1) {
                zzagiVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzahe zzaheVar2 = this.zzc;
            zzaheVar2.zza(zzB);
            if (this.zzm == -9223372036854775807L) {
                this.zzm = this.zzr.zzf(zzagiVar.zzn());
            }
            i5 = zzaheVar2.zzc;
            this.zzq = i5;
            this.zzp = zzagiVar.zzn() + i5;
            zzalf zzalfVar2 = this.zzr;
            if (zzalfVar2 instanceof zzakx) {
                zzj(this.zzn + zzaheVar2.zzg);
                throw null;
            }
        }
        int zza3 = this.zzi.zza(zzagiVar, i5, true);
        if (zza3 == -1) {
            return -1;
        }
        int i6 = this.zzq - zza3;
        this.zzq = i6;
        if (i6 <= 0) {
            this.zzi.zze(zzj(this.zzn), 1, this.zzc.zzc, 0, null);
            this.zzn += r1.zzg;
            this.zzq = 0;
            return 0;
        }
        return 0;
    }

    private final long zzj(long j) {
        return this.zzm + ((j * 1000000) / this.zzc.zzd);
    }

    private final boolean zzk(zzagi zzagiVar, boolean z) throws IOException {
        int i;
        int i2;
        int zza2;
        zzagiVar.zzl();
        if (zzagiVar.zzn() == 0) {
            zzap zza3 = this.zze.zza(zzagiVar, null, 131072);
            this.zzk = zza3;
            if (zza3 != null) {
                this.zzd.zza(zza3);
            }
            i = (int) zzagiVar.zzm();
            if (!z) {
                zzagiVar.zzf(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!zzl(zzagiVar)) {
                zzeu zzeuVar = this.zzb;
                zzeuVar.zzh(0);
                int zzB = zzeuVar.zzB();
                if ((i2 == 0 || zzn(zzB, i2)) && (zza2 = zzahf.zza(zzB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(zzB);
                        i2 = zzB;
                    }
                    zzagiVar.zzk(zza2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z) {
                        zzagiVar.zzl();
                        zzagiVar.zzk(i + i5);
                    } else {
                        zzagiVar.zzf(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z) {
            zzagiVar.zzf(i + i4);
        } else {
            zzagiVar.zzl();
        }
        this.zzj = i2;
        return true;
    }

    private final boolean zzl(zzagi zzagiVar) throws IOException {
        zzalf zzalfVar = this.zzr;
        if (zzalfVar != null) {
            long zzg = zzalfVar.zzg();
            if (zzg != -1 && zzagiVar.zzm() > zzg - 4) {
                return true;
            }
        }
        try {
            return !zzagiVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzalf zzalfVar = this.zzr;
        if ((zzalfVar instanceof zzakw) && zzalfVar.zzb()) {
            long j = this.zzp;
            if (j == -1 || j == this.zzr.zzg()) {
                return;
            }
            this.zzr = ((zzakw) this.zzr).zzi(this.zzp);
            zzagk zzagkVar = this.zzg;
            zzagkVar.getClass();
            zzagkVar.zzw(this.zzr);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        return zzk(zzagiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzg = zzagkVar;
        zzaht zzs = zzagkVar.zzs(0, 1);
        this.zzh = zzs;
        this.zzi = zzs;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        this.zzh.getClass();
        String str = zzfm.zza;
        int zzi = zzi(zzagiVar);
        if (zzi == -1 && (this.zzr instanceof zzakx)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        zzalf zzalfVar = this.zzr;
        if (zzalfVar instanceof zzakx) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    public final void zzh() {
        this.zzs = true;
    }
}
