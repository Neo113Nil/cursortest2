package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzatt implements com.google.android.gms.internal.ads.zzasx {
    protected final com.google.android.gms.internal.ads.zzatv zza;
    private final com.google.android.gms.internal.ads.zzats zzb;

    public zzatt(com.google.android.gms.internal.ads.zzats zzatsVar) {
        com.google.android.gms.internal.ads.zzatv zzatvVar = new com.google.android.gms.internal.ads.zzatv(4096);
        this.zzb = zzatsVar;
        this.zza = zzatvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0  */
    @Override // com.google.android.gms.internal.ads.zzasx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.gms.internal.ads.zzata zza(com.google.android.gms.internal.ads.zzate zzateVar) throws com.google.android.gms.internal.ads.zzatn {
        com.google.android.gms.internal.ads.zzauc zzaucVar;
        byte[] bArr;
        com.google.android.gms.internal.ads.zzatn zzaszVar;
        java.lang.String str;
        int zzo;
        java.util.Map map;
        com.google.android.gms.internal.ads.zzauc zza;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        while (true) {
            java.util.Collections.emptyList();
            try {
                com.google.android.gms.internal.ads.zzasn zzk = zzateVar.zzk();
                if (zzk == null) {
                    map = java.util.Collections.emptyMap();
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.lang.String str2 = zzk.zzb;
                    if (str2 != null) {
                        hashMap.put(com.google.common.net.HttpHeaders.IF_NONE_MATCH, str2);
                    }
                    long j = zzk.zzd;
                    if (j > 0) {
                        hashMap.put(com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE, com.google.android.gms.internal.ads.zzaub.zzc(j));
                    }
                    map = hashMap;
                }
                zza = this.zzb.zza(zzateVar, map);
            } catch (java.io.IOException e) {
                e = e;
                zzaucVar = null;
            }
            try {
                int zza2 = zza.zza();
                java.util.List zzb = zza.zzb();
                if (zza2 == 304) {
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    com.google.android.gms.internal.ads.zzasn zzk2 = zzateVar.zzk();
                    if (zzk2 == null) {
                        return new com.google.android.gms.internal.ads.zzata(304, (byte[]) null, true, elapsedRealtime2, zzb);
                    }
                    java.util.TreeSet treeSet = new java.util.TreeSet(java.lang.String.CASE_INSENSITIVE_ORDER);
                    if (!zzb.isEmpty()) {
                        java.util.Iterator it = zzb.iterator();
                        while (it.hasNext()) {
                            treeSet.add(((com.google.android.gms.internal.ads.zzasw) it.next()).zza());
                        }
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(zzb);
                    java.util.List list = zzk2.zzh;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            for (com.google.android.gms.internal.ads.zzasw zzaswVar : zzk2.zzh) {
                                if (!treeSet.contains(zzaswVar.zza())) {
                                    arrayList.add(zzaswVar);
                                }
                            }
                        }
                    } else if (!zzk2.zzg.isEmpty()) {
                        for (java.util.Map.Entry entry : zzk2.zzg.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new com.google.android.gms.internal.ads.zzasw((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
                            }
                        }
                    }
                    return new com.google.android.gms.internal.ads.zzata(304, zzk2.zza, true, elapsedRealtime2, (java.util.List) arrayList);
                }
                java.io.InputStream zzd = zza.zzd();
                if (zzd != null) {
                    int zzc = zza.zzc();
                    com.google.android.gms.internal.ads.zzatv zzatvVar = this.zza;
                    com.google.android.gms.internal.ads.zzaug zzaugVar = new com.google.android.gms.internal.ads.zzaug(zzatvVar, zzc);
                    try {
                        bArr3 = zzatvVar.zza(1024);
                        while (true) {
                            try {
                                int read = zzd.read(bArr3);
                                if (read == -1) {
                                    break;
                                }
                                zzaugVar.write(bArr3, 0, read);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                try {
                                    zzd.close();
                                    break;
                                } catch (java.io.IOException unused) {
                                    com.google.android.gms.internal.ads.zzatq.zza("Error occurred when closing InputStream", new java.lang.Object[0]);
                                }
                                zzatvVar.zzb(bArr3);
                                zzaugVar.close();
                                throw th;
                            }
                        }
                        bArr2 = zzaugVar.toByteArray();
                        try {
                            zzd.close();
                        } catch (java.io.IOException unused2) {
                            com.google.android.gms.internal.ads.zzatq.zza("Error occurred when closing InputStream", new java.lang.Object[0]);
                        }
                        zzatvVar.zzb(bArr3);
                        zzaugVar.close();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr3 = null;
                    }
                } else {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                try {
                    long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (com.google.android.gms.internal.ads.zzatq.zzb || elapsedRealtime3 > 3000) {
                        java.lang.Object[] objArr = new java.lang.Object[5];
                        objArr[0] = zzateVar;
                        objArr[1] = java.lang.Long.valueOf(elapsedRealtime3);
                        objArr[2] = bArr4 != null ? java.lang.Integer.valueOf(bArr4.length) : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
                        objArr[3] = java.lang.Integer.valueOf(zza2);
                        objArr[4] = java.lang.Integer.valueOf(zzateVar.zzy().zzb());
                        com.google.android.gms.internal.ads.zzatq.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                    }
                    if (zza2 < 200 || zza2 > 299) {
                        throw new java.io.IOException();
                    }
                    return new com.google.android.gms.internal.ads.zzata(zza2, bArr4, false, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, zzb);
                } catch (java.io.IOException e2) {
                    e = e2;
                    bArr = bArr4;
                    zzaucVar = zza;
                    if (!(e instanceof java.net.SocketTimeoutException)) {
                        zzaszVar = new com.google.android.gms.internal.ads.zzatm();
                        str = "socket";
                    } else {
                        if (e instanceof java.net.MalformedURLException) {
                            java.lang.String zzh = zzateVar.zzh();
                            java.lang.String.valueOf(zzh);
                            throw new java.lang.RuntimeException("Bad URL ".concat(java.lang.String.valueOf(zzh)), e);
                        }
                        if (zzaucVar == null) {
                            throw new com.google.android.gms.internal.ads.zzatb(e);
                        }
                        int zza3 = zzaucVar.zza();
                        com.google.android.gms.internal.ads.zzatq.zzc("Unexpected response code %d for %s", java.lang.Integer.valueOf(zza3), zzateVar.zzh());
                        if (bArr != null) {
                            com.google.android.gms.internal.ads.zzata zzataVar = new com.google.android.gms.internal.ads.zzata(zza3, bArr, false, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, zzaucVar.zzb());
                            if (zza3 != 401 && zza3 != 403) {
                                if (zza3 < 400 || zza3 > 499) {
                                    throw new com.google.android.gms.internal.ads.zzatl(zzataVar);
                                }
                                throw new com.google.android.gms.internal.ads.zzasr(zzataVar);
                            }
                            zzaszVar = new com.google.android.gms.internal.ads.zzasm(zzataVar);
                            str = "auth";
                        } else {
                            zzaszVar = new com.google.android.gms.internal.ads.zzasz();
                            str = "network";
                        }
                    }
                    com.google.android.gms.internal.ads.zzass zzy = zzateVar.zzy();
                    zzo = zzateVar.zzo();
                    try {
                        zzy.zzc(zzaszVar);
                        zzateVar.zzc(java.lang.String.format("%s-retry [timeout=%s]", str, java.lang.Integer.valueOf(zzo)));
                    } catch (com.google.android.gms.internal.ads.zzatn e3) {
                        zzateVar.zzc(java.lang.String.format("%s-timeout-giveup [timeout=%s]", str, java.lang.Integer.valueOf(zzo)));
                        throw e3;
                    }
                }
            } catch (java.io.IOException e4) {
                e = e4;
                zzaucVar = zza;
                bArr = null;
                if (!(e instanceof java.net.SocketTimeoutException)) {
                }
                com.google.android.gms.internal.ads.zzass zzy2 = zzateVar.zzy();
                zzo = zzateVar.zzo();
                zzy2.zzc(zzaszVar);
                zzateVar.zzc(java.lang.String.format("%s-retry [timeout=%s]", str, java.lang.Integer.valueOf(zzo)));
            }
            zzateVar.zzc(java.lang.String.format("%s-retry [timeout=%s]", str, java.lang.Integer.valueOf(zzo)));
        }
    }
}
