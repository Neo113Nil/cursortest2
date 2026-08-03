package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyh implements com.google.android.gms.internal.ads.zzabz, com.google.android.gms.internal.ads.zzwz {
    final /* synthetic */ com.google.android.gms.internal.ads.zzyq zza;
    private final long zzb;
    private final android.net.Uri zzc;
    private final com.google.android.gms.internal.ads.zzim zzd;
    private final com.google.android.gms.internal.ads.zzyd zze;
    private final com.google.android.gms.internal.ads.zzagb zzf;
    private final com.google.android.gms.internal.ads.zzds zzg;
    private final com.google.android.gms.internal.ads.zzagy zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private com.google.android.gms.internal.ads.zzht zzl;
    private com.google.android.gms.internal.ads.zzahk zzm;
    private boolean zzn;

    public zzyh(com.google.android.gms.internal.ads.zzyq zzyqVar, android.net.Uri uri, com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzyd zzydVar, com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzds zzdsVar) {
        java.util.Objects.requireNonNull(zzyqVar);
        this.zza = zzyqVar;
        this.zzc = uri;
        this.zzd = new com.google.android.gms.internal.ads.zzim(zzhpVar);
        this.zze = zzydVar;
        this.zzf = zzagbVar;
        this.zzg = zzdsVar;
        this.zzh = new com.google.android.gms.internal.ads.zzagy();
        this.zzj = true;
        this.zzb = com.google.android.gms.internal.ads.zzxb.zza();
        this.zzl = zzi(0L, null);
    }

    private final com.google.android.gms.internal.ads.zzht zzi(long j, java.lang.String str) {
        java.util.Map map;
        map = com.google.android.gms.internal.ads.zzyq.zzb;
        if (str != null && !str.startsWith("W/")) {
            com.google.android.gms.internal.ads.zzgwo zzgwoVar = new com.google.android.gms.internal.ads.zzgwo();
            zzgwoVar.zzb(map.entrySet());
            zzgwoVar.zza(com.google.common.net.HttpHeaders.IF_RANGE, str);
            map = zzgwoVar.zzd();
        }
        com.google.android.gms.internal.ads.zzhs zzhsVar = new com.google.android.gms.internal.ads.zzhs();
        zzhsVar.zza(this.zzc);
        zzhsVar.zzc(j);
        zzhsVar.zzd(6);
        zzhsVar.zzb(map);
        return zzhsVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020b A[EDGE_INSN: B:101:0x020b->B:81:0x020b BREAK  A[LOOP:1: B:62:0x01d4->B:73:0x01d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127 A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180 A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c6 A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #4 {all -> 0x0229, blocks: (B:7:0x000d, B:9:0x0039, B:11:0x0047, B:13:0x004d, B:16:0x0059, B:17:0x005f, B:20:0x007a, B:22:0x0080, B:26:0x00bf, B:28:0x00c9, B:29:0x00d5, B:31:0x00df, B:32:0x00eb, B:34:0x00f5, B:35:0x0101, B:37:0x010b, B:38:0x011d, B:40:0x0127, B:42:0x012d, B:46:0x016a, B:47:0x0173, B:49:0x0180, B:51:0x0188, B:52:0x01a3, B:54:0x01bf, B:55:0x01c2, B:57:0x01c6, B:109:0x0137, B:112:0x0155, B:121:0x008c, B:124:0x00aa), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022f  */
    @Override // com.google.android.gms.internal.ads.zzabz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() throws java.io.IOException {
        int i;
        boolean z;
        int i2;
        java.util.List list;
        java.lang.String str;
        java.util.List list2;
        java.lang.String str2;
        java.util.List list3;
        java.lang.String str3;
        java.util.List list4;
        boolean z2;
        java.util.List list5;
        int i3;
        com.google.android.gms.internal.ads.zzhp zzhpVar;
        com.google.android.gms.internal.ads.zzyq zzyqVar;
        com.google.android.gms.internal.ads.zzhp zzhpVar2;
        com.google.android.gms.internal.ads.zzv zzvVar;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        java.lang.String str4 = null;
        while (i7 == 0 && !this.zzi) {
            try {
                long j = this.zzh.zza;
                com.google.android.gms.internal.ads.zzht zzi = zzi(j, str4);
                this.zzl = zzi;
                com.google.android.gms.internal.ads.zzim zzimVar = this.zzd;
                long zzb = zzimVar.zzb(zzi);
                if (this.zzi) {
                    com.google.android.gms.internal.ads.zzyd zzydVar = this.zze;
                    if (zzydVar.zzd() != -1) {
                        this.zzh.zza = zzydVar.zzd();
                    }
                    com.google.android.gms.internal.ads.zzhr.zza(this.zzd);
                    return;
                }
                java.util.List list6 = (java.util.List) zzimVar.zzj().get(com.google.common.net.HttpHeaders.ETAG);
                str4 = (list6 == null || list6.isEmpty()) ? null : (java.lang.String) list6.get(i6);
                if (zzb != -1) {
                    zzb += j;
                    this.zza.zzH();
                }
                long j2 = zzb;
                com.google.android.gms.internal.ads.zzyq zzyqVar2 = this.zza;
                java.util.Map zzj = zzimVar.zzj();
                java.util.List list7 = (java.util.List) zzj.get("icy-br");
                if (list7 != null) {
                    java.lang.String str5 = (java.lang.String) list7.get(i6);
                    try {
                        i5 = java.lang.Integer.parseInt(str5) * 1000;
                    } catch (java.lang.NumberFormatException unused) {
                        i5 = -1;
                    }
                    if (i5 > 0) {
                        i2 = i5;
                        z = true;
                        list = (java.util.List) zzj.get("icy-genre");
                        if (list != null) {
                            str = (java.lang.String) list.get(i6);
                            z = true;
                        } else {
                            str = null;
                        }
                        list2 = (java.util.List) zzj.get("icy-name");
                        if (list2 != null) {
                            str2 = (java.lang.String) list2.get(i6);
                            z = true;
                        } else {
                            str2 = null;
                        }
                        list3 = (java.util.List) zzj.get("icy-url");
                        if (list3 != null) {
                            str3 = (java.lang.String) list3.get(i6);
                            z = true;
                        } else {
                            str3 = null;
                        }
                        list4 = (java.util.List) zzj.get("icy-pub");
                        if (list4 != null) {
                            z2 = ((java.lang.String) list4.get(i6)).equals("1");
                            z = true;
                        } else {
                            z2 = false;
                        }
                        list5 = (java.util.List) zzj.get("icy-metaint");
                        if (list5 != null) {
                            java.lang.String str6 = (java.lang.String) list5.get(i6);
                            try {
                                i4 = java.lang.Integer.parseInt(str6);
                            } catch (java.lang.NumberFormatException unused2) {
                                i4 = -1;
                            }
                            if (i4 > 0) {
                                i3 = i4;
                                z = true;
                                zzyqVar2.zzP(z ? new com.google.android.gms.internal.ads.zzajd(i2, str, str2, str3, z2, i3) : null);
                                zzhpVar = this.zzd;
                                zzyqVar = this.zza;
                                if (zzyqVar.zzO() != null || zzyqVar.zzO().zzf == -1) {
                                    zzhpVar2 = zzhpVar;
                                } else {
                                    com.google.android.gms.internal.ads.zzhp zzxaVar = new com.google.android.gms.internal.ads.zzxa(zzhpVar, zzyqVar.zzO().zzf, this);
                                    com.google.android.gms.internal.ads.zzahk zzx = zzyqVar.zzx();
                                    this.zzm = zzx;
                                    zzvVar = com.google.android.gms.internal.ads.zzyq.zzc;
                                    zzx.zzA(zzvVar);
                                    zzhpVar2 = zzxaVar;
                                }
                                com.google.android.gms.internal.ads.zzyd zzydVar2 = this.zze;
                                zzydVar2.zza(zzhpVar2, this.zzc, zzhpVar.zzj(), j, j2, this.zzf);
                                if (zzyqVar.zzO() != null) {
                                    zzydVar2.zzc();
                                }
                                if (this.zzj) {
                                    zzydVar2.zze(j, this.zzk);
                                    try {
                                        this.zzj = false;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        i = 0;
                                        if (i != 1) {
                                        }
                                        com.google.android.gms.internal.ads.zzhr.zza(this.zzd);
                                        throw th;
                                    }
                                }
                                long j3 = j;
                                i = 0;
                                while (true) {
                                    if (i != 0) {
                                        break;
                                    }
                                    try {
                                        if (this.zzi) {
                                            i = 0;
                                            break;
                                        }
                                        try {
                                            com.google.android.gms.internal.ads.zzds zzdsVar = this.zzg;
                                            zzdsVar.zzc();
                                            i = zzydVar2.zzf(this.zzh);
                                            long zzd = zzydVar2.zzd();
                                            if (zzd > zzyqVar.zzL() + j3) {
                                                zzdsVar.zzb();
                                                zzyqVar.zzN().post(zzyqVar.zzM());
                                                j3 = zzd;
                                            }
                                        } catch (java.lang.InterruptedException unused3) {
                                            throw new java.io.InterruptedIOException();
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        if (i != 1) {
                                            com.google.android.gms.internal.ads.zzyd zzydVar3 = this.zze;
                                            if (zzydVar3.zzd() != -1) {
                                                this.zzh.zza = zzydVar3.zzd();
                                            }
                                        }
                                        com.google.android.gms.internal.ads.zzhr.zza(this.zzd);
                                        throw th;
                                    }
                                }
                                if (i == 1) {
                                    i7 = 0;
                                } else {
                                    if (zzydVar2.zzd() != -1) {
                                        this.zzh.zza = zzydVar2.zzd();
                                    }
                                    i7 = i;
                                }
                                com.google.android.gms.internal.ads.zzhr.zza(zzhpVar);
                                i6 = 0;
                            } else {
                                try {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str6).length() + 27);
                                    sb.append("Invalid metadata interval: ");
                                    sb.append(str6);
                                    com.google.android.gms.internal.ads.zzeg.zzc("IcyHeaders", sb.toString());
                                } catch (java.lang.NumberFormatException unused4) {
                                    java.lang.String.valueOf(str6);
                                    com.google.android.gms.internal.ads.zzeg.zzc("IcyHeaders", "Invalid metadata interval: ".concat(java.lang.String.valueOf(str6)));
                                    i3 = i4;
                                    zzyqVar2.zzP(z ? new com.google.android.gms.internal.ads.zzajd(i2, str, str2, str3, z2, i3) : null);
                                    zzhpVar = this.zzd;
                                    zzyqVar = this.zza;
                                    if (zzyqVar.zzO() != null) {
                                    }
                                    zzhpVar2 = zzhpVar;
                                    com.google.android.gms.internal.ads.zzyd zzydVar22 = this.zze;
                                    zzydVar22.zza(zzhpVar2, this.zzc, zzhpVar.zzj(), j, j2, this.zzf);
                                    if (zzyqVar.zzO() != null) {
                                    }
                                    if (this.zzj) {
                                    }
                                    long j32 = j;
                                    i = 0;
                                    while (true) {
                                        if (i != 0) {
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                    com.google.android.gms.internal.ads.zzhr.zza(zzhpVar);
                                    i6 = 0;
                                }
                            }
                        }
                        i3 = -1;
                        zzyqVar2.zzP(z ? new com.google.android.gms.internal.ads.zzajd(i2, str, str2, str3, z2, i3) : null);
                        zzhpVar = this.zzd;
                        zzyqVar = this.zza;
                        if (zzyqVar.zzO() != null) {
                        }
                        zzhpVar2 = zzhpVar;
                        com.google.android.gms.internal.ads.zzyd zzydVar222 = this.zze;
                        zzydVar222.zza(zzhpVar2, this.zzc, zzhpVar.zzj(), j, j2, this.zzf);
                        if (zzyqVar.zzO() != null) {
                        }
                        if (this.zzj) {
                        }
                        long j322 = j;
                        i = 0;
                        while (true) {
                            if (i != 0) {
                            }
                        }
                        if (i == 1) {
                        }
                        com.google.android.gms.internal.ads.zzhr.zza(zzhpVar);
                        i6 = 0;
                    } else {
                        try {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str5).length() + 17);
                            sb2.append("Invalid bitrate: ");
                            sb2.append(str5);
                            com.google.android.gms.internal.ads.zzeg.zzc("IcyHeaders", sb2.toString());
                        } catch (java.lang.NumberFormatException unused5) {
                            java.lang.String.valueOf(str5);
                            com.google.android.gms.internal.ads.zzeg.zzc("IcyHeaders", "Invalid bitrate header: ".concat(java.lang.String.valueOf(str5)));
                            i2 = i5;
                            z = false;
                            list = (java.util.List) zzj.get("icy-genre");
                            if (list != null) {
                            }
                            list2 = (java.util.List) zzj.get("icy-name");
                            if (list2 != null) {
                            }
                            list3 = (java.util.List) zzj.get("icy-url");
                            if (list3 != null) {
                            }
                            list4 = (java.util.List) zzj.get("icy-pub");
                            if (list4 != null) {
                            }
                            list5 = (java.util.List) zzj.get("icy-metaint");
                            if (list5 != null) {
                            }
                            i3 = -1;
                            zzyqVar2.zzP(z ? new com.google.android.gms.internal.ads.zzajd(i2, str, str2, str3, z2, i3) : null);
                            zzhpVar = this.zzd;
                            zzyqVar = this.zza;
                            if (zzyqVar.zzO() != null) {
                            }
                            zzhpVar2 = zzhpVar;
                            com.google.android.gms.internal.ads.zzyd zzydVar2222 = this.zze;
                            zzydVar2222.zza(zzhpVar2, this.zzc, zzhpVar.zzj(), j, j2, this.zzf);
                            if (zzyqVar.zzO() != null) {
                            }
                            if (this.zzj) {
                            }
                            long j3222 = j;
                            i = 0;
                            while (true) {
                                if (i != 0) {
                                }
                            }
                            if (i == 1) {
                            }
                            com.google.android.gms.internal.ads.zzhr.zza(zzhpVar);
                            i6 = 0;
                        }
                    }
                }
                z = false;
                i2 = -1;
                list = (java.util.List) zzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (java.util.List) zzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (java.util.List) zzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (java.util.List) zzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (java.util.List) zzj.get("icy-metaint");
                if (list5 != null) {
                }
                i3 = -1;
                zzyqVar2.zzP(z ? new com.google.android.gms.internal.ads.zzajd(i2, str, str2, str3, z2, i3) : null);
                zzhpVar = this.zzd;
                zzyqVar = this.zza;
                if (zzyqVar.zzO() != null) {
                }
                zzhpVar2 = zzhpVar;
                com.google.android.gms.internal.ads.zzyd zzydVar22222 = this.zze;
                zzydVar22222.zza(zzhpVar2, this.zzc, zzhpVar.zzj(), j, j2, this.zzf);
                if (zzyqVar.zzO() != null) {
                }
                if (this.zzj) {
                }
                long j32222 = j;
                i = 0;
                while (true) {
                    if (i != 0) {
                    }
                }
                if (i == 1) {
                }
                com.google.android.gms.internal.ads.zzhr.zza(zzhpVar);
                i6 = 0;
            } catch (java.lang.Throwable th3) {
                th = th3;
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

    final /* synthetic */ com.google.android.gms.internal.ads.zzim zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzht zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zza(com.google.android.gms.internal.ads.zzet zzetVar) {
        long max = !this.zzn ? this.zzk : java.lang.Math.max(this.zza.zzI(true), this.zzk);
        int zzd = zzetVar.zzd();
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzm;
        zzahkVar.getClass();
        zzahkVar.zzc(zzetVar, zzd);
        zzahkVar.zze(max, 1, zzd, 0, null);
        this.zzn = true;
    }
}
