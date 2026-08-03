package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaua implements com.google.android.gms.internal.ads.zzaso {
    private final com.google.android.gms.internal.ads.zzatz zzc;
    private final java.util.Map zza = new java.util.LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaua(com.google.android.gms.internal.ads.zzatz zzatzVar, int i) {
        this.zzc = zzatzVar;
    }

    static byte[] zzg(com.google.android.gms.internal.ads.zzaty zzatyVar, long j) throws java.io.IOException {
        long zza = zzatyVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new java.io.DataInputStream(zzatyVar).readFully(bArr);
                return bArr;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 33 + java.lang.String.valueOf(zza).length());
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zza);
        throw new java.io.IOException(sb.toString());
    }

    static void zzh(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int zzi(java.io.InputStream inputStream) throws java.io.IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static void zzj(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long zzk(java.io.InputStream inputStream) throws java.io.IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    static void zzl(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static java.lang.String zzm(com.google.android.gms.internal.ads.zzaty zzatyVar) throws java.io.IOException {
        return new java.lang.String(zzg(zzatyVar, zzk(zzatyVar)), "UTF-8");
    }

    private final void zzn(java.lang.String str, com.google.android.gms.internal.ads.zzatx zzatxVar) {
        java.util.Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzatxVar.zza - ((com.google.android.gms.internal.ads.zzatx) map.get(str)).zza;
        } else {
            this.zzb += zzatxVar.zza;
        }
        map.put(str, zzatxVar);
    }

    private final void zzo(java.lang.String str) {
        com.google.android.gms.internal.ads.zzatx zzatxVar = (com.google.android.gms.internal.ads.zzatx) this.zza.remove(str);
        if (zzatxVar != null) {
            this.zzb -= zzatxVar.zza;
        }
    }

    private static int zzp(java.io.InputStream inputStream) throws java.io.IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new java.io.EOFException();
    }

    private static final java.lang.String zzq(java.lang.String str) {
        int length = str.length() >> 1;
        java.lang.String valueOf = java.lang.String.valueOf(str.substring(0, length).hashCode());
        java.lang.String valueOf2 = java.lang.String.valueOf(str.substring(length).hashCode());
        java.lang.String.valueOf(valueOf);
        java.lang.String.valueOf(valueOf2);
        return java.lang.String.valueOf(valueOf).concat(java.lang.String.valueOf(valueOf2));
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final synchronized com.google.android.gms.internal.ads.zzasn zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzatx zzatxVar = (com.google.android.gms.internal.ads.zzatx) this.zza.get(str);
        if (zzatxVar == null) {
            return null;
        }
        java.io.File zzf = zzf(str);
        try {
            com.google.android.gms.internal.ads.zzaty zzatyVar = new com.google.android.gms.internal.ads.zzaty(new java.io.BufferedInputStream(new java.io.FileInputStream(zzf)), zzf.length());
            try {
                java.lang.String str2 = com.google.android.gms.internal.ads.zzatx.zza(zzatyVar).zzb;
                if (!android.text.TextUtils.equals(str, str2)) {
                    com.google.android.gms.internal.ads.zzatq.zzb("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] zzg = zzg(zzatyVar, zzatyVar.zza());
                com.google.android.gms.internal.ads.zzasn zzasnVar = new com.google.android.gms.internal.ads.zzasn();
                zzasnVar.zza = zzg;
                zzasnVar.zzb = zzatxVar.zzc;
                zzasnVar.zzc = zzatxVar.zzd;
                zzasnVar.zzd = zzatxVar.zze;
                zzasnVar.zze = zzatxVar.zzf;
                zzasnVar.zzf = zzatxVar.zzg;
                java.util.List<com.google.android.gms.internal.ads.zzasw> list = zzatxVar.zzh;
                java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
                for (com.google.android.gms.internal.ads.zzasw zzaswVar : list) {
                    treeMap.put(zzaswVar.zza(), zzaswVar.zzb());
                }
                zzasnVar.zzg = treeMap;
                zzasnVar.zzh = java.util.Collections.unmodifiableList(list);
                return zzasnVar;
            } finally {
                zzatyVar.close();
            }
        } catch (java.io.IOException e) {
            com.google.android.gms.internal.ads.zzatq.zzb("%s: %s", zzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final synchronized void zzb(java.lang.String str, com.google.android.gms.internal.ads.zzasn zzasnVar) {
        long j;
        long j2 = this.zzb;
        int length = zzasnVar.zza.length;
        long j3 = j2 + length;
        int i = this.zzd;
        if (j3 <= i || length <= i * 0.9f) {
            java.io.File zzf = zzf(str);
            try {
                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(zzf));
                com.google.android.gms.internal.ads.zzatx zzatxVar = new com.google.android.gms.internal.ads.zzatx(str, zzasnVar);
                try {
                    zzh(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzatxVar.zzb);
                    java.lang.String str2 = zzatxVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzj(bufferedOutputStream, zzatxVar.zzd);
                    zzj(bufferedOutputStream, zzatxVar.zze);
                    zzj(bufferedOutputStream, zzatxVar.zzf);
                    zzj(bufferedOutputStream, zzatxVar.zzg);
                    java.util.List<com.google.android.gms.internal.ads.zzasw> list = zzatxVar.zzh;
                    if (list != null) {
                        zzh(bufferedOutputStream, list.size());
                        for (com.google.android.gms.internal.ads.zzasw zzaswVar : list) {
                            zzl(bufferedOutputStream, zzaswVar.zza());
                            zzl(bufferedOutputStream, zzaswVar.zzb());
                        }
                    } else {
                        zzh(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzasnVar.zza);
                    bufferedOutputStream.close();
                    zzatxVar.zza = zzf.length();
                    zzn(str, zzatxVar);
                    long j4 = this.zzb;
                    int i2 = this.zzd;
                    if (j4 >= i2) {
                        boolean z = com.google.android.gms.internal.ads.zzatq.zzb;
                        if (z) {
                            com.google.android.gms.internal.ads.zzatq.zza("Pruning old cache entries.", new java.lang.Object[0]);
                        }
                        long j5 = this.zzb;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        java.util.Iterator it = this.zza.entrySet().iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j = elapsedRealtime;
                                break;
                            }
                            com.google.android.gms.internal.ads.zzatx zzatxVar2 = (com.google.android.gms.internal.ads.zzatx) ((java.util.Map.Entry) it.next()).getValue();
                            java.lang.String str3 = zzatxVar2.zzb;
                            if (zzf(str3).delete()) {
                                j = elapsedRealtime;
                                this.zzb -= zzatxVar2.zza;
                            } else {
                                j = elapsedRealtime;
                                com.google.android.gms.internal.ads.zzatq.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i3++;
                            if (this.zzb < i2 * 0.9f) {
                                break;
                            } else {
                                elapsedRealtime = j;
                            }
                        }
                        if (z) {
                            com.google.android.gms.internal.ads.zzatq.zza("pruned %d files, %d bytes, %d ms", java.lang.Integer.valueOf(i3), java.lang.Long.valueOf(this.zzb - j5), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (java.io.IOException e) {
                    com.google.android.gms.internal.ads.zzatq.zzb("%s", e.toString());
                    bufferedOutputStream.close();
                    com.google.android.gms.internal.ads.zzatq.zzb("Failed to write header for %s", zzf.getAbsolutePath());
                    throw new java.io.IOException();
                }
            } catch (java.io.IOException unused) {
                if (!zzf.delete()) {
                    com.google.android.gms.internal.ads.zzatq.zzb("Could not clean up file %s", zzf.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    com.google.android.gms.internal.ads.zzatq.zzb("Re-initializing cache after external clearing.", new java.lang.Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzc();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final synchronized void zzc() {
        java.io.File zza = this.zzc.zza();
        if (zza.exists()) {
            java.io.File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (java.io.File file : listFiles) {
                    try {
                        long length = file.length();
                        com.google.android.gms.internal.ads.zzaty zzatyVar = new com.google.android.gms.internal.ads.zzaty(new java.io.BufferedInputStream(new java.io.FileInputStream(file)), length);
                        try {
                            com.google.android.gms.internal.ads.zzatx zza2 = com.google.android.gms.internal.ads.zzatx.zza(zzatyVar);
                            zza2.zza = length;
                            zzn(zza2.zzb, zza2);
                            zzatyVar.close();
                        } catch (java.lang.Throwable th) {
                            zzatyVar.close();
                            throw th;
                        }
                    } catch (java.io.IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            com.google.android.gms.internal.ads.zzatq.zzc("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final synchronized void zzd(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzasn zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzb(str, zza);
        }
    }

    public final synchronized void zze(java.lang.String str) {
        boolean delete = zzf(str).delete();
        zzo(str);
        if (delete) {
            return;
        }
        com.google.android.gms.internal.ads.zzatq.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final java.io.File zzf(java.lang.String str) {
        return new java.io.File(this.zzc.zza(), zzq(str));
    }

    public zzaua(java.io.File file, int i) {
        this.zzc = new com.google.android.gms.internal.ads.zzatw(this, file);
    }
}
