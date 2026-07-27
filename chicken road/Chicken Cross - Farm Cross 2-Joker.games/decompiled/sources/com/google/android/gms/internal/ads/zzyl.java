package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzyl implements zzace, zzxd {
    final /* synthetic */ zzyu zza;
    private final long zzb;
    private final Uri zzc;
    private final zzip zzd;
    private final zzyh zze;
    private final zzagk zzf;
    private final zzdt zzg;
    private final zzahh zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhw zzl;
    private zzaht zzm;
    private boolean zzn;

    public zzyl(zzyu zzyuVar, Uri uri, zzhs zzhsVar, zzyh zzyhVar, zzagk zzagkVar, zzdt zzdtVar) {
        Objects.requireNonNull(zzyuVar);
        this.zza = zzyuVar;
        this.zzc = uri;
        this.zzd = new zzip(zzhsVar);
        this.zze = zzyhVar;
        this.zzf = zzagkVar;
        this.zzg = zzdtVar;
        this.zzh = new zzahh();
        this.zzj = true;
        this.zzb = zzxf.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhw zzi(long j, String str) {
        Map map;
        map = zzyu.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzgxo zzgxoVar = new zzgxo();
            zzgxoVar.zzb(map.entrySet());
            zzgxoVar.zza(HttpHeaders.IF_RANGE, str);
            map = zzgxoVar.zzd();
        }
        zzhv zzhvVar = new zzhv();
        zzhvVar.zza(this.zzc);
        zzhvVar.zzc(j);
        zzhvVar.zzd(6);
        zzhvVar.zzb(map);
        return zzhvVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b A[EDGE_INSN: B:104:0x020b->B:84:0x020b BREAK  A[LOOP:1: B:65:0x01d4->B:76:0x01d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[Catch: all -> 0x022c, TryCatch #6 {all -> 0x022c, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:115:0x0137, B:118:0x0155, B:127:0x008c, B:130:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[Catch: all -> 0x022c, TryCatch #6 {all -> 0x022c, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:115:0x0137, B:118:0x0155, B:127:0x008c, B:130:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: all -> 0x022c, TryCatch #6 {all -> 0x022c, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:115:0x0137, B:118:0x0155, B:127:0x008c, B:130:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b A[Catch: all -> 0x022c, TryCatch #6 {all -> 0x022c, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:115:0x0137, B:118:0x0155, B:127:0x008c, B:130:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127 A[Catch: all -> 0x022c, TRY_LEAVE, TryCatch #6 {all -> 0x022c, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:115:0x0137, B:118:0x0155, B:127:0x008c, B:130:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a A[Catch: all -> 0x022c, TryCatch #6 {all -> 0x022c, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:115:0x0137, B:118:0x0155, B:127:0x008c, B:130:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180 A[Catch: all -> 0x022c, TryCatch #6 {all -> 0x022c, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:115:0x0137, B:118:0x0155, B:127:0x008c, B:130:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:55:0x01b6, B:57:0x01bf, B:58:0x01c2, B:60:0x01c6), top: B:54:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c6 A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #4 {all -> 0x0229, blocks: (B:55:0x01b6, B:57:0x01bf, B:58:0x01c2, B:60:0x01c6), top: B:54:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0232  */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z;
        List list5;
        int i5;
        zzip zzipVar;
        zzyu zzyuVar;
        zzhs zzhsVar;
        zzv zzvVar;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        String str4 = null;
        while (i9 == 0 && !this.zzi) {
            try {
                long j = this.zzh.zza;
                zzhw zzi = zzi(j, str4);
                this.zzl = zzi;
                zzip zzipVar2 = this.zzd;
                long zzb = zzipVar2.zzb(zzi);
                if (this.zzi) {
                    zzyh zzyhVar = this.zze;
                    if (zzyhVar.zzd() != -1) {
                        this.zzh.zza = zzyhVar.zzd();
                    }
                    zzhu.zza(this.zzd);
                    return;
                }
                List list6 = (List) zzipVar2.zzj().get("ETag");
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i8);
                if (zzb != -1) {
                    zzb += j;
                    this.zza.zzH();
                }
                long j2 = zzb;
                zzyu zzyuVar2 = this.zza;
                Map zzj = zzipVar2.zzj();
                List list7 = (List) zzj.get("icy-br");
                try {
                    if (list7 != null) {
                        String str5 = (String) list7.get(i8);
                        try {
                            i7 = Integer.parseInt(str5) * 1000;
                        } catch (NumberFormatException unused) {
                            i7 = -1;
                        }
                        if (i7 > 0) {
                            i3 = i7;
                            i4 = 1;
                            list = (List) zzj.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(i8);
                                i4 = 1;
                            } else {
                                str = null;
                            }
                            list2 = (List) zzj.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(i8);
                                i4 = 1;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zzj.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(i8);
                                i4 = 1;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zzj.get("icy-pub");
                            if (list4 != null) {
                                z = ((String) list4.get(i8)).equals("1");
                                i4 = 1;
                            } else {
                                z = i8;
                            }
                            list5 = (List) zzj.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(i8);
                                try {
                                    i6 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused2) {
                                    i6 = -1;
                                }
                                if (i6 > 0) {
                                    i5 = i6;
                                    i4 = 1;
                                    zzyuVar2.zzP(i4 != 0 ? new zzajo(i3, str, str2, str3, z, i5) : null);
                                    zzipVar = this.zzd;
                                    zzyuVar = this.zza;
                                    if (zzyuVar.zzO() != null || zzyuVar.zzO().zzf == -1) {
                                        zzhsVar = zzipVar;
                                    } else {
                                        zzhs zzxeVar = new zzxe(zzipVar, zzyuVar.zzO().zzf, this);
                                        zzaht zzx = zzyuVar.zzx();
                                        this.zzm = zzx;
                                        zzvVar = zzyu.zzc;
                                        zzx.zzA(zzvVar);
                                        zzhsVar = zzxeVar;
                                    }
                                    zzyh zzyhVar2 = this.zze;
                                    zzyhVar2.zza(zzhsVar, this.zzc, zzipVar.zzj(), j, j2, this.zzf);
                                    if (zzyuVar.zzO() != null) {
                                        zzyhVar2.zzc();
                                    }
                                    if (this.zzj) {
                                        zzyhVar2.zze(j, this.zzk);
                                        i = 0;
                                        try {
                                            this.zzj = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = i;
                                            if (i2 != 1) {
                                            }
                                            zzhu.zza(this.zzd);
                                            throw th;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    long j3 = j;
                                    i2 = i;
                                    while (true) {
                                        if (i2 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i2 = i;
                                                break;
                                            }
                                            try {
                                                zzdt zzdtVar = this.zzg;
                                                zzdtVar.zzc();
                                                i2 = zzyhVar2.zzf(this.zzh);
                                                long zzd = zzyhVar2.zzd();
                                                if (zzd > zzyuVar.zzL() + j3) {
                                                    zzdtVar.zzb();
                                                    zzyuVar.zzN().post(zzyuVar.zzM());
                                                    j3 = zzd;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (i2 != 1) {
                                                zzyh zzyhVar3 = this.zze;
                                                if (zzyhVar3.zzd() != -1) {
                                                    this.zzh.zza = zzyhVar3.zzd();
                                                }
                                            }
                                            zzhu.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i2 == 1) {
                                        i9 = i;
                                    } else {
                                        if (zzyhVar2.zzd() != -1) {
                                            this.zzh.zza = zzyhVar2.zzd();
                                        }
                                        i9 = i2;
                                    }
                                    zzhu.zza(zzipVar);
                                    i8 = i;
                                } else {
                                    try {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 27);
                                        sb.append("Invalid metadata interval: ");
                                        sb.append(str6);
                                        zzeh.zzc("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused4) {
                                        String.valueOf(str6);
                                        zzeh.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i5 = i6;
                                        zzyuVar2.zzP(i4 != 0 ? new zzajo(i3, str, str2, str3, z, i5) : null);
                                        zzipVar = this.zzd;
                                        zzyuVar = this.zza;
                                        if (zzyuVar.zzO() != null) {
                                        }
                                        zzhsVar = zzipVar;
                                        zzyh zzyhVar22 = this.zze;
                                        zzyhVar22.zza(zzhsVar, this.zzc, zzipVar.zzj(), j, j2, this.zzf);
                                        if (zzyuVar.zzO() != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        long j32 = j;
                                        i2 = i;
                                        while (true) {
                                            if (i2 != 0) {
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                        zzhu.zza(zzipVar);
                                        i8 = i;
                                    }
                                }
                            }
                            i5 = -1;
                            zzyuVar2.zzP(i4 != 0 ? new zzajo(i3, str, str2, str3, z, i5) : null);
                            zzipVar = this.zzd;
                            zzyuVar = this.zza;
                            if (zzyuVar.zzO() != null) {
                            }
                            zzhsVar = zzipVar;
                            zzyh zzyhVar222 = this.zze;
                            zzyhVar222.zza(zzhsVar, this.zzc, zzipVar.zzj(), j, j2, this.zzf);
                            if (zzyuVar.zzO() != null) {
                            }
                            if (this.zzj) {
                            }
                            long j322 = j;
                            i2 = i;
                            while (true) {
                                if (i2 != 0) {
                                }
                            }
                            if (i2 == 1) {
                            }
                            zzhu.zza(zzipVar);
                            i8 = i;
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str5);
                                zzeh.zzc("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused5) {
                                String.valueOf(str5);
                                zzeh.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                i4 = i8;
                                i3 = i7;
                                list = (List) zzj.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zzj.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zzj.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zzj.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zzj.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i5 = -1;
                                zzyuVar2.zzP(i4 != 0 ? new zzajo(i3, str, str2, str3, z, i5) : null);
                                zzipVar = this.zzd;
                                zzyuVar = this.zza;
                                if (zzyuVar.zzO() != null) {
                                }
                                zzhsVar = zzipVar;
                                zzyh zzyhVar2222 = this.zze;
                                zzyhVar2222.zza(zzhsVar, this.zzc, zzipVar.zzj(), j, j2, this.zzf);
                                if (zzyuVar.zzO() != null) {
                                }
                                if (this.zzj) {
                                }
                                long j3222 = j;
                                i2 = i;
                                while (true) {
                                    if (i2 != 0) {
                                    }
                                }
                                if (i2 == 1) {
                                }
                                zzhu.zza(zzipVar);
                                i8 = i;
                            }
                        }
                    }
                    zzyhVar2222.zza(zzhsVar, this.zzc, zzipVar.zzj(), j, j2, this.zzf);
                    if (zzyuVar.zzO() != null) {
                    }
                    if (this.zzj) {
                    }
                    long j32222 = j;
                    i2 = i;
                    while (true) {
                        if (i2 != 0) {
                        }
                    }
                    if (i2 == 1) {
                    }
                    zzhu.zza(zzipVar);
                    i8 = i;
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                }
                i3 = -1;
                i4 = i8;
                list = (List) zzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zzj.get("icy-metaint");
                if (list5 != null) {
                }
                i5 = -1;
                zzyuVar2.zzP(i4 != 0 ? new zzajo(i3, str, str2, str3, z, i5) : null);
                zzipVar = this.zzd;
                zzyuVar = this.zza;
                if (zzyuVar.zzO() != null) {
                }
                zzhsVar = zzipVar;
                zzyh zzyhVar22222 = this.zze;
            } catch (Throwable th4) {
                th = th4;
                i = i8;
            }
        }
    }

    final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzip zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzhw zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zza(zzeu zzeuVar) {
        long max = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int zzd = zzeuVar.zzd();
        zzaht zzahtVar = this.zzm;
        zzahtVar.getClass();
        zzahtVar.zzc(zzeuVar, zzd);
        zzahtVar.zze(max, 1, zzd, 0, null);
        this.zzn = true;
    }
}
