package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zzaeo {
    private static final boolean zza(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzael<?> zzaelVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (zza(responseCode)) {
                    zzaelVar.zza((zzadt) zzadr.zza(string, type));
                } else {
                    zzaelVar.zza((String) zzadr.zza(string, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzabg e7) {
                e = e7;
                zzaelVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzaelVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e8) {
                e = e8;
                zzaelVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static void zza(String str, zzael<?> zzaelVar, Type type, zzadu zzaduVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaduVar.zza(httpURLConnection);
            zza(httpURLConnection, zzaelVar, type);
        } catch (SocketTimeoutException unused) {
            zzaelVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzaelVar.zza("<<Network Error>>");
        } catch (IOException e7) {
            zzaelVar.zza(e7.getMessage());
        }
    }

    public static void zza(String str, zzadq zzadqVar, zzael<?> zzaelVar, Type type, zzadu zzaduVar) {
        try {
            D.i(zzadqVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzadqVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaduVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzaelVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            zzaelVar.zza("TIMEOUT");
        } catch (IOException e7) {
            e = e7;
            zzaelVar.zza(e.getMessage());
        } catch (NullPointerException e8) {
            e = e8;
            zzaelVar.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            zzaelVar.zza("<<Network Error>>");
        } catch (JSONException e9) {
            e = e9;
            zzaelVar.zza(e.getMessage());
        }
    }
}
