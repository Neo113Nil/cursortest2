package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzvr implements zzzf, zzuf {
    final /* synthetic */ zzvw zza;
    private final Uri zzc;
    private final zzgw zzd;
    private final zzvl zze;
    private final zzacy zzf;
    private final zzdc zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzaeb zzm;
    private boolean zzn;
    private final zzadr zzh = new zzadr();
    private boolean zzj = true;
    private final long zzb = zzuh.zza();
    private zzgc zzl = zzi(0);

    public zzvr(zzvw zzvwVar, Uri uri, zzfx zzfxVar, zzvl zzvlVar, zzacy zzacyVar, zzdc zzdcVar) {
        this.zza = zzvwVar;
        this.zzc = uri;
        this.zzd = new zzgw(zzfxVar);
        this.zze = zzvlVar;
        this.zzf = zzacyVar;
        this.zzg = zzdcVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzvr zzvrVar, long j, long j3) {
        zzvrVar.zzh.zza = j;
        zzvrVar.zzk = j3;
        zzvrVar.zzj = true;
        zzvrVar.zzn = false;
    }

    private final zzgc zzi(long j) {
        zzga zzgaVar = new zzga();
        zzgaVar.zzd(this.zzc);
        zzgaVar.zzc(j);
        zzgaVar.zza(6);
        zzgaVar.zzb(zzvw.zzb);
        return zzgaVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzuf
    public final void zza(zzed zzedVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(zzvw.zzr(this.zza, true), this.zzk);
        int iZzb = zzedVar.zzb();
        zzaeb zzaebVar = this.zzm;
        zzaebVar.getClass();
        zzaebVar.zzr(zzedVar, iZzb);
        zzaebVar.zzt(jMax, 1, iZzb, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01e1 */
    @Override // com.google.android.gms.internal.ads.zzzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() throws Throwable {
        int i7;
        boolean z4;
        int i8;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i9;
        zzl zzlVar;
        int i10;
        int i11;
        int i12;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                zzgc zzgcVarZzi = zzi(j);
                this.zzl = zzgcVarZzi;
                long jZzb = this.zzd.zzb(zzgcVarZzi);
                if (this.zzi) {
                    zzvl zzvlVar = this.zze;
                    if (zzvlVar.zzb() != -1) {
                        this.zzh.zza = zzvlVar.zzb();
                    }
                    zzfz.zza(this.zzd);
                    return;
                }
                if (jZzb != -1) {
                    jZzb += j;
                    zzvw.zzF(this.zza);
                }
                long j3 = jZzb;
                zzvw zzvwVar = this.zza;
                Map mapZze = this.zzd.zze();
                List list = (List) mapZze.get("icy-br");
                if (list != null) {
                    String str4 = (String) list.get(0);
                    try {
                        i12 = Integer.parseInt(str4) * zzbbd.zzq.zzf;
                        if (i12 > 0) {
                            i8 = i12;
                            z4 = true;
                        } else {
                            try {
                                zzdq.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                                z4 = false;
                                i8 = -1;
                            } catch (NumberFormatException unused) {
                                zzdq.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z4 = false;
                                i8 = i12;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        i12 = -1;
                    }
                } else {
                    z4 = false;
                    i8 = -1;
                }
                List list2 = (List) mapZze.get("icy-genre");
                if (list2 != null) {
                    str = (String) list2.get(0);
                    z4 = true;
                } else {
                    str = null;
                }
                List list3 = (List) mapZze.get("icy-name");
                if (list3 != null) {
                    str2 = (String) list3.get(0);
                    z4 = true;
                } else {
                    str2 = null;
                }
                List list4 = (List) mapZze.get("icy-url");
                if (list4 != null) {
                    str3 = (String) list4.get(0);
                    z4 = true;
                } else {
                    str3 = null;
                }
                List list5 = (List) mapZze.get("icy-pub");
                if (list5 != null) {
                    zEquals = ((String) list5.get(0)).equals("1");
                    z4 = true;
                } else {
                    zEquals = false;
                }
                List list6 = (List) mapZze.get("icy-metaint");
                if (list6 != null) {
                    String str5 = (String) list6.get(0);
                    try {
                        i11 = Integer.parseInt(str5);
                        if (i11 > 0) {
                            i9 = i11;
                            z4 = true;
                        } else {
                            try {
                                zzdq.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                i9 = -1;
                            } catch (NumberFormatException unused3) {
                                zzdq.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i9 = i11;
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i11 = -1;
                    }
                } else {
                    i9 = -1;
                }
                zzvwVar.zzs = z4 ? new zzafv(i8, str, str2, str3, zEquals, i9) : null;
                zzgw zzgwVar = this.zzd;
                zzvw zzvwVar2 = this.zza;
                if (zzvwVar2.zzs == null || zzvwVar2.zzs.zzf == -1) {
                    zzlVar = zzgwVar;
                } else {
                    zzug zzugVar = new zzug(zzgwVar, zzvwVar2.zzs.zzf, this);
                    zzaeb zzaebVarZzv = this.zza.zzv();
                    this.zzm = zzaebVarZzv;
                    zzaebVarZzv.zzm(zzvw.zzc);
                    zzlVar = zzugVar;
                }
                try {
                    this.zze.zzd(zzlVar, this.zzc, this.zzd.zze(), j, j3, this.zzf);
                    if (this.zza.zzs != null) {
                        this.zze.zzc();
                    }
                    if (this.zzj) {
                        this.zze.zzf(j, this.zzk);
                        i7 = 0;
                        try {
                            this.zzj = false;
                        } catch (Throwable th) {
                            th = th;
                            int i13 = i7;
                            if (i13 != 1) {
                                zzvl zzvlVar2 = this.zze;
                                if (zzvlVar2.zzb() != -1) {
                                    this.zzh.zza = zzvlVar2.zzb();
                                }
                            }
                            zzfz.zza(this.zzd);
                            throw th;
                        }
                    } else {
                        i7 = 0;
                    }
                    long j7 = j;
                    int iZza = i7;
                    while (iZza == 0) {
                        if (this.zzi) {
                            iZza = i7;
                            break;
                        }
                        try {
                            this.zzg.zza();
                            iZza = this.zze.zza(this.zzh);
                            long jZzb2 = this.zze.zzb();
                            if (jZzb2 > this.zza.zzj + j7) {
                                this.zzg.zzc();
                                zzvw zzvwVar3 = this.zza;
                                zzvwVar3.zzq.post(zzvwVar3.zzp);
                                j7 = jZzb2;
                            }
                        } catch (InterruptedException unused5) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iZza == 1) {
                        i10 = i7;
                    } else {
                        zzvl zzvlVar3 = this.zze;
                        if (zzvlVar3.zzb() != -1) {
                            this.zzh.zza = zzvlVar3.zzb();
                        }
                        i10 = iZza;
                    }
                    zzfz.zza(this.zzd);
                    if (i10 != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i7 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                i7 = 0;
            }
        }
    }
}
