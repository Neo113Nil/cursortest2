package com.google.android.recaptcha.internal;

import C6.o;
import D6.E;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import p065i6.d;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzdq {
    private final zzav zza;

    public zzdq(zzav zzavVar, zzdo zzdoVar) {
        this.zza = zzavVar;
    }

    public final Object zza(String str, zzqt zzqtVar, zzdc zzdcVar, d dVar) {
        return E.e(new zzdp(this, str, zzqtVar, zzdcVar, null), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final String zzb(zzpq zzpqVar, zzdc zzdcVar) throws Exception {
        String string;
        zzdf zzdfVar;
        zzdf zzdfVarZzf;
        try {
            String strZzJ = zzpqVar.zzJ();
            String strZzK = zzpqVar.zzK();
            boolean zZzd = this.zza.zzd(strZzK);
            ?? r7 = zZzd;
            if (zZzd) {
                zzdfVarZzf = zzdcVar.zzf(25);
                try {
                    string = this.zza.zza(strZzK);
                    if (string != null) {
                        zzdfVarZzf.zza();
                    }
                } catch (Exception unused) {
                    zzdfVarZzf.zzb(new zzbj(zzbh.zzk, zzbg.zzR, null));
                }
                zzdfVarZzf.zzb(new zzbj(zzbh.zzk, zzbg.zzS, null));
                r7 = zzdfVarZzf;
                string = null;
                zzdfVar = r7;
            } else {
                string = null;
                zzdfVar = r7;
            }
            if (string == null) {
                try {
                    zzdfVar = zzdfVarZzf;
                    this.zza.zzb();
                    zzdf zzdfVarZzf2 = zzdcVar.zzf(23);
                    try {
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL(strZzJ).openConnection();
                            h.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new zzbj(zzbh.zzc, new zzbg(httpURLConnection.getResponseCode()), null);
                            }
                            try {
                                InputStreamReader inputStreamReader = "gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream());
                                StringWriter stringWriter = new StringWriter();
                                char[] cArr = new char[8192];
                                for (int i7 = inputStreamReader.read(cArr); i7 >= 0; i7 = inputStreamReader.read(cArr)) {
                                    stringWriter.write(cArr, 0, i7);
                                }
                                string = stringWriter.toString();
                                h.d(string, "toString(...)");
                                zzdfVarZzf2.zza();
                                zzdf zzdfVarZzf3 = zzdcVar.zzf(24);
                                try {
                                    this.zza.zzc(strZzK, string);
                                    zzdfVarZzf3.zza();
                                } catch (Exception unused2) {
                                    zzdfVarZzf3.zzb(new zzbj(zzbh.zzk, zzbg.zzT, null));
                                }
                            } catch (Exception unused3) {
                                throw new zzbj(zzbh.zzc, zzbg.zzP, null);
                            }
                        } catch (Exception unused4) {
                            throw new zzbj(zzbh.zzc, zzbg.zzO, null);
                        }
                    } catch (Exception unused5) {
                        throw new zzbj(zzbh.zzb, zzbg.zzN, null);
                    }
                } catch (zzbj e7) {
                    zzdfVar.zzb(e7);
                    throw e7;
                }
            }
            zzdfVar = zzdfVarZzf;
            return o.y0(zzpqVar.zzk(), "JAVASCRIPT_TAG", string);
        } catch (Exception e8) {
            if (e8 instanceof zzbj) {
                throw e8;
            }
            throw new zzbj(zzbh.zzb, zzbg.zzL, null);
        }
    }
}
