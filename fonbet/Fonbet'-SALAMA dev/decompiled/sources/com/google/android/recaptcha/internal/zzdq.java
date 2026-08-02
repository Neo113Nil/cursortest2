package com.google.android.recaptcha.internal;

import C6.o;
import D6.E;
import i6.InterfaceC1287d;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import t6.h;

/* loaded from: classes.dex */
public final class zzdq {
    private final zzav zza;

    public zzdq(zzav zzavVar, zzdo zzdoVar) {
        this.zza = zzavVar;
    }

    public final Object zza(String str, zzqt zzqtVar, zzdc zzdcVar, InterfaceC1287d interfaceC1287d) {
        return E.e(new zzdp(this, str, zzqtVar, zzdcVar, null), interfaceC1287d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzb(zzpq zzpqVar, zzdc zzdcVar) {
        String str;
        zzdf zzdfVar;
        try {
            String zzJ = zzpqVar.zzJ();
            String zzK = zzpqVar.zzK();
            boolean zzd = this.zza.zzd(zzK);
            zzdf zzdfVar2 = zzd;
            if (zzd == 1) {
                zzdf zzf = zzdcVar.zzf(25);
                try {
                    str = this.zza.zza(zzK);
                } catch (Exception unused) {
                    zzf.zzb(new zzbj(zzbh.zzk, zzbg.zzR, null));
                }
                if (str != null) {
                    zzf.zza();
                    zzdfVar = zzf;
                    if (str == null) {
                        try {
                            this.zza.zzb();
                            zzdf zzf2 = zzdcVar.zzf(23);
                            try {
                                try {
                                    URLConnection openConnection = new URL(zzJ).openConnection();
                                    h.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
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
                                        for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                                            stringWriter.write(cArr, 0, read);
                                        }
                                        str = stringWriter.toString();
                                        h.d(str, "toString(...)");
                                        zzf2.zza();
                                        zzdf zzf3 = zzdcVar.zzf(24);
                                        try {
                                            this.zza.zzc(zzK, str);
                                            zzf3.zza();
                                        } catch (Exception unused2) {
                                            zzf3.zzb(new zzbj(zzbh.zzk, zzbg.zzT, null));
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
                    return o.y0(zzpqVar.zzk(), "JAVASCRIPT_TAG", str);
                }
                zzf.zzb(new zzbj(zzbh.zzk, zzbg.zzS, null));
                zzdfVar2 = zzf;
            }
            str = null;
            zzdfVar = zzdfVar2;
            if (str == null) {
            }
            return o.y0(zzpqVar.zzk(), "JAVASCRIPT_TAG", str);
        } catch (Exception e8) {
            if (e8 instanceof zzbj) {
                throw e8;
            }
            throw new zzbj(zzbh.zzb, zzbg.zzL, null);
        }
    }
}
