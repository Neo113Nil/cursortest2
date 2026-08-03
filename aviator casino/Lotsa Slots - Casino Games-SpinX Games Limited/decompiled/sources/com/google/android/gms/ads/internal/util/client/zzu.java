package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzu implements com.google.android.gms.ads.internal.util.client.zze {
    private final android.content.Context zza;
    private final java.lang.String zzb;
    private java.lang.String zzc;

    public zzu(android.content.Context context, java.lang.String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final java.net.URL zzd(java.lang.String str) throws java.net.MalformedURLException {
        java.net.URL url = null;
        try {
            url = new java.net.URI(str).toURL();
        } catch (java.lang.IllegalArgumentException e) {
            e = e;
            zzf(str, e);
        } catch (java.net.MalformedURLException e2) {
            e = e2;
            zzf(str, e);
        } catch (java.net.URISyntaxException e3) {
            zzf(str, e3);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzf)).booleanValue()) {
                url = zze(str);
            }
        }
        if (url != null) {
            return url;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        return new java.net.URL(str);
    }

    private final java.net.URL zze(java.lang.String str) {
        java.net.URL url;
        try {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            java.net.URL url2 = new java.net.URL(str);
            java.net.URI uri = new java.net.URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                java.lang.String obj = uri.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 114 + obj.length());
                sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb.append(str);
                sb.append("\" -> encoded URI: ");
                sb.append(obj);
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
            } catch (java.lang.IllegalArgumentException e) {
                e = e;
                zzf(str, e);
                return url;
            } catch (java.net.MalformedURLException e2) {
                e = e2;
                zzf(str, e);
                return url;
            } catch (java.net.URISyntaxException e3) {
                e = e3;
                zzf(str, e);
                return url;
            }
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException | java.net.URISyntaxException e4) {
            e = e4;
            url = null;
        }
        return url;
    }

    private final void zzf(java.lang.String str, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 32 + java.lang.String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        com.google.android.gms.internal.ads.zzbzy.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoj)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str) {
        return zzc(str, null);
    }

    public final java.lang.String zzb() {
        return this.zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x011e, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.ads.internal.util.client.zzt zzc(java.lang.String str, java.util.Map map) {
        com.google.android.gms.ads.internal.util.client.zzt zztVar;
        com.google.android.gms.ads.internal.util.client.zzt zztVar2 = com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue() || !com.google.android.gms.ads.internal.client.zzay.zze()) {
                    try {
                        try {
                            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                                android.net.TrafficStats.setThreadStatsTag(263);
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 13);
                            sb.append("Pinging URL: ");
                            sb.append(str);
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
                            java.net.URL zzd = zzd(str);
                            int i = com.google.android.gms.internal.ads.zzfzr.zzb;
                            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) zzd.openConnection();
                            try {
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                java.lang.String str2 = this.zzb;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (java.util.Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                                    }
                                }
                                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                zzlVar.zza(httpURLConnection, null);
                                int responseCode = httpURLConnection.getResponseCode();
                                zzlVar.zzc(httpURLConnection, responseCode);
                                if (responseCode >= 200 && responseCode < 300) {
                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziY)).booleanValue()) {
                                        this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                    }
                                    zztVar = com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
                                    zztVar2 = zztVar;
                                }
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(responseCode).length() + 54 + str.length());
                                sb2.append("Received non-success response code ");
                                sb2.append(responseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(str);
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
                                if (responseCode == 502) {
                                    zztVar = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE;
                                    zztVar2 = zztVar;
                                }
                            } finally {
                                httpURLConnection.disconnect();
                            }
                        } finally {
                            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                                android.net.TrafficStats.clearThreadStatsTag();
                            }
                        }
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        e = e;
                        zzf(str, e);
                    } catch (java.net.MalformedURLException e2) {
                        e = e2;
                        zzf(str, e);
                    } catch (java.io.IOException e3) {
                        e = e3;
                        java.lang.String message = e.getMessage();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(str.length() + 27 + java.lang.String.valueOf(message).length());
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3.toString());
                        zztVar2 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE;
                    } catch (java.lang.RuntimeException e4) {
                        e = e4;
                        java.lang.String message2 = e.getMessage();
                        java.lang.StringBuilder sb32 = new java.lang.StringBuilder(str.length() + 27 + java.lang.String.valueOf(message2).length());
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb32.toString());
                        zztVar2 = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE;
                    }
                }
            }
        }
        return zztVar2;
    }
}
