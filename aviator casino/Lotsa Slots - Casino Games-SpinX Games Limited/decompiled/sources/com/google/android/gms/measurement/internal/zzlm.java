package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzln zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzlk zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    public zzlm(com.google.android.gms.measurement.internal.zzln zzlnVar, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.zzlk zzlkVar) {
        java.util.Objects.requireNonNull(zzlnVar);
        this.zza = zzlnVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlkVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzlkVar;
        this.zze = str;
        this.zzf = map;
    }

    private final void zzb(final int i, final java.lang.Exception exc, final byte[] bArr, final java.util.Map map) {
        this.zza.zzu.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzll
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzlm.this.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.net.HttpURLConnection httpURLConnection;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        java.util.Map map4;
        ?? r5;
        ?? r52;
        int responseCode;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.io.InputStream inputStream;
        com.google.android.gms.measurement.internal.zzln zzlnVar = this.zza;
        zzlnVar.zzaX();
        int i = 0;
        try {
            java.net.URL url = this.zzb;
            int i2 = com.google.android.gms.internal.measurement.zzcj.zzb;
            java.net.URLConnection openConnection = url.openConnection();
            if (!(openConnection instanceof java.net.HttpURLConnection)) {
                throw new java.io.IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            com.google.android.gms.measurement.internal.zzib zzibVar = zzlnVar.zzu;
            zzibVar.zzc();
            httpURLConnection.setConnectTimeout(60000);
            zzibVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r53 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    java.util.Map map5 = this.zzf;
                    if (map5 != null) {
                        for (java.util.Map.Entry entry : map5.entrySet()) {
                            httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            zzibVar.zzaU();
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            com.google.android.gms.measurement.internal.zzgr zzk = this.zza.zzu.zzaV().zzk();
                            int length = byteArray.length;
                            zzk.zzb("Uploading data. size", java.lang.Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                                r53 = outputStream;
                            } catch (java.io.IOException e) {
                                e = e;
                                map3 = null;
                                r52 = outputStream;
                                if (r52 != 0) {
                                }
                                if (httpURLConnection != null) {
                                }
                                zzb(i, e, null, map3);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                map4 = null;
                                r5 = outputStream;
                                if (r5 != 0) {
                                }
                                if (httpURLConnection != null) {
                                }
                                zzb(i, null, null, map4);
                                throw th;
                            }
                        } catch (java.io.IOException e2) {
                            this.zza.zzu.zzaV().zzb().zzb("Failed to gzip post request content", e2);
                            throw e2;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    map = null;
                    map4 = map;
                    r5 = map;
                    if (r5 != 0) {
                        try {
                            r5.close();
                        } catch (java.io.IOException e3) {
                            this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgt.zzl(this.zze), e3);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i, null, null, map4);
                    throw th;
                }
            } catch (java.io.IOException e4) {
                e = e4;
                map2 = null;
                map3 = map2;
                r52 = map2;
                if (r52 != 0) {
                    try {
                        r52.close();
                    } catch (java.io.IOException e5) {
                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgt.zzl(this.zze), e5);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(i, e, null, map3);
            }
            try {
                try {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr2);
                                if (read <= 0) {
                                    break;
                                } else {
                                    byteArrayOutputStream2.write(bArr2, 0, read);
                                }
                            }
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(responseCode, null, byteArray2, headerFields);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                } catch (java.io.IOException e6) {
                    e = e6;
                    map3 = r53;
                    obj2 = null;
                    java.io.IOException iOException = e;
                    i = responseCode;
                    e = iOException;
                    r52 = obj2;
                    if (r52 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzb(i, e, null, map3);
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    map4 = r53;
                    obj = null;
                    java.lang.Throwable th6 = th;
                    i = responseCode;
                    th = th6;
                    r5 = obj;
                    if (r5 != 0) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzb(i, null, null, map4);
                    throw th;
                }
            } catch (java.io.IOException e7) {
                e = e7;
                obj2 = null;
                map3 = null;
                java.io.IOException iOException2 = e;
                i = responseCode;
                e = iOException2;
                r52 = obj2;
                if (r52 != 0) {
                }
                if (httpURLConnection != null) {
                }
                zzb(i, e, null, map3);
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = null;
                map4 = null;
                java.lang.Throwable th62 = th;
                i = responseCode;
                th = th62;
                r5 = obj;
                if (r5 != 0) {
                }
                if (httpURLConnection != null) {
                }
                zzb(i, null, null, map4);
                throw th;
            }
        } catch (java.io.IOException e8) {
            e = e8;
            httpURLConnection = null;
            map2 = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }

    final /* synthetic */ void zza(int i, java.lang.Exception exc, byte[] bArr, java.util.Map map) {
        this.zzd.zza(this.zze, i, exc, bArr, map);
    }
}
