package com.google.android.recaptcha.internal;

import D6.C;
import a.AbstractC0603a;
import com.google.android.recaptcha.RecaptchaAction;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import t6.h;

/* loaded from: classes.dex */
final class zzcu extends AbstractC1362i implements Function2 {
    final /* synthetic */ zzdc zza;
    final /* synthetic */ zzcx zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzpw zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.zza = zzdcVar;
        this.zzb = zzcxVar;
        this.zzc = recaptchaAction;
        this.zzd = zzpwVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new zzcu(this.zza, this.zzb, this.zzc, this.zzd, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcu) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        zzpq zzpqVar;
        zzpq zzpqVar2;
        zzbv zzbvVar;
        a aVar = a.f14642a;
        AbstractC0603a.p0(obj);
        zzdf zzf = this.zza.zzf(28);
        zzqc zzf2 = zzqd.zzf();
        zzcx zzcxVar = this.zzb;
        zzf2.zzu(zzcxVar.zze());
        zzf2.zzd(this.zzc.getAction());
        zzpqVar = zzcxVar.zzf;
        zzf2.zzp(zzpqVar.zzL());
        zzpqVar2 = zzcxVar.zzf;
        zzf2.zzq(zzpqVar2.zzK());
        zzpw zzpwVar = this.zzd;
        zzf2.zzs(zzpwVar.zzJ());
        zzf2.zze(zzpwVar.zzj());
        zzf2.zzr(zzpwVar.zzK());
        zzf2.zzt(zzpwVar);
        zzqd zzqdVar = (zzqd) zzf2.zzj();
        try {
            zzbvVar = this.zzb.zze;
            try {
                int i7 = zzdt.zza;
                if (!zzdt.zzb(zzbvVar.zzd())) {
                    throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
                }
                URLConnection openConnection = new URL(zzbvVar.zzd()).openConnection();
                h.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(zzqdVar.zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzdr.zzb(httpURLConnection.getResponseCode());
                }
                try {
                    zzqf zzi = zzqf.zzi(httpURLConnection.getInputStream());
                    zzf.zza();
                    return zzi;
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
            zzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
