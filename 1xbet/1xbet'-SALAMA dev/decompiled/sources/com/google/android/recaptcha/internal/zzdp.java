package com.google.android.recaptcha.internal;

import D6.C;
import j6.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import p113p3.f;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
final class zzdp extends i implements Function2 {
    final /* synthetic */ zzdq zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzqt zzc;
    final /* synthetic */ zzdc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzdq zzdqVar, String str, zzqt zzqtVar, zzdc zzdcVar, d dVar) {
        super(2, dVar);
        this.zza = zzdqVar;
        this.zzb = str;
        this.zzc = zzqtVar;
        this.zzd = zzdcVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzdp(this.zza, this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdp) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws zzbj {
        String str;
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        zzdf zzdfVarZzf = this.zzd.zzf(22);
        zzqt zzqtVar = this.zzc;
        String str2 = this.zzb;
        try {
            if (!zzdt.zzb(str2)) {
                throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
            }
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
                h.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                String strEncode = URLEncoder.encode(zzqtVar.zzL(), "UTF-8");
                String strEncode2 = URLEncoder.encode(zzqtVar.zzk(), "UTF-8");
                int iZzS = zzqtVar.zzS();
                if (iZzS == 2) {
                    str = "UNSPECIFIED";
                } else if (iZzS == 3) {
                    str = "ANDROID_ONPLAY";
                } else if (iZzS != 4) {
                    str = iZzS != 5 ? "UNRECOGNIZED" : "IOS";
                } else {
                    str = "ANDROID_OFFPLAY";
                }
                byte[] bytes = ("k=" + strEncode + "&pk=" + strEncode2 + "&mst=" + URLEncoder.encode(str, "UTF-8") + "&msv=" + URLEncoder.encode(zzqtVar.zzJ(), "UTF-8") + "&msi=" + URLEncoder.encode(zzqtVar.zzK(), "UTF-8") + "&mov=" + zzqtVar.zzj() + "&mkc=" + zzqtVar.zzi()).getBytes(Charset.forName("UTF-8"));
                try {
                    try {
                        zzdr.zza(httpURLConnection);
                        try {
                            zzdr.zzd(httpURLConnection).write(bytes);
                            if (httpURLConnection.getResponseCode() == 200) {
                                try {
                                    zzpq zzpqVarZzi = zzpq.zzi(zzdr.zzc(httpURLConnection));
                                    httpURLConnection.disconnect();
                                    zzdfVarZzf.zza();
                                    return zzpqVarZzi;
                                } catch (Exception unused) {
                                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                                }
                            }
                            try {
                                int responseCode = httpURLConnection.getResponseCode();
                                byte[] bArrV = f.V(httpURLConnection.getErrorStream());
                                if (responseCode != 400) {
                                    throw zzdr.zzb(responseCode);
                                }
                                zzrb zzrbVarZzg = zzrb.zzg(bArrV);
                                int i7 = zzbj.zza;
                                throw zzbi.zza(zzrbVarZzg.zzi());
                            } catch (Exception unused2) {
                                throw new zzbj(zzbh.zzc, zzbg.zzai, null);
                            }
                        } catch (IOException e7) {
                            throw new zzbj(zzbh.zzc, zzbg.zzah, e7.getMessage());
                        } catch (Exception e8) {
                            throw new zzbj(zzbh.zzc, zzbg.zzam, e8.getMessage());
                        }
                    } catch (Exception e9) {
                        if (e9 instanceof zzbj) {
                            throw ((zzbj) e9);
                        }
                        throw new zzbj(zzbh.zzc, zzbg.zzF, e9.getMessage());
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Exception e10) {
                throw new zzbj(zzbh.zzc, zzbg.zzaj, e10.getMessage());
            }
        } catch (zzbj e11) {
            zzdfVarZzf.zzb(e11);
            throw e11;
        } catch (Exception e12) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e12.getMessage());
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
