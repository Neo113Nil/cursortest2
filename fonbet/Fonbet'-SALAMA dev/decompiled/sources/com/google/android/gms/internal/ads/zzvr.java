package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
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
        long max = !this.zzn ? this.zzk : Math.max(zzvw.zzr(this.zza, true), this.zzk);
        int zzb = zzedVar.zzb();
        zzaeb zzaebVar = this.zzm;
        zzaebVar.getClass();
        zzaebVar.zzr(zzedVar, zzb);
        zzaebVar.zzt(max, 1, zzb, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec A[EDGE_INSN: B:102:0x01ec->B:80:0x01ec BREAK  A[LOOP:1: B:61:0x01a9->B:72:0x01a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189 A[Catch: all -> 0x018f, TryCatch #8 {all -> 0x018f, blocks: (B:51:0x017e, B:53:0x0189, B:54:0x0193, B:56:0x0197), top: B:50:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #8 {all -> 0x018f, blocks: (B:51:0x017e, B:53:0x0189, B:54:0x0193, B:56:0x0197), top: B:50:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:0: B:2:0x0004->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0212  */
    @Override // com.google.android.gms.internal.ads.zzzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        int i7;
        int i8;
        boolean z4;
        int i9;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z7;
        List list5;
        int i10;
        zzgw zzgwVar;
        zzvw zzvwVar;
        zzl zzlVar;
        int i11;
        int i12;
        int i13;
        int i14;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                zzgc zzi = zzi(j);
                this.zzl = zzi;
                long zzb = this.zzd.zzb(zzi);
                if (this.zzi) {
                    zzvl zzvlVar = this.zze;
                    if (zzvlVar.zzb() != -1) {
                        this.zzh.zza = zzvlVar.zzb();
                    }
                    zzfz.zza(this.zzd);
                    return;
                }
                if (zzb != -1) {
                    zzb += j;
                    zzvw.zzF(this.zza);
                }
                long j3 = zzb;
                zzvw zzvwVar2 = this.zza;
                Map zze = this.zzd.zze();
                List list6 = (List) zze.get("icy-br");
                try {
                    if (list6 != null) {
                        String str4 = (String) list6.get(0);
                        try {
                            i14 = Integer.parseInt(str4) * zzbbd.zzq.zzf;
                        } catch (NumberFormatException unused) {
                            i14 = -1;
                        }
                        if (i14 > 0) {
                            i9 = i14;
                            z4 = true;
                            list = (List) zze.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z4 = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zze.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z4 = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zze.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z4 = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zze.get("icy-pub");
                            if (list4 != null) {
                                z7 = ((String) list4.get(0)).equals("1");
                                z4 = true;
                            } else {
                                z7 = false;
                            }
                            list5 = (List) zze.get("icy-metaint");
                            if (list5 != null) {
                                String str5 = (String) list5.get(0);
                                try {
                                    i13 = Integer.parseInt(str5);
                                } catch (NumberFormatException unused2) {
                                    i13 = -1;
                                }
                                if (i13 > 0) {
                                    i10 = i13;
                                    z4 = true;
                                    zzvwVar2.zzs = z4 ? new zzafv(i9, str, str2, str3, z7, i10) : null;
                                    zzgwVar = this.zzd;
                                    zzvwVar = this.zza;
                                    if (zzvwVar.zzs != null || zzvwVar.zzs.zzf == -1) {
                                        zzlVar = zzgwVar;
                                    } else {
                                        zzl zzugVar = new zzug(zzgwVar, zzvwVar.zzs.zzf, this);
                                        zzaeb zzv = this.zza.zzv();
                                        this.zzm = zzv;
                                        zzv.zzm(zzvw.zzc);
                                        zzlVar = zzugVar;
                                    }
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
                                            i8 = i7;
                                            if (i8 != 1) {
                                            }
                                            zzfz.zza(this.zzd);
                                            throw th;
                                        }
                                    } else {
                                        i7 = 0;
                                    }
                                    long j7 = j;
                                    i11 = i7;
                                    while (true) {
                                        if (i11 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i11 = i7;
                                                break;
                                            }
                                            try {
                                                this.zzg.zza();
                                                i11 = this.zze.zza(this.zzh);
                                                long zzb2 = this.zze.zzb();
                                                if (zzb2 > this.zza.zzj + j7) {
                                                    this.zzg.zzc();
                                                    zzvw zzvwVar3 = this.zza;
                                                    zzvwVar3.zzq.post(zzvwVar3.zzp);
                                                    j7 = zzb2;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i8 = i11;
                                            if (i8 != 1) {
                                                zzvl zzvlVar2 = this.zze;
                                                if (zzvlVar2.zzb() != -1) {
                                                    this.zzh.zza = zzvlVar2.zzb();
                                                }
                                            }
                                            zzfz.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i11 == 1) {
                                        i12 = i7;
                                    } else {
                                        zzvl zzvlVar3 = this.zze;
                                        if (zzvlVar3.zzb() != -1) {
                                            this.zzh.zza = zzvlVar3.zzb();
                                        }
                                        i12 = i11;
                                    }
                                    zzfz.zza(this.zzd);
                                    if (i12 != 0) {
                                        return;
                                    }
                                } else {
                                    try {
                                        zzdq.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                    } catch (NumberFormatException unused4) {
                                        zzdq.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                        i10 = i13;
                                        zzvwVar2.zzs = z4 ? new zzafv(i9, str, str2, str3, z7, i10) : null;
                                        zzgwVar = this.zzd;
                                        zzvwVar = this.zza;
                                        if (zzvwVar.zzs != null) {
                                        }
                                        zzlVar = zzgwVar;
                                        this.zze.zzd(zzlVar, this.zzc, this.zzd.zze(), j, j3, this.zzf);
                                        if (this.zza.zzs != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        long j72 = j;
                                        i11 = i7;
                                        while (true) {
                                            if (i11 != 0) {
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                        zzfz.zza(this.zzd);
                                        if (i12 != 0) {
                                        }
                                    }
                                }
                            }
                            i10 = -1;
                            zzvwVar2.zzs = z4 ? new zzafv(i9, str, str2, str3, z7, i10) : null;
                            zzgwVar = this.zzd;
                            zzvwVar = this.zza;
                            if (zzvwVar.zzs != null) {
                            }
                            zzlVar = zzgwVar;
                            this.zze.zzd(zzlVar, this.zzc, this.zzd.zze(), j, j3, this.zzf);
                            if (this.zza.zzs != null) {
                            }
                            if (this.zzj) {
                            }
                            long j722 = j;
                            i11 = i7;
                            while (true) {
                                if (i11 != 0) {
                                }
                            }
                            if (i11 == 1) {
                            }
                            zzfz.zza(this.zzd);
                            if (i12 != 0) {
                            }
                        } else {
                            try {
                                zzdq.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                            } catch (NumberFormatException unused5) {
                                zzdq.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z4 = false;
                                i9 = i14;
                                list = (List) zze.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zze.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zze.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zze.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zze.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i10 = -1;
                                zzvwVar2.zzs = z4 ? new zzafv(i9, str, str2, str3, z7, i10) : null;
                                zzgwVar = this.zzd;
                                zzvwVar = this.zza;
                                if (zzvwVar.zzs != null) {
                                }
                                zzlVar = zzgwVar;
                                this.zze.zzd(zzlVar, this.zzc, this.zzd.zze(), j, j3, this.zzf);
                                if (this.zza.zzs != null) {
                                }
                                if (this.zzj) {
                                }
                                long j7222 = j;
                                i11 = i7;
                                while (true) {
                                    if (i11 != 0) {
                                    }
                                }
                                if (i11 == 1) {
                                }
                                zzfz.zza(this.zzd);
                                if (i12 != 0) {
                                }
                            }
                        }
                    }
                    this.zze.zzd(zzlVar, this.zzc, this.zzd.zze(), j, j3, this.zzf);
                    if (this.zza.zzs != null) {
                    }
                    if (this.zzj) {
                    }
                    long j72222 = j;
                    i11 = i7;
                    while (true) {
                        if (i11 != 0) {
                        }
                    }
                    if (i11 == 1) {
                    }
                    zzfz.zza(this.zzd);
                    if (i12 != 0) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i7 = 0;
                }
                z4 = false;
                i9 = -1;
                list = (List) zze.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zze.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zze.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zze.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zze.get("icy-metaint");
                if (list5 != null) {
                }
                i10 = -1;
                zzvwVar2.zzs = z4 ? new zzafv(i9, str, str2, str3, z7, i10) : null;
                zzgwVar = this.zzd;
                zzvwVar = this.zza;
                if (zzvwVar.zzs != null) {
                }
                zzlVar = zzgwVar;
            } catch (Throwable th4) {
                th = th4;
                i7 = 0;
            }
        }
    }
}
