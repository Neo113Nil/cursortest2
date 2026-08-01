package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzajb implements zzagh {
    private zzagk zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaji zzg;
    private zzagi zzh;
    private zzahp zzi;
    private zzamp zzj;
    private final zzeu zza = new zzeu(2);
    private long zzf = -1;

    private final int zzh(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt();
    }

    private final int zzi(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt() - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        int zzi;
        if (zzh(zzagiVar) == 65496) {
            while (true) {
                int zzh = zzh(zzagiVar);
                this.zzd = zzh;
                if (zzh == 65498 || (zzi = zzi(zzagiVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    zzagiVar.zzk(zzi);
                } else {
                    zzeu zzeuVar = this.zza;
                    zzeuVar.zza(zzi);
                    zzagiVar.zzi(zzeuVar.zzi(), 0, zzi);
                    if (!Objects.equals(zzeuVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaje.zzb(zzeuVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzb = zzagkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        int i;
        String zzM;
        zzajd zza;
        zzaji zzajiVar;
        long j;
        int i2 = this.zzc;
        boolean z = true;
        boolean z2 = false;
        if (i2 == 0) {
            zzeu zzeuVar = this.zza;
            zzeuVar.zza(2);
            zzagiVar.zzc(zzeuVar.zzi(), 0, 2);
            int zzt = zzeuVar.zzt();
            this.zzd = zzt;
            if (zzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzj();
                return 0;
            }
            if ((zzt >= 65488 && zzt <= 65497) || zzt == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zze = zzi(zzagiVar);
            zzagiVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzagiVar != this.zzh) {
                    this.zzh = zzagiVar;
                    this.zzi = new zzahp(zzagiVar, this.zzf);
                }
                zzamp zzampVar = this.zzj;
                zzampVar.getClass();
                int zzd = zzampVar.zzd(this.zzi, zzahhVar);
                if (zzd == 1) {
                    zzahhVar.zza += this.zzf;
                }
                return zzd;
            }
            long zzn = zzagiVar.zzn();
            long j2 = this.zzf;
            if (zzn != j2) {
                zzahhVar.zza = j2;
                return 1;
            }
            if (zzagiVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzagiVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzamp(zzanx.zza, 8);
                }
                zzahp zzahpVar = new zzahp(zzagiVar, this.zzf);
                this.zzi = zzahpVar;
                if (this.zzj.zza(zzahpVar)) {
                    zzamp zzampVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzagk zzagkVar = this.zzb;
                    zzagkVar.getClass();
                    zzampVar2.zzc(new zzahr(j3, zzagkVar));
                    zzaji zzajiVar2 = this.zzg;
                    zzajiVar2.getClass();
                    zzagk zzagkVar2 = this.zzb;
                    zzagkVar2.getClass();
                    zzaht zzs = zzagkVar2.zzs(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new zzap(-9223372036854775807L, zzajiVar2));
                    zzs.zzA(zztVar.zzQ());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzeu zzeuVar2 = new zzeu(this.zze);
            zzagiVar.zzc(zzeuVar2.zzi(), 0, this.zze);
            if (this.zzg != null || !"http://ns.adobe.com/xap/1.0/".equals(zzeuVar2.zzM((char) 0)) || (zzM = zzeuVar2.zzM((char) 0)) == null) {
                i = 0;
                this.zzc = i;
                return i;
            }
            long zzo = zzagiVar.zzo();
            if (zzo != -1 && (zza = zzaje.zza(zzM)) != null) {
                List list = zza.zzb;
                if (list.size() >= 2) {
                    int size = list.size() - 1;
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    while (size >= 0) {
                        zzajc zzajcVar = (zzajc) list.get(size);
                        String str = zzajcVar.zza;
                        boolean z3 = (str.equals("video/mp4") || str.equals("video/quicktime")) ? z : z2;
                        if (size == 0) {
                            zzo -= zzajcVar.zzc;
                            j = 0;
                        } else {
                            j = zzo - zzajcVar.zzb;
                        }
                        long j8 = zzo;
                        zzo = j;
                        if (z3 && zzo != j8) {
                            j7 = j8 - zzo;
                            j6 = zzo;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = zzo;
                        }
                        size--;
                        z = true;
                        z2 = false;
                    }
                    if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                        zzajiVar = new zzaji(j4, j5, zza.zza, j6, j7);
                        this.zzg = zzajiVar;
                        if (zzajiVar != null) {
                            this.zzf = zzajiVar.zzd;
                        }
                    }
                }
            }
            zzajiVar = null;
            this.zzg = zzajiVar;
            if (zzajiVar != null) {
            }
        } else {
            zzagiVar.zzf(this.zze);
        }
        i = 0;
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzamp zzampVar = this.zzj;
            zzampVar.getClass();
            zzampVar.zze(j, j2);
        }
    }

    private final void zzj() {
        zzagk zzagkVar = this.zzb;
        zzagkVar.getClass();
        zzagkVar.zzv();
        this.zzb.zzw(new zzahj(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
