package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import p3.f;
import t6.h;

/* loaded from: classes.dex */
final class zzdp extends AbstractC1362i implements Function2 {
    final /* synthetic */ zzdq zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzqt zzc;
    final /* synthetic */ zzdc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzdq zzdqVar, String str, zzqt zzqtVar, zzdc zzdcVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = zzdqVar;
        this.zzb = str;
        this.zzc = zzqtVar;
        this.zzd = zzdcVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzdp(this.zza, this.zzb, this.zzc, this.zzd, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdp) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        zzdf zzf = this.zzd.zzf(22);
        zzqt zzqtVar = this.zzc;
        String str = this.zzb;
        try {
            if (!zzdt.zzb(str)) {
                throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
            }
            try {
                URLConnection openConnection = new URL(str).openConnection();
                h.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                String encode = URLEncoder.encode(zzqtVar.zzL(), "UTF-8");
                String encode2 = URLEncoder.encode(zzqtVar.zzk(), "UTF-8");
                int zzS = zzqtVar.zzS();
                byte[] bytes = ("k=" + encode + "&pk=" + encode2 + "&mst=" + URLEncoder.encode(zzS != 2 ? zzS != 3 ? zzS != 4 ? zzS != 5 ? "UNRECOGNIZED" : "IOS" : "ANDROID_OFFPLAY" : "ANDROID_ONPLAY" : "UNSPECIFIED", "UTF-8") + "&msv=" + URLEncoder.encode(zzqtVar.zzJ(), "UTF-8") + "&msi=" + URLEncoder.encode(zzqtVar.zzK(), "UTF-8") + "&mov=" + zzqtVar.zzj() + "&mkc=" + zzqtVar.zzi()).getBytes(Charset.forName("UTF-8"));
                try {
                    try {
                        zzdr.zza(httpURLConnection);
                        try {
                            zzdr.zzd(httpURLConnection).write(bytes);
                            if (httpURLConnection.getResponseCode() == 200) {
                                try {
                                    zzpq zzi = zzpq.zzi(zzdr.zzc(httpURLConnection));
                                    httpURLConnection.disconnect();
                                    zzf.zza();
                                    return zzi;
                                } catch (Exception unused) {
                                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                                }
                            }
                            try {
                                int responseCode = httpURLConnection.getResponseCode();
                                byte[] V4 = f.V(httpURLConnection.getErrorStream());
                                if (responseCode != 400) {
                                    throw zzdr.zzb(responseCode);
                                }
                                zzrb zzg = zzrb.zzg(V4);
                                int i7 = zzbj.zza;
                                throw zzbi.zza(zzg.zzi());
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
            zzf.zzb(e11);
            throw e11;
        } catch (Exception e12) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e12.getMessage());
            zzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
