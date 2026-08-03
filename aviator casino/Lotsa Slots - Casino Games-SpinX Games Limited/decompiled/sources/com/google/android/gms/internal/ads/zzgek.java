package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgek implements com.google.android.gms.internal.ads.zzgee {
    private final java.util.concurrent.ExecutorService zza;
    private final java.lang.String zzb;
    private final long zzc;

    public zzgek(java.util.concurrent.ExecutorService executorService, java.lang.String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    private final com.google.common.util.concurrent.ListenableFuture zze(final java.lang.String str, final boolean z, final byte[] bArr, final java.lang.String str2) {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: com.google.android.gms.internal.ads.zzgeh
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final /* synthetic */ java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return com.google.android.gms.internal.ads.zzgek.this.zzc(str, z, str2, bArr, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zzd(java.lang.String str, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, boolean z, java.lang.String str2, byte[] bArr) {
        java.lang.Throwable th;
        java.net.SocketTimeoutException e;
        final java.net.HttpURLConnection httpURLConnection;
        byte[] byteArray;
        java.net.HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (java.net.HttpURLConnection) java.net.URI.create(str).toURL().openConnection();
                try {
                    java.util.Objects.requireNonNull(httpURLConnection);
                    completer.addCancellationListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgei
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            httpURLConnection.disconnect();
                        }
                    }, this.zza);
                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.zzb);
                    int i = (int) this.zzc;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    if (z) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        if (str2 != null) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    java.io.InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    try {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        try {
                            if (inputStream == null) {
                                byteArray = new byte[0];
                                byteArrayOutputStream.close();
                            } else {
                                byte[] bArr2 = new byte[4096];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                inputStream.close();
                            }
                            completer.set(new com.google.android.gms.internal.ads.zzgej(responseCode, byteArray));
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.net.SocketTimeoutException e2) {
                    e = e2;
                    httpURLConnection2 = httpURLConnection;
                    java.lang.String message = e.getMessage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 9);
                    sb.append("Timeout: ");
                    sb.append(message);
                    completer.setException(new java.util.concurrent.TimeoutException(sb.toString()));
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    completer.setException(th);
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                }
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        } catch (java.net.SocketTimeoutException e3) {
            e = e3;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.String str, byte[] bArr, java.lang.String str2) {
        return zze(str, true, bArr, com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF);
    }

    final /* synthetic */ java.lang.Object zzc(final java.lang.String str, final boolean z, final java.lang.String str2, final byte[] bArr, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        this.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgeg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgek.this.zzd(str, completer, z, str2, bArr);
            }
        });
        return "";
    }
}
