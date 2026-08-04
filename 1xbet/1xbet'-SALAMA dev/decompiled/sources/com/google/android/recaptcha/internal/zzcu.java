package com.google.android.recaptcha.internal;

import D6.C;
import com.google.android.recaptcha.RecaptchaAction;
import j6.a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
final class zzcu extends i implements Function2 {
    final /* synthetic */ zzdc zza;
    final /* synthetic */ zzcx zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzpw zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, d dVar) {
        super(2, dVar);
        this.zza = zzdcVar;
        this.zzb = zzcxVar;
        this.zzc = recaptchaAction;
        this.zzd = zzpwVar;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new zzcu(this.zza, this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcu) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws zzbj {
        a aVar = a.f14648a;
        p003a.a.p0(obj);
        zzdf zzdfVarZzf = this.zza.zzf(28);
        zzqc zzqcVarZzf = zzqd.zzf();
        zzcx zzcxVar = this.zzb;
        zzqcVarZzf.zzu(zzcxVar.zze());
        zzqcVarZzf.zzd(this.zzc.getAction());
        zzqcVarZzf.zzp(zzcxVar.zzf.zzL());
        zzqcVarZzf.zzq(zzcxVar.zzf.zzK());
        zzpw zzpwVar = this.zzd;
        zzqcVarZzf.zzs(zzpwVar.zzJ());
        zzqcVarZzf.zze(zzpwVar.zzj());
        zzqcVarZzf.zzr(zzpwVar.zzK());
        zzqcVarZzf.zzt(zzpwVar);
        zzqd zzqdVar = (zzqd) zzqcVarZzf.zzj();
        try {
            zzbv zzbvVar = this.zzb.zze;
            try {
                int i7 = zzdt.zza;
                if (!zzdt.zzb(zzbvVar.zzd())) {
                    throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
                }
                URLConnection uRLConnectionOpenConnection = new URL(zzbvVar.zzd()).openConnection();
                h.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(zzqdVar.zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzdr.zzb(httpURLConnection.getResponseCode());
                }
                try {
                    zzqf zzqfVarZzi = zzqf.zzi(httpURLConnection.getInputStream());
                    zzdfVarZzf.zza();
                    return zzqfVarZzi;
                } catch (Exception unused) {
                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                }
            } catch (Exception e7) {
                if (e7 instanceof zzbj) {
                    throw ((zzbj) e7);
                }
                throw new zzbj(zzbh.zzc, zzbg.zzF, null);
            }
        } catch (Exception e8) {
            zzbj zzbjVar = e8 instanceof zzbj ? (zzbj) e8 : new zzbj(zzbh.zzb, zzbg.zzZ, null);
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
