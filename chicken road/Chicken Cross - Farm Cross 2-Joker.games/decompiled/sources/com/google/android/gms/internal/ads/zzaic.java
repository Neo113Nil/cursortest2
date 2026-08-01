package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaic implements zzagh {
    private final zzeu zza;
    private final zzaib zzb;
    private final boolean zzc;
    private final zzanx zzd;
    private int zze;
    private zzagk zzf;
    private zzaid zzg;
    private long zzh;
    private zzaif[] zzi;
    private long zzj;
    private zzaif zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaic() {
        this(1, zzanx.zza);
    }

    private final zzaif zzi(int i) {
        for (zzaif zzaifVar : this.zzi) {
            if (zzaifVar.zzc(i)) {
                return zzaifVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzagiVar.zzi(zzeuVar.zzi(), 0, 12);
        zzeuVar.zzh(0);
        if (zzeuVar.zzC() != 1179011410) {
            return false;
        }
        zzeuVar.zzk(4);
        return zzeuVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zze = 0;
        if (this.zzc) {
            zzagkVar = new zzaoa(zzagkVar, this.zzd);
        }
        this.zzf = zzagkVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaif zzaifVar : this.zzi) {
            zzaifVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    final /* synthetic */ zzaif[] zzh() {
        return this.zzi;
    }

    public zzaic(int i, zzanx zzanxVar) {
        this.zzd = zzanxVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzeu(12);
        this.zzb = new zzaib(null);
        this.zzf = new zzahg();
        this.zzi = new zzaif[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        boolean z;
        long j;
        long j2 = this.zzj;
        if (j2 != -1) {
            long zzn = zzagiVar.zzn();
            if (j2 < zzn || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + zzn) {
                zzahhVar.zza = j2;
                z = true;
                this.zzj = -1L;
                if (!z) {
                    return 1;
                }
                int i = this.zze;
                zzaif zzaifVar = null;
                if (i == 0) {
                    if (!zza(zzagiVar)) {
                        throw zzat.zzb("AVI Header List not found", null);
                    }
                    zzagiVar.zzf(12);
                    this.zze = 1;
                    return 0;
                }
                if (i == 1) {
                    zzeu zzeuVar = this.zza;
                    zzagiVar.zzc(zzeuVar.zzi(), 0, 12);
                    zzeuVar.zzh(0);
                    zzaib zzaibVar = this.zzb;
                    zzaibVar.zza(zzeuVar);
                    int i2 = zzaibVar.zza;
                    if (i2 != 1414744396) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                        sb.append("LIST expected, found: ");
                        sb.append(i2);
                        throw zzat.zzb(sb.toString(), null);
                    }
                    int zzC = zzeuVar.zzC();
                    if (zzC == 1819436136) {
                        this.zzl = zzaibVar.zzb;
                        this.zze = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzC).length() + 22);
                    sb2.append("hdrl expected, found: ");
                    sb2.append(zzC);
                    throw zzat.zzb(sb2.toString(), null);
                }
                if (i == 2) {
                    int i3 = this.zzl - 4;
                    zzeu zzeuVar2 = new zzeu(i3);
                    zzagiVar.zzc(zzeuVar2.zzi(), 0, i3);
                    zzaig zzb = zzaig.zzb(1819436136, zzeuVar2);
                    if (zzb.zza() != 1819436136) {
                        int zza = zzb.zza();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zza).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(zza);
                        throw zzat.zzb(sb3.toString(), null);
                    }
                    zzaid zzaidVar = (zzaid) zzb.zzc(zzaid.class);
                    if (zzaidVar == null) {
                        throw zzat.zzb("AviHeader not found", null);
                    }
                    this.zzg = zzaidVar;
                    this.zzh = zzaidVar.zzc * zzaidVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzgxm zzgxmVar = zzb.zza;
                    int size = zzgxmVar.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size) {
                        zzahz zzahzVar = (zzahz) zzgxmVar.get(i4);
                        if (zzahzVar.zza() == 1819440243) {
                            zzaig zzaigVar = (zzaig) zzahzVar;
                            int i6 = i5 + 1;
                            zzaie zzaieVar = (zzaie) zzaigVar.zzc(zzaie.class);
                            zzaih zzaihVar = (zzaih) zzaigVar.zzc(zzaih.class);
                            if (zzaieVar == null) {
                                zzeh.zzc("AviExtractor", "Missing Stream Header");
                            } else if (zzaihVar == null) {
                                zzeh.zzc("AviExtractor", "Missing Stream Format");
                            } else {
                                long zzd = zzaieVar.zzd();
                                zzv zzvVar = zzaihVar.zza;
                                zzt zza2 = zzvVar.zza();
                                zza2.zzb(i5);
                                int i7 = zzaieVar.zze;
                                if (i7 != 0) {
                                    zza2.zzp(i7);
                                }
                                zzaii zzaiiVar = (zzaii) zzaigVar.zzc(zzaii.class);
                                if (zzaiiVar != null) {
                                    zza2.zzc(zzaiiVar.zza);
                                }
                                int zzf = zzas.zzf(zzvVar.zzp);
                                if (zzf != 1) {
                                    if (zzf == 2) {
                                        zzf = 2;
                                    } else {
                                        zzaifVar = null;
                                    }
                                }
                                zzaht zzs = this.zzf.zzs(i5, zzf);
                                zzs.zzA(zza2.zzQ());
                                zzs.zzP(zzd);
                                this.zzh = Math.max(this.zzh, zzd);
                                zzaifVar = new zzaif(i5, zzaieVar, zzs);
                            }
                            if (zzaifVar != null) {
                                arrayList.add(zzaifVar);
                            }
                            i5 = i6;
                        }
                        i4++;
                        zzaifVar = null;
                    }
                    this.zzi = (zzaif[]) arrayList.toArray(new zzaif[0]);
                    this.zzf.zzv();
                    this.zze = 3;
                    return 0;
                }
                if (i == 3) {
                    long j3 = this.zzm;
                    if (j3 != -1 && zzagiVar.zzn() != j3) {
                        this.zzj = j3;
                        return 0;
                    }
                    zzeu zzeuVar3 = this.zza;
                    zzagiVar.zzi(zzeuVar3.zzi(), 0, 12);
                    zzagiVar.zzl();
                    zzeuVar3.zzh(0);
                    zzaib zzaibVar2 = this.zzb;
                    zzaibVar2.zza(zzeuVar3);
                    int zzC2 = zzeuVar3.zzC();
                    int i8 = zzaibVar2.zza;
                    if (i8 == 1179011410) {
                        zzagiVar.zzf(12);
                        return 0;
                    }
                    if (i8 != 1414744396 || zzC2 != 1769369453) {
                        this.zzj = zzagiVar.zzn() + zzaibVar2.zzb + 8;
                        return 0;
                    }
                    long zzn2 = zzagiVar.zzn();
                    this.zzm = zzn2;
                    long j4 = zzn2 + zzaibVar2.zzb + 8;
                    this.zzn = j4;
                    if (!this.zzp) {
                        zzaid zzaidVar2 = this.zzg;
                        zzaidVar2.getClass();
                        if ((zzaidVar2.zzb & 16) == 16) {
                            this.zze = 4;
                            this.zzj = j4;
                            return 0;
                        }
                        this.zzf.zzw(new zzahj(this.zzh, 0L));
                        this.zzp = true;
                    }
                    this.zzj = zzagiVar.zzn() + 12;
                    this.zze = 6;
                    return 0;
                }
                if (i == 4) {
                    zzeu zzeuVar4 = this.zza;
                    zzagiVar.zzc(zzeuVar4.zzi(), 0, 8);
                    zzeuVar4.zzh(0);
                    int zzC3 = zzeuVar4.zzC();
                    int zzC4 = zzeuVar4.zzC();
                    if (zzC3 == 829973609) {
                        this.zze = 5;
                        this.zzo = zzC4;
                    } else {
                        this.zzj = zzagiVar.zzn() + zzC4;
                    }
                    return 0;
                }
                if (i == 5) {
                    zzeu zzeuVar5 = new zzeu(this.zzo);
                    zzagiVar.zzc(zzeuVar5.zzi(), 0, this.zzo);
                    if (zzeuVar5.zzd() < 16) {
                        j = 0;
                    } else {
                        int zzg = zzeuVar5.zzg();
                        zzeuVar5.zzk(8);
                        long zzC5 = zzeuVar5.zzC();
                        long j5 = this.zzm;
                        j = zzC5 > j5 ? 0L : j5 + 8;
                        zzeuVar5.zzh(zzg);
                    }
                    while (zzeuVar5.zzd() >= 16) {
                        int zzC6 = zzeuVar5.zzC();
                        int zzC7 = zzeuVar5.zzC();
                        long zzC8 = zzeuVar5.zzC() + j;
                        zzeuVar5.zzk(4);
                        zzaif zzi = zzi(zzC6);
                        if (zzi != null) {
                            zzi.zza(zzC8, (zzC7 & 16) == 16);
                        }
                    }
                    for (zzaif zzaifVar2 : this.zzi) {
                        zzaifVar2.zzb();
                    }
                    this.zzp = true;
                    if (this.zzi.length == 0) {
                        this.zzf.zzw(new zzahj(this.zzh, 0L));
                    } else {
                        this.zzf.zzw(new zzaia(this, this.zzh));
                    }
                    this.zze = 6;
                    this.zzj = this.zzm;
                    return 0;
                }
                if (zzagiVar.zzn() >= this.zzn) {
                    return -1;
                }
                zzaif zzaifVar3 = this.zzk;
                if (zzaifVar3 != null) {
                    if (!zzaifVar3.zze(zzagiVar)) {
                        return 0;
                    }
                    this.zzk = null;
                    return 0;
                }
                if ((zzagiVar.zzn() & 1) == 1) {
                    zzagiVar.zzf(1);
                }
                zzeu zzeuVar6 = this.zza;
                zzagiVar.zzi(zzeuVar6.zzi(), 0, 12);
                zzeuVar6.zzh(0);
                int zzC9 = zzeuVar6.zzC();
                if (zzC9 == 1414744396) {
                    zzeuVar6.zzh(8);
                    zzagiVar.zzf(zzeuVar6.zzC() != 1769369453 ? 8 : 12);
                    zzagiVar.zzl();
                    return 0;
                }
                int zzC10 = zzeuVar6.zzC();
                if (zzC9 == 1263424842) {
                    this.zzj = zzagiVar.zzn() + zzC10 + 8;
                    return 0;
                }
                zzagiVar.zzf(8);
                zzagiVar.zzl();
                zzaif zzi2 = zzi(zzC9);
                if (zzi2 == null) {
                    this.zzj = zzagiVar.zzn() + zzC10;
                    return 0;
                }
                zzi2.zzd(zzC10);
                this.zzk = zzi2;
                return 0;
            }
            zzagiVar.zzf((int) (j2 - zzn));
        }
        z = false;
        this.zzj = -1L;
        if (!z) {
        }
    }
}
