package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzgx implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgy zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzgv zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    public zzgx(com.google.android.gms.measurement.internal.zzgy zzgyVar, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.zzgv zzgvVar) {
        java.util.Objects.requireNonNull(zzgyVar);
        this.zza = zzgyVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgvVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzgvVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f4: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:80:0x00f3 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f8: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:77:0x00f7 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.net.HttpURLConnection httpURLConnection;
        java.util.Map map;
        java.io.IOException iOException;
        java.util.Map map2;
        int i;
        com.google.android.gms.measurement.internal.zzgw zzgwVar;
        com.google.android.gms.measurement.internal.zzhy zzhyVar;
        int i2;
        java.net.URLConnection openConnection;
        int responseCode;
        java.util.Map map3;
        java.util.Map map4;
        java.io.InputStream inputStream;
        com.google.android.gms.measurement.internal.zzgy zzgyVar = this.zza;
        zzgyVar.zzaX();
        java.io.OutputStream outputStream = null;
        try {
            java.net.URL url = this.zzb;
            int i3 = com.google.android.gms.internal.measurement.zzcj.zzb;
            openConnection = url.openConnection();
        } catch (java.io.IOException e) {
            iOException = e;
            httpURLConnection = null;
            map2 = null;
        } catch (java.lang.Throwable th) {
            th = th;
            httpURLConnection = null;
            map = null;
        }
        if (!(openConnection instanceof java.net.HttpURLConnection)) {
            throw new java.io.IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (java.net.HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        com.google.android.gms.measurement.internal.zzib zzibVar = zzgyVar.zzu;
        zzibVar.zzc();
        httpURLConnection.setConnectTimeout(60000);
        zzibVar.zzc();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            java.util.Map map5 = this.zzf;
            if (map5 != null) {
                for (java.util.Map.Entry entry : map5.entrySet()) {
                    httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
            byte[] bArr = this.zzc;
            if (bArr != null) {
                byte[] zzv = zzgyVar.zzg.zzp().zzv(bArr);
                com.google.android.gms.measurement.internal.zzgr zzk = zzibVar.zzaV().zzk();
                int length = zzv.length;
                zzk.zzb("Uploading data. size", java.lang.Integer.valueOf(length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                java.io.OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(zzv);
                    outputStream2.close();
                } catch (java.io.IOException e2) {
                    iOException = e2;
                    map2 = null;
                    outputStream = outputStream2;
                    i2 = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    com.google.android.gms.measurement.internal.zzgy zzgyVar2 = this.zza;
                    java.lang.String str = this.zze;
                    com.google.android.gms.measurement.internal.zzgv zzgvVar = this.zzd;
                    zzhyVar = zzgyVar2.zzu.zzaW();
                    zzgwVar = new com.google.android.gms.measurement.internal.zzgw(str, zzgvVar, i2, iOException, null, map2, null);
                    zzhyVar.zzj(zzgwVar);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    map = null;
                    outputStream = outputStream2;
                    i = 0;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzgw(this.zze, this.zzd, i, null, null, map, null));
                    throw th;
                }
            }
            responseCode = httpURLConnection.getResponseCode();
        } catch (java.io.IOException e3) {
            iOException = e3;
            map2 = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            map = null;
        }
        try {
            try {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr2);
                            if (read <= 0) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        com.google.android.gms.measurement.internal.zzgy zzgyVar3 = this.zza;
                        java.lang.String str2 = this.zze;
                        com.google.android.gms.measurement.internal.zzgv zzgvVar2 = this.zzd;
                        zzhyVar = zzgyVar3.zzu.zzaW();
                        zzgwVar = new com.google.android.gms.measurement.internal.zzgw(str2, zzgvVar2, responseCode, null, byteArray, headerFields, null);
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
            } catch (java.io.IOException e4) {
                e = e4;
                i2 = responseCode;
                map2 = map4;
                iOException = e;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e5) {
                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgt.zzl(this.zze), e5);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                com.google.android.gms.measurement.internal.zzgy zzgyVar22 = this.zza;
                java.lang.String str3 = this.zze;
                com.google.android.gms.measurement.internal.zzgv zzgvVar3 = this.zzd;
                zzhyVar = zzgyVar22.zzu.zzaW();
                zzgwVar = new com.google.android.gms.measurement.internal.zzgw(str3, zzgvVar3, i2, iOException, null, map2, null);
                zzhyVar.zzj(zzgwVar);
            } catch (java.lang.Throwable th6) {
                th = th6;
                i = responseCode;
                map = map3;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e6) {
                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgt.zzl(this.zze), e6);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzgw(this.zze, this.zzd, i, null, null, map, null));
                throw th;
            }
        } catch (java.io.IOException e7) {
            e = e7;
            map2 = null;
            i2 = responseCode;
            iOException = e;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            com.google.android.gms.measurement.internal.zzgy zzgyVar222 = this.zza;
            java.lang.String str32 = this.zze;
            com.google.android.gms.measurement.internal.zzgv zzgvVar32 = this.zzd;
            zzhyVar = zzgyVar222.zzu.zzaW();
            zzgwVar = new com.google.android.gms.measurement.internal.zzgw(str32, zzgvVar32, i2, iOException, null, map2, null);
            zzhyVar.zzj(zzgwVar);
        } catch (java.lang.Throwable th7) {
            th = th7;
            i = responseCode;
            map = null;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzgw(this.zze, this.zzd, i, null, null, map, null));
            throw th;
        }
        zzhyVar.zzj(zzgwVar);
    }
}
